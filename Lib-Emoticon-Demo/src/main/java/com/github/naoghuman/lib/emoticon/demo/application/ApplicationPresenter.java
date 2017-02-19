/*
 * Copyright (C) 2017 Naoghuman
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.naoghuman.lib.emoticon.demo.application;

import com.github.naoghuman.lib.action.api.IRegisterActions;
import com.github.naoghuman.lib.emoticon.demo.images.ImagesLoader;
import com.github.naoghuman.lib.logger.api.LoggerFacade;
import java.net.URL;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;

/**
 *
 * @author Naoghuman
 */
public class ApplicationPresenter implements Initializable, IRegisterActions {
    
    private static final Optional<Image> PLACE_HOLDER_ICON = ImagesLoader.getDefault().loadPlaceHolderIcon();
    
    private static final String TAB_NATURE  = "Nature"; // NOI18N
    private static final String TAB_OBJECTS = "Objects"; // NOI18N
    private static final String TAB_PEOPLE  = "People"; // NOI18N
    private static final String TAB_PLACES  = "Places"; // NOI18N
    private static final String TAB_SYMBOLS = "Symbols"; // NOI18N
    
    private static final Tooltip PLACE_HOLDER_TOOLTIP = new Tooltip("place-holder"); // NOI18N
    
    private static final List<Mapper> MAPPERS = FXCollections.observableArrayList();
    
    @FXML private FlowPane fpNatureItems;
    @FXML private FlowPane fpObjectsItems;
    @FXML private FlowPane fpPeopleItems;
    @FXML private FlowPane fpPlacesItems;
    @FXML private FlowPane fpSymbolsItems;
    @FXML private Label lStatusInfo;
    @FXML private TabPane tpEmojiTabs;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        LoggerFacade.getDefault().info(this.getClass(), "Initialize ApplicationPresenter"); // NOI18N
        
//        assert (apView != null) : "fx:id=\"apView\" was not injected: check your FXML file 'Application.fxml'."; // NOI18N
        
        this.initializeMappers();
        this.initializeEmojiTabPane();
        this.initializeEmojiTabNatureWithPlaceHolders();

        this.registerActions();
    }

    private void initializeEmojiTabPane() {
        LoggerFacade.getDefault().info(this.getClass(), "Initialize Emoji TabPane"); // NOI18N
        
        tpEmojiTabs.getSelectionModel().selectedItemProperty()
                .addListener((ObservableValue<? extends Tab> observable, Tab oldValue, Tab newValue) -> {
                    this.onActionSelectNewTab(newValue.getText());
                });
    }
    
    private void initializeEmojiTabNatureWithPlaceHolders() {
        LoggerFacade.getDefault().info(this.getClass(), "Initialize Emoji Tab Nature with PlaceHolders"); // NOI18N
        
        final Optional<Mapper> mapper = this.getMapper(TAB_NATURE);
        if (mapper.isPresent()) {
            this.onActionLoadPlaceHolders(mapper.get());
        }
    }
    
    private void initializeMappers() {
        LoggerFacade.getDefault().info(this.getClass(), "Initialize Mappers"); // NOI18N
        
        MAPPERS.add(new Mapper(TAB_NATURE,  fpNatureItems,  150));
        MAPPERS.add(new Mapper(TAB_OBJECTS, fpObjectsItems, 200));
        MAPPERS.add(new Mapper(TAB_PEOPLE,  fpPeopleItems,  120));
        MAPPERS.add(new Mapper(TAB_PLACES,  fpPlacesItems,  180));
        MAPPERS.add(new Mapper(TAB_SYMBOLS, fpSymbolsItems, 175));
    }
    
    public void initializeAfterWindowIsShowing() {
        LoggerFacade.getDefault().info(this.getClass(), "Initialize ApplicationPresenter after window is showing"); // NOI18N
    }
    
    private ImageView getImageView(final int index, final Image image) {
        final ImageView imageView = new ImageView();
        imageView.setFitHeight(64.0d);
        imageView.setFitWidth(64.0d);
        imageView.setId("" + index); // NOI18N
        imageView.setImage(image);
        imageView.setPreserveRatio(true);
        imageView.setSmooth(true);
        
        Tooltip.install(imageView, PLACE_HOLDER_TOOLTIP);
                
        return imageView;
    }
    
    private Optional<Mapper> getMapper(String tabName) {
        final Optional<Mapper> foundedMapper = MAPPERS.stream()
                .filter(mapper -> mapper.getTabName().equals(tabName))
                .findFirst();
        
        return foundedMapper;
    }
    
    @Override
    public void registerActions() {
        LoggerFacade.getDefault().debug(this.getClass(), "Register actions in ApplicationPresenter"); // NOI18N
    }
    
    private void onActionLoadPlaceHolders(Mapper mapper) {
        LoggerFacade.getDefault().debug(this.getClass(), "On action load place-holders for " + mapper.getTabName()); // NOI18N
        
        if (PLACE_HOLDER_ICON.isPresent()) {
            final ObservableList<Node> childrens = mapper.getFlowPane().getChildren();
            if (!childrens.isEmpty()) {
                return;
            }
            
            final int maxSetImages = mapper.getMaxSetImages();
            for (int index = 0; index < maxSetImages; index++) {
                childrens.add(this.getImageView(index, PLACE_HOLDER_ICON.get()));
            }
            
            mapper.setPlaceHolderIsLoaded(true);
            lStatusInfo.setText("Load place-holders for Tab: " + mapper.getTabName()); // NOI18N
        }
    }
    
    public void onActionSelectNewTab(String tabName) {
        LoggerFacade.getDefault().debug(this.getClass(), "On action select new Tab: " + tabName); // NOI18N
        
        final Optional<Mapper> mapper = this.getMapper(tabName);
        if (mapper.isPresent()) {
            if (!mapper.get().isPlaceHoldersLoaded()) {
                // Load the place-holders
                this.onActionLoadPlaceHolders(mapper.get());
            }
            else {
                // XXX Load the real-images
                lStatusInfo.setText("Switch to Tab: " + tabName); // NOI18N
            }
        }
    }
    
    private final class Mapper {
        
        private final int maxSetImages;
        
        private final FlowPane flowPane;
        private final String tabName;
        
        private boolean isPlaceHolderLoaded = false;
        
        Mapper(final String tabName, final FlowPane flowPane, final int maxSetImages) {
            this.tabName = tabName;
            this.flowPane = flowPane;
            this.maxSetImages = maxSetImages;
        }

        FlowPane getFlowPane() {
            return flowPane;
        }
        
        int getMaxSetImages() {
            return maxSetImages;
        }

        String getTabName() {
            return tabName;
        }

        boolean isPlaceHoldersLoaded() {
            return isPlaceHolderLoaded;
        }
        
        void setPlaceHolderIsLoaded(boolean isPlaceHolderLoaded) {
            this.isPlaceHolderLoaded = isPlaceHolderLoaded;
        } 
        
    }
    
}

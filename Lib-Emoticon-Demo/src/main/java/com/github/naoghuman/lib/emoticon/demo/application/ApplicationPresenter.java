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
import com.github.naoghuman.lib.emoticon.core.Emoticon;
import com.github.naoghuman.lib.emoticon.core.EmoticonProvider;
import com.github.naoghuman.lib.emoticon.core.EmoticonSize;
import com.github.naoghuman.lib.emoticon.demo.images.ImagesLoader;
import com.github.naoghuman.lib.emoticon.emoji.EmojiEmoticonCategory;
import com.github.naoghuman.lib.emoticon.emoji.EmojiEmoticonSet;
import com.github.naoghuman.lib.emoticon.emoji.images.EmojiEmoticonLoader;
import com.github.naoghuman.lib.logger.api.LoggerFacade;
import java.net.URL;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.Stream;
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
import javafx.scene.layout.VBox;

/**
 *
 * @author Naoghuman
 */
public class ApplicationPresenter implements Initializable, EmojiEmoticonCategory, IRegisterActions {
    
    private static final Optional<Image> PLACE_HOLDER_ICON = ImagesLoader.getDefault().loadPlaceHolderIcon();
    
    private static final List<Mapper> MAPPERS = FXCollections.observableArrayList();
    
    @FXML private FlowPane fpNatureItems;
    @FXML private FlowPane fpObjectsItems;
    @FXML private FlowPane fpPeopleItems;
    @FXML private FlowPane fpPlacesItems;
    @FXML private FlowPane fpSymbolsItems;
    @FXML private Label lStatusInfo;
    @FXML private TabPane tpEmojiTabs;
    @FXML private VBox vbAbout;
    @FXML private VBox vbDetails;
    
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
        
        final Optional<Mapper> mapper = this.getMapper(NATURE);
        if (mapper.isPresent()) {
            this.onActionLoadPlaceHolders(mapper.get());
        }
    }
    
    private void initializeMappers() {
        LoggerFacade.getDefault().info(this.getClass(), "Initialize Mappers"); // NOI18N
        
        MAPPERS.add(new Mapper(NATURE,  fpNatureItems,  new EmojiEmoticonLoader(), EmojiEmoticonSet.getDefault().getEmoticons(NATURE)));
        MAPPERS.add(new Mapper(OBJECTS, fpObjectsItems, new EmojiEmoticonLoader(), EmojiEmoticonSet.getDefault().getEmoticons(OBJECTS)));
        MAPPERS.add(new Mapper(PEOPLE,  fpPeopleItems,  new EmojiEmoticonLoader(), EmojiEmoticonSet.getDefault().getEmoticons(PEOPLE)));
        MAPPERS.add(new Mapper(PLACES,  fpPlacesItems,  new EmojiEmoticonLoader(), EmojiEmoticonSet.getDefault().getEmoticons(PLACES)));
        MAPPERS.add(new Mapper(SYMBOLS, fpSymbolsItems, new EmojiEmoticonLoader(), EmojiEmoticonSet.getDefault().getEmoticons(SYMBOLS)));
    }
    
    public void initializeAfterWindowIsShowing() {
        LoggerFacade.getDefault().info(this.getClass(), "Initialize ApplicationPresenter after window is showing"); // NOI18N
    }
    
    private ImageView getImageView(final int index, final String title) {
        final ImageView imageView = new ImageView();
        imageView.setFitHeight(64.0d);
        imageView.setFitWidth(64.0d);
        imageView.setId(index + ";" + title); // NOI18N
        imageView.setPreserveRatio(true);
        imageView.setSmooth(true);
        
        Tooltip.install(imageView, new Tooltip(title));
                
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
    
    private void onActionLoadPlaceHolders(final Mapper mapper) {
        LoggerFacade.getDefault().debug(this.getClass(), "On action load [images] for [" + mapper.getTabName() + "]"); // NOI18N
        
        if (PLACE_HOLDER_ICON.isPresent()) {
            final ObservableList<Node> childrens = mapper.getFlowPane().getChildren();
            if (!childrens.isEmpty()) {
                return;
            }
            
            final int sizeSubset = mapper.getSize();
            for (int index = 0; index < sizeSubset; index++) {
                final Emoticon emoticon = mapper.getEmoticons().get(index);
            	final ImageView imageView = this.getImageView(index, emoticon.getTitle());
                
                final Optional<Image> image = EmoticonProvider.getDefault().loadEmoticon(mapper.getEmojiEmoticonLoader(), emoticon);
                if (image.isPresent()) {
                    imageView.setImage(image.get());
                    LoggerFacade.getDefault().debug(this.getClass(), "  Load " + index + ": " + emoticon.getTitle());
                }
                else {
                    imageView.setImage(PLACE_HOLDER_ICON.isPresent() ? PLACE_HOLDER_ICON.get() : null);
                    LoggerFacade.getDefault().warn(this.getClass(), "  Can't load " + index + ": " + emoticon.getTitle());
                }
                
                childrens.add(imageView);
            }
            
            mapper.setPlaceHolderIsLoaded(true);
            lStatusInfo.setText("Load [images] for Tab [" + mapper.getTabName() + "]"); // NOI18N
        }
    }
    
    public void onActionSelectNewTab(String tabName) {
        LoggerFacade.getDefault().debug(this.getClass(), "On action select new Tab: " + tabName); // NOI18N

        final Optional<Mapper> mapper = this.getMapper(tabName);
        if (
                mapper.isPresent()
                && !mapper.get().isPlaceHoldersLoaded()
        ) {
            this.onActionLoadPlaceHolders(mapper.get());
        }
    }
    
    private final class Mapper {
        
        private final int size;
        
        private final EmojiEmoticonLoader emojiEmoticonLoader;
        private final FlowPane flowPane;
        private final String tabName;
        
        private final ObservableList<Emoticon> emoticons = FXCollections.observableArrayList();
        
        private boolean isPlaceHolderLoaded = false;
        
        Mapper(
                final String tabName, final FlowPane flowPane,
                final EmojiEmoticonLoader emojiEmoticonLoader, final Stream<Emoticon> emoticons
        ) {
            this.tabName = tabName;
            this.flowPane = flowPane;
            
            this.emojiEmoticonLoader = emojiEmoticonLoader;
            this.emojiEmoticonLoader.setDefaultSize(EmoticonSize.SIZE_64x64);
            
            this.emoticons.addAll(emoticons.collect(Collectors.toList()));
            this.size = this.emoticons.size();
        }
        
        ObservableList<Emoticon> getEmoticons() {
            return emoticons;
        }
        
        EmojiEmoticonLoader getEmojiEmoticonLoader() {
            return emojiEmoticonLoader;
        }

        FlowPane getFlowPane() {
            return flowPane;
        }
        
        int getSize() {
            return size;
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

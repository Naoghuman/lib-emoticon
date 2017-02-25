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
package com.github.naoghuman.lib.emoticon.core;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * TileSet - enthaelt eine List<Tile>
 * - enthaelt eine List<TileLoader>
 *
 * - TileLoader ermoeglicht das laden von Tile - fuer das laden eines Tile ueber
 * einen TileLoader ist es notwendig, dass der TileLoader das Tile
 * supported(prefix)
 * - der TileToader sollte ABER auch verantwortlich sein fuer das Tile
 * - TODO d.h. die Bilder der Tile welche ueber den TileLoader geladen
 * werden sollen fuer den TileLoader verfuegbar sein
 *
 * - wie wird der prefix gemanagt?
 * - Tile(-Bilder) haben a) einen oder mehrere
 * prefixe b) die dazugehoerenden bildernamen
 * - TileLoader verifizieren (validate {NEU TileValidator}) das sie verantwortlich 
 * sind, dass sie das Tile laden koennen 
 * a) prefix ist okay 
 * b) TileLoader kann definierte Bilder erreichen 
 * c) ist verantwortlich fuer das tile (tile ist registiert bei dem
 * lader, bedeutet das bild ist fuer den TileLoader erreichbar) 
 * 
 * - Move XyEmoticonLoader 
 *    - from lib-emoticon-emoji-images
 *    - to lib-emoticon-emoji
 *
 * lib-emoticon-emoji-images have only images lib-emoticon-emoji have
 * XyEmoticonLoader and XyEmoticonSet
 *
 * @author Naoghuman
 */
public abstract class EmoticonSet {
    
    /**
     * 
     */
    public static final Comparator<Emoticon> EMOTICON_TITLE_COMPARATOR = Comparator.comparing(Emoticon::getTitle);

    private final ObservableList<Emoticon> emoticons = FXCollections.observableArrayList();
    private final ObservableList<EmoticonLoader> emoticonLoaders = FXCollections.observableArrayList();

    /**
     * 
     */
    protected EmoticonSet() {
        this.initialize();
    }

    private void initialize() {
        this.configureEmoticonLoaders();
        this.configureEmoticons();
    }

    /**
     * 
     * @param emoticon 
     */
    public void addEmoticon(Emoticon emoticon) {
        emoticons.add(emoticon);
    }

    /**
     * 
     * @param emoticonLoader 
     */
    public void addEmoticonLoader(EmoticonLoader emoticonLoader) {
        emoticonLoaders.add(emoticonLoader);
    }

    /**
     * Add all TileLoaders which are responsible for loading the Tiles in this
     * TileSet to the collection.
     */
    protected abstract void configureEmoticonLoaders();

    /**
     * Add all Tiles from this TileSet to the collection.
     */
    protected abstract void configureEmoticons();

    /**
     * 
     * @param title
     * @return 
     */
    protected Optional<Emoticon> getEmoticon(String title) {
        Emoticon foundedEmoticon = null;
        for (Emoticon emoticon : emoticons) {// TODO convert to lambda
            if (emoticon.getTitle().equals(title)) {
                foundedEmoticon = emoticon;
                break;
            }
        }

        return Optional.ofNullable(foundedEmoticon);
    }

    /**
     * 
     * @param emoticon
     * @return 
     */
    public Optional<EmoticonLoader> getEmoticonLoader(Emoticon emoticon) {
        EmoticonLoader foundedEmoticonLoader = null;
        for (EmoticonLoader emoticonLoader : emoticonLoaders) {// TODO convert to lambda
            if (emoticonLoader.isSupported(emoticon.getPrefix())) {
                foundedEmoticonLoader = emoticonLoader;
                break;
            }
        }

        return Optional.ofNullable(foundedEmoticonLoader);
    }

    /**
     * 
     * @return 
     */
    public ObservableList<Emoticon> getEmoticons() {
        return emoticons;
    }
    
    public ObservableList<Emoticon> getEmoticons(Optional<String> category) {
        if (!category.isPresent()) {
            return this.getEmoticons();
        }
        
        final ObservableList<Emoticon> categoryEmoticons = FXCollections.observableArrayList();
        categoryEmoticons.addAll(emoticons.stream()
                .filter(emoticon -> (
                        emoticon.getCategory().isPresent() && emoticon.getCategory().get().equals(category.get())
                ))
                .collect(Collectors.toList()));
        
        return categoryEmoticons;
    }

}

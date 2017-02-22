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

import java.util.Optional;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * This <code>abstract</code> class defines the minimal functionalities which
 * should be supported by an <code>EmoticonLoader</code>. With a concrete
 * implementation from this abstract class it's then be possible to load an
 * {@link com.github.naoghuman.lib.emoticon.core.Emoticon} as an
 * {@link javafx.scene.image.Image}.
 *
 * @author Naoghuman
 * @see com.github.naoghuman.lib.emoticon.core.Emoticon
 * @see javafx.scene.image.Image
 */
public abstract class EmoticonLoader {

    private final ObservableList<String> prefixes = FXCollections.observableArrayList();

    private ImageSize defaultSize = ImageSize.SIZE_16x16;
    private ImageSuffix defaultSuffix = ImageSuffix.PNG;

    /**
     * 
     */
    protected EmoticonLoader() {

    }

    /**
     * With the parameter <code>prefix</code> a concrete implementation from
     * this <code>abstract</code> class defines if a given
     * {@link com.github.naoghuman.lib.tile.core.Tile} is supported by this
     * <code>EmoticonLoader</code> or not.
     *
     * @param prefix the prefix which defines if an {@link com.github.naoghuman.lib.emoticon.core.Emoticon} 
     * is supported or not by this <code>EmoticonLoader</code>.
     * 
     * @see com.github.naoghuman.lib.emoticon.core.Emoticon
     */
    protected void addPrefix(String prefix) {
        if (!prefixes.contains(prefix)) {
            prefixes.add(prefix);
        }
    }
    
    /**
     * Allowed the <code>child</code> classes to <code>configure</code> the prefixes 
     * which the concrete implementation from this <code>abstract</code> class supports.
     */
    protected abstract void configure();

    /**
     * 
     * @return 
     */
    public ImageSize getDefaultSize() {
        return defaultSize;
    }

    /**
     * 
     * @return 
     */
    public ImageSuffix getDefaultSuffix() {
        return defaultSuffix;
    }

    /**
     * Returns all associated <code>prefixes</code> which the concrete
     * implementation from this <code>abstract</code> class supports.
     *
     * @return all associated <code>prefixes</code>.
     *
     */
    public ObservableList<String> getPrefixes() {
        return prefixes;
    }

    /**
     * Checks the given <code>prefix</code> if it's supported by the concrete
     * implementation from this <code>EmoticonLoader</code>.
     *
     * @param emoticonPrefix which should be checked if it's supported by the concrete
     * implementation from this <code>EmoticonLoader</code> or not.
     * @return <code>true</code> if the the concrete implementation from this
     * <code>EmoticonLoader</code> supports the given <code>prefix</code>,
     * otherwise <code>false</code>.
     * @see com.github.naoghuman.lib.emoticon.core.Emoticon
     */
    public boolean isSupported(Optional<String> emoticonPrefix) {
        
        /*
        - if  loader.isempty and  prefix.ispresent == false
        - if  loader.isempty and !prefix.ispresent == true
        - if !loader.isempty and  prefix.ispresent and  equals == true
        - if !loader.isempty and !prefix.ispresent and !equals == false
        
        TODO unittests
        */
        final boolean prefixesExists = !this.getPrefixes().isEmpty();
        final boolean emoticonPrefixIsPresent = emoticonPrefix.isPresent();
        
        boolean isSupported = false;
        if (!prefixesExists && !emoticonPrefixIsPresent) {
            isSupported = true;
        }
        
        if (prefixesExists && emoticonPrefixIsPresent) {
            final Optional<String> foundedPrefix = this.getPrefixes().stream()
                .filter(prefixToCheck -> prefixToCheck.equals(emoticonPrefix.get()))
                .findFirst();
            if (foundedPrefix.isPresent()) {
                isSupported = true;
            }
        }

        return isSupported;
    }

    /**
     * 
     * @param defaultSize
     */
    public void setDefaultSize(ImageSize defaultSize) {
        this.defaultSize = defaultSize;
    }

    /**
     * 
     * @param defaultSuffix 
     */
    public void setDefaultSuffix(ImageSuffix defaultSuffix) {
        this.defaultSuffix = defaultSuffix;
    }

}

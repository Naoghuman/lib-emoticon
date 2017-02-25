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

import com.github.naoghuman.lib.emoticon.internal.DefaultEmoticonValidator;
import java.net.URI;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.image.Image;

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

    private EmoticonSize defaultSize = EmoticonSize.SIZE_16x16;
    private EmoticonSuffix defaultSuffix = EmoticonSuffix.PNG;

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
    public EmoticonSize getDefaultSize() {
        return defaultSize;
    }

    /**
     * 
     * @return 
     */
    public EmoticonSuffix getDefaultSuffix() {
        return defaultSuffix;
    }

    /**
     * Returns all associated <code>prefixes</code> which a concrete
     * implementation from this <code>abstract</code> class supports.
     *
     * @return all associated <code>prefixes</code>.
     *
     */
    public ObservableList<String> getPrefixes() {
        return prefixes;
    }

    /**
     * Checks the given <code>prefix</code> if it's supported by a concrete
     * implementation from this <code>EmoticonLoader</code>.
     * 
     * TODO error if prefixes is empty
     *
     * @param prefix which should be checked if it's supported by the concrete
     * implementation from this <code>EmoticonLoader</code> or not.
     * @return <code>true</code> if the the concrete implementation from this
     * <code>EmoticonLoader</code> supports the given <code>prefix</code>,
     * otherwise <code>false</code>.
     * @see com.github.naoghuman.lib.emoticon.core.Emoticon
     */
    public boolean isSupported(Optional<String> prefix) {
        /* TODO unittests */
        if (this.getPrefixes().isEmpty()) {
            throw new IllegalArgumentException("It must at minimum [one] default prefix defined! " // NOI18N
                    + "See add(String) for more information."); // NOI18N
        }
        
        boolean isSupported = false;
        if (prefix.isPresent()) {
            final Optional<String> foundedPrefix = this.getPrefixes().stream()
                .filter(prefixToCheck -> prefixToCheck.equals(prefix.get()))
                .findFirst();
            if (foundedPrefix.isPresent()) {
                isSupported = true;
            }
        }
        else {
            // Use the default-prefixes
            isSupported = true;
        }

        return isSupported;
    }
    
    public Optional<Image> loadEmoticon(final Emoticon emoticon) {
        return this.loadEmoticon(emoticon, this.getDefaultSize());
    }
    
    private String convertToImageName(Emoticon emoticon) {
    	/* TODO unittests
            - emoticon.name.isPresent > emoticon.title
            - emoticon.suffix.isPresent > loader.defaultsuffix
            - return name + suffix
    	 */
        
        final StringBuilder sb = new StringBuilder();
        sb.append(emoticon.getName().isPresent() ? emoticon.getName().get() : emoticon.getTitle());
        sb.append(emoticon.getSuffix().isPresent() ? emoticon.getSuffix().get().getSuffix() : this.getDefaultSuffix().getSuffix());
        
        /*
        '-' -> 'minus', but not the prefix
        '+' -> 'plus'
        */
        
    	return sb.toString();
    }
    
    public Optional<Image> loadEmoticon(final Emoticon emoticon, final EmoticonSize size) {
        if (!this.isSupported(emoticon.getPrefix())) {
    		throw new UnsupportedOperationException(
                    "The EmoticonLoader '" + this.getClass().getName() // NOI18N
                    + "' doesn't support the Emoticon: " + emoticon.getTitle()); // NOI18N
    	}
        
        try {
            DefaultEmoticonValidator.getDefault().validate(emoticon);
        } catch (NullPointerException | IllegalArgumentException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "Given [Emoticon] isn't valid: " + emoticon.getTitle(), ex); // NOI18N
        }
        
    	final String imageName = this.convertToImageName(emoticon);
        try {
            DefaultEmoticonValidator.getDefault().validate(imageName);
        } catch (NullPointerException | IllegalArgumentException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "Given [name] isn't valid: " + emoticon.getTitle(), ex); // NOI18N
        }
        
        Optional<Image> image;
        try {
            final URI uri = this.getClass().getResource(imageName).toURI();
            image = Optional.ofNullable(new Image(uri.toString(), size.getWidth(), size.getHeight(), true, true, true));
        } catch (Exception ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "Can't load Emoticon: " + emoticon.getTitle(), ex); // NOI18N
            
            image = Optional.empty();
        }

        return image;
    }

    /**
     * 
     * @param defaultSize
     */
    public void setDefaultSize(EmoticonSize defaultSize) {
        this.defaultSize = defaultSize;
    }

    /**
     * 
     * @param defaultSuffix 
     */
    public void setDefaultSuffix(EmoticonSuffix defaultSuffix) {
        this.defaultSuffix = defaultSuffix;
    }

}

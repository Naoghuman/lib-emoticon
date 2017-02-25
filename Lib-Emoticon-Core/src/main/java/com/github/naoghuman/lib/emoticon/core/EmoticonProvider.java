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

import com.github.naoghuman.lib.emoticon.internal.DefaultEmoticonValidator;
import javafx.scene.image.Image;

/**
 * The singleton <code>EmojiProvider</code> allowed the developer to load an
 * {@link com.github.naoghuman.lib.emoticon.core.Emoticon} as an
 * {@link javafx.scene.image.Image} with a concrete implementation from the
 * <code>Interface</code>
 * {@link com.github.naoghuman.lib.emoticon.core.EmoticonLoader}.
 * <p />
 * Also this <code>Singleton</code> aloud access to a default implementation
 * from the <code>Interface</code>
 * {@link com.github.naoghuman.lib.emoticon.core.EmoticonValidator} which
 * allowed the developer to validate the attributes an
 * {@link com.github.naoghuman.lib.emoticon.core.Emoticon}.
 *
 * @author Naoghuman
 * @see com.github.naoghuman.lib.emoticon.core.Emoticon
 * @see com.github.naoghuman.lib.emoticon.core.EmoticonLoader
 * @see com.github.naoghuman.lib.emoticon.core.EmoticonValidator
 * @see com.github.naoghuman.lib.emoticon.internal.DefaultEmoticon
 * @see com.github.naoghuman.lib.emoticon.internal.DefaultEmoticonValidator
 * @see javafx.scene.image.Image
 */
public final class EmoticonProvider {
    // TODO if no new methods then rename to EmoticonFacade

    private static final Optional<EmoticonProvider> instance = Optional.of(new EmoticonProvider());

    /**
     * Returns a singleton instance from the class <code>EmojiProvider</code>.
     *
     * @return a singleton instance from this class.
     */
    public static EmoticonProvider getDefault() {
        return instance.get();
    }

    private EmoticonProvider() {

    }
    
//    public Emoticon getDefaultEmoticon(final String title) {
//        return this.getDefaultEmoticon(title, title);
//    }
    
//    public Emoticon getDefaultEmoticon(final String title, final String name) {
//        return this.getDefaultEmoticon(title, name, Optional.empty(), Optional.empty(), Optional.empty());
//    }
    
    /**
     * This method aloud access to a default implementation from the <code>Interface</code>
     * {@link com.github.naoghuman.lib.emoticon.core.Emoticon}.
     * <p />
     * For more information about the class {@link com.github.naoghuman.lib.emoticon.internal.DefaultEmoticon}
     * plz see the <code>JavaDoc</code> there.
     *
     * @param title the title from the <code>Emoticon</code>. Can't be NULL or EMPTY.
     * @param name the imageName from the <code>Emoticon</code>. Can't be NULL or EMPTY.
     * @param prefix
     * @param suffix
     * @param size
     * 
     * @return an default implementation from the <code>Interface</code> {@link com.github.naoghuman.lib.emoticon.core.Emoticon}.
     * 
     * @see com.github.naoghuman.lib.emoticon.core.Emoticon
     * @see com.github.naoghuman.lib.emoticon.internal.DefaultEmoticon
     */
//    public Emoticon getDefaultEmoticon(
//            final String title, final String name,
//            final Optional<String> prefix, final Optional<EmoticonSuffix> suffix,
//            final Optional<EmoticonSize> size
//    ) {
//        return new DefaultEmoticon(title, name, prefix, suffix, size);
//    }

    /**
     * This method aloud access to a default implementation from the <code>Interface</code>
     * {@link com.github.naoghuman.lib.emoticon.core.EmoticonValidator}.
     * <p />
     * For more information about the class {@link com.github.naoghuman.lib.emoticon.internal.DefaultEmoticonValidator}
     * plz see the <code>JavaDoc</code> there.
     *
     * @return an default implementation from the <code>Interface</code>{@link com.github.naoghuman.lib.emoticon.core.EmoticonValidator}.
     * 
     * @see com.github.naoghuman.lib.emoticon.core.EmoticonValidator
     * @see com.github.naoghuman.lib.emoticon.internal.DefaultEmoticonValidator
     */
    public EmoticonValidator getDefaultEmoticonValidator() {
        return DefaultEmoticonValidator.getDefault();
    }
    
    /**
     * 
     * @param emoticonLoader
     * @param emoticon
     * 
     * @return 
     */
    public Optional<Image> loadEmoticon(final EmoticonLoader emoticonLoader, final Emoticon emoticon) {
    	return emoticonLoader.loadEmoticon(emoticon);
    }
    
    /**
     * 
     * @param emoticonLoader
     * @param emoticon
     * @param size
     * 
     * @return 
     */
    public Optional<Image> loadEmoticon(final EmoticonLoader emoticonLoader, final Emoticon emoticon, final EmoticonSize size) {
    	return emoticonLoader.loadEmoticon(emoticon, size);
    }

}

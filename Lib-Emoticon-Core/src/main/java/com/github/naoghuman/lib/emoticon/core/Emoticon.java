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

/**
 * An {@link com.github.naoghuman.lib.emoticon.core.Emoticon} represent the
 * emotional state in form from an {@link javafx.scene.image.Image}.
 * <br><br>
 * There are two ways to get a concrete implementation from this <code>Interface</code>. 
 * A) Use the different <code>getDefaultEmoticon(...)</code> methods in 
 * {@link com.github.naoghuman.lib.emoticon.core.EmoticonProvider} or b) for more 
 * flexibility during the creation use the {@link com.github.naoghuman.lib.emoticon.core.EmoticonBuilder}.
 *
 * @author Naoghuman
 * @see com.github.naoghuman.lib.emoticon.core.EmoticonBuilder
 * @see com.github.naoghuman.lib.emoticon.core.EmoticonProvider
 * @see javafx.scene.image.Image
 */
public interface Emoticon {

    /**
     * The (optional) category from this <code>Emoticon</code>.
     * <br>
     * If this parameter isn't defined then <code>Optional.empty()</code> will
     * be returned.
     *
     * @return the category from this <code>Emoticon</code> or Optional.empty().
     * @see java.util.Optional
     */
    public Optional<String> getCategory();

    /**
     * The (optional) image name from this <code>Emoticon</code>.
     * <br>
     * If this parameter isn't defined then <code>Optional.empty()</code> will
     * be returned. Also the parameter <code>title</code> will be used for the
     * loading from the {@link javafx.scene.image.Image}.
     *
     * @return the image name from this <code>Emoticon</code> or Optional.empty().
     * @see java.util.Optional
     * @see javafx.scene.image.Image
     */
    public Optional<String> getName();

    /**
     * The (optional) prefix from this <code>Emoticon</code>.
     * <br>
     * If this parameter isn't defined then <code>Optional.empty()</code> will
     * be returned. If so then the default prefix defined in
     * {@link com.github.naoghuman.lib.emoticon.core.EmoticonLoader} will be
     * used for the {@link javafx.scene.image.Image} loading.
     *
     * @return the prefix from this <code>Emoticon</code> or Optional.empty().
     * @see com.github.naoghuman.lib.emoticon.core.EmoticonLoader
     * @see java.util.Optional
     * @see javafx.scene.image.Image
     */
    public Optional<String> getPrefix();

    /**
     * The (optional) size from this <code>Emoticon</code>.
     * <br>
     * If this parameter isn't defined then <code>Optional.empty()</code> will
     * be returned. If so then the default size defined in
     * {@link com.github.naoghuman.lib.emoticon.core.EmoticonLoader} will be
     * used for the {@link javafx.scene.image.Image} loading.
     *
     * @return the size from this <code>Emoticon</code> or Optional.empty().
     * @see com.github.naoghuman.lib.emoticon.core.EmoticonLoader
     * @see java.util.Optional
     * @see javafx.scene.image.Image
     */
    public Optional<EmoticonSize> getSize();

    /**
     * The (optional) suffix from this <code>Emoticon</code>.
     * <br>
     * If this parameter isn't defined then <code>Optional.empty()</code> will
     * be returned. If so then the default suffix defined in
     * {@link com.github.naoghuman.lib.emoticon.core.EmoticonLoader} will be
     * used for the {@link javafx.scene.image.Image} loading.
     *
     * @return the suffix from this <code>Emoticon</code> or Optional.empty().
     * @see com.github.naoghuman.lib.emoticon.core.EmoticonLoader
     * @see java.util.Optional
     * @see javafx.scene.image.Image
     */
    public Optional<EmoticonSuffix> getSuffix();

    /**
     * The title from this <code>Emoticon</code>.
     * <br>
     * This parameter can't be NULL or EMPTY.
     *
     * @return the title from this <code>Emoticon</code>.
     */
    public String getTitle();

}

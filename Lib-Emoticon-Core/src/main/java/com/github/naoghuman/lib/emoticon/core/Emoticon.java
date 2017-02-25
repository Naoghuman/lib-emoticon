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
 * An {@link com.github.naoghuman.lib.emoticon.core.Emoticon} represent an <code>Emoticon</code>.
 * <p />
 * A concrete default implementation from this <code>Interface</code> can be access over the method
 * {@link com.github.naoghuman.lib.emoticon.core.EmoticonProvider#getDefaultEmoticon(String, String)}
 * in the class {@link com.github.naoghuman.lib.emoticon.core.EmoticonProvider}.
 *
 * @author Naoghuman
 * @see com.github.naoghuman.lib.emoticon.core.EmoticonProvider
 * @see com.github.naoghuman.lib.emoticon.core.EmoticonProvider#getDefaultEmoticon(String, String)
 * @see com.github.naoghuman.lib.emoticon.internal.DefaultEmoticon
 * @see javafx.scene.image.Image
 */
public interface Emoticon {
    
    public Optional<String> getCategory();

    /**
     * The image name from this <code>Emoticon</code>.
     * <p />
     * This parameter can't be NULL or EMPTY.
     *TODO
     * @return the image name from this <code>Emoticon</code>.
     */
    public Optional<String> getName();

    /**
     * The prefix from this <code>Emoticon</code>.
     * <p />
     * This parameter can't be NULL or EMPTY.
     * TODO
     * @return the prefix from this <code>Emoticon</code>.
     */
    public Optional<String> getPrefix();
    
    public Optional<EmoticonSize> getSize();

    /**
     * The prefix from this <code>Emoticon</code>.
     * <p />
     * This parameter can't be NULL or EMPTY.
     * TODO
     * @return the prefix from this <code>Emoticon</code>.
     */
    public Optional<EmoticonSuffix> getSuffix();

    /**
     * The title from this <code>Emoticon</code>.
     * <p />
     * This parameter can't be NULL or EMPTY.
     *
     * @return the title from this <code>Emoticon</code>.
     */
    public String getTitle();

}

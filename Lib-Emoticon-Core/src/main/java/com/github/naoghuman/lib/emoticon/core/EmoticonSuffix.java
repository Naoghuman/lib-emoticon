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

/**
 * The class <code>EmoticonSuffix</code> defines different image suffixes which 
 * will be used during the image loading.
 * <br>
 * The suffixes from here can be used a) to define the default image suffix for 
 * an {@link com.github.naoghuman.lib.emoticon.core.EmoticonLoader} and / or b) to 
 * define a specific image suffix for an {@link com.github.naoghuman.lib.emoticon.core.Emoticon}.
 *
 * @author Naoghuman
 * @see com.github.naoghuman.lib.emoticon.core.Emoticon
 * @see com.github.naoghuman.lib.emoticon.core.EmoticonLoader
 */
public final class EmoticonSuffix {

    /**
     * Defines an <code>EmoticonSuffix</code> for the image suffix <code>.gif</code>.
     */
    public static final EmoticonSuffix GIF = new EmoticonSuffix(".gif"); // NOI18N

    /**
     * Defines an <code>EmoticonSuffix</code> for the image suffix <code>.jpeg</code>.
     */
    public static final EmoticonSuffix JPEG = new EmoticonSuffix(".jpeg"); // NOI18N

    /**
     * Defines an <code>EmoticonSuffix</code> for the image suffix <code>.jpg</code>.
     */
    public static final EmoticonSuffix JPG = new EmoticonSuffix(".jpg"); // NOI18N

    /**
     * Defines an <code>EmoticonSuffix</code> for the image suffix <code>.png</code>.
     */
    public static final EmoticonSuffix PNG = new EmoticonSuffix(".png"); // NOI18N

    private final String suffix;

    private EmoticonSuffix(final String suffix) {
        DefaultEmoticonValidator.getDefault().validate(suffix);

        this.suffix = suffix;
    }

    /**
     * Returns the image suffix.
     *
     * @return the image suffix.
     */
    public final String getSuffix() {
        return suffix;
    }

}

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
 *
 * @author Naoghuman
 */
public enum EmoticonSuffix {

    /**
     *
     */
    GIF(".gif"), // NOI18N

    /**
     *
     */
    JPEG(".jpeg"), // NOI18N

    /**
     *
     */
    JPG(".jpg"), // NOI18N

    /**
     *
     */
    PNG(".png"), // NOI18N
    
    OWN(".png"); // NOI18N

    private String suffix = null;

    EmoticonSuffix(final String suffix) {
        this.suffix = suffix;
    }

    /**
     *
     * @return
     */
    public String getSuffix() {
        return suffix;
    }
    
    public void setOwnSuffix(final String suffix) {
        if (!this.equals(OWN)) {
            throw new UnsupportedOperationException("Set [own] suffix is only allowed in parameter [OWN]"); // NOI18N
        }
        
        DefaultEmoticonValidator.getDefault().validate(suffix);

        this.suffix = suffix;
    }

}

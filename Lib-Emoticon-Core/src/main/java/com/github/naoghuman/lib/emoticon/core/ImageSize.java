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

/**
 *
 * @author Naoghuman
 */
public enum ImageSize {

    /**
     *
     */
    SIZE_16x16(16.0d, 16.0d),
    
    /**
     *
     */
    SIZE_24x24(24.0d, 24.0d),
    
    /**
     *
     */
    SIZE_32x32(32.0d, 32.0d),
    
    /**
     *
     */
    SIZE_40x40(40.0d, 40.0d),
    
    /**
     *
     */
    SIZE_48x48(48.0d, 48.0d),
    
    /**
     *
     */
    SIZE_56x56(56.0d, 56.0d),
    
    /**
     *
     */
    SIZE_64x64(64.0d, 64.0d),
    
    /**
     *
     */
    SIZE_OWN(16.0d, 16.0d);

    private double height;
    private double width;

    private ImageSize(final double height, final double width) {
        this.height = height;
        this.width = width;
    }

    public void setOwnSize(final double height, final double width) {
        if (!this.equals(SIZE_OWN)) {
            throw new UnsupportedOperationException("Set [own] size is only allowed in parameter [SIZE_OWN]"); // NOI18N
        }

        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("["); // NOI18N
        sb.append("width=").append(width); // NOI18N
        sb.append(", "); // NOI18N
        sb.append("height=").append(height); // NOI18N
        sb.append("]"); // NOI18N
        
        return sb.toString();
    }
    
}

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
import javafx.geometry.Dimension2D;

/**
 *
 * @author Naoghuman
 */
public final class EmoticonSize {

    /**
     * Defines an <code>EmoticonSize</code> with following parameters: [width=16.0d, height=16.0d].
     */
    public static final EmoticonSize SIZE_16x16 = new EmoticonSize(16.0d, 16.0d);

    /**
     * Defines an <code>EmoticonSize</code> with following parameters: [width=24.0d, height=24.0d].
     */
    public static final EmoticonSize SIZE_24x24 = new EmoticonSize(24.0d, 24.0d);

    /**
     * Defines an <code>EmoticonSize</code> with following parameters: [width=32.0d, height=32.0d].
     */
    public static final EmoticonSize SIZE_32x32 = new EmoticonSize(32.0d, 32.0d);

    /**
     * Defines an <code>EmoticonSize</code> with following parameters: [width=40.0d, height=40.0d].
     */
    public static final EmoticonSize SIZE_40x40 = new EmoticonSize(40.0d, 40.0d);

    /**
     * Defines an <code>EmoticonSize</code> with following parameters: [width=48.0d, height=48.0d].
     */
    public static final EmoticonSize SIZE_48x48 = new EmoticonSize(48.0d, 48.0d);

    /**
     * Defines an <code>EmoticonSize</code> with following parameters: [width=56.0d, height=56.0d].
     */
    public static final EmoticonSize SIZE_56x56 = new EmoticonSize(56.0d, 56.0d);

    /**
     * Defines an <code>EmoticonSize</code> with following parameters: [width=64.0d, height=64.0d].
     */
    public static final EmoticonSize SIZE_64x64 = new EmoticonSize(64.0d, 64.0d);

    /**
     * Constructs an <code>EmoticonSize</code> with the specified <code>width</code> 
     * and <code>height</code>.
     * <br>
     * The parameters <code>width</code> and <code>height</code> will be validate 
     * against the minimal rules defined in {@link com.github.naoghuman.lib.emoticon.internal.DefaultEmoticonValidator}. 
     * Plz see {@link com.github.naoghuman.lib.emoticon.internal.DefaultEmoticonValidator#validate(double)}
     * for more informations.
     * 
     * @param width the width.
     * @param height the height.
     * @return the new <code>EmoticonSize</code>.
     * @see com.github.naoghuman.lib.emoticon.internal.DefaultEmoticonValidator
     * @see com.github.naoghuman.lib.emoticon.internal.DefaultEmoticonValidator#validate(double)
     */
    public static final EmoticonSize getEmoticonSize(final double width, final double height) {
        return new EmoticonSize(width, height);
    }

    private final double height;
    private final double width;

    private EmoticonSize(final double width, final double height) {
        DefaultEmoticonValidator.getDefault().validate(height);
        DefaultEmoticonValidator.getDefault().validate(width);

        this.height = height;
        this.width = width;
    }
    
    /**
     * Returns the <code>width</code> and <code>height</code> from this 
     * <code>EmoticonSize</code> as a {@link javafx.geometry.Dimension2D}.
     * 
     * @return <code>width</code> and <code>height</code>.
     * @see javafx.geometry.Dimension2D
     */
    public final Dimension2D getDimension() {
        return new Dimension2D(width, height);
    }

    /**
     * Returns the <code>height</code> from this <code>EmoticonSize</code>.
     * 
     * @return the height from this <code>EmoticonSize</code>.
     */
    public final double getHeight() {
        return height;
    }
    
    /**
     * Returns the <code>width</code> from this <code>EmoticonSize</code>.
     * 
     * @return the width from this <code>EmoticonSize</code>.
     */
    public final double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("EmoticonSize=["); // NOI18N
        sb.append("width=").append(width); // NOI18N
        sb.append(", "); // NOI18N
        sb.append("height=").append(height); // NOI18N
        sb.append("]"); // NOI18N

        return sb.toString();
    }

}

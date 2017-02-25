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

import java.util.Objects;

/**
 * With this <code>Interface</code> its possible to validate a
 * {@link java.lang.String} against still to defined rules.
 * <p />
 * A default implementation from this <code>Interface</code> can be found in the
 * class
 * {@link com.github.naoghuman.lib.emoticon.internal.DefaultEmoticonValidator}
 * which validates if a {@link java.lang.String} isn't NULL or EMPTY. The class
 * <code>DefaultEmojiValidator</code> can be accessed over the method
 * {@link com.github.naoghuman.lib.emoticon.core.EmoticonProvider#getDefaultEmoticonValidator()}
 * in the class {@link com.github.naoghuman.lib.emoticon.core.EmoticonProvider}.
 *
 * @author Naoghuman
 * @see com.github.naoghuman.lib.emoticon.core.EmoticonProvider
 * @see
 * com.github.naoghuman.lib.emoticon.core.EmoticonProvider#getDefaultEmoticonValidator()
 * @see com.github.naoghuman.lib.emoticon.core.EmoticonValidator
 * @see com.github.naoghuman.lib.emoticon.internal.DefaultEmoticonValidator
 */
public interface EmoticonValidator {
    
    public default void requireNonNull(Emoticon emoticon) throws NullPointerException {
        Objects.requireNonNull(emoticon, "The Emoticon [emoticon] can't be NULL"); // NOI18N
    }
    
    public default void requireNonNull(EmoticonSize size) throws NullPointerException {
        Objects.requireNonNull(size, "The EmoticonSize [size] can't be NULL"); // NOI18N
    }
    
    public default void requireNonNull(EmoticonSuffix suffix) throws NullPointerException {
        Objects.requireNonNull(suffix, "The EmoticonSuffix [suffix] can't be NULL"); // NOI18N
    }

    /**
     * Validates if the parameter <code>value</code> isn't NULL.
     *
     * @param value the parameter which should be validated.
     * @throws NullPointerException if (value == NULL).
     */
    public default void requireNonNull(String value) throws NullPointerException {
        Objects.requireNonNull(value, "The parameter [value] can't be NULL"); // NOI18N
    }
    
    public void validate(double value) throws IllegalArgumentException;
    
    public void validate(Emoticon emoticon) throws NullPointerException, IllegalArgumentException;

    /**
     * This method validates if the parameter <code>value</code> valid against
     * still to be defined rules.
     * 
     * TODO hit default-validator rules
     *
     * @param size the parameter which should be validated.
     * @throws IllegalArgumentException if the validation fails.
     */
    public void validate(EmoticonSize size) throws NullPointerException, IllegalArgumentException;
    
    public void validate(EmoticonSuffix suffix) throws NullPointerException, IllegalArgumentException;

    /**
     * This method validates if the parameter <code>value</code> isn't NULL or
     * EMPTY.
     * 
     *TODO hit default-validator rules
     * 
     * @param value the parameter which should be validated.
     * @throws NullPointerException if (value == NULL).
     * @throws IllegalArgumentException if the validation fails.
     */
    public void validate(String value) throws NullPointerException, IllegalArgumentException;
}

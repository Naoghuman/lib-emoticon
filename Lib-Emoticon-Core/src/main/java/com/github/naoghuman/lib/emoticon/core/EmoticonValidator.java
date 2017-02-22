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

    /**
     * Validates if the parameter <code>value</code> isn't NULL.
     *
     * @param value the parameter which should be validated.
     * @throws NullPointerException if (value == NULL).
     */
    public default void validateIsNotNull(String value) throws NullPointerException {
        Objects.requireNonNull(value, "The value can't be NULL"); // NOI18N
    }

    /**
     * This method validates if the parameter <code>value</code> isn't NULL or
     * EMPTY.
     *
     * @param value the parameter which should be validated.
     * @throws NullPointerException if (value == NULL).
     * @throws IllegalArgumentException if the validation fails.
     */
    public void validate(String value) throws NullPointerException, IllegalArgumentException;
}

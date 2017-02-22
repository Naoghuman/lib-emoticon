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
package com.github.naoghuman.lib.emoticon.internal;

import java.util.Optional;

import com.github.naoghuman.lib.emoticon.core.EmoticonValidator;

/**
 * This class is a default implementation from the <code>Interface</code>
 * {@link com.github.naoghuman.lib.emoticon.core.EmoticonValidator} which can be
 * used to validate that a {@link java.lang.String} isn't NULL or EMPTY.
 * <p />
 * This class can be accessed over the method
 * {@link com.github.naoghuman.lib.emoticon.core.EmoticonProvider#getDefaultEmoticonValidator()}.
 *
 * @author Naoghuman
 * @see com.github.naoghuman.lib.emoticon.core.EmoticonProvider
 * @see
 * com.github.naoghuman.lib.emoticon.core.EmoticonProvider#getDefaultEmoticonValidator()
 * @see com.github.naoghuman.lib.emoticon.core.EmoticonValidator
 */
public final class DefaultEmoticonValidator implements EmoticonValidator {

    private static final Optional<DefaultEmoticonValidator> instance = Optional.of(new DefaultEmoticonValidator());

    /**
     * Returns a singleton instance from the class
     * <code>DefaultEmojiValidator</code>.
     *
     * @return a singleton instance from this class.
     */
    public static final DefaultEmoticonValidator getDefault() {
        return instance.get();
    }

    private DefaultEmoticonValidator() {

    }

    @Override
    public void validate(String value) throws NullPointerException, IllegalArgumentException {
        EmoticonValidator.super.validateIsNotNull(value);

        if (value.trim().isEmpty()) {
            throw new IllegalArgumentException("The value can't be EMPTY"); // NOI18N
        }
    }

}

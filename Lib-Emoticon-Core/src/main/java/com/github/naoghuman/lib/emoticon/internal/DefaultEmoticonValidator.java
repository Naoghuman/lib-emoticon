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

import com.github.naoghuman.lib.emoticon.core.Emoticon;
import com.github.naoghuman.lib.emoticon.core.EmoticonSize;
import com.github.naoghuman.lib.emoticon.core.EmoticonSuffix;
import java.util.Optional;

import com.github.naoghuman.lib.emoticon.core.EmoticonValidator;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public void validate(double value) throws IllegalArgumentException {
        if (value <= 0.0d) {
            throw new IllegalArgumentException("The parameter [value] can't <= 0.0d"); // NOI18N
        }
    }

    @Override
    public void validate(Emoticon emoticon) throws NullPointerException, IllegalArgumentException {
        EmoticonValidator.super.requireNonNull(emoticon);
        
        this.validate(emoticon.getTitle());
        
        if (emoticon.getPrefix().isPresent()) {
            DefaultEmoticonValidator.getDefault().validate(emoticon.getPrefix().get());
        }
        
        if (emoticon.getName().isPresent()) {
            DefaultEmoticonValidator.getDefault().validate(emoticon.getName().get());
        }
        
        if (emoticon.getSuffix().isPresent()) {
            DefaultEmoticonValidator.getDefault().validate(emoticon.getSuffix().get().getSuffix());
        }
        
        if (emoticon.getSize().isPresent()) {
            DefaultEmoticonValidator.getDefault().validate(emoticon.getSize().get());
        }
    }

    @Override
    public void validate(final EmoticonSize size) throws NullPointerException, IllegalArgumentException {
        EmoticonValidator.super.requireNonNull(size);
        
        try {
            this.validate(size.getHeight());
            this.validate(size.getWidth());
        } catch (Exception ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, 
                    "Either the [width=" + size.getWidth() + "] or [height=" + size.getHeight() + "] isn't valid!", ex); // NOI18N
        }
    }

    @Override
    public void validate(final EmoticonSuffix suffix) throws NullPointerException, IllegalArgumentException {
        EmoticonValidator.super.requireNonNull(suffix);
        
        if (suffix.equals(EmoticonSuffix.OWN)) {
            this.validate(suffix.getSuffix());
        }
    }

    @Override
    public void validate(String value) throws NullPointerException, IllegalArgumentException {
        EmoticonValidator.super.requireNonNull(value);

        if (value.trim().isEmpty()) {
            throw new IllegalArgumentException("The parameter [value] can't be EMPTY"); // NOI18N
        }
    }

}

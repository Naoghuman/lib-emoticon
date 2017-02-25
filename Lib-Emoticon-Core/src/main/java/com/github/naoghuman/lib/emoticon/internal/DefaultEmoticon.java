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

public final class DefaultEmoticon implements Emoticon {

    private final String title;
    private final Optional<String> category;
    private final Optional<String> name;
    private final Optional<String> prefix;
    private final Optional<EmoticonSize> size;
    private final Optional<EmoticonSuffix> suffix;

    public DefaultEmoticon(
            final String title, final Optional<String> prefix,
            final Optional<String> name, final Optional<EmoticonSuffix> suffix,
            final Optional<String> category, final Optional<EmoticonSize> size
    ) {
        DefaultEmoticonValidator.getDefault().validate(title);
        if (prefix.isPresent()) {
            DefaultEmoticonValidator.getDefault().validate(prefix.get());
        }
        
        if (name.isPresent()) {
            DefaultEmoticonValidator.getDefault().validate(name.get());
        }
        
        if (suffix.isPresent()) {
            DefaultEmoticonValidator.getDefault().validate(suffix.get());
        }
        
        if (category.isPresent()) {
            DefaultEmoticonValidator.getDefault().validate(category.get());
        }
        
        if (size.isPresent()) {
            DefaultEmoticonValidator.getDefault().validate(size.get());
        }

        this.title  = title;
        this.name   = name;
        this.prefix = prefix;
        this.suffix = suffix;
        this.category = category;
        this.size   = size;
    }

    @Override
    public Optional<String> getCategory() {
        return category;
    }

    @Override
    public Optional<String> getName() {
        return name;
    }

    @Override
    public Optional<String> getPrefix() {
        return prefix;
    }

    @Override
    public Optional<EmoticonSize> getSize() {
        return size;
    }

    @Override
    public Optional<EmoticonSuffix> getSuffix() {
        return suffix;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Emoji ["); // NOI18N
        
        sb.append("title=").append(this.getTitle()); // NOI18N
        sb.append(", name=").append(this.getName().isPresent() ? this.getName().get() : "[]"); // NOI18N
        sb.append(", prefix=").append(this.getPrefix().isPresent() ? this.getPrefix().get() : "[]"); // NOI18N
        sb.append(", suffix=").append(this.getSuffix().isPresent() ? this.getSuffix().get().getSuffix() : "[]"); // NOI18N
        sb.append(", category=").append(this.getCategory().isPresent() ? this.getCategory().get() : "[]"); // NOI18N
        sb.append(", size=").append(this.getSize().isPresent() ? this.getSize().get().toString() : "[]"); // NOI18N
        
        sb.append("]"); // NOI18N

        return sb.toString();
    }

}

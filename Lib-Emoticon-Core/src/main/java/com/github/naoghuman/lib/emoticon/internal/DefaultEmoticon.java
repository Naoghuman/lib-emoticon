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
import com.github.naoghuman.lib.emoticon.core.ImageSize;
import com.github.naoghuman.lib.emoticon.core.ImageSuffix;
import java.util.Optional;

public final class DefaultEmoticon implements Emoticon {

    private final String title;
    private final String name;
    private final Optional<String> prefix;
    private final Optional<ImageSize> size;
    private final Optional<ImageSuffix> suffix;

    public DefaultEmoticon(
            final String title, final String name,
            final Optional<String> prefix, final Optional<ImageSuffix> suffix,
            final Optional<ImageSize> size
    ) {
        DefaultEmoticonValidator.getDefault().validate(title);
        DefaultEmoticonValidator.getDefault().validate(name);

        this.title  = title;
        this.name   = name;
        this.prefix = prefix;
        this.suffix = suffix;
        this.size   = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Optional<String> getPrefix() {
        return prefix;
    }

    @Override
    public Optional<ImageSize> getSize() {
        return size;
    }

    @Override
    public Optional<ImageSuffix> getSuffix() {
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
        sb.append(", "); // NOI18N
        sb.append("name=").append(this.getName()); // NOI18N
        
        if (this.getPrefix().isPresent()) {
            sb.append(", "); // NOI18N
            sb.append("prefix=").append(this.getPrefix().get()); // NOI18N
        }
        
        if (this.getSuffix().isPresent()) {
            sb.append(", "); // NOI18N
            sb.append("suffix=").append(this.getSuffix().get().getSuffix()); // NOI18N
        }
        
        if (this.getSize().isPresent()) {
            sb.append(", "); // NOI18N
            sb.append("size=").append(this.getSize().get().toString()); // NOI18N
        }
        
        sb.append("]"); // NOI18N

        return sb.toString();
    }

}

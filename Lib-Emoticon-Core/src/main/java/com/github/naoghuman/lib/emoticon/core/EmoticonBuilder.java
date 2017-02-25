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

import com.github.naoghuman.lib.emoticon.internal.DefaultEmoticon;
import com.github.naoghuman.lib.emoticon.internal.DefaultEmoticonValidator;
import java.util.Optional;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableMap;

/**
 * 
 *
 * @author Naoghuman
 */
public final class EmoticonBuilder {
    
    private EmoticonBuilder() {
        
    }
    
    public static final TitleEmoticonBuilder create() {
        return new EmoticonBuilderImpl();
    }
    
    public static interface TitleEmoticonBuilder {
        public PrefixEmoticonBuilder title(final String title);
    }
    
    public static interface PrefixEmoticonBuilder {
        
        public NameEmoticonBuilder prefix(final Optional<String> prefix);
        public SuffixEmoticonBuilder name(final Optional<String> name);
        public CategoryEmoticonBuilder suffix(final Optional<EmoticonSuffix> suffix);
        public SizeEmoticonBuilder category(final Optional<String> category);
        public BuildEmoticonBuilder size(final Optional<EmoticonSize> size);
        
        public Emoticon build();
        
    }
    
    public static interface NameEmoticonBuilder {
        
        public SuffixEmoticonBuilder name(final Optional<String> name);
        public CategoryEmoticonBuilder suffix(final Optional<EmoticonSuffix> suffix);
        public SizeEmoticonBuilder category(final Optional<String> category);
        public BuildEmoticonBuilder size(final Optional<EmoticonSize> size);
        
        public Emoticon build();
        
    }
    
    public static interface SuffixEmoticonBuilder {
        
        public CategoryEmoticonBuilder suffix(final Optional<EmoticonSuffix> suffix);
        public SizeEmoticonBuilder category(final Optional<String> category);
        public BuildEmoticonBuilder size(final Optional<EmoticonSize> size);
        
        public Emoticon build();
        
    }
    
    public static interface CategoryEmoticonBuilder {
        
        public SizeEmoticonBuilder category(final Optional<String> category);
        public BuildEmoticonBuilder size(final Optional<EmoticonSize> size);
        
        public Emoticon build();
    }
    
    public static interface SizeEmoticonBuilder {
        
        public BuildEmoticonBuilder size(final Optional<EmoticonSize> size);
        
        public Emoticon build();
        
    }
    
    public static interface BuildEmoticonBuilder {
        
        public Emoticon build();
        
    }
    
    private static final class EmoticonBuilderImpl implements
            TitleEmoticonBuilder, PrefixEmoticonBuilder, NameEmoticonBuilder,
            SuffixEmoticonBuilder, CategoryEmoticonBuilder, SizeEmoticonBuilder,
            BuildEmoticonBuilder
    {
        private static final String PROP_CATEGORY = "category";   // NOI18N
        private static final String PROP_NAME     = "name";   // NOI18N
        private static final String PROP_PREFIX   = "prefix"; // NOI18N
        private static final String PROP_SIZE     = "size";   // NOI18N
        private static final String PROP_SUFFIX   = "suffix"; // NOI18N
        private static final String PROP_TITLE    = "title";  // NOI18N
        
        private final ObservableMap<String, Property> properties = FXCollections.observableHashMap();

        EmoticonBuilderImpl() {
            this.init();
        }
        
        private void init() {
            properties.put(PROP_CATEGORY, new SimpleObjectProperty<>(Optional.empty()));
            properties.put(PROP_NAME,     new SimpleObjectProperty<>(Optional.empty()));
            properties.put(PROP_PREFIX,   new SimpleObjectProperty<>(Optional.empty()));
            properties.put(PROP_SIZE,     new SimpleObjectProperty<>(Optional.empty()));
            properties.put(PROP_SUFFIX,   new SimpleObjectProperty<>(Optional.empty()));
        }
        
        @Override
        public PrefixEmoticonBuilder title(String title) {
            DefaultEmoticonValidator.getDefault().validate(title);
            
            properties.put(PROP_TITLE, new SimpleStringProperty(title));
        
            return this;
        }

        @Override
        public NameEmoticonBuilder prefix(Optional<String> prefix) {
            if (prefix.isPresent()) {
                DefaultEmoticonValidator.getDefault().validate(prefix.get());
                
                properties.put(PROP_PREFIX, new SimpleObjectProperty<>(prefix));
            }
        
            return this;
        }

        @Override
        public SuffixEmoticonBuilder name(Optional<String> name) {
            if (name.isPresent()) {
                DefaultEmoticonValidator.getDefault().validate(name.get());
                
                properties.put(PROP_NAME, new SimpleObjectProperty<>(name));
            }
        
            return this;
        }

        @Override
        public CategoryEmoticonBuilder suffix(Optional<EmoticonSuffix> suffix) {
            if (suffix.isPresent()) {
                DefaultEmoticonValidator.getDefault().validate(suffix.get());
                
                properties.put(PROP_SUFFIX, new SimpleObjectProperty<>(suffix));
            }
            
            return this;
        }

        @Override
        public SizeEmoticonBuilder category(Optional<String> category) {
            if (category.isPresent()) {
                DefaultEmoticonValidator.getDefault().validate(category.get());
                
                properties.put(PROP_CATEGORY, new SimpleObjectProperty<>(category));
            }
            
            return this;
        }
        
        @Override
        public BuildEmoticonBuilder size(Optional<EmoticonSize> size) {
            if (size.isPresent()) {
                DefaultEmoticonValidator.getDefault().validate(size.get());
                
                properties.put(PROP_SIZE, new SimpleObjectProperty<>(size));
            }
        
            return this;
        }

        @Override
        public Emoticon build() {
            final StringProperty titleStringProperty = (StringProperty) properties.get(PROP_TITLE);
            final String title = titleStringProperty.get();
            
            final ObjectProperty<Optional<String>> prefixObjectProperty = (ObjectProperty<Optional<String>>) properties.get(PROP_PREFIX);
            final Optional<String> prefix = prefixObjectProperty.get();
            
            final ObjectProperty<Optional<String>> nameObjectProperty = (ObjectProperty<Optional<String>>) properties.get(PROP_NAME);
            final Optional<String> name = nameObjectProperty.get();
            
            final ObjectProperty<Optional<EmoticonSuffix>> suffixObjectProperty = (ObjectProperty<Optional<EmoticonSuffix>>) properties.get(PROP_SUFFIX);
            final Optional<EmoticonSuffix> suffix = suffixObjectProperty.get();
            
            final ObjectProperty<Optional<String>> categoryObjectProperty = (ObjectProperty<Optional<String>>) properties.get(PROP_CATEGORY);
            final Optional<String> category = categoryObjectProperty.get();
            
            final ObjectProperty<Optional<EmoticonSize>> sizeObjectProperty = (ObjectProperty<Optional<EmoticonSize>>) properties.get(PROP_SIZE);
            final Optional<EmoticonSize> size = sizeObjectProperty.get();
            
            final Emoticon emoticon = new DefaultEmoticon(title, prefix, name, suffix, category, size);
            
            return emoticon;
        }
        
    }
    
}

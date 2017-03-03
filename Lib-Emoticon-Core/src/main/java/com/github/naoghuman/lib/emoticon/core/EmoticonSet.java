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
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * 
 * @author Naoghuman
 */
public abstract class EmoticonSet {

    /**
     * Allowed to compare two {@link com.github.naoghuman.lib.emoticon.core.Emoticon}s 
     * with the distinction criteria {@link com.github.naoghuman.lib.emoticon.core.Emoticon#getTitle()}.
     *
     * @see com.github.naoghuman.lib.emoticon.core.Emoticon
     * @see com.github.naoghuman.lib.emoticon.core.Emoticon#getTitle()
     */
    public static final Comparator<Emoticon> EMOTICON_TITLE_COMPARATOR = Comparator.comparing(Emoticon::getTitle);

    private final ObservableList<Emoticon> emoticons = FXCollections.observableArrayList();
    private final ObservableList<EmoticonLoader> emoticonLoaders = FXCollections.observableArrayList();

    /**
     *
     */
    protected EmoticonSet() {
        this.initialize();
    }

    private void initialize() {
        this.configureEmoticonLoaders();
        this.configureEmoticons();
    }

    /**
     * Adds the {@link com.github.naoghuman.lib.emoticon.core.Emoticon} to the
     * list of associated <code>Emoticon</code>s from a <code>subclass</code> of
     * this abstract class. 
     * <br>
     * Use this methods to define all <code>Emoticon</code>s from the given concrete 
     * implementation from this abstract class in the to overriden method
     * {@link com.github.naoghuman.lib.emoticon.core.EmoticonSet#configureEmoticons()}.
     *
     * @param emoticon the <code>Emoticon</code> which should be associated with
     * this <code>EmoticonSet</code>.
     * @see com.github.naoghuman.lib.emoticon.core.Emoticon
     * @see com.github.naoghuman.lib.emoticon.core.EmoticonSet#configureEmoticons()
     */
    protected void addEmoticon(Emoticon emoticon) {
        emoticons.add(emoticon);
    }

    /**
     * Adds the {@link com.github.naoghuman.lib.emoticon.core.EmoticonLoader} to
     * the list of associated <code>EmoticonLoader</code>s from a
     * <code>subclass</code> of this abstract class.
     * <br>
     * Use this methods to define all <code>EmoticonLoader</code>s from the given 
     * concrete implementation from this abstract class in the to overriden method
     * {@link com.github.naoghuman.lib.emoticon.core.EmoticonSet#configureEmoticonLoaders()}.
     *
     * @param emoticonLoader the <code>EmoticonLoader</code> which should be
     * associated with this <code>EmoticonSet</code>.
     * @see com.github.naoghuman.lib.emoticon.core.EmoticonLoader
     * @see com.github.naoghuman.lib.emoticon.core.EmoticonSet#configureEmoticonLoaders()
     */
    protected void addEmoticonLoader(EmoticonLoader emoticonLoader) {
        emoticonLoaders.add(emoticonLoader);
    }

    /**
     * Use this method to add all {@link com.github.naoghuman.lib.emoticon.core.EmoticonLoader}s 
     * which are responsible for loading the associated {@link com.github.naoghuman.lib.emoticon.core.Emoticon}s 
     * in a concrete implementation from this abstract class.
     * <br>
     * For more information how to add an <code>EmoticonLoader</code>s to this 
     * class see also {@link com.github.naoghuman.lib.emoticon.core.EmoticonSet#addEmoticonLoader(com.github.naoghuman.lib.emoticon.core.EmoticonLoader) }.
     *
     * @see com.github.naoghuman.lib.emoticon.core.Emoticon
     * @see com.github.naoghuman.lib.emoticon.core.EmoticonLoader
     * @see com.github.naoghuman.lib.emoticon.core.EmoticonSet#addEmoticonLoader(com.github.naoghuman.lib.emoticon.core.EmoticonLoader) 
     */
    protected abstract void configureEmoticonLoaders();

    /**
     * Use this method to add all associated {@link com.github.naoghuman.lib.emoticon.core.Emoticon}s 
     * in a concrete implementation from this abstract class.
     * <br>
     * For more information how to add an <code>Emoticon</code>s to this 
     * class see also {@link com.github.naoghuman.lib.emoticon.core.EmoticonSet#addEmoticon(com.github.naoghuman.lib.emoticon.core.Emoticon)}.
     *
     * @see com.github.naoghuman.lib.emoticon.core.Emoticon
     * @see com.github.naoghuman.lib.emoticon.core.EmoticonSet#addEmoticon(com.github.naoghuman.lib.emoticon.core.Emoticon) 
     */
    protected abstract void configureEmoticons();

    /**
     * Returns the corresponding {@link com.github.naoghuman.lib.emoticon.core.Emoticon} 
     * wrapped in an {@link java.util.Optional} or when not found {@link java.util.Optional#empty()}.
     * <br>
     * The parameter <code>title</code> will be validate against the minimal rules 
     * defined in {@link com.github.naoghuman.lib.emoticon.internal.DefaultEmoticonValidator}. 
     * Plz see {@link com.github.naoghuman.lib.emoticon.internal.DefaultEmoticonValidator#validate(java.lang.String)}
     * for more informations.
     *
     * @param title the title from the searched <code>Emoticon</code>.
     * @return The founded <code>Emoticon</code> wrapped in an
     * <code>Optional</code> or <code>Optional.empty()</code>.
     * @see com.github.naoghuman.lib.emoticon.core.Emoticon
     * @see com.github.naoghuman.lib.emoticon.internal.DefaultEmoticonValidator
     * @see com.github.naoghuman.lib.emoticon.internal.DefaultEmoticonValidator#validate(java.lang.String)
     * @see java.util.Optional
     * @see java.util.Optional#empty()
     */
    protected Optional<Emoticon> getEmoticon(final String title) {
        DefaultEmoticonValidator.getDefault().validate(title);
        
        final Optional<Emoticon> foundedEmoticon = emoticons.stream()
                .filter(emoticon -> emoticon.getTitle().equals(title))
                .findFirst();

        return foundedEmoticon;
    }

    /**
     * Returns the first corresponding {@link com.github.naoghuman.lib.emoticon.core.EmoticonLoader} 
     * which is associated the given {@link com.github.naoghuman.lib.emoticon.core.Emoticon}.
     * <br>
     * The parameter <code>emoticon</code> will be validate against the minimal rules 
     * defined in {@link com.github.naoghuman.lib.emoticon.internal.DefaultEmoticonValidator}. 
     * Plz see {@link com.github.naoghuman.lib.emoticon.internal.DefaultEmoticonValidator#validate(com.github.naoghuman.lib.emoticon.core.Emoticon)}
     * for more informations.
     *
     * @param emoticon which first corresponding <code>EmoticonLoader</code> should be returned.
     * @return the first corresponding <code>EmoticonLoader</code> to the given <code>Emoticon</code>.
     * @see com.github.naoghuman.lib.emoticon.core.Emoticon
     * @see com.github.naoghuman.lib.emoticon.core.EmoticonLoader
     * @see com.github.naoghuman.lib.emoticon.internal.DefaultEmoticonValidator
     * @see com.github.naoghuman.lib.emoticon.internal.DefaultEmoticonValidator#validate(com.github.naoghuman.lib.emoticon.core.Emoticon)
     * @see java.util.Optional
     * @see java.util.Optional#empty()
     */
    public Optional<EmoticonLoader> getEmoticonLoader(Emoticon emoticon) {
        DefaultEmoticonValidator.getDefault().validate(emoticon);
        
        final Optional<EmoticonLoader> foundedEmoticonLoader = emoticonLoaders.stream()
                .filter(emoticonLoader -> emoticonLoader.isSupported(emoticon.getPrefix()))
                .findFirst();

        return foundedEmoticonLoader;
    }

    /**
     * Returns all associated {@link com.github.naoghuman.lib.emoticon.core.Emoticon} s
     * defined in a concrete implementation from this abstract class.
     * <br><br>
     * Hint:<br>
     * To add <code>Emoticon</code>s to a <code>EmoticonSet</code> plz see the method
     * {@link com.github.naoghuman.lib.emoticon.core.EmoticonSet#addEmoticon(com.github.naoghuman.lib.emoticon.core.Emoticon)}
     * or {@link com.github.naoghuman.lib.emoticon.core.EmoticonSet#configureEmoticons()}.
     *
     * @return all associated <code>Emoticon</code>s from a concrete implementation of this abstract class.
     * @see com.github.naoghuman.lib.emoticon.core.Emoticon
     * @see com.github.naoghuman.lib.emoticon.core.EmoticonSet#addEmoticon(com.github.naoghuman.lib.emoticon.core.Emoticon)
     * @see com.github.naoghuman.lib.emoticon.core.EmoticonSet#configureEmoticons() 
     */
    public Stream<Emoticon> getEmoticons() {
        return emoticons.stream();
    }

    /**
     * Returns all associated {@link com.github.naoghuman.lib.emoticon.core.Emoticon}s 
     * defined in a concrete implementation from this abstract class which have the 
     * same <code>category</code> like the given parameter.
     * <br>
     * The parameter <code>category</code> will be validate against the minimal rules 
     * defined in {@link com.github.naoghuman.lib.emoticon.internal.DefaultEmoticonValidator}. 
     * Plz see {@link com.github.naoghuman.lib.emoticon.internal.DefaultEmoticonValidator#validate(java.lang.String)}
     * for more informations.
     * <br><br>
     * Hint:<br>
     * To add <code>Emoticon</code>s to a <code>EmoticonSet</code> plz see the method
     * {@link com.github.naoghuman.lib.emoticon.core.EmoticonSet#addEmoticon(com.github.naoghuman.lib.emoticon.core.Emoticon)}
     * or {@link com.github.naoghuman.lib.emoticon.core.EmoticonSet#configureEmoticons()}.
     *
     * @param category the filter parameter.
     * @return all associated <code>Emoticon</code>s in a concrete implementation from this abstract <code>EmoticonSet</code>.
     * @see com.github.naoghuman.lib.emoticon.core.Emoticon
     * @see com.github.naoghuman.lib.emoticon.core.EmoticonSet#addEmoticon(com.github.naoghuman.lib.emoticon.core.Emoticon)
     * @see com.github.naoghuman.lib.emoticon.core.EmoticonSet#getEmoticons()
     * @see com.github.naoghuman.lib.emoticon.internal.DefaultEmoticonValidator
     * @see com.github.naoghuman.lib.emoticon.internal.DefaultEmoticonValidator#validate(java.lang.String)
     * @see java.util.Optional
     */
    public Stream<Emoticon> getEmoticons(String category) {
        DefaultEmoticonValidator.getDefault().validate(category);

        final ObservableList<Emoticon> categoryEmoticons = FXCollections.observableArrayList();
        categoryEmoticons.addAll(emoticons.stream()
                .filter(emoticon -> (
                        emoticon.getCategory().isPresent()
                        && emoticon.getCategory().get().equals(category))
                )
                .collect(Collectors.toList()));

        return categoryEmoticons.stream();
    }

}

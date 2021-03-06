package com.algolia.instantsearch.core.events;

import android.support.annotation.NonNull;

import com.algolia.instantsearch.core.helpers.Searcher;

/**
 * An event to let you react to resetting of the search interface.
 */
public class ResetEvent extends SearcherEvent {
    public ResetEvent(@NonNull Searcher searcher) {
        super(searcher);
    }

    @Override public String toString() {
        return "ResetEvent{" +
                "searcher=" + searcher +
                '}';
    }
}

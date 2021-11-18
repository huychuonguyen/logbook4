package com.example.logbook4.listener;

import com.example.logbook4.model.Event;

public interface EventListAdapterListener {
    void onUpdateClicked(Event event, int position);
    void onDeleteClicked(Event event, int position);
}
package com.example.logbook4.listener;

import com.example.logbook4.model.Event;

import java.io.Serializable;

public interface UpdateEventListener extends Serializable {
    void onUpdated(Event event);
    void onAdded(Event event);
}

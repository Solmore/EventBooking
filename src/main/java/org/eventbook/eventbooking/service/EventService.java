package org.eventbook.eventbooking.service;

import org.eventbook.eventbooking.domain.event.Event;

import java.time.LocalDate;
import java.util.List;

public interface EventService {

    Event getById(Long id);

    List<Event> getAllByUserId(Long id);

    void create(Event event);

    List<Event> getAllEventByNameAndDurationAndCategory(String name,
                                                        LocalDate startDate,
                                                        LocalDate endDate,
                                                        String category);

}

package com.back;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepositoryV2;

    public long count() {
        return personRepositoryV2.count();
    }
}

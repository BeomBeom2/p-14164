package com.back;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PersonRepository {
    private final int version;

    public long count() {
        System.out.println("PersonRepository(v%d).count() 작동".formatted(version));
        return 3;
    }
}
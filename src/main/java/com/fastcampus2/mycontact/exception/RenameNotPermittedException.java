package com.fastcampus2.mycontact.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RenameNotPermittedException extends RuntimeException {
    private static final String MESSAGE = "이름 변경을 허용하지 않습니다.";

    public RenameNotPermittedException() {
        super(MESSAGE);
        log.error(MESSAGE);
    }
}

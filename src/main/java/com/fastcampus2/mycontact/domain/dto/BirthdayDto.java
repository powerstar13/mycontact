package com.fastcampus2.mycontact.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.LocalDate;

@Embeddable
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BirthdayDto {
    private Integer yearOfBirthday;
    private Integer monthOfBirthday;
    private Integer dayOfBirthday;

    // 실존하는 년 월 일 값으로 입력되도록 생성자 처리
    private BirthdayDto(LocalDate birthday) {
        this.yearOfBirthday = birthday.getYear();
        this.monthOfBirthday = birthday.getMonthValue();
        this.dayOfBirthday = birthday.getDayOfMonth();
    }

    // 요즘의 트렌드는 new 생성자를 통해 객체를 만들지 않고 static으로 만드는 추세이다.
    public static BirthdayDto of(LocalDate birthday) {
        return new BirthdayDto(birthday);
    }
}

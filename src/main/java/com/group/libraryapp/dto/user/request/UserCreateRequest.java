package com.group.libraryapp.dto.user.request;

public class UserCreateRequest {
    private String name;
    private Integer age; //나이는 선택사항인데 int는 null 표현이 안되기 때문에 Integer로 한다.

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}

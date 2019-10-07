package java_patterns.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
class EmployeeWithLombok {
    private final String name;
    private final int age;
    private final String department;
}

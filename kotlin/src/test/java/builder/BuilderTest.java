package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BuilderTest {

    @Test
    void testCreateBuilder() {
        Employee.Builder builder = new Employee.Builder();

        Employee joseph = builder.setAge(10)
                .setName("joseph")
                .setDepartment("Builder").build();

        assertEquals(10, joseph.getAge());
        assertEquals("joseph", joseph.getName());
        assertEquals("Builder", joseph.getDepartment());
    }


    @Test
    void testCreateBuilderWithLombok() {
        EmployeeWithLombok employee = EmployeeWithLombok.builder()
                .age(10)
                .name("joe")
                .department("Builder").build();


        assertEquals(10, employee.getAge());
        assertEquals("joe", employee.getName());
        assertEquals("Builder", employee.getDepartment());
    }
}
package builder;

class Employee {
    private final String name;
    private final int age;
    private final String department;

    private Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    static class Builder {
        private String name;
        private int age;
        private String department;

        Employee build() {
            return new Employee(name, age, department);
        }

        Builder setName(String name) {
            this.name = name;
            return this;
        }

        Builder setAge(int age) {
            this.age = age;
            return this;
        }

        Builder setDepartment(String department) {
            this.department = department;
            return this;
        }
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    String getDepartment() {
        return department;
    }
}

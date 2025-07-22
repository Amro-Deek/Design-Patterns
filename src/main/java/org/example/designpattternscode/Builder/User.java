package org.example.designpattternscode.Builder;

public class User {
    private final String firstName;//req.
    private final String LastName;//req.
    private final int age;
    private final String address;
    private final String phone;

    private User(UserBuilder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.LastName = userBuilder.LastName;
        this.age = userBuilder.age;
        this.address = userBuilder.address;
        this.phone = userBuilder.phone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User Details:\n");
        sb.append("First Name: ").append(firstName).append("\n");
        sb.append("Last Name: ").append(LastName).append("\n");

        if (age > 0)
            sb.append("Age: ").append(age).append("\n");

        if (address != null)
            sb.append("Address: ").append(address).append("\n");

        if (phone != null)
            sb.append("Phone: ").append(phone).append("\n");

        return sb.toString();
    }

    public static class UserBuilder {
        private String firstName;//req.
        private String LastName;//req.
        private int age;
        private String address;
        private String phone;

        public UserBuilder(String firstName,String lastName) {
            this.LastName = lastName;
            this.firstName = firstName;
        }

        public UserBuilder setAge(int age){
            this.age=age;
            return this;
        }
        public UserBuilder setAddress(String address){
            this.address=address;
            return this;
        }
        public UserBuilder setPhone(String phone){
            this.phone=phone;
            return this;
        }
        public User build(){
            User user =new User(this);
            return user;
        }
    }
}

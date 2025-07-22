package org.example.designpattternscode.Builder;

public class Main {
    public static void main(String[] args) {
        // we can make the object like down below to be sure its immutable

        User user1 = new User.UserBuilder("Amro","Al Deek")
                .setAddress("Birzeit").setAge(21).build();


        // or if we want to build or change something in run time , use this
        User.UserBuilder builder = new User.UserBuilder("Ahmed", "Al Khateeb");
        builder.setPhone("0599");
        builder.setPhone("0588");

        User user2 = builder.build();

        System.out.println(user1);
        System.out.println(user2);
    }
}
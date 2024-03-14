package com.zep.UserAuth.dtos;
/*Records are immutable and are used to store data.
 They contain fields, all-args constructor, getters, toString, and equals/hashCode methods.
  Since they are immutable, they don't have setters. Because of their concise syntax, they are often used as data transfer objects (DTOs) in Java applications*/
public record RegistrationRequest( String firstName,
                                   String lastName,
                                   String email,
                                   String password,
                                   String role) {

}

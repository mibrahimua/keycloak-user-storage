package com.ulil.model;

import jakarta.persistence.*;
import lombok.Data;


@NamedQueries({
        @NamedQuery(name = "getUserByUsername", query = "select u from tbl_user u where u.username = :username"),
        @NamedQuery(name = "getUserByEmail", query = "select u from tbl_user u where u.email = :email"),
        @NamedQuery(name = "getUserCount", query = "select count(u) from tbl_user u"),
        @NamedQuery(name = "getAllUsers", query = "select u from tbl_user u"),
        @NamedQuery(name = "searchForUser", query = "select u from tbl_user u where " +
                "( lower(u.username) like :search or u.email like :search ) order by u.username"),
})
@Entity(name = "tbl_user")
@Data
public class Users {
    @Id
    private String id;

    private String username;
    private String email;
    private String password;
    private String phone;
    private String created_at;
}

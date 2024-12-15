/**
 * created by Anna
 * Date:12/12/2024
 * Time:09:39
 * ProjectName:login
 **/

package com.kfs.kfs.modell;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class UserMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String passaword;

    public UserMessage(int id) {
        this.id = id;
    }

    public UserMessage(int id, String name, String passaword) {
        this.id = id;
        this.name = name;
        this.passaword = passaword;
    }

    public UserMessage() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassaword() {
        return passaword;
    }

    public void setPassaword(String passaword) {
        this.passaword = passaword;
    }
}

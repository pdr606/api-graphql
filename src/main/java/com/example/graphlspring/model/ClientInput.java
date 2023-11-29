package com.example.graphlspring.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class ClientInput {
    private Long id;
    private String name;
    private String email;
}

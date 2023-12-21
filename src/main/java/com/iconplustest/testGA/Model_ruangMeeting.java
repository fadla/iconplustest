package com.iconplustest.testGA;


import java.util.Date;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ruang_meeting")
public class Model_ruangMeeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private Integer id;

    @NonNull
    private String room_name;

    @NonNull
    private Integer capacity;

    @NonNull
    private Integer unitPLN;

    @Override
    public String toString() {
        return String.format(""
                + "Model_ruangMeeting[id=%d,room_name=%s,capacity=%d,unitPLN=%d",
                id, room_name, capacity, unitPLN);
    }

}

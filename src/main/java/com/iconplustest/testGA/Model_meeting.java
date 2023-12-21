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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

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
@Table(name = "meeting")
public class Model_meeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private Integer id;

    @NonNull
    private String name;

    @NonNull
    private Integer unitPLN;

    @NonNull
    private Integer meetingRoom;

    @NonNull
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-mm-dd-hh-mm")
    private Date meetingDateBegin;

    @NonNull
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-mm-dd-hh-mm")
    private Date meetingDateEnd;

    @NonNull
    private Integer participantAmmount;

    @NonNull
    private Integer consumptionType;

    @NonNull
    private Integer createdBy;

    @Override
    public String toString() {
        return String.format(""
                + "Model_meeting[id=%d,name=%s,unitPLN=%d,meetingRoom=%d,meetingDateBegin=%tD,,meetingDateEnd=%tD,participantAmmount=%d,consumptionType=%d,createdBy=%d",
                id, name, unitPLN, meetingRoom, meetingDateBegin, meetingDateEnd, participantAmmount, consumptionType,
                createdBy);
    }

}

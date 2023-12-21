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
@Table(name = "unit_pln")
public class Model_unitPLN {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @NonNull
  private int id;
  @NonNull
  private String unit_name;
  @NonNull
  private String address;

  @Override
  public String toString() {
    return String.format(""
        + "Model_unitPLN[id=%d,unit_name=%s,address=%s",
        id, unit_name, address);
  }

  // setter & getter . . .

}
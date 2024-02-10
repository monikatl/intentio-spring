package com.baszczyk.intentiospring.data.data.event;

import com.baszczyk.intentiospring.data.data.intention.IntentionWithPriest;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "holly_mass_table")
public class HolyMass implements Event {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "intention_priest", nullable = false)
  private List<IntentionWithPriest> intentionWithPriestList;
  private int numberOfPriests;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public static HolyMass createHolyMass() {
        HolyMass mass = new HolyMass();
        mass.numberOfPriests = 1;
        mass.intentionWithPriestList = new ArrayList<>();
        mass.intentionWithPriestList.add(new IntentionWithPriest());
        return mass;
    }

    public static HolyMass createHolyMass(int numberOfPriests) {
        HolyMass mass = new HolyMass();
        mass.numberOfPriests = numberOfPriests;
        mass.intentionWithPriestList = new ArrayList<>(numberOfPriests);
        return mass;
    }


}

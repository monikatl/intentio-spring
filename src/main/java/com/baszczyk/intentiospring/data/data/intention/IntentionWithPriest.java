package com.baszczyk.intentiospring.data.data.intention;

import com.baszczyk.intentiospring.data.data.intention.Intention;
import com.baszczyk.intentiospring.data.data.user.Priest;
import jakarta.persistence.*;

@Entity
public class IntentionWithPriest {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "priest_id")
  private Priest priest;
  @ManyToOne
  @JoinColumn(name = "intention_id")
  private Intention intention;

  public Intention getIntention() {
    return intention;
  }

  public Priest getPriest() {
    return priest;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public void setPriest(Priest priest) {
        this.priest = priest;
    }

    public void setIntention(Intention intention) {
        this.intention = intention;
    }
}

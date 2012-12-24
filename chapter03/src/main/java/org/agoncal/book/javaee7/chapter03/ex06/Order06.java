package org.agoncal.book.javaee7.chapter03.ex06;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * @author Antonio Goncalves
 *         APress Book - Beginning Java EE 7 with Glassfish 4
 *         http://www.apress.com/
 *         http://www.antoniogoncalves.org
 *         --
 */
@ChronologicalDates
public class Order06 {

  // ======================================
  // =             Attributes             =
  // ======================================

  @NotNull
  private Long id;
  private Date creationDate;
  @NotNull
  private Double totalAmount;
  private Date paymentDate;
  private Date deliveryDate;
  private List<OrderLine06> orderLines;

  // ======================================
  // =            Constructors            =
  // ======================================

  public Order06() {
  }

  // ======================================
  // =          Getters & Setters         =
  // ======================================

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  public Double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public Date getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(Date paymentDate) {
    this.paymentDate = paymentDate;
  }

  public Date getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(Date deliveryDate) {
    this.deliveryDate = deliveryDate;
  }

  public List<OrderLine06> getOrderLines() {
    return orderLines;
  }

  public void setOrderLines(List<OrderLine06> orderLines) {
    this.orderLines = orderLines;
  }
}
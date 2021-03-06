package model;

public class Item {

 private Price price;
 private String id;
 private String description;

 public Price getPrice() {
  return price;
 }
 public void setPrice(Price price) {
  this.price = price;
 }
 public String getId() {
  return id;
 }
 public void setId(String id) {
  this.id = id;
 }
 public String getDescription() {
  return description;
 }
 public void setDescription(String description) {
  this.description = description;
 }

 /**
  * @return
  */
 public String printStatus() {
  return  id + "," + 
    description + "," +
    price.getAmount() + "," + 
    price.getCurrency()
    ;
 }
}
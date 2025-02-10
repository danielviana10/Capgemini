package Herança;

public class Seller extends Employee {
    private int totalItemsSold;
    private double commissionPerItem;

    public Seller() {
        super();
    }

    public int getTotalItemsSold() {
        return totalItemsSold;
    }

    public void setTotalItemsSold(int totalItemsSold) {
        this.totalItemsSold = totalItemsSold;
    }

    public double getCommissionPerItem() {
        return commissionPerItem;
    }

    public void setCommissionPerItem(double commissionPerItem) {
        this.commissionPerItem = commissionPerItem;
    }

    public double calculateSalary() {
        return super.getSalary() + (totalItemsSold * commissionPerItem);
    }
}

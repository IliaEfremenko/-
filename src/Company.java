import taxes.TaxSystem;

public class Company {
    private String title;
    private int debit = 0;
    private int credit = 0;
    private TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void payTaxes() {
        int tax = taxSystem.calcTaxFor(debit, credit);
        System.out.println("Компания " + title + " уплатила налог в размере: " + tax + " руб.");
        debit = 0;
        credit = 0;
    }

    public int applyDeals(Deal[] deals) {
        for (Deal deal : deals) {
            debit += deal.debitChange;
            credit += deal.creditChange;
        }
        int getMoney = debit - credit;
        payTaxes();
        return getMoney;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        }
        if (amount < 0) {
            credit += Math.abs(amount);
        }
    }
}
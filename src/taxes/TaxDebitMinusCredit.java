package taxes;

public class TaxDebitMinusCredit extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int tax = (int) ((debit - credit) * 0.15);
        return Math.max(0, tax);
    }
}
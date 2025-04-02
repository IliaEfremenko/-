import java.util.Arrays;
import java.util.Scanner;
import taxes.*;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Аграномы", new TaxDebit());
        company.setTaxSystem(new TaxDebitMinusCredit());
        company.shiftMoney(10_000);
        company.shiftMoney(-5_500);
        company.payTaxes();

        Deal[] deals = {
                new Sale("Dirt", 500),
                new Expenditure("Dirt", 300)
        };
        int getMany = company.applyDeals(deals);
        System.out.println("Заработок составил: " + getMany);
    }
}
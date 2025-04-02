public class Sale extends Deal {

    public Sale(String name, int expenditure) {
        super("Продажа " + name + " на " + expenditure + "  руб.", expenditure, 0);
    }
}

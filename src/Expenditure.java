public class Expenditure extends Deal {

    public Expenditure(String name, int expenditure) {
        super("Покупка " + name + " на " + expenditure + "  руб.", 0, expenditure);
    }
}

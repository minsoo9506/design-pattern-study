package decorator;

public class Main {
        public static void main(String args[]) {
            Beverage EspressoBeverage = new Espresso();
            System.out.println(EspressoBeverage.getDescription()
                    + ": $" + EspressoBeverage.cost());

            Beverage HouseBlendBeverage = new HouseBlend();
            HouseBlendBeverage = new Soy(HouseBlendBeverage);
            HouseBlendBeverage = new Mocha(HouseBlendBeverage);
            HouseBlendBeverage = new Whip(HouseBlendBeverage);
            System.out.println(HouseBlendBeverage.getDescription()
                    + ": $" + HouseBlendBeverage.cost());
        }
}

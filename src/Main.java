public class Main {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon(25, "Pikachu", "Electric", null, 35, 35, 55, 40, 50, 50, 90);
        Pokemon bulbasaur = new Pokemon(1, "Bulbizarre", "Grass", "Poison", 45, 45, 49, 49, 65, 65, 45);

        System.out.println(pikachu);
        System.out.println(bulbasaur);

        int dommages = pikachu.calculerDommage(bulbasaur, 40);
        System.out.println("Dommages infligés par Pikachu à Bulbizarre: " + dommages);
    }
}

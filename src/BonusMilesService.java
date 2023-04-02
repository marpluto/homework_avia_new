public class BonusMilesService {
    public int calculate(int priceRub) {
        int bonusPerMile = 20;
        int bonusMiles = priceRub / bonusPerMile;
        return bonusMiles;
    }
}

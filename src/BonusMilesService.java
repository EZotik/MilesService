public class BonusMilesService {
    public int calculate (int cost) {
        int numberRubles = 20;
        int miles = cost / numberRubles;
        return miles;
    }
}
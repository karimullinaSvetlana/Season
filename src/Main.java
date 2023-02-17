public class Main {
    public static void main(String[] args) {
        System.out.println("мое любимое время года: " + Season.seasonF + ", его средняя температура = " + Season.SUMMER.temperature);
        Season.iLove(Season.WINTER);
        for (Season season : Season.values()){
            System.out.println(season);
            System.out.println(season.temperature);
            System.out.println(season.getDescription());
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("мое любимое время года: " + seasonF + ", его средняя температура = " + Season.SUMMER.temperature);
        Main.iLove(Season.WINTER);
        for (Season season : Season.values()){
            System.out.println(season);
            System.out.println(season.temperature);
            System.out.println(season.getDescription());
        }
    }
    enum Season{
        SUMMER(20){
            public String getDescription() {
                return "Теплое время года";
            }
        },
        SPRING(5),
        WINTER(-5),
        AUTUMN(3);
        public int temperature;
        Season(int temperature){
            this.temperature = temperature;
        }
        public String getDescription() {
            return "Холодное время года";
        }
    }
    static Season seasonF = Season.SUMMER;
    public static void iLove(Season s){
        switch (s){
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case SPRING:
                System.out.println("Я люблю осень");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case AUTUMN:
                System.out.println("Я люблю весну");
                break;
        }
    }
}
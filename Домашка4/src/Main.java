public class Main {
    public static void best_time(Times time)
    {
        switch (time)
        {
            case winter:
                System.out.println("Холодно");
                break;
            case spring:
                System.out.println("Тает снег))");
                break;
            case summer:
                System.out.println("Я люблю лето");
                break;
            case autumn:
                System.out.println("Идут дожди");
        }
    }

    public enum Times {
        winter(-10,"Основной признак этого времени года — устойчивая низкая температура (ниже 0 градусов по Цельсию) во многих районах Земли, на поверхность земли выпадает и ложится снег."),
        spring(5, "Русское слово «весна» имеет древнюю индоевропейскую основу и сродни лит. vasarà «лето», латыш. pavasaris, др.-инд. vasantás «весна», vasar «рано»"),
        summer(25,"Если в северном полушарии лето, то в Южном полушарии — зима, и наоборот."),
        autumn(10,"Осень — переходный сезон, когда заметно уменьшение светового дня, и постепенно понижается температура окружающей среды.");
        private int temp;
        private String Description;
        Times(int temp, String Description){
            this.temp = temp;
            this.Description = Description;
        }
        public String getDescription(){ return Description;}
    }
    public static void main(String[] args)
    {
        Times favorite_time = Times.summer;
        best_time(favorite_time);
        Times.autumn.temp = 15;
        System.out.println(Times.autumn.temp);
        for (Times allTimes : Times.values())
        {
            System.out.println(allTimes + " " + allTimes.temp + " " + allTimes.Description );
        }
    }
}
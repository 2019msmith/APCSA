public class NBA extends BasketballSeason{
    public static void main(String args[]){
        int minutes = 48;
        BasketballSeason b1 = new BasketballSeason();
        System.out.println("The number of basketball games a single team plays in a season is: "+b1.season);
        System.out.println("The number of minutes in those 82 games combined is: "+b1.season*minutes);
    }
}
public class Rental {

   private Movie _movie;
   private int _daysRented;

   public Rental(Movie movie, int daysRented) {
      _movie = movie;
      _daysRented = daysRented;
   }

   public int getDaysRented() {
      return _daysRented;
   }

   public Movie getMovie() {
      return _movie;
   }
    public double getCharge(Rental aRental) {
      double thisAmount = 0;
 //determine amounts for each line
        switch (aRental.getMovie().getPriceCode()) {
           case Movie.REGULAR:
              thisAmount += 2;
              if (aRental.getDaysRented() > 2)
                 thisAmount += (aRental.getDaysRented() - 2) * 1.5;
              break;
           case Movie.NEW_RELEASE:
              thisAmount += aRental.getDaysRented() * 3;
              break;
           case Movie.CHILDRENS:
              thisAmount += 1.5;
              if (aRental.getDaysRented() > 3)
                 thisAmount += (aRental.getDaysRented() - 3) * 1.5;
               break;
        }
    return thisAmount;
   }
}
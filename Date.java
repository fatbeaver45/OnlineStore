public class Date {

        public Date(int month, int day, int year) {
                this.month = month;
                this.day = day;
                this.year = year;
        }

        private int month;
        private int day;
        private int year;
        // precondition: 
        //postcondition: returns the Month of the Date
        public int getMonth() {
                return month;
        }
        // precondition: 
        //postcondition: returns the Day of the date
        public int getDay() {
                return day;
        }
        // precondition: 
        //postcondition: returns year of Date
        public int getYear() {
                return year;
        }
        // precondition: 
        //postcondition: sets month as input
        public void setMonth(int month) {
                this.month = month;
        }
        //precondition: 
        //postcondition: sets day as input

        public void setDay(int day) {
                this.day = day;
        }
        //precondition:
        //postcondition: sets year as input
        public void setYear(int year) {
                this.year = year;
        }
        //precondition: all parts of the date have a valid value
        //postcondition: returns the date in MM/DD/YYYY format
        public String toString() {
                return Integer.toString(month) + "/" + Integer.toString(day) + "/" + Integer.toString(year);
        }
}

public class Date {

        public Date(int month, int day, int year) {
                this.month = month;
                this.day = day;
                this.year = year;
        }

        private int month;
        private int day;
        private int year;

        public int getMonth() {
                return month;
        }

        public int getDay() {
                return day;
        }

        public int getYear() {
                return year;
        }

        public void setMonth(int month) {
                this.month = month;
        }

        public void setDay(int day) {
                this.day = day;
        }

        public void setYear(int year) {
                this.year = year;
        }

        public String toString() {
                return Integer.toString(month) + "/" + Integer.toString(day) + "/" + Integer.toString(year);
        }
}

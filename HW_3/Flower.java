package HW_3;

    public class Flower {
        private String name;
        private int age;
        private String season;
        private String color;

        public Flower(String FlowerName, int FlowerAge,String FlowerSeason,String FlowerColor) {
            name = FlowerName;
            age = FlowerAge;
            season = FlowerSeason;
            color = FlowerColor;
        }
        public Flower(String FlowerName, int FlowerAge,String FlowerSeason) {
            name = FlowerName;
            age = FlowerAge;
            season = FlowerSeason;
            color = "Default Color";
        }
        public Flower(String FlowerName, int FlowerAge) {
            name = FlowerName;
            age = FlowerAge;
            season = "All Seasons";
            color = "Default Color";
        }
        public Flower(String FlowerName) {
            name = FlowerName;
            season = "All Seasons";
            color = "Default Color";
        }

        public Flower() {
            name = "Default FlowerName";
            season = "All Seasons";
            color = "Default Color";
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getSeason() {
            return season;
        }

        public void setSeason(String season) {
            this.season = season;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
        void print_flower(){
            System.out.println("My Flowers:");
            System.out.println("Name:"+getName());
            System.out.println("Season:"+getSeason());
            System.out.println("Age:"+getAge());
            System.out.println("Color:"+getColor());


        }
    }

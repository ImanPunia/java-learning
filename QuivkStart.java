class Marks{
    int earned;
    int minimumRequired;
    int total;
    float percentage;

    Marks(int earned, int mini, int total){
        this.earned = earned;
        minimumRequired = mini;
        this.total = total;
    }


    public Marks() {
    }

    public void totalMarks() {
        System.out.println(earned + minimumRequired + total);
    }

    public float calculatePercentage(){
        return (earned*100)/total;
    } 
}


class QuivkStart{

    public void sum() {
        int a = 10;
        int b= 19;
        int c = a+b;

        System.out.println("Summation is " + c);

    }

    public static void main(String[] args) {
        QuivkStart qs = new QuivkStart();
        qs.sum();

        Marks m1 = new Marks(40, 20, 100);
        m1.earned = 40;
        m1.minimumRequired = 20;
        m1.total = m1.earned ;
        System.out.println(m1.total);
        m1.totalMarks();

        //constructor is not visible , you've to create it
        Marks m2 = new Marks();
        m2.earned = 45;
        m2.total = 70;
        System.out.println(m2.calculatePercentage());
    }
}
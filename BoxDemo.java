class Box{
    double width;
    double height;
    double depth;

    // Method to calculate volume
    void vol(){
        System.out.println("Volume is");
        System.out.println(width*height*depth);
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        /*assigning variables to my box 1 */
        mybox1.width=10;
        mybox1.height=20;
        mybox1.depth=15;

        /*assigning variables to my box 2 */
        mybox2.width=3;
        mybox2.height=6;
        mybox2.depth=9;

        mybox1.vol();
        mybox2.vol();
    }
}
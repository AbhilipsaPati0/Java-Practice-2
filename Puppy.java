public class Puppy{
    int puppyAge;
    public Puppy(String name){
        //This conserter has ony one parameter,name.
        System.out.println("name choosen is:"+name);
    }
    public void setAge(int age){
        puppyAge=age;
    }
    public int getAge(){
        System.out.println("Puppy's age is :" + puppyAge);
        return puppyAge;
    }
    public static void main(String[] args){
        /*object creation */
        Puppy myPuppy= new Puppy("tommy");

        /*call class methods to set puppy's age */
        myPuppy.setAge(2);

        /*Call another class method to get puppy's age */
        myPuppy.getAge();

        /*You can access instance veriable as follows as well */
        System.out.println("Variable value:"+myPuppy.puppyAge);
    }
}
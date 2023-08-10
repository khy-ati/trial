interface inf1 {
    int a = 125;
    void display();
}
 
class test implements inf1 {
    public void display() { System.out.println("Test"); }
    public static void main(String[] args)
    {
        test t = new test();
        t.display();
        System.out.println(a);
    }
}
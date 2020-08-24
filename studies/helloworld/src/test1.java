public class test1 {
    public static void main(String[] args) {
        System.out.println("Hellow world abc");

        WORKER bob = new WORKER();
        bob.Name="bobwu";
        bob.Age=31;
        bob.doWork();

        WORKER wu = new WORKER("haha");
        wu.doWork();

        WORKER aa = new WORKER(100);
        aa.doWork();




    }
    protected void finalize()
    {
        // 在这里终结代码
        System.out.println("dispose:done");
    }
}

class WORKER{
    String Name;
    Integer Age;
    WORKER(){

    }
    WORKER(Integer a){
        Age=a;
    }
    WORKER(String n){
        Name=n;
    }
    void doWork(){
        System.out.println("Name:" + Name + " Age:" + Age);
    }
    void doWork(String type){

    }
    String what(){
        return "test";
    }
    protected void finalize()
    {
        // 在这里终结代码
        System.out.println("dispose:" + Name);
    }
}
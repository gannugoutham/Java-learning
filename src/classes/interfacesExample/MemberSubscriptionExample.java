package classes.interfacesExample;
interface Member {
    void subscription();
}
class Customer implements Member {
    public String name;
    Customer(String name){
        this.name=name;
    }
    public void subscription(){
        System.out.println("member is subscribed "+ name );
    }
}
class Store {
    Member[] arrayData = new Member[5];
    int count = 0;
    void register(Member m){
        arrayData[count++]=m;
    }
    void invitesale(){
        for(int i=0; i<5; i++){
            arrayData[i].subscription();
        }
    }
    void userData(){
        for(Member x: arrayData){
            System.out.println(x);
        }
    }

}
public class MemberSubscriptionExample {
    public static void main(String[] args){
        System.out.println("main method called");
        Store obj = new Store();
        Customer c1 = new Customer("Goutham");
        Customer c2 = new Customer("sandeep");
        c1.subscription();
        c2.subscription();
        obj.invitesale();
    }
}

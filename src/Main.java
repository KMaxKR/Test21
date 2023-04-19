import services.Service;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        service.addToLinkedHashMap(0, "A");
        service.addToLinkedHashMap(1, "B");
        service.addToLinkedHashMap(2, "C");
        service.addToLinkedHashMap(3, "D");
        service.addToLinkedHashMap(4, "E");

        service.transferValueToLinkedHashSet();

        service.transferKeysToLinkedList();
    }
}
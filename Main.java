public class Main {
    public static void main(String[] args) {
        StaticList list = new StaticList(5);

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("10, 20, 30 adicionados na lista");

        for (int i = 0; i < list.getSize(); i++) {
            System.out.println("Elemento na posição " + i + ": " + list.getData(i));
        }

        list.add(25, 1);
        System.out.println("Adicionou 25 na posição 1");

        for (int i = 0; i < list.getSize(); i++) {
            System.out.println("Elemento na posição " + i + ": " + list.getData(i));
        }

        int removed = list.remove(2);
        System.out.println("Elemento removido: " + removed);

        for (int i = 0; i < list.getSize(); i++) {
            System.out.println("Elemento na posição " + i + ": " + list.getData(i));
        }

        list.add(40);
        list.add(50);
        System.out.println("A lista está cheia? " + list.isFull());

        list.add(60);

        int position = list.find(40);
        if (position != -1) {
            System.out.println("Elemento 40 na posição: " + position);
        } else {
            System.out.println("Elemento 40 não encontrado.");
        }

        list.clear();
        System.out.println("Lista esvaziada");
        System.out.println("A lista está vazia? " + list.isEmpty());
    }
}

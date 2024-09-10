public class StaticList {
    private int[] data;
    private int size;
    private int count;

    public StaticList(int size) {
        this.size = size;
        this.data = new int[size];
        this.count = 0;
    }

    public void clear() {
        this.count = 0;
    }

    public void add(int data) {
        if (!isFull()) {
            this.data[count] = data;
            count++;
        } else {
            System.out.println("Lista cheia.");
        }
    }

    public void add(int data, int pos) {
        if (!isFull() && pos >= 0 && pos <= count) {
            for (int i = count; i > pos; i--) {
                this.data[i] = this.data[i - 1];
            }
            this.data[pos] = data;
            count++;
        } else {
            System.out.println("Não pode adicionar elementos na posição " + pos);
        }
    }

    public int remove(int pos) {
        if (pos >= 0 && pos < count) {
            int removedData = this.data[pos];
            for (int i = pos; i < count - 1; i++) {
                this.data[i] = this.data[i + 1];
            }
            count--;
            return removedData;
        } else {
            System.out.println("Posição inválida: " + pos);
            return -1;
        }
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }

    public void setData(int data, int pos) {
        if (pos >= 0 && pos < count) {
            this.data[pos] = data;
        } else {
            System.out.println("Posição inválida: " + pos);
        }
    }

    public int getData(int pos) {
        if (pos >= 0 && pos < count) {
            return this.data[pos];
        } else {
            System.out.println("Posição inválida: " + pos);
            return -1; // error value
        }
    }

    public int getSize() {
        return count;
    }

    public int find(int data) {
        for (int i = 0; i < count; i++) {
            if (this.data[i] == data) {
                return i;
            }
        }
        return -1;
    }
}
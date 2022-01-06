package geekbrain.com;

public  class Cat extends Animal{
    private final int MAX_RUN_LENGTH = 200;



    public Cat(String name, int run, int swim) {
        super(name);
    }

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) {
            System.out.println("Кот пробежал " + length);
        } else {
            System.out.println("Кот погиб");
        }
    }
    @Override
    void  swim(int lenght){
        if (lenght >=0) {
            System.out.println("Не умеет плавать");
        }
    }
}

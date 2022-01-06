package geekbrain.com;

public  class Dog extends Animal {
    private final int MAX_RUN_LENGTH = 500;
    private final int MAX_SWIM_LENGTH = 10;


    public Dog(String name, int run, int swim){
        super(name);
    }
    @Override
    void run(int lenght){
        if ((lenght >= 0) && (lenght <= MAX_RUN_LENGTH)) {
            System.out.println("Пёс пробежал " + lenght);
        }
            else System.out.println("Пёс погиб");
    }
    @Override
    void swim(int lenght){
        if ((lenght >= 0) && (lenght <= MAX_SWIM_LENGTH)) {
            System.out.println("Пёс проплыл " + lenght);
        }
        else System.out.println("Пёс утонул");
    }

}

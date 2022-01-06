package geekbrain.com;

abstract class Animal {
    private final int MAX_RUN_LENGTH = 0;
    private final int MAX_SWIM_LENGTH = 0;
    abstract void run(int length);
    abstract void swim(int length);
    protected String name;
    private static int count = 0;

    public static int getCount(){
        return Animal.count;
    }



    public Animal(String name){
        this.name = name;
        Animal.count++;
    }
    public void animalInfo() {
        System.out.println();
    }

}

package stack.queue.animal.shelter;

public class Cat implements Animal{
    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String getName(){
        return this.name;
    }
}

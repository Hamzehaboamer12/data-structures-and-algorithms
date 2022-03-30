package stack.queue.animal.shelter;

import stackandqueue.Queue;

public class AnimalShelter {

    Queue<Animal> CAT = new Queue<>();
    Queue<Animal> DOG = new Queue<>();

    public void enqueue(Animal animal){
        if(animal instanceof Dog){
            DOG.enqueue(animal);

        } else if (animal instanceof Cat){
            CAT.enqueue(animal);
        }
    }

    public Animal dequeue(String pref) throws Exception{

        if(pref.equals("Cat")){
            return CAT.dequeue();
        }else if(pref.equals("Dog")){
            return DOG.dequeue();
        }else {
            return null;
        }

    }

}

import java.util.*;
public class Animal {
        private String name;
        private boolean canWalk;
        private boolean canSwim;
        public Animal() {
            canWalk = false;
            canSwim = false;
            name = "";

        }
        public Animal(String name, boolean canWalk, boolean canSwim) {
            this.name = name;
            this.canWalk = canWalk;
            this.canSwim = canSwim;
        }

    public boolean isCanWalk() {
        return canWalk;
    }

    public void setCanWalk(boolean canWalk) {
        this.canWalk = canWalk;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(List<Animal> animal) {
            System.out.println("Swim");
            for (Animal a : animal) {
                if (a.canSwim) {
                    System.out.println(a.getName());

                }

            }
            System.out.println("Walk");
                for (Animal a : animal) {
                    if(a.canWalk) {
                        System.out.println(a.getName());
                }
        }
    }
}

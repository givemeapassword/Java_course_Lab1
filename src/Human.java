import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

class Human implements Characteristic {
    private static final Logger logger = Logger.getLogger(Human.class.getName());
    private static int length;
    private static int weight;
    private static int intelligence;
    private static int weight_accounting;
    private static int move_length;


    Human(int length, int weight, int intelligence){
        logger.info("Создание класса 'Человек' ");
        Human.length = length;
        Human.weight = weight;
        Human.intelligence = intelligence;
        Human.weight_accounting = setWeight(weight_accounting);

    }

    public void setLength(int length) {
        Human.length = length;
    }
    public int setWeight(int weight){


        if (weight > 70){
            return Human.weight_accounting = 1;

        }
        else {
            return Human.weight_accounting = 2;
        }
    }


    @Override
    public int move() {
        return 0;
    }

    @Override
    public int jump() {
        logger.info("запуск функции прыжка. 'Человек' ");
        try {
            return Human.move_length = (weight_accounting * weight * length)/length;
        }
        catch (NullPointerException e){
            System.out.println("Неправильность введенных данных");
        }
        assert move_length == 0 :"Длина движения равна 0. Это ненормально";
        return 0;
    }
}

import java.util.logging.Logger;

public class Mouse implements Characteristic, Nonhuman {
    private static final Logger logger = Logger.getLogger(Human.class.getName());


    private static int length;
    private static int weight;
    private static int intelligence;
    private static int weight_accounting;
    private static int move_length;

    Mouse(int length, int weight, int intelligence){
        logger.info("Создание класса 'Мышь' ");
        Mouse.length = length;
        Mouse.weight = weight;
        Mouse.intelligence = intelligence;
        Mouse.weight_accounting = setWeight(weight_accounting);

    }


    public int setWeight(int weight_accounting){

        if (Mouse.weight > 70){
            return Mouse.weight_accounting = boost_speed(Mouse.weight_accounting);

        }
        else {
            return Mouse.weight_accounting = boost_speed(Mouse.weight_accounting)+1;
        }
    }
    @Override
    public int move() {
        return 0;
    }

    @Override
    public int jump() {
        logger.info("запуск функции прыжка. 'Мышь' ");
        try {
            return Mouse.move_length = (weight_accounting * weight * length)/length;
        }
        catch (NullPointerException e){
            System.out.println("Неправильность введенных данных");
        }
        assert Mouse.move_length == 0 :"Длина движения равна 0. Это ненормально";
        return 0;
    }

    @Override
    public int boost_speed(int count) {
        return count*2;
    }

    @Override
    public int boost_agility() {
        return 0;
    }
}

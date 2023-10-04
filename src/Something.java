import java.util.logging.Logger;

public class Something implements Characteristic, Nonhuman{
    private static final Logger logger = Logger.getLogger(Human.class.getName());
    private static int length;
    private static int weight;
    private static int intelligence;
    private static int weight_accounting;
    private static int move_length;

    Something(int length, int weight, int intelligence){
        logger.info("Создание класса 'Нечто' ");
        Something.length = length;
        Something.weight = weight;
        Something.intelligence = intelligence;
        Something.weight_accounting = setWeight(weight_accounting);

    }


    public int setWeight(int weight_accounting){

        if (Something.weight > 70){
            return Something.weight_accounting = boost_speed(Something.weight_accounting);

        }
        else {
            return Something.weight_accounting = boost_speed(Something.weight_accounting)+20;
        }
    }
    @Override
    public int move() {
        return 0;
    }

    @Override
    public int jump() {
        logger.info("запуск функции прыжка. 'Нечто' ");
        try {
            return Something.move_length = (weight_accounting * weight * length)/length;
        }
        catch (NullPointerException e){
            logger.warning("Ошибка деления на ноль");
            System.out.println("Неправильность введенных данных");
        }
        assert Something.move_length == 0 :"Длина движения равна 0. Это ненормально";
        return 0;

    }

    @Override
    public int boost_speed(int count) {
        return count*10;
    }

    @Override
    public int boost_agility() {
        return 0;
    }
}

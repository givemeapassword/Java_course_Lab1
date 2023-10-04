import java.util.logging.Logger;

public class Robot implements Nonhuman,Characteristic {
    private static final Logger logger = Logger.getLogger(Human.class.getName());
    private static int length;
    private static int weight;
    private static int intelligence;
    private static int weight_accounting;
    private static int move_length;

    Robot(int length, int weight, int intelligence){
        logger.info("Создание класса 'Робот' ");
        Robot.length = length;
        Robot.weight = weight;
        Robot.intelligence = intelligence;
        Robot.weight_accounting = setWeight(weight_accounting);

    }


    public int setWeight(int weight_accounting){

        if (Robot.weight > 70){
            return Robot.weight_accounting = boost_speed(Robot.weight_accounting);

        }
        else {
            return Robot.weight_accounting = boost_speed(Robot.weight_accounting)-1;
        }
    }
    @Override
    public int move() {
        return 0;
    }

    @Override
    public int jump() {
        logger.info("запуск функции прыжка. 'Робот' ");
        try {
            return Robot.move_length = (weight_accounting * weight * length)/length;
        }
        catch (NullPointerException e){
            System.out.println("Неправильность введенных данных");
        }
        assert Robot.move_length == 0 :"Длина движения равна 0. Это ненормально";
        return 0;
    }

    @Override
    public int boost_speed(int count) {
        return count/2;
    }

    @Override
    public int boost_agility() {
        return 0;
    }
}

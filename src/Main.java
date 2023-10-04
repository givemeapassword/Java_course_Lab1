
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final Logger logger = Logger.getLogger(Human.class.getName());


    public static void main(String[] args) throws IOException {
        logger.info("Запуск программы");

        int Race;
        int randomInt;

        FileHandler fileHandler = new FileHandler("logs.log");
        // Настройка форматтера для записи логов в простом текстовом формате
        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);
        // Добавление обработчика файлового логгера
        logger.addHandler(fileHandler);



        //Ввод данных игрока
        Scanner in = new Scanner(System.in);
        System.out.println("\nВы очнулись после амнезии.Кто вы?");
        System.out.println("Человек?(1)/Мышь?(2)/Робот?(3):");

        try {
            String str = in.nextLine();
            Race = Integer.parseInt(str);
            in.close();
        }
        catch (NumberFormatException e){
            logger.warning("Ошибка NumberFormatException.");
            logger.info("Рандомный выбор расы");
            System.out.println("Определись с собой...");
            randomInt = new Random().nextInt(1,3);
            System.out.println("Если не хочешь,то могу взять на себя эту ответственность");
            Race = randomInt;
        }
        finally {
            System.out.print("Вот определились...");
        }



        //Выбор особенности расы
        switch (Race){
            case 1:
                System.out.println("Вы теперь Человек...");
                Human human = new Human(150, 70, 5);
                System.out.println("Вы проходите по бесчисленному лесу и видите стену. Хотите ее перепрыгнутью\nВысота равна 20м. Проверим - получится ли у вас");
                System.out.println(human.jump());
                if (human.move() > 20) {
                    System.out.println("Отлично, вы можете двигаться дальше");
                } else {
                    System.out.println("Все пплохо, вы не можете двигаться дальше");
                }
                break;
            case 2:
                System.out.println("Вы теперь Мышь...");
                Mouse mouse = new Mouse(10,10,1);
                System.out.println("Вы проползаете по бесчисленным лианам, проходящим вокруг, и видите стену. Хотите ее перепрыгнуть.\nВысота равна 20м. Проверим - получится ли у вас");
                System.out.println(mouse.jump());
                if (mouse.jump() > 20) {
                    System.out.println("Удивительное сочетание ловкости и маленькости помогли вам.Отлично, вы можете двигаться дальше");
                } else {
                    System.out.println("Даже с природным преимуществом ничего не вышло. Все пплохо, вы не можете двигаться дальше");
                }
                break;
            case 3:
                System.out.println("Вы теперь Робот...");
                Robot robot = new Robot(150,100,10);
                System.out.println("Вы, скрипя всеми своими гайками, медленно идете по тропе и видите впереди стену. Хотите ее перепрыгнуть.\nВысота равна 20м. Проверим - получится ли у вас");
                System.out.println(robot.jump());
                if (robot.jump() > 20) {
                    System.out.println("Удивительно, ведь несмотря на всю вашу ржавчиность и неповоротливость у вас все получилось.Отлично, вы можете двигаться дальше");
                } else {
                    System.out.println("Ничего страшного,железяка, даже роботы бы тебя не осудили. Все пплохо, вы не можете двигаться дальше");
                }
                break;
            default:
                Something something = new Something(100,20,100);
                System.out.println("Эммм...Ты кто???");
                System.out.println("Вы...ты...что-то...Всей своей массой перекатываешься от одного дерева до другого и видишь(а ты можешь видить?) перед собой стену. " +
                        "Хотите ее перепрыгнуть.\nВысота равна 20м. Проверим - получится ли у вас");
                System.out.println(something.jump());
                if (something.jump() > 20) {
                    System.out.println("Ничего удивительного...вы просто бесформенная форма жизни. Отлично, вы можете двигаться дальше");
                } else {
                    System.out.println("Стена остановила полное уничтожение нашего мира. Все пплохо, вы не можете двигаться дальше");
                }
                break;
        }

    }
}
package Task2;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        // исправьте код так, что бы на экран выводилось что-то вроде.
        Action jump = ()-> ActiveCat.jump();
        Action sleep = ()-> ActiveCat.sleep();
        Action eat = ()-> ActiveCat.eat();
        // Я Misty. Я прыгаю!
        // Я Tibbles. Я сплю!
        // Я Ginger. Я кушаю!
        // для решения примените лямбда-выражения, 
        
        // каждый кот должен уметь выполнять что-то своё
        var cats = new ArrayList<ActiveCat>();
        cats.add(new ActiveCat(jump));
        cats.add(new ActiveCat(sleep));
        cats.add(new ActiveCat(eat));
        // добавьте ещё два-три кота, с совершенно другими действиями

        cats.forEach(ActiveCat::doAction);
    }


}

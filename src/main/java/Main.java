import ru.netology.javaqa.RestCalcmvn.services.RestCalcService;

public class Main {
    public static void main(String[] args) {
        RestCalcService service = new RestCalcService();
        System.out.println("Количество месяцев отдыха равно " + service.restCalc(10_000, 60_000, 150_000) + " месяца (-ев)");
    }
}
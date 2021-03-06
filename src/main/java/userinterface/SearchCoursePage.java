package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target UC_BUTTON = Target.the("Selecciona cursos y certificaciones")
            .located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section[1]/div[2]/aside/section[1]/div/div/div[1]/center/div/div/div/div[2]/div[1]/a"));
    public static final Target INPUT_COURSE = Target.the("Buscar el curso")
            .located(By.id("coursesearchbox"));
    public static final Target GO_BUTTON = Target.the("Da click para buscar el curso")
            .located(By.xpath("/html/body/div[1]/div[2]/div/div/div/section/div[2]/form/fieldset/button"));
    public static final Target SELECT_COURSE = Target.the("Extrae el nombre del curso")
            .located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div/div/div[1]/h4/a"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso")
            .located(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/section/div/div[1]/div/div[1]/h3/a"));
}

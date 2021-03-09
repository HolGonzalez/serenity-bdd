package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target UC_BUTTON = Target.the("Selecciona la universidad choucair")
            .located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section[1]/div[2]/aside/section[1]/div/div/div[1]/center/div/div/div/div[1]/div[1]/a/h4"));
    public static final Target INPUT_COURSE = Target.the("Buscar el curso")
            .located(By.id("coursesearchbox"));
    public static final Target GO_BUTTON = Target.the("Da click para buscar el curso")
            .located(By.xpath("//button[@class='btn btn-secundary']"));
    public static final Target SELECT_COURSE = Target.the("Da click para buscar el curso")
            .located(By.xpath("//h4[contains(text(),'Recursos Automatización Bancolombia')]"));
}

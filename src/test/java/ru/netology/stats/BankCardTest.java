package ru.netology.stats;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.ExactText;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;

class BankCardTest {
    @BeforeEach
    void setUp(){
        open("http://localhost:9999/");
    }
     @Test
     void shouldTest() {

         SelenideElement form = $("[class]");
         form.$("[data-test-id=name] input").setValue("Мойва Лох");
         form.$("[data-test-id=phone] input").setValue("+79251111111");
         form.$("[data-test-id=agreement]").click();
         form.$("button").click();
         $("[data-test-id=order-success]").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));





     }
 }
//package tests;
//
//import com.codeborne.selenide.Configuration;
//import driver.BrowserstackMobileDriver;
//import io.appium.java_client.MobileBy;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Tag;
//import org.junit.jupiter.api.Test;
//
//import java.net.MalformedURLException;
//
//import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
//import static com.codeborne.selenide.Selenide.*;
//import static io.qameta.allure.Allure.step;
//
//@Disabled
//public class AndroidSelenideTests extends TestBase {
//    @Test
//    @DisplayName("Successful search in wikipedia android app")
//    void searchTest() {
//
//        step("Type search", () -> {
//            $(MobileBy.AccessibilityId("Search Wikipedia")).click();
//            $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).val("BrowserStack");
//
//        });
//        step("Verify content found", () ->
//            $$(MobileBy.id("org.wikipedia.alpha:id/page_list_item_container")).shouldHave(sizeGreaterThan(0)));
//
//}
//}
package com.goodline.homework;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest {
    @Test
    public void userCanLogin() {
        open("https://goodworkfor.life/login");
        $("#email").sendKeys("guest@example.com");
        $("#password").sendKeys("guestpass");
        $("#app > div.md\\:bg-white.container.md\\:mx-4.md\\:mx-auto.md\\:shadow-lg.rounded.md\\:mt-32.flex.md\\:flex-row.flex-col.md\\:max-w-2xl.lg\\:max-w-4xl.justify-between > div.w-full.md\\:bg-indigo-100.md\\:w-1\\/2.p-8 > form > p:nth-child(5) > button").click();
        $("#profile-dropdown > span").shouldHave(Condition.text("Andy"));
 }
    @Test
    public void CantLoginWrongEmail(){
    open("https://goodworkfor.life/login");
    $("#email").sendKeys("Victor@example.com");
    $("#password").sendKeys("guestpass");
    $("#app > div.md\\:bg-white.container.md\\:mx-4.md\\:mx-auto.md\\:shadow-lg.rounded.md\\:mt-32.flex.md\\:flex-row.flex-col.md\\:max-w-2xl.lg\\:max-w-4xl.justify-between > div.w-full.md\\:bg-indigo-100.md\\:w-1\\/2.p-8 > form >  p:nth-child(5) > button").click();
    $("#email").shouldHave(Condition.text(""));
    $("#password").shouldHave(Condition.text(""));
    $("#app > div.md\\:bg-white.container.md\\:mx-4.md\\:mx-auto.md\\:shadow-lg.rounded.md\\:mt-32.flex.md\\:flex-row.flex-col.md\\:max-w-2xl.lg\\:max-w-4xl.justify-between > div.w-full.md\\:bg-indigo-100.md\\:w-1\\/2.p-8 > form > p:nth-child(2) > span").shouldHave(Condition.text("These credentials do not match our records."));
    }
    @Test
    public void CantLoginWrongPass(){
        open("https://goodworkfor.life/login");
        $("#email").sendKeys("guest@example.com");
        $("#password").sendKeys("privet");
        $("#app > div.md\\:bg-white.container.md\\:mx-4.md\\:mx-auto.md\\:shadow-lg.rounded.md\\:mt-32.flex.md\\:flex-row.flex-col.md\\:max-w-2xl.lg\\:max-w-4xl.justify-between > div.w-full.md\\:bg-indigo-100.md\\:w-1\\/2.p-8 > form >  p:nth-child(5) > button").click();
        $("#email").shouldHave(Condition.text(""));
        $("#password").shouldHave(Condition.text(""));
        $("#app > div.md\\:bg-white.container.md\\:mx-4.md\\:mx-auto.md\\:shadow-lg.rounded.md\\:mt-32.flex.md\\:flex-row.flex-col.md\\:max-w-2xl.lg\\:max-w-4xl.justify-between > div.w-full.md\\:bg-indigo-100.md\\:w-1\\/2.p-8 > form > p:nth-child(2) > span").shouldHave(Condition.text("These credentials do not match our records."));
    }
   @Test
   public void PressLogin(){
        open("https://goodworkfor.life/login");
        $("#app > div.md\\:bg-white.container.md\\:mx-4.md\\:mx-auto.md\\:shadow-lg.rounded.md\\:mt-32.flex.md\\:flex-row.flex-col.md\\:max-w-2xl.lg\\:max-w-4xl.justify-between > div.w-full.md\\:bg-indigo-100.md\\:w-1\\/2.p-8 > form >  p:nth-child(5) > button").click();
    $("#app > div.md\\:bg-white.container.md\\:mx-4.md\\:mx-auto.md\\:shadow-lg.rounded.md\\:mt-32.flex.md\\:flex-row.flex-col.md\\:max-w-2xl.lg\\:max-w-4xl.justify-between > div.w-full.md\\:bg-indigo-100.md\\:w-1\\/2.p-8 > form > p:nth-child(2) > span").shouldHave(Condition.text("The email field is required."));
    }
    @Test
    public void UserForgotPass()
    {
        open("https://goodworkfor.life/login");
        $("#app > div.md\\:bg-white.container.md\\:mx-4.md\\:mx-auto.md\\:shadow-lg.rounded.md\\:mt-32.flex.md\\:flex-row.flex-col.md\\:max-w-2xl.lg\\:max-w-4xl.justify-between > div.w-full.md\\:bg-indigo-100.md\\:w-1\\/2.p-8 > form > a").click();
        $("#app > div.md\\:bg-white.container.md\\:mx-4.md\\:mx-auto.md\\:shadow-lg.rounded.md\\:mt-32.flex.md\\:flex-row.flex-col.md\\:max-w-2xl.lg\\:max-w-4xl.justify-between > div.w-full.md\\:bg-indigo-100.md\\:w-1\\/2.p-8 > p").shouldHave(Condition.text("Forgot your account’s password or having trouble logging into your account? Enter your email address and we’ll send you a recovery link."));
    }
}

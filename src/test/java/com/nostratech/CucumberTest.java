package com.nostratech;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "classpath:com/nostratech", glue = {
"com.nostratech" })
public class CucumberTest extends AbstractTestNGCucumberTests {

}
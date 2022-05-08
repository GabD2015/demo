package cbt;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"pretty", "html:target/cucumber.html" ,
                "rerun:target/rerun.txt" ,  // store the failed scenario into rerun.txt
                "me.jvt.cucumber.report.PrettyReports:target"  // fancy report
        } ,



//        plugin = {
//                "json:target/cucumber.json",
//                "html:target/cucumber/report.html",
//                "junit:target/junit/junit-report.xml",
//                "rerun:target/rerun.txt",},
        features = "src/test/resources/cbt",
        publish = true
)
public class CukesRunner {}
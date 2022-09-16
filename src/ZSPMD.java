import net.sourceforge.pmd.*;

import java.util.ArrayList;

public class ZSPMD {
    public static void main(String[] args) {
        PMDConfiguration pmdConfiguration = new PMDConfiguration();
        ArrayList<String> ruleSets = new ArrayList<>();
        ruleSets.add("category/java/codestyle.xml/FieldNamingConventions");
        ruleSets.add("category/java/codestyle.xml/ClassNamingConventions");

        pmdConfiguration.setRuleSets(ruleSets);
//        pmdConfiguration.
        ArrayList<String> inputPaths = new ArrayList<>();
        inputPaths.add("/Users/roohi-3297/Documents/Sample.java");
        pmdConfiguration.setInputPaths(inputPaths);
        pmdConfiguration.setReportFormat("textcolor");

        PMD.runPmd(pmdConfiguration);
    }
}

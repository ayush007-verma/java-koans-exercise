package beginner;

import com.sandwich.koan.Koan;

import static com.sandwich.util.Assert.fail;

public class AboutKoans {

    @Koan
    public void findAboutKoansFile() {
        // commenting the line where fail function is called so that assertion does n't fail.
        // fail("delete this line to advance");
    }

    @Koan
    public void definitionOfKoanCompletion() {
        // changing value of koanIsComplete to true...
        boolean koanIsComplete = true;
        if (!koanIsComplete) {
            fail("what if koanIsComplete variable was true?");
        }
    }

}

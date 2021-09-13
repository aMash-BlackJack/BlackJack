import com.amash.CardGenerationServlet.CardGenerationServletApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class TestUploadCase {
    @Test
    @DisplayName(" REMOVE ME AFTER INITIAL SETUP -- A simple test to test jacoco is reporting test coverage and generating files, the build uploads via github actions and passes / fails the quality gates")
    void TestUpload(){
    assertEquals(CardGenerationServletApplication.placeholder(), "Test", "This test failed");
    }
}

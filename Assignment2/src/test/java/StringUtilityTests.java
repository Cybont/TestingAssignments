import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilityTests {
    @Test
    public void ShouldReverseString()
    {
        // Arrange
        StringUtility strUtil = new StringUtility();
        String input = "aBc";
        // Act
        String result = strUtil.Reverse(input);
        // Assert
        assertEquals("cBa", result);
    }

    @Test
    public void ShouldCapitalizeString()
    {
        // Arrange
        StringUtility strUtil = new StringUtility();
        String input = "aBc";
        // Act
        String result = strUtil.Capitalize(input);
        // Assert
        assertEquals("ABC", result);
    }

    @Test
    public void ShouldMakeCharactersInStringLowercase()
    {
        // Arrange
        StringUtility strUtil = new StringUtility();
        String input = "aBc";
        // Act
        String result = strUtil.ToLower(input);
        // Assert
        assertEquals("abc", result);
    }
}

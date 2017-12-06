 package com.github.infi0209;

    import org.junit.Assert;
    import org.junit.Test;

public class testttttTest {
    @Test
    public void getType() throws Exception {
        // Arrange
        testtttt Testtttt = new testtttt(5, 10, 5);

        // Act
        String result = Testtttt.getType();

        // Assert
        Assert.assertEquals("不是三角形", result);
    }

}

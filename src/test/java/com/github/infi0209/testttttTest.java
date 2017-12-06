 package com.github.infi0209;

    import org.junit.Assert;
    import org.junit.Test;

public class testttttTest {
    @Test
    public void getType() throws Exception {
        // Arrange
        Testtttt testtttt = new Testtttt(5, 10, 5);

        // Act
        String result = testtttt.getType();

        // Assert
        Assert.assertEquals("不是三角形", result);
    }

}

package DiceScoreTest;

import org.example.diceScore.DiceScore;
import org.example.diceScore.Ide;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.Mockito;

public class DiceScoreTest {



    private DiceScore diceScore;

    // on utilise mockito pour mocker l'interface de Ide.class
    private Ide de = Mockito.mock(Ide.class);

    @Test
    @DisplayName("lorsque les 2 dés sont identiques on recupere bien valeur du dé * 2 + 10")
    public void when_both_dice_are_equal_return_double_value_plus_10() {

        // Arrange
        int expected = 14;
        de = Mockito.mock(Ide.class);
        diceScore = new DiceScore(de);
        Mockito.when(de.getRoll()).thenReturn(2);

        // Act
        int result = diceScore.getScore();

        // Assert
        Assert.assertEquals(expected, result);
    }


    @Test
    @DisplayName("dans le cas ou les 2 dés sont identiques on recupere 30")
    public void when_blablabla() {

        //arrange
        int expected = 30;
        de = Mockito.mock(Ide.class);
        diceScore = new DiceScore(de);
        Mockito.when(de.getRoll()).thenReturn(6);

        // act
        int result = diceScore.getScore();

        // assert
        Assert.assertEquals(expected, result);

    }

    @Test
    @DisplayName("dans le cas ou les dé sont quelconque on recupere la valeure du plus haut des 2")
    public void when_blablablabla() {

        //arrange
        int expected = 5;
        de = Mockito.mock(Ide.class);
        diceScore = new DiceScore(de);
        Mockito.when(de.getRoll()).thenReturn(4);

        // act
        int result = diceScore.getScore();

        // assert
        Assert.assertEquals(expected, result);

    }
}

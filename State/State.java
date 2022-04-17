package State;
/**
 * @author Abhinav Myadala
 * State is interface which get implemented by EnglishState, FrenchState, and Spanish.
 */
public interface State{
    public void pressStarButton();
    public void pressHappyButton();
    public void pressEnglishButton();
    public void pressFrenchButton();
    public void pressSpanishButton();
}
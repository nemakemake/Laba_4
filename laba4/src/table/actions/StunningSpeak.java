package src.table.actions;

import src.objects.Action;
import src.objects.Person;

public class StunningSpeak extends Action {
    Saying say = new Saying();
    Stunned stunned = new Stunned();
    public StunningSpeak(){}
    public void stunningSpeak (Person p1, Person p2){
        say.say(p1, "Погулять! А фета?");
        stunned.stunned(p2, "как дети учатся говорить... как иностранцы?");
    }
}

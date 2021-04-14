package sia.knights;

public class BraveKnight implements Knight {
  private Quest quest;
  public BraveKnight(Quest quest){
    this.quest = quest;
  }
  @Override
  public void embarkQuest(){
    quest.content();
  }
}

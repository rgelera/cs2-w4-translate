class ScotchTape {
  String colour;
  int weight;
  int length;

  public ScotchTape(String newColour, int newWeight, int newLength) {
    colour = newColour;
    weight = newWeight;
    length = newLength;
  }

  public static void printTapeArray(ScotchTape tapeArray[], int length) {
    for (int i=0; i<length; i++) {
      System.out.println(tapeArray[i].colour + " (" + tapeArray[i].length + " cm, " + tapeArray[i].weight + " oz)");
    }
  }

  public static void stickTape(ScotchTape tape, float percentToUse) {
    tape.weight -= tape.weight * percentToUse;
    tape.length -= tape.length * percentToUse;
  }

  public static void main(String[] args) {
    final int NUM_TAPES = 3;
    ScotchTape[] tapes = {
      new ScotchTape("clear", 3, 22),
      new ScotchTape("green", 1, 15),
      new ScotchTape("blue", 2, 19)
    };

    printTapeArray(tapes, NUM_TAPES);

    stickTape(tapes[0], 0.5f);
    stickTape(tapes[1], 0.3f);
    stickTape(tapes[2], 0.9f);

    System.out.println("");
    printTapeArray(tapes, NUM_TAPES);
  }
}

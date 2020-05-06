boolean allEqual(int a, int b, int c){
  if(a == b && b == c) {
    return true;
  }
  return false;
}

boolean allDifferent(int a, int b, int c){
  if(a != b && b != c && a != c) {
    return true;
  }
  return false;
}

boolean sameColor(Card a, Card b, Card c) {
  int[] colors = {0,0,0,1,1,1,2,2,2};
  return allEqual(colors[a.getCol()], colors[b.getCol()], colors[c.getCol()]);
}

boolean sameShape(Card a, Card b, Card c) {
  int[] shapes = {0,1,2,0,1,2,0,1,2};
  return allEqual(shapes[a.getCol()], shapes[b.getCol()], shapes[c.getCol()]);
}

boolean sameFill(Card a, Card b, Card c) {
  int[] fills = {0,0,0,1,1,1,2,2,2};
  return allEqual(fills[a.getRow()], fills[b.getRow()], fills[c.getRow()]);
}

boolean sameCount(Card a, Card b, Card c) {
  int[] counts = {1,2,3,1,2,3,1,2,3};
  return allEqual(counts[a.getRow()], counts[b.getRow()], counts[c.getRow()]);
}

boolean diffColor(Card a, Card b, Card c) {
  int[] colors = {0,0,0,1,1,1,2,2,2};
  return allDifferent(colors[a.getCol()], colors[b.getCol()], colors[c.getCol()]);
}

boolean diffShape(Card a, Card b, Card c) {
  int[] shapes = {0,1,2,0,1,2,0,1,2};
  return allDifferent(shapes[a.getCol()], shapes[b.getCol()], shapes[c.getCol()]);
}

boolean diffFill(Card a, Card b, Card c) {
  int[] fills = {0,0,0,1,1,1,2,2,2};
  return allDifferent(fills[a.getRow()], fills[b.getRow()], fills[c.getRow()]);
}

boolean diffCount(Card a, Card b, Card c) {
  int[] counts = {1,2,3,1,2,3,1,2,3};
  return allDifferent(counts[a.getRow()], counts[b.getRow()], counts[c.getRow()]);
}  

boolean isSet(Card a, Card b, Card c) {
    if((sameCount(a, b, c) || diffCount(a, b, c)) &&
       (sameShape(a, b, c) || diffShape(a, b, c)) &&
       (sameFill(a, b, c) || diffFill(a, b, c)) &&
       (sameColor(a, b, c) || diffColor(a, b, c))){
          return true;
    }
    return false;
}

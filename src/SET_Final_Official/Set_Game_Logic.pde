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
  if(Math.abs(a.getCol() - b.getCol()) <= 2 && Math.abs(b.getCol() - c.getCol()) <= 2){
    return true;
  }
  return false;
}

boolean sameShape(Card a, Card b, Card c) {
  if(a.getCol() == b.getCol() % 3 && b.getCol() % 3 == c.getCol() % 3){
    return true;
  }
  return false;
}

boolean sameFill(Card a, Card b, Card c) {
  if(Math.abs(a.getRow() - b.getRow()) <= 2 && Math.abs(b.getRow() - c.getRow()) <= 2){
    return true;
  }
  return false;
}

boolean sameCount(Card a, Card b, Card c) {
  if(a.getRow() == b.getRow() % 3 && b.getRow() % 3 == c.getRow() % 3) {
    return true;
  }
  return false;
}

boolean diffColor(Card a, Card b, Card c) {
  if(Math.abs(a.getCol() - b.getCol()) > 2 && Math.abs(a.getCol() - b.getCol()) > 2){
    return true;
  }
  return false;
}

boolean diffShape(Card a, Card b, Card c) {
  if(a.getCol() != b.getCol() % 3 && a.getCol() != c.getCol() % 3){
    return true;
  }
  return false;
}

boolean diffFill(Card a, Card b, Card c) {
  if(Math.abs(a.getRow() - b.getRow()) > 2 && Math.abs(a.getRow() - c.getRow()) > 2) {
    return true;
  }
  return false;
}

boolean diffCount(Card a, Card b, Card c) {
  if(a.getRow() != b.getRow() % 3 && a.getRow() != b.getRow()){
    return true;
  }
  return false;
}  

boolean isSet(Card a, Card b, Card c) {
  if(sameCount(a, b, c) || diffCount(a, b, c)){
    return true;
  } else if(sameShape(a, b, c) || diffShape(a, b, c)){
    return true;
  } else if (sameFill(a, b, c) || diffFill(a, b, c)){
    return true;
  } else if (sameColor(a, b, c) || diffColor(a, b, c)){
    return true;
  }
  return false;
}

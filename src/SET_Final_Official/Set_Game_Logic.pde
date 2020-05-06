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
  if(a.getCol() <= 2 && b.getCol() <= 2 && c.getCol() <= 2){ return true; }
  if((a.getCol() > 2 && a.getCol() <= 5) && (b.getCol() > 2 && b.getCol() <= 5) && (c.getCol() > 2 && c.getCol() <= 5)){ return true; }
  if((a.getCol() > 5 && a.getCol() <= 8) && (b.getCol() > 5 && b.getCol() <= 8) && (c.getCol() > 5 && c.getCol() <= 8)){ return true; }
  return false;
}

boolean sameShape(Card a, Card b, Card c) {
  if(a.getCol() == b.getCol() % 3 && b.getCol() % 3 == c.getCol() % 3){
    return true;
  }
  return false;
}

boolean sameFill(Card a, Card b, Card c) {
  if(a.getRow() <= 2 && b.getRow() <= 2 && c.getRow() <= 2){ return true; }
  if((a.getRow() > 2 && a.getRow() <= 5) && (b.getRow() > 2 && b.getRow() <= 5) && (c.getRow() > 2 && c.getRow() <= 5)){ return true; }
  if((a.getRow() > 5 && a.getRow() <= 8) && (b.getRow() > 5 && b.getRow() <= 8) && (c.getRow() > 5 && c.getRow() <= 8)){ return true; }
  return false;
}

boolean sameCount(Card a, Card b, Card c) {
  if(a.getRow() == b.getRow() % 3 && b.getRow() % 3 == c.getRow() % 3) {
    return true;
  }
  return false;
}

boolean diffColor(Card a, Card b, Card c) {
  if(a.getCol() <= 2 && (b.getCol() > 2 && b.getCol() <= 5) && (c.getCol() > 5 && c.getCol() <= 8)){ return true; }
  if(b.getCol() <= 2 && (b.getCol() > 2 && a.getCol() <= 5) && (c.getCol() > 5 && b.getCol() <= 8)){ return true; }
  if(c.getCol() <= 2 && (b.getCol() > 2 && a.getCol() <= 5) && (c.getCol() > 5 && b.getCol() <= 8)){ return true; }
  return false;
}

boolean diffShape(Card a, Card b, Card c) {
  if(a.getCol() != b.getCol() % 3 && a.getCol() != c.getCol() % 3){
    return true;
  }
  return false;
}

boolean diffFill(Card a, Card b, Card c) {
  if(a.getRow() <= 2 && (b.getRow() > 2 && b.getRow() <= 5) && (c.getRow() > 5 && c.getRow() <= 8)){ return true; }
  if(b.getRow() <= 2 && (b.getRow() > 2 && a.getRow() <= 5) && (c.getRow() > 5 && b.getRow() <= 8)){ return true; }
  if(c.getRow() <= 2 && (b.getRow() > 2 && a.getRow() <= 5) && (c.getRow() > 5 && b.getRow() <= 8)){ return true; }
  return false;
}

boolean diffCount(Card a, Card b, Card c) {
  if(a.getRow() != b.getRow() % 3 && a.getRow() != c.getRow()){
    return true;
  }
  return false;
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

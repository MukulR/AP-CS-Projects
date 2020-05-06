public boolean between(double a, double low, double high) {
  return (a >= low) && (a <= high);
}

public boolean notInSet(int col, int row, ArrayList<Location> selectedLocs){
  for(int i = 0; i < 3; i++){
    if(selectedLocs.get(i).getCol() == col && selectedLocs.get(i).getRow() == row){
      return false;
    }
  }
  return true;
}

package sweeper;

class Flag {
    private Matrix flagMap;
    private int countOfClosedBoxes;

    void start () {
        flagMap = new Matrix(Box.CLOSED);
        countOfClosedBoxes = Ranges.getSize().x * Ranges.getSize().y ;
    }

    Box get (Coord coord) {
        return flagMap.get(coord);
    }



    void toggledFlagedToBox(Coord coord) {
        switch (flagMap.get(coord)) {
            case FLAGED: setClosedToBox(coord); break;
            case CLOSED: setFlagedToBox(coord); break;
        }
    }

    void setClosedToBox(Coord coord) {
        flagMap.set(coord, Box.CLOSED);
    }

    void setOpenedToBox(Coord coord) {
        flagMap.set(coord, Box.OPENED);
        countOfClosedBoxes--;
    }

    void setFlagedToBox(Coord coord) {
        flagMap.set(coord, Box.FLAGED);
    }

    int getCountOfClosedBoxes() {
        return countOfClosedBoxes;
    }
}

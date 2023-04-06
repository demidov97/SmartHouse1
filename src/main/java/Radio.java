 public class Radio {
        private int numberStation;
        private int volume;

        public void next() {
            if (numberStation != 9) {
                numberStation++;
            } else {
                numberStation = 0;
            }
        }

        public void prev() {
            if (numberStation != 0) {
                numberStation--;
            } else {
                numberStation = 9;
            }
        }

        public void increaseVolume() {
            if (volume < 100) {
                volume++;
            } else {
                return;
            }
        }

        public void decreaseVolume() {
            if (volume > 0) {
                volume--;
            } else {
                return;
            }
        }

        public int getNumberStation() {
            return numberStation;
        }

        public void setNumberStation(int numberStation) {
            if (numberStation < 0) {
                return;
            }
            if (numberStation > 9) {
                return;
            }
            this.numberStation = numberStation;
        }

        public int getVolume() {
            return volume;
        }

        public void setVolume(int volume) {
            if (volume < 0) {
                return;
            }
            if (volume > 100) {
                return;
            }
            this.volume = volume;
        }
    }


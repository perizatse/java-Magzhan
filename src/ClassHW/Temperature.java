package ClassHW;
    // Task 9.4
    public class Temperature {
        private double value;
        private char scale;

        // Конструкторы
        public Temperature() {
            this.value = 0.0;
            this.scale = 'C';
        }

        public Temperature(double value) {
            this.value = value;
            this.scale = 'C';
        }

        public Temperature(char scale) {
            this.value = 0.0;
            if (scale == 'C' || scale == 'F') {
                this.scale = scale;
            } else {
                throw new IllegalArgumentException("Недопустимая шкала. Используйте 'C' или 'F'.");
            }
        }

        public Temperature(double value, char scale) {
            this.value = value;
            if (scale == 'C' || scale == 'F') {
                this.scale = scale;
            } else {
                throw new IllegalArgumentException("Недопустимая шкала. Используйте 'C' или 'F'.");
            }
        }

        // Методы-аксессоры
        public double getValue() {
            return value;
        }

        public void setValue(double value) {
            this.value = value;
        }

        public char getScale() {
            return scale;
        }

        public void setScale(char scale) {
            if (scale == 'C' || scale == 'F') {
                this.scale = scale;
            } else {
                throw new IllegalArgumentException("Недопустимая шкала. Используйте 'C' или 'F'.");
            }
        }

        // Пример использования
        public void main(String[] args) {
            Temperature tempObject = new Temperature();
            System.out.println("Температура: " + tempObject.getValue() + " градусов " + tempObject.getScale());

            tempObject.setValue(25);
            tempObject.setScale('F');
            System.out.println("Новая температура: " + tempObject.getValue() + " градусов " + tempObject.getScale());
        }
    }



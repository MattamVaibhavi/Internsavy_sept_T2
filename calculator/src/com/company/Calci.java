package com.company;

    public abstract class Calci{
        private double leftVal;
        private double rightVal;
        public double getleftVal() {
            return leftVal;
        }
        public void setLeftVal(double leftVal) {
            this.leftVal = leftVal;
        }
        public double getRightVal() {
            return rightVal;
        }
        public void setRightVal(double rightVal) {
            this.rightVal = rightVal;
        }
        public Calci() {
        }
        public Calci(double leftVal,double rightVal) {
            this.leftVal = leftVal;
            this.rightVal = rightVal;

        }
        public abstract void Calculator();
    }

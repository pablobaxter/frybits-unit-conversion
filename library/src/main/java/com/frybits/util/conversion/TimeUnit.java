package com.frybits.util.conversion;

/**
 * Frybits
 * Created by Pablo Baxter (Github: pablobaxter)
 */

public enum TimeUnit implements Unit<TimeUnit> {

    NANOSECONDS {
        @Override
        public double convert(double source, TimeUnit unit) {
            return 0;
        }

        @Override
        protected double baseUnit() {
            return 1;
        }
    },

    MICROSECOND {
        @Override
        public double convert(double source, TimeUnit unit) {
            return 0;
        }

        @Override
        protected double baseUnit() {
            return (long) (NANOSECONDS.baseUnit() * Math.pow(10, 3));
        }
    },

    MILLISECOND {
        @Override
        public double convert(double source, TimeUnit unit) {
            return 0;
        }

        @Override
        protected double baseUnit() {
            return (long) (NANOSECONDS.baseUnit() * Math.pow(10, 6));
        }
    },

    SECOND {
        @Override
        public double convert(double source, TimeUnit unit) {
            return 0;
        }

        @Override
        protected double baseUnit() {
            return (long) (NANOSECONDS.baseUnit() * Math.pow(10, 9));
        }
    },

    MINUTE {
        @Override
        public double convert(double source, TimeUnit unit) {
            return 0;
        }

        @Override
        protected double baseUnit() {
            return (long) (SECOND.baseUnit() * 60);
        }
    },

    HOUR {
        @Override
        public double convert(double source, TimeUnit unit) {
            return 0;
        }

        @Override
        protected double baseUnit() {
            return (long) (MINUTE.baseUnit() * 60);
        }
    },

    DAY {
        @Override
        public double convert(double source, TimeUnit unit) {
            return 0;
        }

        @Override
        protected double baseUnit() {
            return (long) (HOUR.baseUnit() * 24);
        }
    };

    public double toNanoseconds(double measurement) {
        double base = baseUnit();
        long val = (long) NANOSECONDS.baseUnit();
        return measurement * (base / val);
    }

    public double toMicroseconds(double measurement) {
        double base = baseUnit();
        long val = (long) MICROSECOND.baseUnit();
        return measurement * (base / val);
    }

    public double toMilliseconds(double measurement) {
        double base = baseUnit();
        long val = (long) MILLISECOND.baseUnit();
        return measurement * (base / val);
    }

    public double toSeconds(double measurement) {
        double base = baseUnit();
        long val = (long) SECOND.baseUnit();
        return measurement * (base / val);
    }

    public double toMinutes(double measurement) {
        double base = baseUnit();
        long val = (long) MINUTE.baseUnit();
        return measurement * (base / val);
    }

    public double toHours(double measurement) {
        double base = baseUnit();
        long val = (long) HOUR.baseUnit();
        return measurement * (base / val);
    }

    public double toDays(double measurement) {
        double base = baseUnit();
        long val = (long) DAY.baseUnit();
        return measurement * (base / val);
    }

    protected abstract double baseUnit();
}

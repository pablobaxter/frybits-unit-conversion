package com.frybits.util.conversion;

/**
 * Frybits
 * Created by Pablo Baxter (Github: pablobaxter)
 */

//TODO: Create documentation for this
public enum DistanceUnit implements Unit<DistanceUnit> {

    METER {
        @Override
        public double convert(double source, DistanceUnit unit) {
            return unit.toMeters(source);
        }

        @Override
        protected double baseUnit() {
            return  (long) (NANOMETER.baseUnit() * 1000000000);
        }
    },

    CENTIMETER {
        @Override
        public double convert(double source, DistanceUnit unit) {
            return unit.toCentimeters(source);
        }

        @Override
        protected double baseUnit() {
            return (long) (NANOMETER.baseUnit() * 10000000);
        }
    },

    MILLIMETER {
        @Override
        public double convert(double source, DistanceUnit unit) {
            return unit.toMillimeters(source);
        }

        @Override
        protected double baseUnit() {
            return (long) (NANOMETER.baseUnit() * 1000000);
        }
    },

    MICROMETER {
        @Override
        public double convert(double source, DistanceUnit unit) {
            return unit.toMicrometers(source);
        }

        @Override
        protected double baseUnit() {
            return (long) (NANOMETER.baseUnit() * 1000);
        }
    },

    NANOMETER {
        @Override
        public double convert(double source, DistanceUnit unit) {
            return unit.toNanometers(source);
        }

        @Override
        protected double baseUnit() {
            return 1;
        }
    },

    KILOMETER {
        @Override
        public double convert(double source, DistanceUnit unit) {
            return unit.toKilometers(source);
        }

        @Override
        protected double baseUnit() {
            return (long) (METER.baseUnit() * 1000);
        }
    },

    ASTRONOMICAL_UNIT {
        @Override
        public double convert(double source, DistanceUnit unit) {
            return unit.toAstronomicalUnits(source);
        }

        @Override
        protected double baseUnit() {
            //According to https://www.iau.org/static/resolutions/IAU2012_English.pdf
            return METER.baseUnit() * 149597870700L;
        }
    },

    LIGHT_YEAR {
        @Override
        public double convert(double source, DistanceUnit unit) {
            return unit.toLightYears(source);
        }

        @Override
        protected double baseUnit() {
            return METER.baseUnit() * 9460730472580800.0;
        }
    },

    PARSEC {
        @Override
        public double convert(double source, DistanceUnit unit) {
            return unit.toParsecs(source);
        }

        @Override
        protected double baseUnit() {
            return ASTRONOMICAL_UNIT.baseUnit() * (648000 / Math.PI);
        }
    },

    INCH {
        @Override
        public double convert(double source, DistanceUnit unit) {
            return unit.toInches(source);
        }

        @Override
        protected double baseUnit() {
            return (long) (NANOMETER.baseUnit() * 2.54E7);
        }
    },

    FOOT {
        @Override
        public double convert(double source, DistanceUnit unit) {
            return unit.toFeet(source);
        }

        @Override
        protected double baseUnit() {
            return (long) (INCH.baseUnit() * 12);
        }
    },

    YARD {
        @Override
        public double convert(double source, DistanceUnit unit) {
            return unit.toYards(source);
        }

        @Override
        protected double baseUnit() {
            return (long) (FOOT.baseUnit() * 3);
        }
    },

    CHAIN {
        @Override
        public double convert(double source, DistanceUnit unit) {
            return unit.toChains(source);
        }

        @Override
        protected double baseUnit() {
            return (long) (YARD.baseUnit() * 22);
        }
    },

    FURLONG {
        @Override
        public double convert(double source, DistanceUnit unit) {
            return unit.toFurlongs(source);
        }

        @Override
        protected double baseUnit() {
            return (long) (CHAIN.baseUnit() * 10);
        }
    },

    MILE {
        @Override
        public double convert(double source, DistanceUnit unit) {
            return unit.toMiles(source);
        }

        @Override
        protected double baseUnit() {
            return (long) (YARD.baseUnit() * 1760);
        }
    };

    public double toMeters(double measurement) {
        double base = baseUnit();
        long val = (long) METER.baseUnit();
        return measurement * (base / val);
    }

    public double toCentimeters(double measurement) {
        double base = baseUnit();
        long val = (long) CENTIMETER.baseUnit();
        return measurement * (base / val);
    }

    public double toMillimeters(double measurement) {
        double base = baseUnit();
        long val = (long) MILLIMETER.baseUnit();
        return measurement * (base / val);
    }

    public double toMicrometers(double measurement) {
        double base = baseUnit();
        long val = (long) MICROMETER.baseUnit();
        return measurement * (base / val);
    }

    public double toNanometers(double measurement) {
        double base = baseUnit();
        byte val = (byte) NANOMETER.baseUnit();
        return measurement * (base / val);
    }

    public double toKilometers(double measurement) {
        double base = baseUnit();
        long val = (long) KILOMETER.baseUnit();
        return measurement * (base / val);
    }

    public double toAstronomicalUnits(double measurement) {
        double base = baseUnit();
        double val = ASTRONOMICAL_UNIT.baseUnit();
        return measurement * (base / val);
    }

    public double toLightYears(double measurement) {
        double base = baseUnit();
        double val = LIGHT_YEAR.baseUnit();
        return measurement * (base / val);
    }

    public double toParsecs(double measurement) {
        double base = baseUnit();
        double val = PARSEC.baseUnit();
        return measurement * (base / val);
    }

    public double toInches(double measurement) {
        double base = baseUnit();
        long val = (long) INCH.baseUnit();
        return measurement * (base / val);
    }

    public double toFeet(double measurement) {
        double base = baseUnit();
        long val = (long) FOOT.baseUnit();
        return measurement * (base / val);
    }

    public double toYards(double measurement) {
        double base = baseUnit();
        long val = (long) YARD.baseUnit();
        return measurement * (base / val);
    }

    public double toChains(double measurement) {
        double base = baseUnit();
        long val = (long) CHAIN.baseUnit();
        return measurement * (base / val);
    }

    public double toFurlongs(double measurement) {
        double base = baseUnit();
        long val = (long) FURLONG.baseUnit();
        return measurement * (base / val);
    }

    public double toMiles(double measurement) {
        double base = baseUnit();
        long val = (long) MILE.baseUnit();
        return measurement * (base / val);
    }

    protected abstract double baseUnit();
}
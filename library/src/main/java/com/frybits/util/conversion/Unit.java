package com.frybits.util.conversion;

/**
 * Frybits
 * Created by Pablo Baxter (Github: pablobaxter)
 */

interface Unit<U> {

    double convert(double source, U unit);
}

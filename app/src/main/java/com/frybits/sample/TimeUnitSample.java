package com.frybits.sample;

import com.frybits.util.conversion.TimeUnit;

/**
 * Frybits
 * Created by Pablo Baxter (Github: pablobaxter)
 */

class TimeUnitSample {

    public static void main(String... args) {
        double unit = 1;
        System.out.println("Seconds to nanos: " + TimeUnit.SECOND.toNanoseconds(unit));
        System.out.println("Seconds to micros: " + TimeUnit.SECOND.toMicroseconds(unit));
        System.out.println("Seconds to millis: " + TimeUnit.SECOND.toMilliseconds(unit));
        System.out.println("Seconds to seconds: " + TimeUnit.SECOND.toSeconds(unit));
        System.out.println("Seconds to minutes: " + TimeUnit.SECOND.toMinutes(unit));
        System.out.println("Seconds to hours: " + TimeUnit.SECOND.toHours(unit));
        System.out.println("Seconds to days: " + TimeUnit.SECOND.toDays(unit));
        System.out.println();
        System.out.println("Nanos to nanos: " + TimeUnit.NANOSECONDS.toNanoseconds(unit));
        System.out.println("Nanos to micros: " + TimeUnit.NANOSECONDS.toMicroseconds(unit));
        System.out.println("Nanos to millis: " + TimeUnit.NANOSECONDS.toMilliseconds(unit));
        System.out.println("Nanos to seconds: " + TimeUnit.NANOSECONDS.toSeconds(unit));
        System.out.println("Nanos to minutes: " + TimeUnit.NANOSECONDS.toMinutes(unit));
        System.out.println("Nanos to hours: " + TimeUnit.NANOSECONDS.toHours(unit));
        System.out.println("Nanos to days: " + TimeUnit.NANOSECONDS.toDays(unit));
        System.out.println();
        System.out.println("Minutes to nanos: " + TimeUnit.MINUTE.toNanoseconds(unit));
        System.out.println("Minutes to micros: " + TimeUnit.MINUTE.toMicroseconds(unit));
        System.out.println("Minutes to millis: " + TimeUnit.MINUTE.toMilliseconds(unit));
        System.out.println("Minutes to seconds: " + TimeUnit.MINUTE.toSeconds(unit));
        System.out.println("Minutes to minutes: " + TimeUnit.MINUTE.toMinutes(unit));
        System.out.println("Minutes to hours: " + TimeUnit.MINUTE.toHours(unit));
        System.out.println("Minutes to days: " + TimeUnit.MINUTE.toDays(unit));
        System.out.println();
        System.out.println("Hours to nanos: " + TimeUnit.HOUR.toNanoseconds(unit));
        System.out.println("Hours to micros: " + TimeUnit.HOUR.toMicroseconds(unit));
        System.out.println("Hours to millis: " + TimeUnit.HOUR.toMilliseconds(unit));
        System.out.println("Hours to seconds: " + TimeUnit.HOUR.toSeconds(unit));
        System.out.println("Hours to minutes: " + TimeUnit.HOUR.toMinutes(unit));
        System.out.println("Hours to hours: " + TimeUnit.HOUR.toHours(unit));
        System.out.println("Hours to days: " + TimeUnit.HOUR.toDays(unit));
        System.out.println();
        System.out.println("Days to nanos: " + TimeUnit.DAY.toNanoseconds(unit));
        System.out.println("Days to micros: " + TimeUnit.DAY.toMicroseconds(unit));
        System.out.println("Days to millis: " + TimeUnit.DAY.toMilliseconds(unit));
        System.out.println("Days to seconds: " + TimeUnit.DAY.toSeconds(unit));
        System.out.println("Days to minutes: " + TimeUnit.DAY.toMinutes(unit));
        System.out.println("Days to hours: " + TimeUnit.DAY.toHours(unit));
        System.out.println("Days to days: " + TimeUnit.DAY.toDays(unit));
        System.out.println();
    }
}

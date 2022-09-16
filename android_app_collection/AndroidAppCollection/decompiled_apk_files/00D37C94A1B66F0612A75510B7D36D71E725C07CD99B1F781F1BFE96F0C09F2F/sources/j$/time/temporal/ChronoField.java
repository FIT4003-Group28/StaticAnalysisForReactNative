package j$.time.temporal;
/* JADX WARN: Init of enum ALIGNED_DAY_OF_WEEK_IN_MONTH can be incorrect */
/* JADX WARN: Init of enum ALIGNED_DAY_OF_WEEK_IN_YEAR can be incorrect */
/* JADX WARN: Init of enum ALIGNED_WEEK_OF_MONTH can be incorrect */
/* JADX WARN: Init of enum ALIGNED_WEEK_OF_YEAR can be incorrect */
/* JADX WARN: Init of enum AMPM_OF_DAY can be incorrect */
/* JADX WARN: Init of enum CLOCK_HOUR_OF_AMPM can be incorrect */
/* JADX WARN: Init of enum CLOCK_HOUR_OF_DAY can be incorrect */
/* JADX WARN: Init of enum DAY_OF_MONTH can be incorrect */
/* JADX WARN: Init of enum DAY_OF_WEEK can be incorrect */
/* JADX WARN: Init of enum DAY_OF_YEAR can be incorrect */
/* JADX WARN: Init of enum EPOCH_DAY can be incorrect */
/* JADX WARN: Init of enum ERA can be incorrect */
/* JADX WARN: Init of enum HOUR_OF_AMPM can be incorrect */
/* JADX WARN: Init of enum HOUR_OF_DAY can be incorrect */
/* JADX WARN: Init of enum INSTANT_SECONDS can be incorrect */
/* JADX WARN: Init of enum MICRO_OF_DAY can be incorrect */
/* JADX WARN: Init of enum MICRO_OF_SECOND can be incorrect */
/* JADX WARN: Init of enum MILLI_OF_DAY can be incorrect */
/* JADX WARN: Init of enum MILLI_OF_SECOND can be incorrect */
/* JADX WARN: Init of enum MINUTE_OF_DAY can be incorrect */
/* JADX WARN: Init of enum MINUTE_OF_HOUR can be incorrect */
/* JADX WARN: Init of enum MONTH_OF_YEAR can be incorrect */
/* JADX WARN: Init of enum NANO_OF_DAY can be incorrect */
/* JADX WARN: Init of enum NANO_OF_SECOND can be incorrect */
/* JADX WARN: Init of enum OFFSET_SECONDS can be incorrect */
/* JADX WARN: Init of enum PROLEPTIC_MONTH can be incorrect */
/* JADX WARN: Init of enum SECOND_OF_DAY can be incorrect */
/* JADX WARN: Init of enum SECOND_OF_MINUTE can be incorrect */
/* JADX WARN: Init of enum YEAR can be incorrect */
/* JADX WARN: Init of enum YEAR_OF_ERA can be incorrect */
/* loaded from: classes5.dex */
public enum ChronoField implements TemporalField {
    NANO_OF_SECOND("NanoOfSecond", r8, r17, ValueRange.of(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", r8, r26, ValueRange.of(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", r8, r17, ValueRange.of(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", r8, r26, ValueRange.of(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", r8, r17, ValueRange.of(0, 999)),
    MILLI_OF_DAY("MilliOfDay", r8, r26, ValueRange.of(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", r17, r18, ValueRange.of(0, 59), "second"),
    SECOND_OF_DAY("SecondOfDay", r17, r26, ValueRange.of(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", r18, r9, ValueRange.of(0, 59), "minute"),
    MINUTE_OF_DAY("MinuteOfDay", r18, r26, ValueRange.of(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", r9, r7, ValueRange.of(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", r9, r7, ValueRange.of(1, 12)),
    HOUR_OF_DAY("HourOfDay", r9, r26, ValueRange.of(0, 23), "hour"),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", r9, r26, ValueRange.of(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", r7, r26, ValueRange.of(0, 1), "dayperiod"),
    DAY_OF_WEEK("DayOfWeek", r26, r8, ValueRange.of(1, 7), "weekday"),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", r26, r8, ValueRange.of(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", r26, r8, ValueRange.of(1, 7)),
    DAY_OF_MONTH("DayOfMonth", r26, r9, ValueRange.of(1, 28, 31), "day"),
    DAY_OF_YEAR("DayOfYear", r26, r12, ValueRange.of(1, 365, 366)),
    EPOCH_DAY("EpochDay", r26, r13, ValueRange.of(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", r8, r9, ValueRange.of(1, 4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", r8, r12, ValueRange.of(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", r9, r12, ValueRange.of(1, 12), "month"),
    PROLEPTIC_MONTH("ProlepticMonth", r9, r13, ValueRange.of(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", r12, r13, ValueRange.of(1, 999999999, 1000000000)),
    YEAR("Year", r12, r13, ValueRange.of(-999999999, 999999999), "year"),
    ERA("Era", ChronoUnit.ERAS, r13, ValueRange.of(0, 1), "era"),
    INSTANT_SECONDS("InstantSeconds", r17, r13, ValueRange.of(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", r17, r13, ValueRange.of(-64800, 64800));
    
    private final String name;
    private final ValueRange range;

    static {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
        ChronoUnit chronoUnit2 = ChronoUnit.SECONDS;
        ChronoUnit chronoUnit3 = ChronoUnit.DAYS;
        ChronoUnit chronoUnit4 = ChronoUnit.MICROS;
        ChronoUnit chronoUnit5 = ChronoUnit.MILLIS;
        ChronoUnit chronoUnit6 = ChronoUnit.MINUTES;
        ChronoUnit chronoUnit7 = ChronoUnit.HOURS;
        ChronoUnit chronoUnit8 = ChronoUnit.HALF_DAYS;
        ChronoUnit chronoUnit9 = ChronoUnit.WEEKS;
        ChronoUnit chronoUnit10 = ChronoUnit.MONTHS;
        ChronoUnit chronoUnit11 = ChronoUnit.YEARS;
        ChronoUnit chronoUnit12 = ChronoUnit.FOREVER;
    }

    ChronoField(String str, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, ValueRange valueRange) {
        this.name = str;
        this.range = valueRange;
    }

    ChronoField(String str, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, ValueRange valueRange, String str2) {
        this.name = str;
        this.range = valueRange;
    }

    @Override // j$.time.temporal.TemporalField
    public ValueRange range() {
        return this.range;
    }

    @Override // j$.time.temporal.TemporalField
    public boolean isDateBased() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    @Override // j$.time.temporal.TemporalField
    public boolean isTimeBased() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    public long checkValidValue(long j) {
        return range().checkValidValue(j, this);
    }

    public int checkValidIntValue(long j) {
        return range().checkValidIntValue(j, this);
    }

    @Override // j$.time.temporal.TemporalField
    public boolean isSupportedBy(TemporalAccessor temporalAccessor) {
        return temporalAccessor.isSupported(this);
    }

    @Override // j$.time.temporal.TemporalField
    public ValueRange rangeRefinedBy(TemporalAccessor temporalAccessor) {
        return temporalAccessor.range(this);
    }

    @Override // j$.time.temporal.TemporalField
    public long getFrom(TemporalAccessor temporalAccessor) {
        return temporalAccessor.getLong(this);
    }

    @Override // j$.time.temporal.TemporalField
    public Temporal adjustInto(Temporal temporal, long j) {
        return temporal.mo386with(this, j);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}

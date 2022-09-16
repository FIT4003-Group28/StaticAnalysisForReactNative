package j$.time.chrono;

import j$.time.Clock$TickClock$$ExternalSyntheticBackport0;
import j$.time.Duration$$ExternalSyntheticBackport10;
import j$.time.LocalTime;
import j$.time.Period$$ExternalSyntheticBackport0;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
/* loaded from: classes5.dex */
public final class HijrahDate extends ChronoLocalDateImpl {
    private static final long serialVersionUID = -5207853542612002020L;
    private final transient HijrahChronology chrono;
    private final transient int dayOfMonth;
    private final transient int monthOfYear;
    private final transient int prolepticYear;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static HijrahDate of(HijrahChronology hijrahChronology, int i, int i2, int i3) {
        return new HijrahDate(hijrahChronology, i, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static HijrahDate ofEpochDay(HijrahChronology hijrahChronology, long j) {
        return new HijrahDate(hijrahChronology, j);
    }

    private HijrahDate(HijrahChronology hijrahChronology, int i, int i2, int i3) {
        hijrahChronology.getEpochDay(i, i2, i3);
        this.chrono = hijrahChronology;
        this.prolepticYear = i;
        this.monthOfYear = i2;
        this.dayOfMonth = i3;
    }

    private HijrahDate(HijrahChronology hijrahChronology, long j) {
        int[] hijrahDateInfo = hijrahChronology.getHijrahDateInfo((int) j);
        this.chrono = hijrahChronology;
        this.prolepticYear = hijrahDateInfo[0];
        this.monthOfYear = hijrahDateInfo[1];
        this.dayOfMonth = hijrahDateInfo[2];
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: getChronology  reason: collision with other method in class */
    public HijrahChronology mo379getChronology() {
        return this.chrono;
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl
    /* renamed from: getEra  reason: collision with other method in class */
    public HijrahEra mo380getEra() {
        return HijrahEra.AH;
    }

    public int lengthOfMonth() {
        return this.chrono.getMonthLength(this.prolepticYear, this.monthOfYear);
    }

    public int lengthOfYear() {
        return this.chrono.getYearLength(this.prolepticYear);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (isSupported(temporalField)) {
                ChronoField chronoField = (ChronoField) temporalField;
                int i = AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()];
                if (i == 1) {
                    return ValueRange.of(1L, lengthOfMonth());
                }
                if (i == 2) {
                    return ValueRange.of(1L, lengthOfYear());
                }
                if (i == 3) {
                    return ValueRange.of(1L, 5L);
                }
                return mo379getChronology().range(chronoField);
            }
            String valueOf = String.valueOf(temporalField);
            StringBuilder sb = new StringBuilder(valueOf.length() + 19);
            sb.append("Unsupported field: ");
            sb.append(valueOf);
            throw new UnsupportedTemporalTypeException(sb.toString());
        }
        return temporalField.rangeRefinedBy(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.chrono.HijrahDate$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoField;

        static {
            int[] iArr = new int[ChronoField.values().length];
            $SwitchMap$java$time$temporal$ChronoField = iArr;
            try {
                iArr[ChronoField.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.DAY_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.DAY_OF_WEEK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.EPOCH_DAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_WEEK_OF_YEAR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.MONTH_OF_YEAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.PROLEPTIC_MONTH.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR_OF_ERA.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ERA.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        int i;
        int i2;
        if (temporalField instanceof ChronoField) {
            switch (AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField[((ChronoField) temporalField).ordinal()]) {
                case 1:
                    i = this.dayOfMonth;
                    break;
                case 2:
                    i = getDayOfYear();
                    break;
                case 3:
                    i2 = (this.dayOfMonth - 1) / 7;
                    i = i2 + 1;
                    break;
                case 4:
                    i = getDayOfWeek();
                    break;
                case 5:
                    i2 = (this.dayOfMonth - 1) % 7;
                    i = i2 + 1;
                    break;
                case 6:
                    i2 = (getDayOfYear() - 1) % 7;
                    i = i2 + 1;
                    break;
                case 7:
                    return toEpochDay();
                case 8:
                    i2 = (getDayOfYear() - 1) / 7;
                    i = i2 + 1;
                    break;
                case 9:
                    i = this.monthOfYear;
                    break;
                case 10:
                    return getProlepticMonth();
                case 11:
                    i = this.prolepticYear;
                    break;
                case 12:
                    i = this.prolepticYear;
                    break;
                case 13:
                    i = getEraValue();
                    break;
                default:
                    String valueOf = String.valueOf(temporalField);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 19);
                    sb.append("Unsupported field: ");
                    sb.append(valueOf);
                    throw new UnsupportedTemporalTypeException(sb.toString());
            }
            return i;
        }
        return temporalField.getFrom(this);
    }

    private long getProlepticMonth() {
        return ((this.prolepticYear * 12) + this.monthOfYear) - 1;
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: with  reason: collision with other method in class */
    public HijrahDate mo386with(TemporalField temporalField, long j) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            this.chrono.range(chronoField).checkValidValue(j, chronoField);
            int i = (int) j;
            switch (AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()]) {
                case 1:
                    return resolvePreviousValid(this.prolepticYear, this.monthOfYear, i);
                case 2:
                    return mo383plusDays(Math.min(i, lengthOfYear()) - getDayOfYear());
                case 3:
                    return mo383plusDays((j - getLong(ChronoField.ALIGNED_WEEK_OF_MONTH)) * 7);
                case 4:
                    return mo383plusDays(j - getDayOfWeek());
                case 5:
                    return mo383plusDays(j - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                case 6:
                    return mo383plusDays(j - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                case 7:
                    return new HijrahDate(this.chrono, j);
                case 8:
                    return mo383plusDays((j - getLong(ChronoField.ALIGNED_WEEK_OF_YEAR)) * 7);
                case 9:
                    return resolvePreviousValid(this.prolepticYear, i, this.dayOfMonth);
                case 10:
                    return mo384plusMonths(j - getProlepticMonth());
                case 11:
                    if (this.prolepticYear < 1) {
                        i = 1 - i;
                    }
                    return resolvePreviousValid(i, this.monthOfYear, this.dayOfMonth);
                case 12:
                    return resolvePreviousValid(i, this.monthOfYear, this.dayOfMonth);
                case 13:
                    return resolvePreviousValid(1 - this.prolepticYear, this.monthOfYear, this.dayOfMonth);
                default:
                    String valueOf = String.valueOf(temporalField);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 19);
                    sb.append("Unsupported field: ");
                    sb.append(valueOf);
                    throw new UnsupportedTemporalTypeException(sb.toString());
            }
        }
        return (HijrahDate) super.mo386with(temporalField, j);
    }

    private HijrahDate resolvePreviousValid(int i, int i2, int i3) {
        int monthLength = this.chrono.getMonthLength(i, i2);
        if (i3 > monthLength) {
            i3 = monthLength;
        }
        return of(this.chrono, i, i2, i3);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, j$.time.temporal.Temporal
    /* renamed from: with */
    public HijrahDate mo387with(TemporalAdjuster temporalAdjuster) {
        return (HijrahDate) super.mo387with(temporalAdjuster);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        return this.chrono.getEpochDay(this.prolepticYear, this.monthOfYear, this.dayOfMonth);
    }

    private int getDayOfYear() {
        return this.chrono.getDayOfYear(this.prolepticYear, this.monthOfYear) + this.dayOfMonth;
    }

    private int getDayOfWeek() {
        return HijrahDate$$ExternalSyntheticBackport0.m(toEpochDay() + 3, 7) + 1;
    }

    private int getEraValue() {
        return this.prolepticYear > 1 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.ChronoLocalDateImpl
    /* renamed from: plusYears  reason: collision with other method in class */
    public HijrahDate mo385plusYears(long j) {
        return j == 0 ? this : resolvePreviousValid(Period$$ExternalSyntheticBackport0.m(this.prolepticYear, (int) j), this.monthOfYear, this.dayOfMonth);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.ChronoLocalDateImpl
    /* renamed from: plusMonths  reason: collision with other method in class */
    public HijrahDate mo384plusMonths(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.prolepticYear * 12) + (this.monthOfYear - 1) + j;
        return resolvePreviousValid(this.chrono.checkValidYear(Duration$$ExternalSyntheticBackport10.m(j2, 12L)), ((int) Clock$TickClock$$ExternalSyntheticBackport0.m(j2, 12L)) + 1, this.dayOfMonth);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.ChronoLocalDateImpl
    /* renamed from: plusDays  reason: collision with other method in class */
    public HijrahDate mo383plusDays(long j) {
        return new HijrahDate(this.chrono, toEpochDay() + j);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: plus  reason: collision with other method in class */
    public HijrahDate mo382plus(long j, TemporalUnit temporalUnit) {
        return (HijrahDate) super.mo382plus(j, temporalUnit);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: minus  reason: collision with other method in class */
    public HijrahDate mo381minus(long j, TemporalUnit temporalUnit) {
        return (HijrahDate) super.mo381minus(j, temporalUnit);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, j$.time.chrono.ChronoLocalDate
    /* renamed from: atTime */
    public final ChronoLocalDateTime mo293atTime(LocalTime localTime) {
        return super.mo293atTime(localTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HijrahDate)) {
            return false;
        }
        HijrahDate hijrahDate = (HijrahDate) obj;
        return this.prolepticYear == hijrahDate.prolepticYear && this.monthOfYear == hijrahDate.monthOfYear && this.dayOfMonth == hijrahDate.dayOfMonth && mo379getChronology().equals(hijrahDate.mo379getChronology());
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        int i = this.prolepticYear;
        int i2 = this.monthOfYear;
        return (((i << 11) + (i2 << 6)) + this.dayOfMonth) ^ (mo379getChronology().getId().hashCode() ^ (i & (-2048)));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 6, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(mo379getChronology());
        objectOutput.writeInt(get(ChronoField.YEAR));
        objectOutput.writeByte(get(ChronoField.MONTH_OF_YEAR));
        objectOutput.writeByte(get(ChronoField.DAY_OF_MONTH));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static HijrahDate readExternal(ObjectInput objectInput) {
        return ((HijrahChronology) objectInput.readObject()).date(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
    }
}

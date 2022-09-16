package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.Instant$$ExternalSyntheticBackport8;
/* loaded from: classes5.dex */
public abstract class JulianFields {
    public static final TemporalField MODIFIED_JULIAN_DAY;

    static {
        Field field = Field.JULIAN_DAY;
        MODIFIED_JULIAN_DAY = Field.MODIFIED_JULIAN_DAY;
        Field field2 = Field.RATA_DIE;
    }

    /* JADX WARN: Init of enum JULIAN_DAY can be incorrect */
    /* JADX WARN: Init of enum MODIFIED_JULIAN_DAY can be incorrect */
    /* JADX WARN: Init of enum RATA_DIE can be incorrect */
    /* loaded from: classes5.dex */
    enum Field implements TemporalField {
        JULIAN_DAY("JulianDay", r9, r10, 2440588),
        MODIFIED_JULIAN_DAY("ModifiedJulianDay", r9, r10, 40587),
        RATA_DIE("RataDie", r9, r10, 719163);
        
        private static final long serialVersionUID = -7501623920830201812L;
        private final transient String name;
        private final transient long offset;
        private final transient ValueRange range;

        @Override // j$.time.temporal.TemporalField
        public boolean isDateBased() {
            return true;
        }

        @Override // j$.time.temporal.TemporalField
        public boolean isTimeBased() {
            return false;
        }

        static {
            ChronoUnit chronoUnit = ChronoUnit.DAYS;
            ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
        }

        Field(String str, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, long j) {
            this.name = str;
            this.range = ValueRange.of((-365243219162L) + j, 365241780471L + j);
            this.offset = j;
        }

        @Override // j$.time.temporal.TemporalField
        public ValueRange range() {
            return this.range;
        }

        @Override // j$.time.temporal.TemporalField
        public boolean isSupportedBy(TemporalAccessor temporalAccessor) {
            return temporalAccessor.isSupported(ChronoField.EPOCH_DAY);
        }

        @Override // j$.time.temporal.TemporalField
        public ValueRange rangeRefinedBy(TemporalAccessor temporalAccessor) {
            if (!isSupportedBy(temporalAccessor)) {
                String valueOf = String.valueOf(this);
                StringBuilder sb = new StringBuilder(valueOf.length() + 19);
                sb.append("Unsupported field: ");
                sb.append(valueOf);
                throw new DateTimeException(sb.toString());
            }
            return range();
        }

        @Override // j$.time.temporal.TemporalField
        public long getFrom(TemporalAccessor temporalAccessor) {
            return temporalAccessor.getLong(ChronoField.EPOCH_DAY) + this.offset;
        }

        @Override // j$.time.temporal.TemporalField
        public Temporal adjustInto(Temporal temporal, long j) {
            if (!range().isValidValue(j)) {
                String str = this.name;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
                sb.append("Invalid value: ");
                sb.append(str);
                sb.append(" ");
                sb.append(j);
                throw new DateTimeException(sb.toString());
            }
            return temporal.mo386with(ChronoField.EPOCH_DAY, Instant$$ExternalSyntheticBackport8.m(j, this.offset));
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }
    }
}

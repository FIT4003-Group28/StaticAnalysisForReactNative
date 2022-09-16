package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.ValueRange;
import j$.time.zone.ZoneOffsetTransition;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class ChronoZonedDateTimeImpl implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    private final transient ChronoLocalDateTimeImpl dateTime;
    private final transient ZoneOffset offset;
    private final transient ZoneId zone;

    @Override // j$.time.chrono.ChronoZonedDateTime
    public /* synthetic */ int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        return ChronoZonedDateTime.CC.$default$compareTo((ChronoZonedDateTime) this, chronoZonedDateTime);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int compareTo;
        compareTo = compareTo((ChronoZonedDateTime) obj);
        return compareTo;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ int get(TemporalField temporalField) {
        return ChronoZonedDateTime.CC.$default$get(this, temporalField);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public /* synthetic */ Chronology getChronology() {
        Chronology mo379getChronology;
        mo379getChronology = mo327toLocalDate().mo379getChronology();
        return mo379getChronology;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ long getLong(TemporalField temporalField) {
        return ChronoZonedDateTime.CC.$default$getLong(this, temporalField);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime, j$.time.temporal.Temporal
    /* renamed from: minus */
    public /* synthetic */ ChronoZonedDateTime mo381minus(long j, TemporalUnit temporalUnit) {
        ChronoZonedDateTime ensureValid;
        ensureValid = ensureValid(getChronology(), Temporal.CC.$default$minus(this, j, temporalUnit));
        return ensureValid;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime, j$.time.temporal.Temporal
    /* renamed from: minus  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Temporal mo381minus(long j, TemporalUnit temporalUnit) {
        Temporal mo381minus;
        mo381minus = mo381minus(j, temporalUnit);
        return mo381minus;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ Object query(TemporalQuery temporalQuery) {
        return ChronoZonedDateTime.CC.$default$query(this, temporalQuery);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ ValueRange range(TemporalField temporalField) {
        return ChronoZonedDateTime.CC.$default$range(this, temporalField);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public /* synthetic */ long toEpochSecond() {
        return ChronoZonedDateTime.CC.$default$toEpochSecond(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: toLocalDate */
    public /* synthetic */ ChronoLocalDate mo327toLocalDate() {
        ChronoLocalDate mo302toLocalDate;
        mo302toLocalDate = mo328toLocalDateTime().mo302toLocalDate();
        return mo302toLocalDate;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public /* synthetic */ LocalTime toLocalTime() {
        LocalTime localTime;
        localTime = mo328toLocalDateTime().toLocalTime();
        return localTime;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime, j$.time.temporal.Temporal
    /* renamed from: with */
    public /* synthetic */ ChronoZonedDateTime mo387with(TemporalAdjuster temporalAdjuster) {
        return ChronoZonedDateTime.CC.$default$with((ChronoZonedDateTime) this, temporalAdjuster);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime, j$.time.temporal.Temporal
    /* renamed from: with  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Temporal mo387with(TemporalAdjuster temporalAdjuster) {
        Temporal mo387with;
        mo387with = mo387with(temporalAdjuster);
        return mo387with;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ChronoZonedDateTime ofBest(ChronoLocalDateTimeImpl chronoLocalDateTimeImpl, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(chronoLocalDateTimeImpl, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ChronoZonedDateTimeImpl(chronoLocalDateTimeImpl, (ZoneOffset) zoneId, zoneId);
        }
        ZoneRules rules = zoneId.getRules();
        LocalDateTime from = LocalDateTime.from(chronoLocalDateTimeImpl);
        List validOffsets = rules.getValidOffsets(from);
        if (validOffsets.size() == 1) {
            zoneOffset = (ZoneOffset) validOffsets.get(0);
        } else if (validOffsets.size() == 0) {
            ZoneOffsetTransition transition = rules.getTransition(from);
            chronoLocalDateTimeImpl = chronoLocalDateTimeImpl.plusSeconds(transition.getDuration().getSeconds());
            zoneOffset = transition.getOffsetAfter();
        } else if (zoneOffset == null || !validOffsets.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) validOffsets.get(0);
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new ChronoZonedDateTimeImpl(chronoLocalDateTimeImpl, zoneOffset, zoneId);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ChronoZonedDateTimeImpl ofInstant(Chronology chronology, Instant instant, ZoneId zoneId) {
        ZoneOffset offset = zoneId.getRules().getOffset(instant);
        Objects.requireNonNull(offset, "offset");
        return new ChronoZonedDateTimeImpl((ChronoLocalDateTimeImpl) chronology.mo355localDateTime(LocalDateTime.ofEpochSecond(instant.getEpochSecond(), instant.getNano(), offset)), offset, zoneId);
    }

    private ChronoZonedDateTimeImpl create(Instant instant, ZoneId zoneId) {
        return ofInstant(getChronology(), instant, zoneId);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ChronoZonedDateTimeImpl ensureValid(Chronology chronology, Temporal temporal) {
        ChronoZonedDateTimeImpl chronoZonedDateTimeImpl = (ChronoZonedDateTimeImpl) temporal;
        if (chronology.equals(chronoZonedDateTimeImpl.getChronology())) {
            return chronoZonedDateTimeImpl;
        }
        String id = chronology.getId();
        String id2 = chronoZonedDateTimeImpl.getChronology().getId();
        StringBuilder sb = new StringBuilder(String.valueOf(id).length() + 41 + String.valueOf(id2).length());
        sb.append("Chronology mismatch, required: ");
        sb.append(id);
        sb.append(", actual: ");
        sb.append(id2);
        throw new ClassCastException(sb.toString());
    }

    private ChronoZonedDateTimeImpl(ChronoLocalDateTimeImpl chronoLocalDateTimeImpl, ZoneOffset zoneOffset, ZoneId zoneId) {
        this.dateTime = (ChronoLocalDateTimeImpl) Objects.requireNonNull(chronoLocalDateTimeImpl, "dateTime");
        this.offset = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
        this.zone = (ZoneId) Objects.requireNonNull(zoneId, "zone");
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public ZoneOffset getOffset() {
        return this.offset;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: toLocalDateTime */
    public ChronoLocalDateTime mo328toLocalDateTime() {
        return this.dateTime;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public ZoneId getZone() {
        return this.zone;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: withZoneSameLocal */
    public ChronoZonedDateTime mo332withZoneSameLocal(ZoneId zoneId) {
        return ofBest(this.dateTime, zoneId, this.offset);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: withZoneSameInstant */
    public ChronoZonedDateTime mo331withZoneSameInstant(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.zone.equals(zoneId) ? this : create(this.dateTime.toInstant(this.offset), zoneId);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean isSupported(TemporalField temporalField) {
        return (temporalField instanceof ChronoField) || (temporalField != null && temporalField.isSupportedBy(this));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: with */
    public ChronoZonedDateTime mo386with(TemporalField temporalField, long j) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            int i = AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()];
            if (i == 1) {
                return mo382plus(j - toEpochSecond(), (TemporalUnit) ChronoUnit.SECONDS);
            }
            if (i == 2) {
                return create(this.dateTime.toInstant(ZoneOffset.ofTotalSeconds(chronoField.checkValidIntValue(j))), this.zone);
            }
            return ofBest(this.dateTime.mo386with(temporalField, j), this.zone, this.offset);
        }
        return ensureValid(getChronology(), temporalField.adjustInto(this, j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.chrono.ChronoZonedDateTimeImpl$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoField;

        static {
            int[] iArr = new int[ChronoField.values().length];
            $SwitchMap$java$time$temporal$ChronoField = iArr;
            try {
                iArr[ChronoField.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: plus */
    public ChronoZonedDateTime mo382plus(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return mo387with((TemporalAdjuster) this.dateTime.mo382plus(j, temporalUnit));
        }
        return ensureValid(getChronology(), temporalUnit.addTo(this, j));
    }

    @Override // j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoZonedDateTime mo357zonedDateTime = getChronology().mo357zonedDateTime(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            return this.dateTime.until(mo357zonedDateTime.mo331withZoneSameInstant(this.offset).mo328toLocalDateTime(), temporalUnit);
        }
        Objects.requireNonNull(temporalUnit, "unit");
        return temporalUnit.between(this, mo357zonedDateTime);
    }

    private Object writeReplace() {
        return new Ser((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.dateTime);
        objectOutput.writeObject(this.offset);
        objectOutput.writeObject(this.zone);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ChronoZonedDateTime readExternal(ObjectInput objectInput) {
        return ((ChronoLocalDateTime) objectInput.readObject()).mo299atZone((ZoneOffset) objectInput.readObject()).mo332withZoneSameLocal((ZoneId) objectInput.readObject());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoZonedDateTime) && compareTo((ChronoZonedDateTime) obj) == 0;
    }

    public int hashCode() {
        return (mo328toLocalDateTime().hashCode() ^ getOffset().hashCode()) ^ Integer.rotateLeft(getZone().hashCode(), 3);
    }

    public String toString() {
        String valueOf = String.valueOf(mo328toLocalDateTime().toString());
        String valueOf2 = String.valueOf(getOffset().toString());
        String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        if (getOffset() != getZone()) {
            String valueOf3 = String.valueOf(concat);
            String zoneId = getZone().toString();
            StringBuilder sb = new StringBuilder(valueOf3.length() + 2 + String.valueOf(zoneId).length());
            sb.append(valueOf3);
            sb.append('[');
            sb.append(zoneId);
            sb.append(']');
            return sb.toString();
        }
        return concat;
    }
}

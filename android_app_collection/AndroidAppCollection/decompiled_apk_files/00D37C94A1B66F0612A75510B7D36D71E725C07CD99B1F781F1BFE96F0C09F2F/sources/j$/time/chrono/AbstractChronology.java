package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalAccessor;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInput;
import java.io.DataOutput;
import java.util.Iterator;
import java.util.Locale;
import java.util.ServiceLoader;
/* loaded from: classes5.dex */
public abstract class AbstractChronology implements Chronology {
    private static final ConcurrentHashMap CHRONOS_BY_ID = new ConcurrentHashMap();
    private static final ConcurrentHashMap CHRONOS_BY_TYPE = new ConcurrentHashMap();

    @Override // j$.time.chrono.Chronology
    /* renamed from: localDateTime */
    public /* synthetic */ ChronoLocalDateTime mo355localDateTime(TemporalAccessor temporalAccessor) {
        return Chronology.CC.$default$localDateTime(this, temporalAccessor);
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: zonedDateTime */
    public /* synthetic */ ChronoZonedDateTime mo356zonedDateTime(Instant instant, ZoneId zoneId) {
        ChronoZonedDateTime ofInstant;
        ofInstant = ChronoZonedDateTimeImpl.ofInstant(this, instant, zoneId);
        return ofInstant;
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: zonedDateTime */
    public /* synthetic */ ChronoZonedDateTime mo357zonedDateTime(TemporalAccessor temporalAccessor) {
        return Chronology.CC.$default$zonedDateTime(this, temporalAccessor);
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    static Chronology registerChrono(Chronology chronology) {
        return registerChrono(chronology, chronology.getId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Chronology registerChrono(Chronology chronology, String str) {
        String calendarType;
        Chronology chronology2 = (Chronology) CHRONOS_BY_ID.putIfAbsent(str, chronology);
        if (chronology2 == null && (calendarType = chronology.getCalendarType()) != null) {
            CHRONOS_BY_TYPE.putIfAbsent(calendarType, chronology);
        }
        return chronology2;
    }

    private static boolean initCache() {
        if (CHRONOS_BY_ID.get("ISO") == null) {
            registerChrono(HijrahChronology.INSTANCE);
            registerChrono(JapaneseChronology.INSTANCE);
            registerChrono(MinguoChronology.INSTANCE);
            registerChrono(ThaiBuddhistChronology.INSTANCE);
            Iterator it = ServiceLoader.load(AbstractChronology.class, null).iterator();
            while (it.hasNext()) {
                AbstractChronology abstractChronology = (AbstractChronology) it.next();
                if (!abstractChronology.getId().equals("ISO")) {
                    registerChrono(abstractChronology);
                }
            }
            registerChrono(IsoChronology.INSTANCE);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j$.time.chrono.Chronology of(java.lang.String r3) {
        /*
            java.lang.String r0 = "id"
            j$.util.Objects.requireNonNull(r3, r0)
        L5:
            j$.time.chrono.Chronology r0 = of0(r3)
            if (r0 == 0) goto Lc
            return r0
        Lc:
            boolean r0 = initCache()
            if (r0 != 0) goto L5
            java.lang.Class<j$.time.chrono.Chronology> r0 = j$.time.chrono.Chronology.class
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0)
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r0.next()
            j$.time.chrono.Chronology r1 = (j$.time.chrono.Chronology) r1
            java.lang.String r2 = r1.getId()
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L3c
            java.lang.String r2 = r1.getCalendarType()
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L1c
        L3c:
            return r1
        L3d:
            j$.time.DateTimeException r0 = new j$.time.DateTimeException
            java.lang.String r1 = "Unknown chronology: "
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r2 = r3.length()
            if (r2 == 0) goto L50
            java.lang.String r3 = r1.concat(r3)
            goto L55
        L50:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
        L55:
            r0.<init>(r3)
            goto L5a
        L59:
            throw r0
        L5a:
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.AbstractChronology.of(java.lang.String):j$.time.chrono.Chronology");
    }

    private static Chronology of0(String str) {
        Chronology chronology = (Chronology) CHRONOS_BY_ID.get(str);
        return chronology == null ? (Chronology) CHRONOS_BY_TYPE.get(str) : chronology;
    }

    @Override // java.lang.Comparable
    public int compareTo(Chronology chronology) {
        return getId().compareTo(chronology.getId());
    }

    @Override // j$.time.chrono.Chronology
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractChronology) && compareTo((Chronology) ((AbstractChronology) obj)) == 0;
    }

    @Override // j$.time.chrono.Chronology
    public int hashCode() {
        return getClass().hashCode() ^ getId().hashCode();
    }

    @Override // j$.time.chrono.Chronology
    public String toString() {
        return getId();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object writeReplace() {
        return new Ser((byte) 1, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(DataOutput dataOutput) {
        dataOutput.writeUTF(getId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Chronology readExternal(DataInput dataInput) {
        return Chronology.CC.of(dataInput.readUTF());
    }
}

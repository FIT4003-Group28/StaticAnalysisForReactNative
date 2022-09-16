package j$.time.temporal;
/* loaded from: classes5.dex */
public interface Temporal extends TemporalAccessor {
    /* renamed from: minus */
    Temporal mo381minus(long j, TemporalUnit temporalUnit);

    /* renamed from: plus */
    Temporal mo382plus(long j, TemporalUnit temporalUnit);

    long until(Temporal temporal, TemporalUnit temporalUnit);

    /* renamed from: with */
    Temporal mo387with(TemporalAdjuster temporalAdjuster);

    /* renamed from: with */
    Temporal mo386with(TemporalField temporalField, long j);

    /* renamed from: j$.time.temporal.Temporal$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class CC {
        public static Temporal $default$minus(Temporal temporal, long j, TemporalUnit temporalUnit) {
            long j2;
            if (j == Long.MIN_VALUE) {
                temporal = temporal.mo382plus(Long.MAX_VALUE, temporalUnit);
                j2 = 1;
            } else {
                j2 = -j;
            }
            return temporal.mo382plus(j2, temporalUnit);
        }
    }
}

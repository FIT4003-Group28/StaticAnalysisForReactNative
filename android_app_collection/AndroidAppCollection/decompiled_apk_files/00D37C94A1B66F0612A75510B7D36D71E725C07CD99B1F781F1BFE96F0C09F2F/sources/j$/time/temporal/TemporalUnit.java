package j$.time.temporal;
/* loaded from: classes5.dex */
public interface TemporalUnit {
    Temporal addTo(Temporal temporal, long j);

    long between(Temporal temporal, Temporal temporal2);

    boolean isDateBased();

    boolean isTimeBased();
}

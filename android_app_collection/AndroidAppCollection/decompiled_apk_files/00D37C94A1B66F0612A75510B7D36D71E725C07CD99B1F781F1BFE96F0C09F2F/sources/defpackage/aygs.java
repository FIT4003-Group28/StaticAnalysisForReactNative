package defpackage;

import java.util.Random;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aygs  reason: default package */
/* loaded from: classes2.dex */
public final class aygs {
    private final Random a = new Random();
    private final long b;
    private final long c;
    private long d;

    public aygs() {
        long nanos = TimeUnit.SECONDS.toNanos(1L);
        this.b = nanos;
        this.c = TimeUnit.MINUTES.toNanos(2L);
        this.d = nanos;
    }

    public final long a() {
        long j = this.d;
        double d = j;
        Double.isNaN(d);
        this.d = Math.min((long) (1.6d * d), this.c);
        Double.isNaN(d);
        double d2 = (-0.2d) * d;
        Double.isNaN(d);
        double d3 = d * 0.2d;
        aqxo.p(d3 >= d2);
        return j + ((long) ((this.a.nextDouble() * (d3 - d2)) + d2));
    }
}

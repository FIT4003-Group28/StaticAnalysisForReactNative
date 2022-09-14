package defpackage;

import java.util.Random;
/* compiled from: PG */
/* renamed from: bvny  reason: default package */
/* loaded from: classes4.dex */
public final class bvny {
    private static final Random a = new Random();
    private final Random b;
    private final long c;
    private long d;

    public bvny(long j) {
        Random random = a;
        this.d = 0L;
        this.c = j;
        dbsk.s(random);
        this.b = random;
    }

    public final long a() {
        double nextDouble = this.b.nextDouble();
        long j = this.d;
        double d = j;
        Double.isNaN(d);
        long j2 = (long) (nextDouble * d);
        this.d = j == 0 ? this.c : j <= 4611686018427387903L ? j + j : Long.MAX_VALUE;
        return j2;
    }

    public final void b() {
        this.d = 0L;
    }
}

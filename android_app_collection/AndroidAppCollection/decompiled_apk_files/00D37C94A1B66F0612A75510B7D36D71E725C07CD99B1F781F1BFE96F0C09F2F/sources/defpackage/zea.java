package defpackage;
/* compiled from: PG */
/* renamed from: zea  reason: default package */
/* loaded from: classes4.dex */
public final class zea {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final double e;

    public zea() {
        this(1000L, 30000L, 5L);
    }

    public zea(long j, long j2, long j3) {
        this(j, j2, j3, -1L, 2.0d);
    }

    public zea(long j, long j2, long j3, long j4, double d) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        aqxo.p(d >= 0.99d);
        this.e = d;
    }
}

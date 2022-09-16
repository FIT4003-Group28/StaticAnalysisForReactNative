package defpackage;
/* compiled from: PG */
/* renamed from: ayz  reason: default package */
/* loaded from: classes2.dex */
public final class ayz implements azy, bbg {
    private final long a;
    private final long b;
    private final int c;
    private final long d;
    private final int e;
    private final long f;

    public ayz(long j, long j2, int i, int i2) {
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        if (j == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
            return;
        }
        this.d = j - j2;
        this.f = g(j, j2, i);
    }

    private static long g(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }

    @Override // defpackage.azy
    public final long a() {
        return this.f;
    }

    @Override // defpackage.azy
    public final azw b(long j) {
        long j2 = this.d;
        if (j2 != -1) {
            int i = this.e;
            long j3 = this.c;
            long j4 = this.b + pxi.j((((i * j) / 8000000) / j3) * j3, 0L, j2 - j3);
            long d = d(j4);
            azz azzVar = new azz(d, j4);
            if (d < j) {
                long j5 = j4 + this.c;
                if (j5 < this.a) {
                    return new azw(azzVar, new azz(d(j5), j5));
                }
            }
            return new azw(azzVar, azzVar);
        }
        azz azzVar2 = new azz(0L, this.b);
        return new azw(azzVar2, azzVar2);
    }

    @Override // defpackage.azy
    public final boolean c() {
        return this.d != -1;
    }

    public final long d(long j) {
        return g(j, this.b, this.e);
    }

    @Override // defpackage.bbg
    public final long e() {
        return -1L;
    }

    @Override // defpackage.bbg
    public final long f(long j) {
        return d(j);
    }
}

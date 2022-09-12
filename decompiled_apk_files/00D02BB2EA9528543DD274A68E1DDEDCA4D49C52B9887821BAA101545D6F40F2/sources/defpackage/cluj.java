package defpackage;
/* compiled from: PG */
/* renamed from: cluj  reason: default package */
/* loaded from: classes5.dex */
public class cluj implements clvg {
    private final long a;
    private final long b;
    private final int c;
    private final long d;
    private final int e;
    private final long f;

    public cluj(long j, long j2, int i, int i2) {
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
        this.f = e(j, j2, i);
    }

    private static long e(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }

    @Override // defpackage.clvg
    public final boolean a() {
        return this.d != -1;
    }

    @Override // defpackage.clvg
    public final clve b(long j) {
        long j2 = this.d;
        if (j2 != -1) {
            int i = this.e;
            long j3 = this.c;
            long C = this.b + cmny.C((((i * j) / 8000000) / j3) * j3, 0L, j2 - j3);
            long d = d(C);
            clvh clvhVar = new clvh(d, C);
            if (d < j) {
                long j4 = C + this.c;
                if (j4 < this.a) {
                    return new clve(clvhVar, new clvh(d(j4), j4));
                }
            }
            return new clve(clvhVar, clvhVar);
        }
        clvh clvhVar2 = new clvh(0L, this.b);
        return new clve(clvhVar2, clvhVar2);
    }

    @Override // defpackage.clvg
    public final long c() {
        return this.f;
    }

    public final long d(long j) {
        return e(j, this.b, this.e);
    }
}

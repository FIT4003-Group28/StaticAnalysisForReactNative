package defpackage;
/* compiled from: PG */
/* renamed from: ben  reason: default package */
/* loaded from: classes2.dex */
final class ben implements azy {
    private final bem a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;

    public ben(bem bemVar, int i, long j, long j2) {
        this.a = bemVar;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / bemVar.d;
        this.d = j3;
        this.e = d(j3);
    }

    private final long d(long j) {
        return pxi.n(j * this.b, 1000000L, this.a.c);
    }

    @Override // defpackage.azy
    public final long a() {
        return this.e;
    }

    @Override // defpackage.azy
    public final azw b(long j) {
        long j2 = pxi.j((this.a.c * j) / (this.b * 1000000), 0L, this.d - 1);
        long j3 = this.c;
        int i = this.a.d;
        long d = d(j2);
        azz azzVar = new azz(d, j3 + (i * j2));
        if (d >= j || j2 == this.d - 1) {
            return new azw(azzVar, azzVar);
        }
        long j4 = j2 + 1;
        return new azw(azzVar, new azz(d(j4), this.c + (j4 * this.a.d)));
    }

    @Override // defpackage.azy
    public final boolean c() {
        return true;
    }
}

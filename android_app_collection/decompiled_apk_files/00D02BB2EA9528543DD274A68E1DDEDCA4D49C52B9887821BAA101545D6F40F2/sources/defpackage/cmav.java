package defpackage;
/* compiled from: PG */
/* renamed from: cmav  reason: default package */
/* loaded from: classes5.dex */
final class cmav implements clvg {
    private final cmas a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;

    public cmav(cmas cmasVar, int i, long j, long j2) {
        this.a = cmasVar;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / cmasVar.d;
        this.d = j3;
        this.e = d(j3);
    }

    private final long d(long j) {
        return cmny.E(j * this.b, 1000000L, this.a.c);
    }

    @Override // defpackage.clvg
    public final boolean a() {
        return true;
    }

    @Override // defpackage.clvg
    public final clve b(long j) {
        long C = cmny.C((this.a.c * j) / (this.b * 1000000), 0L, this.d - 1);
        long j2 = this.c;
        int i = this.a.d;
        long d = d(C);
        clvh clvhVar = new clvh(d, j2 + (i * C));
        if (d >= j || C == this.d - 1) {
            return new clve(clvhVar, clvhVar);
        }
        long j3 = C + 1;
        return new clve(clvhVar, new clvh(d(j3), this.c + (j3 * this.a.d)));
    }

    @Override // defpackage.clvg
    public final long c() {
        return this.e;
    }
}

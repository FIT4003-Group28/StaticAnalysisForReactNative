package defpackage;
/* compiled from: PG */
/* renamed from: bbh  reason: default package */
/* loaded from: classes2.dex */
final class bbh implements bbg {
    private final long[] a;
    private final long[] b;
    private final long c;
    private final long d;

    public bbh(long[] jArr, long[] jArr2, long j, long j2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.azy
    public final long a() {
        return this.c;
    }

    @Override // defpackage.azy
    public final azw b(long j) {
        int ah = pxi.ah(this.a, j, true);
        azz azzVar = new azz(this.a[ah], this.b[ah]);
        if (azzVar.b < j) {
            long[] jArr = this.a;
            if (ah != jArr.length - 1) {
                int i = ah + 1;
                return new azw(azzVar, new azz(jArr[i], this.b[i]));
            }
        }
        return new azw(azzVar, azzVar);
    }

    @Override // defpackage.azy
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bbg
    public final long e() {
        return this.d;
    }

    @Override // defpackage.bbg
    public final long f(long j) {
        return this.a[pxi.ah(this.b, j, true)];
    }
}

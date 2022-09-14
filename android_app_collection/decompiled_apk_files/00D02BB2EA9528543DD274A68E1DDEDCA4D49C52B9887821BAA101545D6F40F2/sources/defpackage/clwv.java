package defpackage;
/* compiled from: PG */
/* renamed from: clwv  reason: default package */
/* loaded from: classes5.dex */
final class clwv implements clwu {
    private final long[] a;
    private final long[] b;
    private final long c;
    private final long d;

    public clwv(long[] jArr, long[] jArr2, long j, long j2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.clvg
    public final boolean a() {
        return true;
    }

    @Override // defpackage.clvg
    public final clve b(long j) {
        int af = cmny.af(this.a, j, true);
        clvh clvhVar = new clvh(this.a[af], this.b[af]);
        if (clvhVar.b < j) {
            long[] jArr = this.a;
            if (af != jArr.length - 1) {
                int i = af + 1;
                return new clve(clvhVar, new clvh(jArr[i], this.b[i]));
            }
        }
        return new clve(clvhVar, clvhVar);
    }

    @Override // defpackage.clvg
    public final long c() {
        return this.c;
    }

    @Override // defpackage.clwu
    public final long e(long j) {
        return this.a[cmny.af(this.b, j, true)];
    }

    @Override // defpackage.clwu
    public final long f() {
        return this.d;
    }
}

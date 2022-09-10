package defpackage;
/* compiled from: PG */
/* renamed from: clux  reason: default package */
/* loaded from: classes5.dex */
public final class clux implements clvg {
    private final cluz a;
    private final long b;

    public clux(cluz cluzVar, long j) {
        this.a = cluzVar;
        this.b = j;
    }

    private final clvh d(long j, long j2) {
        return new clvh((j * 1000000) / this.a.e, this.b + j2);
    }

    @Override // defpackage.clvg
    public final boolean a() {
        return true;
    }

    @Override // defpackage.clvg
    public final clve b(long j) {
        cmmn.e(this.a.k);
        cluz cluzVar = this.a;
        cluy cluyVar = cluzVar.k;
        long[] jArr = cluyVar.a;
        long[] jArr2 = cluyVar.b;
        int af = cmny.af(jArr, cluzVar.b(j), false);
        long j2 = 0;
        long j3 = af == -1 ? 0L : jArr[af];
        if (af != -1) {
            j2 = jArr2[af];
        }
        clvh d = d(j3, j2);
        if (d.b == j || af == jArr.length - 1) {
            return new clve(d, d);
        }
        int i = af + 1;
        return new clve(d, d(jArr[i], jArr2[i]));
    }

    @Override // defpackage.clvg
    public final long c() {
        return this.a.a();
    }
}

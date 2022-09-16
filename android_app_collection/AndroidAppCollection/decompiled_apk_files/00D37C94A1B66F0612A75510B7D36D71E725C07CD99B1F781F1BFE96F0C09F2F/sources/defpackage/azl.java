package defpackage;
/* compiled from: PG */
/* renamed from: azl  reason: default package */
/* loaded from: classes2.dex */
public final class azl implements azy {
    private final azn a;
    private final long b;

    public azl(azn aznVar, long j) {
        this.a = aznVar;
        this.b = j;
    }

    private final azz d(long j, long j2) {
        return new azz((j * 1000000) / this.a.e, this.b + j2);
    }

    @Override // defpackage.azy
    public final long a() {
        return this.a.a();
    }

    @Override // defpackage.azy
    public final azw b(long j) {
        ptx.b(this.a.k);
        azn aznVar = this.a;
        azm azmVar = aznVar.k;
        long[] jArr = azmVar.a;
        long[] jArr2 = azmVar.b;
        int ah = pxi.ah(jArr, aznVar.b(j), false);
        long j2 = 0;
        long j3 = ah == -1 ? 0L : jArr[ah];
        if (ah != -1) {
            j2 = jArr2[ah];
        }
        azz d = d(j3, j2);
        if (d.b == j || ah == jArr.length - 1) {
            return new azw(d, d);
        }
        int i = ah + 1;
        return new azw(d, d(jArr[i], jArr2[i]));
    }

    @Override // defpackage.azy
    public final boolean c() {
        return true;
    }
}

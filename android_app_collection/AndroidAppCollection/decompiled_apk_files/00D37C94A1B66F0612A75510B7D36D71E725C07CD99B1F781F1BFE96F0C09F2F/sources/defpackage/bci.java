package defpackage;
/* compiled from: PG */
/* renamed from: bci  reason: default package */
/* loaded from: classes2.dex */
final class bci implements bcn {
    private final azn b;
    private final azm c;
    public long a = -1;
    private long d = -1;

    public bci(azn aznVar, azm azmVar) {
        this.b = aznVar;
        this.c = azmVar;
    }

    @Override // defpackage.bcn
    public final long a(azf azfVar) {
        long j = this.d;
        if (j >= 0) {
            this.d = -1L;
            return -(j + 2);
        }
        return -1L;
    }

    @Override // defpackage.bcn
    public final azy b() {
        ptx.e(this.a != -1);
        return new azl(this.b, this.a);
    }

    @Override // defpackage.bcn
    public final void c(long j) {
        long[] jArr = this.c.a;
        this.d = jArr[pxi.ah(jArr, j, true)];
    }
}

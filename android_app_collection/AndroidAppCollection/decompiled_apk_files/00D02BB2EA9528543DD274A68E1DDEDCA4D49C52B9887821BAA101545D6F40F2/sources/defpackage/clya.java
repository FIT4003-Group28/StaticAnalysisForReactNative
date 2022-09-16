package defpackage;
/* compiled from: PG */
/* renamed from: clya  reason: default package */
/* loaded from: classes5.dex */
final class clya implements clyg {
    private final cluz b;
    private final cluy c;
    public long a = -1;
    private long d = -1;

    public clya(cluz cluzVar, cluy cluyVar) {
        this.b = cluzVar;
        this.c = cluyVar;
    }

    @Override // defpackage.clyg
    public final void a(long j) {
        long[] jArr = this.c.a;
        this.d = jArr[cmny.af(jArr, j, true)];
    }

    @Override // defpackage.clyg
    public final clvg b() {
        cmmn.c(this.a != -1);
        return new clux(this.b, this.a);
    }

    @Override // defpackage.clyg
    public final long c(cluk clukVar) {
        long j = this.d;
        if (j >= 0) {
            this.d = -1L;
            return -(j + 2);
        }
        return -1L;
    }
}

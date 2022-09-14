package defpackage;
/* compiled from: PG */
/* renamed from: akgi  reason: default package */
/* loaded from: classes2.dex */
final class akgi implements akgn<aklg> {
    private final int a;
    private final int b;

    public akgi(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.akgn
    public final cqmj<aklg> a(cqmp<aklg>... cqmpVarArr) {
        cqnf bq;
        cqmp[] cqmpVarArr2 = new cqmp[3];
        cqmpVarArr2[0] = cqgr.cd(-1);
        int i = this.a;
        if (i == -1) {
            bq = cqgr.bp(-2);
        } else {
            bq = cqgr.bq(cqrp.d(i));
        }
        cqmpVarArr2[1] = bq;
        cqmpVarArr2[2] = cqgr.bD(cqrp.d(this.b));
        cqmj<aklg> fY = cqgr.fY(cqmpVarArr2);
        fY.f(cqmpVarArr);
        return fY;
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: gvd  reason: default package */
/* loaded from: classes6.dex */
public class gvd extends cqiw<cqkp> {
    @SafeVarargs
    public static <T extends cqkp> cqmj<T> d(boolean z, cqmp<T>... cqmpVarArr) {
        cqmp[] cqmpVarArr2 = new cqmp[4];
        cqmpVarArr2[0] = cqgr.cd(-1);
        cqmpVarArr2[1] = cqgr.bq(cqrp.d(1.0d));
        cqmpVarArr2[2] = cqgr.dQ(z ? irh.e() : cqrp.d(dcyn.a));
        cqmpVarArr2[3] = iuh.b(cqgr.bw(16));
        cqmj<T> fY = cqgr.fY(cqmpVarArr2);
        fY.f(cqmpVarArr);
        return fY;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public cqmj<cqkp> a() {
        return d(true, new cqmp[0]);
    }
}

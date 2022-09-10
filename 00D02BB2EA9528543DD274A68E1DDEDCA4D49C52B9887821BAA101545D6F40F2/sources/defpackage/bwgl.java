package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bwgl  reason: default package */
/* loaded from: classes4.dex */
public abstract class bwgl extends cqiw<bwhz> {
    public static final cqrp c = cqrp.d(64.0d);
    private static final Integer d = 225;
    private static final cqrp e = cqrp.d(48.0d);
    @dzsi
    protected final cqnm<bwhz> a;
    protected final cqnm<bwhz> b;

    public bwgl(@dzsi cqnm<bwhz> cqnmVar, cqnm<bwhz> cqnmVar2) {
        super(cqnmVar, cqnmVar2);
        this.a = cqnmVar;
        this.b = cqnmVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final cqmj<bwhz> e() {
        cqmp cqmpVar = this.a;
        if (cqmpVar == null) {
            cqmpVar = cqmp.e;
        }
        cqmp[] cqmpVarArr = new cqmp[3];
        cqmpVarArr[0] = cqgr.cd(-1);
        cqmpVarArr[1] = cqgr.bp(-1);
        cqmp[] cqmpVarArr2 = new cqmp[7];
        cqmpVarArr2[0] = cqgr.i(Float.valueOf(0.0f));
        cqlc cqlcVar = bwgi.a;
        cqgq n = cqgr.n();
        n.j();
        n.d = d;
        Float valueOf = Float.valueOf(1.0f);
        n.a = valueOf;
        cqnf b = n.b();
        cqgq n2 = cqgr.n();
        n2.j();
        n2.d = 0;
        n2.a = valueOf;
        cqmpVarArr2[1] = cqjv.l(cqlcVar, b, n2.b());
        cqmpVarArr2[2] = cqgr.dr(1);
        cqmpVarArr2[3] = cqgr.cd(-1);
        cqmpVarArr2[4] = cqgr.bp(-2);
        cqmpVarArr2[5] = cqgr.gj(cqgr.cd(-1), cqgr.bq(c), cqgr.bw(16), cqgr.fY(cqgr.bY(cqjd.e(), cqjd.t()), cqgr.ch(e), cqgr.bR(cqrp.d(4.0d)), cqgr.cW(cqgr.q(bwgk.a)), cqgr.gc(cqgr.bw(17), cqgr.ch(irh.r()), cqgr.S(Integer.valueOf((int) R.string.CLOSE)), cqgr.eE(cqrt.g(2131232581, ibl.b())))), cqgr.gq(cqgr.bY(cqjd.c()), cqgr.cd(-2), cqgr.bp(-2), ibq.e(), irn.y(), cqgr.bw(17), cqgr.eL(Integer.valueOf((int) R.string.SHARE_SCREEN_TITLE))));
        cqmp[] cqmpVarArr3 = new cqmp[5];
        cqmpVarArr3[0] = cqgr.aD(Boolean.valueOf(this.a == null));
        cqmpVarArr3[1] = cqgr.cd(-1);
        cqmpVarArr3[2] = cqgr.bp(-1);
        cqmpVarArr3[3] = cqgr.dX(bwgj.a);
        cqmpVarArr3[4] = cqmpVar;
        cqmpVarArr2[6] = cqgr.fY(cqmpVarArr3);
        cqmpVarArr[2] = cqgr.gd(cqmpVarArr2);
        return cqgr.fY(cqmpVarArr);
    }
}

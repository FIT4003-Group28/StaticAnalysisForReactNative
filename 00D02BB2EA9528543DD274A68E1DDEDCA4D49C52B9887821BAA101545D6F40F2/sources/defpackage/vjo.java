package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: vjo  reason: default package */
/* loaded from: classes7.dex */
public final class vjo extends cqiw<zby> {
    static final cqjg a = cqjg.a();
    public static final cqtv b;
    public static final cqmn<zdg> c;
    private static final cqtv d;
    private static final cqtv e;
    private final cqjb<zby, Integer> f;

    static {
        cqrp d2 = cqrp.d(12.0d);
        d = d2;
        e = cqrp.d(15.0d);
        b = cqsg.g(d2, vkl.c);
        c = cqmn.a(cqgr.ce(cqrp.d(18.0d)), cqgr.bq(cqrp.d(18.0d)));
    }

    vjo() {
        this(null);
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, zby zbyVar, Context context, cqiv cqivVar) {
        dcdc<zdg> o = zbyVar.o();
        int size = o.size();
        for (int i2 = 0; i2 < size; i2++) {
            cqivVar.a(new vjn(), o.get(i2));
        }
    }

    public vjo(byte[] bArr) {
        super(false);
        this.f = new vjl();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<zby> a() {
        fzh w = B().w();
        cqkv cqkvVar = fzj.S;
        cqmp[] cqmpVarArr = {cqgr.L(false), cqgr.P(false), cqgr.dr(0), cqgr.bp(-2), cqgr.fO(new uou(), B(), new cqmp[0]), fzj.a(cqgr.L(false), cqgr.P(false), cqgr.ck(C()), cqjv.i(iug.ITEM_SHUFFLER_LISTENER, w, fzj.S), cqgr.aT(a), cqgr.fD(B().l()), cqgr.dU(vkl.e), cqgr.dB(vkl.e), cqqx.F(), cqgr.br(this.f), cqgr.cd(-1), cqgr.bG(vkl.e))};
        cqmp[] cqmpVarArr2 = {cqgr.cd(-1), cqgr.bq(cqrp.d(1.0d)), cqgr.x(ibm.i())};
        cqtv[] cqtvVarArr = {cqsg.d(cqrp.d(2.0d), irh.d())};
        cqmp[] cqmpVarArr3 = {cqgr.bv(3), cqgr.aC(true), cqgr.bp(-2), cqgr.cd(-2), cqgr.bw(16), cqgr.dQ(cqrp.d(dcyn.a)), cqgr.aD(cqjv.v(B().t())), ibq.p(), cqgr.eU(ibm.t()), cqgr.eI(B().t())};
        cqmp[] cqmpVarArr4 = {cqgr.bv(3), cqgr.aC(true), cqgr.bp(-2), cqgr.cd(-2), cqgr.bw(16), cqgr.dQ(cqrp.d(8.0d)), cqgr.aD(cqjv.v(B().u())), ibq.p(), cqgr.eU(ibm.o()), cqjv.d(cqfe.TEXT, cqiq.c("(%s)", cqgr.fU(new Object[]{B().u()})))};
        cqmp[] cqmpVarArr5 = {cqgr.ca(Float.valueOf(1.0f))};
        cqtv cqtvVar = e;
        cqmj gd = cqgr.gd(cqgr.bv(3), cqgr.dr(0), cqgr.x(ibm.b()), cqgr.dQ(cqsg.d(cqtvVarArr)), cqgr.gq(cqmpVarArr3), cqgr.gq(cqmpVarArr4), cqgr.gm(cqmpVarArr5), cqgr.gq(cqgr.bv(3), cqgr.dz(cqtvVar, cqtvVar, cqtvVar, cqtvVar), cqgr.dF(cqsg.d(cqrp.d(2.0d), irh.d())), cqgr.bp(-2), cqgr.cd(-2), cqgr.bw(16), iue.b(cjtd.a(dtxn.cp)), cqgr.cU(B().g()), cqgr.x(irn.N()), ibq.p(), cqgr.eU(ibm.x()), cqgr.l(false), cqgr.eL(Integer.valueOf((int) R.string.DIRECTIONS_DONE_EDITING_DESTINATIONS))));
        gd.f(cqgr.aD(B().s()), cqgr.bp(-2), cqgr.cd(-1));
        return cqgr.gd(cqgr.L(false), cqgr.P(false), cqgr.dr(1), cqgr.bp(-2), cqgr.cd(-1), cqgr.gd(cqmpVarArr), cqgr.gc(cqmpVarArr2), gd);
    }
}

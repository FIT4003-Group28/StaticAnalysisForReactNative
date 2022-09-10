package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: brsw  reason: default package */
/* loaded from: classes4.dex */
public final class brsw extends brtf<bruz> {
    public static final cqjg a = cqjg.a();
    private final boolean h;

    public brsw() {
        this(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.brtf, defpackage.cqiw
    public final cqmj<bruz> a() {
        Object obj;
        cqmj<bruz> p = p();
        if (this.h) {
            obj = cqgr.cU(((bruz) B()).q());
        } else {
            obj = cqmp.e;
        }
        p.g(obj);
        return p;
    }

    @Override // defpackage.brtf
    protected final cqmp<bruz> e() {
        return cqgr.fY(cqgr.bp(-2), cqgr.cd(-2), cqgr.aJ(8388613), cqgr.fY(cqic.d(cqjv.t(cqjv.A(((bruz) B()).F(), 3), cqjv.A(((bruz) B()).F(), 1)), new cqmp[0]), cqgr.fO(new aeou(), ((bruz) B()).G(), new cqmp[0])));
    }

    @Override // defpackage.brtf
    protected final cqmj<bruz> f() {
        cqmj<bruz> f = super.f();
        f.f(cqjv.k(((bruz) B()).o(), cqgr.bD(cqrp.d(4.0d)), cqgr.bD(cqrp.d(dcyn.a))));
        return f;
    }

    @Override // defpackage.brtf
    protected final cqmp<bruz> h() {
        return cqgr.fO(bfka.g(), ((bruz) B()).m(), cqgr.bp(-1));
    }

    @Override // defpackage.brtf
    protected final cqmp<bruz> j() {
        cqmp aD;
        cqnm cqnmVar;
        boolean ae = ((btvq) btsr.a(btvq.class)).rp().getPlaceSheetParameters().ae();
        cqmm fQ = cqgr.fQ(new bjkj(), ((bruz) B()).l(), new cqmp[0]);
        Boolean t = cqjv.t(cqjv.v(((bruz) B()).l()), ((bruz) B()).al());
        cqmp[] cqmpVarArr = new cqmp[6];
        cqmpVarArr[0] = cqgr.dr(1);
        cqmpVarArr[1] = cqgr.x(irg.a());
        cqmpVarArr[2] = cqgr.fY(cqgr.aT(a), cqic.a(cqjv.v(((bruz) B()).a()), new cqmp[0]), cqgr.cd(-1), cqgr.bp(-2), cqgr.dQ(irh.c()), cqgr.dF(irh.c()), cqjv.k(cqjv.r(((bruz) B()).d(), cqjv.u(cqjv.v(((bruz) B()).P()))), cqgr.dU(cqsg.g(cqrp.d(12.0d), cqrp.d(6.0d))), cqgr.dU(cqsg.g(cqrp.d(8.0d), cqrp.d(6.0d)))), cqgr.dB(cqsg.g(irh.c(), cqrp.d(6.0d))), cqgr.P(false), cqgr.L(false), cqgr.fQ(new brsf(true), ((bruz) B()).a(), new cqmp[0]));
        cqmp[] cqmpVarArr2 = new cqmp[5];
        if (ae) {
            aD = cqic.a(cqjv.v(((bruz) B()).n()), new cqmp[0]);
        } else {
            aD = cqgr.aD(cqjv.v(((bruz) B()).n()));
        }
        cqmpVarArr2[0] = aD;
        cqmpVarArr2[1] = cqgr.cd(-1);
        cqmpVarArr2[2] = cqgr.bp(-2);
        cqmpVarArr2[3] = gvb.d(false, new cqmp[0]);
        cqmpVarArr2[4] = cqgr.fQ(new bfws(irh.c()), ((bruz) B()).n(), new cqmp[0]);
        cqmpVarArr[3] = cqgr.fY(cqmpVarArr2);
        cqmpVarArr[4] = gvb.d(false, cqgr.aD(t));
        if (ae) {
            cqnmVar = cqgr.fY(cqic.a(t, new cqmp[0]), fQ);
        } else {
            fQ.b(cqgr.aD(t));
            cqnmVar = fQ;
        }
        cqmpVarArr[5] = cqnmVar;
        return cqgr.gd(cqmpVarArr);
    }

    @Override // defpackage.brtf
    protected final cqmj<bruz> k() {
        cqmj<bruz> k = super.k();
        k.g(cqgr.fI(((bruz) B()).w()));
        return k;
    }

    @Override // defpackage.brtf
    protected final cqmj<bruz> l() {
        cqmj<bruz> l = super.l();
        l.f(cqgr.fr(((bruz) B()).t()));
        return l;
    }

    @Override // defpackage.brtf
    protected final cqmj<bruz> m() {
        return cqgr.fY(cqgr.aR(Integer.valueOf((int) R.id.nav_place_tile_loading_spinner)), cqgr.cd(-1), cqjv.k(((bruz) B()).al(), cqgr.bq(cqsg.d(cqrp.f(19.0d), cqrp.d(6.0d))), cqgr.bq(cqrp.f(57.0d))), cqgr.gg(cqgr.ch(irh.r()), cqgr.bw(8388627), cqgr.bi(false)));
    }

    @Override // defpackage.brtf
    protected final cqmp<bruz> n() {
        return cqgr.fY(cqgr.cd(-2), cqgr.bp(-2), cqgr.bY(cqjd.m(c), cqjd.f()), cqgr.fY(cqic.d(cqjv.t(cqjv.A(((bruz) B()).E(), 3), cqjv.A(((bruz) B()).E(), 1)), new cqmp[0]), cqgr.fO(new aeoy(true), ((bruz) B()).G(), new cqmp[0])));
    }

    public brsw(boolean z) {
        super(Boolean.valueOf(z));
        this.h = z;
    }

    @Override // defpackage.brtf
    protected final void o(int i, brvd brvdVar, Context context, cqiv cqivVar) {
        if (i == 1) {
            List<? extends bevj> R = brvdVar.A().R();
            if (R == null) {
                return;
            }
            for (int i2 = 0; i2 < Math.min(R.size(), 3); i2++) {
                cqivVar.a(new bevg(), R.get(i2));
            }
            return;
        }
        super.RI(i, brvdVar, context, cqivVar);
    }
}

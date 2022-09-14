package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aucv  reason: default package */
/* loaded from: classes2.dex */
public final class aucv extends cqiw<audp> {
    public static final cqrp a = cqrp.d(60.0d);
    public static final cqrp b = cqrp.d(55.0d);
    public static final cqrp c = cqrp.d(2.0d);
    public static final cqrp d = cqrp.d(3.0d);
    public static final cqrp e = cqrp.d(10.0d);
    public static final cqrp f = cqrp.d(27.5d);
    public static final cqss g;
    public static final cqss h;
    public static final cqss i;
    public static final cqss j;
    public static final cqrp k;
    public static final cqrp l;
    public static final cqrp m;
    public static final cqrp n;
    public static final cqrp o;
    public static final cqrp p;
    public static final cqrp q;
    public static final cqrp r;
    public static final cqrp s;
    public static final cqrp t;
    public static final cqrp u;
    public static final cqrp v;
    public static final cqrp w;
    public static final cqrp x;

    static {
        cqrp.d(25.0d);
        g = cqta.e(1120284);
        h = cqta.e(14906368);
        i = cqta.e(15898880);
        j = cqta.e(14233637);
        k = cqrp.d(50.0d);
        l = cqrp.d(55.0d);
        m = cqrp.d(13.0d);
        n = cqrp.d(11.0d);
        o = cqrp.d(26.0d);
        p = cqrp.d(25.0d);
        q = cqrp.d(9.0d);
        r = cqrp.d(dcyn.a);
        s = cqrp.d(7.0d);
        t = cqrp.d(dcyn.a);
        u = cqrp.d(14.0d);
        v = cqrp.d(10.0d);
        w = cqrp.d(8.0d);
        x = cqrp.d(6.0d);
    }

    public static CharSequence e(audp audpVar, Context context) {
        String string = context.getResources().getString(R.string.SPEEDOMETER_CONTENT_DESCRIPTION);
        String quantityString = context.getResources().getQuantityString(audpVar.m().intValue(), audpVar.o().intValue());
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(quantityString).length());
        sb.append(string);
        sb.append(" ");
        sb.append(quantityString);
        return String.format(sb.toString(), audpVar.n());
    }

    private static final cqnf<audp> f() {
        return cqgr.dI(auch.a);
    }

    private static final cqnf<audp> h() {
        return cqgr.dT(aucd.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<audp> a() {
        final cqlc cqlcVar = aubr.a;
        cqnf w2 = cqgr.w(new cqjb(cqlcVar) { // from class: aubs
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                cqlc cqlcVar2 = this.a;
                audp audpVar = (audp) cqkpVar;
                cqrp cqrpVar = aucv.a;
                return iva.e(irm.c((cqtv) cqlcVar2.a(audpVar), cqta.e(audpVar.e().intValue())), irm.d((cqtv) cqlcVar2.a(audpVar), cqta.e(audpVar.f().intValue())));
            }
        });
        cqnf w3 = cqgr.w(new cqjb(cqlcVar) { // from class: aubt
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                cqlc cqlcVar2 = this.a;
                audp audpVar = (audp) cqkpVar;
                cqrp cqrpVar = aucv.a;
                return iva.e(irm.c((cqtv) cqlcVar2.a(audpVar), cqta.e(audpVar.a().intValue())), irm.d((cqtv) cqlcVar2.a(audpVar), cqta.e(audpVar.b().intValue())));
            }
        });
        cqnf y = cqgr.y(new cqlc(cqlcVar) { // from class: aubu
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar2 = this.a;
                audp audpVar = (audp) cqkpVar;
                cqrp cqrpVar = aucv.a;
                return iva.e(irm.a((cqtv) cqlcVar2.a(audpVar)), irm.b((cqtv) cqlcVar2.a(audpVar)));
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
        cqnf y2 = cqgr.y(new cqlc(cqlcVar) { // from class: aubv
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return aclp.a(iva.b(ibl.b(), aucv.g), iva.b(ibl.b(), aucv.g), cqrp.d(dcyn.a), (cqtv) this.a.a((audp) cqkpVar));
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
        return cqgr.fY(cqgr.aI(aubc.a), cqgr.bX(aubn.a), cqgr.ce(audm.a), cqgr.bs(aubq.a), cqmp.e, cqgr.dk(aubx.a), cqgr.fH(auci.a), cqjv.l(aubw.a, cqjv.l(auby.a, cqjv.l(aubz.a, w2, cqjv.l(auca.a, w3, y)), y2), cqjv.l(aucb.a, y, y2)), cqgr.fY(cqgr.aR(Integer.valueOf((int) R.id.speed_limit)), cqic.f(aucp.a, new cqmp[0]), cqgr.dI(aucf.a), cqgr.aA(aucq.a), cqgr.K(aucr.a), cqgr.cW(cqgr.q(aucs.a)), iue.c(auct.a), cqgr.fP(new audg(), aucu.a, new cqmp[0])), cqgr.fY(cqgr.az(true), cqgr.aX(aubd.a), cqgr.U(aube.a), cqgr.fY(cqgr.aR(Integer.valueOf((int) R.id.speedometer)), cqic.f(aubf.a, new cqmp[0]), cqgr.K(aubg.a), cqgr.cW(cqgr.q(aubh.a)), cqgr.aX(aubi.a), cqgr.U(aubj.a), iue.c(aubk.a), cqgr.cd(-2), cqgr.bp(-1), cqgr.bT(aucc.a), cqgr.bw(8388613), cqgr.gq(cqgr.cN(aucg.a), h(), f(), cqgr.dE(auce.a), cqgr.bp(-1), cqgr.bw(17), cqgr.aJ(17), cqgr.eS(Integer.valueOf((int) R.style.NavSpeedometerTextAppearance)), cqgr.fi(aucj.a), cqjv.l(aucm.a, cqjv.k(false, cqgr.eW(aucn.a), cqgr.eW(auco.a)), cqgr.eU(iva.b(ire.i(), ire.d()))), cqgr.aW(2), cqgr.eM(aubl.a)), cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(81), h(), f(), cqgr.dE(aucl.a), cqgr.fi(auck.a), cqgr.aJ(17), cqgr.fj(1), cqjv.l(aubm.a, cqgr.eV(aubo.a), cqgr.eU(iva.b(ire.i(), ire.d()))), cqgr.aW(2), cqgr.eM(aubp.a)))));
    }
}

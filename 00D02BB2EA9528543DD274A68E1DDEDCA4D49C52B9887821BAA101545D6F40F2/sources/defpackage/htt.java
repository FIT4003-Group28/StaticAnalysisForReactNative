package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: htt  reason: default package */
/* loaded from: classes6.dex */
public final class htt extends cqiw<izu> {
    public static final cqjg a = cqjg.a();
    public static final cqjg b = cqjg.a();
    public static final cqjg c = cqjg.a();
    public static final cqjg d = cqjg.a();
    public static final cqjg e = cqjg.a();

    private static cqmn<izu> e(int i) {
        cqgq n = cqgr.n();
        n.d = 800;
        n.e = Long.valueOf(i * 300);
        n.a = Float.valueOf(1.0f);
        return cqmn.a(cqgr.i(0), n.b());
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, izu izuVar, Context context, cqiv cqivVar) {
        iyy q = izuVar.q();
        if (q == null) {
            return;
        }
        cqivVar.a(new gtw(), q);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<izu> a() {
        final cqjb cqjbVar = hta.a;
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        cqgq n = cqgr.n();
        n.d = 800;
        n.h(cqrp.d(dcyn.a));
        n.a = valueOf;
        return cqgr.gk(cqgr.bw(17), cqjv.o(cqhf.a, cqgr.ce(cqrp.f(500.0d)), cqgr.cd(-2)), cqgr.ca(valueOf), cqgr.gd(cqgr.bw(17), cqgr.bp(-2), cqgr.cd(-2), cqgr.fF(htk.a), cqgr.dr(1), jfx.a(cqgr.aI(htl.a), cqgr.bp(-2), cqgr.cd(-2), cqgr.bw(1), cqgr.aT(a), cqgr.i(valueOf2), cqgr.fr(cqrp.d(40.0d)), n.b(), cqgr.gc(cqgr.bq(cqrp.d(85.0d)), cqgr.ce(cqrp.d(164.0d)), cqgr.ei(ImageView.ScaleType.CENTER_INSIDE), cqgr.ei(ImageView.ScaleType.CENTER_CROP), cqgr.eG(htm.a))), cqgr.gq(cqgr.bp(-2), cqgr.cd(-2), e(1), cqgr.bw(1), cqgr.aT(b), cqgr.bV(cqrp.d(28.0d)), cqgr.co(cqrp.f(4.0d), false), cqgr.cB(3), cqgr.ar(TextUtils.TruncateAt.END), irn.c(), cqgr.eN(4), cqgr.eM(htn.a), cqgr.eU(ibl.b())), cqgr.gq(cqgr.bp(-2), cqgr.cd(-2), cqgr.bR(irh.d()), cqgr.bG(irh.d()), e(2), cqgr.bV(cqrp.d(16.0d)), cqgr.co(cqrp.f(6.0d), false), cqgr.aT(c), irn.j(), cqgr.eN(4), cqgr.bw(1), cqgr.cO(LinkMovementMethod.getInstance()), cqgr.eM(hto.a), cqgr.eU(ire.x()), cqgr.K(htp.a), cqgr.cW(cqgr.q(htq.a))), cqgr.gd(cqgr.aI(htr.a), cqgr.bp(-2), cqgr.cd(-2), e(3), cqgr.dr(0), cqgr.bw(1), cqgr.aT(e), iue.c(hts.a), cqgr.ck(C())), cqgr.gd(cqgr.bp(-2), cqjv.o(cqjbVar, cqgr.cd(-1), cqgr.cd(-2)), cqgr.bV(cqrp.d(22.0d)), cqgr.bD(cqrp.d(16.0d)), cqgr.bw(1), cqjv.o(cqjbVar, cqgr.cL(cqrp.d(dcyn.a)), cqgr.cL(cqrp.d(200.0d))), cqjv.o(cqjbVar, cqgr.dr(0), cqgr.dr(1)), cqgr.aT(d), cqgr.fY(cqgr.aI(htb.a), cqgr.bq(irh.a()), cqjv.o(cqjbVar, cqgr.cd(0), cqgr.cd(-1)), cqjv.o(cqjbVar, cqgr.ca(valueOf), cqgr.ca(valueOf2)), e(3), cqgr.cW(cqgr.q(htc.a)), iue.c(htd.a), its.c(hte.a, cqkz.a(null), cqgr.cd(-1), cqgr.bw(17), its.b(irn.X()), cqgr.aJ(17), cqgr.l(true), cqgr.eU(ibm.x()))), cqgr.fY(cqgr.bq(irh.a()), e(4), cqjv.o(cqjbVar, cqgr.cd(0), cqgr.cd(-1)), cqjv.o(cqjbVar, cqgr.ca(valueOf), cqgr.ca(valueOf2)), cqjv.o(new cqjb(cqjbVar) { // from class: htf
            private final cqjb a;

            {
                this.a = cqjbVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                cqjb cqjbVar2 = this.a;
                izu izuVar = (izu) cqkpVar;
                cqjg cqjgVar = htt.a;
                boolean booleanValue = ((Boolean) cqjbVar2.a(izuVar, context)).booleanValue();
                boolean z = false;
                if (!booleanValue && izuVar.f().booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, cqgr.bV(cqrp.d(4.0d)), cqgr.bV(cqrp.d(dcyn.a))), cqjv.o(new cqjb(cqjbVar) { // from class: htg
            private final cqjb a;

            {
                this.a = cqjbVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                cqjb cqjbVar2 = this.a;
                izu izuVar = (izu) cqkpVar;
                cqjg cqjgVar = htt.a;
                boolean booleanValue = ((Boolean) cqjbVar2.a(izuVar, context)).booleanValue();
                boolean z = false;
                if (booleanValue && izuVar.f().booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, cqgr.bR(cqrp.d(16.0d)), cqgr.bR(cqrp.d(dcyn.a))), cqgr.cW(cqgr.q(hth.a)), iue.c(hti.a), its.c(htj.a, cqkz.a(null), cqgr.cd(-1), cqgr.bw(17), its.b(irn.W()), cqgr.aJ(17), cqgr.l(true), cqgr.eU(ibm.b()))))));
    }
}

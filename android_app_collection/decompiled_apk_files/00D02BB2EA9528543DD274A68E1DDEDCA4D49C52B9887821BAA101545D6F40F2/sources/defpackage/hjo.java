package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.gmm.base.views.squeezedlabel.SqueezedLabelView;
/* compiled from: PG */
/* renamed from: hjo  reason: default package */
/* loaded from: classes6.dex */
public final class hjo extends cqiw<oxt> {
    public static final /* synthetic */ int a = 0;
    private static final cqtv b = cqrp.f(18.0d);
    private static final cqtv c = cqrp.f(18.0d);
    private static final cqrp d = cqrp.f(4.0d);
    private static final cqrp e = cqrp.d(12.0d);
    private static final cqrp f = cqrp.d(4.0d);

    public static boolean d(oxt oxtVar) {
        return oxtVar.b() != null;
    }

    public static boolean e(oxt oxtVar) {
        return oxtVar.c() != null && oxtVar.c().length() > 0;
    }

    private static cqjb<oxt, Boolean> f(final int i) {
        return new cqjb(i) { // from class: hjf
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                int i2;
                int i3 = this.a;
                oxt oxtVar = (oxt) cqkpVar;
                int i4 = hjo.a;
                boolean z = true;
                if (oxtVar.q().booleanValue() && !oxtVar.m().booleanValue()) {
                    i2 = 1;
                } else if (!oxtVar.r().booleanValue()) {
                    i2 = 2;
                } else {
                    i2 = oxtVar.m().booleanValue() ? 4 : 3;
                }
                if (i2 != i3) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        };
    }

    private static final cqmp<oxt> h() {
        return cqmn.a(cqgr.cd(-1), cqgr.bp(-2), ibq.p(), cqgr.eM(hih.a), cqgr.co(cqrp.f(5.0d), true), ibq.x());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<oxt> a() {
        cqnf c2 = iue.c(his.a);
        cqrp cqrpVar = d;
        cqtv cqtvVar = b;
        return cqgr.gd(cqgr.bV(cqrp.d(5.0d)), cqgr.dr(1), cqgr.bp(-2), cqgr.cd(-1), cqgr.dQ(ibn.g()), cqgr.dF(ibn.g()), iue.c(hjd.a), cqgr.gd(cqgr.az(true), cqgr.aW(1), cqgr.dr(0), cqgr.aJ(16), cqgr.bD(cqrpVar), jfb.a(cqgr.aI(hjh.a), cqgr.bq(cqtvVar), cqgr.cd(-2), jfb.e(), jfb.c(hji.a)), jgn.a(cqgr.aI(hjj.a), cqgr.bp(-2), cqgr.cd(-2), cqgr.aJ(16), cqgr.bT(hjk.a), cqgr.dQ(cqrp.d(8.0d)), cqgr.dF(cqrp.d(8.0d)), cqgr.dU(cqrp.d(2.0d)), cqgr.dB(cqrp.d(2.0d)), jgn.b(cqrp.d(4.0d)), cqgr.z(ibm.J()), cqgr.V(hjl.a), iue.c(hjm.a), SqueezedLabelView.c(SqueezedLabelView.d(cqrp.f(12.0d)), cqgr.aZ(false), cqgr.eU(ibm.N()), cqgr.fe(irn.b), cqgr.eM(hjn.a))), cqgr.fP(new grf(hii.a), hij.a, cqgr.aI(hik.a)), cqgr.gq(cqgr.aI(hil.a), cqgr.bq(cqtvVar), cqgr.cd(-2), cqgr.dT(him.a), cqgr.dU(cqrp.d(1.0d)), ibq.q(), cqgr.V(hin.a), cqgr.eM(hio.a)), cqgr.gq(cqgr.aF(cqjv.x(hip.a)), cqgr.bq(c), cqgr.cd(-2), cqgr.bT(hiq.a), cqgr.dU(cqrp.d(1.0d)), ibq.q(), cqgr.eU(ibm.D()), cqgr.eM(hir.a))), cqgr.fR(new cdsi(), hit.a, cqgr.dB(cqrpVar)), cqgr.fR(new hgt(), hiu.a, cqgr.dB(cqrpVar)), cqgr.fY(cqgr.aF(cqjv.x(hiv.a)), cqgr.cd(-1), cqgr.bp(-2), cqgr.V(hiw.a), cqgr.gq(cqgr.aH(f(2)), h(), cqgr.cD(hix.a), cqgr.ar(TextUtils.TruncateAt.END), c2), bzyz.a(cqgr.aH(f(3)), bzyz.b(hiy.a), bzyz.c(hiz.a), bzyz.d()), cqgr.gq(cqgr.aH(f(4)), h(), cqgr.cB(Integer.MAX_VALUE), c2), jef.a(cqgr.aH(f(1)), h(), itj.d(3), cqgr.cH(ibn.a()), c2)), cqgr.gq(cqgr.aF(cqjv.x(hja.a)), ibq.q(), cqgr.dU(e), cqgr.dB(f), cqgr.eM(hjb.a)), cqgr.gq(cqgr.aF(cqjv.x(hjc.a)), ibq.q(), cqgr.eM(hje.a)), cqgr.fR(new cjcr(dtyd.ds), hjg.a, new cqmp[0]));
    }
}

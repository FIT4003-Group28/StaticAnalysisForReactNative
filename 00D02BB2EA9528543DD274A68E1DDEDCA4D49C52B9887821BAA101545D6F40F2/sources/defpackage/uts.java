package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: uts  reason: default package */
/* loaded from: classes7.dex */
public final class uts extends cqiw<zbt> {
    public static final /* synthetic */ int a = 0;
    private static final cjtd b = cjtd.a(dtya.eh);
    private static final cqlc<zbt, CharSequence> c = cqkz.b(utj.a);

    private final cqmj<zbt> e(cqlc<zbt, Boolean> cqlcVar, int i, int i2) {
        return cqgr.gd(cqic.f(cqlcVar, new cqmp[0]), cqgr.dr(1), cqgr.dU(cqrp.d(15.0d)), cqgr.gd(cqgr.dr(1), cqgr.J(true), cqgr.cW(cqgr.q(utp.a)), cqgr.gq(cqmn.a(ibq.x(), vlb.a(), cqgr.eL(Integer.valueOf(i)))), cqgr.gq(cqgr.cd(-2), cqgr.dB(cqrp.d(15.0d)), cqgr.eU(iva.b(cqrt.c(R.color.mod_google_dark_blue700), ibl.D())), vlb.a(), cqgr.eL(Integer.valueOf((int) R.string.LEARN_MORE)), iue.b(b))), cqgr.gd(cqgr.dr(1), cqgr.dB(cqrp.d(20.0d)), cqgr.ck(D(i2)), cqgr.bp(-2)), f());
    }

    private static cqmj<zbt> f() {
        return ict.n(false, new cqmp[0]);
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, zbt zbtVar, Context context, cqiv cqivVar) {
        zbt zbtVar2 = zbtVar;
        if (i == 1) {
            cqivVar.f(new vla(), zbtVar2.b());
            return;
        }
        if (i == 2) {
            if (zbtVar2.c() != null) {
                vqi vqiVar = new vqi();
                vqy c2 = zbtVar2.c();
                dbsk.s(c2);
                cqivVar.a(vqiVar, c2);
                return;
            }
        } else if (i == 3 && zbtVar2.d() != null) {
            vqi vqiVar2 = new vqi();
            vqy d = zbtVar2.d();
            dbsk.s(d);
            cqivVar.a(vqiVar2, d);
            return;
        }
        cqivVar.f(new vla(), zbtVar2.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<zbt> a() {
        cqrp d = cqrp.d(24.0d);
        return ijc.c(cqgr.dr(1), cqgr.z(ibm.b()), cqgr.gk(cqgr.bq(cqrp.d(dcyn.a)), cqgr.ca(Float.valueOf(1.0f)), cqgr.dz(d, d, d, d), cqgr.gd(cqgr.dr(1), cqgr.gq(vlb.a(), ibq.h(), ibq.x(), cqgr.eM(utn.a)), cqgr.fR(new viq(), uti.a, new cqmp[0]), cqgr.gd(cqic.f(utk.a, new cqmp[0]), cqgr.dr(1), cqgr.gq(cqgr.dU(cqrp.d(10.0d)), cqgr.dB(cqrp.d(10.0d)), vlb.a(), cqgr.eM(c), ibq.x(), cqgr.J(true), cqgr.cW(cqgr.q(uto.a)), iue.b(b)), cqgr.gd(cqgr.dr(1), cqgr.dB(cqrp.d(20.0d)), cqgr.ck(D(1)), cqgr.bp(-2)), f()), e(utl.a, R.string.DIRECTIONS_OPTIONS_AVOID_RODIZIO_AREAS_OPTION_INFO, 2), e(utm.a, R.string.DIRECTIONS_OPTIONS_AVOID_MANILA_AREAS_OPTION_INFO, 3), cqmp.e, cqgr.gd(cqgr.dU(cqrp.d(20.0d)), cqgr.dr(1), cqgr.ck(D(0)), cqgr.bp(-2)))), ijc.n(cqle.a(R.string.CANCEL_BUTTON), cqgr.q(utq.a), cqkz.a(cjtd.a(dtya.ek)), cqle.a(R.string.DONE), cqgr.q(utr.a), cqkz.a(cjtd.a(dtya.el)), new cqmp[0]));
    }
}

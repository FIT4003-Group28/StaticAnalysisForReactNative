package defpackage;

import android.content.Context;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: waq  reason: default package */
/* loaded from: classes7.dex */
public final class waq extends cqiw<zcd> {
    public static final cqtv a = cqsg.d(cqrp.f(96.0d), cqrp.d(48.0d), cqrp.d(5.0d), cqrp.d(1.0d));
    private static final cqjb<zcd, atnn> b = new wap();

    public static final boolean e(Context context) {
        return cqhl.a(context) || cqhl.c(context);
    }

    @Override // defpackage.cqiw
    public final cqmj<zcd> a() {
        cqmj fY = cqgr.fY(cqgr.cd(-1), cqgr.bq(cqrp.f(96.0d)), cqgr.bY(cqjd.f(), cqjd.e()), cqgr.x(ibo.h()), iue.b(cjtd.a(dtxw.e)), cqgr.cW(acly.a(wae.a)), cqgr.J(true), cqgr.gc(cqgr.bR(irh.b()), cqgr.bq(irh.s()), cqgr.ce(irh.s()), cqgr.bw(8388627), cqgr.eG(wag.a)), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.bw(8388627), cqgr.dr(1), cqgr.dQ(irh.e()), cqgr.dF(irh.b()), cqgr.gq(irn.m(), irn.v(), cqgr.bD(cqrp.d(4.0d)), vlb.a(), cqgr.eM(wah.a), cqgr.aF(cqjv.x(wai.a))), cqgr.gq(irn.j(), irn.x(), vlb.a(), cqgr.eM(waj.a), cqgr.cD(wak.a), cqgr.ar(TextUtils.TruncateAt.END)), cqgr.gq(irn.m(), irn.v(), vlb.a(), cqgr.eM(wal.a), cqgr.cB(1), cqgr.ar(TextUtils.TruncateAt.END), cqgr.aF(cqjv.x(wam.a)))));
        cqmp[] cqmpVarArr = {cqgr.cd(-2), cqgr.bp(-2), cqgr.bY(cqjd.v(fY), cqjd.e())};
        cqmj gd = cqgr.gd(cqgr.cd(-2), cqgr.bp(-2), cqgr.dr(1), cqgr.aI(wao.a), cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.z(ibm.b()), iuh.b(cqgr.cd(-1))), atnt.a(cqgr.z(ibm.b()), cqgr.bq(cqrp.d(48.0d)), cqgr.cf(new cqjb() { // from class: waf
            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                zcd zcdVar = (zcd) cqkpVar;
                return Integer.valueOf(true != waq.e(context) ? -1 : -2);
            }
        }), cqgr.dQ(cqsv.d(cqrp.d(14.0d), cqrp.d(13.0d))), cqgr.dF(cqsv.d(cqrp.d(14.0d), cqrp.d(13.0d))), atnn.a(b)), iue.i(cqgr.bq(cqrp.d(5.0d)), cqgr.cd(-1)));
        gd.f(cqmpVarArr);
        return cqgr.gj(fY, gd, iue.i(cqgr.aH(new cqjb() { // from class: wan
            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                zcd zcdVar = (zcd) cqkpVar;
                boolean z = true;
                if (!waq.e(context) && zcdVar.j().booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }), cqgr.bY(cqjd.f(), cqjd.v(fY), cqjd.B(gd)), cqgr.bq(cqrp.d(5.0d))));
    }
}

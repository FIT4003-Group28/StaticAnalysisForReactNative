package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: artw  reason: default package */
/* loaded from: classes2.dex */
public final class artw extends cqiw<aryf> {
    private static final cqrp d = cqrp.d(32.0d);
    private static final cqrp e = cqrp.d(24.0d);
    public static final cqrp a = cqrp.d(80.0d);
    public static final cqrp b = cqrp.d(48.0d);
    public static final cqrp c = cqrp.d(12.0d);
    private static final cqrp f = cqrp.d(48.0d);
    private static final cqfc[] g = {e(0), e(167), e(333), e(500)};

    public artw() {
    }

    private static cqfc e(int i) {
        return new artq(i);
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, aryf aryfVar, Context context, cqiv cqivVar) {
        aryf aryfVar2 = aryfVar;
        if (aryfVar2.t().booleanValue()) {
            for (int i2 = 0; i2 < aryfVar2.ae().intValue(); i2++) {
                cqfc[] cqfcVarArr = g;
                int length = cqfcVarArr.length;
                cqivVar.a(new artv(cqfcVarArr[i2 % 4]), aryfVar2);
            }
        } else if (!aryfVar2.af().booleanValue()) {
            for (arye aryeVar : aryfVar2.N()) {
                cqivVar.a(new artu(), aryeVar);
            }
        }
    }

    public artw(byte[] bArr) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aryf> a() {
        cqug[] cqugVarArr = {cquh.f(cqta.f()), cquh.g(e), cquh.a(0), cquh.e(cqrp.d(1.0d), ibm.j())};
        cqrp cqrpVar = d;
        cqmp[] cqmpVarArr = {cqgr.cd(-1), cqgr.L(false), cqgr.fY(cqgr.cd(-2), cqgr.bw(1), cqgr.cW(cqgr.q(artj.a)), cqgr.L(false), iue.b(cjtd.a(dtxv.aa)), cqgr.x(cqui.c(cqugVarArr)), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.bV(cqrp.d(8.0d)), cqgr.bD(cqrp.d(8.0d)), cqgr.bR(cqrp.d(12.0d)), cqgr.bG(cqrp.d(12.0d)), cqgr.dr(0), iuy.g(), cqgr.L(false), cqgr.gc(cqgr.bw(16), cqgr.bq(cqrpVar), cqgr.ce(cqrpVar), cqgr.aF(cqjv.x(artk.a)), cqgr.eG(artl.a)), cqgr.gq(cqgr.bw(16), cqgr.bR(cqrp.d(4.0d)), cqgr.bG(cqrp.d(4.0d)), ibq.l(), ibq.B(), cqgr.eM(artm.a))))};
        cqmp[] cqmpVarArr2 = {cqgr.aI(arto.a), cqgr.cd(-2), cqgr.bp(-2), cqgr.bV(cqrp.d(32.0d)), cqgr.bw(17), cqgr.aJ(17), ibq.m(), ibq.C(), cqgr.eM(artp.a)};
        cqmp[] cqmpVarArr3 = {cqgr.bp(-2), cqgr.cd(-1), cqgr.bV(cqrp.d(32.0d)), cqjv.o(cqhg.a, cqqx.H(3), cqqx.H(4)), cqgr.ck(C())};
        cqrp cqrpVar2 = f;
        return cqgr.fY(cqgr.aG(true), iuy.h(), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.bV(cqrp.d(32.0d)), cqgr.bR(cqrp.d(24.0d)), cqgr.bG(cqrp.d(24.0d)), cqgr.dr(1), cqgr.L(false), cqgr.fY(cqmpVarArr), cqgr.gq(cqmpVarArr2), cqqx.D(cqmpVarArr3), cqgr.fY(cqgr.bq(cqrpVar2), cqgr.ce(cqrpVar2), cqgr.bw(1), cqgr.cW(cqgr.q(artn.a)), cqgr.bD(cqrp.d(16.0d)), iuy.g(), cqgr.S(Integer.valueOf((int) R.string.EXIT_MEDIA_CONTENT_BROWSER_CONTENT_DESCRIPTION)), iue.b(cjtd.a(dtxv.Y)), cqgr.gc(cqgr.ch(cqrp.d(48.0d)), cqgr.bw(17), cqgr.x(cqui.c(cquh.e(cqrp.d(1.0d), iva.b(ire.e(), ire.t())), cquh.a(1)))), cqgr.gc(cqgr.bp(-1), cqgr.cd(-2), cqgr.bw(17), cqgr.eE(cqrt.g(2131231698, iva.b(ibl.s(), ibl.b())))))));
    }
}

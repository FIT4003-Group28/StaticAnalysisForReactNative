package defpackage;

import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bdui  reason: default package */
/* loaded from: classes3.dex */
public final class bdui extends bdrp<bduj> {
    private static final cqrp a = cqrp.d(48.0d);
    private static final cqrp b = cqrp.d(24.0d);
    private static final cqrp c = cqrp.d(10.0d);
    private static final cqsv d = cqsv.f(20.0d, 10.0d, 20.0d, 10.0d);
    private static final cqrp e = cqrp.d(24.0d);
    private static final cqrp f = cqrp.d(5.0d);

    public bdui(bdro bdroVar) {
        super(bdroVar, 1000L, 500, new Object[0]);
    }

    public static cjtd f(bduj bdujVar) {
        deaa deaaVar = bdujVar.a().booleanValue() ? deaa.TOGGLE_ON : deaa.TOGGLE_OFF;
        cjta b2 = cjtd.b();
        b2.d = dtyf.d;
        ddzy bZ = deab.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b2.a = bZ.bK();
        return b2.a();
    }

    @Override // defpackage.bdrp
    protected final cqmj<bduj> e() {
        cqjd[] cqjdVarArr = {cqjd.e(), cqjd.t()};
        cqrp cqrpVar = b;
        cqrp cqrpVar2 = c;
        cqmj gc = cqgr.gc(cqgr.bY(cqjdVarArr), cqgr.bq(cqrpVar), cqgr.ce(cqrpVar), cqgr.bR(cqrpVar2), cqgr.bG(cqrpVar2), cqgr.eD(2131232987));
        cqjd[] cqjdVarArr2 = {cqjd.B(gc), cqjd.t()};
        cqsv cqsvVar = d;
        cqmj gq = cqgr.gq(cqgr.bY(cqjdVarArr2), cqgr.bp(-2), cqgr.cd(-2), cqgr.dU(cqsvVar), cqgr.dB(cqsvVar), cqgr.aW(2), irn.E(), irn.m(), cqgr.eL(Integer.valueOf((int) R.string.WAIT_FOR_WIFI_SWITCH_TITLE)));
        cqjd[] cqjdVarArr3 = {cqjd.B(gq), cqjd.t()};
        cqrp cqrpVar3 = a;
        cqrp cqrpVar4 = e;
        Integer valueOf = Integer.valueOf((int) R.string.WAIT_FOR_WIFI_SWITCH_INFO_TOOLTIP_ACCESSIBILITY_MESSAGE);
        cqmj fY = cqgr.fY(cqgr.aT(bduj.a), cqgr.bY(cqjdVarArr3), cqgr.bq(cqrpVar3), cqgr.ce(cqrpVar3), cqgr.gc(cqgr.bq(cqrpVar4), cqgr.ce(cqrpVar4), cqgr.bw(17), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.eE(cqrt.g(2131232726, irg.j())), cqgr.S(valueOf), cqgr.dk(bdud.a)));
        cqjd[] cqjdVarArr4 = {cqjd.f(), cqjd.t()};
        cqrp cqrpVar5 = f;
        return cqgr.gj(cqgr.bp(-2), cqgr.cd(-1), cqgr.z(irg.a()), cqgr.gj(cqgr.bY(cqjd.e(), cqjd.t()), cqgr.bp(-2), cqgr.cd(-1), gc, gq, fY, cqgr.cW(cqgr.q(bduh.a)), iue.b(cjtd.a(dtyf.a))), cjmv.a(cqgr.bY(cqjdVarArr4), cqgr.bp(-2), cqgr.cH(cqrpVar3), cqgr.cd(-2), cqgr.cL(cqrpVar3), cqgr.bR(cqrpVar5), cqgr.bG(cqrpVar5), cqgr.S(valueOf), iue.c(bdue.a), cqgr.I(bduf.a), cqgr.cX(bdug.a)));
    }
}

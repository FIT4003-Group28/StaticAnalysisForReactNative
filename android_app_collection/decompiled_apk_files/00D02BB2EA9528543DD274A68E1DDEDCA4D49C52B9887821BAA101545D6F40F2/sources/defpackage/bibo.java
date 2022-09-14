package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bibo  reason: default package */
/* loaded from: classes3.dex */
public final class bibo extends cqiw<bibs> {
    public static final cqtv a = cqrp.d(72.0d);
    public static final cqtv b = cqrp.d(12.0d);
    private static final cqjg c = cqjg.a();

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> e(cqmp<T>... cqmpVarArr) {
        cqmj<T> fV = cqgr.fV(cqmn.a(ibq.u(), cqgr.l(false)), cqgr.fl(R.style.ColoredBorderlessButtonTheme), cqgr.cL(ibn.a()), cqgr.aJ(8388627));
        fV.f(cqmpVarArr);
        return fV;
    }

    private static cqiw<bibp> f(boolean z, CharSequence charSequence) {
        return new bibn(new Object[]{Boolean.valueOf(z), charSequence}, charSequence, z);
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bibs bibsVar, Context context, cqiv cqivVar) {
        bibs bibsVar2 = bibsVar;
        if (bibsVar2.c().booleanValue()) {
            cqivVar.f(f(true, ""), bibsVar2.a());
        } else if (!bibsVar2.w().booleanValue()) {
        } else {
            cqiw<bibp> f = f(false, bibsVar2.d());
            bibp e = bibsVar2.e();
            dbsk.s(e);
            cqivVar.a(f, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bibs> a() {
        cqjg cqjgVar = c;
        return cqgr.gj(cqgr.aI(bias.a), cqgr.cd(-1), cqgr.bp(-2), cqgr.x(ibq.E()), cqgr.z(ibm.b()), cqgr.gd(cqgr.aT(cqjgVar), cqgr.bY(cqjd.i(), cqjd.e()), cqgr.cd(-1), cqgr.dr(1), cqgr.dU(cqrp.d(4.0d)), cqgr.dB(cqrp.d(4.0d)), cqgr.dF(ibn.a()), cqgr.aW(1), cqgr.ck(C())), cqgr.gj(cqgr.cd(-1), cqgr.bp(-2), cqgr.J(true), cqgr.aW(1), cqgr.bY(cqjd.i(), cqjd.e()), cqgr.dF(cqrp.d(4.0d)), cqgr.x(irn.G()), cqgr.cW(cqgr.q(biat.a)), cqgr.f(cqjgVar), iue.c(biau.a), cqgr.gc(cqgr.aW(1), cqgr.bY(cqjd.i(), cqjd.f()), cqgr.ch(ibn.a()), cqgr.dU(cqrp.d(1.0d)), cqgr.aJ(8388613), cqgr.V(biav.a), cqgr.eG(biaw.a), cqgr.ei(ImageView.ScaleType.CENTER_INSIDE), cqgr.cW(cqgr.q(biax.a)), iue.c(biay.a), cqgr.x(irn.J()))));
    }
}

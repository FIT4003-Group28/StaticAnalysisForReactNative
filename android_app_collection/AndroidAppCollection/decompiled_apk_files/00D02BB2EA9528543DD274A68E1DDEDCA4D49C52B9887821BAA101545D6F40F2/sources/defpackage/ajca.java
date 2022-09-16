package defpackage;

import android.graphics.ColorFilter;
import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ajca  reason: default package */
/* loaded from: classes2.dex */
public final class ajca extends cqiw<ajbz> {
    private static final cqrp d = cqrp.d(64.0d);
    private static final cqrp e = cqrp.d(16.0d);
    private static final cqrp f = cqrp.d(24.0d);
    public static final cqlc<ajbz, cqss> a = ajbx.a;
    private static final cqjb<ajbz, ColorFilter> g = new ajby();
    public static final cqlc<ajbz, cqss> b = ajbp.a;
    @dzsi
    public static final cqss c = iva.b(ibl.a(), ibl.w());

    public static final cqss e(ajbz ajbzVar) {
        aiom b2 = ajbzVar.b();
        aiom aiomVar = aiom.INFO;
        int ordinal = b2.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return iva.b(cqrt.c(R.color.mod_google_red900), ibl.L());
            }
            return ibm.z();
        }
        return iva.b(cqrt.c(R.color.warning_banner_error_text), ibl.Q());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<ajbz> a() {
        cqmp[] cqmpVarArr = {cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(8388627), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.eG(ajbo.a)};
        cqrp cqrpVar = e;
        cqmp[] cqmpVarArr2 = {cqgr.dQ(cqrpVar), cqgr.dF(cqrpVar), cqgr.cd(0), cqgr.bp(-2), cqgr.bw(8388627), cqgr.az(true), cqgr.eB(false), cqgr.ca(Float.valueOf(1.0f)), cqgr.cH(ajev.g), ibq.p(), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eW(ajbq.a), cqgr.eN(5), cqgr.eM(ajbr.a)};
        cqjb<ajbz, ColorFilter> cqjbVar = g;
        cqrp cqrpVar2 = f;
        cqmp[] cqmpVarArr3 = {cqgr.ce(cqrpVar2), cqgr.bq(cqrpVar2), cqic.f(ajbs.a, new cqmp[0]), cqgr.bw(17)};
        cqrp d2 = cqrp.d(dcyn.a);
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.cH(d), cqgr.dr(0), cqgr.aJ(16), cqgr.gc(cqmpVarArr), cqgr.gq(cqmpVarArr2), jeh.c(cqjbVar, cqmpVarArr3), cqgr.fY(cqgr.cd(-2), cqgr.bp(-2), cqic.c(ajbt.a, new cqmp[0]), hyb.d(cqgr.dz(d2, d2, d2, d2), cqgr.bw(8388629), cqgr.cd(-2), cqgr.bp(-2), cqgr.fj(1), cqgr.J(true), cqgr.eW(ajbu.a), cqgr.eM(ajbv.a), cqgr.cW(cqgr.q(ajbw.a)))));
    }
}

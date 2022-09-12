package defpackage;

import android.widget.ImageView;
import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: gvp  reason: default package */
/* loaded from: classes.dex */
public final class gvp extends cqiw<jar> {
    public static final dcep<String> a = dcep.G(new Locale("el").getLanguage(), new Locale("fi").getLanguage(), new Locale("fr").getLanguage(), new Locale("hu").getLanguage(), new Locale("hy").getLanguage(), new Locale("ro").getLanguage(), new Locale("ru").getLanguage(), new Locale("sw").getLanguage());
    private static final cqjb<jar, Boolean> b = gvf.a;

    @SafeVarargs
    private static final cqmj<jar> e(cqlc<jar, cqtv> cqlcVar, cqmp<jar>... cqmpVarArr) {
        cqlc cqlcVar2 = gvh.a;
        cqmp[] cqmpVarArr2 = {cqgr.bw(17), cqgr.eG(gvm.a), cqgr.ei(ImageView.ScaleType.CENTER)};
        cqjb<jar, Boolean> cqjbVar = b;
        Integer valueOf = Integer.valueOf((int) R.string.DIRECTIONS_FAB_LABEL);
        cqmp[] cqmpVarArr3 = {cqgr.aE(cqjbVar), cqgr.bV(cqrp.d(-2.0d)), cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(17), cqgr.eL(valueOf), cqgr.fi(gvn.a), cqgr.eU(irg.a()), cqgr.fj(1)};
        Float valueOf2 = Float.valueOf(0.8f);
        cqmj<jar> k = gwu.k(cqlcVar2, true, false, cqgr.fY(cqgr.aI(gvi.a), cqgr.cg(gvj.a), cqgr.bs(gvk.a), cqgr.gd(cqgr.dr(1), cqgr.dX(gvl.a), cqgr.gc(cqmpVarArr2), cqgr.gq(cqmpVarArr3), cqgr.gq(cqgr.aH(cqjbVar), cqgr.ek(valueOf2), cqgr.el(valueOf2), cqgr.bV(cqrp.d(-2.0d)), cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(17), cqgr.eL(valueOf), cqgr.fi(gvo.a), cqgr.eU(irg.a())))), cqlcVar, cqkz.a(gwu.a()));
        k.f(cqmpVarArr);
        return k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<jar> a() {
        return cqgr.fY(e(cqkz.a(cqrp.d(12.0d)), cqic.f(gve.a, new cqmp[0])), e(cqkz.a(gwu.b()), cqic.c(gvg.a, new cqmp[0])));
    }
}

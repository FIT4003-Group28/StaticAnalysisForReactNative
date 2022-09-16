package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: lsj  reason: default package */
/* loaded from: classes7.dex */
public final class lsj extends cqiw<atxq> {
    public static final cqtv a = cqrp.d(56.0d);
    private static final cqtv b = cqrp.d(4.0d);

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, atxq atxqVar, Context context, cqiv cqivVar) {
        atxq atxqVar2 = atxqVar;
        if (i == 1) {
            atxw k = atxqVar2.k();
            if (k instanceof atxy) {
                cqivVar.a(new lsh(), ((atxy) k).b());
            } else {
                cqivVar.c(new lsi());
            }
        } else if (i == 2) {
            mac.a(dcdc.f(atxqVar2.T()), cqivVar, lso.a);
        } else {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Unknown list type: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<atxq> a() {
        cqtv cqtvVar = b;
        return nqk.a(cqgr.ce(nqo.am), cqgr.bp(-2), cqgr.bA(nqo.Q), nsc.y(nsc.m(Integer.valueOf(mac.b)), cqgr.gd(cqgr.dr(1), nsc.u(cqgr.aR(Integer.valueOf(mac.b)), cqgr.cd(-1), cqgr.bp(0), cqgr.ca(Float.valueOf(1.0f)), nqu.a(B().k().o()), cqgr.az(B().k().o()), itj.g(B().k().c()), iue.b(B().k().l()), cqjv.k(B().k().o(), nsc.o(Integer.valueOf(mac.a)), nsc.o(-1)), cqgr.fY(cqgr.am(true), cqgr.aR(Integer.valueOf(mac.a)), cqgr.ch(nqo.V), cqgr.bw(8388659), cqgr.gc(cqgr.ch(a), cqgr.bw(17), cqgr.dz(cqtvVar, cqtvVar, cqtvVar, cqtvVar), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.eE(B().F())), cqgr.fY(cqgr.am(true), cqgr.ck(D(1))), cqgr.gc(cqgr.am(true), cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(8388693), cqgr.bA(cqrp.d(12.0d)), cqgr.x(nqu.aJ(R.drawable.car_only_profile_checkmark_bg, nql.j)), cqgr.eE(nqu.aL(R.raw.car_only_ic_check_circle_filled_36dp, nql.a, nql.b, nqo.D, nqo.E)))), cqgr.gq(cqgr.cd(-1), cqgr.bp(-1), vlb.a(), cqgr.bR(nqo.V), cqgr.bG(nqo.R), cqgr.bV(nqo.T), cqgr.bD(nqo.T), cqgr.eI(B().x()), nre.j(), cqgr.ar(TextUtils.TruncateAt.END), cqgr.cB(3))), cqgr.fY(cqgr.bp(-2), cqgr.ck(D(2))))));
    }
}

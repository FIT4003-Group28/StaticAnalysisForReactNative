package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aney  reason: default package */
/* loaded from: classes2.dex */
public final class aney extends cqiw<anfc> {
    private static final int a = Math.max(180, 136);

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, anfc anfcVar, Context context, cqiv cqivVar) {
        anfc anfcVar2 = anfcVar;
        cqivVar.a(new anet(), anfcVar2);
        if (anfcVar2.b().booleanValue()) {
            cqivVar.a(new acnn(), anfcVar2);
            cqivVar.a(new hsd(), anfcVar2.c());
            return;
        }
        jam h = anfcVar2.h();
        if (h != null) {
            cqivVar.a(new anes(), h);
        } else if (dcft.w(anfcVar2.a())) {
            cqivVar.a(new anen(), anfcVar2);
        } else {
            gva.b(cqivVar, anfcVar2.a(), new grc(), new gvd());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<anfc> a() {
        return aefx.f(cqgr.aR(Integer.valueOf((int) R.id.map_point_picker_bottom_sheet)), cqgr.bp(-2), cqgr.cd(-1), cqgr.gk(cqgr.cd(-1), cqgr.bp(-2), cqgr.gd(cqgr.cH(cqrp.d(a)), cqgr.z(irg.a()), cqgr.dr(1), cqgr.bp(-2), cqgr.cd(-1), grc.d(cqkz.a(true), cqgr.q(aneu.a), anev.a, anew.a, irn.m(), cqkz.a(irg.J()), cqkz.a(itd.f()), anex.a, cqgr.bq(cqrp.d(54.0d))), gvb.d(false, new cqmp[0]), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.ck(C())))));
    }
}

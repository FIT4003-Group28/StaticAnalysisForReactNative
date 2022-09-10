package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bacy  reason: default package */
/* loaded from: classes3.dex */
public final class bacy extends cqiw<baew> {
    public static final cqtv a = cqsg.k(cqsg.d(cqrp.d(34.0d), cqrp.f(11.0d)), ibn.a());

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, baew baewVar, Context context, cqiv cqivVar) {
        baew baewVar2 = baewVar;
        if (baewVar2.a().booleanValue()) {
            cqivVar.a(new babj(), cqkp.T);
        } else if (baewVar2.d().booleanValue()) {
            cqivVar.a(new bacx(), baewVar2);
        } else {
            baev i2 = baewVar2.i();
            if (i2 != null) {
                cqivVar.a(new bacp(), i2);
            }
            baev j = baewVar2.j();
            if (j != null) {
                cqivVar.a(new bacp(), j);
            }
            baef k = baewVar2.k();
            if (k != null) {
                cqivVar.a(new badj(), k);
            }
            cqivVar.a(new baca(), baewVar2.l());
            cqivVar.a(new babx(), baewVar2.l().c());
            if (!baewVar2.l().d().a().isEmpty()) {
                cqivVar.a(new babt(), baewVar2.l());
                cqivVar.a(new babx(), baewVar2.l().d());
            }
            cqivVar.a(new babi(), baewVar2.m());
            baeg n = baewVar2.n();
            if (n == null) {
                return;
            }
            cqivVar.a(new badt(), n);
        }
    }

    @Override // defpackage.cqiw
    public final cqmj<baew> a() {
        cqjb<baew, cqiv> C = C();
        Integer valueOf = Integer.valueOf((int) R.id.saved_tab_content);
        return cqgr.fY(cqgr.cd(-1), cqgr.bp(-1), cqgr.z(ibm.b()), cqgr.fY(cqgr.cd(-1), cqgr.bp(-1), cqgr.bF(bacq.a), GmmRecyclerView.aw(C, cqqx.p(null), cqqx.F(), cqgr.cd(-1), cqgr.bp(-1), cqgr.dB(ibn.o()), cqgr.P(false), cqgr.aR(valueOf)), jdz.f(cqgr.bp(-1), cqgr.cd(-1), jdx.c(valueOf), cqic.f(bacr.a, new cqmp[0]))));
    }
}

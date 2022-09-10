package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: aonx  reason: default package */
/* loaded from: classes2.dex */
public final class aonx extends cqiw<aony> {
    private static void e(aony aonyVar, cqiv cqivVar, jby jbyVar) {
        cqivVar.a(new hsd(), jbyVar);
        cqivVar.a(new gvb(), aonyVar);
        cqivVar.a(new hsd(), jbyVar);
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, aony aonyVar, Context context, cqiv cqivVar) {
        aony aonyVar2 = aonyVar;
        cqivVar.a(new aonv(), aonyVar2);
        cqivVar.a(new gvb(), aonyVar2);
        cqivVar.a(new grw(), aonyVar2.e());
        cqivVar.a(new gvb(), aonyVar2);
        jby e = hsd.e(cqrp.d(8.0d));
        if (aonyVar2.o().booleanValue()) {
            aonr aonrVar = new aonr();
            cqivVar.a(new aomd(new Object[]{aonrVar, aonyVar2}, aonrVar, aonyVar2), aonyVar2.r());
            cqivVar.a(new gvb(), aonyVar2);
        }
        aofb q = aonyVar2.q();
        if (aonyVar2.p() && q != null) {
            cqivVar.a(new hsd(), e);
            cqivVar.a(new aofa(), q);
            e(aonyVar2, cqivVar, e);
        }
        cqivVar.a(new hsd(), e);
        if (aonyVar2.d()) {
            cqivVar.a(new aokl(), aonyVar2.c());
            e(aonyVar2, cqivVar, e);
        }
        dcdc<jbf> l = aonyVar2.l();
        cqivVar.f(new hax(), l);
        if (!l.isEmpty()) {
            e(aonyVar2, cqivVar, e);
        }
        anow a = aonyVar2.a();
        if (a != null) {
            cqivVar.a(new anov(), a);
        }
        if (aonyVar2.h().booleanValue()) {
            cqivVar.a(new aonw(), aonyVar2);
            cqivVar.f(new bcde(), aonyVar2.i());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aony> a() {
        return GmmRecyclerView.aw(C(), cqgr.aT(apkj.a));
    }
}

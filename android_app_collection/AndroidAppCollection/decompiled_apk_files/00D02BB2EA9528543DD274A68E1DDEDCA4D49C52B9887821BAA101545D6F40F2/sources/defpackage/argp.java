package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: argp  reason: default package */
/* loaded from: classes2.dex */
public final class argp extends cqiw<arjg> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, arjg arjgVar, Context context, cqiv cqivVar) {
        arjg arjgVar2 = arjgVar;
        cqivVar.a(new arfv(), arjgVar2);
        cqivVar.a(new grw(), arjgVar2.k());
        cqivVar.a(new gvc(), arjgVar2);
        boolean z = true;
        for (arje arjeVar : arjgVar2.j()) {
            if (!z) {
                cqivVar.a(new argo(), arjgVar2);
            }
            cqivVar.a(new argb(), arjeVar);
            if (arjeVar.b().booleanValue()) {
                cqivVar.f(new argf(), arjeVar.d());
                cqivVar.a(new argl(), arjeVar);
            }
            z = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<arjg> a() {
        return cqgr.gd(cqgr.dr(1), iue.c(argm.a), cqgr.cd(-1), cqgr.bp(-1), cqgr.z(ibm.b()), hxc.a(hxc.b(argn.a)), GmmRecyclerView.aw(C(), new cqmp[0]));
    }
}

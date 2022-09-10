package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: azaz  reason: default package */
/* loaded from: classes3.dex */
public final class azaz extends cqiw<azbd> {
    public static final cqtv a = cqrp.d(48.0d);

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, azbd azbdVar, Context context, cqiv cqivVar) {
        azbd azbdVar2 = azbdVar;
        if (azbdVar2.d().booleanValue()) {
            cqivVar.a(new aycv(), azbdVar2);
            return;
        }
        cqivVar.a(new azay(), azbdVar2);
        cqivVar.c(ict.p(false, new cqmp[0]));
        cqivVar.f(new azav(), azbdVar2.b());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<azbd> a() {
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-1), cqgr.dr(1), cqgr.bw(1), cqgr.z(ibm.b()), hxc.a(hxc.b(azab.a)), GmmRecyclerView.aw(C(), cqgr.bp(-1), cqgr.cd(-1)));
    }
}

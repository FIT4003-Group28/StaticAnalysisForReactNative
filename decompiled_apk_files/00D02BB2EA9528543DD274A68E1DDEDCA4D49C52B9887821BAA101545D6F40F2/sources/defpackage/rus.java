package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: rus  reason: default package */
/* loaded from: classes7.dex */
public final class rus extends cqiw<sbd> {
    public rus() {
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, sbd sbdVar, Context context, cqiv cqivVar) {
        sbd sbdVar2 = sbdVar;
        if (sbdVar2.a().booleanValue()) {
            cqivVar.c(new rtx());
        } else if (sbdVar2.b().booleanValue()) {
            cqivVar.a(new rtz(null), sbdVar2);
        } else if (sbdVar2.c().booleanValue()) {
            cqivVar.a(new rtz(null), sbdVar2);
        } else {
            cqivVar.f(new rur(), sbdVar2.d());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<sbd> a() {
        return zvk.b(GmmRecyclerView.aw(C(), cqgr.cd(-1), cqgr.bp(-1)), new cqmp[0]);
    }

    public rus(byte[] bArr) {
    }
}

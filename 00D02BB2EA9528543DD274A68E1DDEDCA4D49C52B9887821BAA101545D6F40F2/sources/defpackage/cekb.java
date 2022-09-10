package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: cekb  reason: default package */
/* loaded from: classes4.dex */
public final class cekb extends cqiw<cesz> {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cesz ceszVar, Context context, cqiv cqivVar) {
        cesz ceszVar2 = ceszVar;
        if (ceszVar2.e().booleanValue()) {
            cqivVar.a(new ceka(), ceszVar2.j());
            return;
        }
        for (cesx cesxVar : ceszVar2.d()) {
            cqivVar.a(new ceju(), cesxVar);
        }
        if (!ceszVar2.Ry().booleanValue()) {
            return;
        }
        cqivVar.c(new oag());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cesz> a() {
        return GmmRecyclerView.aw(C(), cqgr.cd(-1), cqgr.bp(-1), cqqx.x(cejc.a));
    }
}

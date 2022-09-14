package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: bcwx  reason: default package */
/* loaded from: classes3.dex */
public final class bcwx extends cqiw<bdam> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bdam bdamVar, Context context, cqiv cqivVar) {
        bdam bdamVar2 = bdamVar;
        cqivVar.a(new bcww(), bdamVar2);
        jbt b = bdamVar2.b();
        if (b != null) {
            b.j(cqivVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bdam> a() {
        return GmmRecyclerView.aw(C(), cqgr.cd(-1), cqgr.bp(-1));
    }
}

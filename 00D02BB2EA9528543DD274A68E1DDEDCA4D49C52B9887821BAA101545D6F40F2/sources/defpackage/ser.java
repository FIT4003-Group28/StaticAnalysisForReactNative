package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ser  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class ser implements cqkn {
    static final cqkn a = new ser();

    private ser() {
    }

    @Override // defpackage.cqkn
    public final void a(cqkp cqkpVar, View view) {
        sat satVar = (sat) cqkpVar;
        RecyclerView recyclerView = (RecyclerView) view.getParent();
        abs absVar = recyclerView.l;
        recyclerView.n(abs.bm(view));
    }
}

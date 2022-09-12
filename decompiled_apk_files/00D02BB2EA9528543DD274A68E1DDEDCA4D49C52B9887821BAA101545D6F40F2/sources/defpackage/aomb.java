package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: aomb  reason: default package */
/* loaded from: classes2.dex */
final class aomb extends cqmr<aome> {
    final /* synthetic */ View a;

    public aomb(View view) {
        this.a = view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final /* bridge */ /* synthetic */ void a(aome aomeVar, boolean z) {
        if (this.a.getParent() == null || !(this.a.getParent() instanceof RecyclerView)) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) this.a.getParent();
        if (recyclerView.X(this.a) == null) {
            return;
        }
        recyclerView.k.s();
    }
}

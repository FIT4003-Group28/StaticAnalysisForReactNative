package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: bmrp  reason: default package */
/* loaded from: classes3.dex */
final class bmrp extends cqmr<bmtv> {
    final /* synthetic */ View a;

    public bmrp(View view) {
        this.a = view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final /* bridge */ /* synthetic */ void a(bmtv bmtvVar, boolean z) {
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

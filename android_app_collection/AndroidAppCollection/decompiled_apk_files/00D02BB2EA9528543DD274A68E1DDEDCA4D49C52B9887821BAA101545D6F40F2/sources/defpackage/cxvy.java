package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxvy  reason: default package */
/* loaded from: classes5.dex */
public final class cxvy extends abx {
    final /* synthetic */ View a;
    final /* synthetic */ int b;
    final /* synthetic */ cxwe c;

    public cxvy(cxwe cxweVar, View view, int i) {
        this.c = cxweVar;
        this.a = view;
        this.b = i;
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (!recyclerView.canScrollVertically(-1)) {
            this.c.h.n(true);
            this.a.setElevation(0.0f);
        } else if (i2 == 0) {
        } else {
            this.c.h.n(false);
            this.a.setElevation(this.b);
        }
    }
}

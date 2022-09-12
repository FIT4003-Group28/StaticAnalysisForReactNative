package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: cede  reason: default package */
/* loaded from: classes4.dex */
final class cede extends cqqw {
    final /* synthetic */ cedh a;

    public cede(cedh cedhVar) {
        this.a = cedhVar;
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (!recyclerView.canScrollVertically(-1)) {
            this.a.e = true;
            cqkx.p(this.a);
        } else if (!this.a.e.booleanValue()) {
        } else {
            this.a.e = false;
            cqkx.p(this.a);
        }
    }
}

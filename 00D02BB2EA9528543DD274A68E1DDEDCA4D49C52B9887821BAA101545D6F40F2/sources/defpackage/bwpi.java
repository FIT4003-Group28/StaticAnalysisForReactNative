package defpackage;

import android.support.v7.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bwpi  reason: default package */
/* loaded from: classes4.dex */
public final class bwpi extends cqqw {
    final /* synthetic */ bwpn a;

    public bwpi(bwpn bwpnVar) {
        this.a = bwpnVar;
    }

    @Override // defpackage.abx
    public final void QA(RecyclerView recyclerView, int i) {
        if (i == 1) {
            this.a.i.a().b();
        }
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        boolean z = !recyclerView.canScrollVertically(-1);
        bwpn bwpnVar = this.a;
        if (z != bwpnVar.g) {
            bwpnVar.g = z;
            bwpnVar.j.b(Boolean.valueOf(z));
            cqkx.p(this.a);
        }
    }
}

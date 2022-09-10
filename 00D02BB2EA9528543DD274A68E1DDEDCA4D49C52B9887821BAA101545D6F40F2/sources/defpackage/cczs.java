package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: cczs  reason: default package */
/* loaded from: classes4.dex */
final class cczs extends cqqw {
    final /* synthetic */ cczu a;

    public cczs(cczu cczuVar) {
        this.a = cczuVar;
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        boolean z = !recyclerView.canScrollVertically(-1);
        cczu cczuVar = this.a;
        if (z != cczuVar.j) {
            cczuVar.j = z;
            cqkx.p(cczuVar);
        }
    }
}

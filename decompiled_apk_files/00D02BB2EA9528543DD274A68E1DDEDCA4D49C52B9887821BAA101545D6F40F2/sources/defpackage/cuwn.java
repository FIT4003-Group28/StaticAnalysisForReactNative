package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: cuwn  reason: default package */
/* loaded from: classes5.dex */
final class cuwn extends abx {
    final /* synthetic */ cuwq a;

    public cuwn(cuwq cuwqVar) {
        this.a = cuwqVar;
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        int aN;
        cuwq cuwqVar = this.a;
        if (!cuwqVar.d || cuwqVar.e || !cuwqVar.f || (aN = cuwqVar.b.S.aN()) <= 0) {
            return;
        }
        if (this.a.b.S.aJ() + this.a.b.S.ac() + cuwq.a < aN) {
            return;
        }
        cuwq cuwqVar2 = this.a;
        cuwqVar2.e = true;
        cuwqVar2.c.b();
        cstl.a("PagedRcyPresenter");
    }
}

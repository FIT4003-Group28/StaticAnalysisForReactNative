package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: hks  reason: default package */
/* loaded from: classes3.dex */
final class hks extends abc {
    final /* synthetic */ hku a;

    public hks(hku hkuVar) {
        this.a = hkuVar;
    }

    @Override // defpackage.abc
    public final int d(RecyclerView recyclerView, yo yoVar) {
        return n(12);
    }

    @Override // defpackage.abc
    public final void f(RecyclerView recyclerView, yo yoVar) {
        super.f(recyclerView, yoVar);
        yoVar.a.setScaleX(1.0f);
        yoVar.a.setScaleY(1.0f);
    }

    @Override // defpackage.abc
    public final void g(yo yoVar, int i) {
        if (i == 2) {
            yoVar.a.setScaleX(this.a.c);
            yoVar.a.setScaleY(this.a.d);
        }
    }

    @Override // defpackage.abc
    public final boolean h(RecyclerView recyclerView, yo yoVar, yo yoVar2) {
        return this.a.a.w(yoVar.a()) && this.a.a.w(yoVar2.a());
    }

    @Override // defpackage.abc
    public final boolean k(RecyclerView recyclerView, yo yoVar, yo yoVar2) {
        int a = yoVar.a();
        int a2 = yoVar2.a();
        if (a == a2 || !this.a.a.w(a) || !this.a.a.w(a2)) {
            return false;
        }
        ((hkt) ((ampv) this.a.f).a).c(a, a2);
        this.a.a.om(a, a2);
        return true;
    }

    @Override // defpackage.abc
    public final void m() {
    }

    @Override // defpackage.abc
    public final void p() {
    }
}

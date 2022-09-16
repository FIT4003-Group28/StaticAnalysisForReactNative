package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: yf  reason: default package */
/* loaded from: classes4.dex */
public final class yf extends lg {
    final /* synthetic */ RecyclerView a;

    public yf(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.lg
    public final void c() {
        this.a.w(null);
        RecyclerView recyclerView = this.a;
        recyclerView.M.f = true;
        recyclerView.V(true);
        if (!this.a.f.l()) {
            this.a.requestLayout();
        }
    }

    @Override // defpackage.lg
    public final void e(int i, int i2, Object obj) {
        this.a.w(null);
        tw twVar = this.a.f;
        if (i2 <= 0) {
            return;
        }
        twVar.a.add(twVar.c(4, i, i2, obj));
        twVar.d |= 4;
        if (twVar.a.size() != 1) {
            return;
        }
        r();
    }

    @Override // defpackage.lg
    public final void f(int i, int i2) {
        this.a.w(null);
        tw twVar = this.a.f;
        if (i2 <= 0) {
            return;
        }
        twVar.a.add(twVar.c(1, i, i2, null));
        twVar.d |= 1;
        if (twVar.a.size() != 1) {
            return;
        }
        r();
    }

    @Override // defpackage.lg
    public final void g(int i, int i2) {
        this.a.w(null);
        tw twVar = this.a.f;
        if (i2 <= 0) {
            return;
        }
        twVar.a.add(twVar.c(2, i, i2, null));
        twVar.d |= 2;
        if (twVar.a.size() != 1) {
            return;
        }
        r();
    }

    @Override // defpackage.lg
    public final void h(int i, int i2) {
        this.a.w(null);
        tw twVar = this.a.f;
        if (i == i2) {
            return;
        }
        twVar.a.add(twVar.c(8, i, i2, null));
        twVar.d |= 8;
        if (twVar.a.size() != 1) {
            return;
        }
        r();
    }

    final void r() {
        int i = RecyclerView.V;
        RecyclerView recyclerView = this.a;
        if (!recyclerView.s || !recyclerView.r) {
            recyclerView.w = true;
            recyclerView.requestLayout();
            return;
        }
        lj.H(recyclerView, recyclerView.j);
    }
}

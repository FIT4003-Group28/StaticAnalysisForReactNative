package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: acc  reason: default package */
/* loaded from: classes.dex */
public final class acc extends abi {
    final /* synthetic */ RecyclerView a;

    public acc(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.abi
    public final void a() {
        this.a.C(null);
        RecyclerView recyclerView = this.a;
        recyclerView.J.f = true;
        recyclerView.T(true);
        if (!this.a.d.e()) {
            this.a.requestLayout();
        }
    }

    @Override // defpackage.abi
    public final void c(int i, int i2, Object obj) {
        this.a.C(null);
        xa xaVar = this.a.d;
        if (i2 <= 0) {
            return;
        }
        xaVar.a.add(xaVar.j(4, i, i2, obj));
        xaVar.d |= 4;
        if (xaVar.a.size() != 1) {
            return;
        }
        g();
    }

    @Override // defpackage.abi
    public final void d(int i, int i2) {
        this.a.C(null);
        xa xaVar = this.a.d;
        if (i2 <= 0) {
            return;
        }
        xaVar.a.add(xaVar.j(1, i, i2, null));
        xaVar.d |= 1;
        if (xaVar.a.size() != 1) {
            return;
        }
        g();
    }

    @Override // defpackage.abi
    public final void e(int i, int i2) {
        this.a.C(null);
        xa xaVar = this.a.d;
        if (i2 <= 0) {
            return;
        }
        xaVar.a.add(xaVar.j(2, i, i2, null));
        xaVar.d |= 2;
        if (xaVar.a.size() != 1) {
            return;
        }
        g();
    }

    @Override // defpackage.abi
    public final void f(int i, int i2) {
        this.a.C(null);
        xa xaVar = this.a.d;
        if (i == i2) {
            return;
        }
        xaVar.a.add(xaVar.j(8, i, i2, null));
        xaVar.d |= 8;
        if (xaVar.a.size() != 1) {
            return;
        }
        g();
    }

    final void g() {
        int i = RecyclerView.R;
        RecyclerView recyclerView = this.a;
        if (!recyclerView.q || !recyclerView.p) {
            recyclerView.u = true;
            recyclerView.requestLayout();
            return;
        }
        od.j(recyclerView, recyclerView.h);
    }
}

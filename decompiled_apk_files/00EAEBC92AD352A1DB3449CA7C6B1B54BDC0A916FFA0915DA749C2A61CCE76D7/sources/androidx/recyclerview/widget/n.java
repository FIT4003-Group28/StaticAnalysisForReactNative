package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public abstract class n extends RecyclerView.l {

    /* renamed from: g  reason: collision with root package name */
    boolean f2126g = true;

    public final void a(RecyclerView.d0 d0Var, boolean z) {
        c(d0Var, z);
        b(d0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean a(RecyclerView.d0 d0Var) {
        return !this.f2126g || d0Var.o();
    }

    public abstract boolean a(RecyclerView.d0 d0Var, int i, int i2, int i3, int i4);

    public abstract boolean a(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i, int i2, int i3, int i4);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean a(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f1942a;
        int i4 = cVar.f1943b;
        if (d0Var2.y()) {
            int i5 = cVar.f1942a;
            i2 = cVar.f1943b;
            i = i5;
        } else {
            i = cVar2.f1942a;
            i2 = cVar2.f1943b;
        }
        return a(d0Var, d0Var2, i3, i4, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean a(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        return (cVar == null || (cVar.f1942a == cVar2.f1942a && cVar.f1943b == cVar2.f1943b)) ? f(d0Var) : a(d0Var, cVar.f1942a, cVar.f1943b, cVar2.f1942a, cVar2.f1943b);
    }

    public final void b(RecyclerView.d0 d0Var, boolean z) {
        d(d0Var, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean b(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i = cVar.f1942a;
        int i2 = cVar.f1943b;
        View view = d0Var.f1924a;
        int left = cVar2 == null ? view.getLeft() : cVar2.f1942a;
        int top = cVar2 == null ? view.getTop() : cVar2.f1943b;
        if (d0Var.q() || (i == left && i2 == top)) {
            return g(d0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return a(d0Var, i, i2, left, top);
    }

    public void c(RecyclerView.d0 d0Var, boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean c(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        if (cVar.f1942a == cVar2.f1942a && cVar.f1943b == cVar2.f1943b) {
            j(d0Var);
            return false;
        }
        return a(d0Var, cVar.f1942a, cVar.f1943b, cVar2.f1942a, cVar2.f1943b);
    }

    public void d(RecyclerView.d0 d0Var, boolean z) {
    }

    public abstract boolean f(RecyclerView.d0 d0Var);

    public abstract boolean g(RecyclerView.d0 d0Var);

    public final void h(RecyclerView.d0 d0Var) {
        n(d0Var);
        b(d0Var);
    }

    public final void i(RecyclerView.d0 d0Var) {
        o(d0Var);
    }

    public final void j(RecyclerView.d0 d0Var) {
        p(d0Var);
        b(d0Var);
    }

    public final void k(RecyclerView.d0 d0Var) {
        q(d0Var);
    }

    public final void l(RecyclerView.d0 d0Var) {
        r(d0Var);
        b(d0Var);
    }

    public final void m(RecyclerView.d0 d0Var) {
        s(d0Var);
    }

    public void n(RecyclerView.d0 d0Var) {
    }

    public void o(RecyclerView.d0 d0Var) {
    }

    public void p(RecyclerView.d0 d0Var) {
    }

    public void q(RecyclerView.d0 d0Var) {
    }

    public void r(RecyclerView.d0 d0Var) {
    }

    public void s(RecyclerView.d0 d0Var) {
    }
}

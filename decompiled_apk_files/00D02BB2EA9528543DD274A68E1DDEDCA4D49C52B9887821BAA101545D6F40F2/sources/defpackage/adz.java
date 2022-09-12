package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
/* compiled from: PG */
/* renamed from: adz  reason: default package */
/* loaded from: classes.dex */
public abstract class adz extends abv {
    RecyclerView a;
    public Scroller b;
    private final abx c = new adx(this);

    public abstract int[] a(abs absVar, View view);

    public abstract int b(abs absVar, int i, int i2);

    public abstract View c(abs absVar);

    protected ach d(abs absVar) {
        if (!(absVar instanceof acg)) {
            return null;
        }
        return new ady(this, this.a.getContext());
    }

    @Override // defpackage.abv
    public final boolean e(int i, int i2) {
        ach d;
        int b;
        RecyclerView recyclerView = this.a;
        abs absVar = recyclerView.l;
        if (absVar == null || recyclerView.k == null) {
            return false;
        }
        int i3 = recyclerView.F;
        if ((Math.abs(i2) <= i3 && Math.abs(i) <= i3) || !(absVar instanceof acg) || (d = d(absVar)) == null || (b = b(absVar, i, i2)) == -1) {
            return false;
        }
        d.g = b;
        absVar.aw(d);
        return true;
    }

    public final void f(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.j(this.c);
            this.a.setOnFlingListener(null);
        }
        this.a = recyclerView;
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.E != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        recyclerView.i(this.c);
        this.a.setOnFlingListener(this);
        this.b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
        g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        abs absVar;
        View c;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (absVar = recyclerView.l) == null || (c = c(absVar)) == null) {
            return;
        }
        int[] a = a(absVar, c);
        int i = 0;
        int i2 = a[0];
        if (i2 != 0) {
            i = i2;
        } else if (a[1] == 0) {
            return;
        }
        this.a.t(i, a[1]);
    }
}

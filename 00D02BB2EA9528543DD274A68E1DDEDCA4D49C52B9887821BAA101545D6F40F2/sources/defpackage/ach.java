package defpackage;

import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: ach  reason: default package */
/* loaded from: classes.dex */
public abstract class ach {
    public RecyclerView h;
    public abs i;
    public boolean j;
    public boolean k;
    public View l;
    public boolean m;
    public int g = -1;
    private final acf a = new acf();

    protected abstract void a();

    protected abstract void j(int i, int i2, acf acfVar);

    protected abstract void k(View view, acf acfVar);

    public PointF l(int i) {
        abs absVar = this.i;
        if (absVar instanceof acg) {
            return ((acg) absVar).L(i);
        }
        String str = "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + acg.class.getCanonicalName();
        return null;
    }

    public final void m() {
        if (!this.k) {
            return;
        }
        this.k = false;
        a();
        this.h.J.a = -1;
        this.l = null;
        this.g = -1;
        this.j = false;
        abs absVar = this.i;
        if (absVar.t == this) {
            absVar.t = null;
        }
        this.i = null;
        this.h = null;
    }

    public int n() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(int i, int i2) {
        PointF l;
        RecyclerView recyclerView = this.h;
        if (this.g == -1 || recyclerView == null) {
            m();
        }
        if (this.j && this.l == null && this.i != null && (l = l(this.g)) != null && (l.x != 0.0f || l.y != 0.0f)) {
            recyclerView.o((int) Math.signum(l.x), (int) Math.signum(l.y), null);
        }
        this.j = false;
        View view = this.l;
        if (view != null) {
            if (p(view) == this.g) {
                View view2 = this.l;
                aci aciVar = recyclerView.J;
                k(view2, this.a);
                this.a.a(recyclerView);
                m();
            } else {
                this.l = null;
            }
        }
        if (this.k) {
            aci aciVar2 = recyclerView.J;
            j(i, i2, this.a);
            acf acfVar = this.a;
            int i3 = acfVar.a;
            acfVar.a(recyclerView);
            if (i3 < 0 || !this.k) {
                return;
            }
            this.j = true;
            recyclerView.G.a();
        }
    }

    public final int p(View view) {
        return this.h.aa(view);
    }

    public final int q() {
        return this.h.l.aJ();
    }
}

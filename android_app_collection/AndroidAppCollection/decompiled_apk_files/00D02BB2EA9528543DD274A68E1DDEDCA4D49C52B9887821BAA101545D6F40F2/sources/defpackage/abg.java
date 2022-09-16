package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import defpackage.acl;
import java.util.List;
/* compiled from: PG */
/* renamed from: abg  reason: default package */
/* loaded from: classes.dex */
public abstract class abg<VH extends acl> {
    public final abh b = new abh();
    public boolean c = false;
    public final int d = 1;

    public abstract int c();

    public abstract VH d(ViewGroup viewGroup, int i);

    public abstract void e(VH vh, int i);

    public void f(VH vh, int i, List<Object> list) {
        e(vh, i);
    }

    public final VH g(ViewGroup viewGroup, int i) {
        try {
            aky.a("RV CreateView");
            VH d = d(viewGroup, i);
            if (d.a.getParent() == null) {
                d.f = i;
                return d;
            }
            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        } finally {
            aky.b();
        }
    }

    public final void h(VH vh, int i) {
        abg<? extends acl> abgVar = vh.r;
        if (abgVar == null) {
            vh.c = i;
            if (this.c) {
                vh.e = k(i);
            }
            vh.t(1, 519);
            aky.a("RV OnBindView");
        }
        vh.r = this;
        f(vh, i, vh.x());
        if (abgVar == null) {
            vh.w();
            ViewGroup.LayoutParams layoutParams = vh.a.getLayoutParams();
            if (layoutParams instanceof abt) {
                ((abt) layoutParams).e = true;
            }
            aky.b();
        }
    }

    public int i(int i) {
        return 0;
    }

    public final void j(boolean z) {
        if (!this.b.a()) {
            this.c = z;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public long k(int i) {
        return -1L;
    }

    public void l(VH vh) {
    }

    public void m(VH vh) {
    }

    public void n(VH vh) {
    }

    public final void o(abi abiVar) {
        this.b.registerObserver(abiVar);
    }

    public final void p(abi abiVar) {
        this.b.unregisterObserver(abiVar);
    }

    public void q(RecyclerView recyclerView) {
    }

    public void r(RecyclerView recyclerView) {
    }

    public final void s() {
        this.b.b();
    }

    public final void t(int i) {
        this.b.c(i, 1);
    }

    public final void u(int i, int i2, Object obj) {
        this.b.d(i, i2, obj);
    }

    public final void v(int i, int i2) {
        this.b.g(i, i2);
    }

    public final void w(int i, int i2) {
        this.b.e(i, i2);
    }

    public final void x(int i, int i2) {
        this.b.f(i, i2);
    }
}

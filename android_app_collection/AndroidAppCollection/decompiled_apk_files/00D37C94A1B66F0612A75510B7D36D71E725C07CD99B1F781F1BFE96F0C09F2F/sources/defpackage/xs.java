package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: xs  reason: default package */
/* loaded from: classes4.dex */
public abstract class xs {
    public xt j = null;
    private final ArrayList a = new ArrayList();
    public long h = 120;
    public long i = 250;

    public static final xr u() {
        return new xr();
    }

    public static void v(yo yoVar) {
        int i = yoVar.j;
        if (!yoVar.t() && (i & 4) == 0) {
            int i2 = yoVar.d;
            yoVar.a();
        }
    }

    public static final xr w(yo yoVar) {
        xr u = u();
        u.a(yoVar);
        return u;
    }

    public abstract void b(yo yoVar);

    public abstract void c();

    public abstract void d();

    public boolean i(yo yoVar, List list) {
        return s(yoVar);
    }

    public abstract boolean j();

    public final void l(yo yoVar) {
        n(yoVar);
        xt xtVar = this.j;
        if (xtVar != null) {
            boolean z = true;
            yoVar.n(true);
            if (yoVar.h != null && yoVar.i == null) {
                yoVar.h = null;
            }
            yoVar.i = null;
            if ((yoVar.j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = xtVar.a;
            View view = yoVar.a;
            recyclerView.am();
            vf vfVar = recyclerView.g;
            int b = vfVar.c.b(view);
            if (b == -1) {
                vfVar.l(view);
            } else if (vfVar.a.f(b)) {
                vfVar.a.g(b);
                vfVar.l(view);
                vfVar.c.e(b);
            } else {
                z = false;
            }
            if (z) {
                yo l = RecyclerView.l(view);
                recyclerView.d.l(l);
                recyclerView.d.j(l);
            }
            recyclerView.an(!z);
            if (z || !yoVar.x()) {
                return;
            }
            xtVar.a.removeDetachedView(yoVar.a, false);
        }
    }

    public final void m() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ((akne) this.a.get(i)).a();
        }
        this.a.clear();
    }

    public void n(yo yoVar) {
    }

    public abstract boolean o(yo yoVar, xr xrVar, xr xrVar2);

    public abstract boolean p(yo yoVar, yo yoVar2, xr xrVar, xr xrVar2);

    public abstract boolean q(yo yoVar, xr xrVar, xr xrVar2);

    public abstract boolean r(yo yoVar, xr xrVar, xr xrVar2);

    public boolean s(yo yoVar) {
        throw null;
    }

    public final boolean t(akne akneVar) {
        boolean j = j();
        if (akneVar != null) {
            if (!j) {
                akneVar.a();
            } else {
                this.a.add(akneVar);
            }
        }
        return j;
    }
}

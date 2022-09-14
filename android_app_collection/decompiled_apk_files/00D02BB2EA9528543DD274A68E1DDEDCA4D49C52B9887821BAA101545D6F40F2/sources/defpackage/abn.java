package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: abn  reason: default package */
/* loaded from: classes.dex */
public abstract class abn {
    public abo l = null;
    private final ArrayList<abl> a = new ArrayList<>();
    public long h = 120;
    public long i = 120;
    public long j = 250;
    public long k = 250;

    public static void w(acl aclVar) {
        int i = aclVar.j;
        if (!aclVar.m() && (i & 4) == 0) {
            int i2 = aclVar.d;
            int f = aclVar.f();
            if (i2 == -1 || f == -1 || i2 != f) {
            }
        }
    }

    public abstract void a();

    public abstract void f(acl aclVar);

    public abstract boolean g();

    public abstract void i();

    public boolean j(acl aclVar, List<Object> list) {
        throw null;
    }

    public abstract boolean l(acl aclVar, abm abmVar, abm abmVar2);

    public abstract boolean m(acl aclVar, abm abmVar, abm abmVar2);

    public abstract boolean n(acl aclVar, abm abmVar, abm abmVar2);

    public abstract boolean o(acl aclVar, acl aclVar2, abm abmVar, abm abmVar2);

    public final void p(acl aclVar) {
        q(aclVar);
        abo aboVar = this.l;
        if (aboVar != null) {
            boolean z = true;
            aclVar.z(true);
            if (aclVar.h != null && aclVar.i == null) {
                aclVar.h = null;
            }
            aclVar.i = null;
            if ((aclVar.j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = aboVar.a;
            View view = aclVar.a;
            recyclerView.r();
            yo yoVar = recyclerView.e;
            int b = yoVar.c.b(view);
            if (b == -1) {
                yoVar.l(view);
            } else if (yoVar.a.c(b)) {
                yoVar.a.f(b);
                yoVar.l(view);
                yoVar.c.c(b);
            } else {
                z = false;
            }
            if (z) {
                acl Y = RecyclerView.Y(view);
                recyclerView.b.l(Y);
                recyclerView.b.h(Y);
            }
            recyclerView.s(!z);
            if (z || !aclVar.r()) {
                return;
            }
            aboVar.a.removeDetachedView(aclVar.a, false);
        }
    }

    public void q(acl aclVar) {
    }

    public final boolean r(abl ablVar) {
        boolean g = g();
        if (ablVar != null) {
            if (!g) {
                ablVar.a();
            } else {
                this.a.add(ablVar);
            }
        }
        return g;
    }

    public boolean s(acl aclVar) {
        throw null;
    }

    public final void t() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            this.a.get(i).a();
        }
        this.a.clear();
    }

    public abm u() {
        return new abm();
    }

    public final abm v(acl aclVar) {
        abm u = u();
        u.a(aclVar);
        return u;
    }
}

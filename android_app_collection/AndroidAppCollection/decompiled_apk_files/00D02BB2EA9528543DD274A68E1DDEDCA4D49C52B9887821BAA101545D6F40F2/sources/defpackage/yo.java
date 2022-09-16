package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: yo  reason: default package */
/* loaded from: classes.dex */
public final class yo {
    public final yn a = new yn();
    public final List<View> b = new ArrayList();
    public final abe c;

    public yo(abe abeVar) {
        this.c = abeVar;
    }

    private final int m(int i) {
        if (i < 0) {
            return -1;
        }
        int a = this.c.a();
        int i2 = i;
        while (i2 < a) {
            int g = i - (i2 - this.a.g(i2));
            if (g == 0) {
                while (this.a.c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += g;
        }
        return -1;
    }

    public final void a(View view) {
        this.b.add(view);
        abe abeVar = this.c;
        acl Y = RecyclerView.Y(view);
        if (Y != null) {
            RecyclerView recyclerView = abeVar.a;
            int i = Y.p;
            if (i != -1) {
                Y.o = i;
            } else {
                Y.o = od.l(Y.a);
            }
            recyclerView.as(Y, 4);
        }
    }

    public final void b(View view, int i, boolean z) {
        int m;
        if (i < 0) {
            m = this.c.a();
        } else {
            m = m(i);
        }
        this.a.e(m, z);
        if (z) {
            a(view);
        }
        abe abeVar = this.c;
        abeVar.a.addView(view, m);
        RecyclerView recyclerView = abeVar.a;
        acl Y = RecyclerView.Y(view);
        abg abgVar = recyclerView.k;
        if (abgVar != null && Y != null) {
            abgVar.m(Y);
        }
        List<abu> list = recyclerView.v;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                recyclerView.v.get(size).d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(int i) {
        int m = m(i);
        View d = this.c.d(m);
        if (d == null) {
            return;
        }
        if (this.a.f(m)) {
            l(d);
        }
        this.c.c(m);
    }

    public final View d(int i) {
        return this.c.d(m(i));
    }

    public final void e(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int m;
        if (i < 0) {
            m = this.c.a();
        } else {
            m = m(i);
        }
        this.a.e(m, z);
        if (z) {
            a(view);
        }
        abe abeVar = this.c;
        acl Y = RecyclerView.Y(view);
        if (Y != null) {
            if (Y.r() || Y.c()) {
                Y.k();
            } else {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + Y + abeVar.a.Sx());
            }
        }
        abeVar.a.attachViewToParent(view, m, layoutParams);
    }

    public final int f() {
        return this.c.a() - this.b.size();
    }

    public final int g() {
        return this.c.a();
    }

    public final View h(int i) {
        return this.c.d(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(int i) {
        acl Y;
        int m = m(i);
        this.a.f(m);
        abe abeVar = this.c;
        View d = abeVar.d(m);
        if (d != null && (Y = RecyclerView.Y(d)) != null) {
            if (!Y.r() || Y.c()) {
                Y.u(256);
            } else {
                throw new IllegalArgumentException("called detach on an already detached child " + Y + abeVar.a.Sx());
            }
        }
        abeVar.a.detachViewFromParent(m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int j(View view) {
        int b = this.c.b(view);
        if (b != -1 && !this.a.c(b)) {
            return b - this.a.g(b);
        }
        return -1;
    }

    public final boolean k(View view) {
        return this.b.contains(view);
    }

    public final void l(View view) {
        if (this.b.remove(view)) {
            this.c.e(view);
        }
    }

    public final String toString() {
        return this.a.toString() + ", hidden list:" + this.b.size();
    }
}

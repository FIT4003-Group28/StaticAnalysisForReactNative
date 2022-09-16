package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: vf  reason: default package */
/* loaded from: classes4.dex */
public final class vf {
    public final ve a = new ve();
    public final List b = new ArrayList();
    public final xm c;

    public vf(xm xmVar) {
        this.c = xmVar;
    }

    private final int m(int i) {
        if (i < 0) {
            return -1;
        }
        int a = this.c.a();
        int i2 = i;
        while (i2 < a) {
            int a2 = i - (i2 - this.a.a(i2));
            if (a2 == 0) {
                while (this.a.f(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += a2;
        }
        return -1;
    }

    public final int a() {
        return this.c.a() - this.b.size();
    }

    public final int b() {
        return this.c.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(View view) {
        int b = this.c.b(view);
        if (b != -1 && !this.a.f(b)) {
            return b - this.a.a(b);
        }
        return -1;
    }

    public final View d(int i) {
        return this.c.c(m(i));
    }

    public final View e(int i) {
        return this.c.c(i);
    }

    public final void f(View view, int i, boolean z) {
        int m;
        if (i < 0) {
            m = this.c.a();
        } else {
            m = m(i);
        }
        this.a.c(m, z);
        if (z) {
            i(view);
        }
        xm xmVar = this.c;
        xmVar.a.addView(view, m);
        RecyclerView recyclerView = xmVar.a;
        RecyclerView.l(view);
        List list = recyclerView.x;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                ((xy) recyclerView.x.get(size)).e();
            }
        }
    }

    public final void g(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int m;
        if (i < 0) {
            m = this.c.a();
        } else {
            m = m(i);
        }
        this.a.c(m, z);
        if (z) {
            i(view);
        }
        xm xmVar = this.c;
        yo l = RecyclerView.l(view);
        if (l != null) {
            if (l.x() || l.A()) {
                l.j();
            } else {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + l + xmVar.a.p());
            }
        }
        xmVar.a.attachViewToParent(view, m, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(int i) {
        yo l;
        int m = m(i);
        this.a.g(m);
        xm xmVar = this.c;
        View c = xmVar.c(m);
        if (c != null && (l = RecyclerView.l(c)) != null) {
            if (!l.x() || l.A()) {
                l.f(256);
            } else {
                throw new IllegalArgumentException("called detach on an already detached child " + l + xmVar.a.p());
            }
        }
        xmVar.a.detachViewFromParent(m);
    }

    public final void i(View view) {
        this.b.add(view);
        xm xmVar = this.c;
        yo l = RecyclerView.l(view);
        if (l != null) {
            RecyclerView recyclerView = xmVar.a;
            int i = l.p;
            if (i != -1) {
                l.o = i;
            } else {
                l.o = lj.c(l.a);
            }
            recyclerView.ay(l, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(int i) {
        int m = m(i);
        View c = this.c.c(m);
        if (c == null) {
            return;
        }
        if (this.a.g(m)) {
            l(c);
        }
        this.c.e(m);
    }

    public final boolean k(View view) {
        return this.b.contains(view);
    }

    public final void l(View view) {
        if (this.b.remove(view)) {
            this.c.d(view);
        }
    }

    public final String toString() {
        return this.a.toString() + ", hidden list:" + this.b.size();
    }
}

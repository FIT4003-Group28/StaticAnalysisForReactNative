package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: xn  reason: default package */
/* loaded from: classes4.dex */
public final class xn {
    final /* synthetic */ RecyclerView a;

    public xn(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final yo a(int i) {
        yo j = this.a.j(i, true);
        if (j != null && !this.a.g.k(j.a)) {
            return j;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(tv tvVar) {
        int i = tvVar.a;
        if (i == 1) {
            this.a.n.v(tvVar.b, tvVar.d);
        } else if (i == 2) {
            this.a.n.y(tvVar.b, tvVar.d);
        } else if (i != 4) {
            if (i != 8) {
                return;
            }
            this.a.n.x(tvVar.b, tvVar.d);
        } else {
            xw xwVar = this.a.n;
            int i2 = tvVar.b;
            int i3 = tvVar.d;
            Object obj = tvVar.c;
            xwVar.z(i2, i3);
        }
    }

    public final void c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.a;
        int b = recyclerView.g.b();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < b; i6++) {
            View e = recyclerView.g.e(i6);
            yo l = RecyclerView.l(e);
            if (l != null && !l.A() && (i4 = l.c) >= i && i4 < i5) {
                l.f(2);
                l.e(obj);
                ((xx) e.getLayoutParams()).e = true;
            }
        }
        yd ydVar = recyclerView.d;
        int size = ydVar.c.size();
        while (true) {
            size--;
            if (size < 0) {
                this.a.O = true;
                return;
            }
            yo yoVar = (yo) ydVar.c.get(size);
            if (yoVar != null && (i3 = yoVar.c) >= i && i3 < i5) {
                yoVar.f(2);
                ydVar.h(size);
            }
        }
    }

    public final void d(int i, int i2) {
        RecyclerView recyclerView = this.a;
        int b = recyclerView.g.b();
        for (int i3 = 0; i3 < b; i3++) {
            yo l = RecyclerView.l(recyclerView.g.e(i3));
            if (l != null && !l.A() && l.c >= i) {
                l.k(i2, false);
                recyclerView.M.f = true;
            }
        }
        yd ydVar = recyclerView.d;
        int size = ydVar.c.size();
        for (int i4 = 0; i4 < size; i4++) {
            yo yoVar = (yo) ydVar.c.get(i4);
            if (yoVar != null && yoVar.c >= i) {
                yoVar.k(i2, false);
            }
        }
        recyclerView.requestLayout();
        this.a.N = true;
    }

    public final void e(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.a;
        int b = recyclerView.g.b();
        int i5 = -1;
        int i6 = i < i2 ? -1 : 1;
        int i7 = i < i2 ? i2 : i;
        int i8 = i < i2 ? i : i2;
        for (int i9 = 0; i9 < b; i9++) {
            yo l = RecyclerView.l(recyclerView.g.e(i9));
            if (l != null && (i4 = l.c) >= i8 && i4 <= i7) {
                if (i4 == i) {
                    l.k(i2 - i, false);
                } else {
                    l.k(i6, false);
                }
                recyclerView.M.f = true;
            }
        }
        yd ydVar = recyclerView.d;
        if (i >= i2) {
            i5 = 1;
        }
        int size = ydVar.c.size();
        for (int i10 = 0; i10 < size; i10++) {
            yo yoVar = (yo) ydVar.c.get(i10);
            if (yoVar != null && (i3 = yoVar.c) >= i8 && i3 <= i7) {
                if (i3 == i) {
                    yoVar.k(i2 - i, false);
                } else {
                    yoVar.k(i5, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.a.N = true;
    }

    public final void f(int i, int i2) {
        this.a.Q(i, i2, true);
        RecyclerView recyclerView = this.a;
        recyclerView.N = true;
        recyclerView.M.c += i2;
    }
}

package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: abf  reason: default package */
/* loaded from: classes.dex */
public final class abf {
    final /* synthetic */ RecyclerView a;

    public abf(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final acl a(int i) {
        RecyclerView recyclerView = this.a;
        int g = recyclerView.e.g();
        int i2 = 0;
        acl aclVar = null;
        while (true) {
            if (i2 >= g) {
                break;
            }
            acl Y = RecyclerView.Y(recyclerView.e.h(i2));
            if (Y != null && !Y.p() && Y.c == i) {
                if (!recyclerView.e.k(Y.a)) {
                    aclVar = Y;
                    break;
                }
                aclVar = Y;
            }
            i2++;
        }
        if (aclVar != null && !this.a.e.k(aclVar.a)) {
            return aclVar;
        }
        return null;
    }

    public final void b(int i, int i2) {
        this.a.S(i, i2, true);
        RecyclerView recyclerView = this.a;
        recyclerView.K = true;
        recyclerView.J.c += i2;
    }

    public final void c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.a;
        int g = recyclerView.e.g();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < g; i6++) {
            View h = recyclerView.e.h(i6);
            acl Y = RecyclerView.Y(h);
            if (Y != null && !Y.c() && (i4 = Y.c) >= i && i4 < i5) {
                Y.u(2);
                Y.v(obj);
                ((abt) h.getLayoutParams()).e = true;
            }
        }
        aca acaVar = recyclerView.b;
        int size = acaVar.c.size();
        while (true) {
            size--;
            if (size < 0) {
                this.a.L = true;
                return;
            }
            acl aclVar = acaVar.c.get(size);
            if (aclVar != null && (i3 = aclVar.c) >= i && i3 < i5) {
                aclVar.u(2);
                acaVar.g(size);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(wz wzVar) {
        int i = wzVar.a;
        if (i == 1) {
            this.a.l.u(wzVar.b, wzVar.d);
        } else if (i == 2) {
            this.a.l.x(wzVar.b, wzVar.d);
        } else if (i != 4) {
            if (i != 8) {
                return;
            }
            this.a.l.w(wzVar.b, wzVar.d);
        } else {
            abs absVar = this.a.l;
            int i2 = wzVar.b;
            int i3 = wzVar.d;
            Object obj = wzVar.c;
            absVar.y(i2, i3);
        }
    }

    public final void e(int i, int i2) {
        RecyclerView recyclerView = this.a;
        int g = recyclerView.e.g();
        for (int i3 = 0; i3 < g; i3++) {
            acl Y = RecyclerView.Y(recyclerView.e.h(i3));
            if (Y != null && !Y.c() && Y.c >= i) {
                Y.a(i2, false);
                recyclerView.J.f = true;
            }
        }
        aca acaVar = recyclerView.b;
        int size = acaVar.c.size();
        for (int i4 = 0; i4 < size; i4++) {
            acl aclVar = acaVar.c.get(i4);
            if (aclVar != null && aclVar.c >= i) {
                aclVar.a(i2, true);
            }
        }
        recyclerView.requestLayout();
        this.a.K = true;
    }

    public final void f(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.a;
        int g = recyclerView.e.g();
        int i5 = -1;
        int i6 = i < i2 ? -1 : 1;
        int i7 = i < i2 ? i2 : i;
        int i8 = i < i2 ? i : i2;
        for (int i9 = 0; i9 < g; i9++) {
            acl Y = RecyclerView.Y(recyclerView.e.h(i9));
            if (Y != null && (i4 = Y.c) >= i8 && i4 <= i7) {
                if (i4 == i) {
                    Y.a(i2 - i, false);
                } else {
                    Y.a(i6, false);
                }
                recyclerView.J.f = true;
            }
        }
        aca acaVar = recyclerView.b;
        if (i >= i2) {
            i5 = 1;
        }
        int size = acaVar.c.size();
        for (int i10 = 0; i10 < size; i10++) {
            acl aclVar = acaVar.c.get(i10);
            if (aclVar != null && (i3 = aclVar.c) >= i8 && i3 <= i7) {
                if (i3 == i) {
                    aclVar.a(i2 - i, false);
                } else {
                    aclVar.a(i5, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.a.K = true;
    }
}

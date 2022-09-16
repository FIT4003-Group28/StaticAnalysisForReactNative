package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ajrj  reason: default package */
/* loaded from: classes.dex */
public final class ajrj extends ajqd {
    public final List a = new ArrayList();

    private final void u(int i, ajqm ajqmVar, boolean z) {
        ylr.c();
        ajri ajriVar = new ajri(this, ajqmVar);
        ajriVar.a.lT(ajriVar);
        this.a.add(i, ajriVar);
        s();
        if (!z || ajriVar.a.isEmpty()) {
            return;
        }
        y(ajriVar.b, ajriVar.a.a());
    }

    @Override // defpackage.ajqm
    public final int a() {
        if (this.a.isEmpty()) {
            return 0;
        }
        List list = this.a;
        return ((ajri) list.get(list.size() - 1)).g();
    }

    @Override // defpackage.ajqm
    public final long b(int i) {
        ajri l = l(i);
        if (l == null) {
            return 0L;
        }
        return l.a.b(l.f(i));
    }

    @Override // defpackage.ajqm
    public final Object c(int i) {
        ajri l = l(i);
        if (l == null) {
            return null;
        }
        return l.a.c(l.f(i));
    }

    @Override // defpackage.ajqm
    public final boolean contains(Object obj) {
        throw null;
    }

    public final int h() {
        return this.a.size();
    }

    public final int i(ajqm ajqmVar) {
        if (ajqmVar == null || this.a.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < this.a.size(); i++) {
            if (((ajri) this.a.get(i)).a == ajqmVar) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.ajqm
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final int j(ajqm ajqmVar) {
        for (ajri ajriVar : this.a) {
            if (ajriVar.a == ajqmVar) {
                return ajriVar.b;
            }
        }
        return -1;
    }

    public final ajri k(int i) {
        if (i < 0 || i >= this.a.size()) {
            return null;
        }
        return (ajri) this.a.get(i);
    }

    public final ajri l(int i) {
        if (i >= 0 && i < a()) {
            int size = this.a.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >> 1;
                ajri ajriVar = (ajri) this.a.get(i3);
                if (i < ajriVar.b) {
                    size = i3 - 1;
                } else if (i < ajriVar.g()) {
                    return ajriVar;
                } else {
                    i2 = i3 + 1;
                }
            }
        }
        return null;
    }

    public final void m(ajqm ajqmVar) {
        n(-1, ajqmVar);
    }

    @Override // defpackage.ajqd, defpackage.ajqm
    public final void mH(ajrs ajrsVar, int i) {
        super.mH(ajrsVar, i);
        ajri l = l(i);
        if (l != null) {
            l.a.mH(ajrsVar, l.f(i));
        }
    }

    public final void n(int i, ajqm ajqmVar) {
        if (i == -1) {
            i = this.a.size();
        }
        u(i, ajqmVar, true);
    }

    public final void o(ajqm ajqmVar) {
        n(0, ajqmVar);
    }

    public final void p(int i) {
        ylr.c();
        ajri ajriVar = (ajri) this.a.get(i);
        ajriVar.a.pl(ajriVar);
        this.a.remove(i);
    }

    public final void q(ajqm ajqmVar) {
        ajri ajriVar;
        ylr.c();
        int size = this.a.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
            ajriVar = (ajri) this.a.get(size);
        } while (ajriVar.a != ajqmVar);
        p(size);
        s();
        if (!ajriVar.a.isEmpty()) {
            z(ajriVar.b, ajriVar.a.a());
        }
    }

    public final void r(ajqm ajqmVar, ajqm ajqmVar2) {
        ylr.c();
        for (int i = 0; i < this.a.size(); i++) {
            ajri ajriVar = (ajri) this.a.get(i);
            if (ajriVar.a == ajqmVar) {
                p(i);
                u(i, ajqmVar2, false);
                s();
                if (!ajriVar.a.isEmpty()) {
                    ajri ajriVar2 = (ajri) this.a.get(i);
                    int a = ajriVar2.a.a();
                    int a2 = ajriVar.a.a();
                    x(ajriVar.b, Math.min(a2, a));
                    if (a > a2) {
                        y(ajriVar.b + a2, a - a2);
                        return;
                    } else if (a2 <= a) {
                        return;
                    } else {
                        z(ajriVar2.b + a, a2 - a);
                        return;
                    }
                }
                int a3 = ((ajri) this.a.get(i)).a.a();
                if (a3 <= 0) {
                    return;
                }
                y(ajriVar.b, a3);
                return;
            }
        }
    }

    public final void s() {
        int i = 0;
        for (ajri ajriVar : this.a) {
            ajriVar.b = i;
            i = ajriVar.g();
        }
    }

    public final void t() {
        ylr.c();
        if (this.a.isEmpty()) {
            return;
        }
        int a = a();
        int size = this.a.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            p(size);
        }
        if (a <= 0) {
            return;
        }
        z(0, a);
    }
}

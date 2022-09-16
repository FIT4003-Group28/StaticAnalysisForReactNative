package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: yd  reason: default package */
/* loaded from: classes4.dex */
public final class yd {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    int f;
    public yc g;
    public final /* synthetic */ RecyclerView h;

    public yd(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final int a(int i) {
        if (i < 0 || i >= this.h.M.a()) {
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + this.h.M.a() + this.h.p());
        }
        RecyclerView recyclerView = this.h;
        return !recyclerView.M.g ? i : recyclerView.f.a(i);
    }

    public final yc b() {
        if (this.g == null) {
            this.g = new yc();
        }
        return this.g;
    }

    public final View c(int i) {
        return n(i, Long.MAX_VALUE).a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(yo yoVar, boolean z) {
        RecyclerView.x(yoVar);
        View view = yoVar.a;
        yq yqVar = this.h.Q;
        if (yqVar != null) {
            jo k = yqVar.k();
            lj.M(view, k instanceof yp ? (jo) ((yp) k).c.remove(view) : null);
        }
        if (z) {
            ye yeVar = this.h.o;
            if (yeVar != null) {
                yeVar.a(yoVar);
            }
            int size = this.h.p.size();
            for (int i = 0; i < size; i++) {
                ((ye) this.h.p.get(i)).a(yoVar);
            }
            xo xoVar = this.h.m;
            if (xoVar != null) {
                xoVar.p(yoVar);
            }
            RecyclerView recyclerView = this.h;
            if (recyclerView.M != null) {
                recyclerView.h.h(yoVar);
            }
        }
        yoVar.r = null;
        yoVar.q = null;
        b().f(yoVar);
    }

    public final void e() {
        this.a.clear();
        g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(View view) {
        yo l = RecyclerView.l(view);
        l.m = null;
        l.n = false;
        l.i();
        j(l);
    }

    public final void g() {
        int size = this.c.size();
        while (true) {
            size--;
            if (size >= 0) {
                h(size);
            } else {
                this.c.clear();
                int i = RecyclerView.V;
                this.h.L.b();
                return;
            }
        }
    }

    public final void h(int i) {
        d((yo) this.c.get(i), true);
        this.c.remove(i);
    }

    public final void i(View view) {
        yo l = RecyclerView.l(view);
        if (l.x()) {
            this.h.removeDetachedView(view, false);
        }
        if (l.w()) {
            l.p();
        } else if (l.B()) {
            l.i();
        }
        j(l);
        if (this.h.E == null || l.u()) {
            return;
        }
        this.h.E.b(l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(yo yoVar) {
        boolean z;
        boolean z2 = true;
        boolean z3 = false;
        if (yoVar.w() || yoVar.a.getParent() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(yoVar.w());
            sb.append(" isAttached:");
            if (yoVar.a.getParent() == null) {
                z2 = false;
            }
            sb.append(z2);
            sb.append(this.h.p());
            throw new IllegalArgumentException(sb.toString());
        } else if (yoVar.x()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + yoVar + this.h.p());
        } else if (!yoVar.A()) {
            boolean z4 = (yoVar.j & 16) == 0 && lj.ai(yoVar.a);
            if (yoVar.u()) {
                if (this.f <= 0 || yoVar.q(526)) {
                    z = false;
                } else {
                    int size = this.c.size();
                    if (size >= this.f && size > 0) {
                        h(0);
                        size--;
                    }
                    if (size > 0 && !this.h.L.d(yoVar.c)) {
                        do {
                            size--;
                            if (size < 0) {
                                break;
                            }
                        } while (this.h.L.d(((yo) this.c.get(size)).c));
                        size++;
                    }
                    this.c.add(size, yoVar);
                    z = true;
                }
                if (!z) {
                    d(yoVar, true);
                    z3 = z;
                    this.h.h.h(yoVar);
                    if (z3 || z2 || !z4) {
                        return;
                    }
                    yoVar.r = null;
                    yoVar.q = null;
                    return;
                }
                z3 = z;
            }
            z2 = false;
            this.h.h.h(yoVar);
            if (z3) {
            }
        } else {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + this.h.p());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(View view) {
        xs xsVar;
        yo l = RecyclerView.l(view);
        if (l.q(12) || !l.y() || (xsVar = this.h.E) == null || xsVar.i(l, l.d())) {
            if (!l.t() || l.v() || this.h.m.b) {
                l.o(this, false);
                this.a.add(l);
                return;
            }
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + this.h.p());
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        l.o(this, true);
        this.b.add(l);
    }

    public final void l(yo yoVar) {
        if (yoVar.n) {
            this.b.remove(yoVar);
        } else {
            this.a.remove(yoVar);
        }
        yoVar.m = null;
        yoVar.n = false;
        yoVar.i();
    }

    public final void m() {
        xw xwVar = this.h.n;
        this.f = this.e + (xwVar != null ? xwVar.D : 0);
        int size = this.c.size();
        while (true) {
            size--;
            if (size < 0 || this.c.size() <= this.f) {
                return;
            }
            h(size);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01fd, code lost:
        if (r8.e != r9.mp(r8.c)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0401, code lost:
        if ((r9 + r6) >= r20) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c3, code lost:
        if (r18.h.M.g == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.yo n(int r19, long r20) {
        /*
            Method dump skipped, instructions count: 1281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yd.n(int, long):yo");
    }
}

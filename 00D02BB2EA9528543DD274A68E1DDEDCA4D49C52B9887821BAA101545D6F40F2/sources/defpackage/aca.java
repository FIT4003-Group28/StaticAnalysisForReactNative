package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: aca  reason: default package */
/* loaded from: classes.dex */
public final class aca {
    public final ArrayList<acl> a;
    public ArrayList<acl> b;
    public final ArrayList<acl> c;
    public final List<acl> d;
    public int e;
    int f;
    public abz g;
    public acj h;
    public final /* synthetic */ RecyclerView i;

    public aca(RecyclerView recyclerView) {
        this.i = recyclerView;
        ArrayList<acl> arrayList = new ArrayList<>();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList<>();
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final void a() {
        this.a.clear();
        f();
    }

    public final void b() {
        abs absVar = this.i.l;
        this.f = this.e + (absVar != null ? absVar.z : 0);
        int size = this.c.size();
        while (true) {
            size--;
            if (size < 0 || this.c.size() <= this.f) {
                return;
            }
            g(size);
        }
    }

    public final int c(int i) {
        if (i < 0 || i >= this.i.J.b()) {
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + this.i.J.b() + this.i.Sx());
        }
        RecyclerView recyclerView = this.i;
        return !recyclerView.J.g ? i : recyclerView.d.g(i);
    }

    public final View d(int i) {
        return n(i, Long.MAX_VALUE).a;
    }

    public final void e(View view) {
        acl Y = RecyclerView.Y(view);
        if (Y.r()) {
            this.i.removeDetachedView(view, false);
        }
        if (Y.g()) {
            Y.h();
        } else if (Y.i()) {
            Y.j();
        }
        h(Y);
        if (this.i.C == null || Y.A()) {
            return;
        }
        this.i.C.f(Y);
    }

    public final void f() {
        int size = this.c.size();
        while (true) {
            size--;
            if (size >= 0) {
                g(size);
            } else {
                this.c.clear();
                int i = RecyclerView.R;
                this.i.I.d();
                return;
            }
        }
    }

    public final void g(int i) {
        i(this.c.get(i), true);
        this.c.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(acl aclVar) {
        boolean z;
        boolean z2 = true;
        boolean z3 = false;
        if (aclVar.g() || aclVar.a.getParent() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(aclVar.g());
            sb.append(" isAttached:");
            if (aclVar.a.getParent() == null) {
                z2 = false;
            }
            sb.append(z2);
            sb.append(this.i.Sx());
            throw new IllegalArgumentException(sb.toString());
        } else if (aclVar.r()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + aclVar + this.i.Sx());
        } else if (!aclVar.c()) {
            boolean z4 = (aclVar.j & 16) == 0 && od.g(aclVar.a);
            if (aclVar.A()) {
                if (this.f <= 0 || aclVar.q(526)) {
                    z = false;
                } else {
                    int size = this.c.size();
                    if (size >= this.f && size > 0) {
                        g(0);
                        size--;
                    }
                    if (size > 0 && !this.i.I.c(aclVar.c)) {
                        do {
                            size--;
                            if (size < 0) {
                                break;
                            }
                        } while (this.i.I.c(this.c.get(size).c));
                        size++;
                    }
                    this.c.add(size, aclVar);
                    z = true;
                }
                if (!z) {
                    i(aclVar, true);
                    z3 = z;
                    this.i.f.i(aclVar);
                    if (z3 || z2 || !z4) {
                        return;
                    }
                    aclVar.r = null;
                    aclVar.q = null;
                    return;
                }
                z3 = z;
            }
            z2 = false;
            this.i.f.i(aclVar);
            if (z3) {
            }
        } else {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + this.i.Sx());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(acl aclVar, boolean z) {
        RecyclerView.ai(aclVar);
        View view = aclVar.a;
        acn acnVar = this.i.N;
        if (acnVar != null) {
            ne l = acnVar.l();
            od.c(view, l instanceof acm ? ((acm) l).c.remove(view) : null);
        }
        if (z) {
            acb acbVar = this.i.m;
            if (acbVar != null) {
                acbVar.a(aclVar);
            }
            int size = this.i.n.size();
            for (int i = 0; i < size; i++) {
                this.i.n.get(i).a(aclVar);
            }
            abg abgVar = this.i.k;
            if (abgVar != null) {
                abgVar.l(aclVar);
            }
            RecyclerView recyclerView = this.i;
            if (recyclerView.J != null) {
                recyclerView.f.i(aclVar);
            }
        }
        aclVar.r = null;
        aclVar.q = null;
        m().c(aclVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(View view) {
        acl Y = RecyclerView.Y(view);
        Y.m = null;
        Y.n = false;
        Y.j();
        h(Y);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(View view) {
        abn abnVar;
        acl Y = RecyclerView.Y(view);
        if (Y.q(12) || !Y.B() || (abnVar = this.i.C) == null || abnVar.j(Y, Y.x())) {
            if (!Y.m() || Y.p() || this.i.k.c) {
                Y.l(this, false);
                this.a.add(Y);
                return;
            }
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + this.i.Sx());
        }
        if (this.b == null) {
            this.b = new ArrayList<>();
        }
        Y.l(this, true);
        this.b.add(Y);
    }

    public final void l(acl aclVar) {
        if (aclVar.n) {
            this.b.remove(aclVar);
        } else {
            this.a.remove(aclVar);
        }
        aclVar.m = null;
        aclVar.n = false;
        aclVar.j();
    }

    public final abz m() {
        if (this.g == null) {
            this.g = new abz();
        }
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01fd, code lost:
        if (r8.e != r9.k(r8.c)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x045a, code lost:
        if ((r4 + r9) >= r20) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c3, code lost:
        if (r18.i.J.g == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.acl n(int r19, long r20) {
        /*
            Method dump skipped, instructions count: 1326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aca.n(int, long):acl");
    }
}

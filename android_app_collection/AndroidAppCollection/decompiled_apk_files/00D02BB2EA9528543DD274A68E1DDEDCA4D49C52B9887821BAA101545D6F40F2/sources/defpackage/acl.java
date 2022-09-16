package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: acl  reason: default package */
/* loaded from: classes.dex */
public class acl {
    private static final List<Object> s = Collections.emptyList();
    public final View a;
    public WeakReference<RecyclerView> b;
    int j;
    RecyclerView q;
    abg<? extends acl> r;
    public int c = -1;
    public int d = -1;
    public long e = -1;
    public int f = -1;
    int g = -1;
    public acl h = null;
    public acl i = null;
    List<Object> k = null;
    List<Object> l = null;
    private int t = 0;
    aca m = null;
    boolean n = false;
    public int o = 0;
    public int p = -1;

    public acl(View view) {
        if (view != null) {
            this.a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final boolean A() {
        return (this.j & 16) == 0 && !od.g(this.a);
    }

    public final boolean B() {
        return (this.j & 2) != 0;
    }

    public final void a(int i, boolean z) {
        if (this.d == -1) {
            this.d = this.c;
        }
        int i2 = this.g;
        if (i2 == -1) {
            i2 = this.c;
            this.g = i2;
        }
        if (z) {
            this.g = i2 + i;
        }
        this.c += i;
        if (this.a.getLayoutParams() != null) {
            ((abt) this.a.getLayoutParams()).e = true;
        }
    }

    public final void b() {
        this.d = -1;
        this.g = -1;
    }

    public final boolean c() {
        return (this.j & 128) != 0;
    }

    public final int d() {
        int i = this.g;
        return i == -1 ? this.c : i;
    }

    public final int e() {
        RecyclerView recyclerView;
        abg<? extends acl> abgVar;
        int ak;
        if (this.r == null || (recyclerView = this.q) == null || (abgVar = recyclerView.k) == null || (ak = recyclerView.ak(this)) == -1 || this.r != abgVar) {
            return -1;
        }
        return ak;
    }

    public final int f() {
        RecyclerView recyclerView = this.q;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.ak(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g() {
        return this.m != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        this.m.l(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i() {
        return (this.j & 32) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        this.j &= -33;
    }

    public final void k() {
        this.j &= -257;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(aca acaVar, boolean z) {
        this.m = acaVar;
        this.n = z;
    }

    public final boolean m() {
        return (this.j & 4) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean n() {
        return (this.j & 2) != 0;
    }

    public final boolean o() {
        return (this.j & 1) != 0;
    }

    public final boolean p() {
        return (this.j & 8) != 0;
    }

    public final boolean q(int i) {
        return (i & this.j) != 0;
    }

    public final boolean r() {
        return (this.j & 256) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean s() {
        return (this.a.getParent() == null || this.a.getParent() == this.q) ? false : true;
    }

    public final void t(int i, int i2) {
        this.j = (i & i2) | (this.j & (i2 ^ (-1)));
    }

    public final String toString() {
        String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
        StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
        if (g()) {
            sb.append(" scrap ");
            sb.append(true != this.n ? "[attachedScrap]" : "[changeScrap]");
        }
        if (m()) {
            sb.append(" invalid");
        }
        if (!o()) {
            sb.append(" unbound");
        }
        if (n()) {
            sb.append(" update");
        }
        if (p()) {
            sb.append(" removed");
        }
        if (c()) {
            sb.append(" ignored");
        }
        if (r()) {
            sb.append(" tmpDetached");
        }
        if (!A()) {
            sb.append(" not recyclable(" + this.t + ")");
        }
        if ((this.j & 512) != 0 || m()) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public final void u(int i) {
        this.j = i | this.j;
    }

    public final void v(Object obj) {
        if (obj == null) {
            u(1024);
        } else if ((1024 & this.j) != 0) {
        } else {
            if (this.k == null) {
                ArrayList arrayList = new ArrayList();
                this.k = arrayList;
                this.l = Collections.unmodifiableList(arrayList);
            }
            this.k.add(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void w() {
        List<Object> list = this.k;
        if (list != null) {
            list.clear();
        }
        this.j &= -1025;
    }

    public final List<Object> x() {
        if ((this.j & 1024) == 0) {
            List<Object> list = this.k;
            return (list == null || list.size() == 0) ? s : this.l;
        }
        return s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void y() {
        this.j = 0;
        this.c = -1;
        this.d = -1;
        this.e = -1L;
        this.g = -1;
        this.t = 0;
        this.h = null;
        this.i = null;
        w();
        this.o = 0;
        this.p = -1;
        RecyclerView.ai(this);
    }

    public final void z(boolean z) {
        int i = z ? this.t - 1 : this.t + 1;
        this.t = i;
        if (i < 0) {
            this.t = 0;
            String str = "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this;
        } else if (!z && i == 1) {
            this.j |= 16;
        } else if (!z || i != 0) {
        } else {
            this.j &= -17;
        }
    }
}

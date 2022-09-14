package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.o implements f, RecyclerView.z.b {
    int A;
    int B;
    private boolean C;
    d D;
    final a E;
    private final b F;
    private int G;
    private int[] H;
    int s;
    private c t;
    k u;
    private boolean v;
    private boolean w;
    boolean x;
    private boolean y;
    private boolean z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        k f1886a;

        /* renamed from: b  reason: collision with root package name */
        int f1887b;

        /* renamed from: c  reason: collision with root package name */
        int f1888c;

        /* renamed from: d  reason: collision with root package name */
        boolean f1889d;

        /* renamed from: e  reason: collision with root package name */
        boolean f1890e;

        a() {
            b();
        }

        void a() {
            this.f1888c = this.f1889d ? this.f1886a.b() : this.f1886a.f();
        }

        public void a(View view, int i) {
            this.f1888c = this.f1889d ? this.f1886a.a(view) + this.f1886a.h() : this.f1886a.d(view);
            this.f1887b = i;
        }

        boolean a(View view, RecyclerView.a0 a0Var) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return !pVar.c() && pVar.a() >= 0 && pVar.a() < a0Var.a();
        }

        void b() {
            this.f1887b = -1;
            this.f1888c = RecyclerView.UNDEFINED_DURATION;
            this.f1889d = false;
            this.f1890e = false;
        }

        public void b(View view, int i) {
            int h2 = this.f1886a.h();
            if (h2 >= 0) {
                a(view, i);
                return;
            }
            this.f1887b = i;
            if (this.f1889d) {
                int b2 = (this.f1886a.b() - h2) - this.f1886a.a(view);
                this.f1888c = this.f1886a.b() - b2;
                if (b2 <= 0) {
                    return;
                }
                int b3 = this.f1888c - this.f1886a.b(view);
                int f2 = this.f1886a.f();
                int min = b3 - (f2 + Math.min(this.f1886a.d(view) - f2, 0));
                if (min >= 0) {
                    return;
                }
                this.f1888c += Math.min(b2, -min);
                return;
            }
            int d2 = this.f1886a.d(view);
            int f3 = d2 - this.f1886a.f();
            this.f1888c = d2;
            if (f3 <= 0) {
                return;
            }
            int b4 = (this.f1886a.b() - Math.min(0, (this.f1886a.b() - h2) - this.f1886a.a(view))) - (d2 + this.f1886a.b(view));
            if (b4 >= 0) {
                return;
            }
            this.f1888c -= Math.min(f3, -b4);
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f1887b + ", mCoordinate=" + this.f1888c + ", mLayoutFromEnd=" + this.f1889d + ", mValid=" + this.f1890e + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1891a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1892b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1893c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1894d;

        protected b() {
        }

        void a() {
            this.f1891a = 0;
            this.f1892b = false;
            this.f1893c = false;
            this.f1894d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: b  reason: collision with root package name */
        int f1896b;

        /* renamed from: c  reason: collision with root package name */
        int f1897c;

        /* renamed from: d  reason: collision with root package name */
        int f1898d;

        /* renamed from: e  reason: collision with root package name */
        int f1899e;

        /* renamed from: f  reason: collision with root package name */
        int f1900f;

        /* renamed from: g  reason: collision with root package name */
        int f1901g;
        boolean j;
        int k;
        boolean m;

        /* renamed from: a  reason: collision with root package name */
        boolean f1895a = true;

        /* renamed from: h  reason: collision with root package name */
        int f1902h = 0;
        int i = 0;
        List<RecyclerView.d0> l = null;

        c() {
        }

        private View b() {
            int size = this.l.size();
            for (int i = 0; i < size; i++) {
                View view = this.l.get(i).f1924a;
                RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                if (!pVar.c() && this.f1898d == pVar.a()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public View a(RecyclerView.v vVar) {
            if (this.l != null) {
                return b();
            }
            View d2 = vVar.d(this.f1898d);
            this.f1898d += this.f1899e;
            return d2;
        }

        public void a() {
            a((View) null);
        }

        public void a(View view) {
            View b2 = b(view);
            this.f1898d = b2 == null ? -1 : ((RecyclerView.p) b2.getLayoutParams()).a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean a(RecyclerView.a0 a0Var) {
            int i = this.f1898d;
            return i >= 0 && i < a0Var.a();
        }

        public View b(View view) {
            int a2;
            int size = this.l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.l.get(i2).f1924a;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.c() && (a2 = (pVar.a() - this.f1898d) * this.f1899e) >= 0 && a2 < i) {
                    view2 = view3;
                    if (a2 == 0) {
                        break;
                    }
                    i = a2;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        int f1903b;

        /* renamed from: c  reason: collision with root package name */
        int f1904c;

        /* renamed from: d  reason: collision with root package name */
        boolean f1905d;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<d> {
            a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public d mo75createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public d[] mo76newArray(int i) {
                return new d[i];
            }
        }

        public d() {
        }

        d(Parcel parcel) {
            this.f1903b = parcel.readInt();
            this.f1904c = parcel.readInt();
            this.f1905d = parcel.readInt() != 1 ? false : true;
        }

        public d(d dVar) {
            this.f1903b = dVar.f1903b;
            this.f1904c = dVar.f1904c;
            this.f1905d = dVar.f1905d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        boolean j() {
            return this.f1903b >= 0;
        }

        void k() {
            this.f1903b = -1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1903b);
            parcel.writeInt(this.f1904c);
            parcel.writeInt(this.f1905d ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = RecyclerView.UNDEFINED_DURATION;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        k(i);
        a(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = RecyclerView.UNDEFINED_DURATION;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.o.d a2 = RecyclerView.o.a(context, attributeSet, i, i2);
        k(a2.f1955a);
        a(a2.f1957c);
        b(a2.f1958d);
    }

    private View M() {
        return e(0, e());
    }

    private View N() {
        return e(e() - 1, -1);
    }

    private View O() {
        return this.x ? M() : N();
    }

    private View P() {
        return this.x ? N() : M();
    }

    private View Q() {
        return d(this.x ? 0 : e() - 1);
    }

    private View R() {
        return d(this.x ? e() - 1 : 0);
    }

    private void S() {
        this.x = (this.s == 1 || !J()) ? this.w : !this.w;
    }

    private int a(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int b2;
        int b3 = this.u.b() - i;
        if (b3 > 0) {
            int i2 = -c(-b3, vVar, a0Var);
            int i3 = i + i2;
            if (!z || (b2 = this.u.b() - i3) <= 0) {
                return i2;
            }
            this.u.a(b2);
            return b2 + i2;
        }
        return 0;
    }

    private void a(int i, int i2, boolean z, RecyclerView.a0 a0Var) {
        int f2;
        this.t.m = L();
        this.t.f1900f = i;
        int[] iArr = this.H;
        boolean z2 = false;
        iArr[0] = 0;
        iArr[1] = 0;
        a(a0Var, iArr);
        int max = Math.max(0, this.H[0]);
        int max2 = Math.max(0, this.H[1]);
        if (i == 1) {
            z2 = true;
        }
        this.t.f1902h = z2 ? max2 : max;
        c cVar = this.t;
        if (!z2) {
            max = max2;
        }
        cVar.i = max;
        int i3 = -1;
        if (z2) {
            this.t.f1902h += this.u.c();
            View Q = Q();
            c cVar2 = this.t;
            if (!this.x) {
                i3 = 1;
            }
            cVar2.f1899e = i3;
            c cVar3 = this.t;
            int l = l(Q);
            c cVar4 = this.t;
            cVar3.f1898d = l + cVar4.f1899e;
            cVar4.f1896b = this.u.a(Q);
            f2 = this.u.a(Q) - this.u.b();
        } else {
            View R = R();
            this.t.f1902h += this.u.f();
            c cVar5 = this.t;
            if (this.x) {
                i3 = 1;
            }
            cVar5.f1899e = i3;
            c cVar6 = this.t;
            int l2 = l(R);
            c cVar7 = this.t;
            cVar6.f1898d = l2 + cVar7.f1899e;
            cVar7.f1896b = this.u.d(R);
            f2 = (-this.u.d(R)) + this.u.f();
        }
        c cVar8 = this.t;
        cVar8.f1897c = i2;
        if (z) {
            cVar8.f1897c -= f2;
        }
        this.t.f1901g = f2;
    }

    private void a(a aVar) {
        f(aVar.f1887b, aVar.f1888c);
    }

    private void a(RecyclerView.v vVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                a(i, vVar);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            a(i3, vVar);
        }
    }

    private void a(RecyclerView.v vVar, c cVar) {
        if (!cVar.f1895a || cVar.m) {
            return;
        }
        int i = cVar.f1901g;
        int i2 = cVar.i;
        if (cVar.f1900f == -1) {
            b(vVar, i, i2);
        } else {
            c(vVar, i, i2);
        }
    }

    private boolean a(RecyclerView.a0 a0Var, a aVar) {
        int i;
        boolean z = false;
        if (!a0Var.d() && (i = this.A) != -1) {
            if (i >= 0 && i < a0Var.a()) {
                aVar.f1887b = this.A;
                d dVar = this.D;
                if (dVar != null && dVar.j()) {
                    aVar.f1889d = this.D.f1905d;
                    aVar.f1888c = aVar.f1889d ? this.u.b() - this.D.f1904c : this.u.f() + this.D.f1904c;
                    return true;
                } else if (this.B != Integer.MIN_VALUE) {
                    boolean z2 = this.x;
                    aVar.f1889d = z2;
                    aVar.f1888c = z2 ? this.u.b() - this.B : this.u.f() + this.B;
                    return true;
                } else {
                    View c2 = c(this.A);
                    if (c2 == null) {
                        if (e() > 0) {
                            if ((this.A < l(d(0))) == this.x) {
                                z = true;
                            }
                            aVar.f1889d = z;
                        }
                        aVar.a();
                    } else if (this.u.b(c2) > this.u.g()) {
                        aVar.a();
                        return true;
                    } else if (this.u.d(c2) - this.u.f() < 0) {
                        aVar.f1888c = this.u.f();
                        aVar.f1889d = false;
                        return true;
                    } else if (this.u.b() - this.u.a(c2) < 0) {
                        aVar.f1888c = this.u.b();
                        aVar.f1889d = true;
                        return true;
                    } else {
                        aVar.f1888c = aVar.f1889d ? this.u.a(c2) + this.u.h() : this.u.d(c2);
                    }
                    return true;
                }
            }
            this.A = -1;
            this.B = RecyclerView.UNDEFINED_DURATION;
        }
        return false;
    }

    private boolean a(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar) {
        boolean z = false;
        if (e() == 0) {
            return false;
        }
        View g2 = g();
        if (g2 != null && aVar.a(g2, a0Var)) {
            aVar.b(g2, l(g2));
            return true;
        } else if (this.v != this.y) {
            return false;
        } else {
            View h2 = aVar.f1889d ? h(vVar, a0Var) : i(vVar, a0Var);
            if (h2 == null) {
                return false;
            }
            aVar.a(h2, l(h2));
            if (!a0Var.d() && D()) {
                if (this.u.d(h2) >= this.u.b() || this.u.a(h2) < this.u.f()) {
                    z = true;
                }
                if (z) {
                    aVar.f1888c = aVar.f1889d ? this.u.b() : this.u.f();
                }
            }
            return true;
        }
    }

    private int b(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int f2;
        int f3 = i - this.u.f();
        if (f3 > 0) {
            int i2 = -c(f3, vVar, a0Var);
            int i3 = i + i2;
            if (!z || (f2 = i3 - this.u.f()) <= 0) {
                return i2;
            }
            this.u.a(-f2);
            return i2 - f2;
        }
        return 0;
    }

    private void b(a aVar) {
        g(aVar.f1887b, aVar.f1888c);
    }

    private void b(RecyclerView.v vVar, int i, int i2) {
        int e2 = e();
        if (i < 0) {
            return;
        }
        int a2 = (this.u.a() - i) + i2;
        if (this.x) {
            for (int i3 = 0; i3 < e2; i3++) {
                View d2 = d(i3);
                if (this.u.d(d2) < a2 || this.u.f(d2) < a2) {
                    a(vVar, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = e2 - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View d3 = d(i5);
            if (this.u.d(d3) < a2 || this.u.f(d3) < a2) {
                a(vVar, i4, i5);
                return;
            }
        }
    }

    private void b(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i, int i2) {
        if (!a0Var.e() || e() == 0 || a0Var.d() || !D()) {
            return;
        }
        List<RecyclerView.d0> f2 = vVar.f();
        int size = f2.size();
        int l = l(d(0));
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView.d0 d0Var = f2.get(i5);
            if (!d0Var.q()) {
                char c2 = 1;
                if ((d0Var.i() < l) != this.x) {
                    c2 = 65535;
                }
                int b2 = this.u.b(d0Var.f1924a);
                if (c2 == 65535) {
                    i3 += b2;
                } else {
                    i4 += b2;
                }
            }
        }
        this.t.l = f2;
        if (i3 > 0) {
            g(l(R()), i);
            c cVar = this.t;
            cVar.f1902h = i3;
            cVar.f1897c = 0;
            cVar.a();
            a(vVar, this.t, a0Var, false);
        }
        if (i4 > 0) {
            f(l(Q()), i2);
            c cVar2 = this.t;
            cVar2.f1902h = i4;
            cVar2.f1897c = 0;
            cVar2.a();
            a(vVar, this.t, a0Var, false);
        }
        this.t.l = null;
    }

    private void b(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar) {
        if (!a(a0Var, aVar) && !a(vVar, a0Var, aVar)) {
            aVar.a();
            aVar.f1887b = this.y ? a0Var.a() - 1 : 0;
        }
    }

    private void c(RecyclerView.v vVar, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int e2 = e();
        if (!this.x) {
            for (int i4 = 0; i4 < e2; i4++) {
                View d2 = d(i4);
                if (this.u.a(d2) > i3 || this.u.e(d2) > i3) {
                    a(vVar, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = e2 - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View d3 = d(i6);
            if (this.u.a(d3) > i3 || this.u.e(d3) > i3) {
                a(vVar, i5, i6);
                return;
            }
        }
    }

    private View f(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return a(vVar, a0Var, 0, e(), a0Var.a());
    }

    private void f(int i, int i2) {
        this.t.f1897c = this.u.b() - i2;
        this.t.f1899e = this.x ? -1 : 1;
        c cVar = this.t;
        cVar.f1898d = i;
        cVar.f1900f = 1;
        cVar.f1896b = i2;
        cVar.f1901g = RecyclerView.UNDEFINED_DURATION;
    }

    private View g(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return a(vVar, a0Var, e() - 1, -1, a0Var.a());
    }

    private void g(int i, int i2) {
        this.t.f1897c = i2 - this.u.f();
        c cVar = this.t;
        cVar.f1898d = i;
        cVar.f1899e = this.x ? 1 : -1;
        c cVar2 = this.t;
        cVar2.f1900f = -1;
        cVar2.f1896b = i2;
        cVar2.f1901g = RecyclerView.UNDEFINED_DURATION;
    }

    private View h(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return this.x ? f(vVar, a0Var) : g(vVar, a0Var);
    }

    private int i(RecyclerView.a0 a0Var) {
        if (e() == 0) {
            return 0;
        }
        F();
        return m.a(a0Var, this.u, b(!this.z, true), a(!this.z, true), this, this.z);
    }

    private View i(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return this.x ? g(vVar, a0Var) : f(vVar, a0Var);
    }

    private int j(RecyclerView.a0 a0Var) {
        if (e() == 0) {
            return 0;
        }
        F();
        return m.a(a0Var, this.u, b(!this.z, true), a(!this.z, true), this, this.z, this.x);
    }

    private int k(RecyclerView.a0 a0Var) {
        if (e() == 0) {
            return 0;
        }
        F();
        return m.b(a0Var, this.u, b(!this.z, true), a(!this.z, true), this, this.z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    boolean B() {
        return (i() == 1073741824 || s() == 1073741824 || !t()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean D() {
        return this.D == null && this.v == this.y;
    }

    c E() {
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F() {
        if (this.t == null) {
            this.t = E();
        }
    }

    public int G() {
        View a2 = a(0, e(), false, true);
        if (a2 == null) {
            return -1;
        }
        return l(a2);
    }

    public int H() {
        View a2 = a(e() - 1, -1, false, true);
        if (a2 == null) {
            return -1;
        }
        return l(a2);
    }

    public int I() {
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean J() {
        return k() == 1;
    }

    public boolean K() {
        return this.z;
    }

    boolean L() {
        return this.u.d() == 0 && this.u.a() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int a(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.s == 1) {
            return 0;
        }
        return c(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int a(RecyclerView.a0 a0Var) {
        return i(a0Var);
    }

    int a(RecyclerView.v vVar, c cVar, RecyclerView.a0 a0Var, boolean z) {
        int i = cVar.f1897c;
        int i2 = cVar.f1901g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f1901g = i2 + i;
            }
            a(vVar, cVar);
        }
        int i3 = cVar.f1897c + cVar.f1902h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.m && i3 <= 0) || !cVar.a(a0Var)) {
                break;
            }
            bVar.a();
            a(vVar, a0Var, cVar, bVar);
            if (!bVar.f1892b) {
                cVar.f1896b += bVar.f1891a * cVar.f1900f;
                if (!bVar.f1893c || cVar.l != null || !a0Var.d()) {
                    int i4 = cVar.f1897c;
                    int i5 = bVar.f1891a;
                    cVar.f1897c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.f1901g;
                if (i6 != Integer.MIN_VALUE) {
                    cVar.f1901g = i6 + bVar.f1891a;
                    int i7 = cVar.f1897c;
                    if (i7 < 0) {
                        cVar.f1901g += i7;
                    }
                    a(vVar, cVar);
                }
                if (z && bVar.f1894d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f1897c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF a(int i) {
        if (e() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < l(d(0))) {
            z = true;
        }
        if (z != this.x) {
            i2 = -1;
        }
        return this.s == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    View a(int i, int i2, boolean z, boolean z2) {
        F();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        return (this.s == 0 ? this.f1949e : this.f1950f).a(i, i2, i4, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View a(View view, int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int j;
        S();
        if (e() == 0 || (j = j(i)) == Integer.MIN_VALUE) {
            return null;
        }
        F();
        a(j, (int) (this.u.g() * 0.33333334f), false, a0Var);
        c cVar = this.t;
        cVar.f1901g = RecyclerView.UNDEFINED_DURATION;
        cVar.f1895a = false;
        a(vVar, cVar, a0Var, true);
        View P = j == -1 ? P() : O();
        View R = j == -1 ? R() : Q();
        if (!R.hasFocusable()) {
            return P;
        }
        if (P != null) {
            return R;
        }
        return null;
    }

    View a(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i, int i2, int i3) {
        F();
        int f2 = this.u.f();
        int b2 = this.u.b();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View d2 = d(i);
            int l = l(d2);
            if (l >= 0 && l < i3) {
                if (((RecyclerView.p) d2.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = d2;
                    }
                } else if (this.u.d(d2) < b2 && this.u.a(d2) >= f2) {
                    return d2;
                } else {
                    if (view == null) {
                        view = d2;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View a(boolean z, boolean z2) {
        int e2;
        int i;
        if (this.x) {
            e2 = 0;
            i = e();
        } else {
            e2 = e() - 1;
            i = -1;
        }
        return a(e2, i, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(int i, int i2, RecyclerView.a0 a0Var, RecyclerView.o.c cVar) {
        if (this.s != 0) {
            i = i2;
        }
        if (e() == 0 || i == 0) {
            return;
        }
        F();
        a(i > 0 ? 1 : -1, Math.abs(i), true, a0Var);
        a(a0Var, this.t, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(int i, RecyclerView.o.c cVar) {
        boolean z;
        int i2;
        d dVar = this.D;
        int i3 = -1;
        if (dVar == null || !dVar.j()) {
            S();
            z = this.x;
            i2 = this.A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            d dVar2 = this.D;
            z = dVar2.f1905d;
            i2 = dVar2.f1903b;
        }
        if (!z) {
            i3 = 1;
        }
        int i4 = i2;
        for (int i5 = 0; i5 < this.G && i4 >= 0 && i4 < i; i5++) {
            cVar.a(i4, 0);
            i4 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.D = (d) parcelable;
            z();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(AccessibilityEvent accessibilityEvent) {
        super.a(accessibilityEvent);
        if (e() > 0) {
            accessibilityEvent.setFromIndex(G());
            accessibilityEvent.setToIndex(H());
        }
    }

    void a(RecyclerView.a0 a0Var, c cVar, RecyclerView.o.c cVar2) {
        int i = cVar.f1898d;
        if (i < 0 || i >= a0Var.a()) {
            return;
        }
        cVar2.a(i, Math.max(0, cVar.f1901g));
    }

    protected void a(RecyclerView.a0 a0Var, int[] iArr) {
        int i;
        int h2 = h(a0Var);
        if (this.t.f1900f == -1) {
            i = 0;
        } else {
            i = h2;
            h2 = 0;
        }
        iArr[0] = h2;
        iArr[1] = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar, int i) {
    }

    void a(RecyclerView.v vVar, RecyclerView.a0 a0Var, c cVar, b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int c2;
        View a2 = cVar.a(vVar);
        if (a2 == null) {
            bVar.f1892b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) a2.getLayoutParams();
        if (cVar.l == null) {
            if (this.x == (cVar.f1900f == -1)) {
                b(a2);
            } else {
                b(a2, 0);
            }
        } else {
            if (this.x == (cVar.f1900f == -1)) {
                a(a2);
            } else {
                a(a2, 0);
            }
        }
        a(a2, 0, 0);
        bVar.f1891a = this.u.b(a2);
        if (this.s == 1) {
            if (J()) {
                c2 = r() - p();
                i4 = c2 - this.u.c(a2);
            } else {
                i4 = o();
                c2 = this.u.c(a2) + i4;
            }
            int i5 = cVar.f1900f;
            int i6 = cVar.f1896b;
            if (i5 == -1) {
                i3 = i6;
                i2 = c2;
                i = i6 - bVar.f1891a;
            } else {
                i = i6;
                i2 = c2;
                i3 = bVar.f1891a + i6;
            }
        } else {
            int q = q();
            int c3 = this.u.c(a2) + q;
            int i7 = cVar.f1900f;
            int i8 = cVar.f1896b;
            if (i7 == -1) {
                i2 = i8;
                i = q;
                i3 = c3;
                i4 = i8 - bVar.f1891a;
            } else {
                i = q;
                i2 = bVar.f1891a + i8;
                i3 = c3;
                i4 = i8;
            }
        }
        a(a2, i4, i, i2, i3);
        if (pVar.c() || pVar.b()) {
            bVar.f1893c = true;
        }
        bVar.f1894d = a2.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        h hVar = new h(recyclerView.getContext());
        hVar.c(i);
        b(hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(String str) {
        if (this.D == null) {
            super.a(str);
        }
    }

    public void a(boolean z) {
        a((String) null);
        if (z == this.w) {
            return;
        }
        this.w = z;
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean a() {
        return this.s == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int b(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.s == 0) {
            return 0;
        }
        return c(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int b(RecyclerView.a0 a0Var) {
        return j(a0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View b(boolean z, boolean z2) {
        int i;
        int e2;
        if (this.x) {
            i = e() - 1;
            e2 = -1;
        } else {
            i = 0;
            e2 = e();
        }
        return a(i, e2, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void b(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.b(recyclerView, vVar);
        if (this.C) {
            b(vVar);
            vVar.a();
        }
    }

    public void b(boolean z) {
        a((String) null);
        if (this.y == z) {
            return;
        }
        this.y = z;
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean b() {
        return this.s == 1;
    }

    int c(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (e() == 0 || i == 0) {
            return 0;
        }
        F();
        this.t.f1895a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        a(i2, abs, true, a0Var);
        c cVar = this.t;
        int a2 = cVar.f1901g + a(vVar, cVar, a0Var, false);
        if (a2 < 0) {
            return 0;
        }
        if (abs > a2) {
            i = i2 * a2;
        }
        this.u.a(-i);
        this.t.k = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int c(RecyclerView.a0 a0Var) {
        return k(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View c(int i) {
        int e2 = e();
        if (e2 == 0) {
            return null;
        }
        int l = i - l(d(0));
        if (l >= 0 && l < e2) {
            View d2 = d(l);
            if (l(d2) == i) {
                return d2;
            }
        }
        return super.c(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p c() {
        return new RecyclerView.p(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int d(RecyclerView.a0 a0Var) {
        return i(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int e(RecyclerView.a0 a0Var) {
        return j(a0Var);
    }

    View e(int i, int i2) {
        int i3;
        int i4;
        F();
        if ((i2 > i ? (char) 1 : i2 < i ? (char) 65535 : (char) 0) == 0) {
            return d(i);
        }
        if (this.u.d(d(i)) < this.u.f()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return (this.s == 0 ? this.f1949e : this.f1950f).a(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void e(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int a2;
        int i5;
        View c2;
        int d2;
        int i6;
        int i7 = -1;
        if (!(this.D == null && this.A == -1) && a0Var.a() == 0) {
            b(vVar);
            return;
        }
        d dVar = this.D;
        if (dVar != null && dVar.j()) {
            this.A = this.D.f1903b;
        }
        F();
        this.t.f1895a = false;
        S();
        View g2 = g();
        if (!this.E.f1890e || this.A != -1 || this.D != null) {
            this.E.b();
            a aVar = this.E;
            aVar.f1889d = this.x ^ this.y;
            b(vVar, a0Var, aVar);
            this.E.f1890e = true;
        } else if (g2 != null && (this.u.d(g2) >= this.u.b() || this.u.a(g2) <= this.u.f())) {
            this.E.b(g2, l(g2));
        }
        c cVar = this.t;
        cVar.f1900f = cVar.k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        a(a0Var, iArr);
        int max = Math.max(0, this.H[0]) + this.u.f();
        int max2 = Math.max(0, this.H[1]) + this.u.c();
        if (a0Var.d() && (i5 = this.A) != -1 && this.B != Integer.MIN_VALUE && (c2 = c(i5)) != null) {
            if (this.x) {
                i6 = this.u.b() - this.u.a(c2);
                d2 = this.B;
            } else {
                d2 = this.u.d(c2) - this.u.f();
                i6 = this.B;
            }
            int i8 = i6 - d2;
            if (i8 > 0) {
                max += i8;
            } else {
                max2 -= i8;
            }
        }
        if (!this.E.f1889d ? !this.x : this.x) {
            i7 = 1;
        }
        a(vVar, a0Var, this.E, i7);
        a(vVar);
        this.t.m = L();
        this.t.j = a0Var.d();
        this.t.i = 0;
        a aVar2 = this.E;
        if (aVar2.f1889d) {
            b(aVar2);
            c cVar2 = this.t;
            cVar2.f1902h = max;
            a(vVar, cVar2, a0Var, false);
            c cVar3 = this.t;
            i2 = cVar3.f1896b;
            int i9 = cVar3.f1898d;
            int i10 = cVar3.f1897c;
            if (i10 > 0) {
                max2 += i10;
            }
            a(this.E);
            c cVar4 = this.t;
            cVar4.f1902h = max2;
            cVar4.f1898d += cVar4.f1899e;
            a(vVar, cVar4, a0Var, false);
            c cVar5 = this.t;
            i = cVar5.f1896b;
            int i11 = cVar5.f1897c;
            if (i11 > 0) {
                g(i9, i2);
                c cVar6 = this.t;
                cVar6.f1902h = i11;
                a(vVar, cVar6, a0Var, false);
                i2 = this.t.f1896b;
            }
        } else {
            a(aVar2);
            c cVar7 = this.t;
            cVar7.f1902h = max2;
            a(vVar, cVar7, a0Var, false);
            c cVar8 = this.t;
            i = cVar8.f1896b;
            int i12 = cVar8.f1898d;
            int i13 = cVar8.f1897c;
            if (i13 > 0) {
                max += i13;
            }
            b(this.E);
            c cVar9 = this.t;
            cVar9.f1902h = max;
            cVar9.f1898d += cVar9.f1899e;
            a(vVar, cVar9, a0Var, false);
            c cVar10 = this.t;
            i2 = cVar10.f1896b;
            int i14 = cVar10.f1897c;
            if (i14 > 0) {
                f(i12, i);
                c cVar11 = this.t;
                cVar11.f1902h = i14;
                a(vVar, cVar11, a0Var, false);
                i = this.t.f1896b;
            }
        }
        if (e() > 0) {
            if (this.x ^ this.y) {
                int a3 = a(i, vVar, a0Var, true);
                i3 = i2 + a3;
                i4 = i + a3;
                a2 = b(i3, vVar, a0Var, false);
            } else {
                int b2 = b(i2, vVar, a0Var, true);
                i3 = i2 + b2;
                i4 = i + b2;
                a2 = a(i4, vVar, a0Var, false);
            }
            i2 = i3 + a2;
            i = i4 + a2;
        }
        b(vVar, a0Var, i2, i);
        if (!a0Var.d()) {
            this.u.i();
        } else {
            this.E.b();
        }
        this.v = this.y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int f(RecyclerView.a0 a0Var) {
        return k(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(RecyclerView.a0 a0Var) {
        super.g(a0Var);
        this.D = null;
        this.A = -1;
        this.B = RecyclerView.UNDEFINED_DURATION;
        this.E.b();
    }

    @Deprecated
    protected int h(RecyclerView.a0 a0Var) {
        if (a0Var.c()) {
            return this.u.g();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(int i) {
        this.A = i;
        this.B = RecyclerView.UNDEFINED_DURATION;
        d dVar = this.D;
        if (dVar != null) {
            dVar.k();
        }
        z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j(int i) {
        if (i == 1) {
            return (this.s != 1 && J()) ? 1 : -1;
        } else if (i == 2) {
            return (this.s != 1 && J()) ? -1 : 1;
        } else if (i == 17) {
            if (this.s != 0) {
                return RecyclerView.UNDEFINED_DURATION;
            }
            return -1;
        } else if (i == 33) {
            if (this.s != 1) {
                return RecyclerView.UNDEFINED_DURATION;
            }
            return -1;
        } else if (i == 66) {
            if (this.s != 0) {
                return RecyclerView.UNDEFINED_DURATION;
            }
            return 1;
        } else if (i != 130 || this.s != 1) {
            return RecyclerView.UNDEFINED_DURATION;
        } else {
            return 1;
        }
    }

    public void k(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        a((String) null);
        if (i == this.s && this.u != null) {
            return;
        }
        this.u = k.a(this, i);
        this.E.f1886a = this.u;
        this.s = i;
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean v() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable y() {
        d dVar = this.D;
        if (dVar != null) {
            return new d(dVar);
        }
        d dVar2 = new d();
        if (e() > 0) {
            F();
            boolean z = this.v ^ this.x;
            dVar2.f1905d = z;
            if (z) {
                View Q = Q();
                dVar2.f1904c = this.u.b() - this.u.a(Q);
                dVar2.f1903b = l(Q);
            } else {
                View R = R();
                dVar2.f1903b = l(R);
                dVar2.f1904c = this.u.d(R) - this.u.f();
            }
        } else {
            dVar2.k();
        }
        return dVar2;
    }
}

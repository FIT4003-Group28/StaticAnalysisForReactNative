package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private final k f1741a;

    /* renamed from: b  reason: collision with root package name */
    private final Fragment f1742b;

    /* renamed from: c  reason: collision with root package name */
    private int f1743c = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1744a = new int[f.b.values().length];

        static {
            try {
                f1744a[f.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1744a[f.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1744a[f.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(k kVar, Fragment fragment) {
        this.f1741a = kVar;
        this.f1742b = fragment;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(k kVar, Fragment fragment, p pVar) {
        this.f1741a = kVar;
        this.f1742b = fragment;
        Fragment fragment2 = this.f1742b;
        fragment2.f1640d = null;
        fragment2.r = 0;
        fragment2.o = false;
        fragment2.l = false;
        Fragment fragment3 = fragment2.f1644h;
        fragment2.i = fragment3 != null ? fragment3.f1642f : null;
        Fragment fragment4 = this.f1742b;
        fragment4.f1644h = null;
        Bundle bundle = pVar.n;
        fragment4.f1639c = bundle == null ? new Bundle() : bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(k kVar, ClassLoader classLoader, h hVar, p pVar) {
        this.f1741a = kVar;
        this.f1742b = hVar.a(classLoader, pVar.f1734b);
        Bundle bundle = pVar.k;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        this.f1742b.m(pVar.k);
        Fragment fragment = this.f1742b;
        fragment.f1642f = pVar.f1735c;
        fragment.n = pVar.f1736d;
        fragment.p = true;
        fragment.w = pVar.f1737e;
        fragment.x = pVar.f1738f;
        fragment.y = pVar.f1739g;
        fragment.B = pVar.f1740h;
        fragment.m = pVar.i;
        fragment.A = pVar.j;
        fragment.z = pVar.l;
        fragment.Q = f.b.values()[pVar.m];
        Bundle bundle2 = pVar.n;
        if (bundle2 != null) {
            this.f1742b.f1639c = bundle2;
        } else {
            this.f1742b.f1639c = new Bundle();
        }
        if (l.d(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + this.f1742b);
        }
    }

    private Bundle m() {
        Bundle bundle = new Bundle();
        this.f1742b.j(bundle);
        this.f1741a.d(this.f1742b, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f1742b.H != null) {
            j();
        }
        if (this.f1742b.f1640d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f1742b.f1640d);
        }
        if (!this.f1742b.J) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f1742b.J);
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (l.d(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f1742b);
        }
        Fragment fragment = this.f1742b;
        fragment.g(fragment.f1639c);
        k kVar = this.f1741a;
        Fragment fragment2 = this.f1742b;
        kVar.a(fragment2, fragment2.f1639c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        this.f1743c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(e eVar) {
        String str;
        if (this.f1742b.n) {
            return;
        }
        if (l.d(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f1742b);
        }
        ViewGroup viewGroup = null;
        Fragment fragment = this.f1742b;
        ViewGroup viewGroup2 = fragment.G;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment.x;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f1742b + " for a container view with no id");
                }
                viewGroup = (ViewGroup) eVar.a(i);
                if (viewGroup == null) {
                    Fragment fragment2 = this.f1742b;
                    if (!fragment2.p) {
                        try {
                            str = fragment2.y().getResourceName(this.f1742b.x);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f1742b.x) + " (" + str + ") for fragment " + this.f1742b);
                    }
                }
            }
        }
        Fragment fragment3 = this.f1742b;
        fragment3.G = viewGroup;
        fragment3.b(fragment3.i(fragment3.f1639c), viewGroup, this.f1742b.f1639c);
        View view = this.f1742b.H;
        if (view == null) {
            return;
        }
        boolean z = false;
        view.setSaveFromParentEnabled(false);
        Fragment fragment4 = this.f1742b;
        fragment4.H.setTag(a.k.b.fragment_container_view_tag, fragment4);
        if (viewGroup != null) {
            viewGroup.addView(this.f1742b.H);
        }
        Fragment fragment5 = this.f1742b;
        if (fragment5.z) {
            fragment5.H.setVisibility(8);
        }
        a.g.m.v.N(this.f1742b.H);
        Fragment fragment6 = this.f1742b;
        fragment6.a(fragment6.H, fragment6.f1639c);
        k kVar = this.f1741a;
        Fragment fragment7 = this.f1742b;
        kVar.a(fragment7, fragment7.H, fragment7.f1639c, false);
        Fragment fragment8 = this.f1742b;
        if (fragment8.H.getVisibility() == 0 && this.f1742b.G != null) {
            z = true;
        }
        fragment8.L = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(i<?> iVar, l lVar, Fragment fragment) {
        Fragment fragment2 = this.f1742b;
        fragment2.t = iVar;
        fragment2.v = fragment;
        fragment2.s = lVar;
        this.f1741a.b(fragment2, iVar.f(), false);
        this.f1742b.Y();
        Fragment fragment3 = this.f1742b;
        Fragment fragment4 = fragment3.v;
        if (fragment4 == null) {
            iVar.a(fragment3);
        } else {
            fragment4.a(fragment3);
        }
        this.f1741a.a(this.f1742b, iVar.f(), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(i<?> iVar, o oVar) {
        if (l.d(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f1742b);
        }
        Fragment fragment = this.f1742b;
        boolean z = true;
        boolean z2 = fragment.m && !fragment.J();
        if (!(z2 || oVar.f(this.f1742b))) {
            this.f1742b.f1638b = 0;
            return;
        }
        if (iVar instanceof androidx.lifecycle.v) {
            z = oVar.d();
        } else if (iVar.f() instanceof Activity) {
            z = true ^ ((Activity) iVar.f()).isChangingConfigurations();
        }
        if (z2 || z) {
            oVar.b(this.f1742b);
        }
        this.f1742b.Z();
        this.f1741a.a(this.f1742b, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(o oVar) {
        if (l.d(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f1742b);
        }
        this.f1742b.b0();
        boolean z = false;
        this.f1741a.b(this.f1742b, false);
        Fragment fragment = this.f1742b;
        fragment.f1638b = -1;
        fragment.t = null;
        fragment.v = null;
        fragment.s = null;
        if (fragment.m && !fragment.J()) {
            z = true;
        }
        if (z || oVar.f(this.f1742b)) {
            if (l.d(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f1742b);
            }
            this.f1742b.G();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ClassLoader classLoader) {
        Bundle bundle = this.f1742b.f1639c;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f1742b;
        fragment.f1640d = fragment.f1639c.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f1742b;
        fragment2.i = fragment2.f1639c.getString("android:target_state");
        Fragment fragment3 = this.f1742b;
        if (fragment3.i != null) {
            fragment3.j = fragment3.f1639c.getInt("android:target_req_state", 0);
        }
        Fragment fragment4 = this.f1742b;
        Boolean bool = fragment4.f1641e;
        if (bool != null) {
            fragment4.J = bool.booleanValue();
            this.f1742b.f1641e = null;
        } else {
            fragment4.J = fragment4.f1639c.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment5 = this.f1742b;
        if (fragment5.J) {
            return;
        }
        fragment5.I = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        int i = this.f1743c;
        Fragment fragment = this.f1742b;
        if (fragment.n) {
            i = fragment.o ? Math.max(i, 1) : i < 2 ? Math.min(i, fragment.f1638b) : Math.min(i, 1);
        }
        if (!this.f1742b.l) {
            i = Math.min(i, 1);
        }
        Fragment fragment2 = this.f1742b;
        if (fragment2.m) {
            i = fragment2.J() ? Math.min(i, 1) : Math.min(i, -1);
        }
        Fragment fragment3 = this.f1742b;
        if (fragment3.I && fragment3.f1638b < 3) {
            i = Math.min(i, 2);
        }
        int i2 = a.f1744a[this.f1742b.Q.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? Math.min(i, -1) : Math.min(i, 1) : Math.min(i, 3) : i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (l.d(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f1742b);
        }
        Fragment fragment = this.f1742b;
        if (fragment.P) {
            fragment.k(fragment.f1639c);
            this.f1742b.f1638b = 1;
            return;
        }
        this.f1741a.c(fragment, fragment.f1639c, false);
        Fragment fragment2 = this.f1742b;
        fragment2.h(fragment2.f1639c);
        k kVar = this.f1741a;
        Fragment fragment3 = this.f1742b;
        kVar.b(fragment3, fragment3.f1639c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        Fragment fragment = this.f1742b;
        if (!fragment.n || !fragment.o || fragment.q) {
            return;
        }
        if (l.d(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f1742b);
        }
        Fragment fragment2 = this.f1742b;
        fragment2.b(fragment2.i(fragment2.f1639c), (ViewGroup) null, this.f1742b.f1639c);
        View view = this.f1742b.H;
        if (view == null) {
            return;
        }
        view.setSaveFromParentEnabled(false);
        Fragment fragment3 = this.f1742b;
        fragment3.H.setTag(a.k.b.fragment_container_view_tag, fragment3);
        Fragment fragment4 = this.f1742b;
        if (fragment4.z) {
            fragment4.H.setVisibility(8);
        }
        Fragment fragment5 = this.f1742b;
        fragment5.a(fragment5.H, fragment5.f1639c);
        k kVar = this.f1741a;
        Fragment fragment6 = this.f1742b;
        kVar.a(fragment6, fragment6.H, fragment6.f1639c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment e() {
        return this.f1742b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        if (l.d(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f1742b);
        }
        this.f1742b.d0();
        this.f1741a.c(this.f1742b, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        if (l.d(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this.f1742b);
        }
        Fragment fragment = this.f1742b;
        if (fragment.H != null) {
            fragment.l(fragment.f1639c);
        }
        this.f1742b.f1639c = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        if (l.d(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f1742b);
        }
        this.f1742b.f0();
        this.f1741a.d(this.f1742b, false);
        Fragment fragment = this.f1742b;
        fragment.f1639c = null;
        fragment.f1640d = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p i() {
        p pVar = new p(this.f1742b);
        if (this.f1742b.f1638b <= -1 || pVar.n != null) {
            pVar.n = this.f1742b.f1639c;
        } else {
            pVar.n = m();
            if (this.f1742b.i != null) {
                if (pVar.n == null) {
                    pVar.n = new Bundle();
                }
                pVar.n.putString("android:target_state", this.f1742b.i);
                int i = this.f1742b.j;
                if (i != 0) {
                    pVar.n.putInt("android:target_req_state", i);
                }
            }
        }
        return pVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        if (this.f1742b.H == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f1742b.H.saveHierarchyState(sparseArray);
        if (sparseArray.size() <= 0) {
            return;
        }
        this.f1742b.f1640d = sparseArray;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        if (l.d(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f1742b);
        }
        this.f1742b.g0();
        this.f1741a.e(this.f1742b, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        if (l.d(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f1742b);
        }
        this.f1742b.h0();
        this.f1741a.f(this.f1742b, false);
    }
}

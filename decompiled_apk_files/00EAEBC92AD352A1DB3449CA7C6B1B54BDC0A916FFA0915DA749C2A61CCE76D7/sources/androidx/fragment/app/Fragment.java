package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.f;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.i, androidx.lifecycle.v, androidx.lifecycle.e, androidx.savedstate.b {
    static final Object W = new Object();
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    private boolean F;
    ViewGroup G;
    View H;
    boolean I;
    d K;
    boolean L;
    boolean M;
    float N;
    LayoutInflater O;
    boolean P;
    f.b Q;
    androidx.lifecycle.j R;
    w S;
    androidx.lifecycle.n<androidx.lifecycle.i> T;
    androidx.savedstate.a U;
    private int V;

    /* renamed from: c  reason: collision with root package name */
    Bundle f1639c;

    /* renamed from: d  reason: collision with root package name */
    SparseArray<Parcelable> f1640d;

    /* renamed from: e  reason: collision with root package name */
    Boolean f1641e;

    /* renamed from: g  reason: collision with root package name */
    Bundle f1643g;

    /* renamed from: h  reason: collision with root package name */
    Fragment f1644h;
    int j;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    int r;
    l s;
    i<?> t;
    Fragment v;
    int w;
    int x;
    String y;
    boolean z;

    /* renamed from: b  reason: collision with root package name */
    int f1638b = -1;

    /* renamed from: f  reason: collision with root package name */
    String f1642f = UUID.randomUUID().toString();
    String i = null;
    private Boolean k = null;
    l u = new m();
    boolean E = true;
    boolean J = true;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.l0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.f();
        }
    }

    /* loaded from: classes.dex */
    class c extends androidx.fragment.app.e {
        c() {
        }

        @Override // androidx.fragment.app.e
        public View a(int i) {
            View view = Fragment.this.H;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }

        @Override // androidx.fragment.app.e
        public boolean c() {
            return Fragment.this.H != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        View f1649a;

        /* renamed from: b  reason: collision with root package name */
        Animator f1650b;

        /* renamed from: c  reason: collision with root package name */
        int f1651c;

        /* renamed from: d  reason: collision with root package name */
        int f1652d;

        /* renamed from: e  reason: collision with root package name */
        int f1653e;

        /* renamed from: f  reason: collision with root package name */
        Object f1654f = null;

        /* renamed from: g  reason: collision with root package name */
        Object f1655g;

        /* renamed from: h  reason: collision with root package name */
        Object f1656h;
        Object i;
        Object j;
        Object k;
        Boolean l;
        Boolean m;
        androidx.core.app.m n;
        androidx.core.app.m o;
        boolean p;
        f q;
        boolean r;

        d() {
            Object obj = Fragment.W;
            this.f1655g = obj;
            this.f1656h = null;
            this.i = obj;
            this.j = null;
            this.k = obj;
            this.n = null;
            this.o = null;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends RuntimeException {
        public e(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface f {
        void a();

        void b();
    }

    public Fragment() {
        new a();
        this.Q = f.b.RESUMED;
        this.T = new androidx.lifecycle.n<>();
        n0();
    }

    @Deprecated
    public static Fragment a(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = h.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.m(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e2) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new e("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new e("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    private d m0() {
        if (this.K == null) {
            this.K = new d();
        }
        return this.K;
    }

    private void n0() {
        this.R = new androidx.lifecycle.j(this);
        this.U = androidx.savedstate.a.a(this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.R.a(new androidx.lifecycle.g() { // from class: androidx.fragment.app.Fragment.2
                @Override // androidx.lifecycle.g
                public void a(androidx.lifecycle.i iVar, f.a aVar) {
                    View view;
                    if (aVar != f.a.ON_STOP || (view = Fragment.this.H) == null) {
                        return;
                    }
                    view.cancelPendingInputEvents();
                }
            });
        }
    }

    public Object A() {
        d dVar = this.K;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f1655g;
        return obj == W ? o() : obj;
    }

    public Object B() {
        d dVar = this.K;
        if (dVar == null) {
            return null;
        }
        return dVar.j;
    }

    public Object C() {
        d dVar = this.K;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.k;
        return obj == W ? B() : obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int D() {
        d dVar = this.K;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1651c;
    }

    public final Fragment E() {
        String str;
        Fragment fragment = this.f1644h;
        if (fragment != null) {
            return fragment;
        }
        l lVar = this.s;
        if (lVar != null && (str = this.i) != null) {
            return lVar.a(str);
        }
        return null;
    }

    public View F() {
        return this.H;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G() {
        n0();
        this.f1642f = UUID.randomUUID().toString();
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.r = 0;
        this.s = null;
        this.u = new m();
        this.t = null;
        this.w = 0;
        this.x = 0;
        this.y = null;
        this.z = false;
        this.A = false;
    }

    public final boolean H() {
        return this.t != null && this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean I() {
        d dVar = this.K;
        if (dVar == null) {
            return false;
        }
        return dVar.r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean J() {
        return this.r > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean K() {
        d dVar = this.K;
        if (dVar == null) {
            return false;
        }
        return dVar.p;
    }

    public final boolean L() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean M() {
        Fragment v = v();
        return v != null && (v.L() || v.M());
    }

    public final boolean N() {
        return this.f1638b >= 4;
    }

    public final boolean O() {
        l lVar = this.s;
        if (lVar == null) {
            return false;
        }
        return lVar.x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P() {
        this.u.y();
    }

    public void Q() {
        this.F = true;
    }

    public void R() {
    }

    public void S() {
        this.F = true;
    }

    public void T() {
        this.F = true;
    }

    public void U() {
        this.F = true;
    }

    public void V() {
        this.F = true;
    }

    public void W() {
        this.F = true;
    }

    public void X() {
        this.F = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y() {
        this.u.a(this.t, new c(), this);
        this.f1638b = 0;
        this.F = false;
        a(this.t.f());
        if (this.F) {
            return;
        }
        throw new x("Fragment " + this + " did not call through to super.onAttach()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z() {
        this.u.f();
        this.R.a(f.a.ON_DESTROY);
        this.f1638b = 0;
        this.F = false;
        this.P = false;
        Q();
        if (this.F) {
            return;
        }
        throw new x("Fragment " + this + " did not call through to super.onDestroy()");
    }

    @Deprecated
    public LayoutInflater a(Bundle bundle) {
        i<?> iVar = this.t;
        if (iVar != null) {
            LayoutInflater i = iVar.i();
            a.g.m.f.b(i, this.u.r());
            return i;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.V;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public Animation a(int i, boolean z, int i2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment a(String str) {
        return str.equals(this.f1642f) ? this : this.u.c(str);
    }

    @Override // androidx.lifecycle.i
    public androidx.lifecycle.f a() {
        return this.R;
    }

    public final String a(int i) {
        return y().getString(i);
    }

    public void a(int i, int i2, Intent intent) {
    }

    public void a(int i, String[] strArr, int[] iArr) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Animator animator) {
        m0().f1650b = animator;
    }

    @Deprecated
    public void a(Activity activity) {
        this.F = true;
    }

    @Deprecated
    public void a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.F = true;
    }

    public void a(Context context) {
        this.F = true;
        i<?> iVar = this.t;
        Activity e2 = iVar == null ? null : iVar.e();
        if (e2 != null) {
            this.F = false;
            a(e2);
        }
    }

    public void a(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.F = true;
        i<?> iVar = this.t;
        Activity e2 = iVar == null ? null : iVar.e();
        if (e2 != null) {
            this.F = false;
            a(e2, attributeSet, bundle);
        }
    }

    public void a(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        i<?> iVar = this.t;
        if (iVar != null) {
            iVar.a(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.u.a(configuration);
    }

    public void a(Menu menu) {
    }

    public void a(Menu menu, MenuInflater menuInflater) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view) {
        m0().f1649a = view;
    }

    public void a(View view, Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(f fVar) {
        m0();
        f fVar2 = this.K.q;
        if (fVar == fVar2) {
            return;
        }
        if (fVar != null && fVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        d dVar = this.K;
        if (dVar.p) {
            dVar.q = fVar;
        }
        if (fVar == null) {
            return;
        }
        fVar.b();
    }

    public void a(Fragment fragment) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.w));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.x));
        printWriter.print(" mTag=");
        printWriter.println(this.y);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f1638b);
        printWriter.print(" mWho=");
        printWriter.print(this.f1642f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.n);
        printWriter.print(" mInLayout=");
        printWriter.println(this.o);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.z);
        printWriter.print(" mDetached=");
        printWriter.print(this.A);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.E);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.D);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.B);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.J);
        if (this.s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.s);
        }
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.t);
        }
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.v);
        }
        if (this.f1643g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f1643g);
        }
        if (this.f1639c != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f1639c);
        }
        if (this.f1640d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f1640d);
        }
        Fragment E = E();
        if (E != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(E);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.j);
        }
        if (t() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(t());
        }
        if (this.G != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.G);
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.H);
        }
        if (j() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(j());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(D());
        }
        if (n() != null) {
            a.n.a.a.a(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.u + ":");
        l lVar = this.u;
        lVar.a(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public void a(boolean z) {
    }

    public final void a(String[] strArr, int i) {
        i<?> iVar = this.t;
        if (iVar != null) {
            iVar.a(this, strArr, i);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public boolean a(MenuItem menuItem) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a0() {
        this.u.g();
        if (this.H != null) {
            this.S.a(f.a.ON_DESTROY);
        }
        this.f1638b = 1;
        this.F = false;
        S();
        if (this.F) {
            a.n.a.a.a(this).a();
            this.q = false;
            return;
        }
        throw new x("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public Animator b(int i, boolean z, int i2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i) {
        if (this.K == null && i == 0) {
            return;
        }
        m0().f1652d = i;
    }

    public void b(Bundle bundle) {
        this.F = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.u.y();
        this.q = true;
        this.S = new w();
        this.H = a(layoutInflater, viewGroup, bundle);
        if (this.H != null) {
            this.S.d();
            this.T.b((androidx.lifecycle.n<androidx.lifecycle.i>) this.S);
        } else if (this.S.e()) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        } else {
            this.S = null;
        }
    }

    public void b(Menu menu) {
    }

    public void b(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (!this.z) {
            if (this.D && this.E) {
                z = true;
                a(menu, menuInflater);
            }
            return z | this.u.a(menu, menuInflater);
        }
        return false;
    }

    public boolean b(MenuItem menuItem) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b0() {
        this.f1638b = -1;
        this.F = false;
        T();
        this.O = null;
        if (this.F) {
            if (this.u.w()) {
                return;
            }
            this.u.f();
            this.u = new m();
            return;
        }
        throw new x("Fragment " + this + " did not call through to super.onDetach()");
    }

    @Override // androidx.savedstate.b
    public final SavedStateRegistry c() {
        return this.U.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(int i) {
        if (this.K == null && i == 0) {
            return;
        }
        m0();
        this.K.f1653e = i;
    }

    public void c(Bundle bundle) {
        this.F = true;
        k(bundle);
        if (!this.u.b(1)) {
            this.u.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Menu menu) {
        if (!this.z) {
            if (this.D && this.E) {
                a(menu);
            }
            this.u.a(menu);
        }
    }

    public void c(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(MenuItem menuItem) {
        if (!this.z) {
            return a(menuItem) || this.u.a(menuItem);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c0() {
        onLowMemory();
        this.u.h();
    }

    public LayoutInflater d(Bundle bundle) {
        return a(bundle);
    }

    @Override // androidx.lifecycle.v
    public androidx.lifecycle.u d() {
        l lVar = this.s;
        if (lVar != null) {
            return lVar.e(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(int i) {
        m0().f1651c = i;
    }

    public void d(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(Menu menu) {
        boolean z = false;
        if (!this.z) {
            if (this.D && this.E) {
                z = true;
                b(menu);
            }
            return z | this.u.b(menu);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(MenuItem menuItem) {
        if (!this.z) {
            return (this.D && this.E && b(menuItem)) || this.u.b(menuItem);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d0() {
        this.u.i();
        if (this.H != null) {
            this.S.a(f.a.ON_PAUSE);
        }
        this.R.a(f.a.ON_PAUSE);
        this.f1638b = 3;
        this.F = false;
        U();
        if (this.F) {
            return;
        }
        throw new x("Fragment " + this + " did not call through to super.onPause()");
    }

    public void e(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(boolean z) {
        b(z);
        this.u.a(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e0() {
        boolean g2 = this.s.g(this);
        Boolean bool = this.k;
        if (bool == null || bool.booleanValue() != g2) {
            this.k = Boolean.valueOf(g2);
            d(g2);
            this.u.j();
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    void f() {
        d dVar = this.K;
        f fVar = null;
        if (dVar != null) {
            dVar.p = false;
            f fVar2 = dVar.q;
            dVar.q = null;
            fVar = fVar2;
        }
        if (fVar != null) {
            fVar.a();
        }
    }

    public void f(Bundle bundle) {
        this.F = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(boolean z) {
        c(z);
        this.u.b(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f0() {
        this.u.y();
        this.u.c(true);
        this.f1638b = 4;
        this.F = false;
        V();
        if (this.F) {
            this.R.a(f.a.ON_RESUME);
            if (this.H != null) {
                this.S.a(f.a.ON_RESUME);
            }
            this.u.k();
            return;
        }
        throw new x("Fragment " + this + " did not call through to super.onResume()");
    }

    public final androidx.fragment.app.c g() {
        i<?> iVar = this.t;
        if (iVar == null) {
            return null;
        }
        return (androidx.fragment.app.c) iVar.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Bundle bundle) {
        this.u.y();
        this.f1638b = 2;
        this.F = false;
        b(bundle);
        if (this.F) {
            this.u.d();
            return;
        }
        throw new x("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(boolean z) {
        m0().r = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g0() {
        this.u.y();
        this.u.c(true);
        this.f1638b = 3;
        this.F = false;
        W();
        if (this.F) {
            this.R.a(f.a.ON_START);
            if (this.H != null) {
                this.S.a(f.a.ON_START);
            }
            this.u.l();
            return;
        }
        throw new x("Fragment " + this + " did not call through to super.onStart()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(Bundle bundle) {
        this.u.y();
        this.f1638b = 1;
        this.F = false;
        this.U.a(bundle);
        c(bundle);
        this.P = true;
        if (this.F) {
            this.R.a(f.a.ON_CREATE);
            return;
        }
        throw new x("Fragment " + this + " did not call through to super.onCreate()");
    }

    public boolean h() {
        Boolean bool;
        d dVar = this.K;
        if (dVar == null || (bool = dVar.m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h0() {
        this.u.m();
        if (this.H != null) {
            this.S.a(f.a.ON_STOP);
        }
        this.R.a(f.a.ON_STOP);
        this.f1638b = 2;
        this.F = false;
        X();
        if (this.F) {
            return;
        }
        throw new x("Fragment " + this + " did not call through to super.onStop()");
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater i(Bundle bundle) {
        this.O = d(bundle);
        return this.O;
    }

    public boolean i() {
        Boolean bool;
        d dVar = this.K;
        if (dVar == null || (bool = dVar.l) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final androidx.fragment.app.c i0() {
        androidx.fragment.app.c g2 = g();
        if (g2 != null) {
            return g2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View j() {
        d dVar = this.K;
        if (dVar == null) {
            return null;
        }
        return dVar.f1649a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(Bundle bundle) {
        e(bundle);
        this.U.b(bundle);
        Parcelable A = this.u.A();
        if (A != null) {
            bundle.putParcelable("android:support:fragments", A);
        }
    }

    public final Context j0() {
        Context n = n();
        if (n != null) {
            return n;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Animator k() {
        d dVar = this.K;
        if (dVar == null) {
            return null;
        }
        return dVar.f1650b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.u.a(parcelable);
        this.u.e();
    }

    public final View k0() {
        View F = F();
        if (F != null) {
            return F;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final Bundle l() {
        return this.f1643g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f1640d;
        if (sparseArray != null) {
            this.H.restoreHierarchyState(sparseArray);
            this.f1640d = null;
        }
        this.F = false;
        f(bundle);
        if (this.F) {
            if (this.H == null) {
                return;
            }
            this.S.a(f.a.ON_CREATE);
            return;
        }
        throw new x("Fragment " + this + " did not call through to super.onViewStateRestored()");
    }

    public void l0() {
        l lVar = this.s;
        if (lVar == null || lVar.o == null) {
            m0().p = false;
        } else if (Looper.myLooper() != this.s.o.g().getLooper()) {
            this.s.o.g().postAtFrontOfQueue(new b());
        } else {
            f();
        }
    }

    public final l m() {
        if (this.t != null) {
            return this.u;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public void m(Bundle bundle) {
        if (this.s == null || !O()) {
            this.f1643g = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public Context n() {
        i<?> iVar = this.t;
        if (iVar == null) {
            return null;
        }
        return iVar.f();
    }

    public Object o() {
        d dVar = this.K;
        if (dVar == null) {
            return null;
        }
        return dVar.f1654f;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.F = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        i0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.F = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.core.app.m p() {
        d dVar = this.K;
        if (dVar == null) {
            return null;
        }
        return dVar.n;
    }

    public Object q() {
        d dVar = this.K;
        if (dVar == null) {
            return null;
        }
        return dVar.f1656h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.core.app.m r() {
        d dVar = this.K;
        if (dVar == null) {
            return null;
        }
        return dVar.o;
    }

    public final Object s() {
        i<?> iVar = this.t;
        if (iVar == null) {
            return null;
        }
        return iVar.mo70h();
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        i<?> iVar = this.t;
        if (iVar != null) {
            return iVar.a(str);
        }
        return false;
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        a(intent, i, (Bundle) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int t() {
        d dVar = this.K;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1652d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f1642f);
        sb.append(")");
        if (this.w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.w));
        }
        if (this.y != null) {
            sb.append(" ");
            sb.append(this.y);
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int u() {
        d dVar = this.K;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1653e;
    }

    public final Fragment v() {
        return this.v;
    }

    public final l w() {
        l lVar = this.s;
        if (lVar != null) {
            return lVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public Object x() {
        d dVar = this.K;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.i;
        return obj == W ? q() : obj;
    }

    public final Resources y() {
        return j0().getResources();
    }

    public final boolean z() {
        return this.B;
    }
}

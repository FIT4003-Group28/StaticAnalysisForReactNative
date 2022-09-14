package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.fragment.app.t;
import androidx.lifecycle.f;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public abstract class l {
    private static boolean F = false;
    private ArrayList<Boolean> A;
    private ArrayList<Fragment> B;
    private ArrayList<k> C;
    private o D;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1701b;

    /* renamed from: d  reason: collision with root package name */
    ArrayList<androidx.fragment.app.a> f1703d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<Fragment> f1704e;

    /* renamed from: g  reason: collision with root package name */
    private OnBackPressedDispatcher f1706g;
    private ArrayList<h> j;
    androidx.fragment.app.i<?> o;
    androidx.fragment.app.e p;
    private Fragment q;
    Fragment r;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private ArrayList<androidx.fragment.app.a> z;

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<i> f1700a = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final r f1702c = new r();

    /* renamed from: f  reason: collision with root package name */
    private final androidx.fragment.app.j f1705f = new androidx.fragment.app.j(this);

    /* renamed from: h  reason: collision with root package name */
    private final androidx.activity.b f1707h = new a(false);
    private final AtomicInteger i = new AtomicInteger();
    private ConcurrentHashMap<Fragment, HashSet<a.g.j.b>> k = new ConcurrentHashMap<>();
    private final t.g l = new b();
    private final androidx.fragment.app.k m = new androidx.fragment.app.k(this);
    int n = -1;
    private androidx.fragment.app.h s = null;
    private androidx.fragment.app.h t = new c();
    private Runnable E = new d();

    /* loaded from: classes.dex */
    class a extends androidx.activity.b {
        a(boolean z) {
            super(z);
        }

        @Override // androidx.activity.b
        public void a() {
            l.this.v();
        }
    }

    /* loaded from: classes.dex */
    class b implements t.g {
        b() {
        }

        @Override // androidx.fragment.app.t.g
        public void a(Fragment fragment, a.g.j.b bVar) {
            if (!bVar.c()) {
                l.this.b(fragment, bVar);
            }
        }

        @Override // androidx.fragment.app.t.g
        public void b(Fragment fragment, a.g.j.b bVar) {
            l.this.a(fragment, bVar);
        }
    }

    /* loaded from: classes.dex */
    class c extends androidx.fragment.app.h {
        c() {
        }

        @Override // androidx.fragment.app.h
        public Fragment a(ClassLoader classLoader, String str) {
            androidx.fragment.app.i<?> iVar = l.this.o;
            return iVar.a(iVar.f(), str, (Bundle) null);
        }
    }

    /* loaded from: classes.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l.this.c(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f1712a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1713b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f1714c;

        e(l lVar, ViewGroup viewGroup, View view, Fragment fragment) {
            this.f1712a = viewGroup;
            this.f1713b = view;
            this.f1714c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1712a.endViewTransition(this.f1713b);
            animator.removeListener(this);
            Fragment fragment = this.f1714c;
            View view = fragment.H;
            if (view == null || !fragment.z) {
                return;
            }
            view.setVisibility(8);
        }
    }

    /* loaded from: classes.dex */
    public interface f {
    }

    /* loaded from: classes.dex */
    public static abstract class g {
        public void a(l lVar, Fragment fragment) {
        }

        public void a(l lVar, Fragment fragment, Context context) {
        }

        public void a(l lVar, Fragment fragment, Bundle bundle) {
        }

        public void a(l lVar, Fragment fragment, View view, Bundle bundle) {
        }

        public void b(l lVar, Fragment fragment) {
        }

        public void b(l lVar, Fragment fragment, Context context) {
        }

        public void b(l lVar, Fragment fragment, Bundle bundle) {
        }

        public void c(l lVar, Fragment fragment) {
        }

        public void c(l lVar, Fragment fragment, Bundle bundle) {
        }

        public abstract void d(l lVar, Fragment fragment);

        public void d(l lVar, Fragment fragment, Bundle bundle) {
        }

        public void e(l lVar, Fragment fragment) {
        }

        public void f(l lVar, Fragment fragment) {
        }

        public void g(l lVar, Fragment fragment) {
        }
    }

    /* loaded from: classes.dex */
    public interface h {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface i {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* loaded from: classes.dex */
    private class j implements i {

        /* renamed from: a  reason: collision with root package name */
        final String f1715a;

        /* renamed from: b  reason: collision with root package name */
        final int f1716b;

        /* renamed from: c  reason: collision with root package name */
        final int f1717c;

        j(String str, int i, int i2) {
            this.f1715a = str;
            this.f1716b = i;
            this.f1717c = i2;
        }

        @Override // androidx.fragment.app.l.i
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = l.this.r;
            if (fragment == null || this.f1716b >= 0 || this.f1715a != null || !fragment.m().z()) {
                return l.this.a(arrayList, arrayList2, this.f1715a, this.f1716b, this.f1717c);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class k implements Fragment.f {

        /* renamed from: a  reason: collision with root package name */
        final boolean f1719a;

        /* renamed from: b  reason: collision with root package name */
        final androidx.fragment.app.a f1720b;

        /* renamed from: c  reason: collision with root package name */
        private int f1721c;

        k(androidx.fragment.app.a aVar, boolean z) {
            this.f1719a = z;
            this.f1720b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.f
        public void a() {
            this.f1721c--;
            if (this.f1721c != 0) {
                return;
            }
            this.f1720b.r.B();
        }

        @Override // androidx.fragment.app.Fragment.f
        public void b() {
            this.f1721c++;
        }

        void c() {
            androidx.fragment.app.a aVar = this.f1720b;
            aVar.r.a(aVar, this.f1719a, false, false);
        }

        void d() {
            boolean z = this.f1721c > 0;
            for (Fragment fragment : this.f1720b.r.q()) {
                fragment.a((Fragment.f) null);
                if (z && fragment.K()) {
                    fragment.l0();
                }
            }
            androidx.fragment.app.a aVar = this.f1720b;
            aVar.r.a(aVar, this.f1719a, !z, true);
        }

        public boolean e() {
            return this.f1721c == 0;
        }
    }

    private void C() {
        if (!x()) {
            return;
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    private void D() {
        this.f1701b = false;
        this.A.clear();
        this.z.clear();
    }

    private void E() {
        if (this.y) {
            this.y = false;
            I();
        }
    }

    private void F() {
        if (!this.k.isEmpty()) {
            for (Fragment fragment : this.k.keySet()) {
                p(fragment);
                a(fragment, fragment.D());
            }
        }
    }

    private void G() {
        if (this.C != null) {
            while (!this.C.isEmpty()) {
                this.C.remove(0).d();
            }
        }
    }

    private void H() {
        if (this.j != null) {
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                this.j.get(i2).a();
            }
        }
    }

    private void I() {
        for (Fragment fragment : this.f1702c.b()) {
            if (fragment != null) {
                k(fragment);
            }
        }
    }

    private void J() {
        synchronized (this.f1700a) {
            boolean z = true;
            if (!this.f1700a.isEmpty()) {
                this.f1707h.a(true);
                return;
            }
            androidx.activity.b bVar = this.f1707h;
            if (o() <= 0 || !g(this.q)) {
                z = false;
            }
            bVar.a(z);
        }
    }

    private int a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, a.e.b<Fragment> bVar) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            androidx.fragment.app.a aVar = arrayList.get(i5);
            boolean booleanValue = arrayList2.get(i5).booleanValue();
            if (aVar.h() && !aVar.a(arrayList, i5 + 1, i3)) {
                if (this.C == null) {
                    this.C = new ArrayList<>();
                }
                k kVar = new k(aVar, booleanValue);
                this.C.add(kVar);
                aVar.a(kVar);
                if (booleanValue) {
                    aVar.f();
                } else {
                    aVar.c(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, aVar);
                }
                a(bVar);
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Fragment a(View view) {
        Object tag = view.getTag(a.k.b.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    private void a(a.e.b<Fragment> bVar) {
        int i2 = this.n;
        if (i2 < 1) {
            return;
        }
        int min = Math.min(i2, 3);
        for (Fragment fragment : this.f1702c.c()) {
            if (fragment.f1638b < min) {
                a(fragment, min);
                if (fragment.H != null && !fragment.z && fragment.L) {
                    bVar.add(fragment);
                }
            }
        }
    }

    private void a(q qVar) {
        Fragment e2 = qVar.e();
        if (!this.f1702c.a(e2.f1642f)) {
            return;
        }
        if (d(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + e2);
        }
        this.f1702c.b(qVar);
        m(e2);
    }

    private void a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<k> arrayList3 = this.C;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            k kVar = this.C.get(i2);
            if (arrayList == null || kVar.f1719a || (indexOf2 = arrayList.indexOf(kVar.f1720b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if (kVar.e() || (arrayList != null && kVar.f1720b.a(arrayList, 0, arrayList.size()))) {
                    this.C.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || kVar.f1719a || (indexOf = arrayList.indexOf(kVar.f1720b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        kVar.d();
                    }
                }
                i2++;
            } else {
                this.C.remove(i2);
                i2--;
                size--;
            }
            kVar.c();
            i2++;
        }
    }

    private static void a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            androidx.fragment.app.a aVar = arrayList.get(i2);
            boolean z = true;
            if (arrayList2.get(i2).booleanValue()) {
                aVar.b(-1);
                if (i2 != i3 - 1) {
                    z = false;
                }
                aVar.c(z);
            } else {
                aVar.b(1);
                aVar.f();
            }
            i2++;
        }
    }

    private boolean a(String str, int i2, int i3) {
        c(false);
        d(true);
        Fragment fragment = this.r;
        if (fragment == null || i2 >= 0 || str != null || !fragment.m().z()) {
            boolean a2 = a(this.z, this.A, str, i2, i3);
            if (a2) {
                this.f1701b = true;
                try {
                    c(this.z, this.A);
                } finally {
                    D();
                }
            }
            J();
            E();
            this.f1702c.a();
            return a2;
        }
        return true;
    }

    private void b(a.e.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment f2 = bVar.f(i2);
            if (!f2.l) {
                View k0 = f2.k0();
                f2.N = k0.getAlpha();
                k0.setAlpha(0.0f);
            }
        }
    }

    private void b(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        int i5 = i2;
        boolean z = arrayList.get(i5).p;
        ArrayList<Fragment> arrayList3 = this.B;
        if (arrayList3 == null) {
            this.B = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.B.addAll(this.f1702c.c());
        Fragment u = u();
        boolean z2 = false;
        for (int i6 = i5; i6 < i3; i6++) {
            androidx.fragment.app.a aVar = arrayList.get(i6);
            u = !arrayList2.get(i6).booleanValue() ? aVar.a(this.B, u) : aVar.b(this.B, u);
            z2 = z2 || aVar.f1753g;
        }
        this.B.clear();
        if (!z) {
            t.a(this, arrayList, arrayList2, i2, i3, false, this.l);
        }
        a(arrayList, arrayList2, i2, i3);
        if (z) {
            a.e.b<Fragment> bVar = new a.e.b<>();
            a(bVar);
            int a2 = a(arrayList, arrayList2, i2, i3, bVar);
            b(bVar);
            i4 = a2;
        } else {
            i4 = i3;
        }
        if (i4 != i5 && z) {
            t.a(this, arrayList, arrayList2, i2, i4, true, this.l);
            a(this.n, true);
        }
        while (i5 < i3) {
            androidx.fragment.app.a aVar2 = arrayList.get(i5);
            if (arrayList2.get(i5).booleanValue() && aVar2.t >= 0) {
                aVar2.t = -1;
            }
            aVar2.i();
            i5++;
        }
        if (z2) {
            H();
        }
    }

    private boolean b(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f1700a) {
            if (this.f1700a.isEmpty()) {
                return false;
            }
            int size = this.f1700a.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                z |= this.f1700a.get(i2).a(arrayList, arrayList2);
            }
            this.f1700a.clear();
            this.o.g().removeCallbacks(this.E);
            return z;
        }
    }

    private void c(int i2) {
        try {
            this.f1701b = true;
            this.f1702c.a(i2);
            a(i2, false);
            this.f1701b = false;
            c(true);
        } catch (Throwable th) {
            this.f1701b = false;
            throw th;
        }
    }

    private void c(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        a(arrayList, arrayList2);
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).p) {
                if (i3 != i2) {
                    b(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).p) {
                        i3++;
                    }
                }
                b(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 == size) {
            return;
        }
        b(arrayList, arrayList2, i3, size);
    }

    private void d(boolean z) {
        if (!this.f1701b) {
            if (this.o == null) {
                if (!this.x) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else if (Looper.myLooper() != this.o.g().getLooper()) {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            } else {
                if (!z) {
                    C();
                }
                if (this.z == null) {
                    this.z = new ArrayList<>();
                    this.A = new ArrayList<>();
                }
                this.f1701b = true;
                try {
                    a((ArrayList<androidx.fragment.app.a>) null, (ArrayList<Boolean>) null);
                    return;
                } finally {
                    this.f1701b = false;
                }
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(int i2) {
        return F || Log.isLoggable("FragmentManager", i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(int i2) {
        if (i2 != 4097) {
            if (i2 == 4099) {
                return 4099;
            }
            return i2 != 8194 ? 0 : 4097;
        }
        return 8194;
    }

    private void p(Fragment fragment) {
        HashSet<a.g.j.b> hashSet = this.k.get(fragment);
        if (hashSet != null) {
            Iterator<a.g.j.b> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            hashSet.clear();
            r(fragment);
            this.k.remove(fragment);
        }
    }

    private void q(Fragment fragment) {
        Animator animator;
        if (fragment.H != null) {
            d.C0050d a2 = androidx.fragment.app.d.a(this.o.f(), this.p, fragment, !fragment.z);
            if (a2 == null || (animator = a2.f1680b) == null) {
                if (a2 != null) {
                    fragment.H.startAnimation(a2.f1679a);
                    a2.f1679a.start();
                }
                fragment.H.setVisibility((!fragment.z || fragment.I()) ? 0 : 8);
                if (fragment.I()) {
                    fragment.g(false);
                }
            } else {
                animator.setTarget(fragment.H);
                if (!fragment.z) {
                    fragment.H.setVisibility(0);
                } else if (fragment.I()) {
                    fragment.g(false);
                } else {
                    ViewGroup viewGroup = fragment.G;
                    View view = fragment.H;
                    viewGroup.startViewTransition(view);
                    a2.f1680b.addListener(new e(this, viewGroup, view, fragment));
                }
                a2.f1680b.start();
            }
        }
        if (fragment.l && v(fragment)) {
            this.u = true;
        }
        fragment.M = false;
        fragment.a(fragment.z);
    }

    private void r(Fragment fragment) {
        fragment.a0();
        this.m.g(fragment, false);
        fragment.G = null;
        fragment.H = null;
        fragment.S = null;
        fragment.T.b((androidx.lifecycle.n<androidx.lifecycle.i>) null);
        fragment.o = false;
    }

    private void s(Fragment fragment) {
        if (fragment == null || !fragment.equals(a(fragment.f1642f))) {
            return;
        }
        fragment.e0();
    }

    private o t(Fragment fragment) {
        return this.D.c(fragment);
    }

    private ViewGroup u(Fragment fragment) {
        if (fragment.x > 0 && this.p.c()) {
            View a2 = this.p.a(fragment.x);
            if (a2 instanceof ViewGroup) {
                return (ViewGroup) a2;
            }
        }
        return null;
    }

    private boolean v(Fragment fragment) {
        return (fragment.D && fragment.E) || fragment.u.c();
    }

    private void w(Fragment fragment) {
        ViewGroup u = u(fragment);
        if (u != null) {
            if (u.getTag(a.k.b.visible_removing_fragment_view_tag) == null) {
                u.setTag(a.k.b.visible_removing_fragment_view_tag, fragment);
            }
            ((Fragment) u.getTag(a.k.b.visible_removing_fragment_view_tag)).b(fragment.t());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Parcelable A() {
        int size;
        G();
        F();
        c(true);
        this.v = true;
        ArrayList<p> e2 = this.f1702c.e();
        androidx.fragment.app.b[] bVarArr = null;
        if (e2.isEmpty()) {
            if (d(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> f2 = this.f1702c.f();
        ArrayList<androidx.fragment.app.a> arrayList = this.f1703d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            bVarArr = new androidx.fragment.app.b[size];
            for (int i2 = 0; i2 < size; i2++) {
                bVarArr[i2] = new androidx.fragment.app.b(this.f1703d.get(i2));
                if (d(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f1703d.get(i2));
                }
            }
        }
        n nVar = new n();
        nVar.f1722b = e2;
        nVar.f1723c = f2;
        nVar.f1724d = bVarArr;
        nVar.f1725e = this.i.get();
        Fragment fragment = this.r;
        if (fragment != null) {
            nVar.f1726f = fragment.f1642f;
        }
        return nVar;
    }

    void B() {
        synchronized (this.f1700a) {
            boolean z = false;
            boolean z2 = this.C != null && !this.C.isEmpty();
            if (this.f1700a.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.o.g().removeCallbacks(this.E);
                this.o.g().post(this.E);
                J();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.i.getAndIncrement();
    }

    public Fragment a(int i2) {
        return this.f1702c.b(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment a(String str) {
        return this.f1702c.b(str);
    }

    public void a(int i2, int i3) {
        if (i2 >= 0) {
            a((i) new j(null, i2, i3), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i2, boolean z) {
        androidx.fragment.app.i<?> iVar;
        if (this.o != null || i2 == -1) {
            if (!z && i2 == this.n) {
                return;
            }
            this.n = i2;
            for (Fragment fragment : this.f1702c.c()) {
                i(fragment);
            }
            for (Fragment fragment2 : this.f1702c.b()) {
                if (fragment2 != null && !fragment2.L) {
                    i(fragment2);
                }
            }
            I();
            if (!this.u || (iVar = this.o) == null || this.n != 4) {
                return;
            }
            iVar.j();
            this.u = false;
            return;
        }
        throw new IllegalStateException("No activity");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Configuration configuration) {
        for (Fragment fragment : this.f1702c.c()) {
            if (fragment != null) {
                fragment.a(configuration);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Parcelable parcelable) {
        q qVar;
        if (parcelable == null) {
            return;
        }
        n nVar = (n) parcelable;
        if (nVar.f1722b == null) {
            return;
        }
        this.f1702c.d();
        Iterator<p> it = nVar.f1722b.iterator();
        while (it.hasNext()) {
            p next = it.next();
            if (next != null) {
                Fragment b2 = this.D.b(next.f1735c);
                if (b2 != null) {
                    if (d(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + b2);
                    }
                    qVar = new q(this.m, b2, next);
                } else {
                    qVar = new q(this.m, this.o.f().getClassLoader(), p(), next);
                }
                Fragment e2 = qVar.e();
                e2.s = this;
                if (d(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + e2.f1642f + "): " + e2);
                }
                qVar.a(this.o.f().getClassLoader());
                this.f1702c.a(qVar);
                qVar.a(this.n);
            }
        }
        for (Fragment fragment : this.D.c()) {
            if (!this.f1702c.a(fragment.f1642f)) {
                if (d(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + nVar.f1722b);
                }
                a(fragment, 1);
                fragment.m = true;
                a(fragment, -1);
            }
        }
        this.f1702c.a(nVar.f1723c);
        androidx.fragment.app.b[] bVarArr = nVar.f1724d;
        if (bVarArr != null) {
            this.f1703d = new ArrayList<>(bVarArr.length);
            int i2 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr2 = nVar.f1724d;
                if (i2 >= bVarArr2.length) {
                    break;
                }
                androidx.fragment.app.a a2 = bVarArr2[i2].a(this);
                if (d(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + a2.t + "): " + a2);
                    PrintWriter printWriter = new PrintWriter(new androidx.core.util.b("FragmentManager"));
                    a2.a("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1703d.add(a2);
                i2++;
            }
        } else {
            this.f1703d = null;
        }
        this.i.set(nVar.f1725e);
        String str = nVar.f1726f;
        if (str == null) {
            return;
        }
        this.r = a(str);
        s(this.r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Menu menu) {
        if (this.n < 1) {
            return;
        }
        for (Fragment fragment : this.f1702c.c()) {
            if (fragment != null) {
                fragment.c(menu);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Fragment fragment) {
        if (d(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        h(fragment);
        if (!fragment.A) {
            this.f1702c.a(fragment);
            fragment.m = false;
            if (fragment.H == null) {
                fragment.M = false;
            }
            if (!v(fragment)) {
                return;
            }
            this.u = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r2 != 3) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(androidx.fragment.app.Fragment r13, int r14) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.l.a(androidx.fragment.app.Fragment, int):void");
    }

    void a(Fragment fragment, a.g.j.b bVar) {
        if (this.k.get(fragment) == null) {
            this.k.put(fragment, new HashSet<>());
        }
        this.k.get(fragment).add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Fragment fragment, f.b bVar) {
        if (fragment.equals(a(fragment.f1642f)) && (fragment.t == null || fragment.s == this)) {
            fragment.Q = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Fragment fragment, boolean z) {
        ViewGroup u = u(fragment);
        if (u == null || !(u instanceof androidx.fragment.app.f)) {
            return;
        }
        ((androidx.fragment.app.f) u).setDrawDisappearingViewsLast(!z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(androidx.fragment.app.a aVar) {
        if (this.f1703d == null) {
            this.f1703d = new ArrayList<>();
        }
        this.f1703d.add(aVar);
    }

    void a(androidx.fragment.app.a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.c(z3);
        } else {
            aVar.f();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            t.a(this, arrayList, arrayList2, 0, 1, true, this.l);
        }
        if (z3) {
            a(this.n, true);
        }
        for (Fragment fragment : this.f1702c.b()) {
            if (fragment != null && fragment.H != null && fragment.L && aVar.c(fragment.x)) {
                float f2 = fragment.N;
                if (f2 > 0.0f) {
                    fragment.H.setAlpha(f2);
                }
                if (z3) {
                    fragment.N = 0.0f;
                } else {
                    fragment.N = -1.0f;
                    fragment.L = false;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public void a(androidx.fragment.app.i<?> iVar, androidx.fragment.app.e eVar, Fragment fragment) {
        if (this.o == null) {
            this.o = iVar;
            this.p = eVar;
            this.q = fragment;
            if (this.q != null) {
                J();
            }
            if (iVar instanceof androidx.activity.c) {
                androidx.activity.c cVar = (androidx.activity.c) iVar;
                this.f1706g = cVar.b();
                Fragment fragment2 = cVar;
                if (fragment != null) {
                    fragment2 = fragment;
                }
                this.f1706g.a(fragment2, this.f1707h);
            }
            this.D = fragment != null ? fragment.s.t(fragment) : iVar instanceof androidx.lifecycle.v ? o.a(((androidx.lifecycle.v) iVar).d()) : new o(false);
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public void a(g gVar) {
        this.m.a(gVar);
    }

    public void a(g gVar, boolean z) {
        this.m.a(gVar, z);
    }

    public void a(h hVar) {
        if (this.j == null) {
            this.j = new ArrayList<>();
        }
        this.j.add(hVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(i iVar, boolean z) {
        if (!z) {
            if (this.o == null) {
                if (!this.x) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            C();
        }
        synchronized (this.f1700a) {
            if (this.o == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.f1700a.add(iVar);
            B();
        }
    }

    public void a(String str, int i2) {
        a((i) new j(str, -1, i2), false);
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f1702c.a(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f1704e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.f1704e.get(i2).toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.f1703d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                androidx.fragment.app.a aVar = this.f1703d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.a(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f1700a) {
            int size3 = this.f1700a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size3; i4++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(this.f1700a.get(i4));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.p);
        if (this.q != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.q);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.v);
        printWriter.print(" mStopped=");
        printWriter.print(this.w);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.x);
        if (this.u) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.u);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        for (Fragment fragment : this.f1702c.c()) {
            if (fragment != null) {
                fragment.e(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(Menu menu, MenuInflater menuInflater) {
        if (this.n < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f1702c.c()) {
            if (fragment != null && fragment.b(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f1704e != null) {
            for (int i2 = 0; i2 < this.f1704e.size(); i2++) {
                Fragment fragment2 = this.f1704e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.R();
                }
            }
        }
        this.f1704e = arrayList;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(MenuItem menuItem) {
        if (this.n < 1) {
            return false;
        }
        for (Fragment fragment : this.f1702c.c()) {
            if (fragment != null && fragment.c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int size;
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f1703d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size2 = arrayList3.size() - 1;
            if (size2 < 0) {
                return false;
            }
            arrayList.add(this.f1703d.remove(size2));
            arrayList2.add(true);
        } else {
            if (str != null || i2 >= 0) {
                size = this.f1703d.size() - 1;
                while (size >= 0) {
                    androidx.fragment.app.a aVar = this.f1703d.get(size);
                    if ((str != null && str.equals(aVar.g())) || (i2 >= 0 && i2 == aVar.t)) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        androidx.fragment.app.a aVar2 = this.f1703d.get(size);
                        if (str == null || !str.equals(aVar2.g())) {
                            if (i2 < 0 || i2 != aVar2.t) {
                                break;
                            }
                        }
                    }
                }
            } else {
                size = -1;
            }
            if (size == this.f1703d.size() - 1) {
                return false;
            }
            for (int size3 = this.f1703d.size() - 1; size3 > size; size3--) {
                arrayList.add(this.f1703d.remove(size3));
                arrayList2.add(true);
            }
        }
        return true;
    }

    public Fragment b(String str) {
        return this.f1702c.c(str);
    }

    public s b() {
        return new androidx.fragment.app.a(this);
    }

    void b(Fragment fragment) {
        if (x()) {
            if (!d(2)) {
                return;
            }
            Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
        } else if (!this.D.a(fragment) || !d(2)) {
        } else {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    void b(Fragment fragment, a.g.j.b bVar) {
        HashSet<a.g.j.b> hashSet = this.k.get(fragment);
        if (hashSet == null || !hashSet.remove(bVar) || !hashSet.isEmpty()) {
            return;
        }
        this.k.remove(fragment);
        if (fragment.f1638b >= 3) {
            return;
        }
        r(fragment);
        a(fragment, fragment.D());
    }

    public void b(h hVar) {
        ArrayList<h> arrayList = this.j;
        if (arrayList != null) {
            arrayList.remove(hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(i iVar, boolean z) {
        if (!z || (this.o != null && !this.x)) {
            d(z);
            if (iVar.a(this.z, this.A)) {
                this.f1701b = true;
                try {
                    c(this.z, this.A);
                } finally {
                    D();
                }
            }
            J();
            E();
            this.f1702c.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z) {
        for (Fragment fragment : this.f1702c.c()) {
            if (fragment != null) {
                fragment.f(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(int i2) {
        return this.n >= i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(Menu menu) {
        boolean z = false;
        if (this.n < 1) {
            return false;
        }
        for (Fragment fragment : this.f1702c.c()) {
            if (fragment != null && fragment.d(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(MenuItem menuItem) {
        if (this.n < 1) {
            return false;
        }
        for (Fragment fragment : this.f1702c.c()) {
            if (fragment != null && fragment.d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment c(String str) {
        return this.f1702c.d(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Fragment fragment) {
        if (d(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.A) {
            fragment.A = false;
            if (fragment.l) {
                return;
            }
            this.f1702c.a(fragment);
            if (d(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (!v(fragment)) {
                return;
            }
            this.u = true;
        }
    }

    boolean c() {
        boolean z = false;
        for (Fragment fragment : this.f1702c.b()) {
            if (fragment != null) {
                z = v(fragment);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(boolean z) {
        d(z);
        boolean z2 = false;
        while (b(this.z, this.A)) {
            this.f1701b = true;
            try {
                c(this.z, this.A);
                D();
                z2 = true;
            } catch (Throwable th) {
                D();
                throw th;
            }
        }
        J();
        E();
        this.f1702c.a();
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        this.v = false;
        this.w = false;
        c(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(Fragment fragment) {
        if (d(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.A) {
            fragment.A = true;
            if (!fragment.l) {
                return;
            }
            if (d(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f1702c.c(fragment);
            if (v(fragment)) {
                this.u = true;
            }
            w(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.lifecycle.u e(Fragment fragment) {
        return this.D.d(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        this.v = false;
        this.w = false;
        c(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        this.x = true;
        c(true);
        F();
        c(-1);
        this.o = null;
        this.p = null;
        this.q = null;
        if (this.f1706g != null) {
            this.f1707h.c();
            this.f1706g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Fragment fragment) {
        if (d(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.z) {
            fragment.z = true;
            fragment.M = true ^ fragment.M;
            w(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        c(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        l lVar = fragment.s;
        return fragment.equals(lVar.u()) && g(lVar.q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        for (Fragment fragment : this.f1702c.c()) {
            if (fragment != null) {
                fragment.c0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(Fragment fragment) {
        if (this.f1702c.a(fragment.f1642f)) {
            return;
        }
        q qVar = new q(this.m, fragment);
        qVar.a(this.o.f().getClassLoader());
        this.f1702c.a(qVar);
        if (fragment.C) {
            if (fragment.B) {
                b(fragment);
            } else {
                m(fragment);
            }
            fragment.C = false;
        }
        qVar.a(this.n);
        if (!d(2)) {
            return;
        }
        Log.v("FragmentManager", "Added fragment to active set " + fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        c(3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(Fragment fragment) {
        if (!this.f1702c.a(fragment.f1642f)) {
            if (!d(3)) {
                return;
            }
            Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.n + "since it is not added to " + this);
            return;
        }
        j(fragment);
        if (fragment.H != null) {
            Fragment b2 = this.f1702c.b(fragment);
            if (b2 != null) {
                View view = b2.H;
                ViewGroup viewGroup = fragment.G;
                int indexOfChild = viewGroup.indexOfChild(view);
                int indexOfChild2 = viewGroup.indexOfChild(fragment.H);
                if (indexOfChild2 < indexOfChild) {
                    viewGroup.removeViewAt(indexOfChild2);
                    viewGroup.addView(fragment.H, indexOfChild);
                }
            }
            if (fragment.L && fragment.G != null) {
                float f2 = fragment.N;
                if (f2 > 0.0f) {
                    fragment.H.setAlpha(f2);
                }
                fragment.N = 0.0f;
                fragment.L = false;
                d.C0050d a2 = androidx.fragment.app.d.a(this.o.f(), this.p, fragment, true);
                if (a2 != null) {
                    Animation animation = a2.f1679a;
                    if (animation != null) {
                        fragment.H.startAnimation(animation);
                    } else {
                        a2.f1680b.setTarget(fragment.H);
                        a2.f1680b.start();
                    }
                }
            }
        }
        if (!fragment.M) {
            return;
        }
        q(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        J();
        s(this.r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(Fragment fragment) {
        a(fragment, this.n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        this.v = false;
        this.w = false;
        c(4);
    }

    void k(Fragment fragment) {
        if (fragment.I) {
            if (this.f1701b) {
                this.y = true;
                return;
            }
            fragment.I = false;
            a(fragment, this.n);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        this.v = false;
        this.w = false;
        c(3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(Fragment fragment) {
        if (d(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.r);
        }
        boolean z = !fragment.J();
        if (!fragment.A || z) {
            this.f1702c.c(fragment);
            if (v(fragment)) {
                this.u = true;
            }
            fragment.m = true;
            w(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m() {
        this.w = true;
        c(2);
    }

    void m(Fragment fragment) {
        if (x()) {
            if (!d(2)) {
                return;
            }
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        } else if (!this.D.e(fragment) || !d(2)) {
        } else {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(Fragment fragment) {
        if (fragment == null || (fragment.equals(a(fragment.f1642f)) && (fragment.t == null || fragment.s == this))) {
            Fragment fragment2 = this.r;
            this.r = fragment;
            s(fragment2);
            s(this.r);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public boolean n() {
        boolean c2 = c(true);
        G();
        return c2;
    }

    public int o() {
        ArrayList<androidx.fragment.app.a> arrayList = this.f1703d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(Fragment fragment) {
        if (d(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.z) {
            fragment.z = false;
            fragment.M = !fragment.M;
        }
    }

    public androidx.fragment.app.h p() {
        androidx.fragment.app.h hVar = this.s;
        if (hVar != null) {
            return hVar;
        }
        Fragment fragment = this.q;
        return fragment != null ? fragment.s.p() : this.t;
    }

    public List<Fragment> q() {
        return this.f1702c.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater.Factory2 r() {
        return this.f1705f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.fragment.app.k s() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment t() {
        return this.q;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.q;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            obj = this.q;
        } else {
            androidx.fragment.app.i<?> iVar = this.o;
            if (iVar == null) {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
            sb.append(iVar.getClass().getSimpleName());
            sb.append("{");
            obj = this.o;
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    public Fragment u() {
        return this.r;
    }

    void v() {
        c(true);
        if (this.f1707h.b()) {
            z();
        } else {
            this.f1706g.a();
        }
    }

    public boolean w() {
        return this.x;
    }

    public boolean x() {
        return this.v || this.w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y() {
        if (this.o == null) {
            return;
        }
        this.v = false;
        this.w = false;
        for (Fragment fragment : this.f1702c.c()) {
            if (fragment != null) {
                fragment.P();
            }
        }
    }

    public boolean z() {
        return a((String) null, -1, 0);
    }
}

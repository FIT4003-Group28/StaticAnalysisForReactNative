package defpackage;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment$SavedState;
import android.support.v4.app.FragmentManager$LaunchedFragmentInfo;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: fd  reason: default package */
/* loaded from: classes.dex */
public class fd implements ComponentCallbacks, View.OnCreateContextMenuListener, m, ax, h, avr {
    static final Object h = new Object();
    public gn A;
    public fr<?> B;
    gn C;
    public fd D;
    public int E;
    public int F;
    public String G;
    public boolean H;
    public boolean I;
    private aq IT;
    private int IU;
    public boolean J;
    boolean K;
    boolean L;
    boolean M;
    public boolean N;
    ViewGroup O;
    public View P;
    boolean Q;
    public boolean R;
    fa S;
    boolean T;
    boolean U;
    float V;
    public LayoutInflater W;
    boolean X;
    public j Y;
    public o Z;
    hs aa;
    z<m> ab;
    avq ac;
    int i;
    Bundle j;
    SparseArray<Parcelable> k;
    Bundle l;
    Boolean m;
    public String n;
    public Bundle o;
    fd p;
    String q;
    int r;
    public Boolean s;
    boolean t;
    public boolean u;
    public boolean v;
    boolean w;
    boolean x;
    boolean y;
    int z;

    public fd() {
        this.i = -1;
        this.n = UUID.randomUUID().toString();
        this.q = null;
        this.s = null;
        this.C = new go();
        this.M = true;
        this.R = true;
        new ey(this);
        this.Y = j.RESUMED;
        this.ab = new z<>();
        new AtomicInteger();
        z();
    }

    @Deprecated
    public static fd aE(Context context, String str) {
        try {
            return fq.b(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw new fb("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (InstantiationException e2) {
            throw new fb("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new fb("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new fb("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean A() {
        return this.z > 0;
    }

    public final void B(Bundle bundle) {
        if (this.A == null || !D()) {
            this.o = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public final Bundle C() {
        return this.o;
    }

    public final boolean D() {
        gn gnVar = this.A;
        if (gnVar == null) {
            return false;
        }
        return gnVar.J();
    }

    public final void E(Fragment$SavedState fragment$SavedState) {
        Bundle bundle;
        if (this.A == null) {
            Bundle bundle2 = null;
            if (fragment$SavedState != null && (bundle = fragment$SavedState.a) != null) {
                bundle2 = bundle;
            }
            this.j = bundle2;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    @Deprecated
    public final fd G() {
        String str;
        fd fdVar = this.p;
        if (fdVar != null) {
            return fdVar;
        }
        gn gnVar = this.A;
        if (gnVar != null && (str = this.q) != null) {
            return gnVar.I(str);
        }
        return null;
    }

    public Context H() {
        fr<?> frVar = this.B;
        if (frVar == null) {
            return null;
        }
        return frVar.c;
    }

    public final Context I() {
        Context H = H();
        if (H != null) {
            return H;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final ff J() {
        fr<?> frVar = this.B;
        if (frVar == null) {
            return null;
        }
        return (ff) frVar.b;
    }

    public final ff K() {
        ff J = J();
        if (J != null) {
            return J;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // defpackage.h
    public final aq MX() {
        Application application;
        if (this.A != null) {
            if (this.IT == null) {
                Context applicationContext = I().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        application = null;
                        break;
                    } else if (!(applicationContext instanceof Application)) {
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    } else {
                        application = (Application) applicationContext;
                        break;
                    }
                }
                if (application == null && gn.a(3)) {
                    String str = "Could not find Application instance from Context " + I().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory";
                }
                this.IT = new af(application, this, this.o);
            }
            return this.IT;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // defpackage.ax
    public final aw NA() {
        gn gnVar = this.A;
        if (gnVar != null) {
            gr grVar = gnVar.v;
            aw awVar = grVar.f.get(this.n);
            if (awVar != null) {
                return awVar;
            }
            aw awVar2 = new aw();
            grVar.f.put(this.n, awVar2);
            return awVar2;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public void NB(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.C.Q();
        this.y = true;
        this.aa = new hs();
        View ag = ag(layoutInflater, viewGroup, bundle);
        this.P = ag;
        if (ag == null) {
            if (this.aa.a == null) {
                this.aa = null;
                return;
            }
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
        this.aa.a();
        ay.a(this.P, this.aa);
        az.a(this.P, this);
        avs.a(this.P, this.aa);
        this.ab.g(this.aa);
    }

    @Override // defpackage.m
    public final k Nh() {
        return this.Z;
    }

    public fn PW() {
        return new ez(this);
    }

    public final gn Q() {
        gn gnVar = this.A;
        if (gnVar != null) {
            return gnVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void Qd() {
        this.N = true;
    }

    public void Qe() {
        this.N = true;
    }

    @Override // defpackage.avr
    public final avp Qg() {
        return this.ac.a;
    }

    public LayoutInflater Qh(Bundle bundle) {
        return aD();
    }

    public void Qi(Context context) {
        this.N = true;
        fr<?> frVar = this.B;
        Activity activity = frVar == null ? null : frVar.b;
        if (activity != null) {
            this.N = false;
            ae(activity);
        }
    }

    public void Qj(Bundle bundle) {
        this.N = true;
    }

    public final gn R() {
        if (this.B != null) {
            return this.C;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Object Rm() {
        fr<?> frVar = this.B;
        if (frVar == null) {
            return null;
        }
        return frVar.i();
    }

    public final Resources Rn() {
        return I().getResources();
    }

    public final CharSequence Ro(int i) {
        return Rn().getText(i);
    }

    public final String Rp(int i) {
        return Rn().getString(i);
    }

    public final String Rq(int i, Object... objArr) {
        return Rn().getString(i, objArr);
    }

    public final boolean S() {
        return this.B != null && this.t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean T() {
        fd fdVar = this.D;
        return fdVar != null && (fdVar.u || fdVar.T());
    }

    public final boolean U() {
        return this.i >= 7;
    }

    public final boolean V() {
        View view;
        return S() && !this.H && (view = this.P) != null && view.getWindowToken() != null && this.P.getVisibility() == 0;
    }

    public final void W(boolean z) {
        if (this.M != z) {
            this.M = z;
        }
    }

    @Deprecated
    public void X(boolean z) {
        if (!this.R && z && this.i < 5 && this.A != null && S() && this.X) {
            gn gnVar = this.A;
            gnVar.t(gnVar.A(this));
        }
        this.R = z;
        boolean z2 = false;
        if (this.i < 5 && !z) {
            z2 = true;
        }
        this.Q = z2;
        if (this.j != null) {
            this.m = Boolean.valueOf(z);
        }
    }

    @Deprecated
    public void Z(int i, int i2, Intent intent) {
        if (gn.a(2)) {
            String str = "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aA(Animator animator) {
        at().b = animator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean aB() {
        fa faVar = this.S;
        if (faVar == null) {
            return false;
        }
        return faVar.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aC(boolean z) {
        at().k = z;
    }

    public final void aF() {
        this.N = true;
        fr<?> frVar = this.B;
        if ((frVar == null ? null : frVar.b) != null) {
            this.N = true;
        }
    }

    @Deprecated
    public final void aG() {
        this.J = true;
        gn gnVar = this.A;
        if (gnVar != null) {
            gnVar.v.c(this);
        } else {
            this.K = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aH() {
        fa faVar = this.S;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aI() {
        fa faVar = this.S;
    }

    @Deprecated
    public void ab(int i, String[] strArr, int[] iArr) {
    }

    public final boolean ac(String str) {
        fr<?> frVar = this.B;
        if (frVar != null) {
            return frVar.g(str);
        }
        return false;
    }

    public final LayoutInflater ad(Bundle bundle) {
        LayoutInflater Qh = Qh(bundle);
        this.W = Qh;
        return Qh;
    }

    @Deprecated
    public void ae(Activity activity) {
        this.N = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void af(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.C.O(parcelable);
        this.C.R();
    }

    public View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.IU;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void ah(View view, Bundle bundle) {
    }

    public final View ai() {
        View view = this.P;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    @Deprecated
    public void aj(Bundle bundle) {
        this.N = true;
    }

    public void ak() {
        this.N = true;
    }

    public void al() {
        this.N = true;
    }

    public void am() {
        this.N = true;
    }

    public final Object an() {
        fa faVar = this.S;
        if (faVar == null || faVar.g == h) {
            return null;
        }
        return this.S.g;
    }

    public final Object ao() {
        fa faVar = this.S;
        if (faVar == null || faVar.h == h) {
            return null;
        }
        return this.S.h;
    }

    public final Object ap() {
        fa faVar = this.S;
        if (faVar == null || faVar.i == h) {
            return null;
        }
        return this.S.i;
    }

    public void aq(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.E));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.F));
        printWriter.print(" mTag=");
        printWriter.println(this.G);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.i);
        printWriter.print(" mWho=");
        printWriter.print(this.n);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.z);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.t);
        printWriter.print(" mRemoving=");
        printWriter.print(this.u);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.v);
        printWriter.print(" mInLayout=");
        printWriter.println(this.w);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.H);
        printWriter.print(" mDetached=");
        printWriter.print(this.I);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.M);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.J);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.R);
        if (this.A != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.A);
        }
        if (this.B != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.B);
        }
        if (this.D != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.D);
        }
        if (this.o != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.o);
        }
        if (this.j != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.j);
        }
        if (this.k != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.k);
        }
        if (this.l != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.l);
        }
        fd G = G();
        if (G != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(G);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.r);
        }
        if (au() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(au());
        }
        if (this.O != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.O);
        }
        if (this.P != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.P);
        }
        if (ay() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(ay());
        }
        if (H() != null) {
            apd.a(this).b(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.C + ":");
        gn gnVar = this.C;
        gnVar.s(str + "  ", fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ar() {
        ah(this.P, this.j);
        this.C.Y(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void as() {
        this.C.Y(1);
        if (this.P != null) {
            this.aa.c(i.ON_DESTROY);
        }
        this.i = 1;
        this.N = false;
        Qe();
        if (!this.N) {
            throw new iv("Fragment " + this + " did not call through to super.onDestroyView()");
        }
        aph aphVar = ((api) apd.a(this)).a;
        int f = aphVar.d.f();
        for (int i = 0; i < f; i++) {
            aphVar.d.h(i).n();
        }
        this.y = false;
    }

    public final fa at() {
        if (this.S == null) {
            this.S = new fa();
        }
        return this.S;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int au() {
        fa faVar = this.S;
        if (faVar == null) {
            return 0;
        }
        return faVar.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void av(int i) {
        if (this.S == null && i == 0) {
            return;
        }
        at().c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aw(int i) {
        if (this.S == null && i == 0) {
            return;
        }
        at();
        this.S.d = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ax(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        at();
        fa faVar = this.S;
        faVar.e = arrayList;
        faVar.f = arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final View ay() {
        fa faVar = this.S;
        if (faVar == null) {
            return null;
        }
        return faVar.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void az(View view) {
        at().a = view;
    }

    public void l(Bundle bundle) {
        this.N = true;
        af(bundle);
        gn gnVar = this.C;
        if (gnVar.j > 0) {
            return;
        }
        gnVar.R();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.N = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        K().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.N = true;
    }

    public void s() {
        this.N = true;
    }

    public void t(Bundle bundle) {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.n);
        sb.append(")");
        if (this.E != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.E));
        }
        if (this.G != null) {
            sb.append(" ");
            sb.append(this.G);
        }
        sb.append('}');
        return sb.toString();
    }

    public void u() {
        this.N = true;
    }

    public final m x() {
        hs hsVar = this.aa;
        if (hsVar != null) {
            return hsVar;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public final void z() {
        this.Z = new o(this);
        this.ac = avq.c(this);
    }

    @Deprecated
    public final void F(fd fdVar, int i) {
        gn gnVar = this.A;
        gn gnVar2 = fdVar != null ? fdVar.A : null;
        if (gnVar != null && gnVar2 != null && gnVar != gnVar2) {
            throw new IllegalArgumentException("Fragment " + fdVar + " must share the same FragmentManager to be set as a target fragment");
        }
        for (fd fdVar2 = fdVar; fdVar2 != null; fdVar2 = fdVar2.G()) {
            if (fdVar2.equals(this)) {
                throw new IllegalArgumentException("Setting " + fdVar + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fdVar == null) {
            this.q = null;
        } else if (this.A == null || fdVar.A == null) {
            this.q = null;
            this.p = fdVar;
            this.r = i;
        } else {
            this.q = fdVar.n;
        }
        this.p = null;
        this.r = i;
    }

    public final void Y(Intent intent) {
        fr<?> frVar = this.B;
        if (frVar == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        frVar.m(intent, -1);
    }

    @Deprecated
    public final LayoutInflater aD() {
        fr<?> frVar = this.B;
        if (frVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater e = frVar.e();
        e.setFactory2(this.C.c);
        return e;
    }

    @Deprecated
    public final void aa(String[] strArr, int i) {
        if (this.B == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        gn Q = Q();
        if (Q.q == null) {
            return;
        }
        Q.r.addLast(new FragmentManager$LaunchedFragmentInfo(this.n, i));
        Q.q.b(strArr);
    }

    @Deprecated
    public final void startActivityForResult(Intent intent, int i) {
        if (this.B == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        gn Q = Q();
        if (Q.o != null) {
            Q.r.addLast(new FragmentManager$LaunchedFragmentInfo(this.n, i));
            Q.o.b(intent);
            return;
        }
        Q.k.m(intent, i);
    }

    public fd(int i) {
        this();
        this.IU = i;
    }
}

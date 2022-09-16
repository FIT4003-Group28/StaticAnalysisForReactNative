package defpackage;

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
/* renamed from: dp  reason: default package */
/* loaded from: classes3.dex */
public class dp implements ComponentCallbacks, View.OnCreateContextMenuListener, apy, ak, i, bll, abx {
    static final Object f = new Object();
    public dz A;
    eo B;
    public dp C;
    public int D;
    public int E;
    public String F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J  reason: collision with root package name */
    boolean f180J;
    public boolean K;
    boolean L;
    public boolean M;
    public ViewGroup N;
    public View O;
    boolean P;
    boolean Q;
    dm R;
    boolean S;
    LayoutInflater T;
    boolean U;
    public String V;
    public apt W;
    private int Wq;
    public l X;
    fa Y;
    t Z;
    ae aa;
    blk ab;
    public final AtomicInteger ac;
    public final ArrayList ad;
    public int g;
    Bundle h;
    SparseArray i;
    Bundle j;
    Boolean k;
    public String l;
    public Bundle m;
    dp n;
    String o;
    int p;
    public Boolean q;
    boolean r;
    public boolean s;
    boolean t;
    public boolean u;
    boolean v;
    boolean w;
    boolean x;
    int y;
    public eo z;

    public dp() {
        this.g = -1;
        this.l = UUID.randomUUID().toString();
        this.o = null;
        this.q = null;
        this.B = new eo();
        this.L = true;
        this.Q = true;
        new di(this);
        this.W = apt.RESUMED;
        this.Z = new t();
        this.ac = new AtomicInteger();
        this.ad = new ArrayList();
        Q();
    }

    @Deprecated
    public static dp az(Context context, String str) {
        try {
            return (dp) dy.a(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw new dn("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (InstantiationException e2) {
            throw new dn("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new dn("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new dn("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    private final int jS() {
        if (this.W == apt.INITIALIZED || this.C == null) {
            return this.W.ordinal();
        }
        return Math.min(this.W.ordinal(), this.C.jS());
    }

    private final dp kv(boolean z) {
        String str;
        if (z) {
            ape.c(this);
        }
        dp dpVar = this.n;
        if (dpVar != null) {
            return dpVar;
        }
        eo eoVar = this.z;
        if (eoVar != null && (str = this.o) != null) {
            return eoVar.d(str);
        }
        return null;
    }

    public final eo F() {
        eo eoVar = this.z;
        if (eoVar != null) {
            return eoVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final View I() {
        return this.O;
    }

    public final View K() {
        View view = this.O;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final apy L() {
        fa faVar = this.Y;
        if (faVar != null) {
            return faVar;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public final Object M() {
        dz dzVar = this.A;
        if (dzVar == null) {
            return null;
        }
        return ((ds) dzVar).a;
    }

    public final String N(int i) {
        return rh().getString(i);
    }

    public final String O(int i, Object... objArr) {
        return rh().getString(i, objArr);
    }

    public void P(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.D));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.E));
        printWriter.print(" mTag=");
        printWriter.println(this.F);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.g);
        printWriter.print(" mWho=");
        printWriter.print(this.l);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.y);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.r);
        printWriter.print(" mRemoving=");
        printWriter.print(this.s);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.u);
        printWriter.print(" mInLayout=");
        printWriter.println(this.v);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.G);
        printWriter.print(" mDetached=");
        printWriter.print(this.H);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.L);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.K);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.I);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.Q);
        if (this.z != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.z);
        }
        if (this.A != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.A);
        }
        if (this.C != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.C);
        }
        if (this.m != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.m);
        }
        if (this.h != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.h);
        }
        if (this.i != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.i);
        }
        if (this.j != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.j);
        }
        dp kv = kv(false);
        if (kv != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(kv);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.p);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(ao());
        if (rc() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(rc());
        }
        if (rd() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(rd());
        }
        if (re() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(re());
        }
        if (rf() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(rf());
        }
        if (this.N != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.N);
        }
        if (this.O != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.O);
        }
        if (rb() != null) {
            aqh.a(this).c(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.B + ":");
        eo eoVar = this.B;
        eoVar.F(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final void Q() {
        this.X = new l(this);
        this.ab = blk.a(this);
        this.aa = null;
    }

    @Deprecated
    public void R(Bundle bundle) {
        this.M = true;
    }

    @Deprecated
    public void S(int i, int i2, Intent intent) {
        if (eo.X(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" received the following in onActivityResult(): requestCode: ");
            sb.append(i);
            sb.append(" resultCode: ");
            sb.append(i2);
            sb.append(" data: ");
            sb.append(intent);
        }
    }

    @Deprecated
    public void T(Activity activity) {
        this.M = true;
    }

    public void U() {
        this.M = true;
    }

    public void V(boolean z) {
    }

    public void W() {
        this.M = true;
    }

    @Deprecated
    public void X(int i, String[] strArr, int[] iArr) {
    }

    public void Y() {
        this.M = true;
    }

    public void Z(View view, Bundle bundle) {
    }

    public final void aA() {
        this.M = true;
        dz dzVar = this.A;
        if ((dzVar == null ? null : dzVar.b) != null) {
            this.M = true;
        }
    }

    public void aB() {
    }

    @Deprecated
    public final void aC() {
        ape.d(this);
        this.I = true;
        eo eoVar = this.z;
        if (eoVar != null) {
            eoVar.y.d(this);
        } else {
            this.f180J = true;
        }
    }

    @Deprecated
    public final void aD(dp dpVar) {
        if (dpVar != null) {
            ape.g(this, dpVar);
        }
        eo eoVar = this.z;
        eo eoVar2 = dpVar != null ? dpVar.z : null;
        if (eoVar != null && eoVar2 != null && eoVar != eoVar2) {
            throw new IllegalArgumentException("Fragment " + dpVar + " must share the same FragmentManager to be set as a target fragment");
        }
        for (dp dpVar2 = dpVar; dpVar2 != null; dpVar2 = dpVar2.kv(false)) {
            if (dpVar2.equals(this)) {
                throw new IllegalArgumentException("Setting " + dpVar + " as the target of " + this + " would create a target cycle");
            }
        }
        if (dpVar == null) {
            this.o = null;
        } else if (this.z == null || dpVar.z == null) {
            this.o = null;
            this.n = dpVar;
            this.p = 0;
        } else {
            this.o = dpVar.l;
        }
        this.n = null;
        this.p = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aa() {
        Z(this.O, this.h);
        this.B.D(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ac(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.B.O(parcelable);
        this.B.t();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ad(int i, int i2, int i3, int i4) {
        if (this.R == null && i == 0) {
            if (i2 != 0) {
                i = 0;
            } else if (i3 != 0) {
                i = 0;
                i2 = 0;
            } else if (i4 == 0) {
                return;
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
            }
        }
        ri().b = i;
        ri().c = i2;
        ri().d = i3;
        ri().e = i4;
    }

    public final void ae(Bundle bundle) {
        if (this.z == null || !as()) {
            this.m = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void af(View view) {
        ri().m = view;
    }

    public final void ag(Fragment$SavedState fragment$SavedState) {
        Bundle bundle;
        if (this.z == null) {
            Bundle bundle2 = null;
            if (fragment$SavedState != null && (bundle = fragment$SavedState.a) != null) {
                bundle2 = bundle;
            }
            this.h = bundle2;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public final void ah(boolean z) {
        if (this.L != z) {
            this.L = z;
            if (!this.K || !ap() || this.G) {
                return;
            }
            this.A.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ai(int i) {
        if (this.R == null && i == 0) {
            return;
        }
        ri();
        this.R.f = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aj(boolean z) {
        if (this.R == null) {
            return;
        }
        ri().a = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ak(ArrayList arrayList, ArrayList arrayList2) {
        ri();
        dm dmVar = this.R;
        dmVar.g = arrayList;
        dmVar.h = arrayList2;
    }

    @Deprecated
    public final void al(boolean z) {
        ape.e(this, z);
        if (!this.Q && z && this.g < 5 && this.z != null && ap() && this.U) {
            eo eoVar = this.z;
            eoVar.K(eoVar.k(this));
        }
        this.Q = z;
        boolean z2 = false;
        if (this.g < 5 && !z) {
            z2 = true;
        }
        this.P = z2;
        if (this.h != null) {
            this.k = Boolean.valueOf(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ao() {
        dm dmVar = this.R;
        if (dmVar == null) {
            return false;
        }
        return dmVar.a;
    }

    public final boolean ap() {
        return this.A != null && this.r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean aq() {
        return this.y > 0;
    }

    public final boolean ar() {
        return this.g >= 7;
    }

    public final boolean as() {
        eo eoVar = this.z;
        if (eoVar == null) {
            return false;
        }
        return eoVar.Z();
    }

    public final boolean at() {
        View view;
        return ap() && !this.G && (view = this.O) != null && view.getWindowToken() != null && this.O.getVisibility() == 0;
    }

    public final boolean au(String str) {
        dz dzVar = this.A;
        if (dzVar != null) {
            return ake.j(((ds) dzVar).a, str);
        }
        return false;
    }

    public final void av() {
    }

    public final void aw() {
    }

    @Deprecated
    public final LayoutInflater ax() {
        dz dzVar = this.A;
        if (dzVar != null) {
            ds dsVar = (ds) dzVar;
            LayoutInflater cloneInContext = dsVar.a.getLayoutInflater().cloneInContext(dsVar.a);
            cloneInContext.setFactory2(this.B.c);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public final void ay() {
    }

    public ae getDefaultViewModelProviderFactory() {
        Application application;
        if (this.z != null) {
            if (this.aa == null) {
                Context applicationContext = rg().getApplicationContext();
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
                if (application == null && eo.X(3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not find Application instance from Context ");
                    sb.append(rg().getApplicationContext());
                    sb.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.aa = new z(application, this, this.m);
            }
            return this.aa;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // defpackage.apy
    public final apu getLifecycle() {
        return this.X;
    }

    @Override // defpackage.bll
    public final blj getSavedStateRegistry() {
        return this.ab.a;
    }

    public void kt(Context context) {
        this.M = true;
        dz dzVar = this.A;
        Activity activity = dzVar == null ? null : dzVar.b;
        if (activity != null) {
            this.M = false;
            T(activity);
        }
    }

    public dw kz() {
        return new dj(this);
    }

    public void lJ(Bundle bundle) {
        this.M = true;
    }

    public void lK(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.B.noteStateNotSaved();
        this.x = true;
        this.Y = new fa(this, getViewModelStore());
        View mc = mc(layoutInflater, viewGroup, bundle);
        this.O = mc;
        if (mc == null) {
            if (this.Y.a == null) {
                this.Y = null;
                return;
            }
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
        this.Y.b();
        ao.d(this.O, this.Y);
        ao.c(this.O, this.Y);
        le.d(this.O, this.Y);
        this.Z.k(this.Y);
    }

    public LayoutInflater lS(Bundle bundle) {
        return ax();
    }

    public void lU() {
        this.M = true;
    }

    @Deprecated
    public final dp mI() {
        return kv(true);
    }

    public final dt mJ() {
        dz dzVar = this.A;
        if (dzVar == null) {
            return null;
        }
        return (dt) dzVar.b;
    }

    public final dt mK() {
        dt mJ = mJ();
        if (mJ != null) {
            return mJ;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final eo mL() {
        if (this.A != null) {
            return this.B;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final LayoutInflater mM() {
        LayoutInflater layoutInflater = this.T;
        return layoutInflater == null ? mb(null) : layoutInflater;
    }

    public void mQ(Bundle bundle) {
        this.M = true;
        ac(bundle);
        eo eoVar = this.B;
        if (eoVar.l > 0) {
            return;
        }
        eoVar.t();
    }

    public void mR() {
        this.M = true;
    }

    public void mS() {
        this.M = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final LayoutInflater mb(Bundle bundle) {
        LayoutInflater lS = lS(bundle);
        this.T = lS;
        return lS;
    }

    public View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.Wq;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void my() {
        this.M = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.M = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        mK().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.M = true;
    }

    public void oz(Bundle bundle) {
    }

    public Context rb() {
        dz dzVar = this.A;
        if (dzVar == null) {
            return null;
        }
        return dzVar.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int rc() {
        dm dmVar = this.R;
        if (dmVar == null) {
            return 0;
        }
        return dmVar.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int rd() {
        dm dmVar = this.R;
        if (dmVar == null) {
            return 0;
        }
        return dmVar.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int re() {
        dm dmVar = this.R;
        if (dmVar == null) {
            return 0;
        }
        return dmVar.d;
    }

    @Override // defpackage.abx
    public final aby registerForActivityResult(ach achVar, abw abwVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int rf() {
        dm dmVar = this.R;
        if (dmVar == null) {
            return 0;
        }
        return dmVar.e;
    }

    public final Context rg() {
        Context rb = rb();
        if (rb != null) {
            return rb;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final Resources rh() {
        return rg().getResources();
    }

    public final dm ri() {
        if (this.R == null) {
            this.R = new dm();
        }
        return this.R;
    }

    @Deprecated
    public final void startActivityForResult(Intent intent, int i) {
        an(intent, i, null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.l);
        if (this.D != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.D));
        }
        if (this.F != null) {
            sb.append(" tag=");
            sb.append(this.F);
        }
        sb.append(")");
        return sb.toString();
    }

    @Deprecated
    public final void ab(String[] strArr, int i) {
        if (this.A == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        eo F = F();
        if (F.s == null) {
            return;
        }
        F.t.addLast(new FragmentManager$LaunchedFragmentInfo(this.l, i));
        F.s.b(strArr);
    }

    public final void am(Intent intent) {
        dz dzVar = this.A;
        if (dzVar == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        dzVar.e(intent, -1, null);
    }

    @Deprecated
    public final void an(Intent intent, int i, Bundle bundle) {
        if (this.A == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        eo F = F();
        if (F.q != null) {
            F.t.addLast(new FragmentManager$LaunchedFragmentInfo(this.l, i));
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            F.q.b(intent);
            return;
        }
        F.m.e(intent, i, bundle);
    }

    @Override // defpackage.ak
    public final aj getViewModelStore() {
        if (this.z == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (jS() != apt.INITIALIZED.ordinal()) {
            ep epVar = this.z.y;
            aj ajVar = (aj) epVar.f.get(this.l);
            if (ajVar != null) {
                return ajVar;
            }
            aj ajVar2 = new aj();
            epVar.f.put(this.l, ajVar2);
            return ajVar2;
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public dp(int i) {
        this();
        this.Wq = i;
    }
}

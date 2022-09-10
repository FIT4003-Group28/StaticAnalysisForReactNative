package defpackage;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import com.google.android.filament.R;
import com.google.android.gms.car.CarUiInfo;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.InputFocusChangedEvent;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import java.util.concurrent.Semaphore;
/* compiled from: PG */
/* renamed from: cnht  reason: default package */
/* loaded from: classes.dex */
public final class cnht implements KeyEvent.Callback, cmvz, cmvu, cmzb {
    public static final SparseArray<String> G;
    public final cmvr A;
    public Object C;
    public boolean E;
    public cnhu I;
    public cmxz J;
    private boolean K;
    private boolean L;
    private ComponentName M;
    public cnhq b;
    public Service f;
    public Context g;
    public Class<? extends cmvt> h;
    public cmvt i;
    public CarRegionId j;
    public cnaa k;
    public cmyy l;
    public cmwc m;
    public Intent n;
    public Bundle o;
    public Configuration p;
    public boolean q;
    public int r;
    public View t;
    public String u;
    public cnin v;
    public cmvv w;
    public final cneo y;
    public final Semaphore c = new Semaphore(0);
    public final Runnable d = new cngo(this);
    public final IBinder.DeathRecipient e = new cngp(this);
    public volatile boolean s = false;
    public final Rect x = new Rect();
    public boolean z = true;
    private final cngq N = new cngq(this);
    public final Object D = new Object();
    public final KeyEvent.DispatcherState F = new KeyEvent.DispatcherState();
    public volatile int H = 0;
    public final boolean B = true;
    public final Pair<Integer, cnim> a = Pair.create(-1, null);

    static {
        SparseArray<String> sparseArray = new SparseArray<>(7);
        G = sparseArray;
        sparseArray.put(0, "INITIALIZING");
        sparseArray.put(1, "CREATED");
        sparseArray.put(2, "STOPPED");
        sparseArray.put(3, "STARTED");
        sparseArray.put(4, "PAUSED");
        sparseArray.put(5, "RESUMED");
        sparseArray.put(6, "FINISHED");
    }

    public cnht() {
        cneo cneoVar = new cneo(Looper.getMainLooper(), new cngr(this));
        this.y = cneoVar;
        this.A = new cngs(this, cneoVar);
    }

    public static String q(int i) {
        SparseArray<String> sparseArray = G;
        return sparseArray.get(i) == null ? "Unknown" : sparseArray.get(i);
    }

    public static final cmvt u(ClassLoader classLoader, String str) {
        try {
            return (cmvt) classLoader.loadClass(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            String valueOf = String.valueOf(str);
            throw new RuntimeException(valueOf.length() != 0 ? "Exception while instantiating class ".concat(valueOf) : new String("Exception while instantiating class "), e);
        }
    }

    private final void v() {
        cneo cneoVar = this.y;
        if (cneoVar != null) {
            try {
                cneoVar.k(CarDisplayId.a).c(this.N);
            } catch (cmwm | IllegalStateException unused) {
                int i = cnjc.a;
            }
        }
        cmyy cmyyVar = this.l;
        if (cmyyVar != null) {
            cmyyVar.f = false;
            cmyyVar.dismiss();
            this.l = null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:10|(4:12|(4:15|(1:17)(4:27|(3:31|32|30)|29|30)|(1:19)(5:20|21|(1:23)(1:26)|24|25)|13)|35|36)(1:68)|37|(13:39|40|41|42|(3:45|(1:52)(1:50)|43)|54|55|56|57|58|(1:60)|61|62)(0)|67|55|56|57|58|(0)|61|62) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0141, code lost:
        r0 = defpackage.cnjc.a;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void w() {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnht.w():void");
    }

    @Override // defpackage.cmvu
    public final void a(View view) {
        this.t = view;
        this.l.setContentView(view);
    }

    @Override // defpackage.cmvu
    public final int b() {
        dbsk.t(this.j, "Can't provide displayId before activity is started");
        return this.j.b.b;
    }

    @Override // defpackage.cmzb
    public final boolean c() {
        boolean z;
        synchronized (this.D) {
            int i = cnjc.a;
            z = this.E;
        }
        return z;
    }

    @Override // defpackage.cmzb
    public final void d(boolean z, boolean z2) {
        synchronized (this.D) {
            int i = cnjc.a;
            this.E = z;
            this.D.notifyAll();
        }
        if (cnjc.a("CAR.PROJECTION.CAHI", 3)) {
            this.M.toShortString();
        }
        this.i.j(z, z2);
    }

    public final void e() {
        if (cmwk.a("CAR.PROJECTION.CAHI", 3)) {
            int i = cnjc.a;
        }
        if (this.s) {
            if (!cmwk.a("CAR.PROJECTION.CAHI", 3)) {
                return;
            }
            int i2 = cnjc.a;
            return;
        }
        this.s = true;
        new cojb(Looper.getMainLooper()).postAtFrontOfQueue(new cngu(this));
    }

    public final boolean f() {
        if (!this.y.s()) {
            int i = cnjc.a;
            return false;
        }
        return true;
    }

    public final void g(CarRegionId carRegionId, DrawingSpec drawingSpec, Intent intent, Configuration configuration, Bundle bundle) {
        if (!f()) {
            return;
        }
        this.j = carRegionId;
        this.p = configuration;
        s(this.f.getBaseContext().getResources());
        cnaa cnaaVar = this.k;
        if (cnaaVar == null) {
            k(drawingSpec.a, drawingSpec.b, drawingSpec.c, drawingSpec.d);
        } else {
            cnaaVar.b(drawingSpec.d);
        }
        l(drawingSpec);
        this.o = bundle;
        if (this.M == null) {
            this.M = intent.getComponent();
        }
        Bundle bundle2 = this.o;
        if (bundle2 != null) {
            bundle2.setClassLoader(this.f.getClassLoader());
        }
        if (this.i == null) {
            this.i = u(this.f.getClassLoader(), this.h.getName());
        }
        if ((intent == null && this.n != null) || (intent != null && !intent.filterEquals(this.n))) {
            this.n = intent;
        }
        o(3);
        try {
            this.J.e();
        } catch (RemoteException unused) {
            r();
        }
    }

    public final void h() {
        this.q = false;
        try {
            this.J.i();
        } catch (RemoteException unused) {
            r();
        }
    }

    public final void i(InputFocusChangedEvent inputFocusChangedEvent, boolean z) {
        int i = cnjc.a;
        if (!f()) {
            return;
        }
        this.z = inputFocusChangedEvent.b;
        cmyy cmyyVar = this.l;
        if (cmyyVar != null) {
            cmyyVar.l(inputFocusChangedEvent.a, inputFocusChangedEvent.b, inputFocusChangedEvent.c, inputFocusChangedEvent.d);
        }
        if (!z) {
            return;
        }
        try {
            this.J.n();
        } catch (RemoteException unused) {
            cmyz.a(this.d);
        }
    }

    public final void j(WindowManager.LayoutParams layoutParams) {
        try {
            cmvt cmvtVar = this.i;
            if (cmvtVar == null) {
                return;
            }
            cmvtVar.Og(layoutParams);
        } catch (NoSuchMethodError unused) {
            int i = cnjc.a;
        }
    }

    public final void k(int i, int i2, int i3, Surface surface) {
        if (cmwk.a("CAR.PROJECTION.CAHI", 3)) {
            int i4 = cnjc.a;
        }
        String packageName = this.f.getPackageName();
        String name = this.h.getName();
        StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(name).length());
        sb.append(packageName);
        sb.append("/");
        sb.append(name);
        this.k = new cnaa((DisplayManager) this.g.getSystemService("display"), sb.toString(), i, i2, i3, surface, new cngw(this));
    }

    public final void l(DrawingSpec drawingSpec) {
        Rect rect = drawingSpec.e;
        if (rect == null) {
            int i = cnjc.a;
            return;
        }
        this.x.set(rect);
        cmyy cmyyVar = this.l;
        if (cmyyVar != null) {
            cmyyVar.a(this.x);
        } else {
            int i2 = cnjc.a;
        }
    }

    public final void m() {
        if (cmwk.a("CAR.PROJECTION.CAHI", 3)) {
            int i = cnjc.a;
        }
        v();
        cnaa cnaaVar = this.k;
        if (cnaaVar != null) {
            cnaaVar.d();
            this.k = null;
        }
    }

    public final void n() {
        Context context = this.g;
        for (String str : context.getPackageManager().getPackagesForUid(Binder.getCallingUid())) {
            if (cnnm.a(context).b(str)) {
                return;
            }
        }
        if (this.g.checkCallingPermission("android.permission.CAPTURE_VIDEO_OUTPUT") == 0) {
            return;
        }
        int callingPid = Binder.getCallingPid();
        int callingUid = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder((int) R.styleable.AppCompatTheme_windowFixedWidthMajor);
        sb.append("projection client manager does not have permission:");
        sb.append("android.permission.CAPTURE_VIDEO_OUTPUT");
        sb.append(" pid:");
        sb.append(callingPid);
        sb.append(" uid:");
        sb.append(callingUid);
        throw new SecurityException(sb.toString());
    }

    public final void o(int i) {
        p(i, false);
    }

    @Override // android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.i.O();
    }

    @Override // android.view.KeyEvent.Callback
    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return this.i.P();
    }

    @Override // android.view.KeyEvent.Callback
    public final boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.i.Q(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r0 != 2) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(int r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnht.p(int, boolean):void");
    }

    public final void r() {
        if (this.L) {
            return;
        }
        this.L = true;
        o(0);
        m();
        this.y.t(null);
    }

    public final void s(Resources resources) {
        if (this.p == null) {
            return;
        }
        resources.getConfiguration().uiMode = (resources.getConfiguration().uiMode & (-49)) | (this.p.uiMode & 48);
        resources.updateConfiguration(resources.getConfiguration(), resources.getDisplayMetrics());
    }

    public final void t() {
        boolean z;
        int i;
        if (!this.y.s() || this.s) {
            return;
        }
        CarUiInfo carUiInfo = null;
        try {
            carUiInfo = this.y.h().f();
        } catch (RemoteException unused) {
            int i2 = cnjc.a;
        } catch (IllegalStateException e) {
            try {
                cniy.c(e);
            } catch (cmwm unused2) {
                cnjc.a("CAR.PROJECTION.CAHI", 3);
            } catch (IllegalStateException unused3) {
                int i3 = cnjc.a;
            }
        }
        cmyy cmyyVar = this.l;
        if (cmyyVar == null) {
            if (!cmwk.a("CAR.PROJECTION.CAHI", 5)) {
                return;
            }
            int i4 = cnjc.a;
            return;
        }
        int i5 = 0;
        if (carUiInfo != null) {
            cmyu cmyuVar = new cmyu(carUiInfo.b, carUiInfo.a, carUiInfo.d, carUiInfo.i, carUiInfo.j);
            if (cmwk.a("CAR.PROJECTION.PRES", 3)) {
                int i6 = cnjc.a;
            }
            cmyyVar.getResources().getConfiguration().touchscreen = true != cmyuVar.a ? 1 : 3;
            cmyyVar.getResources().getConfiguration().navigation = cmyuVar.c ? 2 : cmyuVar.b ? 4 : 1;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            cmyyVar.getDisplay().getMetrics(displayMetrics);
            cmyyVar.getResources().updateConfiguration(cmyyVar.getResources().getConfiguration(), displayMetrics);
            cmyyVar.u = cmyuVar.d;
            cmyyVar.v = cmyuVar.e;
            if (!cmyyVar.l) {
                boolean z2 = cmyuVar.c;
                cmyyVar.t = z2;
                cmyyVar.l = true;
                if (z2) {
                    cmyyVar.g.b();
                    if (cmyyVar.D != null) {
                        cmyyVar.g.a(cmyyVar.c().getDecorView());
                    }
                }
            } else if (cmyyVar.t != cmyuVar.c) {
                throw new IllegalStateException("Changing the value of touchpadForUiNavigation configuration not supported");
            }
            z = carUiInfo.d;
        } else {
            z = false;
        }
        try {
            boolean q = this.y.q("rotary_use_focus_finder");
            if (z) {
                i5 = this.y.r("touchpad_focus_navigation_history_max_size");
                i = this.y.r("touchpad_focus_navigation_history_max_age_ms");
            } else {
                i = 0;
            }
            cmyy cmyyVar2 = this.l;
            if (cmwk.a("CAR.PROJECTION.PRES", 3)) {
                int i7 = cnjc.a;
            }
            cmyyVar2.C = q;
            cmyyVar2.J = cmyyVar2.u(i5, i);
        } catch (cmwm unused4) {
            int i8 = cnjc.a;
        }
    }
}

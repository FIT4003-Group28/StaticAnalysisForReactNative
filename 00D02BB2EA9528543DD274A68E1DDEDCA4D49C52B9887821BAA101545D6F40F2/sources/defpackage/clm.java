package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.LayoutInflater;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/* compiled from: PG */
/* renamed from: clm  reason: default package */
/* loaded from: classes5.dex */
public final class clm extends cmk {
    private Method A;
    private Method B;
    public final cle a;
    public final cmu b;
    public final cmg c;
    public final cms d;
    public final cmx e;
    public final cmy f;
    public final int g;
    public Method h;
    public Method i;
    public Method j;
    public Method k;
    public Method l;
    public Method m;
    public Method n;
    public Method o;
    public Method p;
    private final cmj r;
    private Method s;
    private Method t;
    private Method u;
    private Method v;
    private Method w;
    private Method x;
    private Method y;
    private Method z;

    @Deprecated
    public clm(cmp cmpVar, cnfs cnfsVar, LayoutInflater.Factory factory, cnia cniaVar) {
        super(cmpVar, cmpVar.a, cmpVar.b, factory);
        this.g = ((Integer) b(this.s, new Object[0])).intValue();
        this.a = c();
        j();
        this.b = h(cniaVar);
        this.e = d();
        cmj k = k(cmpVar);
        this.r = k;
        i(k);
        this.c = e(cnfsVar);
        this.d = f();
        this.f = g();
    }

    private final cle c() {
        clp clpVar;
        IBinder iBinder = (IBinder) b(this.B, new Object[0]);
        if (iBinder == null) {
            clpVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.auto.sdk.ICapabilityController");
            if (queryLocalInterface instanceof clp) {
                clpVar = (clp) queryLocalInterface;
            } else {
                clpVar = new clp(iBinder);
            }
        }
        return new cle(clpVar);
    }

    private final cmx d() {
        cmc cmcVar;
        IBinder iBinder = (IBinder) b(this.z, new Object[0]);
        if (iBinder == null) {
            cmcVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.auto.sdk.IToastController");
            if (queryLocalInterface instanceof cmc) {
                cmcVar = (cmc) queryLocalInterface;
            } else {
                cmcVar = new cmc(iBinder);
            }
        }
        return new cmx(cmcVar);
    }

    private final cmg e(cnfs cnfsVar) {
        clw clwVar;
        IBinder iBinder = (IBinder) b(this.x, new Object[0]);
        if (iBinder == null) {
            clwVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.auto.sdk.IImeController");
            if (queryLocalInterface instanceof clw) {
                clwVar = (clw) queryLocalInterface;
            } else {
                clwVar = new clw(iBinder);
            }
        }
        return new cmg(clwVar, cnfsVar, this);
    }

    private final cms f() {
        cma cmaVar;
        IBinder iBinder = (IBinder) b(this.y, new Object[0]);
        if (iBinder == null) {
            cmaVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.auto.sdk.ISearchController");
            if (queryLocalInterface instanceof cma) {
                cmaVar = (cma) queryLocalInterface;
            } else {
                cmaVar = new cma(iBinder);
            }
        }
        return new cms(cmaVar);
    }

    private final cmy g() {
        cmd cmdVar;
        IBinder iBinder = (IBinder) b(this.A, new Object[0]);
        if (iBinder == null) {
            cmdVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.auto.sdk.IVoiceSearchController");
            if (queryLocalInterface instanceof cmd) {
                cmdVar = (cmd) queryLocalInterface;
            } else {
                cmdVar = new cmd(iBinder);
            }
        }
        return new cmy(cmdVar);
    }

    private final cmu h(cnia cniaVar) {
        cmb cmbVar;
        IBinder iBinder = (IBinder) b(this.u, new Object[0]);
        if (iBinder == null) {
            cmbVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.auto.sdk.IStatusBarController");
            if (queryLocalInterface instanceof cmb) {
                cmbVar = (cmb) queryLocalInterface;
            } else {
                cmbVar = new cmb(iBinder);
            }
        }
        return new cmu(cmbVar, cniaVar);
    }

    private final void i(cmj cmjVar) {
        cls clsVar;
        IBinder iBinder = (IBinder) b(this.v, new Object[0]);
        if (iBinder == null) {
            clsVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.auto.sdk.IDrawerController");
            if (queryLocalInterface instanceof cls) {
                clsVar = (cls) queryLocalInterface;
            } else {
                clsVar = new cls(iBinder);
            }
        }
        new clo(clsVar, cmjVar);
    }

    private final void j() {
        IBinder iBinder = (IBinder) b(this.t, new Object[0]);
        if (iBinder == null) {
            return;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.auto.sdk.IFacetBarController");
        if (queryLocalInterface instanceof clt) {
            clt cltVar = (clt) queryLocalInterface;
        } else {
            new clt(iBinder);
        }
    }

    private final cmj k(cmp cmpVar) {
        IBinder iBinder = (IBinder) b(this.w, new Object[0]);
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.auto.sdk.IMenuController");
            if (queryLocalInterface instanceof clx) {
                clx clxVar = (clx) queryLocalInterface;
            } else {
                new clx(iBinder);
            }
        }
        Context context = cmpVar.a;
        return new cmj();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.cmk
    protected final void a(Method[] methodArr) {
        char c;
        for (Method method : methodArr) {
            if (Modifier.isPublic(method.getModifiers())) {
                String name = method.getName();
                switch (name.hashCode()) {
                    case -2094893759:
                        if (name.equals("startCarActivity")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1968397494:
                        if (name.equals("getCapabilityController")) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1491459488:
                        if (name.equals("onSaveInstanceState")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1336895037:
                        if (name.equals("onStart")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1186339443:
                        if (name.equals("onRestoreInstanceState")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1012956543:
                        if (name.equals("onStop")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -369900066:
                        if (name.equals("requestXRayScan")) {
                            c = 18;
                            break;
                        }
                        c = 65535;
                        break;
                    case -262928640:
                        if (name.equals("getVoiceSearchController")) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case 727922513:
                        if (name.equals("getMenuController")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case 808969955:
                        if (name.equals("getDrawerController")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case 852203143:
                        if (name.equals("getImeController")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case 983415097:
                        if (name.equals("getContentContainerId")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1272509941:
                        if (name.equals("getAppLayout")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1321081562:
                        if (name.equals("getSearchController")) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1343348110:
                        if (name.equals("getFacetBarController")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1356972381:
                        if (name.equals("onConfigurationChanged")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1861367303:
                        if (name.equals("getStatusBarController")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1943823085:
                        if (name.equals("getToastController")) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2060811692:
                        if (name.equals("createInputConnection")) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        this.h = method;
                        continue;
                    case 1:
                        this.i = method;
                        continue;
                    case 2:
                        this.k = method;
                        continue;
                    case 3:
                        this.l = method;
                        continue;
                    case 4:
                        this.m = method;
                        continue;
                    case 5:
                        this.s = method;
                        continue;
                    case 6:
                        this.n = method;
                        continue;
                    case 7:
                        this.o = method;
                        continue;
                    case '\b':
                        this.t = method;
                        continue;
                    case '\t':
                        this.u = method;
                        continue;
                    case '\n':
                        this.v = method;
                        continue;
                    case 11:
                        this.w = method;
                        continue;
                    case '\f':
                        this.x = method;
                        continue;
                    case '\r':
                        this.y = method;
                        continue;
                    case 14:
                        this.z = method;
                        continue;
                    case 15:
                        this.A = method;
                        continue;
                    case 16:
                        this.B = method;
                        continue;
                    case 17:
                        this.p = method;
                        continue;
                    case 18:
                        this.j = method;
                        continue;
                    default:
                        method.getName();
                        method.getName();
                        for (Annotation annotation : method.getAnnotations()) {
                            annotation.toString();
                        }
                        continue;
                }
            }
        }
    }

    @Deprecated
    public clm(cmp cmpVar, cnfs cnfsVar, LayoutInflater.Factory factory, cnia cniaVar, int i) {
        super(cmpVar, cmpVar.a, cmpVar.b, factory, Integer.valueOf(i));
        this.g = ((Integer) b(this.s, new Object[0])).intValue();
        this.a = c();
        j();
        this.b = h(cniaVar);
        this.e = d();
        cmj k = k(cmpVar);
        this.r = k;
        i(k);
        this.c = e(cnfsVar);
        this.d = f();
        this.f = g();
    }

    public clm(cmp cmpVar, cnfs cnfsVar, LayoutInflater.Factory factory, cnia cniaVar, int i, int i2) {
        super(cmpVar, cmpVar.a, cmpVar.b, factory, Integer.valueOf(i), Integer.valueOf(i2));
        this.g = ((Integer) b(this.s, new Object[0])).intValue();
        this.a = c();
        j();
        this.b = h(cniaVar);
        this.e = d();
        cmj k = k(cmpVar);
        this.r = k;
        i(k);
        this.c = e(cnfsVar);
        this.d = f();
        this.f = g();
    }
}

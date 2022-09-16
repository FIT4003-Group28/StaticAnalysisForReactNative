package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: csk  reason: default package */
/* loaded from: classes3.dex */
public final class csk implements Handler.Callback {
    private static final csj c = new csi();
    final Map a = new HashMap();
    final Map b = new HashMap();
    private volatile cgg d;
    private final Handler e;
    private final csj f;
    private final csc g;

    public csk(csj csjVar, cfu cfuVar) {
        csc cruVar;
        new afw();
        new afw();
        new Bundle();
        this.f = csjVar == null ? c : csjVar;
        this.e = new Handler(Looper.getMainLooper(), this);
        if (!cpq.b || !cpq.a) {
            cruVar = new cru();
        } else if (cfuVar.a(cfq.class)) {
            cruVar = new cry();
        } else {
            cruVar = new csb();
        }
        this.g = cruVar;
    }

    private static Activity e(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return e(((ContextWrapper) context).getBaseContext());
    }

    private static void f(Activity activity) {
        if (!activity.isDestroyed()) {
            return;
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    private static boolean g(Context context) {
        Activity e = e(context);
        return e == null || !e.isFinishing();
    }

    public final cgg b(dt dtVar) {
        if (cvd.m()) {
            return a(dtVar.getApplicationContext());
        }
        f(dtVar);
        this.g.a(dtVar);
        eo supportFragmentManager = dtVar.getSupportFragmentManager();
        boolean g = g(dtVar);
        cso d = d(supportFragmentManager);
        cgg cggVar = d.c;
        if (cggVar == null) {
            cggVar = this.f.a(cfk.b(dtVar), d.a, d.b, dtVar);
            if (g) {
                cggVar.l();
            }
            d.c = cggVar;
        }
        return cggVar;
    }

    public final csh c(FragmentManager fragmentManager) {
        csh cshVar = (csh) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (cshVar == null) {
            csh cshVar2 = (csh) this.a.get(fragmentManager);
            if (cshVar2 != null) {
                return cshVar2;
            }
            csh cshVar3 = new csh();
            this.a.put(fragmentManager, cshVar3);
            fragmentManager.beginTransaction().add(cshVar3, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.e.obtainMessage(1, fragmentManager).sendToTarget();
            return cshVar3;
        }
        return cshVar;
    }

    public final cso d(eo eoVar) {
        cso csoVar = (cso) eoVar.f("com.bumptech.glide.manager");
        if (csoVar == null) {
            cso csoVar2 = (cso) this.b.get(eoVar);
            if (csoVar2 != null) {
                return csoVar2;
            }
            cso csoVar3 = new cso();
            this.b.put(eoVar, csoVar3);
            ex l = eoVar.l();
            l.r(csoVar3, "com.bumptech.glide.manager");
            l.k();
            this.e.obtainMessage(2, eoVar).sendToTarget();
            return csoVar3;
        }
        return csoVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object obj;
        Object remove;
        Object obj2;
        boolean z;
        int i = message.what;
        Object obj3 = null;
        if (i == 1) {
            obj = (FragmentManager) message.obj;
            remove = this.a.remove(obj);
        } else if (i != 2) {
            z = false;
            obj2 = null;
            if (z || obj3 != null || !Log.isLoggable("RMRetriever", 5)) {
                return z;
            }
            String valueOf = String.valueOf(obj2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
            sb.append("Failed to remove expected request manager fragment, manager: ");
            sb.append(valueOf);
            Log.w("RMRetriever", sb.toString());
            return true;
        } else {
            obj = (eo) message.obj;
            remove = this.b.remove(obj);
        }
        obj2 = obj;
        obj3 = remove;
        z = true;
        if (z) {
        }
        return z;
    }

    public final cgg a(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (cvd.n() && !(context instanceof Application)) {
            if (context instanceof dt) {
                return b((dt) context);
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (cvd.m()) {
                    return a(activity.getApplicationContext());
                }
                if (activity instanceof dt) {
                    return b((dt) activity);
                }
                f(activity);
                this.g.a(activity);
                FragmentManager fragmentManager = activity.getFragmentManager();
                boolean g = g(activity);
                csh c2 = c(fragmentManager);
                cgg cggVar = c2.c;
                if (cggVar != null) {
                    return cggVar;
                }
                cgg a = this.f.a(cfk.b(activity), c2.a, c2.b, activity);
                if (g) {
                    a.l();
                }
                c2.c = a;
                return a;
            } else if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return a(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    this.d = this.f.a(cfk.b(context.getApplicationContext()), new crq(), new crv(), context.getApplicationContext());
                }
            }
        }
        return this.d;
    }
}

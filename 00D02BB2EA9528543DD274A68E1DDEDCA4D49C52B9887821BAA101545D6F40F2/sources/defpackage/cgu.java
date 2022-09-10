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
/* renamed from: cgu  reason: default package */
/* loaded from: classes.dex */
public final class cgu implements Handler.Callback {
    private static final cgt f = new cgt();
    final Map<FragmentManager, cgs> a = new HashMap();
    final Map<gn, cgy> b = new HashMap();
    private volatile bsa c;
    private final Handler d;
    private final cgn e;

    public cgu(brn brnVar) {
        cgn cgfVar;
        new aif();
        new aif();
        new Bundle();
        this.d = new Handler(Looper.getMainLooper(), this);
        if (!cdr.b || !cdr.a) {
            cgfVar = new cgf();
        } else if (brnVar.a(bri.class)) {
            cgfVar = new cgj();
        } else {
            cgfVar = new cgm();
        }
        this.e = cgfVar;
    }

    private static Activity f(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return f(((ContextWrapper) context).getBaseContext());
    }

    private static void g(Activity activity) {
        if (!activity.isDestroyed()) {
            return;
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    private static boolean h(Context context) {
        Activity f2 = f(context);
        return f2 == null || !f2.isFinishing();
    }

    public final bsa b(ff ffVar) {
        if (cjp.g()) {
            return a(ffVar.getApplicationContext());
        }
        g(ffVar);
        this.e.a(ffVar);
        gn g = ffVar.g();
        boolean h = h(ffVar);
        cgy e = e(g);
        bsa bsaVar = e.c;
        if (bsaVar == null) {
            bsaVar = cgt.a(brc.a(ffVar), e.a, e.b, ffVar);
            if (h) {
                bsaVar.d();
            }
            e.c = bsaVar;
        }
        return bsaVar;
    }

    public final bsa c(Activity activity) {
        if (cjp.g()) {
            return a(activity.getApplicationContext());
        }
        if (activity instanceof ff) {
            return b((ff) activity);
        }
        g(activity);
        this.e.a(activity);
        FragmentManager fragmentManager = activity.getFragmentManager();
        boolean h = h(activity);
        cgs d = d(fragmentManager);
        bsa bsaVar = d.c;
        if (bsaVar == null) {
            bsaVar = cgt.a(brc.a(activity), d.a, d.b, activity);
            if (h) {
                bsaVar.d();
            }
            d.c = bsaVar;
        }
        return bsaVar;
    }

    public final cgs d(FragmentManager fragmentManager) {
        cgs cgsVar = (cgs) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (cgsVar == null) {
            cgs cgsVar2 = this.a.get(fragmentManager);
            if (cgsVar2 != null) {
                return cgsVar2;
            }
            cgs cgsVar3 = new cgs();
            this.a.put(fragmentManager, cgsVar3);
            fragmentManager.beginTransaction().add(cgsVar3, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.d.obtainMessage(1, fragmentManager).sendToTarget();
            return cgsVar3;
        }
        return cgsVar;
    }

    public final cgy e(gn gnVar) {
        cgy cgyVar = (cgy) gnVar.H("com.bumptech.glide.manager");
        if (cgyVar == null) {
            cgy cgyVar2 = this.b.get(gnVar);
            if (cgyVar2 != null) {
                return cgyVar2;
            }
            cgy cgyVar3 = new cgy();
            this.b.put(gnVar, cgyVar3);
            gz b = gnVar.b();
            b.y(cgyVar3, "com.bumptech.glide.manager");
            b.r();
            this.d.obtainMessage(2, gnVar).sendToTarget();
            return cgyVar3;
        }
        return cgyVar;
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
            sb.toString();
            return true;
        } else {
            obj = (gn) message.obj;
            remove = this.b.remove(obj);
        }
        obj2 = obj;
        obj3 = remove;
        z = true;
        if (z) {
        }
        return z;
    }

    public final bsa a(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (cjp.f() && !(context instanceof Application)) {
            if (context instanceof ff) {
                return b((ff) context);
            }
            if (context instanceof Activity) {
                return c((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return a(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = cgt.a(brc.a(context.getApplicationContext()), new cga(), new cgg(), context.getApplicationContext());
                }
            }
        }
        return this.c;
    }
}

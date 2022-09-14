package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import defpackage.cnnx;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cnof  reason: default package */
/* loaded from: classes.dex */
public class cnof<O extends cnnx> {
    private final cnsw a;
    public final Context b;
    public final String c;
    public final Api<O> d;
    public final O e;
    public final cnpa<O> f;
    public final Looper g;
    public final int h;
    public final GoogleApiClient i;
    protected final cnrn j;

    public cnof(Activity activity, Api<O> api, O o, cnoe cnoeVar) {
        cnwc.n(activity, "Null activity is not permitted.");
        cnwc.n(api, "Api must not be null.");
        cnwc.n(cnoeVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = activity.getApplicationContext();
        this.b = applicationContext;
        String b = b(activity);
        this.c = b;
        this.d = api;
        this.e = o;
        this.g = cnoeVar.c;
        cnpa<O> a = cnpa.a(api, o, b);
        this.f = a;
        this.i = new cnro(this);
        cnrn a2 = cnrn.a(applicationContext);
        this.j = a2;
        this.h = a2.b();
        this.a = cnoeVar.b;
        if (!(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            cnrx m = LifecycleCallback.m(new cnrw(activity));
            cnpz cnpzVar = (cnpz) m.a("ConnectionlessLifecycleHelper", cnpz.class);
            cnpzVar = cnpzVar == null ? new cnpz(m, a2) : cnpzVar;
            cnpzVar.a.add(a);
            a2.d(cnpzVar);
        }
        a2.c(this);
    }

    private final <TResult, A extends cnnq> cpcq<TResult> a(int i, cntd<A, TResult> cntdVar) {
        cpct cpctVar = new cpct();
        cnrn cnrnVar = this.j;
        cnsw cnswVar = this.a;
        cnrnVar.h(cpctVar, cntdVar.d, this);
        cnow cnowVar = new cnow(i, cntdVar, cpctVar, cnswVar);
        Handler handler = cnrnVar.n;
        handler.sendMessage(handler.obtainMessage(4, new cnsj(cnowVar, cnrnVar.j.get(), this)));
        return cpctVar.a;
    }

    private static String b(Object obj) {
        if (cnxs.c()) {
            try {
                return (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
        return null;
    }

    public final <TResult, A extends cnnq> cpcq<TResult> c(cntd<A, TResult> cntdVar) {
        return a(0, cntdVar);
    }

    public final <TResult, A extends cnnq> cpcq<TResult> d(cntd<A, TResult> cntdVar) {
        return a(1, cntdVar);
    }

    public final <TResult, A extends cnnq> cpcq<TResult> e(cntd<A, TResult> cntdVar) {
        return a(2, cntdVar);
    }

    public final <A extends cnnq> cpcq<Void> f(cnsq<A, ?> cnsqVar) {
        cnwc.n(cnsqVar.a.b(), "Listener has already been released.");
        cntj<A, ?> cntjVar = cnsqVar.b;
        cnrn cnrnVar = this.j;
        cnsk<A, ?> cnskVar = cnsqVar.a;
        Runnable runnable = cnsqVar.c;
        cpct cpctVar = new cpct();
        cnrnVar.h(cpctVar, cnskVar.c, this);
        cnov cnovVar = new cnov(new cnsl(cnskVar, cntjVar, runnable), cpctVar);
        Handler handler = cnrnVar.n;
        handler.sendMessage(handler.obtainMessage(8, new cnsj(cnovVar, cnrnVar.j.get(), this)));
        return cpctVar.a;
    }

    public final cpcq<Boolean> g(cnsb<?> cnsbVar) {
        return h(cnsbVar, 0);
    }

    public final cpcq<Boolean> h(cnsb<?> cnsbVar, int i) {
        cnrn cnrnVar = this.j;
        cpct cpctVar = new cpct();
        cnrnVar.h(cpctVar, i, this);
        cnox cnoxVar = new cnox(cnsbVar, cpctVar);
        Handler handler = cnrnVar.n;
        handler.sendMessage(handler.obtainMessage(13, new cnsj(cnoxVar, cnrnVar.j.get(), this)));
        return cpctVar.a;
    }

    public final cnuk i() {
        Set<Scope> emptySet;
        GoogleSignInAccount a;
        cnuk cnukVar = new cnuk();
        O o = this.e;
        Account account = null;
        if (!(o instanceof cnnt) || (a = ((cnnt) o).a()) == null) {
            O o2 = this.e;
            if (o2 instanceof cnns) {
                account = ((cnns) o2).a();
            }
        } else {
            String str = a.d;
            if (str != null) {
                account = new Account(str, "com.google");
            }
        }
        cnukVar.a = account;
        O o3 = this.e;
        if (o3 instanceof cnnt) {
            GoogleSignInAccount a2 = ((cnnt) o3).a();
            if (a2 == null) {
                emptySet = Collections.emptySet();
            } else {
                emptySet = a2.a();
            }
        } else {
            emptySet = Collections.emptySet();
        }
        if (cnukVar.b == null) {
            cnukVar.b = new aih<>();
        }
        cnukVar.b.addAll(emptySet);
        cnukVar.d = this.b.getClass().getName();
        cnukVar.c = this.b.getPackageName();
        return cnukVar;
    }

    public final <A extends cnnq, T extends cnpg<? extends cnom, A>> void j(int i, T t) {
        t.r();
        cnrn cnrnVar = this.j;
        cnou cnouVar = new cnou(i, t);
        Handler handler = cnrnVar.n;
        handler.sendMessage(handler.obtainMessage(4, new cnsj(cnouVar, cnrnVar.j.get(), this)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cnof(android.app.Activity r2, com.google.android.gms.common.api.Api<O> r3, defpackage.cnsw r4) {
        /*
            r1 = this;
            cnod r0 = new cnod
            r0.<init>()
            r0.c(r4)
            android.os.Looper r4 = r2.getMainLooper()
            r0.b(r4)
            cnoe r4 = r0.a()
            r0 = 0
            r1.<init>(r2, r3, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnof.<init>(android.app.Activity, com.google.android.gms.common.api.Api, cnsw):void");
    }

    public cnof(Context context, Api<O> api, O o, cnoe cnoeVar) {
        cnwc.n(context, "Null context is not permitted.");
        cnwc.n(api, "Api must not be null.");
        cnwc.n(cnoeVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        String b = b(context);
        this.c = b;
        this.d = api;
        this.e = o;
        this.g = cnoeVar.c;
        this.f = cnpa.a(api, o, b);
        this.i = new cnro(this);
        cnrn a = cnrn.a(applicationContext);
        this.j = a;
        this.h = a.b();
        this.a = cnoeVar.b;
        a.c(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cnof(android.content.Context r2, com.google.android.gms.common.api.Api<O> r3, O r4, defpackage.cnsw r5) {
        /*
            r1 = this;
            cnod r0 = new cnod
            r0.<init>()
            r0.c(r5)
            cnoe r5 = r0.a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnof.<init>(android.content.Context, com.google.android.gms.common.api.Api, cnnx, cnsw):void");
    }
}

package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: rlx  reason: default package */
/* loaded from: classes4.dex */
public final class rlx implements rml {
    private static volatile rlx z;
    private final rpa A;
    private final rkn B;
    private final rns C;
    private final riu D;
    private final rnk E;
    private Boolean F;
    private long G;
    private volatile Boolean H;
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final rjm f;
    public final rjp g;
    public final rlf h;
    public final rks i;
    public final rlu j;
    public final rps k;
    public final rng l;
    public final String m;
    public rkm n;
    public rom o;
    public rjw p;
    public rkk q;
    protected Boolean s;
    protected Boolean t;
    public volatile boolean u;
    public int v;
    final long x;
    public final qyh y;
    public boolean r = false;
    public final AtomicInteger w = new AtomicInteger(0);

    public rlx(rmp rmpVar) {
        long currentTimeMillis;
        Bundle bundle;
        boolean z2 = false;
        rjm rjmVar = new rjm();
        this.f = rjmVar;
        rqt.a = rjmVar;
        Context context = rmpVar.a;
        this.a = context;
        this.b = rmpVar.b;
        this.c = rmpVar.c;
        this.d = rmpVar.d;
        this.e = rmpVar.h;
        this.H = rmpVar.e;
        this.m = rmpVar.j;
        this.u = true;
        InitializationParams initializationParams = rmpVar.g;
        if (initializationParams != null && (bundle = initializationParams.g) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.s = (Boolean) obj;
            }
            Object obj2 = initializationParams.g.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.t = (Boolean) obj2;
            }
        }
        vbt.e(context);
        this.y = qyh.a;
        Long l = rmpVar.i;
        if (l == null) {
            currentTimeMillis = System.currentTimeMillis();
        } else {
            currentTimeMillis = l.longValue();
        }
        this.x = currentTimeMillis;
        this.g = new rjp(this);
        rlf rlfVar = new rlf(this);
        rlfVar.k();
        this.h = rlfVar;
        rks rksVar = new rks(this);
        rksVar.k();
        this.i = rksVar;
        rps rpsVar = new rps(this);
        rpsVar.k();
        this.k = rpsVar;
        rkn rknVar = new rkn(this);
        rknVar.k();
        this.B = rknVar;
        this.D = new riu(this);
        rns rnsVar = new rns(this);
        rnsVar.b();
        this.C = rnsVar;
        rng rngVar = new rng(this);
        rngVar.b();
        this.l = rngVar;
        rpa rpaVar = new rpa(this);
        rpaVar.b();
        this.A = rpaVar;
        rnk rnkVar = new rnk(this);
        rnkVar.k();
        this.E = rnkVar;
        rlu rluVar = new rlu(this);
        rluVar.k();
        this.j = rluVar;
        InitializationParams initializationParams2 = rmpVar.g;
        z2 = (initializationParams2 == null || initializationParams2.b == 0) ? true : z2;
        if (context.getApplicationContext() instanceof Application) {
            rng l2 = l();
            if (l2.I().getApplicationContext() instanceof Application) {
                Application application = (Application) l2.I().getApplicationContext();
                if (l2.b == null) {
                    l2.b = new rnf(l2);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(l2.b);
                    application.registerActivityLifecycleCallbacks(l2.b);
                    l2.aG().k.a("Registered activity lifecycle callback");
                }
            }
        } else {
            aG().f.a("Application context is not an Application");
        }
        rluVar.g(new rlw(this, rmpVar));
    }

    public static final void A(rmk rmkVar) {
        if (rmkVar != null) {
            if (rmkVar.m()) {
                return;
            }
            String valueOf = String.valueOf(rmkVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
        throw new IllegalStateException("Component not created");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void B() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void C(rmj rmjVar) {
        if (rmjVar != null) {
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    private static final void D(riw riwVar) {
        if (riwVar != null) {
            if (riwVar.c()) {
                return;
            }
            String valueOf = String.valueOf(riwVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
        throw new IllegalStateException("Component not created");
    }

    public static rlx j(Context context) {
        return k(context, null, null);
    }

    public static rlx k(Context context, InitializationParams initializationParams, Long l) {
        Bundle bundle;
        if (initializationParams != null && (initializationParams.e == null || initializationParams.f == null)) {
            initializationParams = new InitializationParams(initializationParams.a, initializationParams.b, initializationParams.c, initializationParams.d, null, null, initializationParams.g, null);
        }
        qnm.b(context);
        qnm.b(context.getApplicationContext());
        if (z == null) {
            synchronized (rlx.class) {
                if (z == null) {
                    z = new rlx(new rmp(context, initializationParams, l));
                }
            }
        } else if (initializationParams != null && (bundle = initializationParams.g) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            qnm.b(z);
            z.u(initializationParams.g.getBoolean("dataCollectionDefaultEnabled"));
        }
        qnm.b(z);
        return z;
    }

    public final int a() {
        r();
        if (this.g.s()) {
            return 1;
        }
        Boolean bool = this.t;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (!x()) {
            return 8;
        }
        Boolean c = h().c();
        if (c != null) {
            return c.booleanValue() ? 0 : 3;
        }
        rjp rjpVar = this.g;
        rjpVar.P();
        Boolean j = rjpVar.j("firebase_analytics_collection_enabled");
        if (j != null) {
            return j.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.s;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (!this.g.o(rkg.T) || this.H == null || this.H.booleanValue()) ? 0 : 7;
    }

    @Override // defpackage.rml
    public final rks aG() {
        A(this.i);
        return this.i;
    }

    @Override // defpackage.rml
    public final rlu aH() {
        A(this.j);
        return this.j;
    }

    public final riu b() {
        riu riuVar = this.D;
        if (riuVar != null) {
            return riuVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final rjw c() {
        A(this.p);
        return this.p;
    }

    public final rkk d() {
        D(this.q);
        return this.q;
    }

    public final rkm e() {
        D(this.n);
        return this.n;
    }

    public final rkn f() {
        C(this.B);
        return this.B;
    }

    public final rlf h() {
        C(this.h);
        return this.h;
    }

    public final rng l() {
        D(this.l);
        return this.l;
    }

    public final rnk m() {
        A(this.E);
        return this.E;
    }

    public final rns n() {
        D(this.C);
        return this.C;
    }

    public final rom o() {
        D(this.o);
        return this.o;
    }

    public final rpa p() {
        D(this.A);
        return this.A;
    }

    public final rps q() {
        C(this.k);
        return this.k;
    }

    public final void r() {
        aH().n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s() {
        this.w.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t() {
        this.v++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u(boolean z2) {
        this.H = Boolean.valueOf(z2);
    }

    public final boolean v() {
        return this.H != null && this.H.booleanValue();
    }

    public final boolean w() {
        return a() == 0;
    }

    public final boolean x() {
        r();
        return this.u;
    }

    public final boolean y() {
        return TextUtils.isEmpty(this.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean z() {
        if (this.r) {
            r();
            Boolean bool = this.F;
            if (bool == null || this.G == 0 || (!bool.booleanValue() && Math.abs(SystemClock.elapsedRealtime() - this.G) > 1000)) {
                this.G = SystemClock.elapsedRealtime();
                boolean z2 = true;
                Boolean valueOf = Boolean.valueOf(q().ai("android.permission.INTERNET") && q().ai("android.permission.ACCESS_NETWORK_STATE") && (qyr.b(this.a).e() || this.g.t() || (rps.ap(this.a) && rps.az(this.a))));
                this.F = valueOf;
                if (valueOf.booleanValue()) {
                    if (!q().ab(d().r(), d().o(), d().q()) && TextUtils.isEmpty(d().o())) {
                        z2 = false;
                    }
                    this.F = Boolean.valueOf(z2);
                }
            }
            return this.F.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }
}

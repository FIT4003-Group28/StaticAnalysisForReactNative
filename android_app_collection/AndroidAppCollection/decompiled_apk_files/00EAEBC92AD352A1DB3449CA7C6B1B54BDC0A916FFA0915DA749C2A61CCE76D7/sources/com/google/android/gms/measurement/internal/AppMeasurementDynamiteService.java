package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import c.e.a.b.d.g.hb;
import c.e.a.b.d.g.ld;
import c.e.a.b.d.g.nd;
import com.google.android.gms.common.util.DynamiteApi;
import java.util.Map;
@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends ld {

    /* renamed from: a  reason: collision with root package name */
    d5 f7147a = null;

    /* renamed from: b  reason: collision with root package name */
    private Map<Integer, h6> f7148b = new a.e.a();

    /* loaded from: classes.dex */
    class a implements h6 {

        /* renamed from: a  reason: collision with root package name */
        private c.e.a.b.d.g.c f7149a;

        a(c.e.a.b.d.g.c cVar) {
            this.f7149a = cVar;
        }

        @Override // com.google.android.gms.measurement.internal.h6
        public final void a(String str, String str2, Bundle bundle, long j) {
            try {
                this.f7149a.a(str, str2, bundle, j);
            } catch (RemoteException e2) {
                AppMeasurementDynamiteService.this.f7147a.c().v().a("Event listener threw exception", e2);
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements i6 {

        /* renamed from: a  reason: collision with root package name */
        private c.e.a.b.d.g.c f7151a;

        b(c.e.a.b.d.g.c cVar) {
            this.f7151a = cVar;
        }

        @Override // com.google.android.gms.measurement.internal.i6
        public final void a(String str, String str2, Bundle bundle, long j) {
            try {
                this.f7151a.a(str, str2, bundle, j);
            } catch (RemoteException e2) {
                AppMeasurementDynamiteService.this.f7147a.c().v().a("Event interceptor threw exception", e2);
            }
        }
    }

    private final void a(nd ndVar, String str) {
        this.f7147a.u().a(ndVar, str);
    }

    private final void f() {
        if (this.f7147a != null) {
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    @Override // c.e.a.b.d.g.md
    public void beginAdUnitExposure(String str, long j) {
        f();
        this.f7147a.H().a(str, j);
    }

    @Override // c.e.a.b.d.g.md
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        f();
        this.f7147a.t().c(str, str2, bundle);
    }

    @Override // c.e.a.b.d.g.md
    public void endAdUnitExposure(String str, long j) {
        f();
        this.f7147a.H().b(str, j);
    }

    @Override // c.e.a.b.d.g.md
    public void generateEventId(nd ndVar) {
        f();
        this.f7147a.u().a(ndVar, this.f7147a.u().s());
    }

    @Override // c.e.a.b.d.g.md
    public void getAppInstanceId(nd ndVar) {
        f();
        this.f7147a.a().a(new g6(this, ndVar));
    }

    @Override // c.e.a.b.d.g.md
    public void getCachedAppInstanceId(nd ndVar) {
        f();
        a(ndVar, this.f7147a.t().H());
    }

    @Override // c.e.a.b.d.g.md
    public void getConditionalUserProperties(String str, String str2, nd ndVar) {
        f();
        this.f7147a.a().a(new da(this, ndVar, str, str2));
    }

    @Override // c.e.a.b.d.g.md
    public void getCurrentScreenClass(nd ndVar) {
        f();
        a(ndVar, this.f7147a.t().K());
    }

    @Override // c.e.a.b.d.g.md
    public void getCurrentScreenName(nd ndVar) {
        f();
        a(ndVar, this.f7147a.t().J());
    }

    @Override // c.e.a.b.d.g.md
    public void getGmpAppId(nd ndVar) {
        f();
        a(ndVar, this.f7147a.t().L());
    }

    @Override // c.e.a.b.d.g.md
    public void getMaxUserProperties(String str, nd ndVar) {
        f();
        this.f7147a.t();
        com.google.android.gms.common.internal.s.b(str);
        this.f7147a.u().a(ndVar, 25);
    }

    @Override // c.e.a.b.d.g.md
    public void getTestFlag(nd ndVar, int i) {
        f();
        if (i == 0) {
            this.f7147a.u().a(ndVar, this.f7147a.t().D());
        } else if (i == 1) {
            this.f7147a.u().a(ndVar, this.f7147a.t().E().longValue());
        } else if (i != 2) {
            if (i == 3) {
                this.f7147a.u().a(ndVar, this.f7147a.t().F().intValue());
            } else if (i != 4) {
            } else {
                this.f7147a.u().a(ndVar, this.f7147a.t().C().booleanValue());
            }
        } else {
            z9 u = this.f7147a.u();
            double doubleValue = this.f7147a.t().G().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                ndVar.a(bundle);
            } catch (RemoteException e2) {
                u.f7802a.c().v().a("Error returning double value to wrapper", e2);
            }
        }
    }

    @Override // c.e.a.b.d.g.md
    public void getUserProperties(String str, String str2, boolean z, nd ndVar) {
        f();
        this.f7147a.a().a(new g7(this, ndVar, str, str2, z));
    }

    @Override // c.e.a.b.d.g.md
    public void initForTests(Map map) {
        f();
    }

    @Override // c.e.a.b.d.g.md
    public void initialize(c.e.a.b.c.a aVar, c.e.a.b.d.g.f fVar, long j) {
        Context context = (Context) c.e.a.b.c.b.a(aVar);
        d5 d5Var = this.f7147a;
        if (d5Var == null) {
            this.f7147a = d5.a(context, fVar, Long.valueOf(j));
        } else {
            d5Var.c().v().a("Attempting to initialize multiple times");
        }
    }

    @Override // c.e.a.b.d.g.md
    public void isDataCollectionEnabled(nd ndVar) {
        f();
        this.f7147a.a().a(new h9(this, ndVar));
    }

    @Override // c.e.a.b.d.g.md
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        f();
        this.f7147a.t().a(str, str2, bundle, z, z2, j);
    }

    @Override // c.e.a.b.d.g.md
    public void logEventAndBundle(String str, String str2, Bundle bundle, nd ndVar, long j) {
        f();
        com.google.android.gms.common.internal.s.b(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f7147a.a().a(new g8(this, ndVar, new p(str2, new o(bundle), "app", j), str));
    }

    @Override // c.e.a.b.d.g.md
    public void logHealthData(int i, String str, c.e.a.b.c.a aVar, c.e.a.b.c.a aVar2, c.e.a.b.c.a aVar3) {
        f();
        Object obj = null;
        Object a2 = aVar == null ? null : c.e.a.b.c.b.a(aVar);
        Object a3 = aVar2 == null ? null : c.e.a.b.c.b.a(aVar2);
        if (aVar3 != null) {
            obj = c.e.a.b.c.b.a(aVar3);
        }
        this.f7147a.c().a(i, true, false, str, a2, a3, obj);
    }

    @Override // c.e.a.b.d.g.md
    public void onActivityCreated(c.e.a.b.c.a aVar, Bundle bundle, long j) {
        f();
        e7 e7Var = this.f7147a.t().f7393c;
        if (e7Var != null) {
            this.f7147a.t().B();
            e7Var.onActivityCreated((Activity) c.e.a.b.c.b.a(aVar), bundle);
        }
    }

    @Override // c.e.a.b.d.g.md
    public void onActivityDestroyed(c.e.a.b.c.a aVar, long j) {
        f();
        e7 e7Var = this.f7147a.t().f7393c;
        if (e7Var != null) {
            this.f7147a.t().B();
            e7Var.onActivityDestroyed((Activity) c.e.a.b.c.b.a(aVar));
        }
    }

    @Override // c.e.a.b.d.g.md
    public void onActivityPaused(c.e.a.b.c.a aVar, long j) {
        f();
        e7 e7Var = this.f7147a.t().f7393c;
        if (e7Var != null) {
            this.f7147a.t().B();
            e7Var.onActivityPaused((Activity) c.e.a.b.c.b.a(aVar));
        }
    }

    @Override // c.e.a.b.d.g.md
    public void onActivityResumed(c.e.a.b.c.a aVar, long j) {
        f();
        e7 e7Var = this.f7147a.t().f7393c;
        if (e7Var != null) {
            this.f7147a.t().B();
            e7Var.onActivityResumed((Activity) c.e.a.b.c.b.a(aVar));
        }
    }

    @Override // c.e.a.b.d.g.md
    public void onActivitySaveInstanceState(c.e.a.b.c.a aVar, nd ndVar, long j) {
        f();
        e7 e7Var = this.f7147a.t().f7393c;
        Bundle bundle = new Bundle();
        if (e7Var != null) {
            this.f7147a.t().B();
            e7Var.onActivitySaveInstanceState((Activity) c.e.a.b.c.b.a(aVar), bundle);
        }
        try {
            ndVar.a(bundle);
        } catch (RemoteException e2) {
            this.f7147a.c().v().a("Error returning bundle value to wrapper", e2);
        }
    }

    @Override // c.e.a.b.d.g.md
    public void onActivityStarted(c.e.a.b.c.a aVar, long j) {
        f();
        e7 e7Var = this.f7147a.t().f7393c;
        if (e7Var != null) {
            this.f7147a.t().B();
            e7Var.onActivityStarted((Activity) c.e.a.b.c.b.a(aVar));
        }
    }

    @Override // c.e.a.b.d.g.md
    public void onActivityStopped(c.e.a.b.c.a aVar, long j) {
        f();
        e7 e7Var = this.f7147a.t().f7393c;
        if (e7Var != null) {
            this.f7147a.t().B();
            e7Var.onActivityStopped((Activity) c.e.a.b.c.b.a(aVar));
        }
    }

    @Override // c.e.a.b.d.g.md
    public void performAction(Bundle bundle, nd ndVar, long j) {
        f();
        ndVar.a(null);
    }

    @Override // c.e.a.b.d.g.md
    public void registerOnMeasurementEventListener(c.e.a.b.d.g.c cVar) {
        f();
        h6 h6Var = this.f7148b.get(Integer.valueOf(cVar.f()));
        if (h6Var == null) {
            h6Var = new a(cVar);
            this.f7148b.put(Integer.valueOf(cVar.f()), h6Var);
        }
        this.f7147a.t().a(h6Var);
    }

    @Override // c.e.a.b.d.g.md
    public void resetAnalyticsData(long j) {
        f();
        j6 t = this.f7147a.t();
        t.a((String) null);
        t.a().a(new r6(t, j));
    }

    @Override // c.e.a.b.d.g.md
    public void setConditionalUserProperty(Bundle bundle, long j) {
        f();
        if (bundle == null) {
            this.f7147a.c().s().a("Conditional user property must not be null");
        } else {
            this.f7147a.t().a(bundle, j);
        }
    }

    @Override // c.e.a.b.d.g.md
    public void setCurrentScreen(c.e.a.b.c.a aVar, String str, String str2, long j) {
        f();
        this.f7147a.D().a((Activity) c.e.a.b.c.b.a(aVar), str, str2);
    }

    @Override // c.e.a.b.d.g.md
    public void setDataCollectionEnabled(boolean z) {
        f();
        j6 t = this.f7147a.t();
        t.x();
        t.e();
        t.a().a(new d7(t, z));
    }

    @Override // c.e.a.b.d.g.md
    public void setDefaultEventParameters(Bundle bundle) {
        f();
        final j6 t = this.f7147a.t();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        t.a().a(new Runnable(t, bundle2) { // from class: com.google.android.gms.measurement.internal.m6

            /* renamed from: b  reason: collision with root package name */
            private final j6 f7494b;

            /* renamed from: c  reason: collision with root package name */
            private final Bundle f7495c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f7494b = t;
                this.f7495c = bundle2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                j6 j6Var = this.f7494b;
                Bundle bundle3 = this.f7495c;
                if (!hb.a() || !j6Var.l().a(r.N0)) {
                    return;
                }
                if (bundle3 == null) {
                    j6Var.k().C.a(new Bundle());
                    return;
                }
                Bundle a2 = j6Var.k().C.a();
                for (String str : bundle3.keySet()) {
                    Object obj = bundle3.get(str);
                    if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                        j6Var.j();
                        if (z9.a(obj)) {
                            j6Var.j().a(27, (String) null, (String) null, 0);
                        }
                        j6Var.c().y().a("Invalid default event parameter type. Name, value", str, obj);
                    } else if (z9.f(str)) {
                        j6Var.c().y().a("Invalid default event parameter name. Name", str);
                    } else if (obj == null) {
                        a2.remove(str);
                    } else if (j6Var.j().a("param", str, 100, obj)) {
                        j6Var.j().a(a2, str, obj);
                    }
                }
                j6Var.j();
                if (z9.a(a2, j6Var.l().m())) {
                    j6Var.j().a(26, (String) null, (String) null, 0);
                    j6Var.c().y().a("Too many default event parameters set. Discarding beyond event parameter limit");
                }
                j6Var.k().C.a(a2);
                j6Var.q().a(a2);
            }
        });
    }

    @Override // c.e.a.b.d.g.md
    public void setEventInterceptor(c.e.a.b.d.g.c cVar) {
        f();
        j6 t = this.f7147a.t();
        b bVar = new b(cVar);
        t.e();
        t.x();
        t.a().a(new t6(t, bVar));
    }

    @Override // c.e.a.b.d.g.md
    public void setInstanceIdProvider(c.e.a.b.d.g.d dVar) {
        f();
    }

    @Override // c.e.a.b.d.g.md
    public void setMeasurementEnabled(boolean z, long j) {
        f();
        this.f7147a.t().a(z);
    }

    @Override // c.e.a.b.d.g.md
    public void setMinimumSessionDuration(long j) {
        f();
        j6 t = this.f7147a.t();
        t.e();
        t.a().a(new f7(t, j));
    }

    @Override // c.e.a.b.d.g.md
    public void setSessionTimeoutDuration(long j) {
        f();
        j6 t = this.f7147a.t();
        t.e();
        t.a().a(new n6(t, j));
    }

    @Override // c.e.a.b.d.g.md
    public void setUserId(String str, long j) {
        f();
        this.f7147a.t().a(null, "_id", str, true, j);
    }

    @Override // c.e.a.b.d.g.md
    public void setUserProperty(String str, String str2, c.e.a.b.c.a aVar, boolean z, long j) {
        f();
        this.f7147a.t().a(str, str2, c.e.a.b.c.b.a(aVar), z, j);
    }

    @Override // c.e.a.b.d.g.md
    public void unregisterOnMeasurementEventListener(c.e.a.b.d.g.c cVar) {
        f();
        h6 remove = this.f7148b.remove(Integer.valueOf(cVar.f()));
        if (remove == null) {
            remove = new a(cVar);
        }
        this.f7147a.t().b(remove);
    }
}

package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AppMeasurementDynamiteService extends rhf {
    public rlx a = null;
    private final Map b = new afw();

    private final void a() {
        if (this.a != null) {
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    private final void b(rhj rhjVar, String str) {
        a();
        this.a.q().Z(rhjVar, str);
    }

    @Override // defpackage.rhg
    public void beginAdUnitExposure(String str, long j) {
        a();
        this.a.b().a(str, j);
    }

    @Override // defpackage.rhg
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        a();
        this.a.l().q(str, str2, bundle);
    }

    @Override // defpackage.rhg
    public void clearMeasurementEnabled(long j) {
        a();
        this.a.l().G(null);
    }

    @Override // defpackage.rhg
    public void endAdUnitExposure(String str, long j) {
        a();
        this.a.b().b(str, j);
    }

    @Override // defpackage.rhg
    public void generateEventId(rhj rhjVar) {
        a();
        long r = this.a.q().r();
        a();
        this.a.q().Y(rhjVar, r);
    }

    @Override // defpackage.rhg
    public void getAppInstanceId(rhj rhjVar) {
        a();
        this.a.aH().g(new rjc(this, rhjVar, 1));
    }

    @Override // defpackage.rhg
    public void getCachedAppInstanceId(rhj rhjVar) {
        a();
        b(rhjVar, this.a.l().e());
    }

    @Override // defpackage.rhg
    public void getConditionalUserProperties(String str, String str2, rhj rhjVar) {
        a();
        this.a.aH().g(new rjb(this, rhjVar, str, str2));
    }

    @Override // defpackage.rhg
    public void getCurrentScreenClass(rhj rhjVar) {
        a();
        b(rhjVar, this.a.l().f());
    }

    @Override // defpackage.rhg
    public void getCurrentScreenName(rhj rhjVar) {
        a();
        b(rhjVar, this.a.l().o());
    }

    @Override // defpackage.rhg
    public void getGmpAppId(rhj rhjVar) {
        a();
        rng l = this.a.l();
        String str = l.w.b;
        if (str == null) {
            try {
                str = rgf.p(l.I(), l.w.m);
            } catch (IllegalStateException e) {
                l.w.aG().c.b("getGoogleAppId failed with exception", e);
                str = null;
            }
        }
        b(rhjVar, str);
    }

    @Override // defpackage.rhg
    public void getMaxUserProperties(String str, rhj rhjVar) {
        a();
        this.a.l().W(str);
        a();
        this.a.q().X(rhjVar, 25);
    }

    @Override // defpackage.rhg
    public void getTestFlag(rhj rhjVar, int i) {
        a();
        if (i == 0) {
            rps q = this.a.q();
            rng l = this.a.l();
            AtomicReference atomicReference = new AtomicReference();
            q.Z(rhjVar, (String) l.aH().a(atomicReference, 15000L, "String test flag value", new rna(l, atomicReference)));
        } else if (i == 1) {
            rps q2 = this.a.q();
            rng l2 = this.a.l();
            AtomicReference atomicReference2 = new AtomicReference();
            q2.Y(rhjVar, ((Long) l2.aH().a(atomicReference2, 15000L, "long test flag value", new rna(l2, atomicReference2, 2))).longValue());
        } else if (i == 2) {
            rps q3 = this.a.q();
            rng l3 = this.a.l();
            AtomicReference atomicReference3 = new AtomicReference();
            double doubleValue = ((Double) l3.aH().a(atomicReference3, 15000L, "double test flag value", new rna(l3, atomicReference3, 4))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                rhjVar.a(bundle);
            } catch (RemoteException e) {
                q3.w.aG().f.b("Error returning double value to wrapper", e);
            }
        } else if (i == 3) {
            rps q4 = this.a.q();
            rng l4 = this.a.l();
            AtomicReference atomicReference4 = new AtomicReference();
            q4.X(rhjVar, ((Integer) l4.aH().a(atomicReference4, 15000L, "int test flag value", new rna(l4, atomicReference4, 3))).intValue());
        } else if (i != 4) {
        } else {
            rps q5 = this.a.q();
            rng l5 = this.a.l();
            AtomicReference atomicReference5 = new AtomicReference();
            q5.T(rhjVar, ((Boolean) l5.aH().a(atomicReference5, 15000L, "boolean test flag value", new rna(l5, atomicReference5, 1))).booleanValue());
        }
    }

    @Override // defpackage.rhg
    public void getUserProperties(String str, String str2, boolean z, rhj rhjVar) {
        a();
        this.a.aH().g(new riz(this, rhjVar, str, str2, z));
    }

    @Override // defpackage.rhg
    public void initForTests(Map map) {
        a();
    }

    @Override // defpackage.rhg
    public void initialize(rad radVar, InitializationParams initializationParams, long j) {
        rlx rlxVar = this.a;
        if (rlxVar == null) {
            Context context = (Context) rac.b(radVar);
            qnm.b(context);
            this.a = rlx.k(context, initializationParams, Long.valueOf(j));
            return;
        }
        rlxVar.aG().f.a("Attempting to initialize multiple times");
    }

    @Override // defpackage.rhg
    public void isDataCollectionEnabled(rhj rhjVar) {
        a();
        this.a.aH().g(new rjc(this, rhjVar));
    }

    @Override // defpackage.rhg
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        a();
        this.a.l().t(str, str2, bundle, z, z2, j);
    }

    @Override // defpackage.rhg
    public void logEventAndBundle(String str, String str2, Bundle bundle, rhj rhjVar, long j) {
        a();
        qnm.l(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.a.aH().g(new riy(this, rhjVar, new EventParcel(str2, new EventParams(bundle), "app", j), str));
    }

    @Override // defpackage.rhg
    public void logHealthData(int i, String str, rad radVar, rad radVar2, rad radVar3) {
        a();
        Object obj = null;
        Object b = radVar == null ? null : rac.b(radVar);
        Object b2 = radVar2 == null ? null : rac.b(radVar2);
        if (radVar3 != null) {
            obj = rac.b(radVar3);
        }
        this.a.aG().e(i, true, false, str, b, b2, obj);
    }

    @Override // defpackage.rhg
    public void onActivityCreated(rad radVar, Bundle bundle, long j) {
        a();
        rnf rnfVar = this.a.l().b;
        if (rnfVar != null) {
            this.a.l().r();
            rnfVar.onActivityCreated((Activity) rac.b(radVar), bundle);
        }
    }

    @Override // defpackage.rhg
    public void onActivityDestroyed(rad radVar, long j) {
        a();
        rnf rnfVar = this.a.l().b;
        if (rnfVar != null) {
            this.a.l().r();
            rnfVar.onActivityDestroyed((Activity) rac.b(radVar));
        }
    }

    @Override // defpackage.rhg
    public void onActivityPaused(rad radVar, long j) {
        a();
        rnf rnfVar = this.a.l().b;
        if (rnfVar != null) {
            this.a.l().r();
            rnfVar.onActivityPaused((Activity) rac.b(radVar));
        }
    }

    @Override // defpackage.rhg
    public void onActivityResumed(rad radVar, long j) {
        a();
        rnf rnfVar = this.a.l().b;
        if (rnfVar != null) {
            this.a.l().r();
            rnfVar.onActivityResumed((Activity) rac.b(radVar));
        }
    }

    @Override // defpackage.rhg
    public void onActivitySaveInstanceState(rad radVar, rhj rhjVar, long j) {
        a();
        rnf rnfVar = this.a.l().b;
        Bundle bundle = new Bundle();
        if (rnfVar != null) {
            this.a.l().r();
            rnfVar.onActivitySaveInstanceState((Activity) rac.b(radVar), bundle);
        }
        try {
            rhjVar.a(bundle);
        } catch (RemoteException e) {
            this.a.aG().f.b("Error returning bundle value to wrapper", e);
        }
    }

    @Override // defpackage.rhg
    public void onActivityStarted(rad radVar, long j) {
        a();
        if (this.a.l().b != null) {
            this.a.l().r();
            Activity activity = (Activity) rac.b(radVar);
        }
    }

    @Override // defpackage.rhg
    public void onActivityStopped(rad radVar, long j) {
        a();
        if (this.a.l().b != null) {
            this.a.l().r();
            Activity activity = (Activity) rac.b(radVar);
        }
    }

    @Override // defpackage.rhg
    public void performAction(Bundle bundle, rhj rhjVar, long j) {
        a();
        rhjVar.a(null);
    }

    @Override // defpackage.rhg
    public void registerOnMeasurementEventListener(rhl rhlVar) {
        rje rjeVar;
        a();
        synchronized (this.b) {
            rjeVar = (rje) this.b.get(Integer.valueOf(rhlVar.a()));
            if (rjeVar == null) {
                rjeVar = new rje(this, rhlVar);
                this.b.put(Integer.valueOf(rhlVar.a()), rjeVar);
            }
        }
        rng l = this.a.l();
        l.a();
        if (!l.c.add(rjeVar)) {
            l.aG().f.a("OnEventListener already registered");
        }
    }

    @Override // defpackage.rhg
    public void resetAnalyticsData(long j) {
        a();
        rng l = this.a.l();
        l.A(null);
        l.aH().g(new rmv(l, j));
    }

    @Override // defpackage.rhg
    public void setConditionalUserProperty(Bundle bundle, long j) {
        a();
        if (bundle == null) {
            this.a.aG().c.a("Conditional user property must not be null");
        } else {
            this.a.l().B(bundle, j);
        }
    }

    @Override // defpackage.rhg
    public void setConsent(final Bundle bundle, final long j) {
        a();
        final rng l = this.a.l();
        axsq.b();
        if (l.J().o(rkg.at)) {
            l.aH().h(new Runnable() { // from class: rmq
                @Override // java.lang.Runnable
                public final void run() {
                    rng.this.E(bundle, j);
                }
            });
        } else {
            l.E(bundle, j);
        }
    }

    @Override // defpackage.rhg
    public void setConsentThirdParty(Bundle bundle, long j) {
        a();
        this.a.l().C(bundle, -20, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
        if (r0 <= 100) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
        if (r0 <= 100) goto L36;
     */
    @Override // defpackage.rhg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setCurrentScreen(defpackage.rad r3, java.lang.String r4, java.lang.String r5, long r6) {
        /*
            r2 = this;
            r2.a()
            rlx r6 = r2.a
            rns r6 = r6.n()
            java.lang.Object r3 = defpackage.rac.b(r3)
            android.app.Activity r3 = (android.app.Activity) r3
            rjp r7 = r6.J()
            boolean r7 = r7.r()
            if (r7 != 0) goto L25
            rks r3 = r6.aG()
            rkq r3 = r3.h
            java.lang.String r4 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r3.a(r4)
            return
        L25:
            rnm r7 = r6.b
            if (r7 != 0) goto L35
            rks r3 = r6.aG()
            rkq r3 = r3.h
            java.lang.String r4 = "setCurrentScreen cannot be called while no activity active"
            r3.a(r4)
            return
        L35:
            java.util.Map r0 = r6.e
            java.lang.Object r0 = r0.get(r3)
            if (r0 != 0) goto L49
            rks r3 = r6.aG()
            rkq r3 = r3.h
            java.lang.String r4 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r3.a(r4)
            return
        L49:
            if (r5 != 0) goto L53
            java.lang.Class r5 = r3.getClass()
            java.lang.String r5 = r6.u(r5)
        L53:
            java.lang.String r0 = r7.b
            boolean r0 = defpackage.rps.aq(r0, r5)
            java.lang.String r7 = r7.a
            boolean r7 = defpackage.rps.aq(r7, r4)
            if (r0 == 0) goto L70
            if (r7 != 0) goto L64
            goto L70
        L64:
            rks r3 = r6.aG()
            rkq r3 = r3.h
            java.lang.String r4 = "setCurrentScreen cannot be called with the same class and name"
            r3.a(r4)
            return
        L70:
            r7 = 100
            if (r4 == 0) goto L98
            int r0 = r4.length()
            if (r0 <= 0) goto L84
            int r0 = r4.length()
            r6.J()
            if (r0 > r7) goto L84
            goto L98
        L84:
            rks r3 = r6.aG()
            rkq r3 = r3.h
            int r4 = r4.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Invalid screen name length in setCurrentScreen. Length"
            r3.b(r5, r4)
            return
        L98:
            if (r5 == 0) goto Lbe
            int r0 = r5.length()
            if (r0 <= 0) goto Laa
            int r0 = r5.length()
            r6.J()
            if (r0 > r7) goto Laa
            goto Lbe
        Laa:
            rks r3 = r6.aG()
            rkq r3 = r3.h
            int r4 = r5.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Invalid class name length in setCurrentScreen. Length"
            r3.b(r5, r4)
            return
        Lbe:
            rks r7 = r6.aG()
            rkq r7 = r7.k
            if (r4 != 0) goto Lc9
            java.lang.String r0 = "null"
            goto Lca
        Lc9:
            r0 = r4
        Lca:
            java.lang.String r1 = "Setting current screen to name, class"
            r7.c(r1, r0, r5)
            rnm r7 = new rnm
            rps r0 = r6.N()
            long r0 = r0.r()
            r7.<init>(r4, r5, r0)
            java.util.Map r4 = r6.e
            r4.put(r3, r7)
            r4 = 1
            r6.p(r3, r7, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreen(rad, java.lang.String, java.lang.String, long):void");
    }

    @Override // defpackage.rhg
    public void setDataCollectionEnabled(boolean z) {
        a();
        rng l = this.a.l();
        l.a();
        l.aH().g(new rmr(l, z));
    }

    @Override // defpackage.rhg
    public void setDefaultEventParameters(Bundle bundle) {
        a();
        rng l = this.a.l();
        l.aH().g(new rmw(l, bundle == null ? null : new Bundle(bundle), 1));
    }

    @Override // defpackage.rhg
    public void setEventInterceptor(rhl rhlVar) {
        a();
        rjd rjdVar = new rjd(this, rhlVar);
        if (this.a.aH().i()) {
            this.a.l().V(rjdVar);
        } else {
            this.a.aH().g(new rja(this, rjdVar));
        }
    }

    @Override // defpackage.rhg
    public void setInstanceIdProvider(rhn rhnVar) {
        a();
    }

    @Override // defpackage.rhg
    public void setMeasurementEnabled(boolean z, long j) {
        a();
        this.a.l().G(Boolean.valueOf(z));
    }

    @Override // defpackage.rhg
    public void setMinimumSessionDuration(long j) {
        a();
    }

    @Override // defpackage.rhg
    public void setSessionTimeoutDuration(long j) {
        a();
        rng l = this.a.l();
        l.aH().g(new rmv(l, j, 1));
    }

    @Override // defpackage.rhg
    public void setUserId(String str, long j) {
        a();
        if (!this.a.g.o(rkg.aq) || str == null || str.length() != 0) {
            this.a.l().S(null, "_id", str, true, j);
        } else {
            this.a.aG().f.a("User ID must be non-empty");
        }
    }

    @Override // defpackage.rhg
    public void setUserProperty(String str, String str2, rad radVar, boolean z, long j) {
        a();
        this.a.l().S(str, str2, rac.b(radVar), z, j);
    }

    @Override // defpackage.rhg
    public void unregisterOnMeasurementEventListener(rhl rhlVar) {
        rje rjeVar;
        a();
        synchronized (this.b) {
            rjeVar = (rje) this.b.remove(Integer.valueOf(rhlVar.a()));
        }
        if (rjeVar == null) {
            rjeVar = new rje(this, rhlVar);
        }
        rng l = this.a.l();
        l.a();
        if (!l.c.remove(rjeVar)) {
            l.aG().f.a("OnEventListener had not been registered");
        }
    }
}

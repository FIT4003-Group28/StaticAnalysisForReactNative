package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import c.e.a.b.d.g.nd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class y7 extends f5 {

    /* renamed from: c  reason: collision with root package name */
    private final p8 f7805c;

    /* renamed from: d  reason: collision with root package name */
    private r3 f7806d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Boolean f7807e;

    /* renamed from: f  reason: collision with root package name */
    private final h f7808f;

    /* renamed from: g  reason: collision with root package name */
    private final k9 f7809g;

    /* renamed from: h  reason: collision with root package name */
    private final List<Runnable> f7810h;
    private final h i;

    /* JADX INFO: Access modifiers changed from: protected */
    public y7(d5 d5Var) {
        super(d5Var);
        this.f7810h = new ArrayList();
        this.f7809g = new k9(d5Var.b());
        this.f7805c = new p8(this);
        this.f7808f = new x7(this, d5Var);
        this.i = new h8(this, d5Var);
    }

    private final boolean J() {
        w();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K() {
        g();
        this.f7809g.a();
        this.f7808f.a(r.J.a(null).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean L() {
        /*
            r5 = this;
            r5.g()
            r5.x()
            java.lang.Boolean r0 = r5.f7807e
            if (r0 != 0) goto Lfd
            r5.g()
            r5.x()
            com.google.android.gms.measurement.internal.m4 r0 = r5.k()
            java.lang.Boolean r0 = r0.v()
            r1 = 1
            if (r0 == 0) goto L23
            boolean r2 = r0.booleanValue()
            if (r2 == 0) goto L23
            goto Lf7
        L23:
            r5.w()
            com.google.android.gms.measurement.internal.w3 r2 = r5.p()
            int r2 = r2.G()
            r3 = 0
            if (r2 != r1) goto L34
        L31:
            r0 = 1
            goto Ld4
        L34:
            com.google.android.gms.measurement.internal.z3 r2 = r5.c()
            com.google.android.gms.measurement.internal.b4 r2 = r2.B()
            java.lang.String r4 = "Checking service availability"
            r2.a(r4)
            com.google.android.gms.measurement.internal.z9 r2 = r5.j()
            r4 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r2 = r2.a(r4)
            if (r2 == 0) goto Lc5
            if (r2 == r1) goto Lb6
            r4 = 2
            if (r2 == r4) goto L96
            r0 = 3
            if (r2 == r0) goto L88
            r0 = 9
            if (r2 == r0) goto L7d
            r0 = 18
            if (r2 == r0) goto L72
            com.google.android.gms.measurement.internal.z3 r0 = r5.c()
            com.google.android.gms.measurement.internal.b4 r0 = r0.v()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = "Unexpected service status"
            r0.a(r2, r1)
        L6f:
            r0 = 0
        L70:
            r1 = 0
            goto Ld4
        L72:
            com.google.android.gms.measurement.internal.z3 r0 = r5.c()
            com.google.android.gms.measurement.internal.b4 r0 = r0.v()
            java.lang.String r2 = "Service updating"
            goto Lcf
        L7d:
            com.google.android.gms.measurement.internal.z3 r0 = r5.c()
            com.google.android.gms.measurement.internal.b4 r0 = r0.v()
            java.lang.String r1 = "Service invalid"
            goto L92
        L88:
            com.google.android.gms.measurement.internal.z3 r0 = r5.c()
            com.google.android.gms.measurement.internal.b4 r0 = r0.v()
            java.lang.String r1 = "Service disabled"
        L92:
            r0.a(r1)
            goto L6f
        L96:
            com.google.android.gms.measurement.internal.z3 r2 = r5.c()
            com.google.android.gms.measurement.internal.b4 r2 = r2.A()
            java.lang.String r4 = "Service container out of date"
            r2.a(r4)
            com.google.android.gms.measurement.internal.z9 r2 = r5.j()
            int r2 = r2.u()
            r4 = 17443(0x4423, float:2.4443E-41)
            if (r2 >= r4) goto Lb0
            goto Lc3
        Lb0:
            if (r0 != 0) goto Lb3
            goto Lb4
        Lb3:
            r1 = 0
        Lb4:
            r0 = 0
            goto Ld4
        Lb6:
            com.google.android.gms.measurement.internal.z3 r0 = r5.c()
            com.google.android.gms.measurement.internal.b4 r0 = r0.B()
            java.lang.String r2 = "Service missing"
            r0.a(r2)
        Lc3:
            r0 = 1
            goto L70
        Lc5:
            com.google.android.gms.measurement.internal.z3 r0 = r5.c()
            com.google.android.gms.measurement.internal.b4 r0 = r0.B()
            java.lang.String r2 = "Service available"
        Lcf:
            r0.a(r2)
            goto L31
        Ld4:
            if (r1 != 0) goto Lee
            com.google.android.gms.measurement.internal.qa r2 = r5.l()
            boolean r2 = r2.u()
            if (r2 == 0) goto Lee
            com.google.android.gms.measurement.internal.z3 r0 = r5.c()
            com.google.android.gms.measurement.internal.b4 r0 = r0.s()
            java.lang.String r2 = "No way to upload. Consider using the full version of Analytics"
            r0.a(r2)
            r0 = 0
        Lee:
            if (r0 == 0) goto Lf7
            com.google.android.gms.measurement.internal.m4 r0 = r5.k()
            r0.a(r1)
        Lf7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r5.f7807e = r0
        Lfd:
            java.lang.Boolean r0 = r5.f7807e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.y7.L():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        g();
        if (!B()) {
            return;
        }
        c().B().a("Inactivity, disconnecting from the service");
        H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N() {
        g();
        c().B().a("Processing queued up service tasks", Integer.valueOf(this.f7810h.size()));
        for (Runnable runnable : this.f7810h) {
            try {
                runnable.run();
            } catch (Exception e2) {
                c().s().a("Task exception while flushing queue", e2);
            }
        }
        this.f7810h.clear();
        this.i.c();
    }

    private final fa a(boolean z) {
        w();
        return p().a(z ? c().C() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(ComponentName componentName) {
        g();
        if (this.f7806d != null) {
            this.f7806d = null;
            c().B().a("Disconnected from device MeasurementService", componentName);
            g();
            F();
        }
    }

    private final void a(Runnable runnable) {
        g();
        if (B()) {
            runnable.run();
        } else if (this.f7810h.size() >= 1000) {
            c().s().a("Discarding data. Max runnable queue size reached");
        } else {
            this.f7810h.add(runnable);
            this.i.a(60000L);
            F();
        }
    }

    @Override // com.google.android.gms.measurement.internal.f5
    protected final boolean A() {
        return false;
    }

    public final boolean B() {
        g();
        x();
        return this.f7806d != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void C() {
        g();
        x();
        a(new k8(this, a(true)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void D() {
        g();
        e();
        x();
        fa a2 = a(false);
        if (J()) {
            s().B();
        }
        a(new b8(this, a2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void E() {
        g();
        x();
        fa a2 = a(true);
        s().C();
        a(new c8(this, a2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void F() {
        g();
        x();
        if (B()) {
            return;
        }
        if (L()) {
            this.f7805c.b();
        } else if (l().u()) {
        } else {
            w();
            List<ResolveInfo> queryIntentServices = d().getPackageManager().queryIntentServices(new Intent().setClassName(d(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
            if (!(queryIntentServices != null && queryIntentServices.size() > 0)) {
                c().s().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                return;
            }
            Intent intent = new Intent("com.google.android.gms.measurement.START");
            Context d2 = d();
            w();
            intent.setComponent(new ComponentName(d2, "com.google.android.gms.measurement.AppMeasurementService"));
            this.f7805c.a(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean G() {
        return this.f7807e;
    }

    public final void H() {
        g();
        x();
        this.f7805c.a();
        try {
            com.google.android.gms.common.stats.a.a().a(d(), this.f7805c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f7806d = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean I() {
        g();
        x();
        return !L() || j().u() >= 200900;
    }

    public final void a(Bundle bundle) {
        g();
        x();
        a(new e8(this, bundle, a(false)));
    }

    public final void a(nd ndVar) {
        g();
        x();
        a(new d8(this, a(false), ndVar));
    }

    public final void a(nd ndVar, p pVar, String str) {
        g();
        x();
        if (j().a(com.google.android.gms.common.i.f6959a) == 0) {
            a(new i8(this, pVar, str, ndVar));
            return;
        }
        c().v().a("Not bundling data. Service unavailable or out of date");
        j().a(ndVar, new byte[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(nd ndVar, String str, String str2) {
        g();
        x();
        a(new o8(this, str, str2, a(false), ndVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(nd ndVar, String str, String str2, boolean z) {
        g();
        x();
        a(new q8(this, str, str2, z, a(false), ndVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(oa oaVar) {
        com.google.android.gms.common.internal.s.a(oaVar);
        g();
        x();
        w();
        a(new m8(this, true, s().a(oaVar), new oa(oaVar), a(true), oaVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(p pVar, String str) {
        com.google.android.gms.common.internal.s.a(pVar);
        g();
        x();
        boolean J = J();
        a(new j8(this, J, J && s().a(pVar), pVar, a(true), str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(q7 q7Var) {
        g();
        x();
        a(new f8(this, q7Var));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(r3 r3Var) {
        g();
        com.google.android.gms.common.internal.s.a(r3Var);
        this.f7806d = r3Var;
        K();
        N();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(r3 r3Var, com.google.android.gms.common.internal.x.a aVar, fa faVar) {
        int i;
        b4 s;
        String str;
        List<com.google.android.gms.common.internal.x.a> a2;
        g();
        e();
        x();
        boolean J = J();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            if (!J || (a2 = s().a(100)) == null) {
                i = 0;
            } else {
                arrayList.addAll(a2);
                i = a2.size();
            }
            if (aVar != null && i < 100) {
                arrayList.add(aVar);
            }
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                com.google.android.gms.common.internal.x.a aVar2 = (com.google.android.gms.common.internal.x.a) obj;
                if (aVar2 instanceof p) {
                    try {
                        r3Var.a((p) aVar2, faVar);
                    } catch (RemoteException e2) {
                        e = e2;
                        s = c().s();
                        str = "Failed to send event to the service";
                        s.a(str, e);
                    }
                } else if (aVar2 instanceof y9) {
                    try {
                        r3Var.a((y9) aVar2, faVar);
                    } catch (RemoteException e3) {
                        e = e3;
                        s = c().s();
                        str = "Failed to send user property to the service";
                        s.a(str, e);
                    }
                } else if (aVar2 instanceof oa) {
                    try {
                        r3Var.a((oa) aVar2, faVar);
                    } catch (RemoteException e4) {
                        e = e4;
                        s = c().s();
                        str = "Failed to send conditional user property to the service";
                        s.a(str, e);
                    }
                } else {
                    c().s().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(y9 y9Var) {
        g();
        x();
        a(new z7(this, J() && s().a(y9Var), y9Var, a(true)));
    }

    public final void a(AtomicReference<String> atomicReference) {
        g();
        x();
        a(new a8(this, atomicReference, a(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(AtomicReference<List<oa>> atomicReference, String str, String str2, String str3) {
        g();
        x();
        a(new l8(this, atomicReference, str, str2, str3, a(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(AtomicReference<List<y9>> atomicReference, String str, String str2, String str3, boolean z) {
        g();
        x();
        a(new n8(this, atomicReference, str, str2, str3, z, a(false)));
    }
}

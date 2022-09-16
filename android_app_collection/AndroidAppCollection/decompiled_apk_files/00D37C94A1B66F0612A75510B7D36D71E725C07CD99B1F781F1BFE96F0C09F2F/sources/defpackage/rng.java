package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: rng  reason: default package */
/* loaded from: classes4.dex */
public final class rng extends riw {
    public rnf b;
    public final Set c;
    protected boolean d;
    public final rpr e;
    final rli f;
    private boolean g;
    private final AtomicReference h;
    private final Object i;
    private rjq j;
    private int k;
    private final AtomicLong l;
    private long m;
    private int n;
    private rjd o;

    public rng(rlx rlxVar) {
        super(rlxVar);
        this.c = new CopyOnWriteArraySet();
        this.i = new Object();
        this.d = true;
        this.e = new rmz(this);
        this.h = new AtomicReference();
        this.j = new rjq(null, null);
        this.k = 100;
        this.m = -1L;
        this.n = 100;
        this.l = new AtomicLong(0L);
        this.f = new rli(rlxVar);
    }

    public final void A(String str) {
        this.h.set(str);
    }

    public final void B(Bundle bundle, long j) {
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            aG().f.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        rgf.g(bundle2, "app_id", String.class, null);
        rgf.g(bundle2, "origin", String.class, null);
        rgf.g(bundle2, "name", String.class, null);
        rgf.g(bundle2, "value", Object.class, null);
        rgf.g(bundle2, "trigger_event_name", String.class, null);
        rgf.g(bundle2, "trigger_timeout", Long.class, 0L);
        rgf.g(bundle2, "timed_out_event_name", String.class, null);
        rgf.g(bundle2, "timed_out_event_params", Bundle.class, null);
        rgf.g(bundle2, "triggered_event_name", String.class, null);
        rgf.g(bundle2, "triggered_event_params", Bundle.class, null);
        rgf.g(bundle2, "time_to_live", Long.class, 0L);
        rgf.g(bundle2, "expired_event_name", String.class, null);
        rgf.g(bundle2, "expired_event_params", Bundle.class, null);
        qnm.l(bundle2.getString("name"));
        qnm.l(bundle2.getString("origin"));
        qnm.b(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (N().o(string) != 0) {
            aG().c.b("Invalid conditional user property name", L().e(string));
        } else if (N().b(string, obj) != 0) {
            aG().c.c("Invalid conditional user property value", L().e(string), obj);
        } else {
            Object z = N().z(string, obj);
            if (z == null) {
                aG().c.c("Unable to normalize conditional user property value", L().e(string), obj);
                return;
            }
            rgf.h(bundle2, z);
            long j2 = bundle2.getLong("trigger_timeout");
            if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                J();
                if (j2 > 15552000000L || j2 < 1) {
                    aG().c.c("Invalid conditional user property timeout", L().e(string), Long.valueOf(j2));
                    return;
                }
            }
            long j3 = bundle2.getLong("time_to_live");
            J();
            if (j3 > 15552000000L || j3 < 1) {
                aG().c.c("Invalid conditional user property time to live", L().e(string), Long.valueOf(j3));
            } else {
                aH().g(new rmw(this, bundle2));
            }
        }
    }

    public final void C(Bundle bundle, int i, long j) {
        a();
        String e = rjq.e(bundle);
        if (e != null) {
            aG().h.b("Ignoring invalid consent setting", e);
            aG().h.a("Valid consent values are 'granted', 'denied'");
        }
        D(rjq.a(bundle), i, j);
    }

    public final void D(rjq rjqVar, int i, long j) {
        boolean z;
        boolean z2;
        rjq rjqVar2;
        boolean z3;
        a();
        if (i == -10) {
            i = -10;
        } else if (rjqVar.b == null && rjqVar.c == null) {
            aG().h.a("Discarding empty consent settings");
            return;
        }
        synchronized (this.i) {
            z = true;
            z2 = false;
            if (rjq.i(i, this.k)) {
                boolean j2 = rjqVar.j(this.j);
                if (rjqVar.h() && !this.j.h()) {
                    z2 = true;
                }
                rjq rjqVar3 = this.j;
                Boolean bool = rjqVar.b;
                if (bool == null) {
                    bool = rjqVar3.b;
                }
                Boolean bool2 = rjqVar.c;
                if (bool2 == null) {
                    bool2 = rjqVar3.c;
                }
                rjq rjqVar4 = new rjq(bool, bool2);
                this.j = rjqVar4;
                this.k = i;
                z3 = z2;
                z2 = j2;
                rjqVar2 = rjqVar4;
            } else {
                rjqVar2 = rjqVar;
                z3 = false;
                z = false;
            }
        }
        if (!z) {
            aG().i.b("Ignoring lower-priority consent settings, proposed settings", rjqVar2);
            return;
        }
        long andIncrement = this.l.getAndIncrement();
        if (z2) {
            A(null);
            aH().h(new rnc(this, rjqVar2, j, i, andIncrement, z3));
        } else if (i == 30 || i == -10) {
            aH().h(new rnd(this, rjqVar2, i, andIncrement, z3, 1));
        } else {
            aH().g(new rnd(this, rjqVar2, i, andIncrement, z3));
        }
    }

    public final void E(Bundle bundle, long j) {
        axsq.b();
        if (!J().o(rkg.as) || TextUtils.isEmpty(h().r())) {
            C(bundle, 0, j);
        } else {
            aG().h.a("Using developer consent only; google app id found");
        }
    }

    public final void F(rjq rjqVar, int i, long j, boolean z, boolean z2) {
        n();
        a();
        if (j > this.m || !rjq.i(this.n, i)) {
            rlf M = M();
            M.n();
            if (M.i(i)) {
                SharedPreferences.Editor edit = M.a().edit();
                edit.putString("consent_settings", rjqVar.f());
                edit.putInt("consent_source", i);
                edit.apply();
                this.m = j;
                this.n = i;
                rom l = l();
                l.n();
                l.a();
                if (z) {
                    l.C();
                    l.i().o();
                }
                if (l.A()) {
                    l.t(new rnx(l, l.e(false), 3));
                }
                if (!z2) {
                    return;
                }
                l().q(new AtomicReference());
                return;
            }
            aG().i.b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
            return;
        }
        aG().i.b("Dropped out-of-date consent setting, proposed settings", rjqVar);
    }

    public final void G(Boolean bool) {
        a();
        aH().g(new rnb(this, bool));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void H(rjq rjqVar) {
        n();
        boolean z = (rjqVar.h() && rjqVar.g()) || l().A();
        if (z != this.w.x()) {
            rlx rlxVar = this.w;
            rlxVar.r();
            rlxVar.u = z;
            rlf M = M();
            M.n();
            Boolean valueOf = M.a().contains("measurement_enabled_from_api") ? Boolean.valueOf(M.a().getBoolean("measurement_enabled_from_api", true)) : null;
            if (z && valueOf != null && !valueOf.booleanValue()) {
                return;
            }
            R(Boolean.valueOf(z), false);
        }
    }

    public final void R(Boolean bool, boolean z) {
        n();
        a();
        aG().j.b("Setting app measurement enabled (FE)", bool);
        M().e(bool);
        if (z) {
            rlf M = M();
            M.n();
            SharedPreferences.Editor edit = M.a().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.w.x() || (bool != null && !bool.booleanValue())) {
            U();
        }
    }

    public final void S(String str, String str2, Object obj, boolean z, long j) {
        int i;
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        if (z) {
            i = N().o(str2);
        } else {
            rps N = N();
            if (N.ah("user property", str2)) {
                if (!N.ad("user property", rmo.a, str2)) {
                    i = 15;
                } else {
                    N.J();
                    if (N.ac("user property", 24, str2)) {
                        i = 0;
                    }
                }
            }
            i = 6;
        }
        if (i != 0) {
            rps N2 = N();
            J();
            this.w.q().H(this.e, i, "_ev", N2.A(str2, 24, true), str2 != null ? str2.length() : 0);
        } else if (obj != null) {
            int b = N().b(str2, obj);
            if (b != 0) {
                rps N3 = N();
                J();
                this.w.q().H(this.e, b, "_ev", N3.A(str2, 24, true), ((obj instanceof String) || (obj instanceof CharSequence)) ? String.valueOf(obj).length() : 0);
                return;
            }
            Object z2 = N().z(str2, obj);
            if (z2 == null) {
                return;
            }
            z(str3, str2, j, z2);
        } else {
            z(str3, str2, j, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T(java.lang.String r10, java.lang.String r11, java.lang.Object r12, long r13) {
        /*
            r9 = this;
            defpackage.qnm.l(r10)
            defpackage.qnm.l(r11)
            r9.n()
            r9.a()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r11)
            java.lang.String r1 = "_npa"
            r2 = 1
            if (r0 == 0) goto L61
            boolean r0 = r12 instanceof java.lang.String
            if (r0 == 0) goto L51
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L51
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r12 = "false"
            boolean r11 = r12.equals(r11)
            r3 = 1
            if (r2 == r11) goto L37
            r5 = 0
            goto L38
        L37:
            r5 = r3
        L38:
            java.lang.Long r11 = java.lang.Long.valueOf(r5)
            rlf r0 = r9.M()
            rle r0 = r0.l
            long r5 = r11.longValue()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L4c
            java.lang.String r12 = "true"
        L4c:
            r0.b(r12)
            r7 = r11
            goto L5f
        L51:
            if (r12 != 0) goto L61
            rlf r11 = r9.M()
            rle r11 = r11.l
            java.lang.String r0 = "unset"
            r11.b(r0)
            r7 = r12
        L5f:
            r4 = r1
            goto L63
        L61:
            r4 = r11
            r7 = r12
        L63:
            rlx r11 = r9.w
            boolean r11 = r11.w()
            if (r11 != 0) goto L77
            rks r10 = r9.aG()
            rkq r10 = r10.k
            java.lang.String r11 = "User property not set since app measurement is disabled"
            r10.a(r11)
            return
        L77:
            rlx r11 = r9.w
            boolean r11 = r11.z()
            if (r11 != 0) goto L80
            return
        L80:
            com.google.android.gms.measurement.internal.UserAttributeParcel r11 = new com.google.android.gms.measurement.internal.UserAttributeParcel
            r3 = r11
            r5 = r13
            r8 = r10
            r3.<init>(r4, r5, r7, r8)
            rom r10 = r9.l()
            r10.n()
            r10.a()
            r10.C()
            rkm r12 = r10.i()
            android.os.Parcel r13 = android.os.Parcel.obtain()
            defpackage.rfn.b(r11, r13)
            byte[] r14 = r13.marshall()
            r13.recycle()
            int r13 = r14.length
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = 0
            if (r13 <= r0) goto Lb9
            rks r12 = r12.aG()
            rkq r12 = r12.d
            java.lang.String r13 = "User property too long for local database. Sending directly to service"
            r12.a(r13)
            goto Lc0
        Lb9:
            boolean r12 = r12.q(r2, r14)
            if (r12 == 0) goto Lc0
            r1 = 1
        Lc0:
            com.google.android.gms.measurement.internal.AppMetadata r12 = r10.e(r2)
            rnu r13 = new rnu
            r13.<init>(r10, r12, r1, r11)
            r10.t(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rng.T(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void U() {
        n();
        String a = M().l.a();
        if (a != null) {
            if ("unset".equals(a)) {
                Q();
                T("app", "_npa", null, System.currentTimeMillis());
            } else {
                Long valueOf = Long.valueOf(true != "true".equals(a) ? 0L : 1L);
                Q();
                T("app", "_npa", valueOf, System.currentTimeMillis());
            }
        }
        if (!this.w.w() || !this.d) {
            aG().j.a("Updating Scion state (FE)");
            rom l = l();
            l.n();
            l.a();
            l.t(new rnx(l, l.e(true), 2));
            return;
        }
        aG().j.a("Recording app launch after enabling measurement for the first time (FE)");
        p();
        axsw.b();
        if (J().o(rkg.ak)) {
            m().c.a();
        }
        aH().g(new rms(this));
    }

    public final void V(rjd rjdVar) {
        n();
        a();
        rjd rjdVar2 = this.o;
        if (rjdVar != rjdVar2) {
            qnm.k(rjdVar2 == null, "EventInterceptor already set.");
        }
        this.o = rjdVar;
    }

    public final void W(String str) {
        qnm.l(str);
        J();
    }

    public final void X(String str, Bundle bundle, String str2) {
        rlx.B();
        Q();
        y("auto", str, System.currentTimeMillis(), bundle, false, true, true, str2);
    }

    public final void Y(Object obj) {
        Q();
        S("auto", "_ldl", obj, true, System.currentTimeMillis());
    }

    @Override // defpackage.riw
    protected final boolean d() {
        return false;
    }

    public final String e() {
        return (String) this.h.get();
    }

    public final String f() {
        rnm rnmVar = this.w.n().b;
        if (rnmVar != null) {
            return rnmVar.b;
        }
        return null;
    }

    public final String o() {
        rnm rnmVar = this.w.n().b;
        if (rnmVar != null) {
            return rnmVar.a;
        }
        return null;
    }

    public final void p() {
        n();
        a();
        if (!this.w.z()) {
            return;
        }
        if (J().o(rkg.aa)) {
            rjp J2 = J();
            J2.P();
            Boolean j = J2.j("google_analytics_deferred_deep_link_enabled");
            if (j != null && j.booleanValue()) {
                aG().j.a("Deferred Deep Link feature enabled.");
                aH().g(new rms(this, 1));
            }
        }
        rom l = l();
        l.n();
        l.a();
        AppMetadata e = l.e(true);
        l.i().q(3, new byte[0]);
        l.t(new rnx(l, e));
        this.d = false;
        rlf M = M();
        M.n();
        String string = M.a().getString("previous_os_version", null);
        String c = M.K().c();
        if (!TextUtils.isEmpty(c) && !c.equals(string)) {
            SharedPreferences.Editor edit = M.a().edit();
            edit.putString("previous_os_version", c);
            edit.apply();
        }
        if (TextUtils.isEmpty(string) || string.equals(K().c())) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_po", string);
        u("auto", "_ou", bundle);
    }

    public final void q(String str, String str2, Bundle bundle) {
        Q();
        long currentTimeMillis = System.currentTimeMillis();
        qnm.l(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        aH().g(new rmw(this, bundle2, 2, null));
    }

    public final void r() {
        if (!(I().getApplicationContext() instanceof Application) || this.b == null) {
            return;
        }
        ((Application) I().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.b);
    }

    public final void s(String str, String str2, Bundle bundle) {
        Q();
        t(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r3 > 100) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
        if (r6 > 100) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(java.lang.String r15, java.lang.String r16, android.os.Bundle r17, boolean r18, boolean r19, long r20) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rng.t(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u(String str, String str2, Bundle bundle) {
        n();
        Q();
        v(str, str2, System.currentTimeMillis(), bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v(String str, String str2, long j, Bundle bundle) {
        n();
        w(str, str2, j, bundle, true, this.o == null || rps.an(str2), true, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:178:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(java.lang.String r22, java.lang.String r23, long r24, android.os.Bundle r26, boolean r27, boolean r28, boolean r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 1291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rng.w(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void x(long j, boolean z) {
        n();
        a();
        aG().j.a("Resetting analytics data (FE)");
        rpa m = m();
        m.n();
        roz rozVar = m.c;
        roy royVar = m.d;
        royVar.c.a();
        royVar.a = 0L;
        royVar.b = 0L;
        boolean w = this.w.w();
        rlf M = M();
        M.d.b(j);
        if (!TextUtils.isEmpty(M.M().s.a())) {
            M.s.b(null);
        }
        axsw.b();
        if (M.J().o(rkg.ak)) {
            M.n.b(0L);
        }
        if (!M.J().s()) {
            M.g(!w);
        }
        M.t.b(null);
        M.u.b(0L);
        M.v.b(null);
        if (z) {
            rom l = l();
            l.n();
            l.a();
            AppMetadata e = l.e(false);
            l.C();
            l.i().o();
            l.t(new rnx(l, e, 1));
        }
        axsw.b();
        if (J().o(rkg.ak)) {
            m().c.a();
        }
        this.d = true ^ w;
    }

    protected final void y(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        aH().g(new rmt(this, str, str2, j, rps.v(bundle), z, z2, z3, str3));
    }

    final void z(String str, String str2, long j, Object obj) {
        aH().g(new rmu(this, str, str2, obj, j));
    }
}

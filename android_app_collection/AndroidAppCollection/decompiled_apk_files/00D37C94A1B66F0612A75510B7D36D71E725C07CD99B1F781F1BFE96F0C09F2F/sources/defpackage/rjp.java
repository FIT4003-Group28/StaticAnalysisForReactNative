package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
/* compiled from: PG */
/* renamed from: rjp  reason: default package */
/* loaded from: classes4.dex */
public final class rjp extends rmj {
    public rjo a;
    public Boolean b;
    private Boolean c;

    public rjp(rlx rlxVar) {
        super(rlxVar);
        this.a = rjn.a;
    }

    public static final long u() {
        return ((Long) rkg.d.a()).longValue();
    }

    public static final long v() {
        return ((Long) rkg.D.a()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(String str) {
        return f(str, rkg.H, 500, 2000);
    }

    public final int b() {
        rps N = N();
        Boolean bool = N.w.o().d;
        if (N.p() < 201500) {
            return (bool == null || bool.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    public final int c(String str) {
        return f(str, rkg.I, 25, 100);
    }

    public final int d(String str) {
        return e(str, rkg.o);
    }

    public final int e(String str, rkf rkfVar) {
        if (str == null) {
            return ((Integer) rkfVar.a()).intValue();
        }
        String a = this.a.a(str, rkfVar.a);
        if (TextUtils.isEmpty(a)) {
            return ((Integer) rkfVar.a()).intValue();
        }
        try {
            return ((Integer) rkfVar.b(Integer.valueOf(Integer.parseInt(a)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) rkfVar.a()).intValue();
        }
    }

    public final int f(String str, rkf rkfVar, int i, int i2) {
        return Math.max(Math.min(e(str, rkfVar), i2), i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long g(String str) {
        return h(str, rkg.b);
    }

    public final long h(String str, rkf rkfVar) {
        if (str == null) {
            return ((Long) rkfVar.a()).longValue();
        }
        String a = this.a.a(str, rkfVar.a);
        if (TextUtils.isEmpty(a)) {
            return ((Long) rkfVar.a()).longValue();
        }
        try {
            return ((Long) rkfVar.b(Long.valueOf(Long.parseLong(a)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) rkfVar.a()).longValue();
        }
    }

    final Bundle i() {
        try {
            if (I().getPackageManager() == null) {
                aG().c.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c = qyr.b(I()).c(I().getPackageName(), 128);
            if (c == null) {
                aG().c.a("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return c.metaData;
        } catch (PackageManager.NameNotFoundException e) {
            aG().c.b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean j(String str) {
        qnm.l(str);
        Bundle i = i();
        if (i == null) {
            aG().c.a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (i.containsKey(str)) {
            return Boolean.valueOf(i.getBoolean(str));
        } else {
            return null;
        }
    }

    public final String k() {
        return x("debug.firebase.analytics.app");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String l() {
        P();
        return "FA";
    }

    public final boolean m() {
        Boolean j = j("google_analytics_adid_collection_enabled");
        return j == null || j.booleanValue();
    }

    public final boolean o(rkf rkfVar) {
        return p(null, rkfVar);
    }

    public final boolean p(String str, rkf rkfVar) {
        if (str == null) {
            return ((Boolean) rkfVar.a()).booleanValue();
        }
        String a = this.a.a(str, rkfVar.a);
        if (TextUtils.isEmpty(a)) {
            return ((Boolean) rkfVar.a()).booleanValue();
        }
        return ((Boolean) rkfVar.b(Boolean.valueOf(Boolean.parseBoolean(a)))).booleanValue();
    }

    public final boolean q(String str) {
        return "1".equals(this.a.a(str, "gaia_collection_enabled"));
    }

    public final boolean r() {
        Boolean j = j("google_analytics_automatic_screen_reporting_enabled");
        return j == null || j.booleanValue();
    }

    public final boolean s() {
        P();
        Boolean j = j("firebase_analytics_collection_deactivated");
        return j != null && j.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean t() {
        if (this.c == null) {
            Boolean j = j("app_measurement_lite");
            this.c = j;
            if (j == null) {
                this.c = false;
            }
        }
        return this.c.booleanValue() || !this.w.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List w() {
        /*
            r4 = this;
            java.lang.String r0 = "analytics.safelisted_events"
            defpackage.qnm.l(r0)
            android.os.Bundle r1 = r4.i()
            r2 = 0
            if (r1 != 0) goto L19
            rks r0 = r4.aG()
            rkq r0 = r0.c
            java.lang.String r1 = "Failed to load metadata: Metadata bundle is null"
            r0.a(r1)
        L17:
            r0 = r2
            goto L28
        L19:
            boolean r3 = r1.containsKey(r0)
            if (r3 != 0) goto L20
            goto L17
        L20:
            int r0 = r1.getInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L28:
            if (r0 != 0) goto L2b
            return r2
        L2b:
            android.content.Context r1 = r4.I()     // Catch: android.content.res.Resources.NotFoundException -> L43
            android.content.res.Resources r1 = r1.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L43
            int r0 = r0.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L43
            java.lang.String[] r0 = r1.getStringArray(r0)     // Catch: android.content.res.Resources.NotFoundException -> L43
            if (r0 != 0) goto L3e
            return r2
        L3e:
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: android.content.res.Resources.NotFoundException -> L43
            return r0
        L43:
            r0 = move-exception
            rks r1 = r4.aG()
            rkq r1 = r1.c
            java.lang.String r3 = "Failed to load string array from metadata: resource not found"
            r1.b(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rjp.w():java.util.List");
    }

    public final String x(String str) {
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            qnm.b(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            aG().c.b("Could not find SystemProperties class", e);
            return "";
        } catch (IllegalAccessException e2) {
            aG().c.b("Could not access SystemProperties.get()", e2);
            return "";
        } catch (NoSuchMethodException e3) {
            aG().c.b("Could not find SystemProperties.get() method", e3);
            return "";
        } catch (InvocationTargetException e4) {
            aG().c.b("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    public final void y() {
        P();
    }
}

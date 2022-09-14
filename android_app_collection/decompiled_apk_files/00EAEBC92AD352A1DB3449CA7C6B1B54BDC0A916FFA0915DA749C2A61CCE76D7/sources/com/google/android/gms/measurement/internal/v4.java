package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import java.util.List;
/* loaded from: classes.dex */
public final class v4 {

    /* renamed from: a  reason: collision with root package name */
    final d5 f7736a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v4(d5 d5Var) {
        this.f7736a = d5Var;
    }

    private final boolean a() {
        try {
            com.google.android.gms.common.n.b a2 = com.google.android.gms.common.n.c.a(this.f7736a.d());
            if (a2 != null) {
                return a2.b("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f7736a.c().B().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e2) {
            this.f7736a.c().B().a("Failed to retrieve Play Store version for Install Referrer", e2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle a(String str, c.e.a.b.d.g.p2 p2Var) {
        this.f7736a.a().g();
        if (p2Var == null) {
            this.f7736a.c().v().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle a2 = p2Var.a(bundle);
            if (a2 != null) {
                return a2;
            }
            this.f7736a.c().s().a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e2) {
            this.f7736a.c().s().a("Exception occurred while retrieving the Install Referrer", e2.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(String str) {
        if (str == null || str.isEmpty()) {
            this.f7736a.c().x().a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.f7736a.a().g();
        if (!a()) {
            this.f7736a.c().z().a("Install Referrer Reporter is not available");
            return;
        }
        u4 u4Var = new u4(this, str);
        this.f7736a.a().g();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.f7736a.d().getPackageManager();
        if (packageManager == null) {
            this.f7736a.c().x().a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
            return;
        }
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.f7736a.c().z().a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ResolveInfo resolveInfo = queryIntentServices.get(0);
        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
        if (serviceInfo == null) {
            return;
        }
        String str2 = serviceInfo.packageName;
        if (resolveInfo.serviceInfo.name == null || !"com.android.vending".equals(str2) || !a()) {
            this.f7736a.c().v().a("Play Store version 8.3.73 or higher required for Install Referrer");
            return;
        }
        try {
            this.f7736a.c().B().a("Install Referrer Service is", com.google.android.gms.common.stats.a.a().a(this.f7736a.d(), new Intent(intent), u4Var, 1) ? "available" : "not available");
        } catch (Exception e2) {
            this.f7736a.c().s().a("Exception occurred while binding to Install Referrer Service", e2.getMessage());
        }
    }
}

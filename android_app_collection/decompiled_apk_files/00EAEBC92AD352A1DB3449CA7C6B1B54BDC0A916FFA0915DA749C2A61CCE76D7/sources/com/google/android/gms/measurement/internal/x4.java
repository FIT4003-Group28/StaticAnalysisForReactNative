package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
/* loaded from: classes.dex */
final class x4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ c.e.a.b.d.g.p2 f7778b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ ServiceConnection f7779c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ u4 f7780d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x4(u4 u4Var, c.e.a.b.d.g.p2 p2Var, ServiceConnection serviceConnection) {
        this.f7780d = u4Var;
        this.f7778b = p2Var;
        this.f7779c = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        b4 s;
        String str2;
        u4 u4Var = this.f7780d;
        v4 v4Var = u4Var.f7720b;
        str = u4Var.f7719a;
        c.e.a.b.d.g.p2 p2Var = this.f7778b;
        ServiceConnection serviceConnection = this.f7779c;
        Bundle a2 = v4Var.a(str, p2Var);
        v4Var.f7736a.a().g();
        if (a2 != null) {
            long j = a2.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                s = v4Var.f7736a.c().v();
                str2 = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = a2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    s = v4Var.f7736a.c().s();
                    str2 = "No referrer defined in Install Referrer response";
                } else {
                    v4Var.f7736a.c().B().a("InstallReferrer API result", string);
                    z9 u = v4Var.f7736a.u();
                    String valueOf = String.valueOf(string);
                    Bundle a3 = u.a(Uri.parse(valueOf.length() != 0 ? "?".concat(valueOf) : new String("?")));
                    if (a3 == null) {
                        s = v4Var.f7736a.c().s();
                        str2 = "No campaign params defined in Install Referrer result";
                    } else {
                        String string2 = a3.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = a2.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j2 == 0) {
                                s = v4Var.f7736a.c().s();
                                str2 = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                a3.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == v4Var.f7736a.o().k.a()) {
                            v4Var.f7736a.w();
                            s = v4Var.f7736a.c().B();
                            str2 = "Install Referrer campaign has already been logged";
                        } else if (!c.e.a.b.d.g.da.a() || !v4Var.f7736a.n().a(r.B0) || v4Var.f7736a.g()) {
                            v4Var.f7736a.o().k.a(j);
                            v4Var.f7736a.w();
                            v4Var.f7736a.c().B().a("Logging Install Referrer campaign from sdk with ", "referrer API");
                            a3.putString("_cis", "referrer API");
                            v4Var.f7736a.t().a("auto", "_cmp", a3);
                        }
                    }
                }
            }
            s.a(str2);
        }
        if (serviceConnection != null) {
            com.google.android.gms.common.stats.a.a().a(v4Var.f7736a.d(), serviceConnection);
        }
    }
}

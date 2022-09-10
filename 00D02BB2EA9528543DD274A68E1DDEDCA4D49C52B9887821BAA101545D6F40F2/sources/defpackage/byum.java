package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: byum  reason: default package */
/* loaded from: classes4.dex */
public final class byum {
    public final byue a;
    public final auhi b;
    private final bvjj c;
    private final Application d;
    private final cqat e;
    private final byun f;
    private final bytn g;

    public byum(byue byueVar, bvjj bvjjVar, auhi auhiVar, Application application, cqat cqatVar, byun byunVar, bytn bytnVar) {
        this.a = byueVar;
        this.c = bvjjVar;
        this.b = auhiVar;
        this.d = application;
        this.e = cqatVar;
        this.f = byunVar;
        this.g = bytnVar;
    }

    public final void a(Intent intent) {
        djyo d = byun.d(intent.getBundleExtra("EXTRA_SCHEMATIC_MAP_GROUP"));
        if (d != null) {
            Application application = this.d;
            Intent a = afft.a(application);
            String str = bzgv.b;
            Bundle bundle = new Bundle();
            bvrs.k(bundle, bzgv.a, d);
            Intent putExtra = a.putExtra(str, bundle);
            String packageName = application.getPackageName();
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 28);
            sb.append(packageName);
            sb.append(".");
            sb.append("TransitSchematicMapActivity");
            application.startActivity(putExtra.setComponent(new ComponentName(application, sb.toString())).addFlags(268435456));
        }
    }

    public final void b(Intent intent, bytb bytbVar) {
        String stringExtra = intent.getStringExtra("EXTRA_TRANSIT_STATION_FEATURE_ID");
        long b = this.e.b();
        this.a.b();
        this.f.c();
        if (bytbVar.b(stringExtra)) {
            return;
        }
        bytbVar.c(stringExtra, Long.valueOf(b));
        if (!bytbVar.e() || !this.c.m(bvjk.di, true)) {
            if (!bytbVar.d(stringExtra) || !this.c.m(bvjk.di, true)) {
                return;
            }
            bytn bytnVar = this.g;
            byst a = bysu.a();
            a.b(stringExtra);
            a.g(intent.getStringExtra("EXTRA_TRANSIT_STATION_NAME"));
            a.e(intent.getBooleanExtra("EXTRA_IS_REALTIME_INFORMATION_AVAILABLE", false));
            a.c(intent.getBooleanExtra("EXTRA_IS_ALERT_INFORMATION_AVAILABLE", false));
            a.d(false);
            bytnVar.b(a.a(), dpyv.TRANSIT_SCHEMATIC_MAP);
            return;
        }
        this.g.a(dpyv.TRANSIT_SCHEMATIC_MAP);
    }
}

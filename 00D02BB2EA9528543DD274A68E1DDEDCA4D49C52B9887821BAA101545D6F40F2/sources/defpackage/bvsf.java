package defpackage;

import android.app.Application;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;
/* compiled from: PG */
/* renamed from: bvsf  reason: default package */
/* loaded from: classes.dex */
public final class bvsf {
    public btvo a;
    @dzsi
    public List<bvsd> b;
    @dzsi
    public dcdc<Integer> c = null;
    private final Application d;
    private final bvse e;

    public bvsf(Application application, btvo btvoVar, btrm btrmVar) {
        bvse bvseVar = new bvse(this);
        this.e = bvseVar;
        this.d = application;
        this.a = btvoVar;
        dceq a = dcet.a();
        a.b(btvr.class, new bvsg(btvr.class, bvseVar));
        btrmVar.g(bvseVar, a.a());
    }

    public final synchronized List<Integer> a() {
        List<ResolveInfo> queryIntentActivities;
        if (this.c == null) {
            List<bvsd> c = c();
            Application application = this.d;
            dccx F = dcdc.F();
            for (bvsd bvsdVar : c) {
                Intent intent = bvsdVar.b;
                PackageManager packageManager = application.getPackageManager();
                if (packageManager != null && (queryIntentActivities = packageManager.queryIntentActivities(intent, 0)) != null && !queryIntentActivities.isEmpty()) {
                    F.g(Integer.valueOf(bvsdVar.a));
                }
            }
            this.c = F.f();
        }
        return this.c;
    }

    public final synchronized void b() {
        this.c = null;
    }

    final synchronized List<bvsd> c() {
        if (this.b == null) {
            dvgs partnerAppsParameters = this.a.getPartnerAppsParameters();
            dccx F = dcdc.F();
            for (dvgq dvgqVar : partnerAppsParameters.a) {
                int i = dvgqVar.a;
                bvsd bvsdVar = null;
                if ((i & 1) != 0) {
                    int i2 = dvgqVar.b;
                    if ((i & 2) != 0) {
                        dplx dplxVar = dvgqVar.c;
                        if (dplxVar == null) {
                            dplxVar = dplx.g;
                        }
                        bvsdVar = new bvsd(i2, bvrq.a(dplxVar));
                    }
                }
                if (bvsdVar != null) {
                    F.g(bvsdVar);
                }
            }
            this.b = F.f();
        }
        return this.b;
    }
}

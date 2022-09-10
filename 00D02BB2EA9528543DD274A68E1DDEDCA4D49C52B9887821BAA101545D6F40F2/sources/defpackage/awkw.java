package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.apps.gmm.offline.update.OfflineManualDownloadService;
/* compiled from: PG */
/* renamed from: awkw  reason: default package */
/* loaded from: classes3.dex */
public final class awkw {
    public final awfh a;
    public final awky b;
    private final Application c;
    private final awiq d;

    public awkw(Application application, awfh awfhVar, awiq awiqVar, awky awkyVar) {
        this.c = application;
        this.a = awfhVar;
        this.d = awiqVar;
        this.b = awkyVar;
    }

    private final void c() {
        PackageManager packageManager = this.c.getPackageManager();
        ComponentName componentName = new ComponentName(this.c, OfflineManualDownloadService.class);
        if (packageManager.getComponentEnabledSetting(componentName) != 1) {
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        }
    }

    public final void a(@dzsi String str, boolean z, @dzsi avid avidVar) {
        long longValue;
        c();
        Intent intent = new Intent(this.c, OfflineManualDownloadService.class);
        intent.setAction("FetchQueued");
        intent.putExtra("AccountId", str);
        intent.putExtra("OverrideWifiOnly", z);
        if (avidVar != null) {
            awiq awiqVar = this.d;
            synchronized (awiqVar) {
                Long valueOf = Long.valueOf(awiqVar.a.longValue() + 1);
                awiqVar.a = valueOf;
                longValue = valueOf.longValue();
                awiqVar.c.a(longValue, avidVar);
            }
            Bundle bundle = new Bundle();
            bundle.putLong("fetch_id", longValue);
            bundle.putString("process_id", awiq.b);
            intent.putExtra("FetchBundle", bundle);
        }
        akm.f(this.c, intent);
    }

    public final void b(boolean z) {
        c();
        Intent intent = new Intent(this.c, OfflineManualDownloadService.class);
        intent.setAction("resumeManualUpdate");
        intent.putExtra("OverrideWifiOnly", z);
        akm.f(this.c, intent);
    }
}

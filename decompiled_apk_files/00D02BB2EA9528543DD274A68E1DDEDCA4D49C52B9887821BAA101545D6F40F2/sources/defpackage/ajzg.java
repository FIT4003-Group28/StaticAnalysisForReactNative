package defpackage;

import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
/* compiled from: PG */
/* renamed from: ajzg  reason: default package */
/* loaded from: classes2.dex */
public final class ajzg {
    private final Application a;
    private final btvo b;

    public ajzg(Application application, btvo btvoVar) {
        this.a = application;
        this.b = btvoVar;
    }

    public final boolean a() {
        if (Build.VERSION.SDK_INT >= 22) {
            dkog locationSharingParameters = this.b.getLocationSharingParameters();
            dzvx.b(locationSharingParameters, "clientParameters.locationSharingParameters");
            if (!locationSharingParameters.B) {
                return false;
            }
            Intent intent = new Intent();
            intent.setAction("android.settings.BATTERY_SAVER_SETTINGS");
            return intent.resolveActivity(this.a.getPackageManager()) != null;
        }
        return false;
    }

    public final boolean b() {
        Object systemService = this.a.getSystemService("power");
        if (true != (systemService instanceof PowerManager)) {
            systemService = null;
        }
        PowerManager powerManager = (PowerManager) systemService;
        if (powerManager != null) {
            return powerManager.isPowerSaveMode();
        }
        return false;
    }
}

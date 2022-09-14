package com.teslamotors.plugins.notifications.gcm;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.gcm.GcmListenerService;
import com.teslamotors.plugins.notifications.a;
import java.util.List;
/* loaded from: classes.dex */
public class TeslaGcmListenerService extends GcmListenerService {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5410a = "TeslaGcmListenerService";

    @Override // com.google.android.gms.gcm.GcmListenerService
    public void onMessageReceived(String str, Bundle bundle) {
        a(bundle);
    }

    private void a(Bundle bundle) {
        Boolean valueOf = Boolean.valueOf(a());
        Intent intent = new Intent("remoteNotificationReceived");
        bundle.putString("app_state", valueOf.booleanValue() ? AppStateModule.APP_STATE_ACTIVE : "inactive");
        intent.putExtra("notification", bundle);
        new a(this).b(bundle);
    }

    private boolean a() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(getApplication().getPackageName()) && runningAppProcessInfo.importance == 100) {
                    String[] strArr = runningAppProcessInfo.pkgList;
                    if (strArr.length > 0) {
                        String str = strArr[0];
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

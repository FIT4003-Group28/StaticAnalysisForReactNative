package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
/* compiled from: PG */
/* renamed from: cvng  reason: default package */
/* loaded from: classes5.dex */
public final class cvng {
    private final Context a;

    public cvng(Context context) {
        this.a = context;
    }

    public final dbsg<cvms> a() {
        dbsg<cvms> i;
        dbsg<cvms> i2;
        if (Build.VERSION.SDK_INT < 23) {
            try {
                int i3 = Settings.Global.getInt(this.a.getContentResolver(), "zen_mode");
                if (i3 == 0) {
                    i = dbsg.i(cvms.FILTER_ALL);
                } else if (i3 == 1) {
                    i = dbsg.i(cvms.FILTER_PRIORITY);
                } else if (i3 != 2) {
                    i = i3 != 3 ? dbpy.a : dbsg.i(cvms.FILTER_ALARMS);
                } else {
                    i = dbsg.i(cvms.FILTER_NONE);
                }
                cvlw.a("InterruptionFilterStateImpl", "Current is %s (SDK < M, zen_mode == %s).", i, Integer.valueOf(i3));
                return i;
            } catch (Settings.SettingNotFoundException unused) {
                cvlw.a("InterruptionFilterStateImpl", "Current unknown (SDK < M, zen_mode missing).", new Object[0]);
                return dbpy.a;
            }
        }
        NotificationManager notificationManager = (NotificationManager) this.a.getSystemService("notification");
        if (notificationManager == null) {
            cvlw.a("InterruptionFilterStateImpl", "Current unknown (SDK >= M, NotificationManager missing).", new Object[0]);
            return dbpy.a;
        }
        int currentInterruptionFilter = notificationManager.getCurrentInterruptionFilter();
        if (currentInterruptionFilter == 1) {
            i2 = dbsg.i(cvms.FILTER_ALL);
        } else if (currentInterruptionFilter == 2) {
            i2 = dbsg.i(cvms.FILTER_PRIORITY);
        } else if (currentInterruptionFilter != 3) {
            i2 = currentInterruptionFilter != 4 ? dbpy.a : dbsg.i(cvms.FILTER_ALARMS);
        } else {
            i2 = dbsg.i(cvms.FILTER_NONE);
        }
        cvlw.a("InterruptionFilterStateImpl", "Current is %s (SDK >= M, NotificationManager's interruption filter == %s).", i2, Integer.valueOf(currentInterruptionFilter));
        return i2;
    }
}

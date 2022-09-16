package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
/* compiled from: PG */
/* renamed from: ugd  reason: default package */
/* loaded from: classes4.dex */
public final class ugd {
    private final Context a;

    public ugd(Context context) {
        this.a = context;
    }

    public final ampq a() {
        ampq j;
        ampq j2;
        if (Build.VERSION.SDK_INT < 23) {
            try {
                int i = Settings.Global.getInt(this.a.getContentResolver(), "zen_mode");
                if (i == 0) {
                    j = ampq.j(uft.FILTER_ALL);
                } else if (i == 1) {
                    j = ampq.j(uft.FILTER_PRIORITY);
                } else if (i != 2) {
                    j = i != 3 ? amon.a : ampq.j(uft.FILTER_ALARMS);
                } else {
                    j = ampq.j(uft.FILTER_NONE);
                }
                uev.e("InterruptionFilterStateImpl", "Current is %s (SDK < M, zen_mode == %s).", j, Integer.valueOf(i));
                return j;
            } catch (Settings.SettingNotFoundException unused) {
                uev.e("InterruptionFilterStateImpl", "Current unknown (SDK < M, zen_mode missing).", new Object[0]);
                return amon.a;
            }
        }
        NotificationManager notificationManager = (NotificationManager) this.a.getSystemService("notification");
        if (notificationManager == null) {
            uev.e("InterruptionFilterStateImpl", "Current unknown (SDK >= M, NotificationManager missing).", new Object[0]);
            return amon.a;
        }
        int currentInterruptionFilter = notificationManager.getCurrentInterruptionFilter();
        if (currentInterruptionFilter == 1) {
            j2 = ampq.j(uft.FILTER_ALL);
        } else if (currentInterruptionFilter == 2) {
            j2 = ampq.j(uft.FILTER_PRIORITY);
        } else if (currentInterruptionFilter != 3) {
            j2 = currentInterruptionFilter != 4 ? amon.a : ampq.j(uft.FILTER_ALARMS);
        } else {
            j2 = ampq.j(uft.FILTER_NONE);
        }
        uev.e("InterruptionFilterStateImpl", "Current is %s (SDK >= M, NotificationManager's interruption filter == %s).", j2, Integer.valueOf(currentInterruptionFilter));
        return j2;
    }
}

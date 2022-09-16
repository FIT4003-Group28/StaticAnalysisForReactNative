package defpackage;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
/* compiled from: PG */
@Deprecated
/* renamed from: jd  reason: default package */
/* loaded from: classes7.dex */
public abstract class jd extends BroadcastReceiver {
    private static final SparseArray<PowerManager.WakeLock> a = new SparseArray<>();

    public static void a(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0 && (intExtra = intent.getIntExtra("android.support.content.wakelockid", 0)) == 0) {
            return;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = a;
        synchronized (sparseArray) {
            PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray.remove(intExtra);
                return;
            }
            String str = "No active wake lock id #" + intExtra;
        }
    }
}

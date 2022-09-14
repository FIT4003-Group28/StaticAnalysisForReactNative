package a.m.a;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
@Deprecated
/* loaded from: classes.dex */
public abstract class a extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseArray<PowerManager.WakeLock> f464a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private static int f465b = 1;

    public static boolean a(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (f464a) {
            PowerManager.WakeLock wakeLock = f464a.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                f464a.remove(intExtra);
                return true;
            }
            Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            return true;
        }
    }

    public static ComponentName b(Context context, Intent intent) {
        synchronized (f464a) {
            int i = f465b;
            f465b++;
            if (f465b <= 0) {
                f465b = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000L);
            f464a.put(i, newWakeLock);
            return startService;
        }
    }
}

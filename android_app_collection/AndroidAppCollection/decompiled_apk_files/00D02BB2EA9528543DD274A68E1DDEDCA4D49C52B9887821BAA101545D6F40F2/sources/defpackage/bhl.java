package defpackage;

import android.content.Context;
import android.os.PowerManager;
import java.util.HashMap;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: bhl  reason: default package */
/* loaded from: classes3.dex */
public final class bhl {
    private static final WeakHashMap<PowerManager.WakeLock, String> a;

    static {
        bbz.f("WakeLocks");
        a = new WeakHashMap<>();
    }

    public static PowerManager.WakeLock a(Context context, String str) {
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, str2);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = a;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, str2);
        }
        return newWakeLock;
    }

    public static void b() {
        HashMap hashMap = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = a;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                hashMap.get(wakeLock);
                bbz.e();
            }
        }
    }
}

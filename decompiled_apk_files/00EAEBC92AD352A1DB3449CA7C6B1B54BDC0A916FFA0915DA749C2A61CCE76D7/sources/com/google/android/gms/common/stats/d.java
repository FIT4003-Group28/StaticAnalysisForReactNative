package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.r;
import java.util.List;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static d f7097a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f7098b;

    public static d a() {
        return f7097a;
    }

    private static void a(Context context, WakeLockEvent wakeLockEvent) {
        try {
            context.startService(new Intent().setComponent(b.f7096a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", wakeLockEvent));
        } catch (Exception e2) {
            Log.wtf("WakeLockTracker", e2);
        }
    }

    private static boolean b() {
        if (f7098b == null) {
            f7098b = false;
        }
        return f7098b.booleanValue();
    }

    public void a(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list) {
        a(context, str, i, str2, str3, str4, i2, list, 0L);
    }

    public void a(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list, long j) {
        if (!b()) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            String valueOf = String.valueOf(str);
            Log.e("WakeLockTracker", valueOf.length() != 0 ? "missing wakeLock key. ".concat(valueOf) : new String("missing wakeLock key. "));
        } else if (7 != i && 8 != i && 10 != i && 11 != i) {
        } else {
            a(context, new WakeLockEvent(System.currentTimeMillis(), i, str2, i2, c.a(list), str, SystemClock.elapsedRealtime(), r.a(context), str3, c.a(context.getPackageName()), r.b(context), j, str4, false));
        }
    }
}

package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ReceiverCallNotAllowedException;
/* compiled from: PG */
/* renamed from: btox  reason: default package */
/* loaded from: classes4.dex */
public final class btox {
    public static final IntentFilter a = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    public static boolean a(Context context) {
        Intent d = d(context);
        return d != null && d.getIntExtra("plugged", 0) > 0;
    }

    public static int b(Context context) {
        Intent intent;
        try {
            intent = d(context);
        } catch (ReceiverCallNotAllowedException unused) {
            intent = null;
        }
        if (intent != null) {
            return c(intent);
        }
        return -1;
    }

    public static int c(Intent intent) {
        return (intent.getIntExtra("level", 0) * 100) / intent.getIntExtra("scale", 1);
    }

    @dzsi
    public static Intent d(Context context) {
        return context.registerReceiver(null, a);
    }
}

package cl.json.f;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Build;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContext;
/* loaded from: classes.dex */
public class o extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f4948a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static String f4949b;

    /* renamed from: c  reason: collision with root package name */
    private static o f4950c;

    /* renamed from: d  reason: collision with root package name */
    private static Callback f4951d;

    /* renamed from: e  reason: collision with root package name */
    private static Callback f4952e;

    @TargetApi(22)
    public static IntentSender a(ReactContext reactContext) {
        synchronized (f4948a) {
            if (f4949b == null) {
                f4949b = reactContext.getPackageName() + "/" + o.class.getName() + "_ACTION";
            }
            Context applicationContext = reactContext.getApplicationContext();
            if (f4950c != null) {
                applicationContext.unregisterReceiver(f4950c);
            }
            f4950c = new o();
            applicationContext.registerReceiver(f4950c, new IntentFilter(f4949b));
        }
        Intent intent = new Intent(f4949b);
        intent.setPackage(reactContext.getPackageName());
        intent.putExtra("receiver_token", f4950c.hashCode());
        return PendingIntent.getBroadcast(reactContext, 0, intent, 1342177280).getIntentSender();
    }

    public static void a(Callback callback, Callback callback2) {
        f4951d = callback;
        f4952e = callback2;
    }

    public static void a(boolean z, Object... objArr) {
        Callback callback;
        if (!z ? (callback = f4952e) != null : (callback = f4951d) != null) {
            callback.invoke(objArr);
        }
        f4951d = null;
        f4952e = null;
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 22;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        synchronized (f4948a) {
            if (f4950c != this) {
                return;
            }
            context.getApplicationContext().unregisterReceiver(f4950c);
            f4950c = null;
            if (!intent.hasExtra("receiver_token") || intent.getIntExtra("receiver_token", 0) != hashCode()) {
                return;
            }
            ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
            if (componentName != null) {
                a(true, true, componentName.flattenToString());
            } else {
                a(true, true, "OK");
            }
        }
    }
}

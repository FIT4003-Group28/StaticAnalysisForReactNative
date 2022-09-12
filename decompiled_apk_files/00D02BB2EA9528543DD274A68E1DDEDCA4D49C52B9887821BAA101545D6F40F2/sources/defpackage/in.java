package defpackage;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: in  reason: default package */
/* loaded from: classes.dex */
public final class in {
    private static String b;
    private static im g;
    private final Context d;
    private final NotificationManager e;
    private static final Object a = new Object();
    private static Set<String> c = new HashSet();
    private static final Object f = new Object();

    private in(Context context) {
        this.d = context;
        this.e = (NotificationManager) context.getSystemService("notification");
    }

    public static in a(Context context) {
        return new in(context);
    }

    public static Set<String> g(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (a) {
            if (string != null) {
                if (!string.equals(b)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    c = hashSet;
                    b = string;
                }
            }
            set = c;
        }
        return set;
    }

    public final void b(int i) {
        c(null, i);
    }

    public final void c(String str, int i) {
        this.e.cancel(str, i);
    }

    public final void d(int i, Notification notification) {
        e(null, i, notification);
    }

    public final void e(String str, int i, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.e.notify(str, i, notification);
            return;
        }
        ij ijVar = new ij(this.d.getPackageName(), i, str, notification);
        synchronized (f) {
            if (g == null) {
                g = new im(this.d.getApplicationContext());
            }
            g.a.obtainMessage(0, ijVar).sendToTarget();
        }
        this.e.cancel(str, i);
    }

    public final boolean f() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.e.areNotificationsEnabled();
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.d.getSystemService("appops");
        ApplicationInfo applicationInfo = this.d.getApplicationInfo();
        String packageName = this.d.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            return ((Integer) cls.getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}

package android.support.v4.app;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;
/* compiled from: NotificationManagerCompat.java */
/* loaded from: classes.dex */
public final class ab {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f192a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static Set<String> f193b = new HashSet();
    private static final Object e = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Context f194c;

    /* renamed from: d  reason: collision with root package name */
    private final NotificationManager f195d;

    public static ab a(Context context) {
        return new ab(context);
    }

    private ab(Context context) {
        this.f194c = context;
        this.f195d = (NotificationManager) this.f194c.getSystemService("notification");
    }

    public boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f195d.areNotificationsEnabled();
        }
        if (Build.VERSION.SDK_INT < 19) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f194c.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f194c.getApplicationInfo();
        String packageName = this.f194c.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            return ((Integer) cls.getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}

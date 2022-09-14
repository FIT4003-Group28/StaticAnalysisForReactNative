package androidx.core.app;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1549a;

    /* renamed from: b  reason: collision with root package name */
    private final NotificationManager f1550b;

    static {
        new HashSet();
    }

    private j(Context context) {
        this.f1549a = context;
        this.f1550b = (NotificationManager) this.f1549a.getSystemService("notification");
    }

    public static j a(Context context) {
        return new j(context);
    }

    public boolean a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return this.f1550b.areNotificationsEnabled();
        }
        if (i < 19) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f1549a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f1549a.getApplicationInfo();
        String packageName = this.f1549a.getApplicationContext().getPackageName();
        int i2 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            return ((Integer) cls.getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i2), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}

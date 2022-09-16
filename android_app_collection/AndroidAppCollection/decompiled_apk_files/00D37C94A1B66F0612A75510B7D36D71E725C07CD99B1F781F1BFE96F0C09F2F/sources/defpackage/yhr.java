package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: yhr  reason: default package */
/* loaded from: classes4.dex */
public final class yhr {
    public static Uri a(Context context, String str, String str2) {
        vjf a = vjg.a(context);
        a.e(str);
        a.f(str2);
        return a.a();
    }

    public static void b(Context context, String str, String str2, int i, boolean z, boolean z2) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        NotificationChannel notificationChannel = new NotificationChannel(str, str2, i);
        notificationChannel.setShowBadge(z);
        if (!z2) {
            notificationChannel.setSound(null, null);
        }
        try {
            notificationManager.createNotificationChannel(notificationChannel);
        } catch (IllegalArgumentException unused) {
        }
    }

    public static void c(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) context.getSystemService("notification")).deleteNotificationChannel("GenericNotifications");
            b(context, "generic_notifications", context.getString(R.string.default_notifications_channel), 2, false, true);
        }
    }

    public static void d(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 26) {
            b(context, str, str2, 2, false, true);
        }
    }

    public static void e(fi fiVar, String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            fiVar.E = str;
        }
    }

    public static void f(fi fiVar, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            String num = Integer.toString(7);
            if (((NotificationManager) context.getSystemService("notification")).getNotificationChannel(num) != null) {
                fiVar.E = num;
            } else {
                g(fiVar);
            }
        }
    }

    public static void g(fi fiVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            fiVar.E = "generic_notifications";
        }
    }
}

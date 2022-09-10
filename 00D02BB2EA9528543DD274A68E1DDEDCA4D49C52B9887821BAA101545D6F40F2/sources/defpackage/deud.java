package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.filament.R;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: deud  reason: default package */
/* loaded from: classes6.dex */
public final class deud {
    private static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static deuc a(Context context, deva devaVar) {
        Bundle bundle;
        ApplicationInfo applicationInfo;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(valueOf);
            sb.toString();
        }
        if (applicationInfo != null && applicationInfo.metaData != null) {
            bundle = applicationInfo.metaData;
            Bundle bundle2 = bundle;
            return createNotificationInfo(context, context.getPackageName(), devaVar, getOrCreateChannel(context, devaVar.a("gcm.n.android_channel_id"), bundle2), context.getResources(), context.getPackageManager(), bundle2);
        }
        bundle = Bundle.EMPTY;
        Bundle bundle22 = bundle;
        return createNotificationInfo(context, context.getPackageName(), devaVar, getOrCreateChannel(context, devaVar.a("gcm.n.android_channel_id"), bundle22), context.getResources(), context.getPackageManager(), bundle22);
    }

    static boolean b(deva devaVar) {
        return devaVar.b("google.c.a.e");
    }

    private static boolean c(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb = new StringBuilder(77);
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i);
            sb.toString();
            return false;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i);
            sb2.append(", treating it as an invalid icon");
            sb2.toString();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0354 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0301 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.deuc createNotificationInfo(android.content.Context r9, java.lang.String r10, defpackage.deva r11, java.lang.String r12, android.content.res.Resources r13, android.content.pm.PackageManager r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 1154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deud.createNotificationInfo(android.content.Context, java.lang.String, deva, java.lang.String, android.content.res.Resources, android.content.pm.PackageManager, android.os.Bundle):deuc");
    }

    private static Integer d(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
                sb.append("Color is invalid: ");
                sb.append(str);
                sb.append(". Notification will use default color.");
                sb.toString();
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return Integer.valueOf(akm.c(context, i));
            } catch (Resources.NotFoundException unused2) {
                return null;
            }
        }
        return null;
    }

    private static int e() {
        return a.incrementAndGet();
    }

    private static PendingIntent f(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, e(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), 1073741824);
    }

    public static String getOrCreateChannel(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (!TextUtils.isEmpty(str)) {
                    if (notificationManager.getNotificationChannel(str) != null) {
                        return str;
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + R.styleable.AppCompatTheme_windowFixedWidthMajor);
                    sb.append("Notification Channel requested (");
                    sb.append(str);
                    sb.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                    sb.toString();
                }
                String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (!TextUtils.isEmpty(string) && notificationManager.getNotificationChannel(string) != null) {
                    return string;
                }
                if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                    int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                    notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", identifier == 0 ? "Misc" : context.getString(identifier), 3));
                }
                return "fcm_fallback_notification_channel";
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }
}

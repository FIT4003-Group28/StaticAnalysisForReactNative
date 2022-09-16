package com.google.firebase.messaging;

import android.annotation.TargetApi;
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
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.g;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f9427a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: com.google.firebase.messaging.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0190a {

        /* renamed from: a  reason: collision with root package name */
        public final g.e f9428a;

        /* renamed from: b  reason: collision with root package name */
        public final String f9429b;

        /* renamed from: c  reason: collision with root package name */
        public final int f9430c;

        C0190a(g.e eVar, String str, int i) {
            this.f9428a = eVar;
            this.f9429b = str;
            this.f9430c = i;
        }
    }

    private static int a() {
        return f9427a.incrementAndGet();
    }

    private static int a(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && a(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && a(resources, identifier2)) {
                return identifier2;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 61);
            sb.append("Icon resource ");
            sb.append(str2);
            sb.append(" not found. Notification will use default icon.");
            Log.w("FirebaseMessaging", sb.toString());
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !a(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 35);
                sb2.append("Couldn't get own application info: ");
                sb2.append(valueOf);
                Log.w("FirebaseMessaging", sb2.toString());
            }
        }
        if (i == 0 || !a(resources, i)) {
            return 17301651;
        }
        return i;
    }

    private static int a(r rVar) {
        int i = rVar.a("gcm.n.default_sound") ? 1 : 0;
        if (rVar.a("gcm.n.default_vibrate_timings")) {
            i |= 2;
        }
        return rVar.a("gcm.n.default_light_settings") ? i | 4 : i;
    }

    private static PendingIntent a(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, a(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), 1073741824);
    }

    private static PendingIntent a(Context context, r rVar) {
        if (!c(rVar)) {
            return null;
        }
        return a(context, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(rVar.i()));
    }

    private static PendingIntent a(Context context, r rVar, PendingIntent pendingIntent) {
        return a(context, new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN").putExtras(rVar.i()).putExtra("pending_intent", pendingIntent));
    }

    private static PendingIntent a(Context context, r rVar, String str, PackageManager packageManager) {
        Intent a2 = a(str, rVar, packageManager);
        if (a2 == null) {
            return null;
        }
        a2.addFlags(67108864);
        a2.putExtras(rVar.j());
        PendingIntent activity = PendingIntent.getActivity(context, a(), a2, 1073741824);
        return c(rVar) ? a(context, rVar, activity) : activity;
    }

    private static Intent a(String str, r rVar, PackageManager packageManager) {
        String g2 = rVar.g("gcm.n.click_action");
        if (!TextUtils.isEmpty(g2)) {
            Intent intent = new Intent(g2);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri b2 = rVar.b();
        if (b2 != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(b2);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    private static Uri a(String str, r rVar, Resources resources) {
        String f2 = rVar.f();
        if (TextUtils.isEmpty(f2)) {
            return null;
        }
        if ("default".equals(f2) || resources.getIdentifier(f2, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(f2).length());
        sb.append("android.resource://");
        sb.append(str);
        sb.append("/raw/");
        sb.append(f2);
        return Uri.parse(sb.toString());
    }

    private static Bundle a(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                return applicationInfo.metaData;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(valueOf);
            Log.w("FirebaseMessaging", sb.toString());
        }
        return Bundle.EMPTY;
    }

    public static C0190a a(Context context, String str, r rVar, String str2, Resources resources, PackageManager packageManager, Bundle bundle) {
        g.e eVar = new g.e(context, str2);
        String b2 = rVar.b(resources, str, "gcm.n.title");
        if (!TextUtils.isEmpty(b2)) {
            eVar.b((CharSequence) b2);
        }
        String b3 = rVar.b(resources, str, "gcm.n.body");
        if (!TextUtils.isEmpty(b3)) {
            eVar.a((CharSequence) b3);
            g.c cVar = new g.c();
            cVar.a(b3);
            eVar.a(cVar);
        }
        eVar.e(a(packageManager, resources, str, rVar.g("gcm.n.icon"), bundle));
        Uri a2 = a(str, rVar, resources);
        if (a2 != null) {
            eVar.a(a2);
        }
        eVar.a(a(context, rVar, str, packageManager));
        PendingIntent a3 = a(context, rVar);
        if (a3 != null) {
            eVar.b(a3);
        }
        Integer a4 = a(context, rVar.g("gcm.n.color"), bundle);
        if (a4 != null) {
            eVar.a(a4.intValue());
        }
        eVar.a(!rVar.a("gcm.n.sticky"));
        eVar.c(rVar.a("gcm.n.local_only"));
        String g2 = rVar.g("gcm.n.ticker");
        if (g2 != null) {
            eVar.d((CharSequence) g2);
        }
        Integer e2 = rVar.e();
        if (e2 != null) {
            eVar.d(e2.intValue());
        }
        Integer h2 = rVar.h();
        if (h2 != null) {
            eVar.f(h2.intValue());
        }
        Integer d2 = rVar.d();
        if (d2 != null) {
            eVar.c(d2.intValue());
        }
        Long f2 = rVar.f("gcm.n.event_time");
        if (f2 != null) {
            eVar.f(true);
            eVar.a(f2.longValue());
        }
        long[] g3 = rVar.g();
        if (g3 != null) {
            eVar.a(g3);
        }
        int[] a5 = rVar.a();
        if (a5 != null) {
            eVar.a(a5[0], a5[1], a5[2]);
        }
        eVar.b(a(rVar));
        return new C0190a(eVar, b(rVar), 0);
    }

    private static Integer a(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
                sb.append("Color is invalid: ");
                sb.append(str);
                sb.append(". Notification will use default color.");
                Log.w("FirebaseMessaging", sb.toString());
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return Integer.valueOf(a.g.e.b.a(context, i));
            } catch (Resources.NotFoundException unused2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }

    @TargetApi(26)
    private static boolean a(Resources resources, int i) {
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
            Log.e("FirebaseMessaging", sb.toString());
            return false;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i);
            sb2.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", sb2.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C0190a b(Context context, r rVar) {
        Bundle a2 = a(context.getPackageManager(), context.getPackageName());
        return a(context, context.getPackageName(), rVar, b(context, rVar.c(), a2), context.getResources(), context.getPackageManager(), a2);
    }

    @TargetApi(26)
    private static String b(Context context, String str, Bundle bundle) {
        String str2;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 122);
                sb.append("Notification Channel requested (");
                sb.append(str);
                sb.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                Log.w("FirebaseMessaging", sb.toString());
            }
            String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string)) {
                str2 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
            } else if (notificationManager.getNotificationChannel(string) != null) {
                return string;
            } else {
                str2 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.";
            }
            Log.w("FirebaseMessaging", str2);
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", context.getString(context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName())), 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static String b(r rVar) {
        String g2 = rVar.g("gcm.n.tag");
        if (!TextUtils.isEmpty(g2)) {
            return g2;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        StringBuilder sb = new StringBuilder(37);
        sb.append("FCM-Notification:");
        sb.append(uptimeMillis);
        return sb.toString();
    }

    static boolean c(r rVar) {
        return rVar.a("google.c.a.e");
    }
}

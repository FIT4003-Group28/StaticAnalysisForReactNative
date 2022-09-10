package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.io.StringWriter;
/* compiled from: PG */
/* renamed from: deuz  reason: default package */
/* loaded from: classes6.dex */
public final class deuz {
    private static final deqt a;

    static {
        deqv deqvVar = new deqv();
        deqvVar.b(deuu.class, new deuv());
        deqvVar.b(deuw.class, new deut());
        a = deqvVar.a();
    }

    static void a(String str, Intent intent) {
        Bundle bundle = new Bundle();
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        if (stringExtra != null) {
            bundle.putString("_nmid", stringExtra);
        }
        String d = d(intent);
        if (d != null) {
            bundle.putString("_nmn", d);
        }
        String e = e(intent);
        if (!TextUtils.isEmpty(e)) {
            bundle.putString("label", e);
        }
        String stringExtra2 = intent.getStringExtra("google.c.a.m_c");
        if (!TextUtils.isEmpty(stringExtra2)) {
            bundle.putString("message_channel", stringExtra2);
        }
        String j = j(intent);
        if (j != null) {
            bundle.putString("_nt", j);
        }
        String stringExtra3 = intent.getStringExtra("google.c.a.ts");
        if (stringExtra3 != null) {
            try {
                bundle.putInt("_nmt", Integer.parseInt(stringExtra3));
            } catch (NumberFormatException unused) {
            }
        }
        String stringExtra4 = intent.hasExtra("google.c.a.udt") ? intent.getStringExtra("google.c.a.udt") : null;
        if (stringExtra4 != null) {
            try {
                bundle.putInt("_ndt", Integer.parseInt(stringExtra4));
            } catch (NumberFormatException unused2) {
            }
        }
        String str2 = (intent.getExtras() == null || !deva.isNotification(intent.getExtras())) ? "data" : "display";
        if ("_nr".equals(str) || "_nf".equals(str)) {
            bundle.putString("_nmc", str2);
        }
        delh delhVar = (delh) dela.getInstance().d(delh.class);
        if (delhVar != null) {
            delhVar.a("fcm", str, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(Intent intent) {
        Object obj = intent.getExtras().get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb.append("Invalid TTL: ");
            sb.append(valueOf);
            sb.toString();
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(Intent intent) {
        return intent.getStringExtra("collapse_key");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d(Intent intent) {
        return intent.getStringExtra("google.c.a.c_l");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(Intent intent) {
        return intent.getStringExtra("google.c.a.m_l");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String f(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g() {
        return dela.getInstance().a().getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String h() {
        FirebaseInstanceId firebaseInstanceId = FirebaseInstanceId.getInstance(dela.getInstance());
        FirebaseInstanceId.d(firebaseInstanceId.d);
        if (firebaseInstanceId.l(firebaseInstanceId.h())) {
            firebaseInstanceId.b();
        }
        return firebaseInstanceId.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String i(Intent intent) {
        return (intent.getExtras() == null || !deva.isNotification(intent.getExtras())) ? "DATA_MESSAGE" : "DISPLAY_NOTIFICATION";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String j(Intent intent) {
        String stringExtra = intent.getStringExtra("from");
        if (stringExtra == null || !stringExtra.startsWith("/topics/")) {
            return null;
        }
        return stringExtra;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(Intent intent) {
        String stringExtra = intent.getStringExtra("google.delivered_priority");
        if (stringExtra == null) {
            if ("1".equals(intent.getStringExtra("google.priority_reduced"))) {
                return 2;
            }
            stringExtra = intent.getStringExtra("google.priority");
        }
        if ("high".equals(stringExtra)) {
            return 1;
        }
        return "normal".equals(stringExtra) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String l() {
        dela delaVar = dela.getInstance();
        String str = delaVar.c().c;
        if (str != null) {
            return str;
        }
        String str2 = delaVar.c().b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (!str3.isEmpty()) {
            return str3;
        }
        return null;
    }

    public static void logNotificationDismiss(Intent intent) {
        a("_nd", intent);
    }

    public static void logNotificationForeground(Intent intent) {
        a("_nf", intent);
    }

    public static void logNotificationOpen(Intent intent) {
        delh delhVar;
        if (intent != null && "1".equals(intent.getStringExtra("google.c.a.tc")) && (delhVar = (delh) dela.getInstance().d(delh.class)) != null) {
            String stringExtra = intent.getStringExtra("google.c.a.c_id");
            delhVar.b(stringExtra);
            Bundle bundle = new Bundle();
            bundle.putString("source", "Firebase");
            bundle.putString("medium", "notification");
            bundle.putString("campaign", stringExtra);
            delhVar.a("fcm", "_cmp", bundle);
        }
        a("_no", intent);
    }

    public static void logNotificationReceived(Intent intent) {
        if (shouldUploadScionMetrics(intent)) {
            a("_nr", intent);
        }
        if (!shouldUploadFirelogAnalytics(intent) || FirebaseMessaging.getTransportFactory() == null) {
            return;
        }
        deuu deuuVar = new deuu(new deuw(intent));
        try {
            deqt deqtVar = a;
            StringWriter stringWriter = new StringWriter();
            try {
                deqtVar.a(deuuVar, stringWriter);
            } catch (IOException unused) {
            }
            new clcs(stringWriter.toString(), clcv.VERY_LOW);
        } catch (deqm unused2) {
        }
    }

    private static boolean m(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    public static boolean shouldUploadFirelogAnalytics(Intent intent) {
        ApplicationInfo applicationInfo;
        if (intent != null) {
            if (!m(intent)) {
                try {
                    dela.getInstance();
                    Context a2 = dela.getInstance().a();
                    SharedPreferences sharedPreferences = a2.getSharedPreferences("com.google.firebase.messaging", 0);
                    if (sharedPreferences.contains("export_to_big_query")) {
                        return sharedPreferences.getBoolean("export_to_big_query", false);
                    }
                    PackageManager packageManager = a2.getPackageManager();
                    if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(a2.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                        return false;
                    }
                } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
                    return false;
                }
            }
            return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
        }
        return false;
    }

    public static boolean shouldUploadScionMetrics(Intent intent) {
        if (intent == null || m(intent)) {
            return false;
        }
        return "1".equals(intent.getStringExtra("google.c.a.e"));
    }
}

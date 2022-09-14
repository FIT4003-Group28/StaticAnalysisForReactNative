package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.n;
/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private static final c.e.b.k.a f9476a;

    static {
        c.e.b.k.i.d dVar = new c.e.b.k.i.d();
        dVar.a2(n.b.class, (c.e.b.k.d) new n.c());
        dVar.a2(n.class, (c.e.b.k.d) new n.a());
        f9476a = dVar.a();
    }

    private static int a(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Intent intent) {
        return intent.getStringExtra("collapse_key");
    }

    public static void a(Intent intent, c.e.a.a.f<String> fVar) {
        a("_nr", intent);
        if (fVar != null) {
            a("MESSAGE_DELIVERED", intent, fVar);
        }
    }

    static void a(String str, Intent intent) {
        Bundle bundle = new Bundle();
        String b2 = b(intent);
        if (b2 != null) {
            bundle.putString("_nmid", b2);
        }
        String c2 = c(intent);
        if (c2 != null) {
            bundle.putString("_nmn", c2);
        }
        String f2 = f(intent);
        if (!TextUtils.isEmpty(f2)) {
            bundle.putString("label", f2);
        }
        String d2 = d(intent);
        if (!TextUtils.isEmpty(d2)) {
            bundle.putString("message_channel", d2);
        }
        String k = k(intent);
        if (k != null) {
            bundle.putString("_nt", k);
        }
        String g2 = g(intent);
        if (g2 != null) {
            try {
                bundle.putInt("_nmt", Integer.parseInt(g2));
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e2);
            }
        }
        String m = m(intent);
        if (m != null) {
            try {
                bundle.putInt("_ndt", Integer.parseInt(m));
            } catch (NumberFormatException e3) {
                Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e3);
            }
        }
        String i = i(intent);
        if ("_nr".equals(str) || "_nf".equals(str)) {
            bundle.putString("_nmc", i);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf = String.valueOf(bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(valueOf).length());
            sb.append("Logging to scion event=");
            sb.append(str);
            sb.append(" scionPayload=");
            sb.append(valueOf);
            Log.d("FirebaseMessaging", sb.toString());
        }
        com.google.firebase.analytics.a.a aVar = (com.google.firebase.analytics.a.a) c.e.b.d.k().a(com.google.firebase.analytics.a.a.class);
        if (aVar != null) {
            aVar.a("fcm", str, bundle);
        } else {
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        }
    }

    private static void a(String str, Intent intent, c.e.a.a.f<String> fVar) {
        try {
            fVar.a(c.e.a.a.c.a(f9476a.a(new n.b(new n(str, intent)))));
        } catch (c.e.b.k.c unused) {
            Log.d("FirebaseMessaging", "Failed to encode big query analytics payload. Skip sending");
        }
    }

    static boolean a() {
        ApplicationInfo applicationInfo;
        try {
            c.e.b.d.k();
            Context b2 = c.e.b.d.k().b();
            SharedPreferences sharedPreferences = b2.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = b2.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(b2.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b() {
        return FirebaseInstanceId.getInstance(c.e.b.d.k()).e();
    }

    static String b(Intent intent) {
        return intent.getStringExtra("google.c.a.c_id");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c() {
        return c.e.b.d.k().b().getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(Intent intent) {
        return intent.getStringExtra("google.c.a.c_l");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d() {
        c.e.b.d k = c.e.b.d.k();
        String e2 = k.d().e();
        if (e2 != null) {
            return e2;
        }
        String b2 = k.d().b();
        if (!b2.startsWith("1:")) {
            return b2;
        }
        String[] split = b2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (!str.isEmpty()) {
            return str;
        }
        return null;
    }

    static String d(Intent intent) {
        return intent.getStringExtra("google.c.a.m_c");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String f(Intent intent) {
        return intent.getStringExtra("google.c.a.m_l");
    }

    static String g(Intent intent) {
        return intent.getStringExtra("google.c.a.ts");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String h(Intent intent) {
        return (intent.getExtras() == null || !r.a(intent.getExtras())) ? "DATA_MESSAGE" : "DISPLAY_NOTIFICATION";
    }

    static String i(Intent intent) {
        return (intent.getExtras() == null || !r.a(intent.getExtras())) ? "data" : "display";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(Intent intent) {
        String stringExtra = intent.getStringExtra("google.delivered_priority");
        if (stringExtra == null) {
            if ("1".equals(intent.getStringExtra("google.priority_reduced"))) {
                return 2;
            }
            stringExtra = intent.getStringExtra("google.priority");
        }
        return a(stringExtra);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String k(Intent intent) {
        String stringExtra = intent.getStringExtra("from");
        if (stringExtra == null || !stringExtra.startsWith("/topics/")) {
            return null;
        }
        return stringExtra;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(Intent intent) {
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
            Log.w("FirebaseMessaging", sb.toString());
            return 0;
        }
    }

    static String m(Intent intent) {
        if (intent.hasExtra("google.c.a.udt")) {
            return intent.getStringExtra("google.c.a.udt");
        }
        return null;
    }

    private static boolean n(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    public static void o(Intent intent) {
        a("_nd", intent);
    }

    public static void p(Intent intent) {
        a("_nf", intent);
    }

    public static void q(Intent intent) {
        r(intent);
        a("_no", intent);
    }

    private static void r(Intent intent) {
        if (intent == null) {
            return;
        }
        if (!"1".equals(intent.getStringExtra("google.c.a.tc"))) {
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return;
            }
            Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
            return;
        }
        com.google.firebase.analytics.a.a aVar = (com.google.firebase.analytics.a.a) c.e.b.d.k().a(com.google.firebase.analytics.a.a.class);
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
        }
        if (aVar == null) {
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            return;
        }
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        aVar.a("fcm", "_ln", stringExtra);
        Bundle bundle = new Bundle();
        bundle.putString("source", "Firebase");
        bundle.putString("medium", "notification");
        bundle.putString("campaign", stringExtra);
        aVar.a("fcm", "_cmp", bundle);
    }

    public static boolean s(Intent intent) {
        if (intent == null || n(intent)) {
            return false;
        }
        return a();
    }

    public static boolean t(Intent intent) {
        if (intent == null || n(intent)) {
            return false;
        }
        return "1".equals(intent.getStringExtra("google.c.a.e"));
    }
}

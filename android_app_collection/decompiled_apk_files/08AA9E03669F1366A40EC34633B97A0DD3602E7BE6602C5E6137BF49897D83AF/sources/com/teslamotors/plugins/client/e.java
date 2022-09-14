package com.teslamotors.plugins.client;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailability;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import junit.framework.Assert;
import okhttp3.Response;
import org.json.JSONObject;
import org.spongycastle.crypto.tls.CipherSuite;
/* compiled from: TeslaClient.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static e f5348a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f5349b = "e";
    private static String q;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5350c;

    /* renamed from: d  reason: collision with root package name */
    private b f5351d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private Map<String, Object> l;
    private final Context m;
    private HashMap<String, com.teslamotors.plugins.client.a.c> n;
    private String o;
    private String p;

    public String q() {
        return b.a.a.a.a.b.a.ANDROID_CLIENT_TYPE;
    }

    public static synchronized e a(Context context) {
        e eVar;
        synchronized (e.class) {
            if (f5348a == null) {
                f5348a = new e(context);
                f5348a.n = new HashMap<>();
            }
            eVar = f5348a;
        }
        return eVar;
    }

    private e(Context context) {
        this.f5350c = false;
        this.m = context;
        b(context);
        try {
            InputStream open = context.getAssets().open("shared/env.json");
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            JSONObject jSONObject = new JSONObject(new String(bArr, "UTF-8"));
            this.f = jSONObject.getString("OWNERAPI_BASE_URL");
            this.g = jSONObject.getString("OWNERAPI_CLIENT_ID");
            this.h = jSONObject.getString("OWNERAPI_CLIENT_SECRET");
            this.i = jSONObject.getString("STREAMING_SERVER_BASE_URL");
            this.j = jSONObject.getString("GOOGLE_CLOUD_MESSAGING_SENDER_ID");
            this.k = jSONObject.getString("COLORIZED_IMAGE_DIR_HASH");
            String optString = jSONObject.optString("GOOGLE_ANALYTICS_ID");
            if (optString == null || optString.length() <= 0) {
                optString = null;
            }
            this.e = optString;
            if (this.e != null) {
                this.f5350c = true;
                a(false);
            }
            InputStream open2 = context.getAssets().open("shared/ownerapi_endpoints.json");
            byte[] bArr2 = new byte[open2.available()];
            open2.read(bArr2);
            open2.close();
            this.l = com.teslamotors.plugins.client.d.b.a(new JSONObject(new String(bArr2, "UTF-8")));
        } catch (Exception e) {
            Log.e(f5349b, "Failed to initialize environment variables", e);
        }
    }

    public void a(String str, String str2) {
        g(str2);
    }

    public void a(String str, String str2, Exception exc) {
        if (exc == null) {
            exc = new Exception(str2);
        }
        com.teslamotors.plugins.crashlytics.b.a(exc);
        g(str2);
    }

    public void a(boolean z) {
        if ((this.f5350c || z) && this.e != null) {
            com.idehub.GoogleAnalyticsBridge.a.a(this.m).a(this.e, z);
        }
    }

    public void a(int i, String str) {
        if (!this.f5350c || this.e == null) {
            return;
        }
        com.idehub.GoogleAnalyticsBridge.a.a(this.m).a(this.e, i, str);
    }

    public void b(int i, String str) {
        if (!this.f5350c || this.e == null) {
            return;
        }
        com.idehub.GoogleAnalyticsBridge.a.a(this.m).a(this.e, i, str);
    }

    public File a() {
        return new File(this.m.getCacheDir(), "colorized_images");
    }

    public void a(b bVar) {
        this.f5351d = bVar;
    }

    public String b() {
        return Locale.getDefault().getCountry();
    }

    public String c() {
        return this.e;
    }

    public String d() {
        return this.f;
    }

    public String e() {
        return this.g;
    }

    public String f() {
        return this.h;
    }

    public String g() {
        return this.i;
    }

    public String h() {
        return this.j;
    }

    public String i() {
        return this.k;
    }

    public String j() {
        return com.teslamotors.plugins.client.b.b.e(this.m);
    }

    public String k() {
        return com.teslamotors.plugins.client.b.b.a(this.m);
    }

    public JSONObject l() {
        String b2 = com.teslamotors.plugins.client.b.b.b(this.m);
        if (b2 != null) {
            try {
                return new JSONObject(b2);
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public long m() {
        JSONObject l = l();
        if (l == null) {
            return -1L;
        }
        try {
            return Long.valueOf(l.getString("id")).longValue();
        } catch (Exception unused) {
            return -1L;
        }
    }

    public String n() {
        JSONObject l = l();
        if (l == null) {
            return null;
        }
        try {
            return l.getString("type");
        } catch (Exception unused) {
            return null;
        }
    }

    public com.teslamotors.plugins.client.c.a o() {
        String m = com.teslamotors.plugins.client.b.b.m(this.m);
        if (m != null) {
            try {
                return new com.teslamotors.plugins.client.c.a(m);
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public boolean p() {
        return com.teslamotors.plugins.client.b.b.c(this.m);
    }

    public String r() {
        return com.teslamotors.plugins.client.b.b.g(this.m);
    }

    public void a(String str) {
        com.teslamotors.plugins.client.b.b.a(this.m, str);
    }

    public String s() {
        return com.teslamotors.plugins.client.b.b.h(this.m);
    }

    public void b(String str) {
        com.teslamotors.plugins.client.b.b.b(this.m, str);
    }

    public static void a(String str, Context context) {
        if (q != null || str == null) {
            return;
        }
        q = str;
        if (str.equals(com.teslamotors.plugins.client.b.b.i(context))) {
            return;
        }
        com.teslamotors.plugins.client.b.b.c(context, str);
    }

    public boolean t() {
        return !com.teslamotors.plugins.client.b.b.d(this.m).equals(c(this.m));
    }

    public void u() {
        File a2 = a();
        if (a2.isDirectory()) {
            try {
                a(a2);
            } catch (Exception e) {
                Log.e(f5349b, "Unable to clear colorized image directory.", e);
            }
        }
    }

    public void v() {
        com.teslamotors.plugins.client.b.b.j(this.m);
        com.teslamotors.plugins.client.b.b.k(this.m);
    }

    public void a(JSONObject jSONObject) {
        jSONObject.getString("alert_id");
        jSONObject.put("time_received", System.currentTimeMillis() / 1000);
        jSONObject.put("device_type", q());
        jSONObject.put("device_token", r());
        a(jSONObject, 0L, "SEND_NOTIFICATION_CONFIRMATION", new com.teslamotors.plugins.client.a.b() { // from class: com.teslamotors.plugins.client.e.1
            @Override // com.teslamotors.plugins.client.a.b
            public void a(c cVar) {
            }

            @Override // com.teslamotors.plugins.client.a.b
            public void a(JSONObject jSONObject2) {
            }
        });
    }

    public boolean w() {
        int i;
        try {
            i = Settings.Secure.getInt(this.m.getContentResolver(), "location_mode");
        } catch (Settings.SettingNotFoundException e) {
            Log.e(f5349b, "Unable to determine Location Services status", e);
            i = 0;
        }
        return i != 0;
    }

    public boolean c(String str) {
        return Build.VERSION.SDK_INT < 23 || this.m.checkSelfPermission(str) == 0;
    }

    public void a(Activity activity, String str, com.teslamotors.plugins.client.a.c cVar) {
        if (Build.VERSION.SDK_INT > 22) {
            this.n.put(str, cVar);
            android.support.v4.app.a.a(activity, new String[]{str}, CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384);
            return;
        }
        cVar.a(-1, str);
    }

    public void a(Activity activity) {
        if (Build.VERSION.SDK_INT > 22) {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + this.m.getPackageName()));
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setFlags(268468224);
            try {
                activity.startActivityForResult(intent, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256);
            } catch (ActivityNotFoundException e) {
                Log.e(f5349b, "Unable to open ACTION_APPLICATION_DETAILS_SETTINGS Intent", e);
            }
        }
    }

    public void b(Activity activity) {
        Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setFlags(268468224);
        try {
            activity.startActivityForResult(intent, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384);
        } catch (ActivityNotFoundException e) {
            Log.e(f5349b, "Unable to open ACTION_LOCATION_SOURCE_SETTINGS Intent", e);
        }
    }

    public d a(JSONObject jSONObject, long j, String str, final com.teslamotors.plugins.client.a.b bVar) {
        String str2 = this.f + ((Map) this.l.get(str)).get("URI");
        Assert.assertEquals("Tried to send a vehicle OwnerAPI request with no vehicle ID", true, j > 0 || !str2.contains("{vehicle_id}"));
        String replace = str2.replace("{vehicle_id}", String.valueOf(j));
        String obj = ((Map) this.l.get(str)).get("TYPE").toString();
        HashMap<String, String> E = Boolean.valueOf(((Map) this.l.get(str)).get("AUTH").toString()).booleanValue() ? E() : new HashMap<>();
        E.put(b.a.a.a.a.b.a.HEADER_USER_AGENT, this.o);
        E.put("X-Tesla-User-Agent", this.p);
        if (bVar == null) {
            return d.a(com.teslamotors.plugins.client.d.e.b(this.m).a(obj, replace, E, jSONObject, null));
        }
        com.teslamotors.plugins.client.d.e.b(this.m).a(obj, replace, E, jSONObject, new com.teslamotors.plugins.client.a.e() { // from class: com.teslamotors.plugins.client.e.2
            @Override // com.teslamotors.plugins.client.a.e
            public void a(Exception exc) {
                Log.e(e.f5349b, "Failed OwnerAPI request:", exc);
                bVar.a(c.OWNERAPI_ERROR_UNKNOWN_ERROR);
            }

            @Override // com.teslamotors.plugins.client.a.e
            public void a(Response response) {
                d a2 = d.a(response);
                if (a2.a() != null) {
                    bVar.a(a2.a());
                } else {
                    bVar.a(a2.b());
                }
            }
        });
        return null;
    }

    public void a(String str, Integer num, Map<String, Object> map) {
        com.teslamotors.plugins.crashlytics.b.a(str, num, map);
    }

    public static boolean a(Activity activity, boolean z) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(activity);
        if (z) {
            googleApiAvailability.showErrorDialogFragment(activity, isGooglePlayServicesAvailable, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256);
        }
        return isGooglePlayServicesAvailable == 0;
    }

    public String x() {
        return com.teslamotors.plugins.client.b.b.f(this.m);
    }

    public String y() {
        String l = com.teslamotors.plugins.client.b.b.l(this.m);
        return l == null ? "" : l;
    }

    public String d(String str) {
        return com.teslamotors.plugins.client.b.b.f(h(str), this.m);
    }

    public void b(String str, String str2) {
        com.teslamotors.plugins.client.b.b.a(h(str), str2, this.m);
    }

    public void a(String str, String str2, Set<String> set) {
        com.teslamotors.plugins.client.b.b.a(g(str, str2), set, this.m);
    }

    public Set<String> c(String str, String str2) {
        return com.teslamotors.plugins.client.b.b.a(g(str, str2), this.m);
    }

    public void e(String str) {
        com.teslamotors.plugins.client.b.b.d(str, this.m);
    }

    public String z() {
        return com.teslamotors.plugins.client.b.b.n(this.m);
    }

    public long a(long j, String str, String str2) {
        return com.teslamotors.plugins.client.b.b.a(j, f(str, str2), this.m);
    }

    public long d(String str, String str2) {
        return com.teslamotors.plugins.client.b.b.b(f(str, str2), this.m);
    }

    public long e(String str, String str2) {
        return com.teslamotors.plugins.client.b.b.e(h(str, str2), this.m);
    }

    public long a(String str, String str2, long j) {
        return com.teslamotors.plugins.client.b.b.b(j, h(str, str2), this.m);
    }

    private HashMap<String, String> E() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Authorization", String.format("Bearer %s", k()));
        return hashMap;
    }

    public void a(int i, String[] strArr, int[] iArr) {
        for (String str : strArr) {
            if (this.n.containsKey(str)) {
                com.teslamotors.plugins.client.a.c cVar = this.n.get(str);
                if (iArr[Arrays.asList(strArr).indexOf(str)] == 0) {
                    cVar.a(i, str);
                } else {
                    cVar.b(i, str);
                }
            }
        }
    }

    private void b(Context context) {
        if (q == null) {
            q = com.teslamotors.plugins.client.b.b.i(context);
        }
        String c2 = c(context);
        this.p = String.format("TeslaApp/%s/%s/android/%s", c2, q, Build.VERSION.RELEASE);
        this.o = String.format("TeslaApp/%s %s", f(c2), System.getProperty("http.agent", String.format("%s %s)", Build.MODEL, Build.VERSION.CODENAME)));
    }

    private String c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName.replace(' ', '.');
        } catch (Exception unused) {
            return "Unknown";
        }
    }

    private String f(String str) {
        String[] split = str.split("-");
        return split.length > 0 ? split[split.length - 1] : "Unknown";
    }

    private void g(String str) {
        if (this.f5351d != null) {
            this.f5351d.emitDeviceEvent("log", str);
        }
    }

    private boolean a(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                a(file2);
            }
        }
        return file.delete();
    }

    private String f(String str, String str2) {
        return String.format("VEHICLE_%s_%s_INITIALIZATION_VECTOR", str2, str);
    }

    private String g(String str, String str2) {
        return String.format("VEHICLE_BLE_%s_%s_PERIPHERALS", str2, str);
    }

    private String h(String str) {
        return String.format("VEHICLE_BLE_%s_NAME", str);
    }

    private String h(String str, String str2) {
        return String.format("VEHICLE_%s_%s_WHITELIST_COUNT", str2, str);
    }

    public Class A() {
        try {
            return Class.forName(this.m.getPackageManager().getLaunchIntentForPackage(this.m.getPackageName()).getComponent().getClassName());
        } catch (ClassNotFoundException e) {
            Log.e(f5349b, "Could not determine main activity class", e);
            return null;
        }
    }

    public Intent B() {
        Class A = A();
        if (A == null) {
            return null;
        }
        return new Intent(this.m, A);
    }

    public String C() {
        Locale locale;
        if (Build.VERSION.SDK_INT >= 24) {
            locale = this.m.getResources().getConfiguration().getLocales().get(0);
        } else {
            locale = this.m.getResources().getConfiguration().locale;
        }
        return locale.getLanguage() + "-" + locale.getCountry();
    }
}

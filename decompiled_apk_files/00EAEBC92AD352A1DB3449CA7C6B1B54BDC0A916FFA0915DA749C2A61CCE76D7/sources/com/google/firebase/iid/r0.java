package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class r0 {

    /* renamed from: a  reason: collision with root package name */
    final SharedPreferences f9278a;

    /* renamed from: b  reason: collision with root package name */
    final Context f9279b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Long> f9280c = new a.e.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d  reason: collision with root package name */
        private static final long f9281d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a  reason: collision with root package name */
        final String f9282a;

        /* renamed from: b  reason: collision with root package name */
        final String f9283b;

        /* renamed from: c  reason: collision with root package name */
        final long f9284c;

        private a(String str, String str2, long j) {
            this.f9282a = str;
            this.f9283b = str2;
            this.f9284c = j;
        }

        static String a(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("Failed to encode token: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }

        static a b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                sb.append("Failed to parse token: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean a(String str) {
            return System.currentTimeMillis() > this.f9284c + f9281d || !str.equals(this.f9283b);
        }
    }

    public r0(Context context) {
        this.f9279b = context;
        this.f9278a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        c("com.google.android.gms.appid-no-backup");
    }

    static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    private String c(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    private void c(String str) {
        File file = new File(a.g.e.b.c(this.f9279b), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || b()) {
                return;
            }
            Log.i("FirebaseInstanceId", "App restored, clearing state");
            a();
            FirebaseInstanceId.n().l();
        } catch (IOException e2) {
            if (!Log.isLoggable("FirebaseInstanceId", 3)) {
                return;
            }
            String valueOf = String.valueOf(e2.getMessage());
            Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
        }
    }

    private void d(String str) {
        SharedPreferences.Editor edit = this.f9278a.edit();
        for (String str2 : this.f9278a.getAll().keySet()) {
            if (str2.startsWith(str)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }

    private long e(String str) {
        String string = this.f9278a.getString(a(str, "cre"), null);
        if (string != null) {
            try {
                return Long.parseLong(string);
            } catch (NumberFormatException unused) {
                return 0L;
            }
        }
        return 0L;
    }

    private long f(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.f9278a.contains(a(str, "cre"))) {
            SharedPreferences.Editor edit = this.f9278a.edit();
            edit.putString(a(str, "cre"), String.valueOf(currentTimeMillis));
            edit.commit();
            return currentTimeMillis;
        }
        return e(str);
    }

    public synchronized void a() {
        this.f9280c.clear();
        this.f9278a.edit().clear().commit();
    }

    public synchronized void a(String str) {
        d(String.valueOf(str).concat("|T|"));
    }

    public synchronized void a(String str, String str2, String str3) {
        String c2 = c(str, str2, str3);
        SharedPreferences.Editor edit = this.f9278a.edit();
        edit.remove(c2);
        edit.commit();
    }

    public synchronized void a(String str, String str2, String str3, String str4, String str5) {
        String a2 = a.a(str4, str5, System.currentTimeMillis());
        if (a2 == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f9278a.edit();
        edit.putString(c(str, str2, str3), a2);
        edit.commit();
    }

    public synchronized long b(String str) {
        long f2;
        f2 = f(str);
        this.f9280c.put(str, Long.valueOf(f2));
        return f2;
    }

    public synchronized a b(String str, String str2, String str3) {
        return a.b(this.f9278a.getString(c(str, str2, str3), null));
    }

    public synchronized boolean b() {
        return this.f9278a.getAll().isEmpty();
    }
}

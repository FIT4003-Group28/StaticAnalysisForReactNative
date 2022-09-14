package com.google.firebase.crashlytics.c.h;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class y implements z {

    /* renamed from: f  reason: collision with root package name */
    private static final Pattern f8793f = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: g  reason: collision with root package name */
    private static final String f8794g = Pattern.quote("/");

    /* renamed from: a  reason: collision with root package name */
    private final a0 f8795a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f8796b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8797c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.firebase.iid.z0.a f8798d;

    /* renamed from: e  reason: collision with root package name */
    private String f8799e;

    public y(Context context, String str, com.google.firebase.iid.z0.a aVar) {
        if (context != null) {
            if (str == null) {
                throw new IllegalArgumentException("appIdentifier must not be null");
            }
            this.f8796b = context;
            this.f8797c = str;
            this.f8798d = aVar;
            this.f8795a = new a0();
            return;
        }
        throw new IllegalArgumentException("appContext must not be null");
    }

    private static String a(String str) {
        if (str == null) {
            return null;
        }
        return f8793f.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    private synchronized String a(String str, SharedPreferences sharedPreferences) {
        String a2;
        a2 = a(UUID.randomUUID().toString());
        com.google.firebase.crashlytics.c.b a3 = com.google.firebase.crashlytics.c.b.a();
        a3.a("Created new Crashlytics IID: " + a2);
        sharedPreferences.edit().putString("crashlytics.installation.id", a2).putString("firebase.installation.id", str).apply();
        return a2;
    }

    private synchronized void a(String str, String str2, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        com.google.firebase.crashlytics.c.b a2 = com.google.firebase.crashlytics.c.b.a();
        a2.a("Migrating legacy Crashlytics IID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", str).putString("firebase.installation.id", str2).apply();
        sharedPreferences2.edit().remove("crashlytics.installation.id").remove("crashlytics.advertising.id").apply();
    }

    private String b(String str) {
        return str.replaceAll(f8794g, "");
    }

    @Override // com.google.firebase.crashlytics.c.h.z
    public synchronized String a() {
        String a2;
        if (this.f8799e != null) {
            return this.f8799e;
        }
        SharedPreferences h2 = h.h(this.f8796b);
        String a3 = this.f8798d.a();
        String string = h2.getString("firebase.installation.id", null);
        if (string == null) {
            SharedPreferences d2 = h.d(this.f8796b);
            String string2 = d2.getString("crashlytics.installation.id", null);
            com.google.firebase.crashlytics.c.b a4 = com.google.firebase.crashlytics.c.b.a();
            a4.a("No cached FID; legacy id is " + string2);
            if (string2 == null) {
                this.f8799e = a(a3, h2);
            } else {
                this.f8799e = string2;
                a(string2, a3, h2, d2);
            }
            return this.f8799e;
        }
        if (string.equals(a3)) {
            this.f8799e = h2.getString("crashlytics.installation.id", null);
            com.google.firebase.crashlytics.c.b a5 = com.google.firebase.crashlytics.c.b.a();
            a5.a("Found matching FID, using Crashlytics IID: " + this.f8799e);
            if (this.f8799e == null) {
                a2 = a(a3, h2);
            }
            return this.f8799e;
        }
        a2 = a(a3, h2);
        this.f8799e = a2;
        return this.f8799e;
    }

    public String b() {
        return this.f8797c;
    }

    public String c() {
        return this.f8795a.a(this.f8796b);
    }

    public String d() {
        return String.format(Locale.US, "%s/%s", b(Build.MANUFACTURER), b(Build.MODEL));
    }

    public String e() {
        return b(Build.VERSION.INCREMENTAL);
    }

    public String f() {
        return b(Build.VERSION.RELEASE);
    }
}

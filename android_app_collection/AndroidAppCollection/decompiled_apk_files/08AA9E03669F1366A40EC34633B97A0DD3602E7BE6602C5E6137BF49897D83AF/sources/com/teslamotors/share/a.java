package com.teslamotors.share;

import android.content.Context;
import android.content.Intent;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: Destination.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private String f5440a;

    /* renamed from: b  reason: collision with root package name */
    private String f5441b;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f5442c = new JSONObject();

    public a(String str, String str2) {
        this.f5440a = str;
        this.f5441b = str2;
    }

    public void a(String str, JSONObject jSONObject) {
        try {
            this.f5442c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void a(String str, String str2) {
        try {
            this.f5442c.put(str, str2);
        } catch (JSONException unused) {
        }
    }

    public static boolean a(a aVar) {
        return aVar != null && aVar.f5442c.length() > 0;
    }

    public JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", this.f5440a);
            jSONObject.put("value", this.f5442c);
            jSONObject.put("locale", this.f5441b);
            jSONObject.put("timestamp_ms", Long.toString(System.currentTimeMillis()));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public void a(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.SUBJECT");
        if (stringExtra != null) {
            a("android.intent.extra.SUBJECT", stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("android.intent.extra.TEXT");
        if (stringExtra2 != null) {
            a("android.intent.extra.TEXT", stringExtra2);
        }
    }

    public void a(Context context, Intent intent) {
        JSONObject a2 = d.a(context, intent);
        if (a2 != null) {
            a("android.intent.extra.STREAM", a2);
        }
    }

    public void b(Intent intent) {
        String scheme = intent.getScheme();
        String action = intent.getAction();
        String dataString = intent.getDataString();
        String type = intent.getType();
        if (scheme != null) {
            a("android.intent.SCHEME", scheme);
        }
        if (action != null) {
            a("android.intent.ACTION", action);
        }
        if (dataString != null) {
            a("android.intent.DATA", dataString);
        }
        if (type != null) {
            a("android.intent.TYPE", type);
        }
    }
}

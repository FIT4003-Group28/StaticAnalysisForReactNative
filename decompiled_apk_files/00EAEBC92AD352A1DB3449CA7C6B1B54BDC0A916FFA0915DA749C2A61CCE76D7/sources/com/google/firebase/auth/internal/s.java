package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import c.e.a.b.d.e.y2;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private Context f8390a;

    /* renamed from: b  reason: collision with root package name */
    private String f8391b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f8392c;

    /* renamed from: d  reason: collision with root package name */
    private com.google.android.gms.common.l.a f8393d;

    public s(Context context, String str) {
        com.google.android.gms.common.internal.s.a(context);
        com.google.android.gms.common.internal.s.b(str);
        this.f8391b = str;
        this.f8390a = context.getApplicationContext();
        this.f8392c = this.f8390a.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", this.f8391b), 0);
        this.f8393d = new com.google.android.gms.common.l.a("StorageHelpers", new String[0]);
    }

    private final k0 a(JSONObject jSONObject) {
        JSONArray jSONArray;
        m0 a2;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z = jSONObject.getBoolean("anonymous");
            String str = "2";
            String string3 = jSONObject.getString("version");
            if (string3 != null) {
                str = string3;
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray2.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(g0.a(jSONArray2.getString(i)));
            }
            k0 k0Var = new k0(c.e.b.d.a(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                k0Var.a(y2.b(string));
            }
            if (!z) {
                k0Var.j();
            }
            k0Var.e(str);
            if (jSONObject.has("userMetadata") && (a2 = m0.a(jSONObject.getJSONObject("userMetadata"))) != null) {
                k0Var.a(a2);
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray.getString(i2));
                    arrayList2.add("phone".equals(jSONObject2.optString("factorIdKey")) ? com.google.firebase.auth.o0.a(jSONObject2) : null);
                }
                k0Var.b(arrayList2);
            }
            return k0Var;
        } catch (com.google.firebase.auth.v0.b | ArrayIndexOutOfBoundsException | IllegalArgumentException | JSONException e2) {
            this.f8393d.a(e2);
            return null;
        }
    }

    private final String c(com.google.firebase.auth.z zVar) {
        JSONObject jSONObject = new JSONObject();
        if (k0.class.isAssignableFrom(zVar.getClass())) {
            k0 k0Var = (k0) zVar;
            try {
                jSONObject.put("cachedTokenState", k0Var.z());
                jSONObject.put("applicationName", k0Var.y().c());
                jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
                if (k0Var.B() != null) {
                    JSONArray jSONArray = new JSONArray();
                    List<g0> B = k0Var.B();
                    for (int i = 0; i < B.size(); i++) {
                        jSONArray.put(B.get(i).j());
                    }
                    jSONObject.put("userInfos", jSONArray);
                }
                jSONObject.put("anonymous", k0Var.u());
                jSONObject.put("version", "2");
                if (k0Var.r() != null) {
                    jSONObject.put("userMetadata", ((m0) k0Var.r()).a());
                }
                List<com.google.firebase.auth.h0> a2 = ((o0) k0Var.s()).a();
                if (a2 != null && !a2.isEmpty()) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i2 = 0; i2 < a2.size(); i2++) {
                        jSONArray2.put(a2.get(i2).q());
                    }
                    jSONObject.put("userMultiFactorInfo", jSONArray2);
                }
                return jSONObject.toString();
            } catch (Exception e2) {
                this.f8393d.b("Failed to turn object into JSON", e2, new Object[0]);
                throw new com.google.firebase.auth.v0.b(e2);
            }
        }
        return null;
    }

    public final com.google.firebase.auth.z a() {
        String string = this.f8392c.getString("com.google.firebase.auth.FIREBASE_USER", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                return a(jSONObject);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final void a(com.google.firebase.auth.z zVar) {
        com.google.android.gms.common.internal.s.a(zVar);
        String c2 = c(zVar);
        if (!TextUtils.isEmpty(c2)) {
            this.f8392c.edit().putString("com.google.firebase.auth.FIREBASE_USER", c2).apply();
        }
    }

    public final void a(com.google.firebase.auth.z zVar, y2 y2Var) {
        com.google.android.gms.common.internal.s.a(zVar);
        com.google.android.gms.common.internal.s.a(y2Var);
        this.f8392c.edit().putString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", zVar.i()), y2Var.s()).apply();
    }

    public final void a(String str) {
        this.f8392c.edit().remove(str).apply();
    }

    public final y2 b(com.google.firebase.auth.z zVar) {
        com.google.android.gms.common.internal.s.a(zVar);
        String string = this.f8392c.getString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", zVar.i()), null);
        if (string != null) {
            return y2.b(string);
        }
        return null;
    }
}

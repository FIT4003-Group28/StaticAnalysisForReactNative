package com.google.firebase.auth.internal;

import android.text.TextUtils;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
final class m {

    /* renamed from: a  reason: collision with root package name */
    private static final com.google.android.gms.common.l.a f8377a = new com.google.android.gms.common.l.a("JSONParser", new String[0]);

    private static List<Object> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = a((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static Map<String, Object> a(String str) {
        com.google.android.gms.common.internal.s.b(str);
        List<String> a2 = c.e.a.b.d.e.l.a('.').a(str);
        if (a2.size() < 2) {
            com.google.android.gms.common.l.a aVar = f8377a;
            String valueOf = String.valueOf(str);
            aVar.a(valueOf.length() != 0 ? "Invalid idToken ".concat(valueOf) : new String("Invalid idToken "), new Object[0]);
        } else {
            try {
                Map<String, Object> b2 = b(new String(com.google.android.gms.common.util.c.b(a2.get(1)), "UTF-8"));
                return b2 == null ? c.e.a.b.d.e.b0.d() : b2;
            } catch (UnsupportedEncodingException e2) {
                f8377a.a("Unable to decode token", e2, new Object[0]);
            }
        }
        return c.e.a.b.d.e.b0.d();
    }

    private static Map<String, Object> a(JSONObject jSONObject) {
        a.e.a aVar = new a.e.a();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = a((JSONObject) obj);
            }
            aVar.put(next, obj);
        }
        return aVar;
    }

    public static Map<String, Object> b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject == JSONObject.NULL) {
                return null;
            }
            return a(jSONObject);
        } catch (Exception e2) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new com.google.firebase.auth.v0.b(e2);
        }
    }
}

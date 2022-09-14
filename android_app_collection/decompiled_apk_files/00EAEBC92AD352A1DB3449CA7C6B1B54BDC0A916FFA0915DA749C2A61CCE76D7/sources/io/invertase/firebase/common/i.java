package io.invertase.firebase.common;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class i {

    /* renamed from: b  reason: collision with root package name */
    private static i f10336b = new i();

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f10337a;

    private i() {
        try {
            this.f10337a = new JSONObject("{}");
        } catch (JSONException unused) {
        }
    }

    public static i c() {
        return f10336b;
    }

    public long a(String str, long j) {
        JSONObject jSONObject = this.f10337a;
        return jSONObject == null ? j : jSONObject.optLong(str, j);
    }

    public WritableMap a() {
        WritableMap createMap = Arguments.createMap();
        JSONArray names = this.f10337a.names();
        for (int i = 0; i < names.length(); i++) {
            try {
                String string = names.getString(i);
                l.a(string, this.f10337a.get(string), createMap);
            } catch (JSONException unused) {
            }
        }
        return createMap;
    }

    public boolean a(String str) {
        JSONObject jSONObject = this.f10337a;
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.has(str);
    }

    public boolean a(String str, boolean z) {
        JSONObject jSONObject = this.f10337a;
        return jSONObject == null ? z : jSONObject.optBoolean(str, z);
    }

    public String b() {
        return "{}";
    }
}

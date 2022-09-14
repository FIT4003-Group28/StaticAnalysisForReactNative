package com.google.firebase.crashlytics.c.q;

import com.google.firebase.crashlytics.c.h.s;
import org.json.JSONObject;
/* loaded from: classes.dex */
class b implements g {
    private static long a(s sVar, long j, JSONObject jSONObject) {
        return jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : sVar.a() + (j * 1000);
    }

    private static com.google.firebase.crashlytics.c.q.i.b a(JSONObject jSONObject) {
        return new com.google.firebase.crashlytics.c.q.i.b(jSONObject.getString("status"), jSONObject.getString("url"), jSONObject.getString("reports_url"), jSONObject.getString("ndk_reports_url"), jSONObject.optBoolean("update_required", false));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.google.firebase.crashlytics.c.q.i.e a(s sVar) {
        JSONObject jSONObject = new JSONObject();
        return new com.google.firebase.crashlytics.c.q.i.f(a(sVar, 3600L, jSONObject), null, c(jSONObject), b(jSONObject), 0, 3600);
    }

    private static com.google.firebase.crashlytics.c.q.i.c b(JSONObject jSONObject) {
        return new com.google.firebase.crashlytics.c.q.i.c(jSONObject.optBoolean("collect_reports", true));
    }

    private static com.google.firebase.crashlytics.c.q.i.d c(JSONObject jSONObject) {
        return new com.google.firebase.crashlytics.c.q.i.d(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    @Override // com.google.firebase.crashlytics.c.q.g
    public com.google.firebase.crashlytics.c.q.i.f a(s sVar, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new com.google.firebase.crashlytics.c.q.i.f(a(sVar, optInt2, jSONObject), a(jSONObject.getJSONObject("app")), c(jSONObject.getJSONObject("session")), b(jSONObject.getJSONObject("features")), optInt, optInt2);
    }
}

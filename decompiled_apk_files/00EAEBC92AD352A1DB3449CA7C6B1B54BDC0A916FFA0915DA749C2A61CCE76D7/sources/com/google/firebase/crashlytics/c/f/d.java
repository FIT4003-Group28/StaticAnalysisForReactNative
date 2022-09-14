package com.google.firebase.crashlytics.c.f;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class d implements b, com.google.firebase.crashlytics.c.g.b {

    /* renamed from: a  reason: collision with root package name */
    private com.google.firebase.crashlytics.c.g.a f8604a;

    private static String a(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // com.google.firebase.crashlytics.c.g.b
    public void a(com.google.firebase.crashlytics.c.g.a aVar) {
        this.f8604a = aVar;
        com.google.firebase.crashlytics.c.b.a().a("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // com.google.firebase.crashlytics.c.f.b
    public void b(String str, Bundle bundle) {
        com.google.firebase.crashlytics.c.g.a aVar = this.f8604a;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + a(str, bundle));
            } catch (JSONException unused) {
                com.google.firebase.crashlytics.c.b.a().d("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}

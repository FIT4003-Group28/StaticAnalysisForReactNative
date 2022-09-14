package com.google.firebase.crashlytics.c.q;

import com.google.firebase.crashlytics.c.h.s;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final s f9120a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(s sVar) {
        this.f9120a = sVar;
    }

    private static g a(int i) {
        return i != 3 ? new b() : new h();
    }

    public com.google.firebase.crashlytics.c.q.i.f a(JSONObject jSONObject) {
        return a(jSONObject.getInt("settings_version")).a(this.f9120a, jSONObject);
    }
}

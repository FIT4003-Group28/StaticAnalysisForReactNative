package com.google.firebase.crashlytics.c.q.j;

import com.google.firebase.crashlytics.c.h.h;
import com.google.firebase.crashlytics.c.h.m;
import com.google.firebase.crashlytics.c.q.i.g;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class d extends com.google.firebase.crashlytics.c.h.a implements e {

    /* renamed from: f  reason: collision with root package name */
    private com.google.firebase.crashlytics.c.b f9153f;

    public d(String str, String str2, com.google.firebase.crashlytics.c.l.c cVar) {
        this(str, str2, cVar, com.google.firebase.crashlytics.c.l.a.GET, com.google.firebase.crashlytics.c.b.a());
    }

    d(String str, String str2, com.google.firebase.crashlytics.c.l.c cVar, com.google.firebase.crashlytics.c.l.a aVar, com.google.firebase.crashlytics.c.b bVar) {
        super(str, str2, cVar, aVar);
        this.f9153f = bVar;
    }

    private com.google.firebase.crashlytics.c.l.b a(com.google.firebase.crashlytics.c.l.b bVar, g gVar) {
        a(bVar, "X-CRASHLYTICS-GOOGLE-APP-ID", gVar.f9144a);
        a(bVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        a(bVar, "X-CRASHLYTICS-API-CLIENT-VERSION", m.i());
        a(bVar, "Accept", "application/json");
        a(bVar, "X-CRASHLYTICS-DEVICE-MODEL", gVar.f9145b);
        a(bVar, "X-CRASHLYTICS-OS-BUILD-VERSION", gVar.f9146c);
        a(bVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", gVar.f9147d);
        a(bVar, "X-CRASHLYTICS-INSTALLATION-ID", gVar.f9148e.a());
        return bVar;
    }

    private Map<String, String> a(g gVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", gVar.f9151h);
        hashMap.put("display_version", gVar.f9150g);
        hashMap.put("source", Integer.toString(gVar.i));
        String str = gVar.f9149f;
        if (!h.b(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    private JSONObject a(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e2) {
            com.google.firebase.crashlytics.c.b bVar = this.f9153f;
            bVar.a("Failed to parse settings JSON from " + b(), e2);
            com.google.firebase.crashlytics.c.b bVar2 = this.f9153f;
            bVar2.a("Settings response " + str);
            return null;
        }
    }

    private void a(com.google.firebase.crashlytics.c.l.b bVar, String str, String str2) {
        if (str2 != null) {
            bVar.a(str, str2);
        }
    }

    JSONObject a(com.google.firebase.crashlytics.c.l.d dVar) {
        int b2 = dVar.b();
        com.google.firebase.crashlytics.c.b bVar = this.f9153f;
        bVar.a("Settings result was: " + b2);
        if (a(b2)) {
            return a(dVar.a());
        }
        com.google.firebase.crashlytics.c.b bVar2 = this.f9153f;
        bVar2.b("Failed to retrieve settings from " + b());
        return null;
    }

    @Override // com.google.firebase.crashlytics.c.q.j.e
    public JSONObject a(g gVar, boolean z) {
        if (z) {
            try {
                Map<String, String> a2 = a(gVar);
                com.google.firebase.crashlytics.c.l.b a3 = a(a2);
                a(a3, gVar);
                com.google.firebase.crashlytics.c.b bVar = this.f9153f;
                bVar.a("Requesting settings from " + b());
                com.google.firebase.crashlytics.c.b bVar2 = this.f9153f;
                bVar2.a("Settings query params were: " + a2);
                com.google.firebase.crashlytics.c.l.d a4 = a3.a();
                com.google.firebase.crashlytics.c.b bVar3 = this.f9153f;
                bVar3.a("Settings request ID: " + a4.a("X-REQUEST-ID"));
                return a(a4);
            } catch (IOException e2) {
                this.f9153f.b("Settings request failed.", e2);
                return null;
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }

    boolean a(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }
}

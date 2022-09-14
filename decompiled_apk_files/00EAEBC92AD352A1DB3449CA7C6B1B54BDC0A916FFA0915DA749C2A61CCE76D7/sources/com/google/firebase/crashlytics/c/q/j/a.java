package com.google.firebase.crashlytics.c.q.j;

import com.google.firebase.crashlytics.c.h.e0;
import com.google.firebase.crashlytics.c.h.h;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class a extends com.google.firebase.crashlytics.c.h.a implements b {

    /* renamed from: f  reason: collision with root package name */
    private final String f9152f;

    public a(String str, String str2, com.google.firebase.crashlytics.c.l.c cVar, com.google.firebase.crashlytics.c.l.a aVar, String str3) {
        super(str, str2, cVar, aVar);
        this.f9152f = str3;
    }

    private com.google.firebase.crashlytics.c.l.b a(com.google.firebase.crashlytics.c.l.b bVar, com.google.firebase.crashlytics.c.q.i.a aVar) {
        bVar.a("X-CRASHLYTICS-ORG-ID", aVar.f9121a);
        bVar.a("X-CRASHLYTICS-GOOGLE-APP-ID", aVar.f9122b);
        bVar.a("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        bVar.a("X-CRASHLYTICS-API-CLIENT-VERSION", this.f9152f);
        return bVar;
    }

    private com.google.firebase.crashlytics.c.l.b b(com.google.firebase.crashlytics.c.l.b bVar, com.google.firebase.crashlytics.c.q.i.a aVar) {
        bVar.b("org_id", aVar.f9121a);
        bVar.b("app[identifier]", aVar.f9123c);
        bVar.b("app[name]", aVar.f9127g);
        bVar.b("app[display_version]", aVar.f9124d);
        bVar.b("app[build_version]", aVar.f9125e);
        bVar.b("app[source]", Integer.toString(aVar.f9128h));
        bVar.b("app[minimum_sdk_version]", aVar.i);
        bVar.b("app[built_sdk_version]", aVar.j);
        if (!h.b(aVar.f9126f)) {
            bVar.b("app[instance_identifier]", aVar.f9126f);
        }
        return bVar;
    }

    public boolean a(com.google.firebase.crashlytics.c.q.i.a aVar, boolean z) {
        if (z) {
            com.google.firebase.crashlytics.c.l.b a2 = a();
            a(a2, aVar);
            b(a2, aVar);
            com.google.firebase.crashlytics.c.b a3 = com.google.firebase.crashlytics.c.b.a();
            a3.a("Sending app info to " + b());
            try {
                com.google.firebase.crashlytics.c.l.d a4 = a2.a();
                int b2 = a4.b();
                String str = "POST".equalsIgnoreCase(a2.b()) ? "Create" : "Update";
                com.google.firebase.crashlytics.c.b a5 = com.google.firebase.crashlytics.c.b.a();
                a5.a(str + " app request ID: " + a4.a("X-REQUEST-ID"));
                com.google.firebase.crashlytics.c.b a6 = com.google.firebase.crashlytics.c.b.a();
                a6.a("Result was " + b2);
                return e0.a(b2) == 0;
            } catch (IOException e2) {
                com.google.firebase.crashlytics.c.b.a().b("HTTP request failed.", e2);
                throw new RuntimeException(e2);
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }
}

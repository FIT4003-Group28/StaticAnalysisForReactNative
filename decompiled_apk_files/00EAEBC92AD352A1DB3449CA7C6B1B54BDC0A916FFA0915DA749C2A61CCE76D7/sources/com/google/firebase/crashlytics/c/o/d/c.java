package com.google.firebase.crashlytics.c.o.d;

import com.google.firebase.crashlytics.c.h.e0;
import java.io.File;
import java.io.IOException;
import java.util.Map;
/* loaded from: classes.dex */
public class c extends com.google.firebase.crashlytics.c.h.a implements b {

    /* renamed from: f  reason: collision with root package name */
    private final String f9096f;

    c(String str, String str2, com.google.firebase.crashlytics.c.l.c cVar, com.google.firebase.crashlytics.c.l.a aVar, String str3) {
        super(str, str2, cVar, aVar);
        this.f9096f = str3;
    }

    public c(String str, String str2, com.google.firebase.crashlytics.c.l.c cVar, String str3) {
        this(str, str2, cVar, com.google.firebase.crashlytics.c.l.a.POST, str3);
    }

    private com.google.firebase.crashlytics.c.l.b a(com.google.firebase.crashlytics.c.l.b bVar, com.google.firebase.crashlytics.c.o.c.a aVar) {
        bVar.a("X-CRASHLYTICS-GOOGLE-APP-ID", aVar.f9084b);
        bVar.a("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        bVar.a("X-CRASHLYTICS-API-CLIENT-VERSION", this.f9096f);
        for (Map.Entry<String, String> entry : aVar.f9085c.b().entrySet()) {
            bVar.a(entry);
        }
        return bVar;
    }

    private com.google.firebase.crashlytics.c.l.b a(com.google.firebase.crashlytics.c.l.b bVar, com.google.firebase.crashlytics.c.o.c.c cVar) {
        File[] c2;
        bVar.b("report[identifier]", cVar.a());
        if (cVar.c().length == 1) {
            com.google.firebase.crashlytics.c.b.a().a("Adding single file " + cVar.d() + " to report " + cVar.a());
            bVar.a("report[file]", cVar.d(), "application/octet-stream", cVar.e());
            return bVar;
        }
        int i = 0;
        for (File file : cVar.c()) {
            com.google.firebase.crashlytics.c.b.a().a("Adding file " + file.getName() + " to report " + cVar.a());
            StringBuilder sb = new StringBuilder();
            sb.append("report[file");
            sb.append(i);
            sb.append("]");
            bVar.a(sb.toString(), file.getName(), "application/octet-stream", file);
            i++;
        }
        return bVar;
    }

    @Override // com.google.firebase.crashlytics.c.o.d.b
    public boolean a(com.google.firebase.crashlytics.c.o.c.a aVar, boolean z) {
        if (z) {
            com.google.firebase.crashlytics.c.l.b a2 = a();
            a(a2, aVar);
            a(a2, aVar.f9085c);
            com.google.firebase.crashlytics.c.b a3 = com.google.firebase.crashlytics.c.b.a();
            a3.a("Sending report to: " + b());
            try {
                com.google.firebase.crashlytics.c.l.d a4 = a2.a();
                int b2 = a4.b();
                com.google.firebase.crashlytics.c.b a5 = com.google.firebase.crashlytics.c.b.a();
                a5.a("Create report request ID: " + a4.a("X-REQUEST-ID"));
                com.google.firebase.crashlytics.c.b a6 = com.google.firebase.crashlytics.c.b.a();
                a6.a("Result was: " + b2);
                return e0.a(b2) == 0;
            } catch (IOException e2) {
                com.google.firebase.crashlytics.c.b.a().b("Create report HTTP request failed.", e2);
                throw new RuntimeException(e2);
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }
}

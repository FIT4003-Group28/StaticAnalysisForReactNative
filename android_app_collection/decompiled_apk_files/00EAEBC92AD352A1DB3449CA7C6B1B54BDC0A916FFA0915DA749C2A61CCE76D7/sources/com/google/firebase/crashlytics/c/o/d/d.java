package com.google.firebase.crashlytics.c.o.d;

import com.google.firebase.crashlytics.c.h.e0;
import com.google.firebase.crashlytics.c.h.m;
import java.io.File;
import java.io.IOException;
/* loaded from: classes.dex */
public class d extends com.google.firebase.crashlytics.c.h.a implements b {

    /* renamed from: f  reason: collision with root package name */
    private final String f9097f;

    public d(String str, String str2, com.google.firebase.crashlytics.c.l.c cVar, String str3) {
        super(str, str2, cVar, com.google.firebase.crashlytics.c.l.a.POST);
        this.f9097f = str3;
    }

    private com.google.firebase.crashlytics.c.l.b a(com.google.firebase.crashlytics.c.l.b bVar, String str) {
        bVar.a("User-Agent", "Crashlytics Android SDK/" + m.i());
        bVar.a("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        bVar.a("X-CRASHLYTICS-API-CLIENT-VERSION", this.f9097f);
        bVar.a("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        return bVar;
    }

    private com.google.firebase.crashlytics.c.l.b a(com.google.firebase.crashlytics.c.l.b bVar, String str, com.google.firebase.crashlytics.c.o.c.c cVar) {
        File[] c2;
        String name;
        String str2;
        if (str != null) {
            bVar.b("org_id", str);
        }
        bVar.b("report_id", cVar.a());
        for (File file : cVar.c()) {
            if (file.getName().equals("minidump")) {
                name = file.getName();
                str2 = "minidump_file";
            } else if (file.getName().equals("metadata")) {
                name = file.getName();
                str2 = "crash_meta_file";
            } else if (file.getName().equals("binaryImages")) {
                name = file.getName();
                str2 = "binary_images_file";
            } else if (file.getName().equals("session")) {
                name = file.getName();
                str2 = "session_meta_file";
            } else if (file.getName().equals("app")) {
                name = file.getName();
                str2 = "app_meta_file";
            } else if (file.getName().equals("device")) {
                name = file.getName();
                str2 = "device_meta_file";
            } else if (file.getName().equals("os")) {
                name = file.getName();
                str2 = "os_meta_file";
            } else if (file.getName().equals("user")) {
                name = file.getName();
                str2 = "user_meta_file";
            } else if (file.getName().equals("logs")) {
                name = file.getName();
                str2 = "logs_file";
            } else if (file.getName().equals("keys")) {
                name = file.getName();
                str2 = "keys_file";
            }
            bVar.a(str2, name, "application/octet-stream", file);
        }
        return bVar;
    }

    @Override // com.google.firebase.crashlytics.c.o.d.b
    public boolean a(com.google.firebase.crashlytics.c.o.c.a aVar, boolean z) {
        if (z) {
            com.google.firebase.crashlytics.c.l.b a2 = a();
            a(a2, aVar.f9084b);
            a(a2, aVar.f9083a, aVar.f9085c);
            com.google.firebase.crashlytics.c.b a3 = com.google.firebase.crashlytics.c.b.a();
            a3.a("Sending report to: " + b());
            try {
                int b2 = a2.a().b();
                com.google.firebase.crashlytics.c.b a4 = com.google.firebase.crashlytics.c.b.a();
                a4.a("Result was: " + b2);
                return e0.a(b2) == 0;
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }
}

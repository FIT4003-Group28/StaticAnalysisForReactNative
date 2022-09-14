package com.google.firebase.crashlytics.c.q;

import android.content.Context;
import com.google.firebase.crashlytics.c.m.i;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9106a;

    public a(Context context) {
        this.f9106a = context;
    }

    private File b() {
        return new File(new i(this.f9106a).b(), "com.crashlytics.settings.json");
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x004a: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:21:0x0049 */
    public JSONObject a() {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        JSONObject jSONObject;
        com.google.firebase.crashlytics.c.b.a().a("Reading cached settings...");
        FileInputStream fileInputStream3 = null;
        try {
            try {
                File b2 = b();
                if (b2.exists()) {
                    fileInputStream = new FileInputStream(b2);
                    try {
                        jSONObject = new JSONObject(com.google.firebase.crashlytics.c.h.h.b(fileInputStream));
                        fileInputStream3 = fileInputStream;
                    } catch (Exception e2) {
                        e = e2;
                        com.google.firebase.crashlytics.c.b.a().b("Failed to fetch cached settings", e);
                        com.google.firebase.crashlytics.c.h.h.a((Closeable) fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    com.google.firebase.crashlytics.c.b.a().a("No cached settings found.");
                    jSONObject = null;
                }
                com.google.firebase.crashlytics.c.h.h.a((Closeable) fileInputStream3, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th) {
                th = th;
                fileInputStream3 = fileInputStream2;
                com.google.firebase.crashlytics.c.h.h.a((Closeable) fileInputStream3, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            com.google.firebase.crashlytics.c.h.h.a((Closeable) fileInputStream3, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void a(long j, JSONObject jSONObject) {
        FileWriter fileWriter;
        com.google.firebase.crashlytics.c.b.a().a("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter2 = null;
            try {
                try {
                    jSONObject.put("expires_at", j);
                    fileWriter = new FileWriter(b());
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e2) {
                e = e2;
            }
            try {
                fileWriter.write(jSONObject.toString());
                fileWriter.flush();
                com.google.firebase.crashlytics.c.h.h.a((Closeable) fileWriter, "Failed to close settings writer.");
            } catch (Exception e3) {
                e = e3;
                fileWriter2 = fileWriter;
                com.google.firebase.crashlytics.c.b.a().b("Failed to cache settings", e);
                com.google.firebase.crashlytics.c.h.h.a((Closeable) fileWriter2, "Failed to close settings writer.");
            } catch (Throwable th2) {
                th = th2;
                fileWriter2 = fileWriter;
                com.google.firebase.crashlytics.c.h.h.a((Closeable) fileWriter2, "Failed to close settings writer.");
                throw th;
            }
        }
    }
}

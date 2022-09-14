package b.a.a.a.a.g;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DefaultCachedSettingsIo.java */
/* loaded from: classes.dex */
public class i implements g {

    /* renamed from: a  reason: collision with root package name */
    private final b.a.a.a.i f1211a;

    public i(b.a.a.a.i iVar) {
        this.f1211a = iVar;
    }

    @Override // b.a.a.a.a.g.g
    public JSONObject a() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        b.a.a.a.c.h().a("Fabric", "Reading cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            File file = new File(new b.a.a.a.a.f.b(this.f1211a).a(), "com.crashlytics.settings.json");
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(b.a.a.a.a.b.i.a((InputStream) fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        b.a.a.a.c.h().e("Fabric", "Failed to fetch cached settings", e);
                        b.a.a.a.a.b.i.a((Closeable) fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    b.a.a.a.a.b.i.a((Closeable) fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                b.a.a.a.c.h().a("Fabric", "No cached settings found.");
                jSONObject = null;
            }
            b.a.a.a.a.b.i.a((Closeable) fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            b.a.a.a.a.b.i.a((Closeable) fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override // b.a.a.a.a.g.g
    public void a(long j, JSONObject jSONObject) {
        FileWriter fileWriter;
        b.a.a.a.c.h().a("Fabric", "Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter2 = null;
            try {
                try {
                    jSONObject.put("expires_at", j);
                    fileWriter = new FileWriter(new File(new b.a.a.a.a.f.b(this.f1211a).a(), "com.crashlytics.settings.json"));
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e) {
                e = e;
            }
            try {
                fileWriter.write(jSONObject.toString());
                fileWriter.flush();
                b.a.a.a.a.b.i.a((Closeable) fileWriter, "Failed to close settings writer.");
            } catch (Exception e2) {
                e = e2;
                fileWriter2 = fileWriter;
                b.a.a.a.c.h().e("Fabric", "Failed to cache settings", e);
                b.a.a.a.a.b.i.a((Closeable) fileWriter2, "Failed to close settings writer.");
            } catch (Throwable th2) {
                th = th2;
                fileWriter2 = fileWriter;
                b.a.a.a.a.b.i.a((Closeable) fileWriter2, "Failed to close settings writer.");
                throw th;
            }
        }
    }
}

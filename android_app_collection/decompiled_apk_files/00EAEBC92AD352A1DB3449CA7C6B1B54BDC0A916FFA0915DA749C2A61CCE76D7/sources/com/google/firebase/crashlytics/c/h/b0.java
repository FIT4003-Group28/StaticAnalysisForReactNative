package com.google.firebase.crashlytics.c.h;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
class b0 {

    /* renamed from: b  reason: collision with root package name */
    private static final Charset f8618b = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    private final File f8619a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends JSONObject {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j0 f8620a;

        a(j0 j0Var) {
            this.f8620a = j0Var;
            put("userId", this.f8620a.b());
        }
    }

    public b0(File file) {
        this.f8619a = file;
    }

    private static String a(j0 j0Var) {
        return new a(j0Var).toString();
    }

    private static String a(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    private static String a(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str, null);
        }
        return null;
    }

    private static j0 d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        j0 j0Var = new j0();
        j0Var.a(a(jSONObject, "userId"));
        return j0Var;
    }

    public File a(String str) {
        File file = this.f8619a;
        return new File(file, str + "keys.meta");
    }

    public void a(String str, j0 j0Var) {
        String a2;
        BufferedWriter bufferedWriter;
        File b2 = b(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                a2 = a(j0Var);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b2), f8618b));
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(a2);
            bufferedWriter.flush();
            h.a((Closeable) bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e3) {
            e = e3;
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.c.b.a().b("Error serializing user metadata.", e);
            h.a((Closeable) bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            h.a((Closeable) bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public void a(String str, Map<String, String> map) {
        String a2;
        BufferedWriter bufferedWriter;
        File a3 = a(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                a2 = a(map);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(a3), f8618b));
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(a2);
            bufferedWriter.flush();
            h.a((Closeable) bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e3) {
            e = e3;
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.c.b.a().b("Error serializing key/value metadata.", e);
            h.a((Closeable) bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            h.a((Closeable) bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    public File b(String str) {
        File file = this.f8619a;
        return new File(file, str + "user.meta");
    }

    public j0 c(String str) {
        FileInputStream fileInputStream;
        File b2 = b(str);
        if (!b2.exists()) {
            return new j0();
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(b2);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            j0 d2 = d(h.b(fileInputStream));
            h.a((Closeable) fileInputStream, "Failed to close user metadata file.");
            return d2;
        } catch (Exception e3) {
            e = e3;
            fileInputStream2 = fileInputStream;
            com.google.firebase.crashlytics.c.b.a().b("Error deserializing user metadata.", e);
            h.a((Closeable) fileInputStream2, "Failed to close user metadata file.");
            return new j0();
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            h.a((Closeable) fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }
}

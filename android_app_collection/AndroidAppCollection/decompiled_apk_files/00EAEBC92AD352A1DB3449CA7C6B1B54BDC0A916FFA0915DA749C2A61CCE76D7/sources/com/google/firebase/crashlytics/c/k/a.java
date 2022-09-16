package com.google.firebase.crashlytics.c.k;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9022a;

    /* renamed from: b  reason: collision with root package name */
    private final InterfaceC0183a f9023b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.crashlytics.c.k.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0183a {
        String a(File file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, InterfaceC0183a interfaceC0183a) {
        this.f9022a = context;
        this.f9023b = interfaceC0183a;
    }

    private File a(File file) {
        if (Build.VERSION.SDK_INT >= 9 && file.getAbsolutePath().startsWith("/data")) {
            try {
                return new File(this.f9022a.getPackageManager().getApplicationInfo(this.f9022a.getPackageName(), 0).nativeLibraryDir, file.getName());
            } catch (PackageManager.NameNotFoundException e2) {
                com.google.firebase.crashlytics.c.b.a().b("Error getting ApplicationInfo", e2);
                return file;
            }
        }
        return file;
    }

    private File a(String str) {
        File file = new File(str);
        return !file.exists() ? a(file) : file;
    }

    private static JSONObject a(String str, c cVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("base_address", cVar.f9024a);
        jSONObject.put("size", cVar.f9025b);
        jSONObject.put("name", cVar.f9027d);
        jSONObject.put("uuid", str);
        return jSONObject;
    }

    private static boolean a(c cVar) {
        return (cVar.f9026c.indexOf(120) == -1 || cVar.f9027d.indexOf(47) == -1) ? false : true;
    }

    private static byte[] a(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("binary_images", jSONArray);
            return jSONObject.toString().getBytes(Charset.forName("UTF-8"));
        } catch (JSONException e2) {
            com.google.firebase.crashlytics.c.b.a().d("Binary images string is null", e2);
            return new byte[0];
        }
    }

    private JSONArray b(BufferedReader bufferedReader) {
        JSONArray jSONArray = new JSONArray();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                JSONObject b2 = b(readLine);
                if (b2 != null) {
                    jSONArray.put(b2);
                }
            } else {
                return jSONArray;
            }
        }
    }

    private JSONObject b(String str) {
        c a2 = d.a(str);
        if (a2 != null && a(a2)) {
            try {
                try {
                    return a(this.f9023b.a(a(a2.f9027d)), a2);
                } catch (JSONException e2) {
                    com.google.firebase.crashlytics.c.b.a().a("Could not create a binary image json string", e2);
                    return null;
                }
            } catch (IOException e3) {
                com.google.firebase.crashlytics.c.b a3 = com.google.firebase.crashlytics.c.b.a();
                a3.a("Could not generate ID for file " + a2.f9027d, e3);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] a(BufferedReader bufferedReader) {
        return a(b(bufferedReader));
    }
}

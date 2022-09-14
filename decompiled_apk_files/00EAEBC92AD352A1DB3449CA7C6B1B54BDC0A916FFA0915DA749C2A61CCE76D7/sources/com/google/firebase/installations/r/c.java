package com.google.firebase.installations.r;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import c.e.b.m.c;
import c.e.b.p.h;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.util.j;
import com.google.firebase.installations.i;
import com.google.firebase.installations.r.d;
import com.google.firebase.installations.r.e;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f9410d = Pattern.compile("[0-9]+s");

    /* renamed from: e  reason: collision with root package name */
    private static final Charset f9411e = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    private final Context f9412a;

    /* renamed from: b  reason: collision with root package name */
    private final h f9413b;

    /* renamed from: c  reason: collision with root package name */
    private final c.e.b.m.c f9414c;

    public c(Context context, h hVar, c.e.b.m.c cVar) {
        this.f9412a = context;
        this.f9413b = hVar;
        this.f9414c = cVar;
    }

    private d a(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f9411e));
        e.a d2 = e.d();
        d.a f2 = d.f();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                f2.c(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                f2.a(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                f2.b(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        d2.a(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        d2.a(b(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                f2.a(d2.a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        f2.a(d.b.OK);
        return f2.a();
    }

    private static String a(String str, String str2, String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    private HttpURLConnection a(URL url, String str) {
        c.a a2;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f9412a.getPackageName());
            c.e.b.m.c cVar = this.f9414c;
            if (cVar != null && this.f9413b != null && (a2 = cVar.a("fire-installations-id")) != c.a.NONE) {
                httpURLConnection.addRequestProperty("x-firebase-client", this.f9413b.a());
                httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(a2.a()));
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", b());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
        }
    }

    private URL a(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e2) {
            throw new i(e2.getMessage(), i.a.UNAVAILABLE);
        }
    }

    private static JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:16.3.3");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static JSONObject a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:16.3.3");
            return jSONObject;
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private void a(HttpURLConnection httpURLConnection, String str, String str2) {
        a(httpURLConnection, a(a(str, str2)));
    }

    private static void a(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String b2 = b(httpURLConnection);
        if (!TextUtils.isEmpty(b2)) {
            Log.w("Firebase-Installations", b2);
            Log.w("Firebase-Installations", a(str, str2, str3));
        }
    }

    private static void a(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                    return;
                } catch (IOException unused) {
                    return;
                }
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
    }

    private static byte[] a(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    static long b(String str) {
        s.a(f9410d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private String b() {
        try {
            byte[] a2 = com.google.android.gms.common.util.a.a(this.f9412a, this.f9412a.getPackageName());
            if (a2 != null) {
                return j.a(a2, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f9412a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("ContentValues", "No such package: " + this.f9412a.getPackageName(), e2);
            return null;
        }
    }

    private static String b(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f9411e));
        try {
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                String format = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return format;
            } catch (IOException unused2) {
                return null;
            }
        } catch (IOException unused3) {
            bufferedReader.close();
            return null;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }

    private e c(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f9411e));
        e.a d2 = e.d();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                d2.a(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                d2.a(b(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        d2.a(e.b.OK);
        return d2.a();
    }

    private static void c() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private void d(HttpURLConnection httpURLConnection) {
        a(httpURLConnection, a(a()));
    }

    public d a(String str, String str2, String str3, String str4, String str5) {
        int responseCode;
        int i = 0;
        URL a2 = a(String.format("projects/%s/installations", str3));
        while (i <= 1) {
            HttpURLConnection a3 = a(a2, str);
            try {
                a3.setRequestMethod("POST");
                a3.setDoOutput(true);
                if (str5 != null) {
                    a3.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                }
                a(a3, str2, str4);
                responseCode = a3.getResponseCode();
            } catch (IOException unused) {
            } catch (Throwable th) {
                a3.disconnect();
                throw th;
            }
            if (responseCode == 200) {
                d a4 = a(a3);
                a3.disconnect();
                return a4;
            }
            a(a3, str4, str, str3);
            if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                c();
                d.a f2 = d.f();
                f2.a(d.b.BAD_CONFIG);
                d a5 = f2.a();
                a3.disconnect();
                return a5;
            }
            i++;
            a3.disconnect();
        }
        throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
    }

    public void a(String str, String str2, String str3, String str4) {
        int responseCode;
        int i = 0;
        URL a2 = a(String.format("projects/%s/installations/%s", str3, str2));
        while (i <= 1) {
            HttpURLConnection a3 = a(a2, str);
            try {
                a3.setRequestMethod("DELETE");
                a3.addRequestProperty("Authorization", "FIS_v2 " + str4);
                responseCode = a3.getResponseCode();
            } catch (IOException unused) {
            } catch (Throwable th) {
                a3.disconnect();
                throw th;
            }
            if (responseCode != 200 && responseCode != 401 && responseCode != 404) {
                a(a3, (String) null, str, str3);
                if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                    c();
                    throw new i("Bad config while trying to delete FID", i.a.BAD_CONFIG);
                    break;
                }
                i++;
                a3.disconnect();
            }
            a3.disconnect();
            return;
        }
        throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
    }

    public e b(String str, String str2, String str3, String str4) {
        int responseCode;
        int i = 0;
        URL a2 = a(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        while (i <= 1) {
            HttpURLConnection a3 = a(a2, str);
            try {
                a3.setRequestMethod("POST");
                a3.addRequestProperty("Authorization", "FIS_v2 " + str4);
                d(a3);
                responseCode = a3.getResponseCode();
            } catch (IOException unused) {
            } catch (Throwable th) {
                a3.disconnect();
                throw th;
            }
            if (responseCode == 200) {
                e c2 = c(a3);
                a3.disconnect();
                return c2;
            }
            a(a3, (String) null, str, str3);
            if (responseCode != 401 && responseCode != 404) {
                if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                    c();
                    e.a d2 = e.d();
                    d2.a(e.b.BAD_CONFIG);
                    e a4 = d2.a();
                    a3.disconnect();
                    return a4;
                }
                i++;
                a3.disconnect();
            }
            e.a d3 = e.d();
            d3.a(e.b.AUTH_ERROR);
            e a5 = d3.a();
            a3.disconnect();
            return a5;
        }
        throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
    }
}

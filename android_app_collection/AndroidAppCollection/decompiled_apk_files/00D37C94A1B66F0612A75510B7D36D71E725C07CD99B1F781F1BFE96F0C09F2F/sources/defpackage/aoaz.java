package defpackage;

import android.content.Context;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
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
/* compiled from: PG */
/* renamed from: aoaz  reason: default package */
/* loaded from: classes.dex */
public final class aoaz {
    private static final Pattern a = Pattern.compile("[0-9]+s");
    private static final Charset b = Charset.forName("UTF-8");
    private final Context c;
    private final aoaf d;
    private final aoaf e;
    private final aobc f = new aobc();

    public aoaz(Context context, aoaf aoafVar, aoaf aoafVar2) {
        this.c = context;
        this.d = aoafVar;
        this.e = aoafVar2;
    }

    static long a(String str) {
        qnm.d(a.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab A[Catch: NameNotFoundException -> 0x00f6, TryCatch #0 {NameNotFoundException -> 0x00f6, blocks: (B:12:0x0079, B:14:0x008f, B:16:0x0094, B:19:0x009b, B:22:0x00ab, B:24:0x00bd, B:26:0x00c8, B:25:0x00c2, B:27:0x00cc, B:29:0x00d6, B:30:0x00f1), top: B:43:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cc A[Catch: NameNotFoundException -> 0x00f6, TryCatch #0 {NameNotFoundException -> 0x00f6, blocks: (B:12:0x0079, B:14:0x008f, B:16:0x0094, B:19:0x009b, B:22:0x00ab, B:24:0x00bd, B:26:0x00c8, B:25:0x00c2, B:27:0x00cc, B:29:0x00d6, B:30:0x00f1), top: B:43:0x0079 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.net.HttpURLConnection d(java.net.URL r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoaz.d(java.net.URL, java.lang.String):java.net.HttpURLConnection");
    }

    private static void e() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private static void f(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String concat;
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, b));
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
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (!TextUtils.isEmpty(str4)) {
            Log.w("Firebase-Installations", str4);
            Object[] objArr = new Object[3];
            objArr[0] = str2;
            objArr[1] = str3;
            if (TextUtils.isEmpty(str)) {
                concat = "";
            } else {
                String valueOf = String.valueOf(str);
                concat = valueOf.length() != 0 ? ", ".concat(valueOf) : new String(", ");
            }
            objArr[2] = concat;
            Log.w("Firebase-Installations", String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr));
        }
    }

    private static void g(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    private static boolean h(int i) {
        return i >= 200 && i < 300;
    }

    private static byte[] i(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static final URL j(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e) {
            throw new aoam(e.getMessage());
        }
    }

    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v4 */
    public final aobb b(String str, String str2, String str3, String str4, String str5) {
        String str6;
        int responseCode;
        aobb a2;
        String str7;
        aoaz aoazVar = this;
        String str8 = str5;
        String str9 = "fid";
        if (!aoazVar.f.b()) {
            throw new aoam("Firebase Installations Service is unavailable. Please try again later.");
        }
        int i = 0;
        URL j = j(String.format("projects/%s/installations", str3));
        for (?? r8 = 1; i <= r8; r8 = 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection d = aoazVar.d(j, str);
            try {
                try {
                    d.setRequestMethod("POST");
                    d.setDoOutput(r8);
                    if (str8 != null) {
                        d.addRequestProperty("x-goog-fis-android-iid-migration-auth", str8);
                    }
                } catch (IOException | AssertionError unused) {
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        try {
                            jSONObject.put(str9, str2);
                            jSONObject.put("appId", str4);
                            jSONObject.put("authVersion", "FIS_v2");
                            jSONObject.put("sdkVersion", "a:16.3.6_1p");
                            g(d, i(jSONObject));
                            responseCode = d.getResponseCode();
                            aoazVar.f.a(responseCode);
                        } catch (IOException | AssertionError unused2) {
                            str6 = str9;
                            d.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i++;
                            aoazVar = this;
                            str8 = str5;
                            str9 = str6;
                        }
                        if (h(responseCode)) {
                            InputStream inputStream = d.getInputStream();
                            JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, b));
                            aobd a3 = aobe.a();
                            aoba a4 = aobb.a();
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                String nextName = jsonReader.nextName();
                                if (nextName.equals("name")) {
                                    a4.a = jsonReader.nextString();
                                } else if (nextName.equals(str9)) {
                                    a4.b = jsonReader.nextString();
                                } else if (nextName.equals("refreshToken")) {
                                    a4.c = jsonReader.nextString();
                                } else {
                                    if (nextName.equals("authToken")) {
                                        jsonReader.beginObject();
                                        while (jsonReader.hasNext()) {
                                            String nextName2 = jsonReader.nextName();
                                            if (nextName2.equals("token")) {
                                                a3.a = jsonReader.nextString();
                                            } else {
                                                if (nextName2.equals("expiresIn")) {
                                                    str6 = str9;
                                                    try {
                                                        a3.b(a(jsonReader.nextString()));
                                                    } catch (IOException | AssertionError unused3) {
                                                        d.disconnect();
                                                        TrafficStats.clearThreadStatsTag();
                                                        i++;
                                                        aoazVar = this;
                                                        str8 = str5;
                                                        str9 = str6;
                                                    }
                                                } else {
                                                    str6 = str9;
                                                    jsonReader.skipValue();
                                                }
                                                str9 = str6;
                                            }
                                        }
                                        str7 = str9;
                                        a4.d = a3.a();
                                        jsonReader.endObject();
                                    } else {
                                        str7 = str9;
                                        jsonReader.skipValue();
                                    }
                                    str9 = str7;
                                }
                            }
                            str6 = str9;
                            jsonReader.endObject();
                            jsonReader.close();
                            inputStream.close();
                            a4.e = 1;
                            a2 = a4.a();
                        } else {
                            str6 = str9;
                            try {
                                f(d, str4, str, str3);
                            } catch (IOException | AssertionError unused4) {
                                continue;
                            }
                            if (responseCode == 429) {
                                throw new aoam("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                e();
                                aoba a5 = aobb.a();
                                a5.e = 2;
                                a2 = a5.a();
                            } else {
                                d.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i++;
                                aoazVar = this;
                                str8 = str5;
                                str9 = str6;
                            }
                        }
                        return a2;
                    } catch (JSONException e) {
                        e = e;
                        throw new IllegalStateException(e);
                    }
                } catch (JSONException e2) {
                    e = e2;
                }
            } finally {
                d.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new aoam("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final aobe c(String str, String str2, String str3, String str4) {
        int responseCode;
        aobe a2;
        if (this.f.b()) {
            URL j = j(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
            for (int i = 0; i <= 1; i++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection d = d(j, str);
                try {
                    try {
                        d.setRequestMethod("POST");
                        String valueOf = String.valueOf(str4);
                        d.addRequestProperty("Authorization", valueOf.length() != 0 ? "FIS_v2 ".concat(valueOf) : new String("FIS_v2 "));
                        d.setDoOutput(true);
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("sdkVersion", "a:16.3.6_1p");
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("installation", jSONObject);
                            g(d, i(jSONObject2));
                            responseCode = d.getResponseCode();
                            this.f.a(responseCode);
                        } catch (JSONException e) {
                            throw new IllegalStateException(e);
                        }
                    } finally {
                        d.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                } catch (IOException | AssertionError unused) {
                }
                if (h(responseCode)) {
                    InputStream inputStream = d.getInputStream();
                    JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, b));
                    aobd a3 = aobe.a();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (nextName.equals("token")) {
                            a3.a = jsonReader.nextString();
                        } else if (nextName.equals("expiresIn")) {
                            a3.b(a(jsonReader.nextString()));
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    jsonReader.close();
                    inputStream.close();
                    a3.b = 1;
                    a2 = a3.a();
                } else {
                    f(d, null, str, str3);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode == 429) {
                            throw new aoam("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            e();
                            aobd a4 = aobe.a();
                            a4.b = 2;
                            a2 = a4.a();
                        } else {
                            d.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    aobd a5 = aobe.a();
                    a5.b = 3;
                    a2 = a5.a();
                }
                return a2;
            }
            throw new aoam("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new aoam("Firebase Installations Service is unavailable. Please try again later.");
    }
}

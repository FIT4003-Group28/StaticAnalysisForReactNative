package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.JsonReader;
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
/* renamed from: dett  reason: default package */
/* loaded from: classes6.dex */
public final class dett {
    private static final Pattern a = Pattern.compile("[0-9]+s");
    private static final Charset b = Charset.forName("UTF-8");
    private final Context c;
    private final desq<devr> d;
    private final desq<derf> e;
    private final detw f = new detw();

    public dett(Context context, desq<devr> desqVar, desq<derf> desqVar2) {
        this.c = context;
        this.d = desqVar;
        this.e = desqVar2;
    }

    static long c(String str) {
        cnwc.e(a.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private static byte[] d(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static void e(URLConnection uRLConnection, byte[] bArr) {
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

    private static boolean f(int i) {
        return i >= 200 && i < 300;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9 A[Catch: NameNotFoundException -> 0x00ec, TryCatch #1 {NameNotFoundException -> 0x00ec, blocks: (B:11:0x0077, B:13:0x008d, B:15:0x0092, B:18:0x0099, B:21:0x00a9, B:24:0x00bc, B:25:0x00c2, B:27:0x00cc, B:28:0x00e7), top: B:41:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2 A[Catch: NameNotFoundException -> 0x00ec, TryCatch #1 {NameNotFoundException -> 0x00ec, blocks: (B:11:0x0077, B:13:0x008d, B:15:0x0092, B:18:0x0099, B:21:0x00a9, B:24:0x00bc, B:25:0x00c2, B:27:0x00cc, B:28:0x00e7), top: B:41:0x0077 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.net.HttpURLConnection g(java.net.URL r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dett.g(java.net.URL, java.lang.String):java.net.HttpURLConnection");
    }

    private static final URL h(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e) {
            throw new deta(e.getMessage());
        }
    }

    private static void i(HttpURLConnection httpURLConnection, String str) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str2 = null;
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
                str2 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
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
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || String.valueOf(str).length() != 0) {
            return;
        }
        new String(", ");
    }

    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v2 */
    public final detv a(String str, String str2, String str3, String str4, String str5) {
        String str6;
        int responseCode;
        String str7;
        String str8 = str5;
        String str9 = "fid";
        if (this.f.b()) {
            int i = 0;
            URL h = h(String.format("projects/%s/installations", str3));
            for (?? r6 = 1; i <= r6; r6 = 1) {
                HttpURLConnection g = g(h, str);
                try {
                    try {
                        g.setRequestMethod("POST");
                        g.setDoOutput(r6);
                        if (str8 != null) {
                            g.addRequestProperty("x-goog-fis-android-iid-migration-auth", str8);
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
                                jSONObject.put("sdkVersion", "a:16.3.4_1p");
                                e(g, d(jSONObject));
                                responseCode = g.getResponseCode();
                                this.f.a(responseCode);
                            } catch (JSONException e) {
                                e = e;
                                throw new IllegalStateException(e);
                            }
                        } catch (IOException | AssertionError unused2) {
                            str6 = str9;
                            g.disconnect();
                            i++;
                            str8 = str5;
                            str9 = str6;
                        }
                        if (f(responseCode)) {
                            InputStream inputStream = g.getInputStream();
                            JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, b));
                            detx builder = dety.builder();
                            detu builder2 = detv.builder();
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                String nextName = jsonReader.nextName();
                                if (nextName.equals("name")) {
                                    ((detp) builder2).a = jsonReader.nextString();
                                } else if (nextName.equals(str9)) {
                                    ((detp) builder2).b = jsonReader.nextString();
                                } else if (nextName.equals("refreshToken")) {
                                    ((detp) builder2).c = jsonReader.nextString();
                                } else {
                                    if (nextName.equals("authToken")) {
                                        jsonReader.beginObject();
                                        while (jsonReader.hasNext()) {
                                            String nextName2 = jsonReader.nextName();
                                            if (nextName2.equals("token")) {
                                                ((detr) builder).a = jsonReader.nextString();
                                            } else {
                                                if (nextName2.equals("expiresIn")) {
                                                    str6 = str9;
                                                    try {
                                                        builder.b(c(jsonReader.nextString()));
                                                    } catch (IOException | AssertionError unused3) {
                                                        g.disconnect();
                                                        i++;
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
                                        ((detp) builder2).d = builder.a();
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
                            ((detp) builder2).e = 1;
                            return builder2.a();
                        }
                        str6 = str9;
                        try {
                            i(g, str4);
                        } catch (IOException | AssertionError unused4) {
                            continue;
                        }
                        if (responseCode == 429) {
                            throw new deta("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            detu builder3 = detv.builder();
                            ((detp) builder3).e = 2;
                            return builder3.a();
                        }
                        g.disconnect();
                        i++;
                        str8 = str5;
                        str9 = str6;
                    } catch (JSONException e2) {
                        e = e2;
                    }
                } finally {
                    g.disconnect();
                }
            }
            throw new deta("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new deta("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final dety b(String str, String str2, String str3, String str4) {
        if (this.f.b()) {
            URL h = h(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
            for (int i = 0; i <= 1; i++) {
                HttpURLConnection g = g(h, str);
                try {
                    try {
                        g.setRequestMethod("POST");
                        String valueOf = String.valueOf(str4);
                        g.addRequestProperty("Authorization", valueOf.length() != 0 ? "FIS_v2 ".concat(valueOf) : new String("FIS_v2 "));
                        g.setDoOutput(true);
                    } catch (IOException | AssertionError unused) {
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("sdkVersion", "a:16.3.4_1p");
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("installation", jSONObject);
                        e(g, d(jSONObject2));
                        int responseCode = g.getResponseCode();
                        this.f.a(responseCode);
                        if (!f(responseCode)) {
                            i(g, null);
                            if (responseCode != 401 && responseCode != 404) {
                                if (responseCode == 429) {
                                    throw new deta("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                                }
                                if (responseCode < 500 || responseCode >= 600) {
                                    detx builder = dety.builder();
                                    ((detr) builder).b = 2;
                                    return builder.a();
                                }
                                g.disconnect();
                            }
                            detx builder2 = dety.builder();
                            ((detr) builder2).b = 3;
                            return builder2.a();
                        }
                        InputStream inputStream = g.getInputStream();
                        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, b));
                        detx builder3 = dety.builder();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName = jsonReader.nextName();
                            if (nextName.equals("token")) {
                                ((detr) builder3).a = jsonReader.nextString();
                            } else if (nextName.equals("expiresIn")) {
                                builder3.b(c(jsonReader.nextString()));
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        jsonReader.close();
                        inputStream.close();
                        ((detr) builder3).b = 1;
                        return builder3.a();
                    } catch (JSONException e) {
                        throw new IllegalStateException(e);
                    }
                } finally {
                    g.disconnect();
                }
            }
            throw new deta("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new deta("Firebase Installations Service is unavailable. Please try again later.");
    }
}

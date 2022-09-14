package c.a.a.w;

import android.content.Context;
import androidx.core.util.d;
import c.a.a.e;
import c.a.a.f;
import c.a.a.m;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.ZipInputStream;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2616a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2617b;

    /* renamed from: c  reason: collision with root package name */
    private final b f2618c;

    private c(Context context, String str) {
        this.f2616a = context.getApplicationContext();
        this.f2617b = str;
        this.f2618c = new b(this.f2616a, str);
    }

    public static m<e> a(Context context, String str) {
        return new c(context, str).a();
    }

    private String a(HttpURLConnection httpURLConnection) {
        httpURLConnection.getResponseCode();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                        sb.append('\n');
                    } else {
                        try {
                            break;
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    private e b() {
        d<a, InputStream> a2 = this.f2618c.a();
        if (a2 == null) {
            return null;
        }
        a aVar = a2.f1593a;
        InputStream inputStream = a2.f1594b;
        m<e> a3 = aVar == a.ZIP ? f.a(new ZipInputStream(inputStream), this.f2617b) : f.a(inputStream, this.f2617b);
        if (a3.b() == null) {
            return null;
        }
        return a3.b();
    }

    private m<e> b(HttpURLConnection httpURLConnection) {
        a aVar;
        m<e> a2;
        String contentType = httpURLConnection.getContentType();
        if (contentType == null) {
            contentType = "application/json";
        }
        char c2 = 65535;
        int hashCode = contentType.hashCode();
        if (hashCode != -1248325150) {
            if (hashCode == -43840953 && contentType.equals("application/json")) {
                c2 = 1;
            }
        } else if (contentType.equals("application/zip")) {
            c2 = 0;
        }
        if (c2 != 0) {
            c.a.a.y.d.a("Received json response.");
            aVar = a.JSON;
            a2 = f.a(new FileInputStream(new File(this.f2618c.a(httpURLConnection.getInputStream(), aVar).getAbsolutePath())), this.f2617b);
        } else {
            c.a.a.y.d.a("Handling zip response.");
            aVar = a.ZIP;
            a2 = f.a(new ZipInputStream(new FileInputStream(this.f2618c.a(httpURLConnection.getInputStream(), aVar))), this.f2617b);
        }
        if (a2.b() != null) {
            this.f2618c.a(aVar);
        }
        return a2;
    }

    private m<e> c() {
        try {
            return d();
        } catch (IOException e2) {
            return new m<>(e2);
        }
    }

    private m d() {
        c.a.a.y.d.a("Fetching " + this.f2617b);
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f2617b).openConnection();
        httpURLConnection.setRequestMethod("GET");
        try {
            httpURLConnection.connect();
            if (httpURLConnection.getErrorStream() == null && httpURLConnection.getResponseCode() == 200) {
                m<e> b2 = b(httpURLConnection);
                StringBuilder sb = new StringBuilder();
                sb.append("Completed fetch from network. Success: ");
                sb.append(b2.b() != null);
                c.a.a.y.d.a(sb.toString());
                return b2;
            }
            String a2 = a(httpURLConnection);
            return new m((Throwable) new IllegalArgumentException("Unable to fetch " + this.f2617b + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + a2));
        } catch (Exception e2) {
            return new m((Throwable) e2);
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public m<e> a() {
        e b2 = b();
        if (b2 != null) {
            return new m<>(b2);
        }
        c.a.a.y.d.a("Animation for " + this.f2617b + " not found in cache. Fetching from network.");
        return c();
    }
}

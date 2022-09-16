package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
/* compiled from: PG */
/* renamed from: but  reason: default package */
/* loaded from: classes4.dex */
public final class but implements buj<InputStream> {
    static final bus a = new bus();
    private final cac b;
    private final int c;
    private HttpURLConnection d;
    private InputStream e;
    private volatile boolean f;

    public but(cac cacVar, int i) {
        this.b = cacVar;
        this.c = i;
    }

    private static int g(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            return -1;
        }
    }

    @Override // defpackage.buj
    public final void a(bro broVar, bui<? super InputStream> buiVar) {
        SystemClock.elapsedRealtimeNanos();
        try {
            cac cacVar = this.b;
            if (cacVar.b == null) {
                cacVar.b = new URL(cacVar.b());
            }
            buiVar.f(f(cacVar.b, 0, null, this.b.c()));
        } catch (IOException e) {
            buiVar.g(e);
        }
    }

    @Override // defpackage.buj
    public final void b() {
        InputStream inputStream = this.e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.d = null;
    }

    @Override // defpackage.buj
    public final void c() {
        this.f = true;
    }

    @Override // defpackage.buj
    public final Class<InputStream> d() {
        return InputStream.class;
    }

    @Override // defpackage.buj
    public final int e() {
        return 2;
    }

    private final InputStream f(URL url, int i, URL url2, Map<String, String> map) {
        if (i >= 5) {
            throw new btm("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new btm("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnection.setConnectTimeout(this.c);
            httpURLConnection.setReadTimeout(this.c);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.d = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.e = this.d.getInputStream();
                if (this.f) {
                    return null;
                }
                int g = g(this.d);
                int i2 = g / 100;
                if (i2 == 2) {
                    HttpURLConnection httpURLConnection2 = this.d;
                    try {
                        if (!TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.e = httpURLConnection2.getInputStream();
                        } else {
                            this.e = new cjd(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        }
                        return this.e;
                    } catch (IOException e) {
                        throw new btm("Failed to obtain InputStream", g(httpURLConnection2), e);
                    }
                } else if (i2 == 3) {
                    String headerField = this.d.getHeaderField("Location");
                    if (!TextUtils.isEmpty(headerField)) {
                        try {
                            URL url3 = new URL(url, headerField);
                            b();
                            return f(url3, i + 1, url, map);
                        } catch (MalformedURLException e2) {
                            String valueOf = String.valueOf(headerField);
                            throw new btm(valueOf.length() != 0 ? "Bad redirect url: ".concat(valueOf) : new String("Bad redirect url: "), g, e2);
                        }
                    }
                    throw new btm("Received empty or null redirect url", g);
                } else {
                    if (g == -1) {
                        throw new btm(-1);
                    }
                    try {
                        throw new btm(this.d.getResponseMessage(), g);
                    } catch (IOException e3) {
                        throw new btm("Failed to get a response message", g, e3);
                    }
                }
            } catch (IOException e4) {
                throw new btm("Failed to connect or obtain data", g(this.d), e4);
            }
        } catch (IOException e5) {
            throw new btm("URL.openConnection threw", 0, e5);
        }
    }
}

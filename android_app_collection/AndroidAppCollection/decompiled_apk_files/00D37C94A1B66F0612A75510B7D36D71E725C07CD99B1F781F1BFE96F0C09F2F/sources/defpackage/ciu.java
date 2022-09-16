package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ciu  reason: default package */
/* loaded from: classes2.dex */
public final class ciu implements cil {
    private final cnf a;
    private final int b;
    private HttpURLConnection c;
    private InputStream d;
    private volatile boolean e;

    public ciu(cnf cnfVar, int i) {
        this.a = cnfVar;
        this.b = i;
    }

    private static int f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            return -1;
        }
    }

    @Override // defpackage.cil
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.cil
    public final void b() {
        this.e = true;
    }

    @Override // defpackage.cil
    public final void c() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.c = null;
    }

    @Override // defpackage.cil
    public final void d(cfv cfvVar, cik cikVar) {
        cuy.b();
        try {
            cnf cnfVar = this.a;
            if (cnfVar.b == null) {
                cnfVar.b = new URL(cnfVar.c());
            }
            cikVar.f(g(cnfVar.b, 0, null, this.a.d()));
        } catch (IOException e) {
            cikVar.g(e);
        }
    }

    @Override // defpackage.cil
    public final int e() {
        return 2;
    }

    private final InputStream g(URL url, int i, URL url2, Map map) {
        if (i >= 5) {
            throw new cho("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new cho("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setConnectTimeout(this.b);
            httpURLConnection.setReadTimeout(this.b);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.d = this.c.getInputStream();
                if (this.e) {
                    return null;
                }
                int f = f(this.c);
                int i2 = f / 100;
                if (i2 == 2) {
                    HttpURLConnection httpURLConnection2 = this.c;
                    try {
                        if (!TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.d = httpURLConnection2.getInputStream();
                        } else {
                            this.d = new cuu(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        }
                        return this.d;
                    } catch (IOException e) {
                        throw new cho("Failed to obtain InputStream", f(httpURLConnection2), e);
                    }
                } else if (i2 == 3) {
                    String headerField = this.c.getHeaderField("Location");
                    if (!TextUtils.isEmpty(headerField)) {
                        try {
                            URL url3 = new URL(url, headerField);
                            c();
                            return g(url3, i + 1, url, map);
                        } catch (MalformedURLException e2) {
                            String valueOf = String.valueOf(headerField);
                            throw new cho(valueOf.length() != 0 ? "Bad redirect url: ".concat(valueOf) : new String("Bad redirect url: "), f, e2);
                        }
                    }
                    throw new cho("Received empty or null redirect url", f);
                } else {
                    if (f == -1) {
                        throw new cho(-1);
                    }
                    try {
                        throw new cho(this.c.getResponseMessage(), f);
                    } catch (IOException e3) {
                        throw new cho("Failed to get a response message", f, e3);
                    }
                }
            } catch (IOException e4) {
                throw new cho("Failed to connect or obtain data", f(this.c), e4);
            }
        } catch (IOException e5) {
            throw new cho("URL.openConnection threw", 0, e5);
        }
    }
}

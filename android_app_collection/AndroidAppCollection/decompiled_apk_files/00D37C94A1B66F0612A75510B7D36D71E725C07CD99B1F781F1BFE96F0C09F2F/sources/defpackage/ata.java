package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ata  reason: default package */
/* loaded from: classes2.dex */
public final class ata extends ass implements ati {
    private final int b;
    private final int c;
    private final String d;
    private final ath e;
    private final ath f;
    private final boolean g;
    private ampt h;
    private asy i;
    private HttpURLConnection j;
    private InputStream k;
    private boolean l;
    private int m;
    private long n;
    private long o;

    @Deprecated
    public ata() {
        this(null, 8000, 8000, null, null, false);
    }

    private final HttpURLConnection n(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.b);
        httpURLConnection.setReadTimeout(this.c);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.e.a());
        hashMap.putAll(this.f.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String c = atj.c(j, j2);
        if (c != null) {
            httpURLConnection.setRequestProperty("Range", c);
        }
        String str = this.d;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        boolean z3 = true;
        httpURLConnection.setRequestProperty("Accept-Encoding", true != z ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z2);
        if (bArr == null) {
            z3 = false;
        }
        httpURLConnection.setDoOutput(z3);
        httpURLConnection.setRequestMethod(asy.f(i));
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    private final void o() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                pns.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.j = null;
        }
    }

    private static final URL p(URL url, String str, asy asyVar) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if ("https".equals(protocol) || "http".equals(protocol)) {
                    if (protocol.equals(url.getProtocol())) {
                        return url2;
                    }
                    String protocol2 = url.getProtocol();
                    StringBuilder sb = new StringBuilder(String.valueOf(protocol2).length() + 41 + String.valueOf(protocol).length());
                    sb.append("Disallowed cross-protocol redirect (");
                    sb.append(protocol2);
                    sb.append(" to ");
                    sb.append(protocol);
                    sb.append(")");
                    throw new ate(sb.toString(), asyVar, 2001, 1);
                }
                String valueOf = String.valueOf(protocol);
                throw new ate(valueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(valueOf) : new String("Unsupported protocol redirect: "), asyVar, 2001, 1);
            } catch (MalformedURLException e) {
                throw new ate(e, asyVar, 2001, 1);
            }
        }
        throw new ate("Null location redirect", asyVar, 2001, 1);
    }

    @Override // defpackage.ass, defpackage.asv
    public final Map a() {
        HttpURLConnection httpURLConnection = this.j;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    @Override // defpackage.ast
    public final int g(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.n;
            if (j != -1) {
                long j2 = j - this.o;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.k;
            int i3 = pxi.a;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.o += read;
            c(read);
            return read;
        } catch (IOException e) {
            asy asyVar = this.i;
            int i4 = pxi.a;
            throw ate.rw(e, asyVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f8, code lost:
        if (r7 != 0) goto L22;
     */
    @Override // defpackage.asv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long h(defpackage.asy r26) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ata.h(asy):long");
    }

    @Override // defpackage.asv
    public final Uri i() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // defpackage.asv
    public final void j() {
        try {
            InputStream inputStream = this.k;
            if (inputStream != null) {
                if (this.j != null) {
                    int i = pxi.a;
                }
                try {
                    inputStream.close();
                } catch (IOException e) {
                    asy asyVar = this.i;
                    int i2 = pxi.a;
                    throw new ate(e, asyVar, 2000, 3);
                }
            }
        } finally {
            this.k = null;
            o();
            if (this.l) {
                this.l = false;
                d();
            }
        }
    }

    @Override // defpackage.ati
    public final int k() {
        int i;
        if (this.j == null || (i = this.m) <= 0) {
            return -1;
        }
        return i;
    }

    @Override // defpackage.ati
    public final void l() {
        this.f.b();
    }

    @Override // defpackage.ati
    public final void m(String str, String str2) {
        ptx.a(str);
        ptx.a(str2);
        this.f.c(str, str2);
    }

    public ata(String str, int i, int i2, ath athVar, ampt amptVar, boolean z) {
        super(true);
        this.d = str;
        this.b = i;
        this.c = i2;
        this.e = athVar;
        this.h = amptVar;
        this.f = new ath();
        this.g = z;
    }
}

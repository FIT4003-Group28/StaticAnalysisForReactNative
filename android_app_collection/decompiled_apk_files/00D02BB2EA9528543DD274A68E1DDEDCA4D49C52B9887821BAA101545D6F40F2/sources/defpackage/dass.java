package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
/* compiled from: PG */
/* renamed from: dass  reason: default package */
/* loaded from: classes5.dex */
final class dass extends dasl {
    private final HttpURLConnection e;

    public dass(HttpURLConnection httpURLConnection) {
        this.e = httpURLConnection;
        httpURLConnection.setInstanceFollowRedirects(false);
    }

    @Override // defpackage.dasl
    public final void a(String str, String str2) {
        this.e.addRequestProperty(str, str2);
    }

    @Override // defpackage.dasl
    public final void b(int i, int i2) {
        this.e.setReadTimeout(i2);
        this.e.setConnectTimeout(i);
    }

    @Override // defpackage.dasl
    public final dasm c() {
        HttpURLConnection httpURLConnection = this.e;
        if (this.d != null) {
            String str = this.c;
            if (str != null) {
                a("Content-Type", str);
            }
            String str2 = this.b;
            if (str2 != null) {
                a("Content-Encoding", str2);
            }
            long j = this.a;
            if (j >= 0) {
                httpURLConnection.setRequestProperty("Content-Length", Long.toString(j));
            }
            String requestMethod = httpURLConnection.getRequestMethod();
            if ("POST".equals(requestMethod) || "PUT".equals(requestMethod)) {
                httpURLConnection.setDoOutput(true);
                if (j < 0 || j > 2147483647L) {
                    httpURLConnection.setChunkedStreamingMode(0);
                } else {
                    httpURLConnection.setFixedLengthStreamingMode((int) j);
                }
                OutputStream outputStream = httpURLConnection.getOutputStream();
                try {
                    this.d.e(outputStream);
                    try {
                    } catch (IOException e) {
                        throw e;
                    }
                } finally {
                    try {
                        outputStream.close();
                    } catch (IOException unused) {
                    }
                }
            } else {
                dbsk.c(j == 0, "%s with non-zero content length is not supported", requestMethod);
            }
        }
        try {
            httpURLConnection.connect();
            return new dasu(httpURLConnection);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}

package defpackage;

import com.google.ar.core.ImageMetadata;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: duib  reason: default package */
/* loaded from: classes6.dex */
public final class duib implements duio {
    public final HttpURLConnection a;
    public final duhv b;
    public byte[] c;
    public long d;
    public duis e;
    public int f = -1;
    private int g;

    public duib(HttpURLConnection httpURLConnection, String str, duhx duhxVar, @dzsi duhv duhvVar, int i, int i2) {
        this.a = httpURLConnection;
        try {
            httpURLConnection.setRequestMethod(str);
            httpURLConnection.setReadTimeout(i);
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setDoInput(true);
            this.b = duhvVar;
            httpURLConnection.setDoOutput(true);
            if (duhvVar.h() >= 0) {
                long h = duhvVar.h() - duhvVar.d();
                if (h < 2147483647L) {
                    httpURLConnection.setFixedLengthStreamingMode((int) h);
                } else {
                    httpURLConnection.setFixedLengthStreamingMode(h);
                }
            } else {
                httpURLConnection.setChunkedStreamingMode(0);
            }
            for (String str2 : duhxVar.b()) {
                for (String str3 : duhxVar.c(str2)) {
                    httpURLConnection.addRequestProperty(str2, str3);
                }
            }
            this.g = 1;
            this.c = new byte[ImageMetadata.CONTROL_AE_ANTIBANDING_MODE];
        } catch (ProtocolException e) {
            throw new IllegalArgumentException("Invalid http method.", e);
        }
    }

    @Override // defpackage.duio
    public final dehn<duir> a() {
        deho b = deho.b(new duia(this));
        deip deipVar = new deip();
        deipVar.a = "Scotty-Uploader-HttpUrlConnectionHttpClient-%d";
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(deip.a(deipVar));
        newSingleThreadExecutor.submit(b);
        newSingleThreadExecutor.shutdown();
        return b;
    }

    public final duhy b() {
        InputStream errorStream;
        duhx duhxVar;
        d();
        try {
            int responseCode = this.a.getResponseCode();
            try {
                errorStream = this.a.getInputStream();
            } catch (IOException unused) {
                errorStream = this.a.getErrorStream();
            }
            Map<String, List<String>> headerFields = this.a.getHeaderFields();
            if (headerFields != null) {
                duhxVar = new duhx();
                for (String str : headerFields.keySet()) {
                    if (str != null) {
                        for (String str2 : headerFields.get(str)) {
                            dbsk.a(!str.isEmpty());
                            dbsk.s(str2);
                            String lowerCase = str.toLowerCase(Locale.US);
                            if (!duhxVar.a.containsKey(lowerCase)) {
                                duhxVar.a.put(lowerCase, new ArrayList());
                            }
                            duhxVar.a.get(lowerCase).add(str2);
                        }
                    }
                }
            } else {
                duhxVar = null;
            }
            return new duhy(responseCode, duhxVar, errorStream);
        } catch (IOException e) {
            throw new duiq(duip.CONNECTION_ERROR, "Error while reading response code.", e);
        }
    }

    public final boolean c() {
        try {
            return this.b.i();
        } catch (IOException e) {
            throw new duiq(duip.REQUEST_BODY_READ_ERROR, e);
        }
    }

    public final synchronized void d() {
        int i;
        while (true) {
            i = this.g;
            if (i != 2) {
                break;
            }
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
        if (i == 3) {
            throw new duiq(duip.CANCELED, "");
        }
    }

    @Override // defpackage.duio
    public final void e() {
        synchronized (this) {
            this.g = 3;
            notifyAll();
        }
    }

    @Override // defpackage.duio
    public final long f() {
        return this.d;
    }

    @Override // defpackage.duio
    public final synchronized void g(duis duisVar, int i) {
        this.e = duisVar;
        if (i > 0) {
            this.f = 1;
        }
    }
}

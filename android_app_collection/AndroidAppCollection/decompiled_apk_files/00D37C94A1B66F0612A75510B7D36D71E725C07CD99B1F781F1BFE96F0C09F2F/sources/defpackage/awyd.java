package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awyd  reason: default package */
/* loaded from: classes2.dex */
public final class awyd implements awyp {
    public final HttpURLConnection a;
    public final awxx b;
    public final byte[] c;
    public long d;
    public int e = -1;
    public int f = 0;
    public axij g;
    private int h;

    public awyd(HttpURLConnection httpURLConnection, String str, awya awyaVar, awxx awxxVar) {
        this.a = httpURLConnection;
        try {
            httpURLConnection.setRequestMethod(str);
            httpURLConnection.setReadTimeout(300000);
            httpURLConnection.setConnectTimeout(300000);
            httpURLConnection.setDoInput(true);
            this.b = awxxVar;
            if (awxxVar != null) {
                httpURLConnection.setDoOutput(true);
                if (awxxVar.a() >= 0) {
                    long a = awxxVar.a() - awxxVar.e();
                    if (a < 2147483647L) {
                        httpURLConnection.setFixedLengthStreamingMode((int) a);
                    } else {
                        httpURLConnection.setFixedLengthStreamingMode(a);
                    }
                } else {
                    httpURLConnection.setChunkedStreamingMode(0);
                }
            }
            for (String str2 : awyaVar.c()) {
                for (String str3 : awyaVar.b(str2)) {
                    httpURLConnection.addRequestProperty(str2, str3);
                }
            }
            this.h = 1;
            this.c = new byte[65536];
        } catch (ProtocolException e) {
            throw new IllegalArgumentException("Invalid http method.", e);
        }
    }

    @Override // defpackage.awyp
    public final ankt a() {
        anku b = anku.b(new Callable() { // from class: awyc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                awyb d;
                awyd awydVar = awyd.this;
                try {
                    synchronized (awydVar) {
                        axij axijVar = awydVar.g;
                        if (axijVar != null) {
                            axijVar.d();
                        }
                    }
                    awydVar.g();
                    try {
                        OutputStream outputStream = awydVar.a.getOutputStream();
                        awydVar.a.connect();
                        if (awydVar.b != null) {
                            long currentTimeMillis = System.currentTimeMillis();
                            loop0: while (true) {
                                int i = 0;
                                while (awydVar.h()) {
                                    awydVar.g();
                                    int i2 = 0;
                                    while (i2 < 65536 && awydVar.h()) {
                                        try {
                                            int b2 = awydVar.b.b(awydVar.c, i2, 65536 - i2);
                                            awydVar.d += b2;
                                            i2 += b2;
                                            try {
                                                outputStream.write(awydVar.c, i2 - b2, b2);
                                            } catch (IOException unused) {
                                                d = awydVar.d();
                                            }
                                        } catch (IOException e) {
                                            throw new awyr(awyq.REQUEST_BODY_READ_ERROR, e);
                                        }
                                    }
                                    i += i2;
                                    if (i >= awydVar.e) {
                                        boolean z = true;
                                        if (awydVar.f > 0) {
                                            long currentTimeMillis2 = System.currentTimeMillis();
                                            if (currentTimeMillis2 - currentTimeMillis >= awydVar.f) {
                                                currentTimeMillis = currentTimeMillis2;
                                            } else {
                                                z = false;
                                            }
                                        }
                                        if (z) {
                                            synchronized (awydVar) {
                                                axij axijVar2 = awydVar.g;
                                                if (axijVar2 != null) {
                                                    axijVar2.a(awydVar);
                                                }
                                            }
                                        }
                                    }
                                }
                                break loop0;
                            }
                            d = awydVar.d();
                        } else {
                            d = awydVar.d();
                        }
                    } catch (FileNotFoundException e2) {
                        throw new awyr(awyq.BAD_URL, e2);
                    } catch (IOException e3) {
                        try {
                            d = awydVar.d();
                        } catch (awyr unused2) {
                            throw new awyr(awyq.CONNECTION_ERROR, e3);
                        }
                    }
                    synchronized (awydVar) {
                        axij axijVar3 = awydVar.g;
                        if (axijVar3 != null) {
                            axijVar3.c(awydVar);
                        }
                    }
                    return new awys(d);
                } catch (awyr e4) {
                    synchronized (awydVar) {
                        axij axijVar4 = awydVar.g;
                        if (axijVar4 != null) {
                            axijVar4.b(awydVar);
                        }
                        return new awys(e4);
                    }
                }
            }
        });
        anlk anlkVar = new anlk();
        anlkVar.d("Scotty-Uploader-HttpUrlConnectionHttpClient-%d");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(anlk.b(anlkVar));
        newSingleThreadExecutor.execute(b);
        newSingleThreadExecutor.shutdown();
        return b;
    }

    @Override // defpackage.awyp
    public final /* synthetic */ ankt b() {
        return axij.l();
    }

    @Override // defpackage.awyp
    public final awxx c() {
        return this.b;
    }

    public final awyb d() {
        InputStream errorStream;
        awya awyaVar;
        g();
        try {
            int responseCode = this.a.getResponseCode();
            try {
                errorStream = this.a.getInputStream();
            } catch (IOException unused) {
                errorStream = this.a.getErrorStream();
            }
            Map<String, List<String>> headerFields = this.a.getHeaderFields();
            if (headerFields != null) {
                awyaVar = new awya();
                for (String str : headerFields.keySet()) {
                    if (str != null) {
                        for (String str2 : headerFields.get(str)) {
                            awyaVar.d(str, str2);
                        }
                    }
                }
            } else {
                awyaVar = null;
            }
            return new awyb(responseCode, awyaVar, errorStream);
        } catch (IOException e) {
            throw new awyr(awyq.CONNECTION_ERROR, "Error while reading response code.", e);
        }
    }

    @Override // defpackage.awyp
    public final String e() {
        return null;
    }

    @Override // defpackage.awyp
    public final void f() {
        synchronized (this) {
            this.h = 3;
            notifyAll();
        }
    }

    public final synchronized void g() {
        int i;
        while (true) {
            i = this.h;
            if (i != 2) {
                break;
            }
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
        if (i == 3) {
            throw new awyr(awyq.CANCELED, "");
        }
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        araa.x(z);
    }

    public final boolean h() {
        try {
            return this.b.i();
        } catch (IOException e) {
            throw new awyr(awyq.REQUEST_BODY_READ_ERROR, e);
        }
    }

    @Override // defpackage.awyp
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // defpackage.awyp
    public final synchronized void j(axij axijVar, int i, int i2) {
        this.g = axijVar;
        if (i > 0) {
            this.e = i;
        }
        this.f = i2;
    }
}

package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: cmkq  reason: default package */
/* loaded from: classes5.dex */
public final class cmkq extends cmka implements cmkz {
    private static final Pattern a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> b = new AtomicReference<>();
    private final String c;
    private final cmky d;
    private final cmky e;
    private HttpURLConnection f;
    private InputStream g;
    private boolean h;
    private int i;
    private long j;
    private long k;
    private long l;
    private long m;

    public cmkq() {
        String str = clnd.a;
        throw null;
    }

    private final void k() {
        HttpURLConnection httpURLConnection = this.f;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                cmna.a("Unexpected error while disconnecting", e);
            }
            this.f = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x010a, code lost:
        if (r5 != 0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f1  */
    @Override // defpackage.cmkg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(defpackage.cmkj r21) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmkq.c(cmkj):long");
    }

    @Override // defpackage.cmkg
    public final Uri d() {
        HttpURLConnection httpURLConnection = this.f;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // defpackage.cmka, defpackage.cmkg
    public final Map<String, List<String>> e() {
        HttpURLConnection httpURLConnection = this.f;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    public cmkq(String str, cmky cmkyVar) {
        super(true);
        cmmn.h(str);
        this.c = str;
        this.e = new cmky();
        this.d = cmkyVar;
    }

    @Override // defpackage.cmkg
    public final void f() {
        try {
            if (this.g != null) {
                HttpURLConnection httpURLConnection = this.f;
                long j = this.k;
                if (j != -1) {
                    j -= this.m;
                }
                if (cmny.a == 19 || cmny.a == 20) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (j == -1) {
                            if (inputStream.read() != -1) {
                            }
                        } else if (j <= 2048) {
                        }
                        String name = inputStream.getClass().getName();
                        if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                            Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(inputStream, new Object[0]);
                        }
                    } catch (Exception unused) {
                    }
                }
                try {
                    this.g.close();
                } catch (IOException e) {
                    throw new cmkw(e);
                }
            }
        } finally {
            this.g = null;
            k();
            if (this.h) {
                this.h = false;
                i();
            }
        }
    }

    @Override // defpackage.cmkd
    public final int a(byte[] bArr, int i, int i2) {
        try {
            if (this.l != this.j) {
                byte[] andSet = b.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j = this.l;
                    long j2 = this.j;
                    if (j != j2) {
                        int read = this.g.read(andSet, 0, (int) Math.min(j2 - j, andSet.length));
                        if (Thread.currentThread().isInterrupted()) {
                            throw new InterruptedIOException();
                        }
                        if (read != -1) {
                            this.l += read;
                            h(read);
                        } else {
                            throw new EOFException();
                        }
                    } else {
                        b.set(andSet);
                        break;
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.k;
            if (j3 != -1) {
                long j4 = j3 - this.m;
                if (j4 != 0) {
                    i2 = (int) Math.min(i2, j4);
                }
                return -1;
            }
            int read2 = this.g.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.k != -1) {
                    throw new EOFException();
                }
                return -1;
            }
            this.m += read2;
            h(read2);
            return read2;
        } catch (IOException e) {
            throw new cmkw(e);
        }
    }
}

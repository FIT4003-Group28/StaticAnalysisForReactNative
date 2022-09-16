package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
/* compiled from: PG */
/* renamed from: atp  reason: default package */
/* loaded from: classes2.dex */
public class atp extends ass implements ati {
    final UrlRequest.Callback b;
    public final boolean c;
    public final pvt d;
    public final boolean e;
    public UrlRequest f;
    public asy g;
    public UrlResponseInfo h;
    public IOException i;
    public boolean j;
    private final CronetEngine k;
    private final Executor l;
    private final int m;
    private final int n;
    private final ath o;
    private final ampt p;
    private boolean q;
    private long r;
    private ByteBuffer s;
    private volatile long t;

    static {
        piq.b("goog.exo.cronet");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public atp(CronetEngine cronetEngine, Executor executor, int i, int i2, boolean z, ampt amptVar, boolean z2) {
        super(true);
        this.k = cronetEngine;
        ptx.a(executor);
        this.l = executor;
        this.m = i;
        this.n = i2;
        this.c = z;
        this.p = amptVar;
        this.e = z2;
        this.b = new ato(this);
        this.o = new ath();
        this.d = new pvt();
    }

    private static int q(UrlRequest urlRequest) {
        pvt pvtVar = new pvt();
        int[] iArr = new int[1];
        urlRequest.getStatus(new atm(iArr, pvtVar));
        pvtVar.a();
        return iArr[0];
    }

    private static String r(Map map, String str) {
        List list = (List) map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    private final ByteBuffer s() {
        if (this.s == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32768);
            this.s = allocateDirect;
            allocateDirect.limit(0);
        }
        return this.s;
    }

    private final void t(ByteBuffer byteBuffer, asy asyVar) {
        UrlRequest urlRequest = this.f;
        int i = pxi.a;
        urlRequest.read(byteBuffer);
        try {
        } catch (InterruptedException unused) {
            if (byteBuffer == this.s) {
                this.s = null;
            }
            Thread.currentThread().interrupt();
            this.i = new InterruptedIOException();
        } catch (SocketTimeoutException e) {
            if (byteBuffer == this.s) {
                this.s = null;
            }
            this.i = new ate(e, asyVar, 2002, 2);
        }
        if (this.d.c(this.n)) {
            IOException iOException = this.i;
            if (iOException == null) {
                return;
            }
            if (iOException instanceof ate) {
                throw ((ate) iOException);
            }
            throw ate.rw(iOException, asyVar, 2);
        }
        throw new SocketTimeoutException();
    }

    @Override // defpackage.ass, defpackage.asv
    public final Map a() {
        UrlResponseInfo urlResponseInfo = this.h;
        return urlResponseInfo == null ? Collections.emptyMap() : urlResponseInfo.getAllHeaders();
    }

    @Override // defpackage.ast
    public final int g(byte[] bArr, int i, int i2) {
        ptx.e(this.q);
        if (i2 == 0) {
            return 0;
        }
        if (this.r == 0) {
            return -1;
        }
        ByteBuffer s = s();
        if (!s.hasRemaining()) {
            this.d.f();
            s.clear();
            asy asyVar = this.g;
            int i3 = pxi.a;
            t(s, asyVar);
            if (this.j) {
                this.r = 0L;
                return -1;
            }
            s.flip();
            ptx.e(s.hasRemaining());
        }
        long[] jArr = new long[3];
        long j = this.r;
        if (j == -1) {
            j = Long.MAX_VALUE;
        }
        jArr[0] = j;
        jArr[1] = s.remaining();
        jArr[2] = i2;
        aqxo.p(true);
        long j2 = jArr[0];
        for (int i4 = 1; i4 < 3; i4++) {
            long j3 = jArr[i4];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        int i5 = (int) j2;
        s.get(bArr, i, i5);
        long j4 = this.r;
        if (j4 != -1) {
            this.r = j4 - i5;
        }
        c(i5);
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00aa, code lost:
        if (r14 != 0) goto L37;
     */
    @Override // defpackage.asv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long h(defpackage.asy r17) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atp.h(asy):long");
    }

    @Override // defpackage.asv
    public final Uri i() {
        UrlResponseInfo urlResponseInfo = this.h;
        if (urlResponseInfo == null) {
            return null;
        }
        return Uri.parse(urlResponseInfo.getUrl());
    }

    @Override // defpackage.asv
    public final synchronized void j() {
        UrlRequest urlRequest = this.f;
        if (urlRequest != null) {
            urlRequest.cancel();
            this.f = null;
        }
        ByteBuffer byteBuffer = this.s;
        if (byteBuffer != null) {
            byteBuffer.limit(0);
        }
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = false;
        if (this.q) {
            this.q = false;
            d();
        }
    }

    @Override // defpackage.ati
    public final int k() {
        UrlResponseInfo urlResponseInfo = this.h;
        if (urlResponseInfo == null || urlResponseInfo.getHttpStatusCode() <= 0) {
            return -1;
        }
        return this.h.getHttpStatusCode();
    }

    @Override // defpackage.ati
    public final void l() {
        this.o.b();
    }

    @Override // defpackage.ati
    public final void m(String str, String str2) {
        this.o.c(str, str2);
    }

    public final int n(ByteBuffer byteBuffer) {
        ptx.e(this.q);
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Passed buffer is not a direct ByteBuffer");
        }
        boolean z = false;
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.r == 0) {
            return -1;
        }
        int remaining = byteBuffer.remaining();
        ByteBuffer byteBuffer2 = this.s;
        if (byteBuffer2 != null) {
            int min = Math.min(byteBuffer2.remaining(), byteBuffer.remaining());
            int limit = byteBuffer2.limit();
            byteBuffer2.limit(byteBuffer2.position() + min);
            byteBuffer.put(byteBuffer2);
            byteBuffer2.limit(limit);
            if (min != 0) {
                long j = this.r;
                if (j != -1) {
                    this.r = j - min;
                }
                c(min);
                return min;
            }
        }
        this.d.f();
        asy asyVar = this.g;
        int i = pxi.a;
        t(byteBuffer, asyVar);
        if (this.j) {
            this.r = 0L;
            return -1;
        }
        if (remaining > byteBuffer.remaining()) {
            z = true;
        }
        ptx.e(z);
        int remaining2 = remaining - byteBuffer.remaining();
        long j2 = this.r;
        if (j2 != -1) {
            this.r = j2 - remaining2;
        }
        c(remaining2);
        return remaining2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public UrlRequest.Builder o(asy asyVar) {
        UrlRequest.Builder mo564allowDirectExecutor = this.k.mo551newUrlRequestBuilder(asyVar.a.toString(), this.b, this.l).mo568setPriority(3).mo564allowDirectExecutor();
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.o.a());
        hashMap.putAll(asyVar.e);
        for (Map.Entry entry : hashMap.entrySet()) {
            mo564allowDirectExecutor.mo563addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        if (asyVar.d == null || hashMap.containsKey("Content-Type")) {
            String c = atj.c(asyVar.g, asyVar.h);
            if (c != null) {
                mo564allowDirectExecutor.mo563addHeader("Range", c);
            }
            mo564allowDirectExecutor.mo567setHttpMethod(asyVar.e());
            byte[] bArr = asyVar.d;
            if (bArr != null) {
                mo564allowDirectExecutor.mo569setUploadDataProvider(new atl(bArr), this.l);
            }
            return mo564allowDirectExecutor;
        }
        throw new atn(asyVar, (char[]) null);
    }

    public final void p() {
        this.t = SystemClock.elapsedRealtime() + this.m;
    }
}

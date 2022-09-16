package org.chromium.net.impl;

import J.N;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.CronetException;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class CronetUrlRequest extends bagm {
    private int A;
    private baen B;
    private baeu C;
    public long a;
    public boolean b;
    public final Object c = new Object();
    public final bagx d;
    public final bagv e;
    public CronetUploadDataStream f;
    public bagp g;
    public CronetException h;
    private final boolean i;
    private boolean j;
    private boolean k;
    private final CronetUrlRequestContext l;
    private final Executor m;
    private final List n;
    private final String o;
    private final int p;
    private final int q;
    private String r;
    private final baet s;
    private final Collection t;
    private final boolean u;
    private final boolean v;
    private final boolean w;
    private final int x;
    private final boolean y;
    private final int z;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
        if (r23 != 2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CronetUrlRequest(org.chromium.net.impl.CronetUrlRequestContext r9, java.lang.String r10, int r11, org.chromium.net.UrlRequest.Callback r12, java.util.concurrent.Executor r13, java.util.Collection r14, boolean r15, boolean r16, boolean r17, boolean r18, int r19, boolean r20, int r21, org.chromium.net.RequestFinishedInfo.Listener r22, int r23) {
        /*
            r8 = this;
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r22
            r4 = r23
            r8.<init>()
            java.lang.Object r5 = new java.lang.Object
            r5.<init>()
            r0.c = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0.n = r5
            baet r6 = new baet
            r6.<init>()
            r0.s = r6
            r6 = r17
            r0.i = r6
            r6 = r9
            r0.l = r6
            r0.o = r1
            r5.add(r10)
            r1 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L40
            if (r2 == r7) goto L3e
            if (r2 == r6) goto L41
            if (r2 == r1) goto L3c
            if (r2 == r5) goto L3a
            goto L3c
        L3a:
            r1 = 5
            goto L41
        L3c:
            r1 = 4
            goto L41
        L3e:
            r1 = 2
            goto L41
        L40:
            r1 = 1
        L41:
            r0.p = r1
            bagx r1 = new bagx
            r2 = r12
            r1.<init>(r12)
            r0.d = r1
            r1 = r13
            r0.m = r1
            r1 = r14
            r0.t = r1
            r1 = r15
            r0.u = r1
            r1 = r16
            r0.v = r1
            r1 = r18
            r0.w = r1
            r1 = r19
            r0.x = r1
            r1 = r20
            r0.y = r1
            r1 = r21
            r0.z = r1
            if (r3 == 0) goto L70
            bagv r1 = new bagv
            r1.<init>(r3)
            goto L71
        L70:
            r1 = 0
        L71:
            r0.e = r1
            r1 = 0
            if (r4 == 0) goto L7d
            if (r4 == r7) goto L7b
            if (r4 == r6) goto L7e
            goto L7d
        L7b:
            r6 = 1
            goto L7e
        L7d:
            r6 = 0
        L7e:
            r0.q = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetUrlRequest.<init>(org.chromium.net.impl.CronetUrlRequestContext, java.lang.String, int, org.chromium.net.UrlRequest$Callback, java.util.concurrent.Executor, java.util.Collection, boolean, boolean, boolean, boolean, int, boolean, int, org.chromium.net.RequestFinishedInfo$Listener, int):void");
    }

    private final bagp l(int i, String str, String[] strArr, boolean z, String str2, String str3, long j) {
        baet baetVar = new baet();
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            baetVar.add(new AbstractMap.SimpleImmutableEntry(strArr[i2], strArr[i2 + 1]));
        }
        return new bagp(new ArrayList(this.n), i, str, baetVar, z, str2, str3, j);
    }

    private final void o(Runnable runnable) {
        try {
            this.m.execute(runnable);
        } catch (RejectedExecutionException e) {
            bacc.d(CronetUrlRequestContext.b, "Exception posting task to executor", e);
            n(new baem("Exception posting task to executor", e));
        }
    }

    private void onCanceled() {
        o(new baer(this, 3));
    }

    private void onError(int i, int i2, int i3, String str, long j) {
        bagp bagpVar = this.g;
        if (bagpVar != null) {
            bagpVar.a(j);
        }
        if (i != 10) {
            if (i != 3) {
                switch (i) {
                    case 1:
                        i = 1;
                        break;
                    case 2:
                        i = 2;
                        break;
                    case 3:
                        i = 3;
                        break;
                    case 4:
                        i = 4;
                        break;
                    case 5:
                        i = 5;
                        break;
                    case 6:
                        i = 6;
                        break;
                    case 7:
                        i = 7;
                        break;
                    case 8:
                        i = 8;
                        break;
                    case 9:
                        i = 9;
                        break;
                    case 10:
                        i = 10;
                        break;
                    case 11:
                        i = 11;
                        break;
                    default:
                        String str2 = CronetUrlRequestContext.b;
                        bacc.d(str2, "Unknown error code: " + i, new Object[0]);
                        break;
                }
                n(new bagj("Exception in CronetUrlRequest: " + str, i, i2));
                return;
            }
            i = 3;
        }
        n(new bagk("Exception in CronetUrlRequest: " + str, i, i2, i3));
    }

    private void onNativeAdapterDestroyed() {
        synchronized (this.c) {
            if (this.h == null) {
                return;
            }
            try {
                this.m.execute(new baer(this, 4));
            } catch (RejectedExecutionException e) {
                bacc.d(CronetUrlRequestContext.b, "Exception posting task to executor", e);
            }
        }
    }

    private void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        this.g.a(j);
        if (byteBuffer.position() != i2 || byteBuffer.limit() != i3) {
            n(new baem("ByteBuffer modified externally during read", null));
            return;
        }
        if (this.C == null) {
            this.C = new baeu(this);
        }
        byteBuffer.position(i2 + i);
        baeu baeuVar = this.C;
        baeuVar.a = byteBuffer;
        o(baeuVar);
    }

    private void onRedirectReceived(String str, int i, String str2, String[] strArr, boolean z, String str3, String str4, long j) {
        bagp l = l(i, str2, strArr, z, str3, str4, j);
        this.n.add(str);
        o(new baeq(this, l, str));
    }

    private void onResponseStarted(int i, String str, String[] strArr, boolean z, String str2, String str3, long j) {
        this.g = l(i, str, strArr, z, str2, str3, j);
        o(new baer(this));
    }

    private void onStatus(VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener, int i) {
        o(new bafu(versionSafeCallbacks$UrlRequestStatusListener, i, 1));
    }

    private void onSucceeded(long j) {
        this.g.a(j);
        o(new baer(this, 2));
    }

    @Override // defpackage.bagm
    public final void a(String str, String str2) {
        m();
        if (str != null) {
            if (str2 == null) {
                throw new NullPointerException("Invalid header value.");
            }
            this.s.add(new AbstractMap.SimpleImmutableEntry(str, str2));
            return;
        }
        throw new NullPointerException("Invalid header name.");
    }

    public final void b() {
        if (!this.i) {
            if (Thread.currentThread() == this.l.e) {
                throw new InlineExecutionProhibitedException();
            }
        }
    }

    public final void c(int i) {
        this.A = i;
        if (this.a == 0) {
            return;
        }
        this.l.d();
        N.M4znfYdB(this.a, this, i == 2);
        this.a = 0L;
    }

    public final void d() {
        baen baenVar = this.B;
        if (baenVar != null) {
            bagl baglVar = new bagl(this.o, this.t, baenVar, this.A, this.g, this.h);
            this.l.f(baglVar);
            bagv bagvVar = this.e;
            if (bagvVar == null) {
                return;
            }
            try {
                bagvVar.getExecutor().execute(new baes(this, baglVar));
            } catch (RejectedExecutionException e) {
                bacc.d(CronetUrlRequestContext.b, "Exception posting task to executor", e);
            }
        }
    }

    public final void e(Exception exc) {
        baeb baebVar = new baeb("Exception received from UrlRequest.Callback", exc);
        bacc.d(CronetUrlRequestContext.b, "Exception in CalledByNative method", exc);
        n(baebVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(Throwable th) {
        baeb baebVar = new baeb("Exception received from UploadDataProvider", th);
        bacc.d(CronetUrlRequestContext.b, "Exception in upload method", th);
        n(baebVar);
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        synchronized (this.c) {
            if (this.b) {
                this.b = false;
                if (j()) {
                    return;
                }
                N.Mhp54Oqs(this.a, this);
                return;
            }
            throw new IllegalStateException("No redirect to follow.");
        }
    }

    @Override // defpackage.bagm
    public final void g(String str) {
        m();
        this.r = str;
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(UrlRequest.StatusListener statusListener) {
        VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener = new VersionSafeCallbacks$UrlRequestStatusListener(statusListener);
        synchronized (this.c) {
            long j = this.a;
            if (j != 0) {
                N.MgIIMpT9(j, this, versionSafeCallbacks$UrlRequestStatusListener);
            } else {
                o(new baep(versionSafeCallbacks$UrlRequestStatusListener));
            }
        }
    }

    @Override // defpackage.bagm
    public final void h(UploadDataProvider uploadDataProvider, Executor executor) {
        if (this.r == null) {
            this.r = "POST";
        }
        this.f = new CronetUploadDataStream(uploadDataProvider, executor, this);
    }

    public final void i() {
        N.MabZ5m6r(this.a, this);
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        boolean j;
        synchronized (this.c) {
            j = j();
        }
        return j;
    }

    public final boolean j() {
        return this.j && this.a == 0;
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(ByteBuffer byteBuffer) {
        bajw.h(byteBuffer);
        bajw.g(byteBuffer);
        synchronized (this.c) {
            if (this.k) {
                this.k = false;
                if (j()) {
                    return;
                }
                if (N.MfCxA8r3(this.a, this, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                    return;
                }
                this.k = true;
                throw new IllegalArgumentException("Unable to call native read");
            }
            throw new IllegalStateException("Unexpected read attempt.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0074 A[Catch: RuntimeException -> 0x00fa, all -> 0x0100, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0021, B:13:0x0029, B:15:0x0045, B:18:0x004e, B:19:0x0066, B:20:0x0067, B:21:0x006e, B:23:0x0074, B:25:0x0088, B:28:0x0095, B:31:0x00aa, B:32:0x00d4, B:33:0x00d5, B:37:0x00dc, B:38:0x00e6, B:42:0x00ea, B:43:0x00f1, B:50:0x00fc, B:51:0x00ff, B:45:0x00f3, B:46:0x00f8), top: B:57:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f2  */
    @Override // org.chromium.net.UrlRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void start() {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetUrlRequest.start():void");
    }

    private final void m() {
        synchronized (this.c) {
            if (this.j || j()) {
                throw new IllegalStateException("Request is already started.");
            }
        }
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        synchronized (this.c) {
            if (!j() && this.j) {
                c(2);
            }
        }
    }

    private final void n(CronetException cronetException) {
        synchronized (this.c) {
            if (j()) {
                return;
            }
            this.h = cronetException;
            c(1);
        }
    }

    private void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15) {
        synchronized (this.c) {
            if (this.B == null) {
                this.B = new baen(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z, j14, j15);
            } else {
                throw new IllegalStateException("Metrics collection should only happen once.");
            }
        }
    }
}

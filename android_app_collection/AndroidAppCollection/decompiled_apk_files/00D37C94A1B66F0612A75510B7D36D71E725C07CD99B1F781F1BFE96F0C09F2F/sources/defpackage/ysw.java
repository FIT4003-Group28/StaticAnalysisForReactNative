package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ysw  reason: default package */
/* loaded from: classes4.dex */
public final class ysw extends UrlRequest.Callback {
    public final snc a;
    public final ysv b;
    public final ytx c;
    public final yrh d;
    private final Executor g;
    private final yua h;
    private final cer i;
    private final zav p;
    private final ArrayDeque j = new ArrayDeque(2);
    public volatile int e = 0;
    private long k = -1;
    private int l = 0;
    private boolean m = false;
    private boolean n = false;
    public long f = -1;
    private long o = -1;

    public ysw(snc sncVar, zav zavVar, Executor executor, yua yuaVar, cer cerVar, ysv ysvVar, ytx ytxVar, yrh yrhVar, byte[] bArr) {
        this.a = sncVar;
        this.p = zavVar;
        this.g = executor;
        this.h = yuaVar;
        this.i = cerVar;
        this.b = ysvVar;
        this.c = ytxVar;
        this.d = yrhVar;
    }

    private final int a(long j) {
        if (j > 393216) {
            return 393216;
        }
        if (j > 256) {
            return (int) j;
        }
        if (!this.n || this.m) {
            return 8192;
        }
        this.m = true;
        return 256;
    }

    private final void b(UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        cew cewVar;
        byte[] bArr;
        this.d.b();
        if (urlResponseInfo == null || cronetException != null) {
            c(null, cronetException);
            return;
        }
        long j = this.o - this.f;
        if (urlResponseInfo.getHttpStatusCode() == 304) {
            abhq c = yqp.c();
            cer cerVar = this.i;
            if (cerVar != null) {
                c.c(cerVar.g.entrySet());
                bArr = this.i.a;
            } else {
                bArr = null;
            }
            c.c(urlResponseInfo.getAllHeadersAsList());
            cewVar = new cew(304, bArr, c.a().b(), true, j);
        } else {
            abhq c2 = yqp.c();
            c2.c(urlResponseInfo.getAllHeadersAsList());
            yqp a = c2.a();
            try {
                try {
                    byte[] g = yqz.i(this.j).g();
                    this.j.clear();
                    cewVar = new cew(urlResponseInfo.getHttpStatusCode(), g, a.b(), false, j);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                this.j.clear();
                throw th;
            }
        }
        c(cewVar, null);
    }

    private final void c(final cew cewVar, final CronetException cronetException) {
        this.g.execute(new Runnable() { // from class: ysu
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                ysw yswVar = ysw.this;
                cew cewVar2 = cewVar;
                CronetException cronetException2 = cronetException;
                ysv ysvVar = yswVar.b;
                ytu ytuVar = (ytu) ysvVar;
                ytuVar.d.a(ytuVar.e, ytuVar.a.m(), "Received a response.", cronetException2);
                try {
                    try {
                        if (((ytu) ysvVar).c.c()) {
                            if (!((ytu) ysvVar).b.c(((ytu) ysvVar).a)) {
                                ((ytu) ysvVar).c.d();
                                return;
                            } else if (cewVar2 == null) {
                                ((ytu) ysvVar).b.a(((ytu) ysvVar).a);
                                return;
                            }
                        }
                    } catch (cff e) {
                        e = e;
                        z = false;
                    }
                    try {
                        if (cewVar2 == null) {
                            if (cronetException2 == null) {
                                throw new cfe();
                            }
                            if (!(cronetException2 instanceof NetworkException) || !((NetworkException) cronetException2).immediatelyRetryable()) {
                                throw new cev(cronetException2);
                            }
                            cfe cfeVar = new cfe();
                            cfeVar.initCause(cronetException2);
                            throw cfeVar;
                        }
                        int i = cewVar2.a;
                        if (i < 200 || i > 299) {
                            if (i != 401 && i != 403) {
                                throw new cfd(cewVar2);
                            }
                            throw new ceq(cewVar2);
                        }
                        ((ytu) ysvVar).c(cewVar2, null);
                    } catch (cff e2) {
                        e = e2;
                        z = true;
                        if ((!ytuVar.a.h() && !z) || !ytuVar.d(e)) {
                            ytuVar.c(cewVar2, e);
                        } else {
                            ytuVar.a();
                        }
                    }
                } catch (Exception e3) {
                    ytuVar.d.a(ytuVar.e, ytuVar.a.m(), "Unchecked exception thrown in onNetworkResponse().", e3);
                    ytuVar.b(e3);
                }
            }
        });
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ytw ytwVar;
        this.c.a();
        this.o = this.a.d();
        this.j.clear();
        if (this.e != 0) {
            int i = this.e;
            if (i == 1) {
                ytwVar = new ytw(6);
            } else if (i == 2) {
                ytwVar = new ytw(4);
            } else {
                ytwVar = new ytw(11);
            }
            b(null, ytwVar);
            return;
        }
        b(null, null);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.c.b();
        if (this.h.q()) {
            onCanceled(urlRequest, urlResponseInfo);
            return;
        }
        this.o = this.a.d();
        b(urlResponseInfo, cronetException);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.c.c();
        if (this.h.q()) {
            urlRequest.cancel();
            return;
        }
        int position = byteBuffer.position();
        this.k -= position - this.l;
        this.l = position;
        if (byteBuffer.hasRemaining()) {
            urlRequest.read(byteBuffer);
            return;
        }
        byteBuffer.flip();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(a(this.k));
        this.l = 0;
        this.j.add(allocateDirect);
        urlRequest.read(allocateDirect);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        this.c.d();
        if (this.p != null) {
            zav.e(str);
        }
        urlRequest.followRedirect();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    @Override // org.chromium.net.UrlRequest.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResponseStarted(org.chromium.net.UrlRequest r9, org.chromium.net.UrlResponseInfo r10) {
        /*
            r8 = this;
            ytx r0 = r8.c
            r0.e()
            ysv r0 = r8.b
            ytu r0 = (defpackage.ytu) r0
            yua r0 = r0.a
            java.lang.Class<yre> r1 = defpackage.yre.class
            java.lang.Object r0 = r0.k(r1)
            yre r0 = (defpackage.yre) r0
            if (r0 == 0) goto L18
            r0.a()
        L18:
            yua r0 = r8.h
            boolean r0 = r0.q()
            if (r0 != 0) goto Lc0
            java.util.Map r10 = r10.getAllHeaders()
            r0 = 0
            if (r10 == 0) goto L6c
            java.lang.String r1 = "Content-Length"
            boolean r2 = r10.containsKey(r1)
            r3 = 0
            if (r2 == 0) goto L3d
            java.lang.Object r1 = r10.get(r1)
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            goto L3e
        L3d:
            r1 = r0
        L3e:
            java.lang.String r2 = "Content-Encoding"
            boolean r4 = r10.containsKey(r2)
            if (r4 == 0) goto L53
            java.lang.Object r2 = r10.get(r2)
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            goto L54
        L53:
            r2 = r0
        L54:
            java.lang.String r4 = "Content-Type"
            boolean r5 = r10.containsKey(r4)
            if (r5 == 0) goto L69
            java.lang.Object r10 = r10.get(r4)
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r10 = r10.get(r3)
            r0 = r10
            java.lang.String r0 = (java.lang.String) r0
        L69:
            r10 = r0
            r0 = r1
            goto L6e
        L6c:
            r10 = r0
            r2 = r10
        L6e:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r3 = -9223372036854775808
            if (r1 != 0) goto L7b
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L7b
            goto L7c
        L7b:
            r0 = r3
        L7c:
            r5 = 0
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 >= 0) goto L83
            goto Lad
        L83:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto La9
            java.lang.String r3 = "identity"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L92
            goto La9
        L92:
            java.lang.String r2 = "application/x-protobuf"
            boolean r10 = r2.equals(r10)
            if (r10 == 0) goto L9f
            r2 = 3
            long r0 = r0 * r2
            goto Lac
        L9f:
            double r0 = (double) r0
            r2 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            java.lang.Double.isNaN(r0)
            double r0 = r0 * r2
            long r0 = (long) r0
            goto Lac
        La9:
            r10 = 1
            r8.n = r10
        Lac:
            r3 = r0
        Lad:
            r8.k = r3
            int r10 = r8.a(r3)
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.allocateDirect(r10)
            java.util.ArrayDeque r0 = r8.j
            r0.add(r10)
            r9.read(r10)
            return
        Lc0:
            r9.cancel()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ysw.onResponseStarted(org.chromium.net.UrlRequest, org.chromium.net.UrlResponseInfo):void");
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.c.f();
        if (this.h.q()) {
            onCanceled(urlRequest, urlResponseInfo);
            return;
        }
        this.o = this.a.d();
        ByteBuffer byteBuffer = (ByteBuffer) this.j.peekLast();
        byteBuffer.flip();
        if (!byteBuffer.hasRemaining()) {
            this.j.removeLast();
        }
        b(urlResponseInfo, null);
    }
}

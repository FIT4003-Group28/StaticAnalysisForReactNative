package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
/* compiled from: PG */
/* renamed from: chf  reason: default package */
/* loaded from: classes2.dex */
final class chf extends UrlRequest.Callback {
    public final List a = new ArrayList(2);
    public cnf b;
    public cfv c;
    public UrlRequest d;
    public volatile boolean e;
    public cha f;
    final /* synthetic */ chi g;

    public chf(chi chiVar) {
        this.g = chiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(org.chromium.net.UrlResponseInfo r4, org.chromium.net.CronetException r5, boolean r6, java.nio.ByteBuffer r7) {
        /*
            r3 = this;
            chi r0 = r3.g
            monitor-enter(r0)
            chi r1 = r3.g     // Catch: java.lang.Throwable -> Lb0
            java.util.Map r1 = r1.d     // Catch: java.lang.Throwable -> Lb0
            cnf r2 = r3.b     // Catch: java.lang.Throwable -> Lb0
            r1.remove(r2)     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb0
            r0 = 0
            if (r6 == 0) goto L12
        L10:
            r5 = r0
            goto L26
        L12:
            if (r5 == 0) goto L15
            goto L26
        L15:
            int r5 = r4.getHttpStatusCode()
            r1 = 200(0xc8, float:2.8E-43)
            if (r5 == r1) goto L10
            cho r5 = new cho
            int r4 = r4.getHttpStatusCode()
            r5.<init>(r4)
        L26:
            r4 = 0
            if (r5 != 0) goto L2d
            if (r6 != 0) goto L2d
            r1 = 1
            goto L2e
        L2d:
            r1 = 0
        L2e:
            java.lang.System.currentTimeMillis()
            if (r1 == 0) goto L5c
            java.util.List r5 = r3.a
            int r5 = r5.size()
            r6 = 0
        L3a:
            if (r6 >= r5) goto L87
            java.util.List r1 = r3.a
            java.lang.Object r1 = r1.get(r6)
            chj r1 = (defpackage.chj) r1
            cik r2 = r1.b
            chb r1 = r1.a
            java.lang.Object r1 = r1.b(r7)
            r2.f(r1)
            java.nio.ByteBuffer r7 = r7.asReadOnlyBuffer()
            java.nio.Buffer r7 = r7.position(r4)
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            int r6 = r6 + 1
            goto L3a
        L5c:
            java.lang.String r7 = "ChromiumSerializer"
            r1 = 6
            boolean r7 = android.util.Log.isLoggable(r7, r1)
            if (r7 == 0) goto L6e
            if (r6 != 0) goto L6e
            java.lang.String r6 = "ChromiumSerializer"
            java.lang.String r7 = "Request failed"
            android.util.Log.e(r6, r7, r5)
        L6e:
            java.util.List r6 = r3.a
            int r6 = r6.size()
            r7 = 0
        L75:
            if (r7 >= r6) goto L87
            java.util.List r1 = r3.a
            java.lang.Object r1 = r1.get(r7)
            chj r1 = (defpackage.chj) r1
            cik r1 = r1.b
            r1.g(r5)
            int r7 = r7 + 1
            goto L75
        L87:
            r3.f = r0
            chi r5 = r3.g
            chg r6 = r5.c
            monitor-enter(r5)
            java.util.List r7 = r3.a     // Catch: java.lang.Throwable -> Lad
            r7.clear()     // Catch: java.lang.Throwable -> Lad
            r3.d = r0     // Catch: java.lang.Throwable -> Lad
            r3.e = r4     // Catch: java.lang.Throwable -> Lad
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lad
            monitor-enter(r6)
            java.util.ArrayDeque r4 = r6.a     // Catch: java.lang.Throwable -> Laa
            int r4 = r4.size()     // Catch: java.lang.Throwable -> Laa
            r5 = 50
            if (r4 >= r5) goto La8
            java.util.ArrayDeque r4 = r6.a     // Catch: java.lang.Throwable -> Laa
            r4.offer(r3)     // Catch: java.lang.Throwable -> Laa
        La8:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Laa
            return
        Laa:
            r4 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Laa
            throw r4
        Lad:
            r4 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lad
            throw r4
        Lb0:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb0
            goto Lb4
        Lb3:
            throw r4
        Lb4:
            goto Lb3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chf.a(org.chromium.net.UrlResponseInfo, org.chromium.net.CronetException, boolean, java.nio.ByteBuffer):void");
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ((Executor) chi.b.get()).execute(new che(this, this.c, urlResponseInfo));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        ((Executor) chi.b.get()).execute(new chd(this, this.c, urlResponseInfo, cronetException));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        urlRequest.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        long j;
        System.currentTimeMillis();
        this.f = new cha();
        Map allHeaders = urlResponseInfo.getAllHeaders();
        if (allHeaders.containsKey("content-length")) {
            long parseLong = Long.parseLong((String) ((List) allHeaders.get("content-length")).get(0));
            j = (!allHeaders.containsKey("content-encoding") || (((List) allHeaders.get("content-encoding")).size() == 1 && "identity".equals(((List) allHeaders.get("content-encoding")).get(0)))) ? parseLong + parseLong : parseLong + 1;
        } else {
            j = 8192;
        }
        urlRequest.read(ByteBuffer.allocateDirect((int) Math.min(j, 524288L)));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ((Executor) chi.b.get()).execute(new chc(this, this.c, urlResponseInfo));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        UrlRequest urlRequest2 = this.d;
        cha chaVar = this.f;
        ArrayDeque arrayDeque = chaVar.a;
        if (arrayDeque == null) {
            throw new RuntimeException(chaVar.b);
        }
        if (byteBuffer != arrayDeque.peekLast()) {
            chaVar.a.addLast(byteBuffer);
        }
        if (!byteBuffer.hasRemaining()) {
            byteBuffer = ByteBuffer.allocateDirect(8096);
        }
        urlRequest2.read(byteBuffer);
    }
}

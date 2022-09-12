package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
/* compiled from: PG */
/* renamed from: btb  reason: default package */
/* loaded from: classes4.dex */
final class btb extends UrlRequest.Callback {
    public final List<btf> a = new ArrayList(2);
    public cac b;
    public bro c;
    public UrlRequest d;
    public volatile boolean e;
    public bsw f;
    final /* synthetic */ bte g;

    public btb(bte bteVar) {
        this.g = bteVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[LOOP:1: B:21:0x0059->B:22:0x005b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(org.chromium.net.UrlResponseInfo r4, org.chromium.net.CronetException r5, boolean r6, java.nio.ByteBuffer r7) {
        /*
            r3 = this;
            bte r0 = r3.g
            monitor-enter(r0)
            bte r1 = r3.g     // Catch: java.lang.Throwable -> L94
            java.util.Map<cac, btb> r1 = r1.d     // Catch: java.lang.Throwable -> L94
            cac r2 = r3.b     // Catch: java.lang.Throwable -> L94
            r1.remove(r2)     // Catch: java.lang.Throwable -> L94
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L94
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
            btm r5 = new btm
            int r4 = r4.getHttpStatusCode()
            r5.<init>(r4)
        L26:
            r4 = 0
            if (r5 != 0) goto L52
            if (r6 != 0) goto L52
            java.util.List<btf> r5 = r3.a
            int r5 = r5.size()
            r6 = 0
        L32:
            if (r6 >= r5) goto L6b
            java.util.List<btf> r1 = r3.a
            java.lang.Object r1 = r1.get(r6)
            btf r1 = (defpackage.btf) r1
            bui<? super T> r1 = r1.a
            java.io.InputStream r2 = defpackage.cjb.c(r7)
            r1.f(r2)
            java.nio.ByteBuffer r7 = r7.asReadOnlyBuffer()
            java.nio.Buffer r7 = r7.position(r4)
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            int r6 = r6 + 1
            goto L32
        L52:
            java.util.List<btf> r6 = r3.a
            int r6 = r6.size()
            r7 = 0
        L59:
            if (r7 >= r6) goto L6b
            java.util.List<btf> r1 = r3.a
            java.lang.Object r1 = r1.get(r7)
            btf r1 = (defpackage.btf) r1
            bui<? super T> r1 = r1.a
            r1.g(r5)
            int r7 = r7 + 1
            goto L59
        L6b:
            r3.f = r0
            bte r5 = r3.g
            btc r6 = r5.c
            monitor-enter(r5)
            java.util.List<btf> r7 = r3.a     // Catch: java.lang.Throwable -> L91
            r7.clear()     // Catch: java.lang.Throwable -> L91
            r3.d = r0     // Catch: java.lang.Throwable -> L91
            r3.e = r4     // Catch: java.lang.Throwable -> L91
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L91
            monitor-enter(r6)
            java.util.ArrayDeque<btb> r4 = r6.a     // Catch: java.lang.Throwable -> L8e
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L8e
            r5 = 50
            if (r4 >= r5) goto L8c
            java.util.ArrayDeque<btb> r4 = r6.a     // Catch: java.lang.Throwable -> L8e
            r4.offer(r3)     // Catch: java.lang.Throwable -> L8e
        L8c:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L8e
            return
        L8e:
            r4 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L8e
            throw r4
        L91:
            r4 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L91
            throw r4
        L94:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L94
            goto L98
        L97:
            throw r4
        L98:
            goto L97
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btb.a(org.chromium.net.UrlResponseInfo, org.chromium.net.CronetException, boolean, java.nio.ByteBuffer):void");
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        bte.b.a().execute(new bta(this, this.c, urlResponseInfo));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        bte.b.a().execute(new bsz(this, this.c, urlResponseInfo, cronetException));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        urlRequest.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        long j;
        this.f = new bsw();
        Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
        if (allHeaders.containsKey("content-length")) {
            long parseLong = Long.parseLong(allHeaders.get("content-length").get(0));
            j = (!allHeaders.containsKey("content-encoding") || (allHeaders.get("content-encoding").size() == 1 && "identity".equals(allHeaders.get("content-encoding").get(0)))) ? parseLong + parseLong : parseLong + 1;
        } else {
            j = 8192;
        }
        urlRequest.read(ByteBuffer.allocateDirect((int) Math.min(j, 524288L)));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        bte.b.a().execute(new bsy(this, this.c, urlResponseInfo));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        UrlRequest urlRequest2 = this.d;
        bsw bswVar = this.f;
        ArrayDeque<ByteBuffer> arrayDeque = bswVar.a;
        if (arrayDeque == null) {
            throw new RuntimeException(bswVar.b);
        }
        if (byteBuffer != arrayDeque.peekLast()) {
            bswVar.a.addLast(byteBuffer);
        }
        if (!byteBuffer.hasRemaining()) {
            byteBuffer = ByteBuffer.allocateDirect(8096);
        }
        urlRequest2.read(byteBuffer);
    }
}

package defpackage;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
/* compiled from: PG */
/* renamed from: buhh  reason: default package */
/* loaded from: classes4.dex */
final class buhh extends UrlRequest.Callback {
    final /* synthetic */ buhi a;
    private final deig b;
    private final ByteArrayOutputStream c = new ByteArrayOutputStream(8192);
    private int d;

    public buhh(buhi buhiVar, deig deigVar) {
        this.a = buhiVar;
        this.b = deigVar;
        this.d = buhiVar.b.d.d;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.b.k(bvgp.a(cronetException));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        byteBuffer.flip();
        this.c.write(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.limit());
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        if (this.d <= 0) {
            urlRequest.cancel();
            deig deigVar = this.b;
            btzy btzyVar = btzy.h;
            int i = this.a.b.d.d;
            StringBuilder sb = new StringBuilder(40);
            sb.append("More redirects than allowed: ");
            sb.append(i);
            deigVar.k(new btzz(btzyVar.c(sb.toString())));
        } else if (!this.a.b.a.b || buhi.b(str)) {
            this.d--;
            urlRequest.followRedirect();
        } else {
            urlRequest.cancel();
            this.b.k(new btzz(btzy.h.c("Don't send authentication credentials to non-Google redirects.")));
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        if (!buhi.a.contains(Integer.valueOf(urlResponseInfo.getHttpStatusCode()))) {
            urlRequest.cancel();
            deig deigVar = this.b;
            btzy btzyVar = btzy.h;
            int httpStatusCode = urlResponseInfo.getHttpStatusCode();
            StringBuilder sb = new StringBuilder(50);
            sb.append("Expected HTTP status code 200, but got ");
            sb.append(httpStatusCode);
            deigVar.k(new btzz(btzyVar.c(sb.toString())));
            return;
        }
        urlRequest.read(ByteBuffer.allocateDirect(8192));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        try {
            bufg bZ = bufh.c.bZ();
            dspd x = dspd.x(this.c.toByteArray());
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bufh bufhVar = (bufh) bZ.b;
            x.getClass();
            bufhVar.a |= 1;
            bufhVar.b = x;
            this.b.j(bZ.bK());
        } catch (ClassCastException unused) {
            this.b.k(new btzz(btzy.l.c("Expected type HttpResponse")));
        }
    }
}

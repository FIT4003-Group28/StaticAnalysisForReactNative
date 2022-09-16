package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.chromium.net.CallbackException;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cljb  reason: default package */
/* loaded from: classes5.dex */
public final class cljb extends UrlRequest.Callback {
    @dzsi
    public WritableByteChannel a;
    private final deig<clli> b;
    private final deig<Long> c = deig.d();
    @dzsi
    private cljc d;
    private long e;

    public cljb(deig<clli> deigVar) {
        this.b = deigVar;
    }

    private final void a() {
        cljc cljcVar = this.d;
        if (cljcVar == null) {
            return;
        }
        cljcVar.close();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        a();
        this.c.k(new clle("UrlRequest cancelled"));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        clku a;
        Throwable cause;
        a();
        if (urlResponseInfo == null || urlResponseInfo.getHttpStatusCode() < 400) {
            if (cronetException instanceof NetworkException) {
                NetworkException networkException = (NetworkException) cronetException;
                clkt e = clku.e();
                e.c(networkException.getCronetInternalErrorCode());
                ((cliy) e).a = dbsj.e(networkException.getMessage());
                a = e.a();
            } else {
                clkt e2 = clku.e();
                ((cliy) e2).a = dbsj.e(cronetException.getMessage());
                a = e2.a();
            }
        } else {
            a = clku.g(urlResponseInfo.getHttpStatusCode(), urlResponseInfo.getAllHeaders(), urlResponseInfo.getHttpStatusText());
        }
        int i = cljg.a;
        if ((cronetException instanceof CallbackException) && (cause = cronetException.getCause()) != null) {
            cronetException = cause;
        }
        clle clleVar = new clle(a, cronetException);
        if (!this.b.isDone()) {
            this.b.k(clleVar);
        } else {
            this.c.k(clleVar);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        if (urlRequest.isDone()) {
            return;
        }
        if (this.c.isCancelled()) {
            urlRequest.cancel();
            return;
        }
        byteBuffer.flip();
        long j = this.e;
        WritableByteChannel writableByteChannel = this.a;
        dbsk.s(writableByteChannel);
        this.e = j + clkw.b(byteBuffer, writableByteChannel);
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        urlRequest.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        if (httpStatusCode >= 400) {
            this.b.k(new clle(clku.g(httpStatusCode, urlResponseInfo.getAllHeaders(), urlResponseInfo.getHttpStatusText())));
            urlRequest.cancel();
            return;
        }
        cljc cljcVar = new cljc(urlRequest, urlResponseInfo, this.c, this);
        this.d = cljcVar;
        this.b.j(cljcVar);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        a();
        this.c.j(Long.valueOf(this.e));
    }
}

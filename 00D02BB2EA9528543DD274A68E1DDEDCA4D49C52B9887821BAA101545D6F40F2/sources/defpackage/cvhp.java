package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cvhp  reason: default package */
/* loaded from: classes5.dex */
public final class cvhp extends UrlRequest.Callback {
    public final deig a;
    final /* synthetic */ cvhq b;

    public cvhp(cvhq cvhqVar, deig deigVar) {
        this.b = cvhqVar;
        this.a = deigVar;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.b.a.execute(new cvhn(this));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.b.a.execute(new cvhm(this, cronetException));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        this.b.a.execute(new cvho(this));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        try {
            int httpStatusCode = urlResponseInfo.getHttpStatusCode();
            if (httpStatusCode == 200) {
                urlRequest.read(ByteBuffer.allocateDirect(1024));
            } else {
                this.a.k(new btzz(btzy.e(httpStatusCode)));
            }
        } catch (Exception e) {
            this.a.k(e);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.b.a.execute(new cvhl(this));
    }
}

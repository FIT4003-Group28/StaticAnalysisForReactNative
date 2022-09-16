package defpackage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bahe  reason: default package */
/* loaded from: classes2.dex */
public final class bahe extends UrlRequest.Callback {
    final /* synthetic */ bahf a;

    public bahe(bahf bahfVar) {
        this.a = bahfVar;
    }

    private final void a(IOException iOException) {
        bahf bahfVar = this.a;
        bahfVar.f = iOException;
        bahh bahhVar = bahfVar.c;
        if (bahhVar != null) {
            bahhVar.c = iOException;
            bahhVar.a = true;
            bahhVar.b = null;
        }
        bahi bahiVar = bahfVar.d;
        if (bahiVar != null) {
            bahiVar.d = iOException;
            bahiVar.e = true;
        }
        bahfVar.n = true;
        this.a.a.c();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.a.e = urlResponseInfo;
        a(new IOException("disconnect() called"));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        if (cronetException != null) {
            this.a.e = urlResponseInfo;
            a(cronetException);
            return;
        }
        throw new IllegalStateException("Exception cannot be null in onFailed.");
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        bahf bahfVar = this.a;
        bahfVar.e = urlResponseInfo;
        bahfVar.a.c();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        URL url;
        boolean z;
        boolean z2;
        this.a.g = true;
        try {
            URL url2 = new URL(str);
            String protocol = url2.getProtocol();
            url = this.a.url;
            boolean equals = protocol.equals(url.getProtocol());
            z = this.a.instanceFollowRedirects;
            if (z) {
                this.a.url = url2;
            }
            z2 = this.a.instanceFollowRedirects;
            if (z2 && equals) {
                this.a.b.followRedirect();
                return;
            }
        } catch (MalformedURLException unused) {
        }
        bahf bahfVar = this.a;
        bahfVar.e = urlResponseInfo;
        bahfVar.b.cancel();
        a(null);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        bahf bahfVar = this.a;
        bahfVar.e = urlResponseInfo;
        bahfVar.n = true;
        this.a.a.c();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.a.e = urlResponseInfo;
        a(null);
    }
}

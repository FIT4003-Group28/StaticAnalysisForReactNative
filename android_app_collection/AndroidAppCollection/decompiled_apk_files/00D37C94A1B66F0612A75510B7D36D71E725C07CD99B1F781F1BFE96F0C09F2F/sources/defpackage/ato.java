package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.List;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ato  reason: default package */
/* loaded from: classes2.dex */
public final class ato extends UrlRequest.Callback {
    final /* synthetic */ atp a;

    public ato(atp atpVar) {
        this.a = atpVar;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final synchronized void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        if (urlRequest != this.a.f) {
            return;
        }
        if ((cronetException instanceof NetworkException) && ((NetworkException) cronetException).getErrorCode() == 1) {
            this.a.i = new UnknownHostException();
        } else {
            this.a.i = cronetException;
        }
        this.a.d.e();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final synchronized void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        atp atpVar = this.a;
        if (urlRequest != atpVar.f) {
            return;
        }
        atpVar.d.e();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final synchronized void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        UrlRequest urlRequest2 = this.a.f;
        if (urlRequest != urlRequest2) {
            return;
        }
        ptx.a(urlRequest2);
        asy asyVar = this.a.g;
        ptx.a(asyVar);
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        String str2 = null;
        if (asyVar.c == 2) {
            if (httpStatusCode != 307) {
                if (httpStatusCode == 308) {
                    httpStatusCode = 308;
                }
            }
            atp atpVar = this.a;
            urlResponseInfo.getHttpStatusText();
            urlResponseInfo.getAllHeaders();
            int i = pxi.a;
            atpVar.i = new atg(httpStatusCode, null, asyVar);
            this.a.d.e();
            return;
        }
        atp atpVar2 = this.a;
        if (atpVar2.c) {
            atpVar2.p();
        }
        if (!this.a.e || asyVar.c != 2 || httpStatusCode != 302) {
            urlRequest.followRedirect();
            return;
        }
        List list = (List) urlResponseInfo.getAllHeaders().get("Set-Cookie");
        if (list != null && !list.isEmpty()) {
            str2 = TextUtils.join(";", list);
        }
        urlRequest2.cancel();
        try {
            UrlRequest.Builder o = this.a.o(asyVar.d(Uri.parse(str)));
            if (!TextUtils.isEmpty(str2)) {
                o.mo563addHeader("Cookie", str2);
            }
            this.a.f = o.mo565build();
            this.a.f.start();
        } catch (IOException e) {
            this.a.i = e;
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final synchronized void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        atp atpVar = this.a;
        if (urlRequest != atpVar.f) {
            return;
        }
        atpVar.h = urlResponseInfo;
        atpVar.d.e();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final synchronized void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        atp atpVar = this.a;
        if (urlRequest != atpVar.f) {
            return;
        }
        atpVar.j = true;
        atpVar.d.e();
    }
}

package defpackage;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bujd  reason: default package */
/* loaded from: classes4.dex */
public final class bujd extends UrlRequest.Callback {
    public final deig a;
    public final buje b;
    public final buiz c = new buiz();
    final /* synthetic */ bujg d;

    public bujd(bujg bujgVar, deig deigVar, buje bujeVar) {
        this.d = bujgVar;
        this.a = deigVar;
        this.b = bujeVar;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.d.e.execute(new bujb(this, cronetException));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        try {
            if (byteBuffer.hasRemaining()) {
                urlRequest.read(byteBuffer);
                return;
            }
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(131072);
            this.c.a(allocateDirect);
            urlRequest.read(allocateDirect);
        } catch (Exception e) {
            this.a.k(e);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        this.d.e.execute(new bujc(this));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ckha a;
        try {
            int httpStatusCode = urlResponseInfo.getHttpStatusCode();
            if (httpStatusCode == 200) {
                Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
                if (allHeaders.containsKey("Server-Timing")) {
                    Map<String, Map<String, String>> a2 = bvgt.a(allHeaders.get("Server-Timing"));
                    if (a2.containsKey("gfet4t7")) {
                        Map<String, String> map = a2.get("gfet4t7");
                        if (map.containsKey("dur") && (a = ckjl.a(this.d.a.getClass())) != null) {
                            ((ckcp) this.d.d.a(a)).a(Math.round(Double.parseDouble(map.get("dur"))));
                        }
                    }
                }
                Map<String, List<String>> allHeaders2 = urlResponseInfo.getAllHeaders();
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(allHeaders2.containsKey("Content-Length") ? Integer.parseInt(allHeaders2.get("Content-Length").get(0)) + 1 : 131072);
                this.c.a(allocateDirect);
                urlRequest.read(allocateDirect);
                return;
            }
            this.a.k(new btzz(btzy.e(httpStatusCode)));
        } catch (Exception e) {
            this.a.k(e);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.d.e.execute(new buja(this));
    }
}

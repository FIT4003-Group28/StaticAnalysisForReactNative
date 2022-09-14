package defpackage;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: buil  reason: default package */
/* loaded from: classes4.dex */
public final class buil extends UrlRequest.Callback {
    public final deig a;
    public final buin b;
    @dzsi
    public buio c;
    final /* synthetic */ buip d;

    public buil(buip buipVar, deig deigVar, buin buinVar) {
        this.d = buipVar;
        this.a = deigVar;
        this.b = buinVar;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.d.l.execute(new buik(this, cronetException));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        byteBuffer.flip();
        try {
            buio buioVar = this.c;
            ByteBuffer byteBuffer2 = buioVar.a;
            if (byteBuffer2 != null) {
                byteBuffer2.put(byteBuffer);
            } else if (buioVar.b != null) {
                int remaining = byteBuffer.remaining();
                byte[] bArr = new byte[remaining];
                byteBuffer.get(bArr);
                buioVar.b.write(bArr, 0, remaining);
            } else {
                throw new NullPointerException("Neither the ByteBuffer nor the ByteArrayOutputStream is non-null!");
            }
        } catch (Exception e) {
            this.a.k(e);
        }
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        String valueOf = String.valueOf(this.d.a.getClass().getName());
        bvoo.j(new RuntimeException(valueOf.length() != 0 ? "Unexpected redirect received from GMM Server for request: ".concat(valueOf) : new String("Unexpected redirect received from GMM Server for request: ")));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        buio buioVar;
        ckha a;
        try {
            buin buinVar = this.b;
            buinVar.a.b(buinVar.b.f.e());
            Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
            int httpStatusCode = urlResponseInfo.getHttpStatusCode();
            if (httpStatusCode == 200) {
                if (allHeaders.containsKey("Server-Timing")) {
                    Map<String, Map<String, String>> a2 = bvgt.a(allHeaders.get("Server-Timing"));
                    if (a2.containsKey("gfet4t7")) {
                        Map<String, String> map = a2.get("gfet4t7");
                        if (map.containsKey("dur") && (a = ckjl.a(buinVar.b.a.getClass())) != null) {
                            ((ckcp) buinVar.b.g.a(a)).a(Math.round(Double.parseDouble(map.get("dur"))));
                        }
                    }
                }
                if (!allHeaders.containsKey("Content-Type") || !"application/binary".equals(dbsj.e(allHeaders.get("Content-Type").get(0)))) {
                    throw new btzz(btzy.e);
                }
                if (allHeaders.containsKey("Content-Length")) {
                    buioVar = new buio(Integer.parseInt(allHeaders.get("Content-Length").get(0)));
                } else {
                    buioVar = new buio();
                }
                this.c = buioVar;
                urlRequest.read(ByteBuffer.allocateDirect(131072));
                return;
            }
            throw new btzz(btzy.e(httpStatusCode));
        } catch (Exception e) {
            this.a.k(e);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.d.l.execute(new buij(this));
    }
}

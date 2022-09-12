package defpackage;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
/* compiled from: PG */
/* renamed from: cpko  reason: default package */
/* loaded from: classes5.dex */
public final class cpko extends UrlRequest.Callback {
    private final cpkm a = new cpkm();
    private final cpkj b;
    private String c;

    public cpko(cpkj cpkjVar) {
        this.b = cpkjVar;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.b.b(cronetException);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            urlRequest.read(byteBuffer);
            return;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.a.a(allocateDirect);
        urlRequest.read(allocateDirect);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        urlRequest.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.a.a(allocateDirect);
        urlRequest.read(allocateDirect);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ByteBuffer byteBuffer;
        cpkm cpkmVar = this.a;
        int i = 0;
        if (cpkmVar.a.isEmpty()) {
            byteBuffer = ByteBuffer.allocateDirect(0);
        } else if (cpkmVar.a.size() == 1) {
            byteBuffer = cpkmVar.a.get(0);
            byteBuffer.flip();
        } else {
            for (ByteBuffer byteBuffer2 : cpkmVar.a) {
                byteBuffer2.flip();
                i += byteBuffer2.remaining();
            }
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
            for (ByteBuffer byteBuffer3 : cpkmVar.a) {
                allocateDirect.put(byteBuffer3);
            }
            allocateDirect.flip();
            cpkmVar.a = new ArrayList();
            byteBuffer = allocateDirect;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        try {
            this.c = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            onFailed(urlRequest, urlResponseInfo, new cpkl(e));
        }
        this.b.a(this.c);
    }
}

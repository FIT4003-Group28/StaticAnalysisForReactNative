package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;
/* compiled from: PG */
/* renamed from: dyjx  reason: default package */
/* loaded from: classes6.dex */
final class dyjx extends BidirectionalStream.Callback {
    final /* synthetic */ dykb a;
    private List<Map.Entry<String, String>> b;

    public dyjx(dykb dykbVar) {
        this.a = dykbVar;
    }

    private final void a(List<Map.Entry<String, String>> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : list) {
            arrayList.add(entry.getKey());
            arrayList.add(entry.getValue());
        }
        byte[][] bArr = new byte[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i += 2) {
            bArr[i] = ((String) arrayList.get(i)).getBytes(Charset.forName("UTF-8"));
            int i2 = i + 1;
            bArr[i2] = ((String) arrayList.get(i2)).getBytes(Charset.forName("UTF-8"));
        }
        dyhw b = dygq.b(dyvo.b(bArr));
        dyka dykaVar = this.a.p;
        int i3 = dyka.i;
        synchronized (dykaVar.a) {
            dyka dykaVar2 = this.a.p;
            if (z) {
                dykaVar2.p(b);
            } else {
                dykaVar2.n(b);
            }
        }
    }

    private static final dyjb b(UrlResponseInfo urlResponseInfo) {
        return dyow.b(urlResponseInfo.getHttpStatusCode());
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onCanceled(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        dyjb dyjbVar;
        dyka dykaVar = this.a.p;
        int i = dyka.i;
        synchronized (dykaVar.a) {
            dyjbVar = this.a.p.e;
            if (dyjbVar == null) {
                if (urlResponseInfo == null) {
                    dyjbVar = dyjb.c.g("stream cancelled without reason");
                } else {
                    dyjbVar = b(urlResponseInfo);
                }
            }
        }
        this.a.r(dyjbVar);
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onFailed(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.a.r(dyjb.m.f(cronetException));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onReadCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        List<Map.Entry<String, String>> list;
        byteBuffer.flip();
        dyka dykaVar = this.a.p;
        int i = dyka.i;
        synchronized (dykaVar.a) {
            this.a.p.f = z;
            if (byteBuffer.remaining() != 0) {
                dyka.f(this.a.p, byteBuffer);
            }
        }
        if (!z || (list = this.b) == null) {
            return;
        }
        a(list, true);
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onResponseHeadersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        a(urlResponseInfo.getAllHeadersAsList(), false);
        bidirectionalStream.read(ByteBuffer.allocateDirect(4096));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onResponseTrailersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, UrlResponseInfo.HeaderBlock headerBlock) {
        boolean z;
        List<Map.Entry<String, String>> asList = headerBlock.getAsList();
        this.b = asList;
        dyka dykaVar = this.a.p;
        int i = dyka.i;
        synchronized (dykaVar.a) {
            z = this.a.p.f;
        }
        if (z) {
            a(asList, true);
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onStreamReady(BidirectionalStream bidirectionalStream) {
        dyka dykaVar = this.a.p;
        int i = dyka.i;
        synchronized (dykaVar.a) {
            this.a.p.a();
            dyka dykaVar2 = this.a.p;
            dykaVar2.c = true;
            for (dyjy dyjyVar : dykaVar2.b) {
                dykaVar2.h.q(dyjyVar.a, dyjyVar.b, dyjyVar.c);
            }
            dykaVar2.b.clear();
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onSucceeded(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        boolean z;
        dyka dykaVar = this.a.p;
        int i = dyka.i;
        synchronized (dykaVar.a) {
            z = false;
            if (this.b != null && this.a.p.f) {
                z = true;
            }
        }
        if (!z) {
            List<Map.Entry<String, String>> list = this.b;
            if (list != null) {
                a(list, true);
            } else if (urlResponseInfo != null) {
                a(urlResponseInfo.getAllHeadersAsList(), true);
            } else {
                throw new AssertionError("No response header or trailer");
            }
        }
        this.a.r(b(urlResponseInfo));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onWriteCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        dyka dykaVar = this.a.p;
        int i = dyka.i;
        synchronized (dykaVar.a) {
            dykb dykbVar = this.a;
            dyka dykaVar2 = dykbVar.p;
            if (!dykaVar2.g) {
                dykaVar2.g = true;
                dykbVar.f.b();
            }
            this.a.p.m(byteBuffer.position());
        }
    }
}

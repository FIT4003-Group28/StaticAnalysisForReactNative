package defpackage;

import io.grpc.Status;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.logging.Level;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;
/* compiled from: PG */
/* renamed from: aydg  reason: default package */
/* loaded from: classes2.dex */
public final class aydg extends BidirectionalStream.Callback {
    final /* synthetic */ aydj a;
    private List b;

    public aydg(aydj aydjVar) {
        this.a = aydjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x027a A[Catch: all -> 0x02dc, TryCatch #1 {, blocks: (B:12:0x0070, B:14:0x0077, B:16:0x007b, B:18:0x007f, B:20:0x0089, B:22:0x008d, B:80:0x02a7, B:23:0x00bb, B:25:0x00c5, B:34:0x0100, B:36:0x0107, B:37:0x011d, B:26:0x00d2, B:28:0x00d6, B:29:0x00df, B:31:0x00e9, B:33:0x00fa, B:32:0x00f2, B:38:0x0127, B:40:0x012b, B:45:0x0160, B:47:0x0164, B:48:0x018f, B:57:0x01ad, B:59:0x01b1, B:63:0x01e9, B:77:0x0276, B:79:0x027a, B:42:0x0152, B:44:0x0156, B:50:0x0193, B:52:0x019d, B:54:0x01a5, B:61:0x01dd, B:65:0x0216, B:67:0x0238, B:69:0x0244, B:72:0x024a, B:73:0x0262, B:75:0x0266, B:76:0x0271), top: B:92:0x0070 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a(java.util.List r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aydg.a(java.util.List, boolean):void");
    }

    private static final Status b(UrlResponseInfo urlResponseInfo) {
        return ayhf.a(urlResponseInfo.getHttpStatusCode());
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onCanceled(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        Status status;
        ayhi ayhiVar = this.a.p;
        ayaq ayaqVar = ayhi.m;
        synchronized (ayhiVar.r) {
            status = this.a.p.w;
            if (status == null) {
                if (urlResponseInfo != null) {
                    status = b(urlResponseInfo);
                } else {
                    status = Status.c.withDescription("stream cancelled without reason");
                }
            }
        }
        this.a.r(status);
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onFailed(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.a.r(Status.o.c(cronetException));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onReadCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        List list;
        Status withDescription;
        ayat ayatVar;
        byteBuffer.flip();
        ayhi ayhiVar = this.a.p;
        ayaq ayaqVar = ayhi.m;
        synchronized (ayhiVar.r) {
            this.a.p.x = z;
            if (byteBuffer.remaining() != 0) {
                ayhi ayhiVar2 = this.a.p;
                ayhiVar2.v += byteBuffer.remaining();
                aykl a = aykp.a(byteBuffer);
                Status status = ayhiVar2.n;
                if (status != null) {
                    String b = aykp.b(a, ayhiVar2.p);
                    ayhiVar2.n = status.a(b.length() != 0 ? "DATA-----------------------------\n".concat(b) : new String("DATA-----------------------------\n"));
                    if (ayhiVar2.n.getDescription().length() > 1000) {
                        withDescription = ayhiVar2.n;
                        ayatVar = ayhiVar2.o;
                        ayhiVar2.l(withDescription, false, ayatVar);
                    }
                } else if (!ayhiVar2.q) {
                    withDescription = Status.n.withDescription("headers not received before payload");
                    ayatVar = new ayat();
                    ayhiVar2.l(withDescription, false, ayatVar);
                } else {
                    a.f();
                    if (ayhiVar2.l) {
                        aydp.q.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundDataReceived", "Received data on closed stream");
                    } else {
                        ayfc ayfcVar = ayhiVar2.a;
                        if (!((ayjx) ayfcVar).b() && !((ayjx) ayfcVar).f) {
                            ((ayjx) ayfcVar).d.h(a);
                            ((ayjx) ayfcVar).a();
                        }
                    }
                }
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
        List asList = headerBlock.getAsList();
        this.b = asList;
        ayhi ayhiVar = this.a.p;
        ayaq ayaqVar = ayhi.m;
        synchronized (ayhiVar.r) {
            z = this.a.p.x;
        }
        if (z) {
            a(asList, true);
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onStreamReady(BidirectionalStream bidirectionalStream) {
        ayhi ayhiVar = this.a.p;
        ayaq ayaqVar = ayhi.m;
        synchronized (ayhiVar.r) {
            this.a.p.m();
            ayhi ayhiVar2 = this.a.p;
            ayhiVar2.t = true;
            for (aydh aydhVar : ayhiVar2.s) {
                ayhiVar2.z.s(aydhVar.a, aydhVar.b, aydhVar.c);
            }
            ayhiVar2.s.clear();
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onSucceeded(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        boolean z;
        ayhi ayhiVar = this.a.p;
        ayaq ayaqVar = ayhi.m;
        synchronized (ayhiVar.r) {
            z = false;
            if (this.b != null && this.a.p.x) {
                z = true;
            }
        }
        if (!z) {
            List list = this.b;
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
        ayhi ayhiVar = this.a.p;
        ayaq ayaqVar = ayhi.m;
        synchronized (ayhiVar.r) {
            aydj aydjVar = this.a;
            ayhi ayhiVar2 = aydjVar.p;
            boolean z2 = true;
            if (!ayhiVar2.y) {
                ayhiVar2.y = true;
                aydjVar.f.c();
            }
            ayhi ayhiVar3 = this.a.p;
            int position = byteBuffer.position();
            synchronized (ayhiVar3.b) {
                aqxo.z(ayhiVar3.f, "onStreamAllocated was not called, but it seems the stream is active");
                int i = ayhiVar3.e;
                int i2 = i - position;
                ayhiVar3.e = i2;
                if (i < 32768 || i2 >= 32768) {
                    z2 = false;
                }
            }
            if (z2) {
                ayhiVar3.b();
            }
        }
    }
}

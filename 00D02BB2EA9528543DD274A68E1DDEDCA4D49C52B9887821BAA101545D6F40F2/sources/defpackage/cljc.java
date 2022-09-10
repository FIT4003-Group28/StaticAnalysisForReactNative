package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
/* compiled from: PG */
/* renamed from: cljc  reason: default package */
/* loaded from: classes5.dex */
final class cljc implements clli {
    private final UrlRequest a;
    private final UrlResponseInfo b;
    private final deig<Long> c;
    private final cljb d;

    public cljc(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, deig<Long> deigVar, cljb cljbVar) {
        this.a = urlRequest;
        this.b = urlResponseInfo;
        this.c = deigVar;
        this.d = cljbVar;
    }

    @Override // defpackage.clli
    public final int a() {
        return this.b.getHttpStatusCode();
    }

    @Override // defpackage.clli
    public final Map<String, List<String>> b() {
        return this.b.getAllHeaders();
    }

    @Override // defpackage.clli
    public final dehn<Long> c(WritableByteChannel writableByteChannel) {
        clkw.a(writableByteChannel);
        this.d.a = writableByteChannel;
        this.a.read(ByteBuffer.allocateDirect(131072));
        return this.c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.cancel();
    }
}

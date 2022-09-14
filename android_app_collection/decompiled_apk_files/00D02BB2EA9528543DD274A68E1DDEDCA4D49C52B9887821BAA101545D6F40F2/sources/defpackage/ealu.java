package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UrlResponseInfo;
/* compiled from: PG */
/* renamed from: ealu  reason: default package */
/* loaded from: classes6.dex */
final class ealu implements eamd {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ ByteBuffer b;
    final /* synthetic */ ealy c;

    public ealu(ealy ealyVar, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.c = ealyVar;
        this.a = urlResponseInfo;
        this.b = byteBuffer;
    }

    @Override // defpackage.eamd
    public final void a() {
        if (this.c.d.f.compareAndSet(5, 4)) {
            ealy ealyVar = this.c;
            ealyVar.a.onReadCompleted(ealyVar.d, this.a, this.b);
        }
    }
}

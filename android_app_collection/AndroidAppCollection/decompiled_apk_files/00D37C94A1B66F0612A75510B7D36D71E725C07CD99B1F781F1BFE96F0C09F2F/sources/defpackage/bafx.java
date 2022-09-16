package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UrlResponseInfo;
/* compiled from: PG */
/* renamed from: bafx  reason: default package */
/* loaded from: classes2.dex */
final class bafx implements bage {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ ByteBuffer b;
    final /* synthetic */ baga c;

    public bafx(baga bagaVar, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.c = bagaVar;
        this.a = urlResponseInfo;
        this.b = byteBuffer;
    }

    @Override // defpackage.bage
    public final void a() {
        if (this.c.d.g.compareAndSet(5, 4)) {
            baga bagaVar = this.c;
            bagaVar.a.onReadCompleted(bagaVar.d, this.a, this.b);
        }
    }
}

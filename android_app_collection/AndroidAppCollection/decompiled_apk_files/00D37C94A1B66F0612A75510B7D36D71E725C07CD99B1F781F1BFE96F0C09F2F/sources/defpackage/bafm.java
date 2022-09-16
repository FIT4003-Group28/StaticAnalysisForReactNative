package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
/* compiled from: PG */
/* renamed from: bafm  reason: default package */
/* loaded from: classes2.dex */
final class bafm implements bage {
    final /* synthetic */ bafn a;

    public bafm(bafn bafnVar) {
        this.a = bafnVar;
    }

    @Override // defpackage.bage
    public final void a() {
        bafn bafnVar = this.a;
        ReadableByteChannel readableByteChannel = bafnVar.b.n;
        int read = readableByteChannel == null ? -1 : readableByteChannel.read(bafnVar.a);
        bafn bafnVar2 = this.a;
        bagd bagdVar = bafnVar2.b;
        ByteBuffer byteBuffer = bafnVar2.a;
        if (read != -1) {
            baga bagaVar = bagdVar.b;
            bagaVar.a(new bafx(bagaVar, bagdVar.o, byteBuffer));
            return;
        }
        ReadableByteChannel readableByteChannel2 = bagdVar.n;
        if (readableByteChannel2 != null) {
            readableByteChannel2.close();
        }
        if (!bagdVar.g.compareAndSet(5, 7)) {
            return;
        }
        bagdVar.j();
        baga bagaVar2 = bagdVar.b;
        bagaVar2.b.execute(new bafy(bagaVar2, bagdVar.o));
    }
}

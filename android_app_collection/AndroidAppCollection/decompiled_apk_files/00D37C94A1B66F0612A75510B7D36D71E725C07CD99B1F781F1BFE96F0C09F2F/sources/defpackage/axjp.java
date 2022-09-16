package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
/* compiled from: PG */
/* renamed from: axjp  reason: default package */
/* loaded from: classes2.dex */
final class axjp implements axjg {
    final /* synthetic */ long a;
    final /* synthetic */ ByteBuffer b;
    final /* synthetic */ int c;

    public axjp(long j, ByteBuffer byteBuffer, int i) {
        this.a = j;
        this.b = byteBuffer;
        this.c = i;
    }

    @Override // defpackage.axjg
    public final long a() {
        return this.a;
    }

    @Override // defpackage.axjg
    public final void b(WritableByteChannel writableByteChannel) {
        writableByteChannel.write((ByteBuffer) ((ByteBuffer) this.b.position(this.c)).slice().limit(axds.p(this.a)));
    }
}

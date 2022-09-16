package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
/* compiled from: PG */
/* renamed from: axjn  reason: default package */
/* loaded from: classes2.dex */
final class axjn implements axjg {
    final /* synthetic */ long a;
    final /* synthetic */ ByteBuffer b;
    final /* synthetic */ long c;

    public axjn(long j, ByteBuffer byteBuffer, long j2) {
        this.a = j;
        this.b = byteBuffer;
        this.c = j2;
    }

    @Override // defpackage.axjg
    public final long a() {
        return this.a;
    }

    @Override // defpackage.axjg
    public final void b(WritableByteChannel writableByteChannel) {
        writableByteChannel.write((ByteBuffer) ((ByteBuffer) this.b.position(axds.p(this.c))).slice().limit(axds.p(this.a)));
    }

    public final String toString() {
        long j = this.a;
        StringBuilder sb = new StringBuilder(43);
        sb.append("DefaultMp4Sample(size:");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }
}

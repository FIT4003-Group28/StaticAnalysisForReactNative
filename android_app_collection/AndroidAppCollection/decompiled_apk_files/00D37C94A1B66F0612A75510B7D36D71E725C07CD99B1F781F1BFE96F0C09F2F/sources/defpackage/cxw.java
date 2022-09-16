package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cxw  reason: default package */
/* loaded from: classes3.dex */
public final class cxw extends cxt {
    public cxw() {
        super("mp4s");
    }

    @Override // defpackage.axiw, defpackage.cvs
    public final long b() {
        long u = u() + 8;
        int i = 16;
        if (!this.o && u < 4294967296L) {
            i = 8;
        }
        return u + i;
    }

    @Override // defpackage.axiw, defpackage.cvs
    public final void e(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(s());
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.position(6);
        hy.w(allocate, this.a);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        k(writableByteChannel);
    }

    @Override // defpackage.axiw, defpackage.cvs
    public final void f(axja axjaVar, ByteBuffer byteBuffer, long j, cvo cvoVar) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        axjaVar.a(allocate);
        allocate.position(6);
        this.a = hy.F(allocate);
        t(axjaVar, j - 8, cvoVar);
    }

    @Override // defpackage.axiz
    public final String toString() {
        String valueOf = String.valueOf(Arrays.asList(i()));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("MpegSampleEntry");
        sb.append(valueOf);
        return sb.toString();
    }

    public cxw(String str) {
        super(str);
    }
}

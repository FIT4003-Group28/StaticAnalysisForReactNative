package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
/* compiled from: PG */
/* renamed from: cwp  reason: default package */
/* loaded from: classes3.dex */
public final class cwp extends axiw implements cvs {
    private int a;
    private int b;

    public cwp() {
        super("stsd");
    }

    @Override // defpackage.axiw, defpackage.cvs
    public final long b() {
        long u = u();
        long j = 8 + u;
        int i = 16;
        if (!this.o && u + 16 < 4294967296L) {
            i = 8;
        }
        return j + i;
    }

    @Override // defpackage.axiw, defpackage.cvs
    public final void e(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(s());
        ByteBuffer allocate = ByteBuffer.allocate(8);
        hy.z(allocate, this.a);
        hy.x(allocate, this.b);
        hy.y(allocate, i().size());
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        k(writableByteChannel);
    }

    @Override // defpackage.axiw, defpackage.cvs
    public final void f(axja axjaVar, ByteBuffer byteBuffer, long j, cvo cvoVar) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        axjaVar.a(allocate);
        allocate.rewind();
        this.a = hy.H(allocate);
        this.b = hy.G(allocate);
        t(axjaVar, j - 8, cvoVar);
    }
}

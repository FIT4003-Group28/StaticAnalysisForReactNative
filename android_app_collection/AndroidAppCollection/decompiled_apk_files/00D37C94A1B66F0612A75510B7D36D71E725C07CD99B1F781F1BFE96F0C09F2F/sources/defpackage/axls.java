package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
/* compiled from: PG */
/* renamed from: axls  reason: default package */
/* loaded from: classes2.dex */
public final class axls extends cxt {
    private String b;
    private String c;
    private String d;

    public axls() {
        super("stpp");
        this.b = "";
        this.c = "";
        this.d = "";
    }

    @Override // defpackage.axiw, defpackage.cvs
    public final long b() {
        int i = 8;
        long u = u() + this.b.length() + 8 + this.c.length() + this.d.length() + 3;
        if (this.o || 8 + u >= 4294967296L) {
            i = 16;
        }
        return u + i;
    }

    @Override // defpackage.axiw, defpackage.cvs
    public final void e(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(s());
        ByteBuffer allocate = ByteBuffer.allocate(this.b.length() + 8 + this.c.length() + this.d.length() + 3);
        allocate.position(6);
        hy.w(allocate, this.a);
        hy.A(allocate, this.b);
        hy.A(allocate, this.c);
        hy.A(allocate, this.d);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        k(writableByteChannel);
    }

    @Override // defpackage.axiw, defpackage.cvs
    public final void f(axja axjaVar, ByteBuffer byteBuffer, long j, cvo cvoVar) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        axjaVar.a((ByteBuffer) allocate.rewind());
        allocate.position(6);
        this.a = hy.F(allocate);
        long b = axjaVar.b();
        ByteBuffer allocate2 = ByteBuffer.allocate(1024);
        axjaVar.a((ByteBuffer) allocate2.rewind());
        String L = hy.L((ByteBuffer) allocate2.rewind());
        this.b = L;
        axjaVar.f(L.length() + b + 1);
        axjaVar.a((ByteBuffer) allocate2.rewind());
        this.c = hy.L((ByteBuffer) allocate2.rewind());
        axjaVar.f(this.b.length() + b + this.c.length() + 2);
        axjaVar.a((ByteBuffer) allocate2.rewind());
        this.d = hy.L((ByteBuffer) allocate2.rewind());
        axjaVar.f(b + this.b.length() + this.c.length() + this.d.length() + 3);
        t(axjaVar, j - ((((byteBuffer.remaining() + this.b.length()) + this.c.length()) + this.d.length()) + 3), cvoVar);
    }
}

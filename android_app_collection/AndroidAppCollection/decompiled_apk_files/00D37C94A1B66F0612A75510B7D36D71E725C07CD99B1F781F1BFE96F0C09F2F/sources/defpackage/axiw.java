package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
/* compiled from: PG */
/* renamed from: axiw  reason: default package */
/* loaded from: classes2.dex */
public class axiw extends axiz implements cvs {
    private long a;
    public cvx m;
    public String n;
    protected boolean o;

    public axiw() {
        this("dinf");
    }

    @Override // defpackage.cvs
    public final long a() {
        return this.a;
    }

    @Override // defpackage.cvs
    public long b() {
        long u = u();
        int i = 16;
        if (!this.o && 8 + u < 4294967296L) {
            i = 8;
        }
        return u + i;
    }

    @Override // defpackage.cvs
    public final cvx c() {
        return this.m;
    }

    @Override // defpackage.cvs
    public final String d() {
        return this.n;
    }

    @Override // defpackage.cvs
    public void e(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(s());
        k(writableByteChannel);
    }

    @Override // defpackage.cvs
    public void f(axja axjaVar, ByteBuffer byteBuffer, long j, cvo cvoVar) {
        this.a = axjaVar.b() - byteBuffer.remaining();
        this.o = byteBuffer.remaining() == 16;
        t(axjaVar, j, cvoVar);
    }

    @Override // defpackage.cvs
    public final void g(cvx cvxVar) {
        this.m = cvxVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ByteBuffer s() {
        ByteBuffer wrap;
        if (this.o || b() >= 4294967296L) {
            wrap = ByteBuffer.wrap(new byte[]{0, 0, 0, 1, this.n.getBytes()[0], this.n.getBytes()[1], this.n.getBytes()[2], this.n.getBytes()[3], 0, 0, 0, 0, 0, 0, 0, 0});
            wrap.position(8);
            wrap.putLong(b());
        } else {
            wrap = ByteBuffer.wrap(new byte[]{0, 0, 0, 0, this.n.getBytes()[0], this.n.getBytes()[1], this.n.getBytes()[2], this.n.getBytes()[3]});
            hy.y(wrap, b());
        }
        wrap.rewind();
        return wrap;
    }

    @Override // defpackage.axiz
    public final void t(axja axjaVar, long j, cvo cvoVar) {
        this.r = axjaVar;
        long b = axjaVar.b();
        this.t = b;
        int i = 16;
        if (!this.o && 8 + j < 4294967296L) {
            i = 8;
        }
        this.u = b - i;
        axjaVar.f(axjaVar.b() + j);
        this.v = axjaVar.b();
        this.q = cvoVar;
    }

    public axiw(byte[] bArr) {
        this("edts");
    }

    public axiw(String str) {
        this.n = str;
    }
}

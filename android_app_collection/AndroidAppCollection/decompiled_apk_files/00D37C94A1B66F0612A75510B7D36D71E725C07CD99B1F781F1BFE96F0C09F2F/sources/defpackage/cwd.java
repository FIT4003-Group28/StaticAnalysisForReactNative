package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.LinkedList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cwd  reason: default package */
/* loaded from: classes3.dex */
public final class cwd implements cvs {
    private cvx c;
    private long d;
    final List b = new LinkedList();
    ByteBuffer a = ByteBuffer.wrap(new byte[0]);

    @Override // defpackage.cvs
    public final long a() {
        return this.d;
    }

    @Override // defpackage.cvs
    public final long b() {
        long j = 8;
        for (cvs cvsVar : this.b) {
            j += cvsVar.b();
        }
        return j + this.a.limit();
    }

    @Override // defpackage.cvs
    public final cvx c() {
        return this.c;
    }

    @Override // defpackage.cvs
    public final String d() {
        return "free";
    }

    @Override // defpackage.cvs
    public final void e(WritableByteChannel writableByteChannel) {
        for (cvs cvsVar : this.b) {
            cvsVar.e(writableByteChannel);
        }
        ByteBuffer allocate = ByteBuffer.allocate(8);
        hy.y(allocate, this.a.limit() + 8);
        allocate.put("free".getBytes());
        allocate.rewind();
        writableByteChannel.write(allocate);
        allocate.rewind();
        this.a.rewind();
        writableByteChannel.write(this.a);
        this.a.rewind();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cwd cwdVar = (cwd) obj;
        return h() == null ? cwdVar.h() == null : h().equals(cwdVar.h());
    }

    @Override // defpackage.cvs
    public final void f(axja axjaVar, ByteBuffer byteBuffer, long j, cvo cvoVar) {
        this.d = axjaVar.b() - byteBuffer.remaining();
        if (j > 1048576) {
            this.a = axjaVar.e(axjaVar.b(), j);
            axjaVar.f(axjaVar.b() + j);
            return;
        }
        ByteBuffer allocate = ByteBuffer.allocate(axds.p(j));
        this.a = allocate;
        axjaVar.a(allocate);
    }

    @Override // defpackage.cvs
    public final void g(cvx cvxVar) {
        this.c = cvxVar;
    }

    public final ByteBuffer h() {
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer != null) {
            return (ByteBuffer) byteBuffer.duplicate().rewind();
        }
        return null;
    }

    public final int hashCode() {
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }
}

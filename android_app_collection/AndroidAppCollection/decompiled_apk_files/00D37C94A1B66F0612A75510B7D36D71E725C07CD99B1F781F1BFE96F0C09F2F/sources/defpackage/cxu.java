package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
/* compiled from: PG */
/* renamed from: cxu  reason: default package */
/* loaded from: classes3.dex */
final class cxu implements cvs {
    final /* synthetic */ long a;
    final /* synthetic */ ByteBuffer b;
    final /* synthetic */ cxv c;

    public cxu(cxv cxvVar, long j, ByteBuffer byteBuffer) {
        this.c = cxvVar;
        this.a = j;
        this.b = byteBuffer;
    }

    @Override // defpackage.cvs
    public final long a() {
        return 0L;
    }

    @Override // defpackage.cvs
    public final long b() {
        return this.a;
    }

    @Override // defpackage.cvs
    public final cvx c() {
        return this.c;
    }

    @Override // defpackage.cvs
    public final String d() {
        return "----";
    }

    @Override // defpackage.cvs
    public final void e(WritableByteChannel writableByteChannel) {
        this.b.rewind();
        writableByteChannel.write(this.b);
    }

    @Override // defpackage.cvs
    public final void f(axja axjaVar, ByteBuffer byteBuffer, long j, cvo cvoVar) {
        throw new RuntimeException("NotImplemented");
    }

    @Override // defpackage.cvs
    public final void g(cvx cvxVar) {
    }
}

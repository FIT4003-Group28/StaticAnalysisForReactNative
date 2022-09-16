package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: cxr  reason: default package */
/* loaded from: classes3.dex */
public final class cxr implements cvs {
    cvx a;
    private axja b;
    private long c;
    private long d;

    static {
        Logger.getLogger(cxr.class.getName());
    }

    @Override // defpackage.cvs
    public final long a() {
        return this.c;
    }

    @Override // defpackage.cvs
    public final long b() {
        return this.d;
    }

    @Override // defpackage.cvs
    public final cvx c() {
        return this.a;
    }

    @Override // defpackage.cvs
    public final String d() {
        return "mdat";
    }

    @Override // defpackage.cvs
    public final void e(WritableByteChannel writableByteChannel) {
        axja axjaVar = this.b;
        long j = this.c;
        long j2 = this.d;
        long j3 = 0;
        while (j3 < j2) {
            j3 += axjaVar.d(j + j3, Math.min(67076096L, j2 - j3), writableByteChannel);
        }
    }

    @Override // defpackage.cvs
    public final void f(axja axjaVar, ByteBuffer byteBuffer, long j, cvo cvoVar) {
        this.c = axjaVar.b() - byteBuffer.remaining();
        this.b = axjaVar;
        this.d = byteBuffer.remaining() + j;
        axjaVar.f(axjaVar.b() + j);
    }

    @Override // defpackage.cvs
    public final void g(cvx cvxVar) {
        this.a = cvxVar;
    }

    public final String toString() {
        long j = this.d;
        StringBuilder sb = new StringBuilder(39);
        sb.append("MediaDataBox{size=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}

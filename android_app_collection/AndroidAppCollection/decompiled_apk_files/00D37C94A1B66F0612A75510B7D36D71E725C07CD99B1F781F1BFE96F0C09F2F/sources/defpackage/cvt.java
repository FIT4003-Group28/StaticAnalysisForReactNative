package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cvt  reason: default package */
/* loaded from: classes3.dex */
public final class cvt extends cvu {
    private long[] a;

    public cvt() {
        super("co64");
    }

    @Override // defpackage.axiv
    protected final long h() {
        return (this.a.length * 8) + 8;
    }

    @Override // defpackage.axiv
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        int p = axds.p(hy.I(byteBuffer));
        this.a = new long[p];
        for (int i = 0; i < p; i++) {
            this.a[i] = hy.J(byteBuffer);
        }
    }

    @Override // defpackage.axiv
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        hy.y(byteBuffer, this.a.length);
        for (long j : this.a) {
            byteBuffer.putLong(j);
        }
    }

    @Override // defpackage.cvu
    public final long[] k() {
        return this.a;
    }
}

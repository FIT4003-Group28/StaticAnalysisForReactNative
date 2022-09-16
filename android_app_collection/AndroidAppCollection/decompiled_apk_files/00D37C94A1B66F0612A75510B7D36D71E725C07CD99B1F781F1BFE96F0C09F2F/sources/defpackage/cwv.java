package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cwv  reason: default package */
/* loaded from: classes3.dex */
public final class cwv extends cvu {
    public long[] a;

    public cwv() {
        super("stco");
        this.a = new long[0];
    }

    @Override // defpackage.axiv
    protected final long h() {
        return (this.a.length * 4) + 8;
    }

    @Override // defpackage.axiv
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        int p = axds.p(hy.I(byteBuffer));
        this.a = new long[p];
        for (int i = 0; i < p; i++) {
            this.a[i] = hy.I(byteBuffer);
        }
    }

    @Override // defpackage.axiv
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        hy.y(byteBuffer, this.a.length);
        for (long j : this.a) {
            hy.y(byteBuffer, j);
        }
    }

    @Override // defpackage.cvu
    public final long[] k() {
        return this.a;
    }
}

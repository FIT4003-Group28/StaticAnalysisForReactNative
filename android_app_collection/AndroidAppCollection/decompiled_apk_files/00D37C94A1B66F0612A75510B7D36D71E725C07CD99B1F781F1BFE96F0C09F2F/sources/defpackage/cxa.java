package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cxa  reason: default package */
/* loaded from: classes3.dex */
public final class cxa extends axix {
    public long[] a;

    public cxa() {
        super("stss");
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

    public final String toString() {
        int length = this.a.length;
        StringBuilder sb = new StringBuilder(37);
        sb.append("SyncSampleBox[entryCount=");
        sb.append(length);
        sb.append("]");
        return sb.toString();
    }
}

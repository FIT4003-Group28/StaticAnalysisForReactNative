package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cwq  reason: default package */
/* loaded from: classes3.dex */
public final class cwq extends axix {
    public long[] a;
    int b;
    private long c;

    public cwq() {
        super("stsz");
        this.a = new long[0];
    }

    @Override // defpackage.axiv
    protected final long h() {
        return (this.c == 0 ? this.a.length * 4 : 0) + 12;
    }

    @Override // defpackage.axiv
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        this.c = hy.I(byteBuffer);
        int p = axds.p(hy.I(byteBuffer));
        this.b = p;
        if (this.c == 0) {
            this.a = new long[p];
            for (int i = 0; i < this.b; i++) {
                this.a[i] = hy.I(byteBuffer);
            }
        }
    }

    @Override // defpackage.axiv
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        hy.y(byteBuffer, this.c);
        if (this.c == 0) {
            hy.y(byteBuffer, this.a.length);
            for (long j : this.a) {
                hy.y(byteBuffer, j);
            }
            return;
        }
        hy.y(byteBuffer, this.b);
    }

    public final long k() {
        return this.c > 0 ? this.b : this.a.length;
    }

    public final long l(int i) {
        long j = this.c;
        return j > 0 ? j : this.a[i];
    }

    public final String toString() {
        long j = this.c;
        long k = k();
        StringBuilder sb = new StringBuilder(79);
        sb.append("SampleSizeBox[sampleSize=");
        sb.append(j);
        sb.append(";sampleCount=");
        sb.append(k);
        sb.append("]");
        return sb.toString();
    }
}

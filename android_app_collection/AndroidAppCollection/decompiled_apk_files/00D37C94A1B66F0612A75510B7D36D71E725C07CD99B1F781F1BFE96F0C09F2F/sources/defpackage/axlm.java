package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: axlm  reason: default package */
/* loaded from: classes2.dex */
public final class axlm extends axix {
    public long[] a;
    private String b;
    private String c;

    public axlm() {
        super("saio");
        this.a = new long[0];
    }

    @Override // defpackage.axiv
    protected final long h() {
        int i = 8;
        int length = (s() == 0 ? this.a.length * 4 : this.a.length * 8) + 8;
        if (1 != (r() & 1)) {
            i = 0;
        }
        return length + i;
    }

    @Override // defpackage.axiv
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        if ((r() & 1) == 1) {
            this.b = hy.K(byteBuffer);
            this.c = hy.K(byteBuffer);
        }
        int p = axds.p(hy.I(byteBuffer));
        this.a = new long[p];
        for (int i = 0; i < p; i++) {
            if (s() == 0) {
                this.a[i] = hy.I(byteBuffer);
            } else {
                this.a[i] = hy.J(byteBuffer);
            }
        }
    }

    @Override // defpackage.axiv
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        if ((r() & 1) == 1) {
            byteBuffer.put(cvq.b(this.b));
            byteBuffer.put(cvq.b(this.c));
        }
        hy.y(byteBuffer, this.a.length);
        for (long j : this.a) {
            Long valueOf = Long.valueOf(j);
            if (s() == 0) {
                hy.y(byteBuffer, valueOf.longValue());
            } else {
                byteBuffer.putLong(valueOf.longValue());
            }
        }
    }
}

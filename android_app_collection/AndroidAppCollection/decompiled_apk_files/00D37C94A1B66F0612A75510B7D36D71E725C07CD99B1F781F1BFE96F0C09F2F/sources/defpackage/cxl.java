package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cxl  reason: default package */
/* loaded from: classes3.dex */
public final class cxl extends axix {
    public long a;
    public long b;
    public long c;
    public cxk d;
    private long e;

    public cxl() {
        super("trex");
    }

    @Override // defpackage.axiv
    protected final long h() {
        return 24L;
    }

    @Override // defpackage.axiv
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        this.a = hy.I(byteBuffer);
        this.e = hy.I(byteBuffer);
        this.b = hy.I(byteBuffer);
        this.c = hy.I(byteBuffer);
        this.d = new cxk(byteBuffer);
    }

    @Override // defpackage.axiv
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        hy.y(byteBuffer, this.a);
        hy.y(byteBuffer, this.e);
        hy.y(byteBuffer, this.b);
        hy.y(byteBuffer, this.c);
        this.d.a(byteBuffer);
    }
}

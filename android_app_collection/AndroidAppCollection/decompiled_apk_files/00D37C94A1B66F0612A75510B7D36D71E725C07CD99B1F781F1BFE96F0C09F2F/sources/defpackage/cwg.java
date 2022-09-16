package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cwg  reason: default package */
/* loaded from: classes3.dex */
public final class cwg extends cvr {
    private int a;
    private int b;
    private long c;
    private long d;

    public cwg() {
        super("hmhd");
    }

    @Override // defpackage.axiv
    protected final long h() {
        return 20L;
    }

    @Override // defpackage.axiv
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        this.a = hy.F(byteBuffer);
        this.b = hy.F(byteBuffer);
        this.c = hy.I(byteBuffer);
        this.d = hy.I(byteBuffer);
        hy.I(byteBuffer);
    }

    @Override // defpackage.axiv
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        hy.w(byteBuffer, this.a);
        hy.w(byteBuffer, this.b);
        hy.y(byteBuffer, this.c);
        hy.y(byteBuffer, this.d);
        hy.y(byteBuffer, 0L);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        long j = this.c;
        long j2 = this.d;
        StringBuilder sb = new StringBuilder(132);
        sb.append("HintMediaHeaderBox{maxPduSize=");
        sb.append(i);
        sb.append(", avgPduSize=");
        sb.append(i2);
        sb.append(", maxBitrate=");
        sb.append(j);
        sb.append(", avgBitrate=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}

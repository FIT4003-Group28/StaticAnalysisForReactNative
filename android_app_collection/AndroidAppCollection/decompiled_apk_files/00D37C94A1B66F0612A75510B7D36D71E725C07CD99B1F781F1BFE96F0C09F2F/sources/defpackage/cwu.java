package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cwu  reason: default package */
/* loaded from: classes3.dex */
public final class cwu extends cvr {
    private float a;

    public cwu() {
        super("smhd");
    }

    @Override // defpackage.axiv
    protected final long h() {
        return 8L;
    }

    @Override // defpackage.axiv
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        this.a = hy.D(byteBuffer);
        hy.F(byteBuffer);
    }

    @Override // defpackage.axiv
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        hy.v(byteBuffer, this.a);
        hy.w(byteBuffer, 0);
    }

    public final String toString() {
        float f = this.a;
        StringBuilder sb = new StringBuilder(44);
        sb.append("SoundMediaHeaderBox[balance=");
        sb.append(f);
        sb.append("]");
        return sb.toString();
    }
}

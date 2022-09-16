package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cxm  reason: default package */
/* loaded from: classes3.dex */
public final class cxm extends axix {
    public long a;

    public cxm() {
        super("tfdt");
    }

    @Override // defpackage.axiv
    protected final long h() {
        return s() == 0 ? 8L : 12L;
    }

    @Override // defpackage.axiv
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        if (s() == 1) {
            this.a = hy.J(byteBuffer);
        } else {
            this.a = hy.I(byteBuffer);
        }
    }

    @Override // defpackage.axiv
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        if (s() == 1) {
            byteBuffer.putLong(this.a);
        } else {
            hy.y(byteBuffer, this.a);
        }
    }

    public final String toString() {
        long j = this.a;
        StringBuilder sb = new StringBuilder(77);
        sb.append("TrackFragmentBaseMediaDecodeTimeBox{baseMediaDecodeTime=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}

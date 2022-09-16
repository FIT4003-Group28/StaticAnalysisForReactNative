package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cxh  reason: default package */
/* loaded from: classes3.dex */
public final class cxh extends cvr {
    private int a;
    private int[] b;

    public cxh() {
        super("vmhd");
        this.a = 0;
        this.b = new int[]{0, 0, 0};
        this.r = 1;
    }

    @Override // defpackage.axiv
    protected final long h() {
        return 12L;
    }

    @Override // defpackage.axiv
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        this.a = hy.F(byteBuffer);
        this.b = new int[3];
        for (int i = 0; i < 3; i++) {
            this.b[i] = hy.F(byteBuffer);
        }
    }

    @Override // defpackage.axiv
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        hy.w(byteBuffer, this.a);
        int[] iArr = this.b;
        int length = iArr.length;
        for (int i = 0; i < 3; i++) {
            hy.w(byteBuffer, iArr[i]);
        }
    }

    public final String toString() {
        int i = this.a;
        int[] iArr = this.b;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        StringBuilder sb = new StringBuilder(108);
        sb.append("VideoMediaHeaderBox[graphicsmode=");
        sb.append(i);
        sb.append(";opcolor0=");
        sb.append(i2);
        sb.append(";opcolor1=");
        sb.append(i3);
        sb.append(";opcolor2=");
        sb.append(i4);
        sb.append("]");
        return sb.toString();
    }
}

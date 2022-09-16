package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: vse  reason: default package */
/* loaded from: classes4.dex */
public final class vse extends axix {
    private int a;

    public vse() {
        super("st3d");
        this.a = -1;
    }

    @Override // defpackage.axiv
    protected final long h() {
        return 5L;
    }

    @Override // defpackage.axiv
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        int H = hy.H(byteBuffer);
        if (H == 0) {
            this.a = 0;
        } else if (H == 1) {
            this.a = 1;
        } else if (H == 2) {
            this.a = 2;
        } else if (H != 3) {
        } else {
            this.a = 3;
        }
    }

    @Override // defpackage.axiv
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        hy.z(byteBuffer, this.a);
    }
}

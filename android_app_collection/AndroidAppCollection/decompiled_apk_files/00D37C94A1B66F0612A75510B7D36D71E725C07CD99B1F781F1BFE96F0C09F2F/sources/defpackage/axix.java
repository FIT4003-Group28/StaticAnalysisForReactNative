package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: axix  reason: default package */
/* loaded from: classes2.dex */
public abstract class axix extends axiv implements cvs {
    public int q;
    public int r;

    /* JADX INFO: Access modifiers changed from: protected */
    public axix(String str) {
        super(str);
    }

    public final int r() {
        if (!this.k) {
            q();
        }
        return this.r;
    }

    public final int s() {
        if (!this.k) {
            q();
        }
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t(ByteBuffer byteBuffer) {
        hy.z(byteBuffer, this.q);
        hy.x(byteBuffer, this.r);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u(ByteBuffer byteBuffer) {
        this.q = hy.H(byteBuffer);
        this.r = hy.G(byteBuffer);
    }
}

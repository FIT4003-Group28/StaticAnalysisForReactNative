package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: axjy  reason: default package */
/* loaded from: classes2.dex */
public final class axjy extends axiv {
    public int a;
    public int b;

    public axjy() {
        super("pasp");
    }

    @Override // defpackage.axiv
    protected final long h() {
        return 8L;
    }

    @Override // defpackage.axiv
    protected final void i(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getInt();
    }

    @Override // defpackage.axiv
    protected final void j(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.a);
        byteBuffer.putInt(this.b);
    }
}

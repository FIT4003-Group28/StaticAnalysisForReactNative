package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cxf  reason: default package */
/* loaded from: classes3.dex */
public final class cxf extends axiv {
    ByteBuffer a;

    public cxf(String str) {
        super(str);
    }

    @Override // defpackage.axiv
    protected final long h() {
        return this.a.limit();
    }

    @Override // defpackage.axiv
    public final void i(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }

    @Override // defpackage.axiv
    protected final void j(ByteBuffer byteBuffer) {
        this.a.rewind();
        byteBuffer.put(this.a);
    }

    public cxf() {
        super("sv3d");
    }
}

package defpackage;

import java.nio.ByteBuffer;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: axkp  reason: default package */
/* loaded from: classes2.dex */
public final class axkp extends axkc {
    private ByteBuffer a;

    static {
        Logger.getLogger(axkp.class.getName());
    }

    @Override // defpackage.axkc
    public final void a(ByteBuffer byteBuffer) {
        this.a = (ByteBuffer) byteBuffer.slice().limit(this.U);
    }

    @Override // defpackage.axkc
    public final String toString() {
        return "UnknownDescriptor{tag=" + this.T + ", sizeOfInstance=" + this.U + ", data=" + this.a + '}';
    }
}

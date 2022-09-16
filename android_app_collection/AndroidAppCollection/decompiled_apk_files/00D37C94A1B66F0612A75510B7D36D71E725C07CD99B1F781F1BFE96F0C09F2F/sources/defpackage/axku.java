package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: axku  reason: default package */
/* loaded from: classes2.dex */
public final class axku extends axkr {
    private short a;

    @Override // defpackage.axkr
    public final String a() {
        return "roll";
    }

    @Override // defpackage.axkr
    public final ByteBuffer b() {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort(this.a);
        allocate.rewind();
        return allocate;
    }

    @Override // defpackage.axkr
    public final void c(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getShort();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((axku) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }
}

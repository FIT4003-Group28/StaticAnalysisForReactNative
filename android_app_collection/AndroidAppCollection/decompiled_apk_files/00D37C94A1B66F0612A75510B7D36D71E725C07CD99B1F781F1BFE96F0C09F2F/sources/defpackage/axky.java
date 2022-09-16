package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: axky  reason: default package */
/* loaded from: classes2.dex */
public final class axky extends axkr {
    private boolean a;

    @Override // defpackage.axkr
    public final String a() {
        return "tele";
    }

    @Override // defpackage.axkr
    public final ByteBuffer b() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        allocate.put((byte) (true != this.a ? 0 : 128));
        allocate.rewind();
        return allocate;
    }

    @Override // defpackage.axkr
    public final void c(ByteBuffer byteBuffer) {
        this.a = (byteBuffer.get() & 128) == 128;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((axky) obj).a;
    }

    public final int hashCode() {
        return (this.a ? 1 : 0) * 31;
    }

    public final String toString() {
        return "TemporalLevelEntry{levelIndependentlyDecodable=" + this.a + '}';
    }
}

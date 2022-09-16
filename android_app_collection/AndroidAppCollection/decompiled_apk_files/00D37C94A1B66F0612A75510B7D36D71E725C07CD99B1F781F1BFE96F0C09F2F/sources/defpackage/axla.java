package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: axla  reason: default package */
/* loaded from: classes2.dex */
public final class axla extends axkr {
    private boolean a;
    private short b;

    @Override // defpackage.axkr
    public final String a() {
        return "rap ";
    }

    @Override // defpackage.axkr
    public final ByteBuffer b() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        allocate.put((byte) ((true != this.a ? (short) 0 : (short) 128) | this.b));
        allocate.rewind();
        return allocate;
    }

    @Override // defpackage.axkr
    public final void c(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        this.a = (b & 128) == 128;
        this.b = (short) (b & Byte.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axla axlaVar = (axla) obj;
        return this.b == axlaVar.b && this.a == axlaVar.a;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) * 31) + this.b;
    }

    public final String toString() {
        return "VisualRandomAccessEntry{numLeadingSamplesKnown=" + this.a + ", numLeadingSamples=" + ((int) this.b) + '}';
    }
}

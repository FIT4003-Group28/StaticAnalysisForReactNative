package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: axlp  reason: default package */
/* loaded from: classes2.dex */
public final class axlp extends axkr {
    int a;
    int b;

    @Override // defpackage.axkr
    public final String a() {
        return "sync";
    }

    @Override // defpackage.axkr
    public final ByteBuffer b() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        hy.z(allocate, this.b + (this.a << 6));
        return (ByteBuffer) allocate.rewind();
    }

    @Override // defpackage.axkr
    public final void c(ByteBuffer byteBuffer) {
        int H = hy.H(byteBuffer);
        this.a = (H & 192) >> 6;
        this.b = H & 63;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axlp axlpVar = (axlp) obj;
        return this.b == axlpVar.b && this.a == axlpVar.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(62);
        sb.append("SyncSampleEntry{reserved=");
        sb.append(i);
        sb.append(", nalUnitType=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}

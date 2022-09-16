package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: axkz  reason: default package */
/* loaded from: classes2.dex */
public final class axkz extends axkr {
    private ByteBuffer a;
    private final String b;

    public axkz(String str) {
        this.b = str;
    }

    @Override // defpackage.axkr
    public final String a() {
        return this.b;
    }

    @Override // defpackage.axkr
    public final ByteBuffer b() {
        return this.a.duplicate();
    }

    @Override // defpackage.axkr
    public final void c(ByteBuffer byteBuffer) {
        this.a = (ByteBuffer) byteBuffer.duplicate().rewind();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axkz axkzVar = (axkz) obj;
        ByteBuffer byteBuffer = this.a;
        return byteBuffer == null ? axkzVar.a == null : byteBuffer.equals(axkzVar.a);
    }

    public final int hashCode() {
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }

    public final String toString() {
        ByteBuffer duplicate = this.a.duplicate();
        duplicate.rewind();
        byte[] bArr = new byte[duplicate.limit()];
        duplicate.get(bArr);
        String a = cvp.a(bArr);
        StringBuilder sb = new StringBuilder(a.length() + 22);
        sb.append("UnknownEntry{content=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}

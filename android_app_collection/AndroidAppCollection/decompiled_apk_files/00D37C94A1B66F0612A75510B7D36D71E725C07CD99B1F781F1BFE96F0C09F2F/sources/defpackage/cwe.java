package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cwe  reason: default package */
/* loaded from: classes3.dex */
public final class cwe extends axiv {
    byte[] a;

    public cwe() {
        super("skip");
    }

    @Override // defpackage.axiv
    protected final long h() {
        return this.a.length;
    }

    @Override // defpackage.axiv
    public final void i(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        this.a = bArr;
        byteBuffer.get(bArr);
    }

    @Override // defpackage.axiv
    protected final void j(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a);
    }

    public final String toString() {
        int length = this.a.length;
        String str = this.h;
        StringBuilder sb = new StringBuilder(str.length() + 36);
        sb.append("FreeSpaceBox[size=");
        sb.append(length);
        sb.append(";type=");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}

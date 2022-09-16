package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
@axkh(b = {19})
/* renamed from: axkk  reason: default package */
/* loaded from: classes2.dex */
public final class axkk extends axkc {
    byte[] a;

    @Override // defpackage.axkc
    public final void a(ByteBuffer byteBuffer) {
        if (c() > 0) {
            byte[] bArr = new byte[c()];
            this.a = bArr;
            byteBuffer.get(bArr);
        }
    }

    @Override // defpackage.axkc
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExtensionDescriptor{bytes=");
        byte[] bArr = this.a;
        sb.append(bArr == null ? "null" : cvp.a(bArr));
        sb.append('}');
        return sb.toString();
    }
}

package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;
/* compiled from: PG */
@axkh(b = {5})
/* renamed from: axkg  reason: default package */
/* loaded from: classes2.dex */
public final class axkg extends axkc {
    byte[] a;

    @Override // defpackage.axkc
    public final void a(ByteBuffer byteBuffer) {
        int i = this.U;
        if (i > 0) {
            byte[] bArr = new byte[i];
            this.a = bArr;
            byteBuffer.get(bArr);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Arrays.equals(this.a, ((axkg) obj).a);
    }

    public final int hashCode() {
        byte[] bArr = this.a;
        if (bArr != null) {
            return Arrays.hashCode(bArr);
        }
        return 0;
    }

    @Override // defpackage.axkc
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DecoderSpecificInfo{bytes=");
        byte[] bArr = this.a;
        sb.append(bArr == null ? "null" : cvp.a(bArr));
        sb.append('}');
        return sb.toString();
    }
}

package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: axkq  reason: default package */
/* loaded from: classes2.dex */
public final class axkq extends axkr {
    private boolean a;
    private byte b;
    private UUID c;

    @Override // defpackage.axkr
    public final String a() {
        return "seig";
    }

    @Override // defpackage.axkr
    public final ByteBuffer b() {
        ByteBuffer allocate = ByteBuffer.allocate(20);
        hy.x(allocate, this.a ? 1 : 0);
        if (this.a) {
            hy.z(allocate, this.b);
            UUID uuid = this.c;
            long mostSignificantBits = uuid.getMostSignificantBits();
            long leastSignificantBits = uuid.getLeastSignificantBits();
            byte[] bArr = new byte[16];
            for (int i = 0; i < 8; i++) {
                bArr[i] = (byte) (mostSignificantBits >>> ((7 - i) * 8));
            }
            for (int i2 = 8; i2 < 16; i2++) {
                bArr[i2] = (byte) (leastSignificantBits >>> ((7 - i2) * 8));
            }
            allocate.put(bArr);
        } else {
            allocate.put(new byte[17]);
        }
        allocate.rewind();
        return allocate;
    }

    @Override // defpackage.axkr
    public final void c(ByteBuffer byteBuffer) {
        boolean z = true;
        if (hy.G(byteBuffer) != 1) {
            z = false;
        }
        this.a = z;
        this.b = (byte) hy.H(byteBuffer);
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.BIG_ENDIAN);
        this.c = new UUID(wrap.getLong(), wrap.getLong());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axkq axkqVar = (axkq) obj;
        if (this.a != axkqVar.a || this.b != axkqVar.b) {
            return false;
        }
        UUID uuid = this.c;
        return uuid == null ? axkqVar.c == null : uuid.equals(axkqVar.c);
    }

    public final int hashCode() {
        int i = (((true != this.a ? 19 : 7) * 31) + this.b) * 31;
        UUID uuid = this.c;
        return i + (uuid != null ? uuid.hashCode() : 0);
    }

    public final String toString() {
        boolean z = this.a;
        byte b = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 79);
        sb.append("CencSampleEncryptionInformationGroupEntry{isEncrypted=");
        sb.append(z);
        sb.append(", ivSize=");
        sb.append((int) b);
        sb.append(", kid=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

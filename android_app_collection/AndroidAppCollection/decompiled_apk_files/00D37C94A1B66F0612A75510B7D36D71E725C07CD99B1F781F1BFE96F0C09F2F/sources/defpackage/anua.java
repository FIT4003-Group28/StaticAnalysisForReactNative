package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: anua  reason: default package */
/* loaded from: classes.dex */
public final class anua implements anme {
    private final anug a;
    private final anmv b;

    public anua(anug anugVar, anmv anmvVar) {
        this.a = anugVar;
        this.b = anmvVar;
    }

    @Override // defpackage.anme
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a = this.a.a(bArr);
        return antz.o(a, this.b.a(antz.o(bArr2, a, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8))));
    }
}

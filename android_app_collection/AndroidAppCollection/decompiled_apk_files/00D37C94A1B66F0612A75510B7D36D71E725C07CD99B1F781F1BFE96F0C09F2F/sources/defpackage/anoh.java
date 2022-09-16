package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: anoh  reason: default package */
/* loaded from: classes.dex */
public final class anoh implements anme {
    private static final byte[] a = new byte[0];
    private final anrc b;
    private final anme c;

    public anoh(anrc anrcVar, anme anmeVar) {
        this.b = anrcVar;
        this.c = anmeVar;
    }

    @Override // defpackage.anme
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] byteArray = annh.b(this.b).toByteArray();
        byte[] a2 = this.c.a(byteArray, a);
        byte[] a3 = ((anme) annh.d(this.b.b, byteArray, anme.class)).a(bArr, bArr2);
        int length = a2.length;
        return ByteBuffer.allocate(length + 4 + a3.length).putInt(length).put(a2).put(a3).array();
    }
}

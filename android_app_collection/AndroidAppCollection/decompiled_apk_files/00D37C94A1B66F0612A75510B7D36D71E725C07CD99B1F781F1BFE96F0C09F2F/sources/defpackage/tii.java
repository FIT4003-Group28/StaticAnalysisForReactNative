package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: tii  reason: default package */
/* loaded from: classes4.dex */
public final class tii implements cie {
    private final tij a;

    public tii(cld cldVar) {
        this.a = new tij(cldVar);
    }

    @Override // defpackage.cie
    public final /* bridge */ /* synthetic */ cku a(Object obj, int i, int i2, cic cicVar) {
        return this.a.c(cus.a((ByteBuffer) obj));
    }

    @Override // defpackage.cie
    public final /* bridge */ /* synthetic */ boolean b(Object obj, cic cicVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        int i = til.c;
        byteBuffer.position(0);
        if (byteBuffer.limit() < 21) {
            return false;
        }
        byte[] bArr = new byte[21];
        byteBuffer.get(bArr);
        return til.a(bArr);
    }
}

package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cfu  reason: default package */
/* loaded from: classes.dex */
public final class cfu implements cfv<cfg, byte[]> {
    @Override // defpackage.cfv
    public final bxd<byte[]> a(bxd<cfg> bxdVar, bua buaVar) {
        byte[] bArr;
        ByteBuffer b = bxdVar.b().b();
        int i = cjb.a;
        cja cjaVar = null;
        if (!b.isReadOnly() && b.hasArray()) {
            cjaVar = new cja(b.array(), b.arrayOffset(), b.limit());
        }
        if (cjaVar == null || cjaVar.a != 0 || cjaVar.b != cjaVar.c.length) {
            ByteBuffer asReadOnlyBuffer = b.asReadOnlyBuffer();
            byte[] bArr2 = new byte[asReadOnlyBuffer.limit()];
            asReadOnlyBuffer.position(0);
            asReadOnlyBuffer.get(bArr2);
            bArr = bArr2;
        } else {
            bArr = b.array();
        }
        return new ces(bArr);
    }
}

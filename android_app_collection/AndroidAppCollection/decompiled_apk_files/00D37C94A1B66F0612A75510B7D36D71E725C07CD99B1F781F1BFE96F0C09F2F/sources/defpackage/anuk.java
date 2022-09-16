package defpackage;

import java.security.InvalidAlgorithmParameterException;
/* compiled from: PG */
/* renamed from: anuk  reason: default package */
/* loaded from: classes.dex */
public final class anuk implements anmv {
    private final anpq a;
    private final int b;

    @Override // defpackage.anmv
    public final byte[] a(byte[] bArr) {
        return this.a.a(bArr, this.b);
    }

    public anuk(anpq anpqVar, int i) {
        this.a = anpqVar;
        this.b = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        anpqVar.a(new byte[0], i);
    }
}

package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: qrx  reason: default package */
/* loaded from: classes4.dex */
public final class qrx extends qxn {
    public final byte[] a;

    public qrx(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.a = bArr;
    }

    @Override // defpackage.qxn
    public final byte[] qj() {
        return this.a;
    }
}

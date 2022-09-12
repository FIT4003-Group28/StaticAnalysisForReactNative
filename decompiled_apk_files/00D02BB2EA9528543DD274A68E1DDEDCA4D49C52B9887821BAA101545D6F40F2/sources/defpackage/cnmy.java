package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cnmy  reason: default package */
/* loaded from: classes.dex */
public final class cnmy extends cnmx {
    public final byte[] a;

    public cnmy(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.a = bArr;
    }

    @Override // defpackage.cnmx
    public final byte[] c() {
        return this.a;
    }
}

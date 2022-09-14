package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dsov  reason: default package */
/* loaded from: classes.dex */
public final class dsov extends dspa {
    private static final long serialVersionUID = 1;
    private final int d;
    private final int e;

    public dsov(byte[] bArr, int i, int i2) {
        super(bArr);
        O(i, i + i2, bArr.length);
        this.d = i;
        this.e = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.dspa, defpackage.dspd
    public final byte a(int i) {
        N(i, this.e);
        return this.a[this.d + i];
    }

    @Override // defpackage.dspa, defpackage.dspd
    public final byte b(int i) {
        return this.a[this.d + i];
    }

    @Override // defpackage.dspa, defpackage.dspd
    public final int c() {
        return this.e;
    }

    @Override // defpackage.dspa
    protected final int d() {
        return this.d;
    }

    @Override // defpackage.dspa, defpackage.dspd
    protected final void e(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, this.d + i, bArr, i2, i3);
    }

    Object writeReplace() {
        return dspd.y(G());
    }
}

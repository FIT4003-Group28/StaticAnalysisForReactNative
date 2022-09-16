package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aonw  reason: default package */
/* loaded from: classes.dex */
public final class aonw extends aonz {
    private static final long serialVersionUID = 1;
    private final int d;
    private final int e;

    public aonw(byte[] bArr, int i, int i2) {
        super(bArr);
        r(i, i + i2, bArr.length);
        this.d = i;
        this.e = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.aonz, defpackage.aoob
    public final byte a(int i) {
        F(i, this.e);
        return this.a[this.d + i];
    }

    @Override // defpackage.aonz, defpackage.aoob
    public final byte b(int i) {
        return this.a[this.d + i];
    }

    @Override // defpackage.aonz
    protected final int c() {
        return this.d;
    }

    @Override // defpackage.aonz, defpackage.aoob
    public final int d() {
        return this.e;
    }

    @Override // defpackage.aonz, defpackage.aoob
    protected final void e(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, this.d + i, bArr, i2, i3);
    }

    Object writeReplace() {
        return aoob.B(I());
    }
}

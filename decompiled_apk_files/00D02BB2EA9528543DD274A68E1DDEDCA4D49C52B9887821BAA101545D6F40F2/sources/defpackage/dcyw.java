package defpackage;

import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcyw  reason: default package */
/* loaded from: classes5.dex */
public final class dcyw extends dcyz implements Serializable {
    private static final long serialVersionUID = 0;
    final byte[] a;

    public dcyw(byte[] bArr) {
        this.a = (byte[]) dbsk.s(bArr);
    }

    @Override // defpackage.dcyz
    public final int a() {
        return this.a.length * 8;
    }

    @Override // defpackage.dcyz
    public final byte[] b() {
        return (byte[]) this.a.clone();
    }

    @Override // defpackage.dcyz
    public final int c() {
        int length = this.a.length;
        dbsk.n(length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", length);
        byte[] bArr = this.a;
        return ((bArr[3] & 255) << 24) | ((bArr[1] & 255) << 8) | (bArr[0] & 255) | ((bArr[2] & 255) << 16);
    }

    @Override // defpackage.dcyz
    public final long d() {
        int length = this.a.length;
        dbsk.n(length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", length);
        long j = this.a[0] & 255;
        for (int i = 1; i < Math.min(this.a.length, 8); i++) {
            j |= (this.a[i] & 255) << (i * 8);
        }
        return j;
    }

    @Override // defpackage.dcyz
    public final byte[] e() {
        return this.a;
    }

    @Override // defpackage.dcyz
    public final boolean f(dcyz dcyzVar) {
        if (this.a.length == dcyzVar.e().length) {
            int i = 0;
            boolean z = true;
            while (true) {
                byte[] bArr = this.a;
                if (i >= bArr.length) {
                    return z;
                }
                z &= bArr[i] == dcyzVar.e()[i];
                i++;
            }
        } else {
            return false;
        }
    }
}

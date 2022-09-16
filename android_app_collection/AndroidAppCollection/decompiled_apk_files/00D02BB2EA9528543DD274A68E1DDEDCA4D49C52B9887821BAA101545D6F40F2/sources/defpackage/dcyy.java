package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dcyy  reason: default package */
/* loaded from: classes5.dex */
final class dcyy extends dcyz implements Serializable {
    private static final long serialVersionUID = 0;
    final long a;

    public dcyy(long j) {
        this.a = j;
    }

    @Override // defpackage.dcyz
    public final int a() {
        return 64;
    }

    @Override // defpackage.dcyz
    public final byte[] b() {
        long j = this.a;
        return new byte[]{(byte) j, (byte) (j >> 8), (byte) (j >> 16), (byte) (j >> 24), (byte) (j >> 32), (byte) (j >> 40), (byte) (j >> 48), (byte) (j >> 56)};
    }

    @Override // defpackage.dcyz
    public final int c() {
        return (int) this.a;
    }

    @Override // defpackage.dcyz
    public final long d() {
        return this.a;
    }

    @Override // defpackage.dcyz
    public final boolean f(dcyz dcyzVar) {
        return this.a == dcyzVar.d();
    }
}

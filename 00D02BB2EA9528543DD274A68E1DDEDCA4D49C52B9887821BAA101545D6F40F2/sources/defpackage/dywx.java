package defpackage;
/* compiled from: PG */
/* renamed from: dywx  reason: default package */
/* loaded from: classes6.dex */
final class dywx extends dykm {
    private final eaiz a;

    public dywx(eaiz eaizVar) {
        this.a = eaizVar;
    }

    @Override // defpackage.dytj
    public final int c() {
        return (int) this.a.b;
    }

    @Override // defpackage.dykm, defpackage.dytj, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.z();
    }

    @Override // defpackage.dytj
    public final int d() {
        return this.a.h() & 255;
    }

    @Override // defpackage.dytj
    public final void e(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int y = this.a.y(bArr, i, i2);
            if (y == -1) {
                StringBuilder sb = new StringBuilder(36);
                sb.append("EOF trying to read ");
                sb.append(i2);
                sb.append(" bytes");
                throw new IndexOutOfBoundsException(sb.toString());
            }
            i2 -= y;
            i += y;
        }
    }

    @Override // defpackage.dytj
    public final dytj g(int i) {
        eaiz eaizVar = new eaiz();
        eaizVar.a(this.a, i);
        return new dywx(eaizVar);
    }
}

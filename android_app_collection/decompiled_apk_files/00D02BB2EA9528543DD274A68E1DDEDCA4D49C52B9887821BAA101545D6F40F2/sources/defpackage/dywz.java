package defpackage;
/* compiled from: PG */
/* renamed from: dywz  reason: default package */
/* loaded from: classes6.dex */
final class dywz implements dyvs {
    public final eaiz a;
    private int b;
    private int c;

    public dywz(eaiz eaizVar, int i) {
        this.a = eaizVar;
        this.b = i;
    }

    @Override // defpackage.dyvs
    public final void a(byte[] bArr, int i, int i2) {
        this.a.L(bArr, i, i2);
        this.b -= i2;
        this.c += i2;
    }

    @Override // defpackage.dyvs
    public final void b(byte b) {
        this.a.M(b);
        this.b--;
        this.c++;
    }

    @Override // defpackage.dyvs
    public final int c() {
        return this.b;
    }

    @Override // defpackage.dyvs
    public final int d() {
        return this.c;
    }
}

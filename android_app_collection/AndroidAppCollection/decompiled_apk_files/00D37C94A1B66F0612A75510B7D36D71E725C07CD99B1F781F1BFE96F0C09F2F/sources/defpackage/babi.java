package defpackage;
/* compiled from: PG */
/* renamed from: babi  reason: default package */
/* loaded from: classes2.dex */
public final class babi {
    public final byte[] a;
    public int b;
    public int c;
    boolean d;
    final boolean e;
    public babi f;
    public babi g;

    public babi() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public babi(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = true;
        this.e = false;
    }

    public final babi a() {
        babi babiVar = this.f;
        babi babiVar2 = babiVar != this ? babiVar : null;
        babi babiVar3 = this.g;
        babiVar3.f = babiVar;
        this.f.g = babiVar3;
        this.f = null;
        this.g = null;
        return babiVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final babi b() {
        this.d = true;
        return new babi(this.a, this.b, this.c);
    }

    public final void c(babi babiVar, int i) {
        if (!babiVar.e) {
            throw new IllegalArgumentException();
        }
        int i2 = babiVar.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (babiVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = babiVar.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = babiVar.a;
            System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
            i2 = babiVar.c - babiVar.b;
            babiVar.c = i2;
            babiVar.b = 0;
        }
        System.arraycopy(this.a, this.b, babiVar.a, i2, i);
        babiVar.c += i;
        this.b += i;
    }

    public final void d(babi babiVar) {
        babiVar.g = this;
        babiVar.f = this.f;
        this.f.g = babiVar;
        this.f = babiVar;
    }
}

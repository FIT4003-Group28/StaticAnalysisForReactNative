package defpackage;
/* compiled from: PG */
/* renamed from: eaju  reason: default package */
/* loaded from: classes6.dex */
public final class eaju {
    public final byte[] a;
    public int b;
    public int c;
    boolean d;
    final boolean e;
    public eaju f;
    public eaju g;

    public eaju() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public eaju(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = true;
        this.e = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final eaju a() {
        this.d = true;
        return new eaju(this.a, this.b, this.c);
    }

    @dzsi
    public final eaju b() {
        eaju eajuVar = this.f;
        eaju eajuVar2 = eajuVar != this ? eajuVar : null;
        eaju eajuVar3 = this.g;
        eajuVar3.f = eajuVar;
        this.f.g = eajuVar3;
        this.f = null;
        this.g = null;
        return eajuVar2;
    }

    public final void c(eaju eajuVar, int i) {
        if (!eajuVar.e) {
            throw new IllegalArgumentException();
        }
        int i2 = eajuVar.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (eajuVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = eajuVar.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = eajuVar.a;
            System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
            i2 = eajuVar.c - eajuVar.b;
            eajuVar.c = i2;
            eajuVar.b = 0;
        }
        System.arraycopy(this.a, this.b, eajuVar.a, i2, i);
        eajuVar.c += i;
        this.b += i;
    }

    public final void d(eaju eajuVar) {
        eajuVar.g = this;
        eajuVar.f = this.f;
        this.f.g = eajuVar;
        this.f = eajuVar;
    }
}

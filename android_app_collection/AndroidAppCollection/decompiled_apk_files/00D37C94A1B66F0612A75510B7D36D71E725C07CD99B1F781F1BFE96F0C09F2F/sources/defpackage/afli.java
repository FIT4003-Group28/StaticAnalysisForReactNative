package defpackage;
/* compiled from: PG */
/* renamed from: afli  reason: default package */
/* loaded from: classes.dex */
public class afli extends aflg {
    private final byte[] a;
    private int b;
    private int c;

    public afli(asv asvVar, int i) {
        super(asvVar);
        this.a = new byte[i];
    }

    @Override // defpackage.aflg, defpackage.ast
    public int g(byte[] bArr, int i, int i2) {
        int i3 = 0;
        ptx.e(this.c <= this.b);
        int i4 = this.c;
        int i5 = this.b;
        if (i4 == i5) {
            byte[] bArr2 = this.a;
            int length = bArr2.length;
            if (i2 >= length) {
                return super.g(bArr, i, i2);
            }
            i5 = super.g(bArr2, 0, length);
            this.b = i5;
            if (i5 < 0) {
                return -1;
            }
            this.c = 0;
        } else {
            i3 = i4;
        }
        int min = Math.min(i2, i5 - i3);
        System.arraycopy(this.a, this.c, bArr, i, min);
        this.c += min;
        return min;
    }

    @Override // defpackage.aflg, defpackage.asv
    public long h(asy asyVar) {
        this.b = 0;
        this.c = 0;
        return super.h(asyVar);
    }
}

package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcxq  reason: default package */
/* loaded from: classes5.dex */
public final class dcxq {
    public final int[] d;
    public int e;
    public final dcyk[] f;
    private dcwa g;
    private dcwa h;
    private dcvm i;
    public boolean a = false;
    public dcvf c = new dcvf(dcvf.N(dcvf.M(0), 30));
    public dcwa b = dcvc.d;

    public dcxq(int i) {
        this.f = new dcyk[i];
        this.d = new int[i];
        a(dcwa.f(dcwz.f(0, -1.0d, -1.0d)));
    }

    public final void a(dcwa dcwaVar) {
        this.g = this.b;
        this.b = dcwaVar;
        this.i = new dcvm(this.g, this.b);
        this.h = null;
    }

    public final void b(int i, dcwa dcwaVar, dcwa dcwaVar2) {
        if (dcwaVar != this.h) {
            this.i.a(dcwaVar);
        }
        if (this.i.c(dcwaVar2)) {
            c(i);
        }
        this.h = dcwaVar2;
    }

    public final void c(int i) {
        int[] iArr;
        int i2;
        int i3 = this.e;
        int i4 = 0;
        if (i3 == 0) {
            this.d[0] = i;
            this.e = 1;
            return;
        }
        int[] iArr2 = this.d;
        if (iArr2[0] == i) {
            int i5 = i3 - 1;
            this.e = i5;
            if (i3 <= 1) {
                return;
            }
            System.arraycopy(iArr2, 1, iArr2, 0, i5);
            return;
        }
        do {
            iArr = this.d;
            int i6 = iArr[i4];
            if (i6 >= i) {
                if (i6 == i) {
                    int i7 = this.e - 1;
                    this.e = i7;
                    System.arraycopy(iArr, i4 + 1, iArr, i4, i7 - i4);
                    return;
                }
                System.arraycopy(iArr, i4, iArr, i4 + 1, this.e - i4);
                this.d[i4] = i;
                this.e++;
                return;
            }
            i4++;
            i2 = this.e;
        } while (i4 != i2);
        this.e = i2 + 1;
        iArr[i2] = i;
    }
}

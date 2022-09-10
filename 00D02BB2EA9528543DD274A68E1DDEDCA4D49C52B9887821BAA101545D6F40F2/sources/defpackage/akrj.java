package defpackage;
/* compiled from: PG */
/* renamed from: akrj  reason: default package */
/* loaded from: classes.dex */
public final class akrj {
    public int a;
    public float b;
    private int[] c;
    private boolean d;

    public akrj() {
        this(16);
    }

    public final boolean a(akra akraVar) {
        int i = akraVar.a;
        int i2 = akraVar.b;
        int i3 = this.a;
        int i4 = i3 + i3;
        int[] iArr = this.c;
        int length = iArr.length;
        if (i4 == length) {
            int[] iArr2 = new int[length + length];
            System.arraycopy(iArr, 0, iArr2, 0, i4);
            this.c = iArr2;
        }
        int i5 = this.a;
        int i6 = i5 + i5;
        if (i5 > 0) {
            int[] iArr3 = this.c;
            if (i == iArr3[i6 - 2] && i2 == iArr3[i6 - 1]) {
                this.d = true;
                return false;
            }
        }
        int[] iArr4 = this.c;
        iArr4[i6] = i;
        iArr4[i6 + 1] = i2;
        this.a = i5 + 1;
        return true;
    }

    public final void b() {
        this.a = 0;
    }

    public akrj(int i) {
        this.d = false;
        this.b = 0.0f;
        this.c = new int[i + i];
        this.a = 0;
    }

    public final akrk c() {
        int[] iArr;
        int i = this.a;
        if (i == 1) {
            if (this.d) {
                iArr = new int[4];
                System.arraycopy(this.c, 0, iArr, 0, 2);
                System.arraycopy(this.c, 0, iArr, 2, 2);
                return new akrk(iArr, this.b);
            }
            i = 1;
        }
        int i2 = i + i;
        int[] iArr2 = new int[i2];
        System.arraycopy(this.c, 0, iArr2, 0, i2);
        iArr = iArr2;
        return new akrk(iArr, this.b);
    }
}

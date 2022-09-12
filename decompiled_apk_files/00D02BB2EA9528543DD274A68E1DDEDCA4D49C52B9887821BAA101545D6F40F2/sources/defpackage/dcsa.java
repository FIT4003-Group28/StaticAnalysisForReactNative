package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcsa  reason: default package */
/* loaded from: classes.dex */
public final class dcsa extends dcsc {
    private final dcrp b;
    private final dcrp c;
    private final int[] d;
    private final int e;

    public dcsa(dcrp dcrpVar, dcrp dcrpVar2) {
        dcuj.a(dcrpVar, "scope metadata");
        this.b = dcrpVar;
        dcuj.a(dcrpVar2, "logged metadata");
        this.c = dcrpVar2;
        int a = dcrpVar2.a();
        dcuj.b(a <= 28, "metadata size too large");
        int[] iArr = new int[a];
        this.d = iArr;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (i < iArr.length) {
            dcqy<?> b = b(i);
            long j2 = b.b | j;
            if (j2 == j) {
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        i3 = -1;
                        break;
                    } else if (b.equals(b(iArr[i3] & 31))) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 != -1) {
                    iArr[i3] = i;
                    i++;
                    j = j2;
                }
            }
            iArr[i2] = i;
            i2++;
            i++;
            j = j2;
        }
        this.e = i2;
    }

    private final dcqy<?> b(int i) {
        int a = this.b.a();
        return i >= a ? this.c.b(i - a) : this.b.b(i);
    }

    @Override // defpackage.dcsc
    public final <C> void a(dcrv<C> dcrvVar, C c) {
        for (int i = 0; i < this.e; i++) {
            int i2 = this.d[i];
            dcqy<?> b = b(i2 & 31);
            int a = this.b.a();
            dcrvVar.a(b, b.c(i2 >= a ? this.c.c(i2 - a) : this.b.c(i2)), c);
        }
    }
}

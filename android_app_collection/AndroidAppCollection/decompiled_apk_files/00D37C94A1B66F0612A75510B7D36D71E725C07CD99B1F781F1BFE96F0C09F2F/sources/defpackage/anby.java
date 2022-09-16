package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: anby  reason: default package */
/* loaded from: classes.dex */
public final class anby extends anca {
    public final int[] a;
    public final int b;
    private final anbj d;
    private final anbj e;

    public anby(anbj anbjVar, anbj anbjVar2) {
        this.d = anbjVar;
        this.e = anbjVar2;
        int b = anbjVar2.b();
        anha.d(b <= 28, "metadata size too large");
        int[] iArr = new int[b];
        this.a = iArr;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (i < iArr.length) {
            anas d = d(i);
            long j2 = d.c | j;
            if (j2 == j) {
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        i3 = -1;
                        break;
                    } else if (d.equals(d(iArr[i3] & 31))) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 != -1) {
                    iArr[i3] = d.b ? iArr[i3] | (1 << (i + 4)) : i;
                    i++;
                    j = j2;
                }
            }
            iArr[i2] = i;
            i2++;
            i++;
            j = j2;
        }
        this.b = i2;
    }

    @Override // defpackage.anca
    public final int a() {
        return this.b;
    }

    @Override // defpackage.anca
    public final Set b() {
        return new anbw(this);
    }

    @Override // defpackage.anca
    public final void c(anbq anbqVar, Object obj) {
        for (int i = 0; i < this.b; i++) {
            int i2 = this.a[i];
            anas d = d(i2 & 31);
            if (!d.b) {
                anbqVar.a(d, d.d(e(i2)), obj);
            } else {
                anbqVar.b(d, new anbx(this, d, i2), obj);
            }
        }
    }

    public final anas d(int i) {
        return (i >= 0 ? this.e : this.d).c(i);
    }

    public final Object e(int i) {
        return (i >= 0 ? this.e : this.d).e(i);
    }
}

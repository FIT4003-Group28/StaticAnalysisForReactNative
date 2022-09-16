package defpackage;
/* compiled from: PG */
/* renamed from: eaoa  reason: default package */
/* loaded from: classes6.dex */
public final class eaoa extends eanz {
    final int[] a;
    final int b;

    public eaoa(String str, int i, int[] iArr, int i2) {
        super(str, i);
        if (i2 >= 3) {
            this.a = iArr;
            this.b = i2;
            return;
        }
        throw new IllegalArgumentException("Qlen must >= 3");
    }

    @Override // defpackage.eanz
    public final boolean a(int i) {
        return false;
    }

    @Override // defpackage.eanz
    public final boolean b(int i, int i2) {
        return false;
    }

    @Override // defpackage.eanz
    public final boolean c(int[] iArr, int i) {
        if (i == this.b) {
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] != this.a[i2]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}

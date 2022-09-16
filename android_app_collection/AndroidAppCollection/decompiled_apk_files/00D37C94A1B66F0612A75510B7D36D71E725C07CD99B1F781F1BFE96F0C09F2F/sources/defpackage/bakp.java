package defpackage;
/* compiled from: PG */
/* renamed from: bakp  reason: default package */
/* loaded from: classes2.dex */
final class bakp implements bala {
    private final bala[] a;
    private final int b;

    public bakp(bala[] balaVarArr) {
        int a;
        this.a = balaVarArr;
        int length = balaVarArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                this.b = i;
                return;
            }
            bala balaVar = balaVarArr[length];
            if (balaVar != null && (a = balaVar.a()) > i) {
                i = a;
            }
        }
    }

    @Override // defpackage.bala
    public final int a() {
        return this.b;
    }

    @Override // defpackage.bala
    public final int c(bald baldVar, String str, int i) {
        int i2;
        int i3;
        bala[] balaVarArr = this.a;
        int length = balaVarArr.length;
        Object b = baldVar.b();
        boolean z = false;
        Object obj = null;
        int i4 = i;
        int i5 = i4;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                break;
            }
            bala balaVar = balaVarArr[i6];
            if (balaVar != null) {
                int c = balaVar.c(baldVar, str, i);
                if (c >= i) {
                    if (c <= i4) {
                        continue;
                    } else if (c >= str.length() || (i3 = i6 + 1) >= length || balaVarArr[i3] == null) {
                        break;
                    } else {
                        obj = baldVar.b();
                        i4 = c;
                    }
                } else if (c < 0 && (i2 = c ^ (-1)) > i5) {
                    i5 = i2;
                }
                baldVar.h(b);
                i6++;
            } else if (i4 <= i) {
                return i;
            } else {
                z = true;
            }
        }
        if (i4 > i || (i4 == i && z)) {
            if (obj != null) {
                baldVar.h(obj);
            }
            return i4;
        }
        return i5 ^ (-1);
    }
}

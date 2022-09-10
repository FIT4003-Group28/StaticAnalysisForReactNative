package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eatu  reason: default package */
/* loaded from: classes.dex */
public final class eatu implements eauf {
    private final eauf[] a;
    private final int b;

    public eatu(eauf[] eaufVarArr) {
        int d;
        this.a = eaufVarArr;
        int length = eaufVarArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                this.b = i;
                return;
            }
            eauf eaufVar = eaufVarArr[length];
            if (eaufVar != null && (d = eaufVar.d()) > i) {
                i = d;
            }
        }
    }

    @Override // defpackage.eauf
    public final int d() {
        return this.b;
    }

    @Override // defpackage.eauf
    public final int e(eaui eauiVar, String str, int i) {
        int i2;
        int i3;
        eauf[] eaufVarArr = this.a;
        int length = eaufVarArr.length;
        Object e = eauiVar.e();
        boolean z = false;
        Object obj = null;
        int i4 = i;
        int i5 = i4;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                break;
            }
            eauf eaufVar = eaufVarArr[i6];
            if (eaufVar != null) {
                int e2 = eaufVar.e(eauiVar, str, i);
                if (e2 >= i) {
                    if (e2 <= i4) {
                        continue;
                    } else if (e2 >= str.length() || (i3 = i6 + 1) >= length || eaufVarArr[i3] == null) {
                        break;
                    } else {
                        obj = eauiVar.e();
                        i4 = e2;
                    }
                } else if (e2 < 0 && (i2 = e2 ^ (-1)) > i5) {
                    i5 = i2;
                }
                eauiVar.h(e);
                i6++;
            } else if (i4 <= i) {
                return i;
            } else {
                z = true;
            }
        }
        if (i4 > i || (i4 == i && z)) {
            if (obj != null) {
                eauiVar.h(obj);
            }
            return i4;
        }
        return i5 ^ (-1);
    }
}

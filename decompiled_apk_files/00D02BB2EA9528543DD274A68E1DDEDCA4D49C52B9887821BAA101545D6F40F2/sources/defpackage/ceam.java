package defpackage;
/* compiled from: PG */
/* renamed from: ceam  reason: default package */
/* loaded from: classes4.dex */
public final class ceam {
    public final boolean a;
    public final cdvt<String> b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final ceao f;
    public final dzss g;
    public final dzss h;
    public final dmbc i;
    public final dmbc j;
    public final dnqh k;

    /* JADX WARN: Removed duplicated region for block: B:59:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ceam(defpackage.dmbc r6, defpackage.dmbc r7, defpackage.dnqh r8) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceam.<init>(dmbc, dmbc, dnqh):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ceam)) {
                return false;
            }
            ceam ceamVar = (ceam) obj;
            return dzvx.d(this.i, ceamVar.i) && dzvx.d(this.j, ceamVar.j) && dzvx.d(this.k, ceamVar.k);
        }
        return true;
    }

    public final int hashCode() {
        int i;
        dmbc dmbcVar = this.i;
        int i2 = 0;
        if (dmbcVar != null) {
            i = dmbcVar.bC;
            if (i == 0) {
                i = dsst.a.b(dmbcVar).c(dmbcVar);
                dmbcVar.bC = i;
            }
        } else {
            i = 0;
        }
        int i3 = i * 31;
        dmbc dmbcVar2 = this.j;
        if (dmbcVar2 != null && (i2 = dmbcVar2.bC) == 0) {
            i2 = dsst.a.b(dmbcVar2).c(dmbcVar2);
            dmbcVar2.bC = i2;
        }
        int i4 = (i3 + i2) * 31;
        dnqh dnqhVar = this.k;
        int i5 = dnqhVar.bC;
        if (i5 == 0) {
            i5 = dsst.a.b(dnqhVar).c(dnqhVar);
            dnqhVar.bC = i5;
        }
        return i4 + i5;
    }

    public final String toString() {
        return "Change(publishedPost=" + this.i + ", draftPost=" + this.j + ", loggingParams=" + this.k + ")";
    }
}

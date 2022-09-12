package defpackage;
/* compiled from: PG */
/* renamed from: cdvn  reason: default package */
/* loaded from: classes4.dex */
final class cdvn {
    public final String a;
    public final ckqc b;

    public cdvn(String str, ckqc ckqcVar) {
        dzvx.c(str, "url");
        dzvx.c(ckqcVar, "qualifier");
        this.a = str;
        this.b = ckqcVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof cdvn)) {
                return false;
            }
            cdvn cdvnVar = (cdvn) obj;
            return dzvx.d(this.a, cdvnVar.a) && dzvx.d(this.b, cdvnVar.b);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ckqc ckqcVar = this.b;
        if (ckqcVar != null) {
            i = ckqcVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ImageUrlWithQualifier(url=" + this.a + ", qualifier=" + this.b + ")";
    }
}

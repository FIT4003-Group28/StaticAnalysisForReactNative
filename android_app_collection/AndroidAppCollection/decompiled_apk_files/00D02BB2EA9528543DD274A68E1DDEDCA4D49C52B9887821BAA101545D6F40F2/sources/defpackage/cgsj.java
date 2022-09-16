package defpackage;
/* compiled from: PG */
/* renamed from: cgsj  reason: default package */
/* loaded from: classes4.dex */
public final class cgsj extends cgsk {
    private final dwqg a;
    private final dwqc b;
    private final dvyw c;

    public cgsj(dwqg dwqgVar, dwqc dwqcVar, dvyw dvywVar) {
        if (dwqgVar != null) {
            this.a = dwqgVar;
            if (dwqcVar != null) {
                this.b = dwqcVar;
                if (dvywVar != null) {
                    this.c = dvywVar;
                    return;
                }
                throw new NullPointerException("Null tactilePlace");
            }
            throw new NullPointerException("Null placeInfo");
        }
        throw new NullPointerException("Null proto");
    }

    @Override // defpackage.cgsk
    public final dwqg a() {
        return this.a;
    }

    @Override // defpackage.cgsk
    public final dwqc b() {
        return this.b;
    }

    @Override // defpackage.cgsk
    public final dvyw c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cgsk) {
            cgsk cgskVar = (cgsk) obj;
            if (this.a.equals(cgskVar.a()) && this.b.equals(cgskVar.b()) && this.c.equals(cgskVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        dwqg dwqgVar = this.a;
        int i = dwqgVar.bC;
        if (i == 0) {
            i = dsst.a.b(dwqgVar).c(dwqgVar);
            dwqgVar.bC = i;
        }
        int i2 = (i ^ 1000003) * 1000003;
        dwqc dwqcVar = this.b;
        int i3 = dwqcVar.bC;
        if (i3 == 0) {
            i3 = dsst.a.b(dwqcVar).c(dwqcVar);
            dwqcVar.bC = i3;
        }
        int i4 = (i2 ^ i3) * 1000003;
        dvyw dvywVar = this.c;
        int i5 = dvywVar.bC;
        if (i5 == 0) {
            i5 = dsst.a.b(dvywVar).c(dvywVar);
            dvywVar.bC = i5;
        }
        return i4 ^ i5;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 46 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("TaskAtPlace{proto=");
        sb.append(valueOf);
        sb.append(", placeInfo=");
        sb.append(valueOf2);
        sb.append(", tactilePlace=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: cgsn  reason: default package */
/* loaded from: classes4.dex */
final class cgsn extends cgtc {
    private final dvyw a;
    private final dwqc b;
    private final String c;
    private final dhjz d;
    private final dcdc<cgsk> e;

    public cgsn(dvyw dvywVar, dwqc dwqcVar, String str, dhjz dhjzVar, dcdc<cgsk> dcdcVar) {
        if (dvywVar != null) {
            this.a = dvywVar;
            if (dwqcVar != null) {
                this.b = dwqcVar;
                if (str != null) {
                    this.c = str;
                    if (dhjzVar != null) {
                        this.d = dhjzVar;
                        if (dcdcVar != null) {
                            this.e = dcdcVar;
                            return;
                        }
                        throw new NullPointerException("Null tasks");
                    }
                    throw new NullPointerException("Null location");
                }
                throw new NullPointerException("Null featureId");
            }
            throw new NullPointerException("Null placeInfo");
        }
        throw new NullPointerException("Null tactilePlace");
    }

    @Override // defpackage.cgtc
    public final dvyw a() {
        return this.a;
    }

    @Override // defpackage.cgtc
    public final dwqc b() {
        return this.b;
    }

    @Override // defpackage.cgtc
    public final String c() {
        return this.c;
    }

    @Override // defpackage.cgtc
    public final dhjz d() {
        return this.d;
    }

    @Override // defpackage.cgtc
    public final dcdc<cgsk> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cgtc) {
            cgtc cgtcVar = (cgtc) obj;
            if (this.a.equals(cgtcVar.a()) && this.b.equals(cgtcVar.b()) && this.c.equals(cgtcVar.c()) && this.d.equals(cgtcVar.d()) && dchl.m(this.e, cgtcVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        dvyw dvywVar = this.a;
        int i = dvywVar.bC;
        if (i == 0) {
            i = dsst.a.b(dvywVar).c(dvywVar);
            dvywVar.bC = i;
        }
        int i2 = (i ^ 1000003) * 1000003;
        dwqc dwqcVar = this.b;
        int i3 = dwqcVar.bC;
        if (i3 == 0) {
            i3 = dsst.a.b(dwqcVar).c(dwqcVar);
            dwqcVar.bC = i3;
        }
        int hashCode = (((i2 ^ i3) * 1000003) ^ this.c.hashCode()) * 1000003;
        dhjz dhjzVar = this.d;
        int i4 = dhjzVar.bC;
        if (i4 == 0) {
            i4 = dsst.a.b(dhjzVar).c(dhjzVar);
            dhjzVar.bC = i4;
        }
        return this.e.hashCode() ^ ((hashCode ^ i4) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String str = this.c;
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = str.length();
        StringBuilder sb = new StringBuilder(length + 70 + length2 + length3 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("GroupedTasks{tactilePlace=");
        sb.append(valueOf);
        sb.append(", placeInfo=");
        sb.append(valueOf2);
        sb.append(", featureId=");
        sb.append(str);
        sb.append(", location=");
        sb.append(valueOf3);
        sb.append(", tasks=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}

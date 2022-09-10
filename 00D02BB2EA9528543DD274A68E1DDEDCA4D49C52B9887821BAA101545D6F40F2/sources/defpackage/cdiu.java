package defpackage;
/* compiled from: PG */
/* renamed from: cdiu  reason: default package */
/* loaded from: classes4.dex */
final class cdiu extends cdjf {
    private final dcdc<bbtm> a;
    private final chbv b;
    private final dnqh c;
    private final cdjd d;

    public cdiu(dcdc<bbtm> dcdcVar, chbv chbvVar, dnqh dnqhVar, cdjd cdjdVar) {
        this.a = dcdcVar;
        this.b = chbvVar;
        this.c = dnqhVar;
        this.d = cdjdVar;
    }

    @Override // defpackage.cdjf
    public final dcdc<bbtm> a() {
        return this.a;
    }

    @Override // defpackage.cdjf
    public final chbv b() {
        return this.b;
    }

    @Override // defpackage.cdjf
    public final dnqh c() {
        return this.c;
    }

    @Override // defpackage.cdjf
    public final cdjd d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        cdjd cdjdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdjf) {
            cdjf cdjfVar = (cdjf) obj;
            if (dchl.m(this.a, cdjfVar.a()) && this.b.equals(cdjfVar.b()) && this.c.equals(cdjfVar.c()) && ((cdjdVar = this.d) != null ? cdjdVar.equals(cdjfVar.d()) : cdjfVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        dnqh dnqhVar = this.c;
        int i = dnqhVar.bC;
        if (i == 0) {
            i = dsst.a.b(dnqhVar).c(dnqhVar);
            dnqhVar.bC = i;
        }
        int i2 = (hashCode ^ i) * 1000003;
        cdjd cdjdVar = this.d;
        return i2 ^ (cdjdVar == null ? 0 : cdjdVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 77 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("PostConfiguration{photosToPreselect=");
        sb.append(valueOf);
        sb.append(", thanksOnSubmit=");
        sb.append(valueOf2);
        sb.append(", loggingParams=");
        sb.append(valueOf3);
        sb.append(", post=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}

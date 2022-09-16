package defpackage;
/* compiled from: PG */
/* renamed from: cdur  reason: default package */
/* loaded from: classes4.dex */
public final class cdur extends cdzd {
    public final bwrs<ilo> a;
    public final dnqh b;
    public final cdjd c;

    public cdur(bwrs<ilo> bwrsVar, dnqh dnqhVar, cdjd cdjdVar) {
        if (bwrsVar != null) {
            this.a = bwrsVar;
            if (dnqhVar != null) {
                this.b = dnqhVar;
                this.c = cdjdVar;
                return;
            }
            throw new NullPointerException("Null loggingParams");
        }
        throw new NullPointerException("Null placemarkRef");
    }

    @Override // defpackage.cdzd
    public final bwrs<ilo> a() {
        return this.a;
    }

    @Override // defpackage.cdzd
    public final dnqh b() {
        return this.b;
    }

    @Override // defpackage.cdzd
    public final cdjd c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        cdjd cdjdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdzd) {
            cdzd cdzdVar = (cdzd) obj;
            if (this.a.equals(cdzdVar.a()) && this.b.equals(cdzdVar.b()) && ((cdjdVar = this.c) != null ? cdjdVar.equals(cdzdVar.c()) : cdzdVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        dnqh dnqhVar = this.b;
        int i = dnqhVar.bC;
        if (i == 0) {
            i = dsst.a.b(dnqhVar).c(dnqhVar);
            dnqhVar.bC = i;
        }
        int i2 = (hashCode ^ i) * 1000003;
        cdjd cdjdVar = this.c;
        return i2 ^ (cdjdVar == null ? 0 : cdjdVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 45 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("Options{placemarkRef=");
        sb.append(valueOf);
        sb.append(", loggingParams=");
        sb.append(valueOf2);
        sb.append(", post=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: cdqe  reason: default package */
/* loaded from: classes4.dex */
final class cdqe extends cdqu {
    public final String a;
    public final dnqh b;
    public final bwrs<ilo> c;
    public final cdix d;

    public cdqe(String str, dnqh dnqhVar, bwrs<ilo> bwrsVar, cdix cdixVar) {
        if (str != null) {
            this.a = str;
            if (dnqhVar != null) {
                this.b = dnqhVar;
                this.c = bwrsVar;
                if (cdixVar != null) {
                    this.d = cdixVar;
                    return;
                }
                throw new NullPointerException("Null callback");
            }
            throw new NullPointerException("Null loggingParams");
        }
        throw new NullPointerException("Null postId");
    }

    @Override // defpackage.cdqu
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cdqu
    public final dnqh b() {
        return this.b;
    }

    @Override // defpackage.cdqu
    public final bwrs<ilo> c() {
        return this.c;
    }

    @Override // defpackage.cdqu
    public final cdix d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdqu) {
            cdqu cdquVar = (cdqu) obj;
            if (this.a.equals(cdquVar.a()) && this.b.equals(cdquVar.b()) && this.c.equals(cdquVar.c()) && this.d.equals(cdquVar.d())) {
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
        return ((((hashCode ^ i) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 71 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("DeletePostParameters{postId=");
        sb.append(str);
        sb.append(", loggingParams=");
        sb.append(valueOf);
        sb.append(", placemarkRef=");
        sb.append(valueOf2);
        sb.append(", callback=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}

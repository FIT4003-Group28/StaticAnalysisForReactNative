package defpackage;
/* compiled from: PG */
/* renamed from: qaz  reason: default package */
/* loaded from: classes7.dex */
public final class qaz extends qdm {
    public final drih a;
    public final dnqh b;

    public qaz(drih drihVar, dnqh dnqhVar) {
        this.a = drihVar;
        this.b = dnqhVar;
    }

    @Override // defpackage.qdm
    public final drih a() {
        return this.a;
    }

    @Override // defpackage.qdm
    public final dnqh b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qdm) {
            qdm qdmVar = (qdm) obj;
            if (this.a.equals(qdmVar.a()) && this.b.equals(qdmVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        drih drihVar = this.a;
        int i = drihVar.bC;
        if (i == 0) {
            i = dsst.a.b(drihVar).c(drihVar);
            drihVar.bC = i;
        }
        int i2 = (i ^ 1000003) * 1000003;
        dnqh dnqhVar = this.b;
        int i3 = dnqhVar.bC;
        if (i3 == 0) {
            i3 = dsst.a.b(dnqhVar).c(dnqhVar);
            dnqhVar.bC = i3;
        }
        return i2 ^ i3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44 + String.valueOf(valueOf2).length());
        sb.append("Request{patternDescription=");
        sb.append(valueOf);
        sb.append(", loggingParams=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

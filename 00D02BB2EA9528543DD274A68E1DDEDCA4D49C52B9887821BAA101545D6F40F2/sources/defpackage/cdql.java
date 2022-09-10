package defpackage;
/* compiled from: PG */
/* renamed from: cdql  reason: default package */
/* loaded from: classes4.dex */
final class cdql extends cdrp {
    private final dnwl a;

    public cdql(dnwl dnwlVar) {
        if (dnwlVar != null) {
            this.a = dnwlVar;
            return;
        }
        throw new NullPointerException("Null photoDescription");
    }

    @Override // defpackage.cdrp
    public final dnwl c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cdrp)) {
            return false;
        }
        return this.a.equals(((cdrp) obj).c());
    }

    public final int hashCode() {
        dnwl dnwlVar = this.a;
        int i = dnwlVar.bC;
        if (i == 0) {
            i = dsst.a.b(dnwlVar).c(dnwlVar);
            dnwlVar.bC = i;
        }
        return 1000003 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("Photo{photoDescription=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

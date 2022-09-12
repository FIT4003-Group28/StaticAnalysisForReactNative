package defpackage;
/* compiled from: PG */
/* renamed from: cdqo  reason: default package */
/* loaded from: classes4.dex */
final class cdqo extends cdry {
    private final dwfl a;

    public cdqo(dwfl dwflVar) {
        if (dwflVar != null) {
            this.a = dwflVar;
            return;
        }
        throw new NullPointerException("Null photoDescription");
    }

    @Override // defpackage.cdry
    public final dwfl c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cdry)) {
            return false;
        }
        return this.a.equals(((cdry) obj).c());
    }

    public final int hashCode() {
        dwfl dwflVar = this.a;
        int i = dwflVar.bC;
        if (i == 0) {
            i = dsst.a.b(dwflVar).c(dwflVar);
            dwflVar.bC = i;
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

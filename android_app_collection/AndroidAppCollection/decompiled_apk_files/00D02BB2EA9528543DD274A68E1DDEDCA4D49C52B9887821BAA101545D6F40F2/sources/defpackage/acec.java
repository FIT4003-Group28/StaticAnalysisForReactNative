package defpackage;
/* compiled from: PG */
/* renamed from: acec  reason: default package */
/* loaded from: classes2.dex */
final class acec extends acej {
    private final dwfl a;
    private final dbsg<dqlo> b;

    public acec(dwfl dwflVar, dbsg<dqlo> dbsgVar) {
        if (dwflVar != null) {
            this.a = dwflVar;
            this.b = dbsgVar;
            return;
        }
        throw new NullPointerException("Null tactilePhotoDescription");
    }

    @Override // defpackage.acej
    public final dwfl a() {
        return this.a;
    }

    @Override // defpackage.acej
    public final dbsg<dqlo> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acej) {
            acej acejVar = (acej) obj;
            if (this.a.equals(acejVar.a()) && this.b.equals(acejVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        dwfl dwflVar = this.a;
        int i = dwflVar.bC;
        if (i == 0) {
            i = dsst.a.b(dwflVar).c(dwflVar);
            dwflVar.bC = i;
        }
        return this.b.hashCode() ^ ((i ^ 1000003) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56 + String.valueOf(valueOf2).length());
        sb.append("VisualExplorePhoto{tactilePhotoDescription=");
        sb.append(valueOf);
        sb.append(", timestamp=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

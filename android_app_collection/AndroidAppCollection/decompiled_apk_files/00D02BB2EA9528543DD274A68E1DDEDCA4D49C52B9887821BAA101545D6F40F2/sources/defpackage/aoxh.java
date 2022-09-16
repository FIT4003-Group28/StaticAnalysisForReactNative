package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aoxh  reason: default package */
/* loaded from: classes2.dex */
public final class aoxh extends aoyj {
    public final aoyi a;
    public final dbsg<aoxp> b;
    public final dbsg<ilo> c;
    public final int d;

    public aoxh(aoyi aoyiVar, int i, dbsg<aoxp> dbsgVar, dbsg<ilo> dbsgVar2) {
        this.a = aoyiVar;
        this.d = i;
        this.b = dbsgVar;
        this.c = dbsgVar2;
    }

    @Override // defpackage.aoyj
    public final aoyi a() {
        return this.a;
    }

    @Override // defpackage.aoyj
    public final dbsg<aoxp> b() {
        return this.b;
    }

    @Override // defpackage.aoyj
    public final dbsg<ilo> c() {
        return this.c;
    }

    @Override // defpackage.aoyj
    public final aoyh d() {
        return new aoxg(this);
    }

    @Override // defpackage.aoyj
    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aoyj) {
            aoyj aoyjVar = (aoyj) obj;
            if (this.a.equals(aoyjVar.a())) {
                int i = this.d;
                int e = aoyjVar.e();
                if (i == 0) {
                    throw null;
                }
                if (i == e && this.b.equals(aoyjVar.b()) && this.c.equals(aoyjVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int i = this.d;
        aown.b(i);
        return ((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String a = aown.a(this.d);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        int length2 = a.length();
        StringBuilder sb = new StringBuilder(length + 84 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("VisitedPlacesListKey{ordering=");
        sb.append(valueOf);
        sb.append(", placeType=");
        sb.append(a);
        sb.append(", categoryFilter=");
        sb.append(valueOf2);
        sb.append(", containingPlaceFilter=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: cjrp  reason: default package */
/* loaded from: classes.dex */
public final class cjrp extends cjsh {
    public final dbsg<cjrc> a;
    private final dbsg<cjsg> b;
    private final dbsg<Integer> c;

    public cjrp(dbsg<cjrc> dbsgVar, dbsg<cjsg> dbsgVar2, dbsg<Integer> dbsgVar3) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
        this.c = dbsgVar3;
    }

    @Override // defpackage.cjsh
    public final dbsg<cjrc> a() {
        return this.a;
    }

    @Override // defpackage.cjsh
    public final dbsg<cjsg> b() {
        return this.b;
    }

    @Override // defpackage.cjsh
    public final dbsg<Integer> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cjsh) {
            cjsh cjshVar = (cjsh) obj;
            if (this.a.equals(cjshVar.a()) && this.b.equals(cjshVar.b()) && this.c.equals(cjshVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 51 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ImpressionReference{eventId=");
        sb.append(valueOf);
        sb.append(", identifier=");
        sb.append(valueOf2);
        sb.append(", uiType=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}

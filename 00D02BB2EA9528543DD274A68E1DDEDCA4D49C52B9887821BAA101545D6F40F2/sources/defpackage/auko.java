package defpackage;
/* compiled from: PG */
/* renamed from: auko  reason: default package */
/* loaded from: classes2.dex */
final class auko extends aule {
    private final aujb a;
    private final String b;
    private final aulc c;
    private final dbsg<aulg> d;
    private final dcdc<aulf> e;
    private final dlfv f;
    private final dbsg<aulu> g;

    public auko(aujb aujbVar, String str, aulc aulcVar, dbsg<aulg> dbsgVar, dcdc<aulf> dcdcVar, dlfv dlfvVar, dbsg<aulu> dbsgVar2) {
        this.a = aujbVar;
        this.b = str;
        this.c = aulcVar;
        this.d = dbsgVar;
        this.e = dcdcVar;
        this.f = dlfvVar;
        this.g = dbsgVar2;
    }

    @Override // defpackage.aule
    public final aujb a() {
        return this.a;
    }

    @Override // defpackage.aule
    public final String b() {
        return this.b;
    }

    @Override // defpackage.aule
    public final aulc c() {
        return this.c;
    }

    @Override // defpackage.aule
    public final dbsg<aulg> d() {
        return this.d;
    }

    @Override // defpackage.aule
    public final dcdc<aulf> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aule) {
            aule auleVar = (aule) obj;
            if (this.a.equals(auleVar.a()) && this.b.equals(auleVar.b()) && this.c.equals(auleVar.c()) && this.d.equals(auleVar.d()) && dchl.m(this.e, auleVar.e()) && this.f.equals(auleVar.f()) && this.g.equals(auleVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aule
    public final dlfv f() {
        return this.f;
    }

    @Override // defpackage.aule
    public final dbsg<aulu> g() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        dlfv dlfvVar = this.f;
        int i = dlfvVar.bC;
        if (i == 0) {
            i = dsst.a.b(dlfvVar).c(dlfvVar);
            dlfvVar.bC = i;
        }
        return ((hashCode ^ i) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        String valueOf6 = String.valueOf(this.g);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 102 + length2 + length3 + length4 + length5 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("ChimeNotification{notificationType=");
        sb.append(valueOf);
        sb.append(", id=");
        sb.append(str);
        sb.append(", loggingInfo=");
        sb.append(valueOf2);
        sb.append(", contentIntent=");
        sb.append(valueOf3);
        sb.append(", actions=");
        sb.append(valueOf4);
        sb.append(", payload=");
        sb.append(valueOf5);
        sb.append(", metadata=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}

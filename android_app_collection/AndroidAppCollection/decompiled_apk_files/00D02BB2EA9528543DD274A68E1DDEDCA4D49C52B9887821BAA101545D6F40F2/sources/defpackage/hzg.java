package defpackage;
/* compiled from: PG */
/* renamed from: hzg  reason: default package */
/* loaded from: classes6.dex */
final class hzg extends iaq {
    private final cqss a;
    private final cqss b;
    private final dcdc<cqmp<iao>> c;
    private final cqss d;

    public hzg(@dzsi cqss cqssVar, @dzsi cqss cqssVar2, dcdc<cqmp<iao>> dcdcVar, cqss cqssVar3) {
        this.a = cqssVar;
        this.b = cqssVar2;
        this.c = dcdcVar;
        this.d = cqssVar3;
    }

    @Override // defpackage.iaq
    @dzsi
    public final cqss a() {
        return this.a;
    }

    @Override // defpackage.iaq
    @dzsi
    public final cqss b() {
        return this.b;
    }

    @Override // defpackage.iaq
    public final dcdc<cqmp<iao>> c() {
        return this.c;
    }

    @Override // defpackage.iaq
    public final cqss d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iaq) {
            iaq iaqVar = (iaq) obj;
            cqss cqssVar = this.a;
            if (cqssVar != null ? cqssVar.equals(iaqVar.a()) : iaqVar.a() == null) {
                cqss cqssVar2 = this.b;
                if (cqssVar2 != null ? cqssVar2.equals(iaqVar.b()) : iaqVar.b() == null) {
                    if (dchl.m(this.c, iaqVar.c()) && this.d.equals(iaqVar.d())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        cqss cqssVar = this.a;
        int i = 0;
        int hashCode = ((cqssVar == null ? 0 : cqssVar.hashCode()) ^ 1000003) * 1000003;
        cqss cqssVar2 = this.b;
        if (cqssVar2 != null) {
            i = cqssVar2.hashCode();
        }
        return ((((hashCode ^ i) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 82 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("ModTabViewProperties{textColor=");
        sb.append(valueOf);
        sb.append(", selectedTextColor=");
        sb.append(valueOf2);
        sb.append(", textProperties=");
        sb.append(valueOf3);
        sb.append(", badgeColor=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}

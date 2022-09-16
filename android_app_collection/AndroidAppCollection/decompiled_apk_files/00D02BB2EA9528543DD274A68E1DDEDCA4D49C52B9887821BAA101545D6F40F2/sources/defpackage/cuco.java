package defpackage;
/* compiled from: PG */
/* renamed from: cuco  reason: default package */
/* loaded from: classes5.dex */
final class cuco extends ctzp {
    private final dcdc<Byte> a;
    private final Long b;
    private final Long c;
    private final ctzo d;

    public cuco(dcdc<Byte> dcdcVar, Long l, Long l2, ctzo ctzoVar) {
        this.a = dcdcVar;
        this.b = l;
        this.c = l2;
        this.d = ctzoVar;
    }

    @Override // defpackage.ctzp
    public final dcdc<Byte> a() {
        return this.a;
    }

    @Override // defpackage.ctzp
    public final Long b() {
        return this.b;
    }

    @Override // defpackage.ctzp
    public final Long c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctzp) {
            ctzp ctzpVar = (ctzp) obj;
            if (dchl.m(this.a, ctzpVar.a()) && this.b.equals(ctzpVar.b()) && this.c.equals(ctzpVar.c()) && this.d.equals(ctzpVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ctzp
    public final ctzo g() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 59 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("AuthToken{tachyonToken=");
        sb.append(valueOf);
        sb.append(", expireAt=");
        sb.append(valueOf2);
        sb.append(", refreshedAt=");
        sb.append(valueOf3);
        sb.append(", oneOfId=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}

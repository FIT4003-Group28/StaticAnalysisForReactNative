package defpackage;
/* compiled from: PG */
/* renamed from: dmw  reason: default package */
/* loaded from: classes6.dex */
public final class dmw extends dmr {
    private final dmq a;
    private final dbsg<akqi> b;
    private final dbsg<dsza> c;

    public dmw(dmq dmqVar, dbsg<akqi> dbsgVar, dbsg<dsza> dbsgVar2) {
        if (dmqVar != null) {
            this.a = dmqVar;
            this.b = dbsgVar;
            this.c = dbsgVar2;
            return;
        }
        throw new NullPointerException("Null type");
    }

    @Override // defpackage.dmr
    public final dmq a() {
        return this.a;
    }

    @Override // defpackage.dmr
    public final dbsg<akqi> b() {
        return this.b;
    }

    @Override // defpackage.dmr
    public final dbsg<dsza> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dmr) {
            dmr dmrVar = (dmr) obj;
            if (this.a.equals(dmrVar.a()) && this.b.equals(dmrVar.b()) && this.c.equals(dmrVar.c())) {
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
        StringBuilder sb = new StringBuilder(length + 46 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ArPoiIdentifier{type=");
        sb.append(valueOf);
        sb.append(", featureId=");
        sb.append(valueOf2);
        sb.append(", latLngAlt=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}

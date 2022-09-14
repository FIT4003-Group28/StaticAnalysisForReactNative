package defpackage;
/* compiled from: PG */
/* renamed from: tln  reason: default package */
/* loaded from: classes7.dex */
class tln extends tmd {
    public final dbsg<String> a;
    public final dcdc<String> b;
    public final dcdn<String, tlv> c;
    private final btlu d;
    private final tme e;

    public tln(btlu btluVar, dbsg<String> dbsgVar, tme tmeVar, dcdc<String> dcdcVar, dcdn<String, tlv> dcdnVar) {
        if (btluVar != null) {
            this.d = btluVar;
            if (dbsgVar != null) {
                this.a = dbsgVar;
                if (tmeVar != null) {
                    this.e = tmeVar;
                    if (dcdcVar != null) {
                        this.b = dcdcVar;
                        if (dcdnVar != null) {
                            this.c = dcdnVar;
                            return;
                        }
                        throw new NullPointerException("Null groupsMap");
                    }
                    throw new NullPointerException("Null groupRankingOrder");
                }
                throw new NullPointerException("Null metadata");
            }
            throw new NullPointerException("Null pinnedGroupId");
        }
        throw new NullPointerException("Null account");
    }

    @Override // defpackage.tmd
    public final btlu a() {
        return this.d;
    }

    @Override // defpackage.tmd
    public final dbsg<String> b() {
        return this.a;
    }

    @Override // defpackage.tmd
    public final tme c() {
        return this.e;
    }

    @Override // defpackage.tmd
    public final dcdc<String> d() {
        return this.b;
    }

    @Override // defpackage.tmd
    public final dcdn<String, tlv> e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tmd) {
            tmd tmdVar = (tmd) obj;
            if (this.d.equals(tmdVar.a()) && this.a.equals(tmdVar.b()) && this.e.equals(tmdVar.c()) && dchl.m(this.b, tmdVar.d()) && this.c.equals(tmdVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tmd
    public final tmc f() {
        return new tlm(this);
    }

    public final int hashCode() {
        return ((((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.a);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.b);
        String valueOf5 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 85 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("StoredDirections{account=");
        sb.append(valueOf);
        sb.append(", pinnedGroupId=");
        sb.append(valueOf2);
        sb.append(", metadata=");
        sb.append(valueOf3);
        sb.append(", groupRankingOrder=");
        sb.append(valueOf4);
        sb.append(", groupsMap=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}

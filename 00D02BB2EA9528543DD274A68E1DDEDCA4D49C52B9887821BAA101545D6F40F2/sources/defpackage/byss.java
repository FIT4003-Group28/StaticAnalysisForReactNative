package defpackage;
/* compiled from: PG */
/* renamed from: byss  reason: default package */
/* loaded from: classes4.dex */
final class byss extends byuh {
    private final dbsg<String> a;
    private final dbsg<String> b;
    private final dbsg<akqq> c;
    private final dbsg<akqq> d;

    public byss(dbsg<String> dbsgVar, dbsg<String> dbsgVar2, dbsg<akqq> dbsgVar3, dbsg<akqq> dbsgVar4) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
        this.c = dbsgVar3;
        this.d = dbsgVar4;
    }

    @Override // defpackage.byuh
    public final dbsg<String> a() {
        return this.a;
    }

    @Override // defpackage.byuh
    public final dbsg<String> b() {
        return this.b;
    }

    @Override // defpackage.byuh
    public final dbsg<akqq> c() {
        return this.c;
    }

    @Override // defpackage.byuh
    public final dbsg<akqq> d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof byuh) {
            byuh byuhVar = (byuh) obj;
            if (this.a.equals(byuhVar.a()) && this.b.equals(byuhVar.b()) && this.c.equals(byuhVar.c()) && this.d.equals(byuhVar.d())) {
                return true;
            }
        }
        return false;
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
        StringBuilder sb = new StringBuilder(length + 52 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("PlaceAliases{home=");
        sb.append(valueOf);
        sb.append(", work=");
        sb.append(valueOf2);
        sb.append(", homeLatLng=");
        sb.append(valueOf3);
        sb.append(", workLatLng=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}

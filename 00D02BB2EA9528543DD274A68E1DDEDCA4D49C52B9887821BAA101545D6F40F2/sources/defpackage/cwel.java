package defpackage;
/* compiled from: PG */
/* renamed from: cwel  reason: default package */
/* loaded from: classes5.dex */
public final class cwel<AccountT> extends cwen<AccountT> {
    private final dbsg<cwdy> a;
    private final dcdc<cwea> b;
    private final dcdc<cwbe<AccountT, ? extends cwbn>> c;

    public cwel(dbsg<cwdy> dbsgVar, dcdc<cwea> dcdcVar, dcdc<cwbe<AccountT, ? extends cwbn>> dcdcVar2) {
        this.a = dbsgVar;
        this.b = dcdcVar;
        this.c = dcdcVar2;
    }

    @Override // defpackage.cwen, defpackage.cweb
    public final dbsg<cwdy> a() {
        return this.a;
    }

    @Override // defpackage.cwen, defpackage.cweb
    public final dcdc<cwea> b() {
        return this.b;
    }

    @Override // defpackage.cwen, defpackage.cweb
    public final dcdc<cwbe<AccountT, ? extends cwbn>> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cwen) {
            cwen cwenVar = (cwen) obj;
            if (this.a.equals(cwenVar.a()) && dchl.m(this.b, cwenVar.b()) && dchl.m(this.c, cwenVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 2097800333) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 96 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("CollapsibleAccountManagementFeatureImpl{customCardsViewProvider=");
        sb.append(valueOf);
        sb.append(", customActions=");
        sb.append(valueOf2);
        sb.append(", dynamicCards=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}

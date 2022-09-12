package defpackage;
/* compiled from: PG */
/* renamed from: cwff  reason: default package */
/* loaded from: classes.dex */
public final class cwff<AccountT> extends cwfh<AccountT> {
    private final dbsg<cvub<AccountT>> a;
    private final dbsg<cvub<AccountT>> b;
    private final dbsg<Integer> c;
    private final dbsg<cvub<AccountT>> d;

    public cwff(dbsg<cvub<AccountT>> dbsgVar, dbsg<cvub<AccountT>> dbsgVar2, dbsg<Integer> dbsgVar3, dbsg<cvub<AccountT>> dbsgVar4) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
        this.c = dbsgVar3;
        this.d = dbsgVar4;
    }

    @Override // defpackage.cweh
    public final dbsg<cvub<AccountT>> a() {
        return this.a;
    }

    @Override // defpackage.cweh
    public final dbsg<cvub<AccountT>> b() {
        return this.b;
    }

    @Override // defpackage.cweh
    public final dbsg<Integer> c() {
        return this.c;
    }

    @Override // defpackage.cweh
    public final dbsg<cvub<AccountT>> d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cwfh) {
            cwfh cwfhVar = (cwfh) obj;
            if (this.a.equals(cwfhVar.a()) && this.b.equals(cwfhVar.b()) && this.c.equals(cwfhVar.c()) && this.d.equals(cwfhVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 137 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("PolicyFooterCustomizerImpl{privacyPolicyClickListener=");
        sb.append(valueOf);
        sb.append(", termsOfServiceClickListener=");
        sb.append(valueOf2);
        sb.append(", customItemLabelStringId=");
        sb.append(valueOf3);
        sb.append(", customItemClickListener=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}

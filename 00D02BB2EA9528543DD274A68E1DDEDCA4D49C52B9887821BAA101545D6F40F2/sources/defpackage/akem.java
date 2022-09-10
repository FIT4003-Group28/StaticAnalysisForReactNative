package defpackage;
/* compiled from: PG */
/* renamed from: akem  reason: default package */
/* loaded from: classes2.dex */
final class akem extends akes {
    private final aket a;
    private final akeu b;
    private final dbsg<dktk> c;
    private final dbsg<Boolean> d;

    public akem(aket aketVar, akeu akeuVar, dbsg<dktk> dbsgVar, dbsg<Boolean> dbsgVar2) {
        this.a = aketVar;
        this.b = akeuVar;
        this.c = dbsgVar;
        this.d = dbsgVar2;
    }

    @Override // defpackage.akes
    public final aket a() {
        return this.a;
    }

    @Override // defpackage.akes
    public final akeu b() {
        return this.b;
    }

    @Override // defpackage.akes
    public final dbsg<dktk> c() {
        return this.c;
    }

    @Override // defpackage.akes
    public final dbsg<Boolean> d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akes) {
            akes akesVar = (akes) obj;
            if (this.a.equals(akesVar.a()) && this.b.equals(akesVar.b()) && this.c.equals(akesVar.c()) && this.d.equals(akesVar.d())) {
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
        StringBuilder sb = new StringBuilder(length + 87 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("FullScreenPromoUI{ensuredAccountCallback=");
        sb.append(valueOf);
        sb.append(", options=");
        sb.append(valueOf2);
        sb.append(", bottomTabType=");
        sb.append(valueOf3);
        sb.append(", searchboxEnabled=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}

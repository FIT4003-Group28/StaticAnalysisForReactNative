package defpackage;
/* compiled from: PG */
/* renamed from: apyk  reason: default package */
/* loaded from: classes2.dex */
final class apyk extends apys {
    private final dbsg<String> a;
    private final dbsg<String> b;
    private final dbsg<byee> c;
    private final dbsg<Float> d;
    private final dbsg<Integer> e;

    public apyk(dbsg<String> dbsgVar, dbsg<String> dbsgVar2, dbsg<byee> dbsgVar3, dbsg<Float> dbsgVar4, dbsg<Integer> dbsgVar5) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
        this.c = dbsgVar3;
        this.d = dbsgVar4;
        this.e = dbsgVar5;
    }

    @Override // defpackage.apys
    public final dbsg<String> a() {
        return this.a;
    }

    @Override // defpackage.apys
    public final dbsg<String> b() {
        return this.b;
    }

    @Override // defpackage.apys
    public final dbsg<byee> c() {
        return this.c;
    }

    @Override // defpackage.apys
    public final dbsg<Float> d() {
        return this.d;
    }

    @Override // defpackage.apys
    public final dbsg<Integer> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apys) {
            apys apysVar = (apys) obj;
            if (this.a.equals(apysVar.a()) && this.b.equals(apysVar.b()) && this.c.equals(apysVar.c()) && this.d.equals(apysVar.d()) && this.e.equals(apysVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 85 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("BusinessInformation{responsiveness=");
        sb.append(valueOf);
        sb.append(", address=");
        sb.append(valueOf2);
        sb.append(", openHours=");
        sb.append(valueOf3);
        sb.append(", starRating=");
        sb.append(valueOf4);
        sb.append(", reviewCount=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}

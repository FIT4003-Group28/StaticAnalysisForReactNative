package defpackage;
/* compiled from: PG */
/* renamed from: qhe  reason: default package */
/* loaded from: classes7.dex */
final class qhe extends qhq {
    private final akqq a;
    private final amuk b;
    private final int c;
    private final dbsg<Integer> d;
    private final dbsg<String> e;

    public qhe(akqq akqqVar, amuk amukVar, int i, dbsg<Integer> dbsgVar, dbsg<String> dbsgVar2) {
        this.a = akqqVar;
        this.b = amukVar;
        this.c = i;
        this.d = dbsgVar;
        this.e = dbsgVar2;
    }

    @Override // defpackage.qhq
    public final akqq a() {
        return this.a;
    }

    @Override // defpackage.qhq
    public final amuk b() {
        return this.b;
    }

    @Override // defpackage.qhq
    public final int c() {
        return this.c;
    }

    @Override // defpackage.qhq
    public final dbsg<Integer> d() {
        return this.d;
    }

    @Override // defpackage.qhq
    public final dbsg<String> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qhq) {
            qhq qhqVar = (qhq) obj;
            if (this.a.equals(qhqVar.a()) && this.b.equals(qhqVar.b()) && this.c == qhqVar.c() && this.d.equals(qhqVar.d()) && this.e.equals(qhqVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int i = this.c;
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 100 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("BikesharingStation{location=");
        sb.append(valueOf);
        sb.append(", provider=");
        sb.append(valueOf2);
        sb.append(", availableBikes=");
        sb.append(i);
        sb.append(", availableDocks=");
        sb.append(valueOf3);
        sb.append(", rerouteToken=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: brnu  reason: default package */
/* loaded from: classes4.dex */
final class brnu extends broa {
    public final akqi a;
    public final Float b;
    public final akqq c;
    public final ilo d;
    public final boolean e;

    public brnu(akqi akqiVar, @dzsi Float f, @dzsi akqq akqqVar, @dzsi ilo iloVar, boolean z) {
        this.a = akqiVar;
        this.b = f;
        this.c = akqqVar;
        this.d = iloVar;
        this.e = z;
    }

    @Override // defpackage.broa
    public final akqi a() {
        return this.a;
    }

    @Override // defpackage.broa
    @dzsi
    public final Float b() {
        return this.b;
    }

    @Override // defpackage.broa
    @dzsi
    public final akqq c() {
        return this.c;
    }

    @Override // defpackage.broa
    @dzsi
    public final ilo d() {
        return this.d;
    }

    @Override // defpackage.broa
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        Float f;
        akqq akqqVar;
        ilo iloVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof broa) {
            broa broaVar = (broa) obj;
            if (this.a.equals(broaVar.a()) && ((f = this.b) != null ? f.equals(broaVar.b()) : broaVar.b() == null) && ((akqqVar = this.c) != null ? akqqVar.equals(broaVar.c()) : broaVar.c() == null) && ((iloVar = this.d) != null ? iloVar.equals(broaVar.d()) : broaVar.d() == null) && this.e == broaVar.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.broa
    public final brnz f() {
        return new brnt(this);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Float f = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (f == null ? 0 : f.hashCode())) * 1000003;
        akqq akqqVar = this.c;
        int hashCode3 = (hashCode2 ^ (akqqVar == null ? 0 : akqqVar.hashCode())) * 1000003;
        ilo iloVar = this.d;
        if (iloVar != null) {
            i = iloVar.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        boolean z = this.e;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 82 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("StreamingResultsCacheEntry{featureId=");
        sb.append(valueOf);
        sb.append(", score=");
        sb.append(valueOf2);
        sb.append(", latLng=");
        sb.append(valueOf3);
        sb.append(", place=");
        sb.append(valueOf4);
        sb.append(", isTopResult=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

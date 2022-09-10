package defpackage;
/* compiled from: PG */
/* renamed from: qai  reason: default package */
/* loaded from: classes7.dex */
final class qai extends qco {
    private final dcdc<qcn> a;
    private final qcl b;
    private final qcl c;
    private final boolean d;
    private final qup e;
    private final quy f;
    private final dbsg<dnqh> g;

    public qai(dcdc<qcn> dcdcVar, qcl qclVar, qcl qclVar2, boolean z, @dzsi qup qupVar, @dzsi quy quyVar, dbsg<dnqh> dbsgVar) {
        this.a = dcdcVar;
        this.b = qclVar;
        this.c = qclVar2;
        this.d = z;
        this.e = qupVar;
        this.f = quyVar;
        this.g = dbsgVar;
    }

    @Override // defpackage.qco
    public final dcdc<qcn> a() {
        return this.a;
    }

    @Override // defpackage.qco
    public final qcl b() {
        return this.b;
    }

    @Override // defpackage.qco
    public final qcl c() {
        return this.c;
    }

    @Override // defpackage.qco
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.qco
    @dzsi
    public final qup e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        qup qupVar;
        quy quyVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qco) {
            qco qcoVar = (qco) obj;
            if (dchl.m(this.a, qcoVar.a()) && this.b.equals(qcoVar.b()) && this.c.equals(qcoVar.c()) && this.d == qcoVar.d() && ((qupVar = this.e) != null ? qupVar.equals(qcoVar.e()) : qcoVar.e() == null) && ((quyVar = this.f) != null ? quyVar.equals(qcoVar.f()) : qcoVar.f() == null) && this.g.equals(qcoVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qco
    @dzsi
    public final quy f() {
        return this.f;
    }

    @Override // defpackage.qco
    public final dbsg<dnqh> g() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003;
        qup qupVar = this.e;
        int i = 0;
        int hashCode2 = (hashCode ^ (qupVar == null ? 0 : qupVar.hashCode())) * 1000003;
        quy quyVar = this.f;
        if (quyVar != null) {
            i = quyVar.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        boolean z = this.d;
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        String valueOf6 = String.valueOf(this.g);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 168 + length2 + length3 + length4 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("StartCommuteBoardParams{routesToDisplay=");
        sb.append(valueOf);
        sb.append(", source=");
        sb.append(valueOf2);
        sb.append(", destination=");
        sb.append(valueOf3);
        sb.append(", swapWithCurrentFragment=");
        sb.append(z);
        sb.append(", commuteHubDirective=");
        sb.append(valueOf4);
        sb.append(", commuteHubState=");
        sb.append(valueOf5);
        sb.append(", directionsRequestLoggingParams=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: csdn  reason: default package */
/* loaded from: classes5.dex */
final class csdn extends csdp {
    private final Long a;
    private final Long b;
    private final Long c;
    private final Long d;
    private final Long e;
    private final int f;
    private final dcdn<String, String> g;
    private final boolean h;

    public csdn(@dzsi Long l, @dzsi Long l2, @dzsi Long l3, @dzsi Long l4, @dzsi Long l5, int i, dcdn<String, String> dcdnVar, boolean z) {
        this.a = l;
        this.b = l2;
        this.c = l3;
        this.d = l4;
        this.e = l5;
        this.f = i;
        this.g = dcdnVar;
        this.h = z;
    }

    @Override // defpackage.csdp
    @dzsi
    public final Long a() {
        return this.a;
    }

    @Override // defpackage.csdp
    @dzsi
    public final Long b() {
        return this.b;
    }

    @Override // defpackage.csdp
    @dzsi
    public final Long c() {
        return this.c;
    }

    @Override // defpackage.csdp
    @dzsi
    public final Long d() {
        return this.d;
    }

    @Override // defpackage.csdp
    @dzsi
    public final Long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof csdp) {
            csdp csdpVar = (csdp) obj;
            Long l = this.a;
            if (l != null ? l.equals(csdpVar.a()) : csdpVar.a() == null) {
                Long l2 = this.b;
                if (l2 != null ? l2.equals(csdpVar.b()) : csdpVar.b() == null) {
                    Long l3 = this.c;
                    if (l3 != null ? l3.equals(csdpVar.c()) : csdpVar.c() == null) {
                        Long l4 = this.d;
                        if (l4 != null ? l4.equals(csdpVar.d()) : csdpVar.d() == null) {
                            Long l5 = this.e;
                            if (l5 != null ? l5.equals(csdpVar.e()) : csdpVar.e() == null) {
                                if (this.f == csdpVar.f() && this.g.equals(csdpVar.g()) && this.h == csdpVar.h()) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.csdp
    public final int f() {
        return this.f;
    }

    @Override // defpackage.csdp
    public final dcdn<String, String> g() {
        return this.g;
    }

    @Override // defpackage.csdp
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        Long l = this.a;
        int i = 0;
        int hashCode = ((l == null ? 0 : l.hashCode()) ^ 1000003) * 1000003;
        Long l2 = this.b;
        int hashCode2 = (hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        Long l3 = this.c;
        int hashCode3 = (hashCode2 ^ (l3 == null ? 0 : l3.hashCode())) * 1000003;
        Long l4 = this.d;
        int hashCode4 = (hashCode3 ^ (l4 == null ? 0 : l4.hashCode())) * 1000003;
        Long l5 = this.e;
        if (l5 != null) {
            i = l5.hashCode();
        }
        return ((((((hashCode4 ^ i) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003) ^ (true != this.h ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        int i = this.f;
        String valueOf6 = String.valueOf(this.g);
        boolean z = this.h;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 158 + length2 + length3 + length4 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("HerrevadReport{latencyMicros=");
        sb.append(valueOf);
        sb.append(", downloadMicros=");
        sb.append(valueOf2);
        sb.append(", downloadBytes=");
        sb.append(valueOf3);
        sb.append(", uploadMicros=");
        sb.append(valueOf4);
        sb.append(", uploadBytes=");
        sb.append(valueOf5);
        sb.append(", measurementType=");
        sb.append(i);
        sb.append(", customParams=");
        sb.append(valueOf6);
        sb.append(", noConnectivity=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

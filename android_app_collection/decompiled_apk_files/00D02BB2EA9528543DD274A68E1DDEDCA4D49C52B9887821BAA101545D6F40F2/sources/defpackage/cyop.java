package defpackage;
/* compiled from: PG */
/* renamed from: cyop  reason: default package */
/* loaded from: classes5.dex */
final class cyop extends cypf {
    private final dbtp a;
    private final Integer b;
    private final int c;
    private final cyfp d;
    private final int e;
    private final int f;
    private final int g;

    public cyop(@dzsi dbtp dbtpVar, @dzsi Integer num, int i, int i2, int i3, int i4, @dzsi cyfp cyfpVar) {
        this.a = dbtpVar;
        this.b = num;
        this.c = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.d = cyfpVar;
    }

    @Override // defpackage.cypf
    @dzsi
    public final dbtp a() {
        return this.a;
    }

    @Override // defpackage.cypf
    @dzsi
    public final Integer b() {
        return this.b;
    }

    @Override // defpackage.cypf
    public final int c() {
        return this.c;
    }

    @Override // defpackage.cypf
    @dzsi
    public final cyfp d() {
        return this.d;
    }

    @Override // defpackage.cypf
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        cyfp cyfpVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cypf) {
            cypf cypfVar = (cypf) obj;
            dbtp dbtpVar = this.a;
            if (dbtpVar != null ? dbtpVar.equals(cypfVar.a()) : cypfVar.a() == null) {
                Integer num = this.b;
                if (num != null ? num.equals(cypfVar.b()) : cypfVar.b() == null) {
                    if (this.c == cypfVar.c()) {
                        int i = this.e;
                        int e = cypfVar.e();
                        if (i == 0) {
                            throw null;
                        }
                        if (i == e) {
                            int i2 = this.f;
                            int f = cypfVar.f();
                            if (i2 == 0) {
                                throw null;
                            }
                            if (i2 == f) {
                                int i3 = this.g;
                                int g = cypfVar.g();
                                if (i3 == 0) {
                                    throw null;
                                }
                                if (i3 == g && ((cyfpVar = this.d) != null ? cyfpVar.equals(cypfVar.d()) : cypfVar.d() == null)) {
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

    @Override // defpackage.cypf
    public final int f() {
        return this.f;
    }

    @Override // defpackage.cypf
    public final int g() {
        return this.g;
    }

    public final int hashCode() {
        dbtp dbtpVar = this.a;
        int i = 0;
        int hashCode = ((dbtpVar == null ? 0 : dbtpVar.hashCode()) ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = (((((((((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c) * 1000003) ^ eaxc.a(this.e)) * 1000003) ^ eaxc.a(this.f)) * 1000003) ^ eaxf.a(this.g)) * 1000003;
        cyfp cyfpVar = this.d;
        if (cyfpVar != null) {
            i = cyfpVar.hashCode();
        }
        return hashCode2 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int i = this.c;
        int i2 = this.e;
        String str = "null";
        String valueOf3 = String.valueOf(i2 != 0 ? eaxc.b(i2) : str);
        int i3 = this.f;
        String valueOf4 = String.valueOf(i3 != 0 ? eaxc.b(i3) : str);
        int i4 = this.g;
        if (i4 != 0) {
            str = eaxf.b(i4);
        }
        String valueOf5 = String.valueOf(str);
        String valueOf6 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 145 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("MetricApiResultDetails{latency=");
        sb.append(valueOf);
        sb.append(", resultIndex=");
        sb.append(valueOf2);
        sb.append(", itemCount=");
        sb.append(i);
        sb.append(", cacheStatusAtQuery=");
        sb.append(valueOf3);
        sb.append(", cacheStatusAtResult=");
        sb.append(valueOf4);
        sb.append(", dataSource=");
        sb.append(valueOf5);
        sb.append(", memoryMeasurement=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}

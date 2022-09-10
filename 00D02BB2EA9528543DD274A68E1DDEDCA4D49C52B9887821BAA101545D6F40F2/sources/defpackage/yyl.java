package defpackage;
/* compiled from: PG */
/* renamed from: yyl  reason: default package */
/* loaded from: classes7.dex */
public final class yyl extends yyj {
    private final amvh a;
    private final dcdc<amvh> b;
    private final dqvj c;
    private final bvrt<dwao> d;
    private final qbs e;
    private final dcep<dpjs> f;
    private final ddfv g;
    private final ddfv h;

    public yyl(amvh amvhVar, dcdc<amvh> dcdcVar, dqvj dqvjVar, bvrt<dwao> bvrtVar, qbs qbsVar, dcep<dpjs> dcepVar, ddfv ddfvVar, ddfv ddfvVar2) {
        if (amvhVar != null) {
            this.a = amvhVar;
            if (dcdcVar != null) {
                this.b = dcdcVar;
                if (dqvjVar != null) {
                    this.c = dqvjVar;
                    this.d = bvrtVar;
                    if (qbsVar != null) {
                        this.e = qbsVar;
                        if (dcepVar != null) {
                            this.f = dcepVar;
                            if (ddfvVar != null) {
                                this.g = ddfvVar;
                                if (ddfvVar2 != null) {
                                    this.h = ddfvVar2;
                                    return;
                                }
                                throw new NullPointerException("Null getCancelVeType");
                            }
                            throw new NullPointerException("Null getSuccessVeType");
                        }
                        throw new NullPointerException("Null entityTypesThatHaveTriggeredAliasSettingFlow");
                    }
                    throw new NullPointerException("Null resultViewMode");
                }
                throw new NullPointerException("Null travelMode");
            }
            throw new NullPointerException("Null destinations");
        }
        throw new NullPointerException("Null startPoint");
    }

    @Override // defpackage.yyj
    public final amvh b() {
        return this.a;
    }

    @Override // defpackage.yyj
    public final dcdc<amvh> c() {
        return this.b;
    }

    @Override // defpackage.yyj
    public final dqvj d() {
        return this.c;
    }

    @Override // defpackage.yyj
    public final bvrt<dwao> e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yyj) {
            yyj yyjVar = (yyj) obj;
            if (this.a.equals(yyjVar.b()) && dchl.m(this.b, yyjVar.c()) && this.c.equals(yyjVar.d()) && this.d.equals(yyjVar.e()) && this.e.equals(yyjVar.f()) && this.f.equals(yyjVar.g()) && this.g.equals(yyjVar.h()) && this.h.equals(yyjVar.i())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.yyj
    public final qbs f() {
        return this.e;
    }

    @Override // defpackage.yyj
    public final dcep<dpjs> g() {
        return this.f;
    }

    @Override // defpackage.yyj
    public final ddfv h() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    @Override // defpackage.yyj
    public final ddfv i() {
        return this.h;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        String valueOf8 = String.valueOf(this.h);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        StringBuilder sb = new StringBuilder(length + 166 + length2 + length3 + length4 + length5 + length6 + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length());
        sb.append("DirectionsData{startPoint=");
        sb.append(valueOf);
        sb.append(", destinations=");
        sb.append(valueOf2);
        sb.append(", travelMode=");
        sb.append(valueOf3);
        sb.append(", options=");
        sb.append(valueOf4);
        sb.append(", resultViewMode=");
        sb.append(valueOf5);
        sb.append(", entityTypesThatHaveTriggeredAliasSettingFlow=");
        sb.append(valueOf6);
        sb.append(", getSuccessVeType=");
        sb.append(valueOf7);
        sb.append(", getCancelVeType=");
        sb.append(valueOf8);
        sb.append("}");
        return sb.toString();
    }
}

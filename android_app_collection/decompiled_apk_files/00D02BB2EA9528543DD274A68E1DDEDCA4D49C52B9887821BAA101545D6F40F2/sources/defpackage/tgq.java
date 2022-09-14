package defpackage;
/* compiled from: PG */
/* renamed from: tgq  reason: default package */
/* loaded from: classes7.dex */
class tgq extends tgv {
    public final int a;
    private final btlu b;
    private final dbsg<amve> c;
    private final dbsg<Integer> d;
    private final dbsg<dqvj> e;
    private final tgu f;
    private final thc g;

    public tgq(int i, btlu btluVar, dbsg dbsgVar, dbsg dbsgVar2, dbsg dbsgVar3, tgu tguVar, thc thcVar) {
        if (i != 0) {
            this.a = i;
            if (btluVar != null) {
                this.b = btluVar;
                if (dbsgVar != null) {
                    this.c = dbsgVar;
                    if (dbsgVar2 != null) {
                        this.d = dbsgVar2;
                        if (dbsgVar3 != null) {
                            this.e = dbsgVar3;
                            if (tguVar != null) {
                                this.f = tguVar;
                                if (thcVar != null) {
                                    this.g = thcVar;
                                    return;
                                }
                                throw new NullPointerException("Null directionsParametersProvider");
                            }
                            throw new NullPointerException("Null optionsTransformer");
                        }
                        throw new NullPointerException("Null highlightedTravelMode");
                    }
                    throw new NullPointerException("Null tripIndex");
                }
                throw new NullPointerException("Null trip");
            }
            throw new NullPointerException("Null gmmAccount");
        }
        throw new NullPointerException("Null fetchReason");
    }

    @Override // defpackage.tgv
    public final btlu a() {
        return this.b;
    }

    @Override // defpackage.tgv
    public final dbsg<amve> b() {
        return this.c;
    }

    @Override // defpackage.tgv
    public final dbsg<Integer> c() {
        return this.d;
    }

    @Override // defpackage.tgv
    public final dbsg<dqvj> d() {
        return this.e;
    }

    @Override // defpackage.tgv
    public final tgu e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tgv) {
            tgv tgvVar = (tgv) obj;
            if (this.a == tgvVar.f() && this.b.equals(tgvVar.a()) && this.c.equals(tgvVar.b()) && this.d.equals(tgvVar.c()) && this.e.equals(tgvVar.d()) && this.f.equals(tgvVar.e()) && this.g.equals(tgvVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tgv
    public final int f() {
        return this.a;
    }

    @Override // defpackage.tgv
    public final thc g() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        String a = tgt.a(this.a);
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        String valueOf6 = String.valueOf(this.g);
        int length = a.length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 134 + length2 + length3 + length4 + length5 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("FetchContext{fetchReason=");
        sb.append(a);
        sb.append(", gmmAccount=");
        sb.append(valueOf);
        sb.append(", trip=");
        sb.append(valueOf2);
        sb.append(", tripIndex=");
        sb.append(valueOf3);
        sb.append(", highlightedTravelMode=");
        sb.append(valueOf4);
        sb.append(", optionsTransformer=");
        sb.append(valueOf5);
        sb.append(", directionsParametersProvider=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: tll  reason: default package */
/* loaded from: classes7.dex */
public class tll extends tlv {
    public final int a;
    public final dcdc<Integer> b;
    public final tme c;
    public final tly d;
    public final dcdn<Integer, amve> e;
    public final int f;
    public final boolean g;
    public final dbsg<tli> h;
    private final int j;
    private final String k;

    public tll(int i, int i2, dcdc<Integer> dcdcVar, tme tmeVar, String str, tly tlyVar, dcdn<Integer, amve> dcdnVar, int i3, boolean z, dbsg<tli> dbsgVar) {
        this.a = i;
        this.j = i2;
        if (dcdcVar != null) {
            this.b = dcdcVar;
            if (tmeVar != null) {
                this.c = tmeVar;
                if (str != null) {
                    this.k = str;
                    if (tlyVar != null) {
                        this.d = tlyVar;
                        if (dcdnVar != null) {
                            this.e = dcdnVar;
                            this.f = i3;
                            this.g = z;
                            if (dbsgVar != null) {
                                this.h = dbsgVar;
                                return;
                            }
                            throw new NullPointerException("Null groupFilter");
                        }
                        throw new NullPointerException("Null tripsAndIndices");
                    }
                    throw new NullPointerException("Null metadata");
                }
                throw new NullPointerException("Null id");
            }
            throw new NullPointerException("Null storedDirectionsMetadata");
        }
        throw new NullPointerException("Null tripIndicesRanking");
    }

    @Override // defpackage.tlv
    public final int a() {
        return this.a;
    }

    @Override // defpackage.tlv
    public final int b() {
        return this.j;
    }

    @Override // defpackage.tlv
    public final dcdc<Integer> c() {
        return this.b;
    }

    @Override // defpackage.tlv
    public final tme d() {
        return this.c;
    }

    @Override // defpackage.tlv
    public final String e() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tlv) {
            tlv tlvVar = (tlv) obj;
            if (this.a == tlvVar.a() && this.j == tlvVar.b() && dchl.m(this.b, tlvVar.c()) && this.c.equals(tlvVar.d()) && this.k.equals(tlvVar.e()) && this.d.equals(tlvVar.f()) && this.e.equals(tlvVar.g()) && this.f == tlvVar.h() && this.g == tlvVar.i() && this.h.equals(tlvVar.j())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tlv
    public final tly f() {
        return this.d;
    }

    @Override // defpackage.tlv
    public final dcdn<Integer, amve> g() {
        return this.e;
    }

    @Override // defpackage.tlv
    public final int h() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.j) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ this.h.hashCode();
    }

    @Override // defpackage.tlv
    public final boolean i() {
        return this.g;
    }

    @Override // defpackage.tlv
    public final dbsg<tli> j() {
        return this.h;
    }

    @Override // defpackage.tlv
    public final tlu k() {
        return new tlk(this);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.j;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String str = this.k;
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        int i3 = this.f;
        boolean z = this.g;
        String valueOf5 = String.valueOf(this.h);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = str.length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 254 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("DirectionsGroup{primaryTripIndex=");
        sb.append(i);
        sb.append(", initialPrimaryTripIndex=");
        sb.append(i2);
        sb.append(", tripIndicesRanking=");
        sb.append(valueOf);
        sb.append(", storedDirectionsMetadata=");
        sb.append(valueOf2);
        sb.append(", id=");
        sb.append(str);
        sb.append(", metadata=");
        sb.append(valueOf3);
        sb.append(", tripsAndIndices=");
        sb.append(valueOf4);
        sb.append(", maxNumTripsToDisplayWithoutExpansion=");
        sb.append(i3);
        sb.append(", allowListExpansion=");
        sb.append(z);
        sb.append(", groupFilter=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}

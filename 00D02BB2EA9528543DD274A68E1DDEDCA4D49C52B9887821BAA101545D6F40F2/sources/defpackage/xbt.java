package defpackage;
/* compiled from: PG */
/* renamed from: xbt  reason: default package */
/* loaded from: classes7.dex */
final class xbt extends xbv {
    private final amvh a;
    private final amvh b;
    private final String c;
    private final dspd d;
    private final dcdc<dpce> e;
    private final amte f;
    private final boolean g;
    private final int h;
    private final int i;

    public xbt(amvh amvhVar, amvh amvhVar2, @dzsi String str, dspd dspdVar, @dzsi dcdc<dpce> dcdcVar, @dzsi amte amteVar, boolean z, int i, int i2) {
        this.a = amvhVar;
        this.b = amvhVar2;
        this.c = str;
        this.d = dspdVar;
        this.e = dcdcVar;
        this.f = amteVar;
        this.g = z;
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.xbv
    public final amvh a() {
        return this.a;
    }

    @Override // defpackage.xbv
    public final amvh b() {
        return this.b;
    }

    @Override // defpackage.xbv
    @dzsi
    public final String c() {
        return this.c;
    }

    @Override // defpackage.xbv
    public final dspd d() {
        return this.d;
    }

    @Override // defpackage.xbv
    @dzsi
    public final dcdc<dpce> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        dcdc<dpce> dcdcVar;
        amte amteVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof xbv) {
            xbv xbvVar = (xbv) obj;
            if (this.a.equals(xbvVar.a()) && this.b.equals(xbvVar.b()) && ((str = this.c) != null ? str.equals(xbvVar.c()) : xbvVar.c() == null) && this.d.equals(xbvVar.d()) && ((dcdcVar = this.e) != null ? dchl.m(dcdcVar, xbvVar.e()) : xbvVar.e() == null) && ((amteVar = this.f) != null ? amteVar.equals(xbvVar.f()) : xbvVar.f() == null) && this.g == xbvVar.g() && this.h == xbvVar.h() && this.i == xbvVar.i()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.xbv
    @dzsi
    public final amte f() {
        return this.f;
    }

    @Override // defpackage.xbv
    public final boolean g() {
        return this.g;
    }

    @Override // defpackage.xbv
    public final int h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int i = 0;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003;
        dcdc<dpce> dcdcVar = this.e;
        int hashCode3 = (hashCode2 ^ (dcdcVar == null ? 0 : dcdcVar.hashCode())) * 1000003;
        amte amteVar = this.f;
        if (amteVar != null) {
            i = amteVar.hashCode();
        }
        return ((((((hashCode3 ^ i) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ this.h) * 1000003) ^ this.i;
    }

    @Override // defpackage.xbv
    public final int i() {
        return this.i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String str = this.c;
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        boolean z = this.g;
        int i = this.h;
        int i2 = this.i;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(str).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 213 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("StartConnectionBoardParams{source=");
        sb.append(valueOf);
        sb.append(", destination=");
        sb.append(valueOf2);
        sb.append(", savedTripId=");
        sb.append(str);
        sb.append(", routeToken=");
        sb.append(valueOf3);
        sb.append(", summary=");
        sb.append(valueOf4);
        sb.append(", directionsStorageItem=");
        sb.append(valueOf5);
        sb.append(", anchorDeparturesToPassedInDirections=");
        sb.append(z);
        sb.append(", tripIndex=");
        sb.append(i);
        sb.append(", initialTransitLegIndex=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: craj  reason: default package */
/* loaded from: classes5.dex */
public final class craj extends crav {
    public final long a;
    public final dqvj b;
    public final dcdc<crar> c;
    public final dcdc<crat> d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final String i;
    public final cral j;
    public final cral k;
    private final doud l;
    private final int m;

    public craj(long j, dqvj dqvjVar, doud doudVar, int i, dcdc<crar> dcdcVar, dcdc<crat> dcdcVar2, boolean z, boolean z2, boolean z3, int i2, String str, cral cralVar, @dzsi cral cralVar2) {
        this.a = j;
        this.b = dqvjVar;
        this.l = doudVar;
        this.m = i;
        this.c = dcdcVar;
        this.d = dcdcVar2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = i2;
        this.i = str;
        this.j = cralVar;
        this.k = cralVar2;
    }

    @Override // defpackage.crav
    public final long a() {
        return this.a;
    }

    @Override // defpackage.crav
    public final dqvj b() {
        return this.b;
    }

    @Override // defpackage.crav
    public final doud c() {
        return this.l;
    }

    @Override // defpackage.crav
    public final int d() {
        return this.m;
    }

    @Override // defpackage.crav
    public final dcdc<crar> e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        cral cralVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof crav) {
            crav cravVar = (crav) obj;
            if (this.a == cravVar.a() && this.b.equals(cravVar.b()) && this.l.equals(cravVar.c()) && this.m == cravVar.d() && dchl.m(this.c, cravVar.e()) && dchl.m(this.d, cravVar.f()) && this.e == cravVar.g() && this.f == cravVar.h() && this.g == cravVar.i() && this.h == cravVar.j() && this.i.equals(cravVar.k()) && this.j.equals(cravVar.l()) && ((cralVar = this.k) != null ? cralVar.equals(cravVar.m()) : cravVar.m() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.crav
    public final dcdc<crat> f() {
        return this.d;
    }

    @Override // defpackage.crav
    public final boolean g() {
        return this.e;
    }

    @Override // defpackage.crav
    public final boolean h() {
        return this.f;
    }

    public final int hashCode() {
        long j = this.a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        doud doudVar = this.l;
        int i = doudVar.bC;
        if (i == 0) {
            i = dsst.a.b(doudVar).c(doudVar);
            doudVar.bC = i;
        }
        int hashCode2 = (((((((hashCode ^ i) * 1000003) ^ this.m) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i2 = 1237;
        int i3 = (((hashCode2 ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003;
        if (true == this.g) {
            i2 = 1231;
        }
        int hashCode3 = (((((((i3 ^ i2) * 1000003) ^ this.h) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        cral cralVar = this.k;
        return (cralVar == null ? 0 : cralVar.hashCode()) ^ hashCode3;
    }

    @Override // defpackage.crav
    public final boolean i() {
        return this.g;
    }

    @Override // defpackage.crav
    public final int j() {
        return this.h;
    }

    @Override // defpackage.crav
    public final String k() {
        return this.i;
    }

    @Override // defpackage.crav
    public final cral l() {
        return this.j;
    }

    @Override // defpackage.crav
    @dzsi
    public final cral m() {
        return this.k;
    }

    public final String toString() {
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.l);
        int i = this.m;
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        boolean z = this.e;
        boolean z2 = this.f;
        boolean z3 = this.g;
        int i2 = this.h;
        String str = this.i;
        String valueOf5 = String.valueOf(this.j);
        String valueOf6 = String.valueOf(this.k);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 294 + length2 + length3 + length4 + length5 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("Trip{id=");
        sb.append(j);
        sb.append(", travelMode=");
        sb.append(valueOf);
        sb.append(", compactPolyline=");
        sb.append(valueOf2);
        sb.append(", simplificationWorldUnits=");
        sb.append(i);
        sb.append(", steps=");
        sb.append(valueOf3);
        sb.append(", stepGuidances=");
        sb.append(valueOf4);
        sb.append(", isRoadVehicleRoute=");
        sb.append(z);
        sb.append(", isInitialRequest=");
        sb.append(z2);
        sb.append(", hasUncertainFromPoint=");
        sb.append(z3);
        sb.append(", distanceToNextDestinationMeters=");
        sb.append(i2);
        sb.append(", tripSummary=");
        sb.append(str);
        sb.append(", firstWaypoint=");
        sb.append(valueOf5);
        sb.append(", nextDestination=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}

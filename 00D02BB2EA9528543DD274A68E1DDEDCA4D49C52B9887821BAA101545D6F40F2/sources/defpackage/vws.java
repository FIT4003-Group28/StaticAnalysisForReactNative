package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: vws  reason: default package */
/* loaded from: classes7.dex */
public final class vws extends vxu {
    public final dpgw a;
    public final List<doyp> b;
    public final dpbw c;
    public final boolean d;
    public final dgas e;
    private final doyp f;
    private final List<doyp> g;

    public vws(dpgw dpgwVar, @dzsi doyp doypVar, List<doyp> list, List<doyp> list2, dpbw dpbwVar, boolean z, @dzsi dgas dgasVar) {
        if (dpgwVar != null) {
            this.a = dpgwVar;
            this.f = doypVar;
            if (list != null) {
                this.g = list;
                if (list2 != null) {
                    this.b = list2;
                    this.c = dpbwVar;
                    this.d = z;
                    this.e = dgasVar;
                    return;
                }
                throw new NullPointerException("Null displayedDepartures");
            }
            throw new NullPointerException("Null nextDepartures");
        }
        throw new NullPointerException("Null departureStop");
    }

    @Override // defpackage.vxu
    public final dpgw a() {
        return this.a;
    }

    @Override // defpackage.vxu
    @dzsi
    public final doyp b() {
        return this.f;
    }

    @Override // defpackage.vxu
    public final List<doyp> c() {
        return this.g;
    }

    @Override // defpackage.vxu
    public final List<doyp> d() {
        return this.b;
    }

    @Override // defpackage.vxu
    public final dpbw e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        doyp doypVar;
        dgas dgasVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof vxu) {
            vxu vxuVar = (vxu) obj;
            if (this.a.equals(vxuVar.a()) && ((doypVar = this.f) != null ? doypVar.equals(vxuVar.b()) : vxuVar.b() == null) && this.g.equals(vxuVar.c()) && this.b.equals(vxuVar.d()) && this.c.equals(vxuVar.e()) && this.d == vxuVar.f() && ((dgasVar = this.e) != null ? dgasVar.equals(vxuVar.g()) : vxuVar.g() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.vxu
    public final boolean f() {
        return this.d;
    }

    @Override // defpackage.vxu
    @dzsi
    public final dgas g() {
        return this.e;
    }

    public final int hashCode() {
        int i;
        dpgw dpgwVar = this.a;
        int i2 = dpgwVar.bC;
        if (i2 == 0) {
            i2 = dsst.a.b(dpgwVar).c(dpgwVar);
            dpgwVar.bC = i2;
        }
        int i3 = (i2 ^ 1000003) * 1000003;
        doyp doypVar = this.f;
        int i4 = 0;
        if (doypVar == null) {
            i = 0;
        } else {
            i = doypVar.bC;
            if (i == 0) {
                i = dsst.a.b(doypVar).c(doypVar);
                doypVar.bC = i;
            }
        }
        int hashCode = (((((((((i3 ^ i) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003;
        dgas dgasVar = this.e;
        if (dgasVar != null && (i4 = dgasVar.bC) == 0) {
            i4 = dsst.a.b(dgasVar).c(dgasVar);
            dgasVar.bC = i4;
        }
        return hashCode ^ i4;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.f);
        String valueOf3 = String.valueOf(this.g);
        String valueOf4 = String.valueOf(this.b);
        String valueOf5 = String.valueOf(this.c);
        boolean z = this.d;
        String valueOf6 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 152 + length2 + length3 + length4 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("TransitDepartureData{departureStop=");
        sb.append(valueOf);
        sb.append(", recommendedDeparture=");
        sb.append(valueOf2);
        sb.append(", nextDepartures=");
        sb.append(valueOf3);
        sb.append(", displayedDepartures=");
        sb.append(valueOf4);
        sb.append(", realtimeStatus=");
        sb.append(valueOf5);
        sb.append(", hadRealtimeData=");
        sb.append(z);
        sb.append(", periodicity=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}

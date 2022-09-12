package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: shm  reason: default package */
/* loaded from: classes7.dex */
public final class shm extends shr {
    private final dspd a;
    private final dcdc<amvh> b;
    private final eaph c;
    private final int d;

    public shm(int i, dspd dspdVar, dcdc<amvh> dcdcVar, eaph eaphVar) {
        this.d = i;
        if (dspdVar != null) {
            this.a = dspdVar;
            if (dcdcVar != null) {
                this.b = dcdcVar;
                this.c = eaphVar;
                return;
            }
            throw new NullPointerException("Null waypoints");
        }
        throw new NullPointerException("Null routeToken");
    }

    @Override // defpackage.shr
    public final dspd a() {
        return this.a;
    }

    @Override // defpackage.shr
    public final dcdc<amvh> b() {
        return this.b;
    }

    @Override // defpackage.shr
    public final eaph c() {
        return this.c;
    }

    @Override // defpackage.shr
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof shr) {
            shr shrVar = (shr) obj;
            if (this.d == shrVar.d() && this.a.equals(shrVar.a()) && dchl.m(this.b, shrVar.b()) && this.c.equals(shrVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.d ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String a = qjo.a(this.d);
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = a.length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 82 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("TransitCommuteRoute{routeDirection=");
        sb.append(a);
        sb.append(", routeToken=");
        sb.append(valueOf);
        sb.append(", waypoints=");
        sb.append(valueOf2);
        sb.append(", typicalCommuteTime=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}

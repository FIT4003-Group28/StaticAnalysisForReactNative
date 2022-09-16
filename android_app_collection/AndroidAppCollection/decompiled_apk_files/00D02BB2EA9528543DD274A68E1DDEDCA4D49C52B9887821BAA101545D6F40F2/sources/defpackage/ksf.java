package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ksf  reason: default package */
/* loaded from: classes7.dex */
public final class ksf extends ksp {
    private final dcdc<amvh> a;
    private final dcdc<amvf> b;

    public ksf(dcdc<amvh> dcdcVar, dcdc<amvf> dcdcVar2) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            if (dcdcVar2 != null) {
                this.b = dcdcVar2;
                return;
            }
            throw new NullPointerException("Null viapoints");
        }
        throw new NullPointerException("Null waypoints");
    }

    @Override // defpackage.ksp, defpackage.ksq
    public final dcdc<amvf> b() {
        return this.b;
    }

    @Override // defpackage.ksp, defpackage.ksq
    public final dcdc<amvh> e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ksp) {
            ksp kspVar = (ksp) obj;
            if (dchl.m(this.a, kspVar.e()) && dchl.m(this.b, kspVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48 + String.valueOf(valueOf2).length());
        sb.append("MultiWaypointPrefetchKey{waypoints=");
        sb.append(valueOf);
        sb.append(", viapoints=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

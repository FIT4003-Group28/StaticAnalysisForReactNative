package defpackage;
/* compiled from: PG */
/* renamed from: xkq  reason: default package */
/* loaded from: classes7.dex */
final class xkq extends xky {
    private final akqq a;
    private final long b;
    private final long c;
    private final dbsg<Float> d;
    private final dbsg<Integer> e;

    public xkq(akqq akqqVar, long j, long j2, dbsg<Float> dbsgVar, dbsg<Integer> dbsgVar2) {
        this.a = akqqVar;
        this.b = j;
        this.c = j2;
        this.d = dbsgVar;
        this.e = dbsgVar2;
    }

    @Override // defpackage.xky
    public final akqq a() {
        return this.a;
    }

    @Override // defpackage.xky
    public final long b() {
        return this.b;
    }

    @Override // defpackage.xky
    public final long c() {
        return this.c;
    }

    @Override // defpackage.xky
    public final dbsg<Float> d() {
        return this.d;
    }

    @Override // defpackage.xky
    public final dbsg<Integer> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xky) {
            xky xkyVar = (xky) obj;
            if (this.a.equals(xkyVar.a()) && this.b == xkyVar.b() && this.c == xkyVar.c() && this.d.equals(xkyVar.d()) && this.e.equals(xkyVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        long j2 = this.c;
        return ((((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        long j2 = this.c;
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 142 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("TransitVehicleAnimationState{latLng=");
        sb.append(valueOf);
        sb.append(", timestampMs=");
        sb.append(j);
        sb.append(", dataUpdateTimestampSec=");
        sb.append(j2);
        sb.append(", bearing=");
        sb.append(valueOf2);
        sb.append(", polylineIndex=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: rbz  reason: default package */
/* loaded from: classes7.dex */
final class rbz extends rca {
    private final amvh a;
    private final dcdc<amvh> b;
    private final dqvj c;
    private final bvrt<dwao> d;
    private final long e;
    private final amte f;
    private final dqek g;

    public rbz(@dzsi amvh amvhVar, dcdc<amvh> dcdcVar, dqvj dqvjVar, bvrt<dwao> bvrtVar, long j, @dzsi amte amteVar, @dzsi dqek dqekVar) {
        this.a = amvhVar;
        if (dcdcVar != null) {
            this.b = dcdcVar;
            if (dqvjVar != null) {
                this.c = dqvjVar;
                this.d = bvrtVar;
                this.e = j;
                this.f = amteVar;
                this.g = dqekVar;
                return;
            }
            throw new NullPointerException("Null travelMode");
        }
        throw new NullPointerException("Null destinations");
    }

    @Override // defpackage.rca
    @dzsi
    public final amvh a() {
        return this.a;
    }

    @Override // defpackage.rca
    public final dcdc<amvh> b() {
        return this.b;
    }

    @Override // defpackage.rca
    public final dqvj c() {
        return this.c;
    }

    @Override // defpackage.rca
    public final bvrt<dwao> d() {
        return this.d;
    }

    @Override // defpackage.rca
    public final long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        amte amteVar;
        dqek dqekVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof rca) {
            rca rcaVar = (rca) obj;
            amvh amvhVar = this.a;
            if (amvhVar != null ? amvhVar.equals(rcaVar.a()) : rcaVar.a() == null) {
                if (dchl.m(this.b, rcaVar.b()) && this.c.equals(rcaVar.c()) && this.d.equals(rcaVar.d()) && this.e == rcaVar.e() && ((amteVar = this.f) != null ? amteVar.equals(rcaVar.f()) : rcaVar.f() == null) && ((dqekVar = this.g) != null ? dqekVar.equals(rcaVar.g()) : rcaVar.g() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.rca
    @dzsi
    public final amte f() {
        return this.f;
    }

    @Override // defpackage.rca
    @dzsi
    public final dqek g() {
        return this.g;
    }

    public final int hashCode() {
        amvh amvhVar = this.a;
        int i = 0;
        int hashCode = amvhVar == null ? 0 : amvhVar.hashCode();
        int hashCode2 = this.b.hashCode();
        int hashCode3 = this.c.hashCode();
        int hashCode4 = this.d.hashCode();
        long j = this.e;
        int i2 = (((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        amte amteVar = this.f;
        int hashCode5 = (i2 ^ (amteVar == null ? 0 : amteVar.hashCode())) * 1000003;
        dqek dqekVar = this.g;
        if (dqekVar != null) {
            i = dqekVar.hashCode();
        }
        return hashCode5 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        long j = this.e;
        String valueOf5 = String.valueOf(this.f);
        String valueOf6 = String.valueOf(this.g);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 188 + length2 + length3 + length4 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("CommuteImmersiveConstructionParams{startPoint=");
        sb.append(valueOf);
        sb.append(", destinations=");
        sb.append(valueOf2);
        sb.append(", travelMode=");
        sb.append(valueOf3);
        sb.append(", serializableDirectionsOptions=");
        sb.append(valueOf4);
        sb.append(", creationTimeMs=");
        sb.append(j);
        sb.append(", directionsStorageItem=");
        sb.append(valueOf5);
        sb.append(", justificationType=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}

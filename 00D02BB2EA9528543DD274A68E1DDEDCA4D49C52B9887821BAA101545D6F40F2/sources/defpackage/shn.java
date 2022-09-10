package defpackage;
/* compiled from: PG */
/* renamed from: shn  reason: default package */
/* loaded from: classes7.dex */
public final class shn extends sie {
    public final amvh a;
    public final amvh b;

    public shn(@dzsi amvh amvhVar, @dzsi amvh amvhVar2) {
        this.a = amvhVar;
        this.b = amvhVar2;
    }

    @Override // defpackage.sie
    @dzsi
    public final amvh a() {
        return this.a;
    }

    @Override // defpackage.sie
    @dzsi
    public final amvh b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sie) {
            sie sieVar = (sie) obj;
            amvh amvhVar = this.a;
            if (amvhVar != null ? amvhVar.equals(sieVar.a()) : sieVar.a() == null) {
                amvh amvhVar2 = this.b;
                if (amvhVar2 != null ? amvhVar2.equals(sieVar.b()) : sieVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        amvh amvhVar = this.a;
        int i = 0;
        int hashCode = ((amvhVar == null ? 0 : amvhVar.hashCode()) ^ 1000003) * 1000003;
        amvh amvhVar2 = this.b;
        if (amvhVar2 != null) {
            i = amvhVar2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31 + String.valueOf(valueOf2).length());
        sb.append("HomeWorkWaypoints{home=");
        sb.append(valueOf);
        sb.append(", work=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: asbx  reason: default package */
/* loaded from: classes2.dex */
final class asbx extends asbz {
    private final dqvj a;
    private final List<amvh> b;
    private final boolean c;

    public asbx(dqvj dqvjVar, List<amvh> list, boolean z) {
        this.a = dqvjVar;
        this.b = list;
        this.c = z;
    }

    @Override // defpackage.asbz
    public final dqvj a() {
        return this.a;
    }

    @Override // defpackage.asbz
    public final List<amvh> b() {
        return this.b;
    }

    @Override // defpackage.asbz
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof asbz) {
            asbz asbzVar = (asbz) obj;
            if (this.a.equals(asbzVar.a()) && this.b.equals(asbzVar.b()) && this.c == asbzVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 92 + String.valueOf(valueOf2).length());
        sb.append("FreeNavStorageItem{travelMode=");
        sb.append(valueOf);
        sb.append(", fakeImplicitDestinations=");
        sb.append(valueOf2);
        sb.append(", exitOnArrivalAtDestination=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

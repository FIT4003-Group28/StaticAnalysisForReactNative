package defpackage;
/* compiled from: PG */
/* renamed from: aies  reason: default package */
/* loaded from: classes2.dex */
public final class aies extends aifw {
    private final amub a;
    private final boolean b;
    private final long c;
    private final boolean d;

    public aies(amub amubVar, boolean z, long j, boolean z2) {
        this.a = amubVar;
        this.b = z;
        this.c = j;
        this.d = z2;
    }

    @Override // defpackage.aifw
    public final amub a() {
        return this.a;
    }

    @Override // defpackage.aifw
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.aifw
    public final long c() {
        return this.c;
    }

    @Override // defpackage.aifw
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aifw) {
            aifw aifwVar = (aifw) obj;
            if (this.a.equals(aifwVar.a()) && this.b == aifwVar.b() && this.c == aifwVar.c() && this.d == aifwVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        int i = 1237;
        int i2 = true != this.b ? 1237 : 1231;
        long j = this.c;
        int i3 = (((hashCode ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        if (true == this.d) {
            i = 1231;
        }
        return i3 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        long j = this.c;
        boolean z2 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 137);
        sb.append("RouteState{routeDescription=");
        sb.append(valueOf);
        sb.append(", showEtaOnRoute=");
        sb.append(z);
        sb.append(", expectedArrivalTimeSecOverride=");
        sb.append(j);
        sb.append(", useRouteOverviewConfigSet=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}

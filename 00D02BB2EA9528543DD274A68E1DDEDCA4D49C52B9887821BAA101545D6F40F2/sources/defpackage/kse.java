package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kse  reason: default package */
/* loaded from: classes7.dex */
public final class kse extends ksl {
    private final ldm a;
    private final ksu b;
    private final dwao c;
    private final long d;

    public kse(ldm ldmVar, @dzsi ksu ksuVar, @dzsi dwao dwaoVar, long j) {
        if (ldmVar != null) {
            this.a = ldmVar;
            this.b = ksuVar;
            this.c = dwaoVar;
            this.d = j;
            return;
        }
        throw new NullPointerException("Null waypointInfo");
    }

    @Override // defpackage.ksl
    public final ldm a() {
        return this.a;
    }

    @Override // defpackage.ksl
    @dzsi
    public final ksu b() {
        return this.b;
    }

    @Override // defpackage.ksl
    @dzsi
    public final ksj c() {
        return null;
    }

    @Override // defpackage.ksl
    @dzsi
    public final dwao d() {
        return this.c;
    }

    @Override // defpackage.ksl
    public final long e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        ksu ksuVar;
        dwao dwaoVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ksl) {
            ksl kslVar = (ksl) obj;
            if (this.a.equals(kslVar.a()) && ((ksuVar = this.b) != null ? ksuVar.equals(kslVar.b()) : kslVar.b() == null) && kslVar.c() == null && ((dwaoVar = this.c) != null ? dwaoVar.equals(kslVar.d()) : kslVar.d() == null) && this.d == kslVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        ksu ksuVar = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (ksuVar == null ? 0 : ksuVar.hashCode())) * (-721379959);
        dwao dwaoVar = this.c;
        if (dwaoVar != null && (i = dwaoVar.bC) == 0) {
            i = dsst.a.b(dwaoVar).c(dwaoVar);
            dwaoVar.bC = i;
        }
        long j = this.d;
        return ((hashCode2 ^ i) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        long j = this.d;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 154 + length2 + "null".length() + String.valueOf(valueOf3).length());
        sb.append("DirectionsFetchData{waypointInfo=");
        sb.append(valueOf);
        sb.append(", onFetchedCallback=");
        sb.append(valueOf2);
        sb.append(", onDaisyChainFetchCompleteCallback=");
        sb.append("null");
        sb.append(", directionsOptions=");
        sb.append(valueOf3);
        sb.append(", createdRelativeTimeMs=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}

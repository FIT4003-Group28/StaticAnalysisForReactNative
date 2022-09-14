package defpackage;
/* compiled from: PG */
/* renamed from: brsb  reason: default package */
/* loaded from: classes4.dex */
final class brsb extends brrv {
    private final dbsg<bnhz> a;
    private final Runnable b;

    public brsb(dbsg<bnhz> dbsgVar, Runnable runnable) {
        this.a = dbsgVar;
        this.b = runnable;
    }

    @Override // defpackage.brrv
    public final dbsg<bnhz> a() {
        return this.a;
    }

    @Override // defpackage.brrv
    public final Runnable b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof brrv) {
            brrv brrvVar = (brrv) obj;
            if (this.a.equals(brrvVar.a()) && this.b.equals(brrvVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50 + String.valueOf(valueOf2).length());
        sb.append("Extras{distanceViewModel=");
        sb.append(valueOf);
        sb.append(", placeCardClickHandler=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

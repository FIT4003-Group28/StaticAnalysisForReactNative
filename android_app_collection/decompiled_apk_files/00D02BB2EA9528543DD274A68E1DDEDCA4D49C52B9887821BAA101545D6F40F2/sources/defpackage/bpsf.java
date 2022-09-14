package defpackage;
/* compiled from: PG */
/* renamed from: bpsf  reason: default package */
/* loaded from: classes4.dex */
final class bpsf extends bpsp {
    private final dbsg<alad> a;
    private final dbsg<Boolean> b;

    public bpsf(dbsg<alad> dbsgVar, dbsg<Boolean> dbsgVar2) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
    }

    @Override // defpackage.bpsp
    public final dbsg<alad> a() {
        return this.a;
    }

    @Override // defpackage.bpsp
    public final dbsg<Boolean> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bpsp) {
            bpsp bpspVar = (bpsp) obj;
            if (this.a.equals(bpspVar.a()) && this.b.equals(bpspVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41 + String.valueOf(valueOf2).length());
        sb.append("State{cameraPosition=");
        sb.append(valueOf);
        sb.append(", satelliteEnabled=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

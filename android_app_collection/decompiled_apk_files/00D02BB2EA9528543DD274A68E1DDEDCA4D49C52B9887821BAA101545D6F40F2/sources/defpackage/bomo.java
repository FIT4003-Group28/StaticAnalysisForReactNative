package defpackage;
/* compiled from: PG */
/* renamed from: bomo  reason: default package */
/* loaded from: classes3.dex */
public final class bomo extends bomv {
    private final akqq a;
    private final bomn b;

    public bomo(akqq akqqVar, @dzsi bomn bomnVar) {
        this.a = akqqVar;
        this.b = bomnVar;
    }

    @Override // defpackage.bomv
    public final akqq a() {
        return this.a;
    }

    @Override // defpackage.bomv
    @dzsi
    public final bomn b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        bomn bomnVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bomv) {
            bomv bomvVar = (bomv) obj;
            if (this.a.equals(bomvVar.a()) && ((bomnVar = this.b) != null ? bomnVar.equals(bomvVar.b()) : bomvVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        bomn bomnVar = this.b;
        return hashCode ^ (bomnVar == null ? 0 : bomnVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45 + String.valueOf(valueOf2).length());
        sb.append("PlacePickerResult{latLng=");
        sb.append(valueOf);
        sb.append(", addressFieldInfo=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

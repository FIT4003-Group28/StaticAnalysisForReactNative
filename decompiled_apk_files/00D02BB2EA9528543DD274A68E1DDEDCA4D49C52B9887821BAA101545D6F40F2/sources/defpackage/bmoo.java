package defpackage;
/* compiled from: PG */
/* renamed from: bmoo  reason: default package */
/* loaded from: classes3.dex */
final class bmoo extends bmpf {
    private final dbsg<dmkd> a;
    private final dbsg<bmno> b;

    public bmoo(dbsg<dmkd> dbsgVar, dbsg<bmno> dbsgVar2) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
    }

    @Override // defpackage.bmpf
    public final dbsg<dmkd> a() {
        return this.a;
    }

    @Override // defpackage.bmpf
    public final dbsg<bmno> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bmpf) {
            bmpf bmpfVar = (bmpf) obj;
            if (this.a.equals(bmpfVar.a()) && this.b.equals(bmpfVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47 + String.valueOf(valueOf2).length());
        sb.append("Binding{locationSignalDetector=");
        sb.append(valueOf);
        sb.append(", bindingError=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: bmnf  reason: default package */
/* loaded from: classes3.dex */
public final class bmnf extends bmny {
    private final dbsg<dehn<bmnp>> a;
    private final dbsg<bmnx> b;

    public bmnf(dbsg<dehn<bmnp>> dbsgVar, dbsg<bmnx> dbsgVar2) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
    }

    @Override // defpackage.bmny
    public final dbsg<dehn<bmnp>> a() {
        return this.a;
    }

    @Override // defpackage.bmny
    public final dbsg<bmnx> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bmny) {
            bmny bmnyVar = (bmny) obj;
            if (this.a.equals(bmnyVar.a()) && this.b.equals(bmnyVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 68 + String.valueOf(valueOf2).length());
        sb.append("LocationSettingsStatus{bindingStatusFuture=");
        sb.append(valueOf);
        sb.append(", locationSettingsError=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bmsa  reason: default package */
/* loaded from: classes3.dex */
public final class bmsa extends bmsl {
    private final dbsg<bmsk> a;
    private final dbsg<dnwb> b;

    public bmsa(dbsg<bmsk> dbsgVar, dbsg<dnwb> dbsgVar2) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
    }

    @Override // defpackage.bmsl
    public final dbsg<bmsk> a() {
        return this.a;
    }

    @Override // defpackage.bmsl
    public final dbsg<dnwb> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bmsl) {
            bmsl bmslVar = (bmsl) obj;
            if (this.a.equals(bmslVar.a()) && this.b.equals(bmslVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42 + String.valueOf(valueOf2).length());
        sb.append("CorrectionStatus{error=");
        sb.append(valueOf);
        sb.append(", persistenceKeys=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

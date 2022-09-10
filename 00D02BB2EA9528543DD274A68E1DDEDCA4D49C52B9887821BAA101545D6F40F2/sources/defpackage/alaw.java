package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alaw  reason: default package */
/* loaded from: classes2.dex */
public final class alaw extends albe {
    public final boolean a;
    public final dbsg<akvo<aktj<?, ?>>> b;

    public alaw(boolean z, dbsg<akvo<aktj<?, ?>>> dbsgVar) {
        this.a = z;
        this.b = dbsgVar;
    }

    @Override // defpackage.albe
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.albe
    public final dbsg<akvo<aktj<?, ?>>> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof albe) {
            albe albeVar = (albe) obj;
            if (this.a == albeVar.a() && this.b.equals(albeVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 63);
        sb.append("PickBehavior{useGoogleMapPickHandler=");
        sb.append(z);
        sb.append(", clientPickHandler=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

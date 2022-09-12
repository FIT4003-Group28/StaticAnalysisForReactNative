package defpackage;
/* compiled from: PG */
/* renamed from: cydk  reason: default package */
/* loaded from: classes5.dex */
final class cydk extends cygg {
    private final String a;
    private final cygf b;

    public cydk(String str, cygf cygfVar) {
        this.a = str;
        this.b = cygfVar;
    }

    @Override // defpackage.cygg
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cygg
    public final cygf b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cygg) {
            cygg cyggVar = (cygg) obj;
            if (this.a.equals(cyggVar.a()) && this.b.equals(cyggVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(valueOf).length());
        sb.append("PersonId{id=");
        sb.append(str);
        sb.append(", type=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

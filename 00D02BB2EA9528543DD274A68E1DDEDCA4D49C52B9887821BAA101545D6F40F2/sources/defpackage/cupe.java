package defpackage;
/* compiled from: PG */
/* renamed from: cupe  reason: default package */
/* loaded from: classes5.dex */
final class cupe extends cuqf {
    private final String b;
    private final cuqd c;

    public cupe(String str, cuqd cuqdVar) {
        this.b = str;
        this.c = cuqdVar;
    }

    @Override // defpackage.cuqf
    public final String a() {
        return this.b;
    }

    @Override // defpackage.cuqf
    public final cuqd b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cuqf) {
            cuqf cuqfVar = (cuqf) obj;
            if (this.b.equals(cuqfVar.a()) && this.c.equals(cuqfVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(valueOf).length());
        sb.append("StandaloneCard{jsonSource=");
        sb.append(str);
        sb.append(", stackCard=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

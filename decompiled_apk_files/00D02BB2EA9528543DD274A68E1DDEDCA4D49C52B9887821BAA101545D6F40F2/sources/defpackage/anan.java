package defpackage;
/* compiled from: PG */
/* renamed from: anan  reason: default package */
/* loaded from: classes2.dex */
final class anan extends anap {
    public final ddho a;
    public final ddho b;

    public anan(ddho ddhoVar, ddho ddhoVar2) {
        this.a = ddhoVar;
        if (ddhoVar2 != null) {
            this.b = ddhoVar2;
            return;
        }
        throw new NullPointerException("Null secondary");
    }

    @Override // defpackage.anap
    public final ddho a() {
        return this.a;
    }

    @Override // defpackage.anap
    public final ddho b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anap) {
            anap anapVar = (anap) obj;
            if (this.a.equals(anapVar.a()) && this.b.equals(anapVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34 + String.valueOf(valueOf2).length());
        sb.append("LabelVeTypes{primary=");
        sb.append(valueOf);
        sb.append(", secondary=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

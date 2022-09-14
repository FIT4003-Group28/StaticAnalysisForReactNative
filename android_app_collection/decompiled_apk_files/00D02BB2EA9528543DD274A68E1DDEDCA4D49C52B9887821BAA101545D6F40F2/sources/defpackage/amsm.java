package defpackage;
/* compiled from: PG */
/* renamed from: amsm  reason: default package */
/* loaded from: classes2.dex */
public final class amsm extends amuf {
    public final amuq a;
    public final amuq b;

    public amsm(amuq amuqVar, amuq amuqVar2) {
        this.a = amuqVar;
        this.b = amuqVar2;
    }

    @Override // defpackage.amuf
    public final amuq a() {
        return this.a;
    }

    @Override // defpackage.amuf
    public final amuq b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amuf) {
            amuf amufVar = (amuf) obj;
            if (this.a.equals(amufVar.a()) && this.b.equals(amufVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20 + String.valueOf(valueOf2).length());
        sb.append("Transfer{from=");
        sb.append(valueOf);
        sb.append(", to=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

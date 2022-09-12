package defpackage;
/* compiled from: PG */
/* renamed from: bqlk  reason: default package */
/* loaded from: classes4.dex */
final class bqlk extends bqmi {
    private final bqla a;
    private final bqlb b;

    public bqlk(bqla bqlaVar, bqlb bqlbVar) {
        this.a = bqlaVar;
        this.b = bqlbVar;
    }

    @Override // defpackage.bqmi
    public final bqla a() {
        return this.a;
    }

    @Override // defpackage.bqmi
    public final bqlb b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqmi) {
            bqmi bqmiVar = (bqmi) obj;
            if (this.a.equals(bqmiVar.a()) && this.b.equals(bqmiVar.b())) {
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
        sb.append("Request{reviewRequest=");
        sb.append(valueOf);
        sb.append(", callback=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

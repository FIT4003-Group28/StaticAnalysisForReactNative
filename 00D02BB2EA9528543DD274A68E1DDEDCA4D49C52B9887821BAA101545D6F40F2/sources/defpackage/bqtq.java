package defpackage;
/* compiled from: PG */
/* renamed from: bqtq  reason: default package */
/* loaded from: classes4.dex */
final class bqtq extends bqvz {
    private final bqla a;
    private final bwrs<ilo> b;
    private final bqlb c;

    public bqtq(bqla bqlaVar, bwrs<ilo> bwrsVar, bqlb bqlbVar) {
        this.a = bqlaVar;
        this.b = bwrsVar;
        this.c = bqlbVar;
    }

    @Override // defpackage.bqvz
    public final bqla a() {
        return this.a;
    }

    @Override // defpackage.bqvz
    public final bwrs<ilo> b() {
        return this.b;
    }

    @Override // defpackage.bqvz
    public final bqlb c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqvz) {
            bqvz bqvzVar = (bqvz) obj;
            if (this.a.equals(bqvzVar.a()) && this.b.equals(bqvzVar.b()) && this.c.equals(bqvzVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 49 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("Request{reviewRequest=");
        sb.append(valueOf);
        sb.append(", placemarkRef=");
        sb.append(valueOf2);
        sb.append(", callback=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}

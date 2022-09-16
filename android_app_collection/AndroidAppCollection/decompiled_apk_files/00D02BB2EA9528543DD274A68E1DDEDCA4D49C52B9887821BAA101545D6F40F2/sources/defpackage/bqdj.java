package defpackage;
/* compiled from: PG */
/* renamed from: bqdj  reason: default package */
/* loaded from: classes4.dex */
final class bqdj extends bqdm {
    private final akra a;
    private final dbsg<Long> b;

    public bqdj(akra akraVar, dbsg<Long> dbsgVar) {
        this.a = akraVar;
        this.b = dbsgVar;
    }

    @Override // defpackage.bqdm
    public final akra a() {
        return this.a;
    }

    @Override // defpackage.bqdm
    public final dbsg<Long> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqdm) {
            bqdm bqdmVar = (bqdm) obj;
            if (this.a.equals(bqdmVar.a()) && this.b.equals(bqdmVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38 + String.valueOf(valueOf2).length());
        sb.append("SnappableIntersection{point=");
        sb.append(valueOf);
        sb.append(", fprint=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

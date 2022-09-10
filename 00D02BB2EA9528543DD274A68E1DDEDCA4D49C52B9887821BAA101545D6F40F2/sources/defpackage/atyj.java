package defpackage;
/* compiled from: PG */
/* renamed from: atyj  reason: default package */
/* loaded from: classes2.dex */
final class atyj extends atyh {
    public final aste a;
    public final bvqg<dnqg> b;
    public final atzb c;

    public atyj(aste asteVar, @dzsi bvqg<dnqg> bvqgVar, atzb atzbVar) {
        if (asteVar != null) {
            this.a = asteVar;
            this.b = bvqgVar;
            if (atzbVar != null) {
                this.c = atzbVar;
                return;
            }
            throw new NullPointerException("Null resultsListener");
        }
        throw new NullPointerException("Null searchQuery");
    }

    @Override // defpackage.atyh
    public final aste a() {
        return this.a;
    }

    @Override // defpackage.atyh
    @dzsi
    public final bvqg<dnqg> b() {
        return this.b;
    }

    @Override // defpackage.atyh
    public final atzb c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        bvqg<dnqg> bvqgVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof atyh) {
            atyh atyhVar = (atyh) obj;
            if (this.a.equals(atyhVar.a()) && ((bvqgVar = this.b) != null ? bvqgVar.equals(atyhVar.b()) : atyhVar.b() == null) && this.c.equals(atyhVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        bvqg<dnqg> bvqgVar = this.b;
        return ((hashCode ^ (bvqgVar == null ? 0 : bvqgVar.hashCode())) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 73 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("Search{searchQuery=");
        sb.append(valueOf);
        sb.append(", loggingParamsClickTrackingSetter=");
        sb.append(valueOf2);
        sb.append(", resultsListener=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}

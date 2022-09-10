package defpackage;
/* compiled from: PG */
/* renamed from: chob  reason: default package */
/* loaded from: classes4.dex */
final class chob extends chnx {
    private final Long a;
    private final chty b;
    private final chvi c;

    public chob(Long l, chty chtyVar, chvi chviVar) {
        this.a = l;
        this.b = chtyVar;
        this.c = chviVar;
    }

    @Override // defpackage.chnx
    public final Long a() {
        return this.a;
    }

    @Override // defpackage.chnx
    public final chty b() {
        return this.b;
    }

    @Override // defpackage.chnx
    public final chvi c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof chnx) {
            chnx chnxVar = (chnx) obj;
            if (this.a.equals(chnxVar.a()) && this.b.equals(chnxVar.b()) && this.c.equals(chnxVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        chty chtyVar = this.b;
        int i = chtyVar.bC;
        if (i == 0) {
            i = dsst.a.b(chtyVar).c(chtyVar);
            chtyVar.bC = i;
        }
        int i2 = (hashCode ^ i) * 1000003;
        chvi chviVar = this.c;
        int i3 = chviVar.bC;
        if (i3 == 0) {
            i3 = dsst.a.b(chviVar).c(chviVar);
            chviVar.bC = i3;
        }
        return i2 ^ i3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 45 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("UiState{durationMs=");
        sb.append(valueOf);
        sb.append(", banner=");
        sb.append(valueOf2);
        sb.append(", pointsCounter=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}

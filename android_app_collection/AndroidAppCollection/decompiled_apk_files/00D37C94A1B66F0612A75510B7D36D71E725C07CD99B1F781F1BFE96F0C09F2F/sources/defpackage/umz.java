package defpackage;
/* compiled from: PG */
/* renamed from: umz  reason: default package */
/* loaded from: classes4.dex */
public final class umz {
    public final uoc a;
    public final uoe b;
    public final ampq c;

    public umz() {
    }

    public umz(uoc uocVar, uoe uoeVar, ampq ampqVar) {
        this.a = uocVar;
        this.b = uoeVar;
        this.c = ampqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof umz) {
            umz umzVar = (umz) obj;
            if (this.a.equals(umzVar.a) && this.b.equals(umzVar.b) && this.c.equals(umzVar.c)) {
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
        StringBuilder sb = new StringBuilder(length + 84 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ExpressSignInConfiguration{expressSignInManager=");
        sb.append(valueOf);
        sb.append(", expressSignInSpec=");
        sb.append(valueOf2);
        sb.append(", modelUpdater=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}

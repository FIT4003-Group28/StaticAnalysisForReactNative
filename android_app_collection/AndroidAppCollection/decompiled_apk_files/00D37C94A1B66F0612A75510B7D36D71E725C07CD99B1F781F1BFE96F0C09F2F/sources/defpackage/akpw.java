package defpackage;
/* compiled from: PG */
/* renamed from: akpw  reason: default package */
/* loaded from: classes.dex */
public final class akpw {
    public final atnw a;
    public final int b;

    public akpw() {
    }

    public akpw(atnw atnwVar, int i) {
        this.a = atnwVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akpw) {
            akpw akpwVar = (akpw) obj;
            if (this.a.equals(akpwVar.a)) {
                int i = this.b;
                int i2 = akpwVar.b;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        int i = this.b;
        if (i != 0) {
            return hashCode ^ i;
        }
        throw null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        String str = i != 1 ? i != 2 ? i != 3 ? "null" : "WIFI" : "CELLULAR" : "OTHER";
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 70 + str.length());
        sb.append("AdaptiveSignalsResult{effectiveConnectionType=");
        sb.append(valueOf);
        sb.append(", networkTransportType=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}

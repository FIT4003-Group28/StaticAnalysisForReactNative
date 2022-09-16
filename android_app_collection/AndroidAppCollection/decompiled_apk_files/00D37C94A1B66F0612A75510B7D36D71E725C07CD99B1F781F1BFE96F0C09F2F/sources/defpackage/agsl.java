package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: agsl  reason: default package */
/* loaded from: classes.dex */
public final class agsl {
    public final amuk a;
    public final Integer b;
    public final Integer c;

    public agsl(amuk amukVar, Integer num, Integer num2) {
        if (amukVar != null) {
            this.a = amukVar;
            this.b = num;
            this.c = num2;
            return;
        }
        throw new NullPointerException("Null shuffleOrder");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static agsl a(amuk amukVar, Integer num, Integer num2) {
        return new agsl(amukVar, num, num2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agsl) {
            agsl agslVar = (agsl) obj;
            if (amxp.v(this.a, agslVar.a) && this.b.equals(agslVar.b) && this.c.equals(agslVar.c)) {
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
        StringBuilder sb = new StringBuilder(length + 60 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ShuffleInfo{shuffleOrder=");
        sb.append(valueOf);
        sb.append(", shuffleIndex=");
        sb.append(valueOf2);
        sb.append(", loopShuffleFlags=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }

    public agsl() {
    }
}

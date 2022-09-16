package defpackage;
/* compiled from: PG */
/* renamed from: afdw  reason: default package */
/* loaded from: classes.dex */
final class afdw {
    public final afdx a;
    public final boolean b;

    public afdw(afdx afdxVar, boolean z) {
        if (afdxVar != null) {
            this.a = afdxVar;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null selectedPlayer");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static afdw a(afdx afdxVar, boolean z) {
        return new afdw(afdxVar, z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afdw) {
            afdw afdwVar = (afdw) obj;
            if (this.a.equals(afdwVar.a) && this.b == afdwVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 68);
        sb.append("PlayerSelectionResult{selectedPlayer=");
        sb.append(valueOf);
        sb.append(", defaultPlayerIndexUsed=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public afdw() {
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: aewq  reason: default package */
/* loaded from: classes.dex */
final class aewq {
    public final aegu a;
    public final aflj b;
    public final aflk c;

    public aewq(aegu aeguVar, aflj afljVar, aflk aflkVar) {
        this.a = aeguVar;
        if (afljVar != null) {
            this.b = afljVar;
            if (aflkVar != null) {
                this.c = aflkVar;
                return;
            }
            throw new NullPointerException("Null candidateVideoItags");
        }
        throw new NullPointerException("Null candidateAudioItags");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aewq) {
            aewq aewqVar = (aewq) obj;
            if (this.a.equals(aewqVar.a) && this.b.equals(aewqVar.b) && this.c.equals(aewqVar.c)) {
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
        StringBuilder sb = new StringBuilder(length + 90 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ItagAndStreamSelection{streamSelectionResult=");
        sb.append(valueOf);
        sb.append(", candidateAudioItags=");
        sb.append(valueOf2);
        sb.append(", candidateVideoItags=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }

    public aewq() {
    }
}

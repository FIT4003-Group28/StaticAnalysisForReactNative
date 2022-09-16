package defpackage;
/* compiled from: PG */
/* renamed from: aemz  reason: default package */
/* loaded from: classes.dex */
public final class aemz {
    public final aoob a;
    public final aoob b;
    public final aoob c;
    public final aoob d;

    public aemz() {
    }

    public aemz(aoob aoobVar, aoob aoobVar2, aoob aoobVar3, aoob aoobVar4) {
        this.a = aoobVar;
        this.b = aoobVar2;
        this.c = aoobVar3;
        this.d = aoobVar4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aemz) {
            aemz aemzVar = (aemz) obj;
            if (this.a.equals(aemzVar.a) && this.b.equals(aemzVar.b) && this.c.equals(aemzVar.c) && this.d.equals(aemzVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1231;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 79 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("OnesieEncryptionData{content=");
        sb.append(valueOf);
        sb.append(", hmac=");
        sb.append(valueOf2);
        sb.append(", iv=");
        sb.append(valueOf3);
        sb.append(", encryptedKey=");
        sb.append(valueOf4);
        sb.append(", useCompression=true}");
        return sb.toString();
    }
}

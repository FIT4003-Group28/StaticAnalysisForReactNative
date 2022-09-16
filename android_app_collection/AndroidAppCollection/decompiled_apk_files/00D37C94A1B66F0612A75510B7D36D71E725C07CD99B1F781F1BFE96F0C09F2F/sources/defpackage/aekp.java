package defpackage;
/* compiled from: PG */
/* renamed from: aekp  reason: default package */
/* loaded from: classes.dex */
public final class aekp {
    public final aoob a;
    public final aoob b;
    public final aoob c;
    public final int d;

    public aekp(aoob aoobVar, aoob aoobVar2, aoob aoobVar3, int i) {
        if (aoobVar != null) {
            this.a = aoobVar;
            if (aoobVar2 != null) {
                this.b = aoobVar2;
                if (aoobVar3 != null) {
                    this.c = aoobVar3;
                    this.d = i;
                    return;
                }
                throw new NullPointerException("Null iv");
            }
            throw new NullPointerException("Null hmac");
        }
        throw new NullPointerException("Null encryptedContent");
    }

    public static aekp a(aoob aoobVar, aoob aoobVar2, aoob aoobVar3, int i) {
        return new aekp(aoobVar, aoobVar2, aoobVar3, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aekp) {
            aekp aekpVar = (aekp) obj;
            if (this.a.equals(aekpVar.a) && this.b.equals(aekpVar.b) && this.c.equals(aekpVar.c) && this.d == aekpVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String num = Integer.toString(this.d - 1);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 81 + length2 + String.valueOf(valueOf3).length() + String.valueOf(num).length());
        sb.append("EncryptedOnesieInnerTubeResponse{encryptedContent=");
        sb.append(valueOf);
        sb.append(", hmac=");
        sb.append(valueOf2);
        sb.append(", iv=");
        sb.append(valueOf3);
        sb.append(", compressionType=");
        sb.append(num);
        sb.append("}");
        return sb.toString();
    }

    public aekp() {
    }
}

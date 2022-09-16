package defpackage;
/* compiled from: PG */
/* renamed from: sra  reason: default package */
/* loaded from: classes4.dex */
public final class sra {
    private final Long a;
    private final int b;

    public sra() {
    }

    public sra(Long l, int i) {
        this.a = l;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sra) {
            sra sraVar = (sra) obj;
            if (this.a.equals(sraVar.a) && this.b == sraVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String num = Integer.toString(apfb.e(this.b));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54 + String.valueOf(num).length());
        sb.append("VerificationFailureKey{protoId=");
        sb.append(valueOf);
        sb.append(", verificationFailure=");
        sb.append(num);
        sb.append("}");
        return sb.toString();
    }
}

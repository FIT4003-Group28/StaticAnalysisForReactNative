package defpackage;
/* compiled from: PG */
/* renamed from: adoi  reason: default package */
/* loaded from: classes.dex */
public final class adoi {
    public final int a;
    public final String b;

    public adoi() {
    }

    public adoi(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public static adoh a() {
        adoh adohVar = new adoh();
        adohVar.b(0);
        adohVar.c("");
        return adohVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adoi) {
            adoi adoiVar = (adoi) obj;
            if (this.a == adoiVar.a && this.b.equals(adoiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
        sb.append("SessionRecoveryStatus{recoveryState=");
        sb.append(i);
        sb.append(", screenName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}

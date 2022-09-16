package defpackage;
/* compiled from: PG */
/* renamed from: jth  reason: default package */
/* loaded from: classes3.dex */
public final class jth {
    public final int a;
    public final int b;

    public jth() {
    }

    public jth(int i) {
        this.a = i;
        this.b = 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jth) {
            jth jthVar = (jth) obj;
            if (this.a == jthVar.a && this.b == jthVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        int i = this.a;
        String num = Integer.toString(this.b - 1);
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 76);
        sb.append("DownloadsPageDisclaimerSectionData{expiryDays=");
        sb.append(i);
        sb.append(", backgroundColor=");
        sb.append(num);
        sb.append("}");
        return sb.toString();
    }
}

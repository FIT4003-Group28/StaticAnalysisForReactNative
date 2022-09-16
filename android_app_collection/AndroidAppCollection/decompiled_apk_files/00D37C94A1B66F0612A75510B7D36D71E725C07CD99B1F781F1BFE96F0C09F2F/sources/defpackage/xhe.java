package defpackage;
/* compiled from: PG */
/* renamed from: xhe  reason: default package */
/* loaded from: classes4.dex */
public final class xhe {
    public final boolean a;
    public final boolean b;
    public final CharSequence c;

    public xhe() {
    }

    public xhe(boolean z, boolean z2, CharSequence charSequence) {
        this.a = z;
        this.b = z2;
        this.c = charSequence;
    }

    public static xhd a() {
        xhd xhdVar = new xhd();
        xhdVar.c(false);
        xhdVar.b(false);
        xhdVar.d("<NONE>");
        return xhdVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xhe) {
            xhe xheVar = (xhe) obj;
            if (this.a == xheVar.a && this.b == xheVar.b && this.c.equals(xheVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.b) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 90);
        sb.append("LearnMoreOverlayState{learnMoreCtaHidden=");
        sb.append(z);
        sb.append(", learnMoreCtaEnabled=");
        sb.append(z2);
        sb.append(", learnMoreText=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

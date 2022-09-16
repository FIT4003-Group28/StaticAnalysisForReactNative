package defpackage;
/* compiled from: PG */
/* renamed from: adcv  reason: default package */
/* loaded from: classes.dex */
public final class adcv {
    public final String a;
    public final int b;
    public final int c;

    public adcv() {
    }

    public adcv(int i, String str) {
        this.b = i;
        this.c = 6;
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof adcv)) {
            return false;
        }
        adcv adcvVar = (adcv) obj;
        int i = this.b;
        int i2 = adcvVar.b;
        if (i == 0) {
            throw null;
        }
        if (i == i2) {
            int i3 = this.c;
            int i4 = adcvVar.c;
            if (i3 == 0) {
                throw null;
            }
            if (i3 == i4 && this.a.equals(adcvVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        int i = this.b;
        String str = "null";
        String num = i != 0 ? Integer.toString(i - 1) : str;
        int i2 = this.c;
        if (i2 != 0) {
            str = Integer.toString(i2 - 1);
        }
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 61 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append("MarkHandoffActionModel{actionState=");
        sb.append(num);
        sb.append(", featureType=");
        sb.append(str);
        sb.append(", actionId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            int i2 = (i ^ 1000003) * 1000003;
            int i3 = this.c;
            if (i3 != 0) {
                return ((i2 ^ i3) * 1000003) ^ this.a.hashCode();
            }
            throw null;
        }
        throw null;
    }
}

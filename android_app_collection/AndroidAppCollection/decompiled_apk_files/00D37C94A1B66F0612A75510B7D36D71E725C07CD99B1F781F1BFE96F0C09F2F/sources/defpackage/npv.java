package defpackage;
/* compiled from: PG */
/* renamed from: npv  reason: default package */
/* loaded from: classes3.dex */
public final class npv {
    public final String a;
    public final int b;

    public npv() {
    }

    public npv(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof npv) {
            npv npvVar = (npv) obj;
            if (this.a.equals(npvVar.a) && this.b == npvVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 49);
        sb.append("ScrollToItemData{panelId=");
        sb.append(str);
        sb.append(", itemIndex=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}

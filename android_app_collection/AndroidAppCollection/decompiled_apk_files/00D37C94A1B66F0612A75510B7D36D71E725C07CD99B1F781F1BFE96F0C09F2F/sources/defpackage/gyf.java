package defpackage;
/* compiled from: PG */
/* renamed from: gyf  reason: default package */
/* loaded from: classes3.dex */
public final class gyf {
    public final int a;
    public final String b;
    public final String c;

    public gyf() {
    }

    public gyf(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gyf) {
            gyf gyfVar = (gyf) obj;
            if (this.a == gyfVar.a && this.b.equals(gyfVar.b) && this.c.equals(gyfVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        String str2 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 85 + String.valueOf(str2).length());
        sb.append("CountdownDurationSegment{countdownDurationMs=");
        sb.append(i);
        sb.append(", text=");
        sb.append(str);
        sb.append(", contentDescription=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}

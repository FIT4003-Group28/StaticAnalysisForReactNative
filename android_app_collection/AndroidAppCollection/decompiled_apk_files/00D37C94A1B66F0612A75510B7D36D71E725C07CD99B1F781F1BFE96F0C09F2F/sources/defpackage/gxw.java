package defpackage;
/* compiled from: PG */
/* renamed from: gxw  reason: default package */
/* loaded from: classes3.dex */
public final class gxw {
    public final float a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;

    public gxw() {
    }

    public gxw(float f, String str, String str2, int i, String str3) {
        this.a = f;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static gxv a() {
        return new gxv();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gxw) {
            gxw gxwVar = (gxw) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(gxwVar.a) && this.b.equals(gxwVar.b) && this.c.equals(gxwVar.c) && this.d == gxwVar.d && this.e.equals(gxwVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        float f = this.a;
        String str = this.b;
        String str2 = this.c;
        int i = this.d;
        String str3 = this.e;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 98 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("SpeedElement{speed=");
        sb.append(f);
        sb.append(", animationTitle=");
        sb.append(str);
        sb.append(", text=");
        sb.append(str2);
        sb.append(", icon=");
        sb.append(i);
        sb.append(", contentDescription=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}

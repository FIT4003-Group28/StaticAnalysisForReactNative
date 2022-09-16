package defpackage;
/* compiled from: PG */
/* renamed from: ajnb  reason: default package */
/* loaded from: classes.dex */
public final class ajnb {
    public final int a;
    private final String b;

    public ajnb() {
    }

    public ajnb(String str, int i) {
        this.b = str;
        this.a = i;
    }

    public static ajnb a() {
        return new ajnb(null, 1);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajnb) {
            ajnb ajnbVar = (ajnb) obj;
            String str = this.b;
            if (str != null ? str.equals(ajnbVar.b) : ajnbVar.b == null) {
                if (this.a == ajnbVar.a) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.a;
    }

    public final String toString() {
        String str = this.b;
        int i = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 44);
        sb.append("ImageParams{videoId=");
        sb.append(str);
        sb.append(", imageType=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}

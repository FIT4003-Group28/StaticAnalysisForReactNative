package defpackage;
/* compiled from: PG */
/* renamed from: adwf  reason: default package */
/* loaded from: classes.dex */
public final class adwf {
    public final CharSequence a;
    public final CharSequence b;
    public final int c;
    public final int d;
    public final avhn e;

    public adwf() {
    }

    public adwf(CharSequence charSequence, CharSequence charSequence2, int i, int i2, avhn avhnVar) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = i;
        this.d = i2;
        this.e = avhnVar;
    }

    public static adwe a() {
        adwe adweVar = new adwe();
        adweVar.c(2);
        adweVar.b(0);
        return adweVar;
    }

    public final adwe b() {
        return new adwe(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adwf) {
            adwf adwfVar = (adwf) obj;
            CharSequence charSequence = this.a;
            if (charSequence != null ? charSequence.equals(adwfVar.a) : adwfVar.a == null) {
                CharSequence charSequence2 = this.b;
                if (charSequence2 != null ? charSequence2.equals(adwfVar.b) : adwfVar.b == null) {
                    if (this.c == adwfVar.c && this.d == adwfVar.d) {
                        avhn avhnVar = this.e;
                        avhn avhnVar2 = adwfVar.e;
                        if (avhnVar != null ? avhnVar.equals(avhnVar2) : avhnVar2 == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int i = 0;
        int hashCode = ((charSequence == null ? 0 : charSequence.hashCode()) ^ 1000003) * 1000003;
        CharSequence charSequence2 = this.b;
        int hashCode2 = (((((hashCode ^ (charSequence2 == null ? 0 : charSequence2.hashCode())) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        avhn avhnVar = this.e;
        if (avhnVar != null) {
            i = avhnVar.hashCode();
        }
        return hashCode2 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int i = this.c;
        int i2 = this.d;
        String valueOf3 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 122 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("MdxAdState{adVideoTitle=");
        sb.append(valueOf);
        sb.append(", adVideoSubtitle=");
        sb.append(valueOf2);
        sb.append(", adProgressMillis=");
        sb.append(i);
        sb.append(", skippableState=");
        sb.append(i2);
        sb.append(", adThumbnailDetails=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: fxb  reason: default package */
/* loaded from: classes3.dex */
public final class fxb {
    public final CharSequence a;
    public final arhr b;
    public final ampq c;
    public final ampq d;
    public final ampq e;
    public final avgj f;
    public final int g;
    public final int h;
    public final int i;

    public fxb() {
    }

    public fxb(CharSequence charSequence, arhr arhrVar, int i, int i2, ampq ampqVar, ampq ampqVar2, ampq ampqVar3, avgj avgjVar, int i3) {
        this.a = charSequence;
        this.b = arhrVar;
        this.g = i;
        this.h = i2;
        this.c = ampqVar;
        this.d = ampqVar2;
        this.e = ampqVar3;
        this.f = avgjVar;
        this.i = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static fxa a() {
        fxa fxaVar = new fxa(null);
        fxaVar.a(avgj.a);
        fxaVar.i = 1;
        return fxaVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fxb) {
            fxb fxbVar = (fxb) obj;
            if (this.a.equals(fxbVar.a) && this.b.equals(fxbVar.b)) {
                int i = this.g;
                int i2 = fxbVar.g;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    int i3 = this.h;
                    int i4 = fxbVar.h;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == i4 && this.c.equals(fxbVar.c) && this.d.equals(fxbVar.d) && this.e.equals(fxbVar.e) && this.f.equals(fxbVar.f)) {
                        int i5 = this.i;
                        int i6 = fxbVar.i;
                        if (i5 == 0) {
                            throw null;
                        }
                        if (i5 == i6) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        int i = this.g;
        if (i != 0) {
            int i2 = (hashCode ^ i) * 1000003;
            int i3 = this.h;
            if (i3 != 0) {
                int hashCode2 = (((((((((i2 ^ i3) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
                int i4 = this.i;
                if (i4 == 0) {
                    throw null;
                }
                return hashCode2 ^ i4;
            }
            throw null;
        }
        throw null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int i = this.g;
        String str = "null";
        String num = i != 0 ? Integer.toString(i - 1) : str;
        int i2 = this.h;
        String num2 = i2 != 0 ? Integer.toString(i2 - 1) : str;
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        int i3 = this.i;
        if (i3 != 0) {
            str = Integer.toString(i3 - 1);
        }
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(num).length();
        int length4 = String.valueOf(num2).length();
        int length5 = String.valueOf(valueOf3).length();
        int length6 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 149 + length2 + length3 + length4 + length5 + length6 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length() + String.valueOf(str).length());
        sb.append("ContentPillModel{text=");
        sb.append(valueOf);
        sb.append(", iconType=");
        sb.append(valueOf2);
        sb.append(", position=");
        sb.append(num);
        sb.append(", behavior=");
        sb.append(num2);
        sb.append(", onClickedCommand=");
        sb.append(valueOf3);
        sb.append(", transientUiCallback=");
        sb.append(valueOf4);
        sb.append(", actionListener=");
        sb.append(valueOf5);
        sb.append(", colorPalette=");
        sb.append(valueOf6);
        sb.append(", presentationStyle=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}

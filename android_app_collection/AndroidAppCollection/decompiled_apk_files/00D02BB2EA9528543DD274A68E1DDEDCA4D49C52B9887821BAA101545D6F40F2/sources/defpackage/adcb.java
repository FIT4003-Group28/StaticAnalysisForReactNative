package defpackage;
/* compiled from: PG */
/* renamed from: adcb  reason: default package */
/* loaded from: classes2.dex */
final class adcb extends adee {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final jic e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final cqss j;
    private final cqss k;
    private final cqss l;
    private final cqss m;
    private final String n;

    public adcb(String str, String str2, String str3, String str4, jic jicVar, String str5, String str6, String str7, String str8, cqss cqssVar, cqss cqssVar2, cqss cqssVar3, cqss cqssVar4, String str9) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = jicVar;
                        if (str5 != null) {
                            this.f = str5;
                            if (str6 != null) {
                                this.g = str6;
                                if (str7 != null) {
                                    this.h = str7;
                                    if (str8 != null) {
                                        this.i = str8;
                                        this.j = cqssVar;
                                        this.k = cqssVar2;
                                        this.l = cqssVar3;
                                        this.m = cqssVar4;
                                        if (str9 != null) {
                                            this.n = str9;
                                            return;
                                        }
                                        throw new NullPointerException("Null externalUrl");
                                    }
                                    throw new NullPointerException("Null videoId");
                                }
                                throw new NullPointerException("Null animationAccessibilityText");
                            }
                            throw new NullPointerException("Null lottieUrl");
                        }
                        throw new NullPointerException("Null imageAccessibilityText");
                    }
                    throw new NullPointerException("Null accessibilityText");
                }
                throw new NullPointerException("Null queryActionText");
            }
            throw new NullPointerException("Null queryButtonText");
        }
        throw new NullPointerException("Null title");
    }

    @Override // defpackage.adee
    public final String a() {
        return this.a;
    }

    @Override // defpackage.adee
    public final String b() {
        return this.b;
    }

    @Override // defpackage.adee
    public final String c() {
        return this.c;
    }

    @Override // defpackage.adee
    public final String d() {
        return this.d;
    }

    @Override // defpackage.adee
    public final jic e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adee) {
            adee adeeVar = (adee) obj;
            if (this.a.equals(adeeVar.a()) && this.b.equals(adeeVar.b()) && this.c.equals(adeeVar.c()) && this.d.equals(adeeVar.d()) && this.e.equals(adeeVar.e()) && this.f.equals(adeeVar.f()) && this.g.equals(adeeVar.g()) && this.h.equals(adeeVar.h()) && this.i.equals(adeeVar.i()) && this.j.equals(adeeVar.j()) && this.k.equals(adeeVar.k()) && this.l.equals(adeeVar.l()) && this.m.equals(adeeVar.m()) && this.n.equals(adeeVar.n())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.adee
    public final String f() {
        return this.f;
    }

    @Override // defpackage.adee
    public final String g() {
        return this.g;
    }

    @Override // defpackage.adee
    public final String h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode();
    }

    @Override // defpackage.adee
    public final String i() {
        return this.i;
    }

    @Override // defpackage.adee
    public final cqss j() {
        return this.j;
    }

    @Override // defpackage.adee
    public final cqss k() {
        return this.k;
    }

    @Override // defpackage.adee
    public final cqss l() {
        return this.l;
    }

    @Override // defpackage.adee
    public final cqss m() {
        return this.m;
    }

    @Override // defpackage.adee
    public final String n() {
        return this.n;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        String valueOf = String.valueOf(this.e);
        String str5 = this.f;
        String str6 = this.g;
        String str7 = this.h;
        String str8 = this.i;
        String valueOf2 = String.valueOf(this.j);
        String valueOf3 = String.valueOf(this.k);
        String valueOf4 = String.valueOf(this.l);
        String valueOf5 = String.valueOf(this.m);
        String str9 = this.n;
        int length = str.length();
        int length2 = str2.length();
        int length3 = str3.length();
        int length4 = str4.length();
        int length5 = String.valueOf(valueOf).length();
        int length6 = str5.length();
        int length7 = str6.length();
        int length8 = str7.length();
        int length9 = str8.length();
        int length10 = String.valueOf(valueOf2).length();
        int length11 = String.valueOf(valueOf3).length();
        int length12 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 243 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + String.valueOf(valueOf5).length() + str9.length());
        sb.append("DisplayData{title=");
        sb.append(str);
        sb.append(", queryButtonText=");
        sb.append(str2);
        sb.append(", queryActionText=");
        sb.append(str3);
        sb.append(", accessibilityText=");
        sb.append(str4);
        sb.append(", featuredImage=");
        sb.append(valueOf);
        sb.append(", imageAccessibilityText=");
        sb.append(str5);
        sb.append(", lottieUrl=");
        sb.append(str6);
        sb.append(", animationAccessibilityText=");
        sb.append(str7);
        sb.append(", videoId=");
        sb.append(str8);
        sb.append(", backgroundColor=");
        sb.append(valueOf2);
        sb.append(", buttonStrokeColor=");
        sb.append(valueOf3);
        sb.append(", textColor=");
        sb.append(valueOf4);
        sb.append(", iconColor=");
        sb.append(valueOf5);
        sb.append(", externalUrl=");
        sb.append(str9);
        sb.append("}");
        return sb.toString();
    }
}

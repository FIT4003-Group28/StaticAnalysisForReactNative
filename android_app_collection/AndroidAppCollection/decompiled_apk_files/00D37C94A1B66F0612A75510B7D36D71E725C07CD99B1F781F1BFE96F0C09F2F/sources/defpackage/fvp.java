package defpackage;
/* compiled from: PG */
/* renamed from: fvp  reason: default package */
/* loaded from: classes3.dex */
public final class fvp implements fue {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final avdu e;
    public final avdq f;
    public final avdh g;
    public final avdj h;
    public final CharSequence i;
    public final int j;
    public final apzg k;
    public final String l;
    public final fum m;
    public final int n;
    public final int o;

    public fvp() {
    }

    public fvp(boolean z, boolean z2, boolean z3, int i, avdu avduVar, avdq avdqVar, avdh avdhVar, avdj avdjVar, fum fumVar, CharSequence charSequence, int i2, int i3, int i4, apzg apzgVar, String str) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.e = avduVar;
        this.f = avdqVar;
        this.g = avdhVar;
        this.h = avdjVar;
        this.m = fumVar;
        this.i = charSequence;
        this.n = i2;
        this.o = i3;
        this.j = i4;
        this.k = apzgVar;
        this.l = str;
    }

    @Override // defpackage.fue
    public final int a() {
        return 3;
    }

    @Override // defpackage.fue
    public final boolean b() {
        return this.a;
    }

    @Override // defpackage.fue
    public final boolean c() {
        return this.b;
    }

    public final fvp d(String str) {
        fvo f = f();
        f.j = str;
        return f.a();
    }

    public final boolean equals(Object obj) {
        avdq avdqVar;
        avdh avdhVar;
        avdj avdjVar;
        fum fumVar;
        CharSequence charSequence;
        apzg apzgVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof fvp) {
            fvp fvpVar = (fvp) obj;
            if (this.a == fvpVar.a && this.b == fvpVar.b && this.c == fvpVar.c && this.d == fvpVar.d && this.e.equals(fvpVar.e) && ((avdqVar = this.f) != null ? avdqVar.equals(fvpVar.f) : fvpVar.f == null) && ((avdhVar = this.g) != null ? avdhVar.equals(fvpVar.g) : fvpVar.g == null) && ((avdjVar = this.h) != null ? avdjVar.equals(fvpVar.h) : fvpVar.h == null) && ((fumVar = this.m) != null ? fumVar.equals(fvpVar.m) : fvpVar.m == null) && ((charSequence = this.i) != null ? charSequence.equals(fvpVar.i) : fvpVar.i == null)) {
                int i = this.n;
                int i2 = fvpVar.n;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    int i3 = this.o;
                    int i4 = fvpVar.o;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == i4 && this.j == fvpVar.j && ((apzgVar = this.k) != null ? apzgVar.equals(fvpVar.k) : fvpVar.k == null)) {
                        String str = this.l;
                        String str2 = fvpVar.l;
                        if (str != null ? str.equals(str2) : str2 == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final fvo f() {
        return new fvo(this);
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        if (true == this.c) {
            i = 1231;
        }
        int hashCode = (((((i2 ^ i) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        avdq avdqVar = this.f;
        int i3 = 0;
        int hashCode2 = (hashCode ^ (avdqVar == null ? 0 : avdqVar.hashCode())) * 1000003;
        avdh avdhVar = this.g;
        int hashCode3 = (hashCode2 ^ (avdhVar == null ? 0 : avdhVar.hashCode())) * 1000003;
        avdj avdjVar = this.h;
        int hashCode4 = (hashCode3 ^ (avdjVar == null ? 0 : avdjVar.hashCode())) * 1000003;
        fum fumVar = this.m;
        int hashCode5 = (hashCode4 ^ (fumVar == null ? 0 : fumVar.hashCode())) * 1000003;
        CharSequence charSequence = this.i;
        int hashCode6 = (hashCode5 ^ (charSequence == null ? 0 : charSequence.hashCode())) * 1000003;
        int i4 = this.n;
        if (i4 != 0) {
            int i5 = (hashCode6 ^ i4) * 1000003;
            int i6 = this.o;
            if (i6 == 0) {
                throw null;
            }
            int i7 = (((i5 ^ i6) * 1000003) ^ this.j) * 1000003;
            apzg apzgVar = this.k;
            int hashCode7 = (i7 ^ (apzgVar == null ? 0 : apzgVar.hashCode())) * 1000003;
            String str = this.l;
            if (str != null) {
                i3 = str.hashCode();
            }
            return hashCode7 ^ i3;
        }
        throw null;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        int i = this.d;
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(this.f);
        String valueOf3 = String.valueOf(this.g);
        String valueOf4 = String.valueOf(this.h);
        String valueOf5 = String.valueOf(this.m);
        String valueOf6 = String.valueOf(this.i);
        int i2 = this.n;
        String str = "null";
        String num = i2 != 0 ? Integer.toString(i2 - 1) : str;
        int i3 = this.o;
        if (i3 != 0) {
            str = Integer.toString(i3 - 1);
        }
        int i4 = this.j;
        String valueOf7 = String.valueOf(this.k);
        String str2 = this.l;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(num).length();
        StringBuilder sb = new StringBuilder(length + 305 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(str).length() + String.valueOf(valueOf7).length() + String.valueOf(str2).length());
        sb.append("SurveyBottomUiModel{rateLimited=");
        sb.append(z);
        sb.append(", shownOnFullscreen=");
        sb.append(z2);
        sb.append(", counterfactual=");
        sb.append(z3);
        sb.append(", surveyType=");
        sb.append(i);
        sb.append(", surveySupportedRenderers=");
        sb.append(valueOf);
        sb.append(", singleOptionSurvey=");
        sb.append(valueOf2);
        sb.append(", checkboxSurvey=");
        sb.append(valueOf3);
        sb.append(", freeTextSurvey=");
        sb.append(valueOf4);
        sb.append(", responseListener=");
        sb.append(valueOf5);
        sb.append(", question=");
        sb.append(valueOf6);
        sb.append(", displayTime=");
        sb.append(num);
        sb.append(", displayStart=");
        sb.append(str);
        sb.append(", displayDelaySec=");
        sb.append(i4);
        sb.append(", dismissalEndpoint=");
        sb.append(valueOf7);
        sb.append(", cpn=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public final boolean e(avdu avduVar) {
        avdj avdjVar;
        int i = this.d;
        if (i == 1) {
            avdq avdqVar = this.f;
            if (avdqVar != null) {
                avdq avdqVar2 = avduVar.c;
                if (avdqVar2 == null) {
                    avdqVar2 = avdq.a;
                }
                if (avdqVar.equals(avdqVar2)) {
                    return true;
                }
            }
            return false;
        } else if (i != 2) {
            if (i == 3 && (avdjVar = this.h) != null) {
                avdj avdjVar2 = avduVar.f;
                if (avdjVar2 == null) {
                    avdjVar2 = avdj.a;
                }
                if (avdjVar.equals(avdjVar2)) {
                    return true;
                }
            }
            return false;
        } else {
            avdh avdhVar = this.g;
            if (avdhVar != null) {
                avdh avdhVar2 = avduVar.d;
                if (avdhVar2 == null) {
                    avdhVar2 = avdh.a;
                }
                if (avdhVar.equals(avdhVar2)) {
                    return true;
                }
            }
            return false;
        }
    }
}

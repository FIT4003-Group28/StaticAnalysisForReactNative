package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: azzz  reason: default package */
/* loaded from: classes3.dex */
final class azzz extends baai {
    private final String a;
    private final dpuk b;
    private final String c;
    private final String d;
    private final String e;
    private final dhti f;
    private final dpop g;
    private final String h;

    public azzz(String str, dpuk dpukVar, String str2, String str3, String str4, @dzsi dhti dhtiVar, @dzsi dpop dpopVar, String str5) {
        this.a = str;
        this.b = dpukVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = dhtiVar;
        this.g = dpopVar;
        this.h = str5;
    }

    @Override // defpackage.baai
    public final String a() {
        return this.a;
    }

    @Override // defpackage.baai
    public final dpuk b() {
        return this.b;
    }

    @Override // defpackage.baai
    public final String c() {
        return this.c;
    }

    @Override // defpackage.baai
    public final String d() {
        return this.d;
    }

    @Override // defpackage.baai
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        dhti dhtiVar;
        dpop dpopVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof baai) {
            baai baaiVar = (baai) obj;
            if (this.a.equals(baaiVar.a()) && this.b.equals(baaiVar.b()) && this.c.equals(baaiVar.c()) && this.d.equals(baaiVar.d()) && this.e.equals(baaiVar.e()) && ((dhtiVar = this.f) != null ? dhtiVar.equals(baaiVar.f()) : baaiVar.f() == null) && ((dpopVar = this.g) != null ? dpopVar.equals(baaiVar.g()) : baaiVar.g() == null) && this.h.equals(baaiVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.baai
    @dzsi
    public final dhti f() {
        return this.f;
    }

    @Override // defpackage.baai
    @dzsi
    public final dpop g() {
        return this.g;
    }

    @Override // defpackage.baai
    public final String h() {
        return this.h;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        dhti dhtiVar = this.f;
        int i2 = 0;
        if (dhtiVar == null) {
            i = 0;
        } else {
            i = dhtiVar.bC;
            if (i == 0) {
                i = dsst.a.b(dhtiVar).c(dhtiVar);
                dhtiVar.bC = i;
            }
        }
        int i3 = (hashCode ^ i) * 1000003;
        dpop dpopVar = this.g;
        if (dpopVar != null && (i2 = dpopVar.bC) == 0) {
            i2 = dsst.a.b(dpopVar).c(dpopVar);
            dpopVar.bC = i2;
        }
        return ((i3 ^ i2) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        String valueOf2 = String.valueOf(this.f);
        String valueOf3 = String.valueOf(this.g);
        String str5 = this.h;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(str2).length();
        int length4 = String.valueOf(str3).length();
        int length5 = String.valueOf(str4).length();
        int length6 = String.valueOf(valueOf2).length();
        int length7 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowFixedHeightMinor + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(str5).length());
        sb.append("ExperienceData{mid=");
        sb.append(str);
        sb.append(", experienceType=");
        sb.append(valueOf);
        sb.append(", categoryName=");
        sb.append(str2);
        sb.append(", locationDisplayName=");
        sb.append(str3);
        sb.append(", coverImageUrl=");
        sb.append(str4);
        sb.append(", callout=");
        sb.append(valueOf2);
        sb.append(", duration=");
        sb.append(valueOf3);
        sb.append(", cardVed=");
        sb.append(str5);
        sb.append("}");
        return sb.toString();
    }
}

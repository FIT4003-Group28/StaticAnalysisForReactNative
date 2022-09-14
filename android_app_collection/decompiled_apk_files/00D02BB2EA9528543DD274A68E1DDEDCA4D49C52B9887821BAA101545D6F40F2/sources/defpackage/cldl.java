package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: cldl  reason: default package */
/* loaded from: classes5.dex */
public final class cldl extends cldd {
    private final Integer a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;

    public cldl(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
    }

    @Override // defpackage.cldd
    public final Integer a() {
        return this.a;
    }

    @Override // defpackage.cldd
    public final String b() {
        return this.b;
    }

    @Override // defpackage.cldd
    public final String c() {
        return this.c;
    }

    @Override // defpackage.cldd
    public final String d() {
        return this.d;
    }

    @Override // defpackage.cldd
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cldd) {
            cldd clddVar = (cldd) obj;
            Integer num = this.a;
            if (num != null ? num.equals(clddVar.a()) : clddVar.a() == null) {
                String str = this.b;
                if (str != null ? str.equals(clddVar.b()) : clddVar.b() == null) {
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(clddVar.c()) : clddVar.c() == null) {
                        String str3 = this.d;
                        if (str3 != null ? str3.equals(clddVar.d()) : clddVar.d() == null) {
                            String str4 = this.e;
                            if (str4 != null ? str4.equals(clddVar.e()) : clddVar.e() == null) {
                                String str5 = this.f;
                                if (str5 != null ? str5.equals(clddVar.f()) : clddVar.f() == null) {
                                    String str6 = this.g;
                                    if (str6 != null ? str6.equals(clddVar.g()) : clddVar.g() == null) {
                                        String str7 = this.h;
                                        if (str7 != null ? str7.equals(clddVar.h()) : clddVar.h() == null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.cldd
    public final String f() {
        return this.f;
    }

    @Override // defpackage.cldd
    public final String g() {
        return this.g;
    }

    @Override // defpackage.cldd
    public final String h() {
        return this.h;
    }

    public final int hashCode() {
        Integer num = this.a;
        int i = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.h;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode7 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        String str5 = this.f;
        String str6 = this.g;
        String str7 = this.h;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(str2).length();
        int length4 = String.valueOf(str3).length();
        int length5 = String.valueOf(str4).length();
        int length6 = String.valueOf(str5).length();
        int length7 = String.valueOf(str6).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(str7).length());
        sb.append("AndroidClientInfo{sdkVersion=");
        sb.append(valueOf);
        sb.append(", model=");
        sb.append(str);
        sb.append(", hardware=");
        sb.append(str2);
        sb.append(", device=");
        sb.append(str3);
        sb.append(", product=");
        sb.append(str4);
        sb.append(", osBuild=");
        sb.append(str5);
        sb.append(", manufacturer=");
        sb.append(str6);
        sb.append(", fingerprint=");
        sb.append(str7);
        sb.append("}");
        return sb.toString();
    }
}

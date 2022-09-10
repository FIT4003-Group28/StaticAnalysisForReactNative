package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: cuow  reason: default package */
/* loaded from: classes5.dex */
final class cuow extends cupu {
    private final cukn a;
    private final String b;
    private final dspd c;
    private final int d;
    private final int e;
    private final String f;

    public cuow(cukn cuknVar, String str, dspd dspdVar, int i, int i2, String str2) {
        this.a = cuknVar;
        this.b = str;
        this.c = dspdVar;
        this.d = i;
        this.e = i2;
        this.f = str2;
    }

    @Override // defpackage.cupu
    public final cukn a() {
        return this.a;
    }

    @Override // defpackage.cupu
    public final String b() {
        return this.b;
    }

    @Override // defpackage.cupu
    public final dspd c() {
        return this.c;
    }

    @Override // defpackage.cupu
    public final int d() {
        return this.d;
    }

    @Override // defpackage.cupu
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cupu) {
            cupu cupuVar = (cupu) obj;
            if (this.a.equals(cupuVar.a()) && ((str = this.b) != null ? str.equals(cupuVar.b()) : cupuVar.b() == null) && this.c.equals(cupuVar.c()) && this.d == cupuVar.d() && this.e == cupuVar.e() && this.f.equals(cupuVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cupu
    public final String f() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return ((((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String valueOf2 = String.valueOf(this.c);
        int i = this.d;
        int i2 = this.e;
        String str2 = this.f;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_textAppearanceListItem + length2 + length3 + String.valueOf(str2).length());
        sb.append("ImageElement{mediaId=");
        sb.append(valueOf);
        sb.append(", localURI=");
        sb.append(str);
        sb.append(", thumbnail=");
        sb.append(valueOf2);
        sb.append(", width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        sb.append(", imageDescription=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}

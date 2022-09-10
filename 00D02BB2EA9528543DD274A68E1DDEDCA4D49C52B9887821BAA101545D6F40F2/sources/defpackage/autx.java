package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: autx  reason: default package */
/* loaded from: classes2.dex */
public final class autx extends autz {
    private final int a;
    private final String b;
    private final dplx c;
    private final dbsg<ddcu> d;
    private final dbsg<String> e;
    private final int f;

    public autx(int i, String str, int i2, dplx dplxVar, dbsg<ddcu> dbsgVar, dbsg<String> dbsgVar2) {
        this.a = i;
        this.b = str;
        this.f = i2;
        this.c = dplxVar;
        this.d = dbsgVar;
        this.e = dbsgVar2;
    }

    @Override // defpackage.autz
    public final int a() {
        return this.a;
    }

    @Override // defpackage.autz
    public final String b() {
        return this.b;
    }

    @Override // defpackage.autz
    public final dplx c() {
        return this.c;
    }

    @Override // defpackage.autz
    public final dbsg<ddcu> d() {
        return this.d;
    }

    @Override // defpackage.autz
    public final dbsg<String> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof autz) {
            autz autzVar = (autz) obj;
            if (this.a == autzVar.a() && this.b.equals(autzVar.b())) {
                int i = this.f;
                int f = autzVar.f();
                if (i == 0) {
                    throw null;
                }
                if (i == f && this.c.equals(autzVar.c()) && this.d.equals(autzVar.d()) && this.e.equals(autzVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.autz
    public final int f() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = (((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        int i = this.f;
        if (i != 0) {
            int i2 = (hashCode ^ i) * 1000003;
            dplx dplxVar = this.c;
            int i3 = dplxVar.bC;
            if (i3 == 0) {
                i3 = dsst.a.b(dplxVar).c(dplxVar);
                dplxVar.bC = i3;
            }
            return ((((i2 ^ i3) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        }
        throw null;
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        int i2 = this.f;
        String valueOf = String.valueOf(i2 != 0 ? Integer.toString(i2 - 1) : "null");
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_textAppearancePopupMenuHeader + length2 + length3 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("NotificationOptOutAction{icon=");
        sb.append(i);
        sb.append(", title=");
        sb.append(str);
        sb.append(", intentType=");
        sb.append(valueOf);
        sb.append(", androidIntent=");
        sb.append(valueOf2);
        sb.append(", geoDataElementType=");
        sb.append(valueOf3);
        sb.append(", ved=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}

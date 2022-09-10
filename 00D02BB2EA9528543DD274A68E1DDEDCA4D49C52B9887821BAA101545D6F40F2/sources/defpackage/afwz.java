package defpackage;
/* compiled from: PG */
/* renamed from: afwz  reason: default package */
/* loaded from: classes2.dex */
final class afwz extends afyb {
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final afyc f;
    private final int g;

    public afwz(boolean z, int i, boolean z2, boolean z3, boolean z4, afyc afycVar) {
        this.b = z;
        this.g = i;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = afycVar;
    }

    @Override // defpackage.afyb
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.afyb
    public final boolean b() {
        return this.c;
    }

    @Override // defpackage.afyb
    public final boolean c() {
        return this.d;
    }

    @Override // defpackage.afyb
    public final boolean d() {
        return this.e;
    }

    @Override // defpackage.afyb
    public final afyc e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afyb) {
            afyb afybVar = (afyb) obj;
            if (this.b == afybVar.a()) {
                int i = this.g;
                int f = afybVar.f();
                if (i == 0) {
                    throw null;
                }
                if (i == f && this.c == afybVar.b() && this.d == afybVar.c() && this.e == afybVar.d() && this.f.equals(afybVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.afyb
    public final int f() {
        return this.g;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = true != this.b ? 1237 : 1231;
        int i3 = this.g;
        afxh.b(i3);
        int i4 = (((((((i2 ^ 1000003) * 1000003) ^ i3) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003;
        if (true == this.e) {
            i = 1231;
        }
        return ((i4 ^ i) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        boolean z = this.b;
        String a = afxh.a(this.g);
        boolean z2 = this.c;
        boolean z3 = this.d;
        boolean z4 = this.e;
        String valueOf = String.valueOf(this.f);
        StringBuilder sb = new StringBuilder(a.length() + 216 + String.valueOf(valueOf).length());
        sb.append("LensPhotoActionOptions{enableLensIcon=");
        sb.append(z);
        sb.append(", lensIconFilter=");
        sb.append(a);
        sb.append(", enableLensTranslateSuggestionAction=");
        sb.append(z2);
        sb.append(", enableLensSearchDishSuggestionAction=");
        sb.append(z3);
        sb.append(", enableLensSearchPlacesSuggestionAction=");
        sb.append(z4);
        sb.append(", lensPhotoEntryPoint=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

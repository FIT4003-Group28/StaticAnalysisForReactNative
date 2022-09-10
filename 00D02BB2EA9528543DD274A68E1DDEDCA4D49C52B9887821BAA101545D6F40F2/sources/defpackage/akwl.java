package defpackage;
/* compiled from: PG */
/* renamed from: akwl  reason: default package */
/* loaded from: classes.dex */
public final class akwl extends akwt {
    private final boolean a;
    private final boolean b;
    private final dcdc<Integer> c;
    private final boolean d;
    private final int e;
    private final boolean f;
    private final boolean g;
    private final String h;
    private final boolean i;

    public akwl(boolean z, boolean z2, dcdc<Integer> dcdcVar, boolean z3, int i, boolean z4, boolean z5, String str, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = dcdcVar;
        this.d = z3;
        this.e = i;
        this.f = z4;
        this.g = z5;
        this.h = str;
        this.i = z6;
    }

    @Override // defpackage.akwt
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.akwt
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.akwt
    public final dcdc<Integer> c() {
        return this.c;
    }

    @Override // defpackage.akwt
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.akwt
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akwt) {
            akwt akwtVar = (akwt) obj;
            if (this.a == akwtVar.a() && this.b == akwtVar.b() && dchl.m(this.c, akwtVar.c()) && this.d == akwtVar.d() && this.e == akwtVar.e() && this.f == akwtVar.f() && this.g == akwtVar.g() && this.h.equals(akwtVar.h()) && this.i == akwtVar.i()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.akwt
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.akwt
    public final boolean g() {
        return this.g;
    }

    @Override // defpackage.akwt
    public final String h() {
        return this.h;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = ((((((((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ this.h.hashCode()) * 1000003;
        if (true == this.i) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    @Override // defpackage.akwt
    public final boolean i() {
        return this.i;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        String valueOf = String.valueOf(this.c);
        boolean z3 = this.d;
        int i = this.e;
        boolean z4 = this.f;
        boolean z5 = this.g;
        String str = this.h;
        boolean z6 = this.i;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 307 + String.valueOf(str).length());
        sb.append("LabelConfigSettings{inheritOrganicRank=");
        sb.append(z);
        sb.append(", disableAllAnnotations=");
        sb.append(z2);
        sb.append(", annotationExperimentIds=");
        sb.append(valueOf);
        sb.append(", spotlightSecondaryLabelEnabled=");
        sb.append(z3);
        sb.append(", reservedLabelBoundingBoxPixelSize=");
        sb.append(i);
        sb.append(", disableSecondaryLabelClickability=");
        sb.append(z4);
        sb.append(", animationFrameworkEnabled=");
        sb.append(z5);
        sb.append(", iconBaseUrl=");
        sb.append(str);
        sb.append(", promotedPinsUsesPerPinData=");
        sb.append(z6);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: akwj  reason: default package */
/* loaded from: classes.dex */
public final class akwj extends akwr {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final int d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;

    public akwj(boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = z9;
        this.k = z10;
        this.l = z11;
        this.m = z12;
        this.n = z13;
        this.o = z14;
    }

    @Override // defpackage.akwr
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.akwr
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.akwr
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.akwr
    public final int d() {
        return this.d;
    }

    @Override // defpackage.akwr
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akwr) {
            akwr akwrVar = (akwr) obj;
            if (this.a == akwrVar.a() && this.b == akwrVar.b() && this.c == akwrVar.c() && this.d == akwrVar.d() && this.e == akwrVar.e() && this.f == akwrVar.f() && this.g == akwrVar.g() && this.h == akwrVar.h() && this.i == akwrVar.i() && this.j == akwrVar.j() && this.k == akwrVar.k() && this.l == akwrVar.l() && this.m == akwrVar.m() && this.n == akwrVar.n() && this.o == akwrVar.o()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.akwr
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.akwr
    public final boolean g() {
        return this.g;
    }

    @Override // defpackage.akwr
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((((((((((((((((((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ (true != this.m ? 1237 : 1231)) * 1000003) ^ (true != this.n ? 1237 : 1231)) * 1000003;
        if (true == this.o) {
            i = 1231;
        }
        return i2 ^ i;
    }

    @Override // defpackage.akwr
    public final boolean i() {
        return this.i;
    }

    @Override // defpackage.akwr
    public final boolean j() {
        return this.j;
    }

    @Override // defpackage.akwr
    public final boolean k() {
        return this.k;
    }

    @Override // defpackage.akwr
    public final boolean l() {
        return this.l;
    }

    @Override // defpackage.akwr
    public final boolean m() {
        return this.m;
    }

    @Override // defpackage.akwr
    public final boolean n() {
        return this.n;
    }

    @Override // defpackage.akwr
    public final boolean o() {
        return this.o;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        int i = this.d;
        boolean z4 = this.e;
        boolean z5 = this.f;
        boolean z6 = this.g;
        boolean z7 = this.h;
        boolean z8 = this.i;
        boolean z9 = this.j;
        boolean z10 = this.k;
        boolean z11 = this.l;
        boolean z12 = this.m;
        boolean z13 = this.n;
        boolean z14 = this.o;
        StringBuilder sb = new StringBuilder(618);
        sb.append("EnableFeatureConfigSettings{onlineThickTilesAtZ14Enabled=");
        sb.append(z);
        sb.append(", zenrinCarNavSensorRestrictionsEnabled=");
        sb.append(z2);
        sb.append(", interpolateStylesOnDemand=");
        sb.append(z3);
        sb.append(", glideMemoryCacheSize=");
        sb.append(i);
        sb.append(", spotlightPersonalizedSmartmaps=");
        sb.append(z4);
        sb.append(", disableViewportLoggingForNewLabelInSnapshot=");
        sb.append(z5);
        sb.append(", skipCameraAnimationSteadyStateCheckForViewportLogging=");
        sb.append(z6);
        sb.append(", skipNonCameraSteadyStateChecksForViewportLogging=");
        sb.append(z7);
        sb.append(", skipDiffCheckForViewportLogging=");
        sb.append(z8);
        sb.append(", enableAreaHighlighting=");
        sb.append(z9);
        sb.append(", counterfactuallyLogAreaHighlighting=");
        sb.append(z10);
        sb.append(", enableIconicPlaces=");
        sb.append(z11);
        sb.append(", enableBasemapPersonalization=");
        sb.append(z12);
        sb.append(", enableLocalRecommendations=");
        sb.append(z13);
        sb.append(", enableBusynessOverlay=");
        sb.append(z14);
        sb.append("}");
        return sb.toString();
    }
}

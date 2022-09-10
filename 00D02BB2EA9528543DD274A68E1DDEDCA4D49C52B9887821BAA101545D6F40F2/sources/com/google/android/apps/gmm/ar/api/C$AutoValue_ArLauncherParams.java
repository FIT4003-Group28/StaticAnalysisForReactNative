package com.google.android.apps.gmm.ar.api;

import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: com.google.android.apps.gmm.ar.api.$AutoValue_ArLauncherParams  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_ArLauncherParams extends ArLauncherParams {
    public final czh a;
    public final Iterable<dcvs> b;
    public final dcdc<czq> c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final doi j;
    public final ImageView.ScaleType k;
    public final dcdn<czq, String> l;
    public final dcdn<czq, String> m;
    public final dcdn<czq, String> n;

    public C$AutoValue_ArLauncherParams(czh czhVar, Iterable<dcvs> iterable, dcdc<czq> dcdcVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, doi doiVar, @dzsi ImageView.ScaleType scaleType, dcdn<czq, String> dcdnVar, dcdn<czq, String> dcdnVar2, dcdn<czq, String> dcdnVar3) {
        if (czhVar != null) {
            this.a = czhVar;
            if (iterable != null) {
                this.b = iterable;
                if (dcdcVar != null) {
                    this.c = dcdcVar;
                    this.d = z;
                    this.e = z2;
                    this.f = z3;
                    this.g = z4;
                    this.h = z5;
                    this.i = z6;
                    if (doiVar != null) {
                        this.j = doiVar;
                        this.k = scaleType;
                        if (dcdnVar != null) {
                            this.l = dcdnVar;
                            if (dcdnVar2 != null) {
                                this.m = dcdnVar2;
                                if (dcdnVar3 != null) {
                                    this.n = dcdnVar3;
                                    return;
                                }
                                throw new NullPointerException("Null nextButtonStringOverrides");
                            }
                            throw new NullPointerException("Null descriptionStringOverrides");
                        }
                        throw new NullPointerException("Null titleStringOverrides");
                    }
                    throw new NullPointerException("Null onboardingLottieAsset");
                }
                throw new NullPointerException("Null showOnboarding");
            }
            throw new NullPointerException("Null latLngs");
        }
        throw new NullPointerException("Null featureType");
    }

    @Override // com.google.android.apps.gmm.ar.api.ArLauncherParams
    public final czh a() {
        return this.a;
    }

    @Override // com.google.android.apps.gmm.ar.api.ArLauncherParams
    public final Iterable<dcvs> b() {
        return this.b;
    }

    @Override // com.google.android.apps.gmm.ar.api.ArLauncherParams
    public final dcdc<czq> c() {
        return this.c;
    }

    @Override // com.google.android.apps.gmm.ar.api.ArLauncherParams
    public final boolean d() {
        return this.d;
    }

    @Override // com.google.android.apps.gmm.ar.api.ArLauncherParams
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        ImageView.ScaleType scaleType;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ArLauncherParams) {
            ArLauncherParams arLauncherParams = (ArLauncherParams) obj;
            if (this.a.equals(arLauncherParams.a()) && this.b.equals(arLauncherParams.b()) && dchl.m(this.c, arLauncherParams.c()) && this.d == arLauncherParams.d() && this.e == arLauncherParams.e() && this.f == arLauncherParams.f() && this.g == arLauncherParams.g() && this.h == arLauncherParams.h() && this.i == arLauncherParams.i() && this.j.equals(arLauncherParams.j()) && ((scaleType = this.k) != null ? scaleType.equals(arLauncherParams.k()) : arLauncherParams.k() == null) && this.l.equals(arLauncherParams.l()) && this.m.equals(arLauncherParams.m()) && this.n.equals(arLauncherParams.n())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.apps.gmm.ar.api.ArLauncherParams
    public final boolean f() {
        return this.f;
    }

    @Override // com.google.android.apps.gmm.ar.api.ArLauncherParams
    public final boolean g() {
        return this.g;
    }

    @Override // com.google.android.apps.gmm.ar.api.ArLauncherParams
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003;
        if (true == this.i) {
            i = 1231;
        }
        int hashCode2 = (((hashCode ^ i) * 1000003) ^ this.j.hashCode()) * 1000003;
        ImageView.ScaleType scaleType = this.k;
        return ((((((hashCode2 ^ (scaleType == null ? 0 : scaleType.hashCode())) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode();
    }

    @Override // com.google.android.apps.gmm.ar.api.ArLauncherParams
    public final boolean i() {
        return this.i;
    }

    @Override // com.google.android.apps.gmm.ar.api.ArLauncherParams
    public final doi j() {
        return this.j;
    }

    @Override // com.google.android.apps.gmm.ar.api.ArLauncherParams
    @dzsi
    public final ImageView.ScaleType k() {
        return this.k;
    }

    @Override // com.google.android.apps.gmm.ar.api.ArLauncherParams
    public final dcdn<czq, String> l() {
        return this.l;
    }

    @Override // com.google.android.apps.gmm.ar.api.ArLauncherParams
    public final dcdn<czq, String> m() {
        return this.m;
    }

    @Override // com.google.android.apps.gmm.ar.api.ArLauncherParams
    public final dcdn<czq, String> n() {
        return this.n;
    }

    @Override // com.google.android.apps.gmm.ar.api.ArLauncherParams
    public final czp o() {
        return new czb(this);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        boolean z = this.d;
        boolean z2 = this.e;
        boolean z3 = this.f;
        boolean z4 = this.g;
        boolean z5 = this.h;
        boolean z6 = this.i;
        String valueOf4 = String.valueOf(this.j);
        String valueOf5 = String.valueOf(this.k);
        String valueOf6 = String.valueOf(this.l);
        String valueOf7 = String.valueOf(this.m);
        String valueOf8 = String.valueOf(this.n);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        StringBuilder sb = new StringBuilder(length + 365 + length2 + length3 + length4 + length5 + length6 + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length());
        sb.append("ArLauncherParams{featureType=");
        sb.append(valueOf);
        sb.append(", latLngs=");
        sb.append(valueOf2);
        sb.append(", showOnboarding=");
        sb.append(valueOf3);
        sb.append(", onboardingShown=");
        sb.append(z);
        sb.append(", nightModeWarningShown=");
        sb.append(z2);
        sb.append(", lowEndDeviceWarningShown=");
        sb.append(z3);
        sb.append(", indoorWarningShown=");
        sb.append(z4);
        sb.append(", showOnboardingCancelButton=");
        sb.append(z5);
        sb.append(", incognitoWarningShown=");
        sb.append(z6);
        sb.append(", onboardingLottieAsset=");
        sb.append(valueOf4);
        sb.append(", onboardingAnimationScaleType=");
        sb.append(valueOf5);
        sb.append(", titleStringOverrides=");
        sb.append(valueOf6);
        sb.append(", descriptionStringOverrides=");
        sb.append(valueOf7);
        sb.append(", nextButtonStringOverrides=");
        sb.append(valueOf8);
        sb.append("}");
        return sb.toString();
    }
}

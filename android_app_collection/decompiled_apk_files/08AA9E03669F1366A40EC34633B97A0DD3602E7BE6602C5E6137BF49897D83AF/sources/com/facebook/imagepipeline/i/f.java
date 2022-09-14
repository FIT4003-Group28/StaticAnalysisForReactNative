package com.facebook.imagepipeline.i;

import com.google.android.gms.common.api.Api;
/* compiled from: ImmutableQualityInfo.java */
/* loaded from: classes.dex */
public class f implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f2710a = a(Api.BaseClientBuilder.API_PRIORITY_OTHER, true, true);

    /* renamed from: b  reason: collision with root package name */
    int f2711b;

    /* renamed from: c  reason: collision with root package name */
    boolean f2712c;

    /* renamed from: d  reason: collision with root package name */
    boolean f2713d;

    private f(int i, boolean z, boolean z2) {
        this.f2711b = i;
        this.f2712c = z;
        this.f2713d = z2;
    }

    @Override // com.facebook.imagepipeline.i.g
    public int a() {
        return this.f2711b;
    }

    @Override // com.facebook.imagepipeline.i.g
    public boolean b() {
        return this.f2712c;
    }

    @Override // com.facebook.imagepipeline.i.g
    public boolean c() {
        return this.f2713d;
    }

    public int hashCode() {
        int i = 0;
        int i2 = this.f2711b ^ (this.f2712c ? 4194304 : 0);
        if (this.f2713d) {
            i = 8388608;
        }
        return i2 ^ i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f2711b == fVar.f2711b && this.f2712c == fVar.f2712c && this.f2713d == fVar.f2713d;
    }

    public static g a(int i, boolean z, boolean z2) {
        return new f(i, z, z2);
    }
}

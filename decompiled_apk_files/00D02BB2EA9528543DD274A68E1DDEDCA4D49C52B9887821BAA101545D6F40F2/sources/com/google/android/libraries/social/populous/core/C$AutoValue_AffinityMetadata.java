package com.google.android.libraries.social.populous.core;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_AffinityMetadata  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_AffinityMetadata extends AffinityMetadata {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final double d;
    public final double e;

    public C$AutoValue_AffinityMetadata(boolean z, boolean z2, boolean z3, double d, double d2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = d;
        this.e = d2;
    }

    @Override // com.google.android.libraries.social.populous.core.AffinityMetadata
    public final boolean a() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.populous.core.AffinityMetadata
    public final boolean b() {
        return this.b;
    }

    @Override // com.google.android.libraries.social.populous.core.AffinityMetadata
    public final boolean c() {
        return this.c;
    }

    @Override // com.google.android.libraries.social.populous.core.AffinityMetadata
    public final double d() {
        return this.d;
    }

    @Override // com.google.android.libraries.social.populous.core.AffinityMetadata
    public final double e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AffinityMetadata) {
            AffinityMetadata affinityMetadata = (AffinityMetadata) obj;
            if (this.a == affinityMetadata.a() && this.b == affinityMetadata.b() && this.c == affinityMetadata.c() && Double.doubleToLongBits(this.d) == Double.doubleToLongBits(affinityMetadata.d()) && Double.doubleToLongBits(this.e) == Double.doubleToLongBits(affinityMetadata.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        if (true == this.c) {
            i = 1231;
        }
        return ((((i2 ^ i) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.d) >>> 32) ^ Double.doubleToLongBits(this.d)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.e) >>> 32) ^ Double.doubleToLongBits(this.e)));
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        double d = this.d;
        double d2 = this.e;
        StringBuilder sb = new StringBuilder(168);
        sb.append("AffinityMetadata{isPopulated=");
        sb.append(z);
        sb.append(", isDeviceDataKnown=");
        sb.append(z2);
        sb.append(", isDirectClientInteraction=");
        sb.append(z3);
        sb.append(", cloudScore=");
        sb.append(d);
        sb.append(", deviceScore=");
        sb.append(d2);
        sb.append("}");
        return sb.toString();
    }
}

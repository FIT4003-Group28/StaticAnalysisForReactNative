package com.google.android.libraries.social.populous.core;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_PeopleApiAffinity  reason: invalid class name */
/* loaded from: classes5.dex */
public abstract class C$AutoValue_PeopleApiAffinity extends PeopleApiAffinity {
    public final double a;
    public final String b;
    public final AffinityMetadata c;
    public final boolean d;

    public C$AutoValue_PeopleApiAffinity(double d, String str, AffinityMetadata affinityMetadata, boolean z) {
        this.a = d;
        if (str != null) {
            this.b = str;
            if (affinityMetadata != null) {
                this.c = affinityMetadata;
                this.d = z;
                return;
            }
            throw new NullPointerException("Null affinityMetadata");
        }
        throw new NullPointerException("Null loggingId");
    }

    @Override // com.google.android.libraries.social.populous.core.PeopleApiAffinity
    public final double a() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.populous.core.PeopleApiAffinity
    public final String b() {
        return this.b;
    }

    @Override // com.google.android.libraries.social.populous.core.PeopleApiAffinity
    public final AffinityMetadata c() {
        return this.c;
    }

    @Override // com.google.android.libraries.social.populous.core.PeopleApiAffinity
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PeopleApiAffinity) {
            PeopleApiAffinity peopleApiAffinity = (PeopleApiAffinity) obj;
            if (Double.doubleToLongBits(this.a) == Double.doubleToLongBits(peopleApiAffinity.a()) && this.b.equals(peopleApiAffinity.b()) && this.c.equals(peopleApiAffinity.c()) && this.d == peopleApiAffinity.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.d ? 1237 : 1231) ^ ((((((((int) ((Double.doubleToLongBits(this.a) >>> 32) ^ Double.doubleToLongBits(this.a))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        double d = this.a;
        String str = this.b;
        String valueOf = String.valueOf(this.c);
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(str.length() + 99 + String.valueOf(valueOf).length());
        sb.append("PeopleApiAffinity{value=");
        sb.append(d);
        sb.append(", loggingId=");
        sb.append(str);
        sb.append(", affinityMetadata=");
        sb.append(valueOf);
        sb.append(", isPopulated=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

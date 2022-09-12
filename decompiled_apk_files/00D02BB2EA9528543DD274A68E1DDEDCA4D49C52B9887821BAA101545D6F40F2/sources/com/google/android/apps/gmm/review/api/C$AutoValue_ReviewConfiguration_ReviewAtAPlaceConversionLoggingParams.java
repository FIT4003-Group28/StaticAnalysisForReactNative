package com.google.android.apps.gmm.review.api;
/* compiled from: PG */
/* renamed from: com.google.android.apps.gmm.review.api.$AutoValue_ReviewConfiguration_ReviewAtAPlaceConversionLoggingParams  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_ReviewConfiguration_ReviewAtAPlaceConversionLoggingParams extends ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams {
    public final ckdw a;

    public C$AutoValue_ReviewConfiguration_ReviewAtAPlaceConversionLoggingParams(ckdw ckdwVar) {
        if (ckdwVar != null) {
            this.a = ckdwVar;
            return;
        }
        throw new NullPointerException("Null conversionMethodKey");
    }

    @Override // com.google.android.apps.gmm.review.api.ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams
    public final ckdw a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams)) {
            return false;
        }
        return this.a.equals(((ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 59);
        sb.append("ReviewAtAPlaceConversionLoggingParams{conversionMethodKey=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

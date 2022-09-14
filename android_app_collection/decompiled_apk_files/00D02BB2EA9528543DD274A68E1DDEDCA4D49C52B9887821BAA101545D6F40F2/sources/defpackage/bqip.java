package defpackage;

import com.google.android.apps.gmm.review.api.AutoValue_ReviewConfiguration_ReviewAtAPlaceConversionLoggingParams;
import com.google.android.apps.gmm.review.api.ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams;
/* compiled from: PG */
/* renamed from: bqip  reason: default package */
/* loaded from: classes4.dex */
public final class bqip extends bqjg {
    private ckdw a;

    @Override // defpackage.bqjg
    public final void b(ckdw ckdwVar) {
        if (ckdwVar != null) {
            this.a = ckdwVar;
            return;
        }
        throw new NullPointerException("Null conversionMethodKey");
    }

    @Override // defpackage.bqjg
    public final ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams a() {
        String str = this.a == null ? " conversionMethodKey" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new AutoValue_ReviewConfiguration_ReviewAtAPlaceConversionLoggingParams(this.a);
    }
}

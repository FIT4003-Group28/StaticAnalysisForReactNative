package defpackage;

import com.google.android.apps.gmm.review.api.ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdjo  reason: default package */
/* loaded from: classes4.dex */
public class cdjo extends dbrh<ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams, cdph> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams b(cdph cdphVar) {
        cdph cdphVar2 = cdphVar;
        bqjg b = ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams.b();
        if ((cdphVar2.a & 1) != 0) {
            dbrh<cdpg, ckdw> k = cdnt.a.k();
            cdpg b2 = cdpg.b(cdphVar2.b);
            if (b2 == null) {
                b2 = cdpg.UNKNOWN_METHOD;
            }
            b.b(k.NV(b2));
        }
        return b.a();
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ cdph c(ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams reviewConfiguration$ReviewAtAPlaceConversionLoggingParams) {
        cdpe bZ = cdph.c.bZ();
        cdpg NV = cdnt.a.NV(reviewConfiguration$ReviewAtAPlaceConversionLoggingParams.a());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cdph cdphVar = (cdph) bZ.b;
        cdphVar.b = NV.e;
        cdphVar.a |= 1;
        return bZ.bK();
    }
}

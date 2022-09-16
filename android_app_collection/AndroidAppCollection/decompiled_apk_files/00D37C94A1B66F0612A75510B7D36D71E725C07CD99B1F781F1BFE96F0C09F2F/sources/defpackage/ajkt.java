package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: ajkt  reason: default package */
/* loaded from: classes.dex */
public final class ajkt extends cyp {
    ajkv a;
    private final String[] e = {"clock", "conversionContext", "executor", "image", "imageCaches", "imageManager", "imagePrefetchRangeRatio", "imageProcessorExtensionResolver", "imageTransitionType", "logger", "reportMissingImageSources", "thumbnailResolutionType"};
    public final BitSet d = new BitSet(12);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(ajkt ajktVar, cyv cyvVar, ajkv ajkvVar) {
        super.w(cyvVar, ajkvVar);
        ajktVar.a = ajkvVar;
        ajktVar.d.clear();
    }

    @Override // defpackage.cyp
    public final /* bridge */ /* synthetic */ cyr a() {
        o(12, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (ajkv) cyrVar;
    }
}

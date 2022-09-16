package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: tcc  reason: default package */
/* loaded from: classes4.dex */
public final class tcc extends cyp {
    tcd a;
    private final String[] e = {"image", "imagePrefetchRangeRatio", "imageProcessorExtensionResolver", "imageTransitionType", "logger", "reportMissingImageSources"};
    public final BitSet d = new BitSet(6);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(tcc tccVar, cyv cyvVar, tcd tcdVar) {
        super.w(cyvVar, tcdVar);
        tccVar.a = tcdVar;
        tccVar.d.clear();
    }

    @Override // defpackage.cyp
    public final /* bridge */ /* synthetic */ cyr a() {
        o(6, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (tcd) cyrVar;
    }
}

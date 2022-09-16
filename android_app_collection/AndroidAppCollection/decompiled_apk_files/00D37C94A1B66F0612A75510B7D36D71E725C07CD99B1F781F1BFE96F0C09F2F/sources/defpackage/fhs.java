package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: fhs  reason: default package */
/* loaded from: classes3.dex */
public final class fhs extends cyp {
    fhu a;
    private final String[] e = {"clock", "commandResolver", "conversionContext", "executor", "imageCaches", "imageManager", "imagePrefetchRangeRatio", "logger", "zoomType"};
    public final BitSet d = new BitSet(9);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(fhs fhsVar, cyv cyvVar, fhu fhuVar) {
        super.w(cyvVar, fhuVar);
        fhsVar.a = fhuVar;
        fhsVar.d.clear();
    }

    @Override // defpackage.cyp
    public final /* bridge */ /* synthetic */ cyr a() {
        o(9, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (fhu) cyrVar;
    }
}

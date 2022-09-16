package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: gqt  reason: default package */
/* loaded from: classes3.dex */
public final class gqt extends cyp {
    gqu a;
    private final String[] e = {"clipsEnableDragToScroll", "onScrollListener", "storyboardClient", "totalTimeWindowMs", "vodDurationMs"};
    public final BitSet d = new BitSet(5);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(gqt gqtVar, cyv cyvVar, gqu gquVar) {
        super.w(cyvVar, gquVar);
        gqtVar.a = gquVar;
        gqtVar.d.clear();
    }

    @Override // defpackage.cyp
    public final /* bridge */ /* synthetic */ cyr a() {
        o(5, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (gqu) cyrVar;
    }
}

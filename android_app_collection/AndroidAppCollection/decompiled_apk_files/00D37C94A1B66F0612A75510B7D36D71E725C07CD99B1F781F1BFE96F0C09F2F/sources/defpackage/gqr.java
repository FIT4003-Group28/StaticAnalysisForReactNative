package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: gqr  reason: default package */
/* loaded from: classes3.dex */
public final class gqr extends cyp {
    public gqs a;
    private final String[] e = {"clipCreationScrubberViewController", "clipsEnableDragToScroll", "storyboardClient", "vodDurationMs", "windowSizeMs"};
    public final BitSet d = new BitSet(5);

    public static /* bridge */ /* synthetic */ void c(gqr gqrVar, cyv cyvVar, gqs gqsVar) {
        super.w(cyvVar, gqsVar);
        gqrVar.a = gqsVar;
        gqrVar.d.clear();
    }

    @Override // defpackage.cyp
    public final /* bridge */ /* synthetic */ cyr a() {
        o(5, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (gqs) cyrVar;
    }
}

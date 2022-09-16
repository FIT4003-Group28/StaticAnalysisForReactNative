package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: gqp  reason: default package */
/* loaded from: classes3.dex */
public final class gqp extends cyp {
    gqq a;
    private final String[] e = {"clipCreationScrubberViewController", "clipsEnableDragToScroll"};
    public final BitSet d = new BitSet(2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(gqp gqpVar, cyv cyvVar, gqq gqqVar) {
        super.w(cyvVar, gqqVar);
        gqpVar.a = gqqVar;
        gqpVar.d.clear();
    }

    @Override // defpackage.cyp
    public final /* bridge */ /* synthetic */ cyr a() {
        o(2, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (gqq) cyrVar;
    }
}

package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: gqn  reason: default package */
/* loaded from: classes3.dex */
public final class gqn extends cyp {
    gqo a;
    private final String[] e = {"clipCreationScrubberViewController"};
    public final BitSet d = new BitSet(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(gqn gqnVar, cyv cyvVar, gqo gqoVar) {
        super.w(cyvVar, gqoVar);
        gqnVar.a = gqoVar;
        gqnVar.d.clear();
    }

    @Override // defpackage.cyp
    public final /* bridge */ /* synthetic */ cyr a() {
        o(1, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (gqo) cyrVar;
    }
}

package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: stt  reason: default package */
/* loaded from: classes4.dex */
public final class stt extends cyp {
    stv a;
    private final String[] e = {"children", "collectionType", "commandResolver", "conversionContext", "onScrollBeganDraggingCommandFuture", "onScrollCommandFuture", "onScrollDidStopCommandFuture", "scrollToItemCommandHandler"};
    public final BitSet d = new BitSet(8);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(stt sttVar, cyv cyvVar, stv stvVar) {
        super.w(cyvVar, stvVar);
        sttVar.a = stvVar;
        sttVar.d.clear();
    }

    @Override // defpackage.cyp
    public final /* bridge */ /* synthetic */ cyr a() {
        o(8, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (stv) cyrVar;
    }
}

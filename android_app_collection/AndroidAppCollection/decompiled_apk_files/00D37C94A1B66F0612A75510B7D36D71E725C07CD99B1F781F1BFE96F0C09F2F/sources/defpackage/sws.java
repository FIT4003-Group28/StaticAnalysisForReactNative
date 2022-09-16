package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: sws  reason: default package */
/* loaded from: classes4.dex */
public final class sws extends cyp {
    public swt a;
    private final String[] e = {"children", "commandResolver", "conversionContext", "flexDirection", "logger", "onScrollBeganDraggingCommandFuture", "onScrollCommandFuture", "onScrollDidStopCommandFuture", "scrollableContainerType"};
    public final BitSet d = new BitSet(9);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(sws swsVar, cyv cyvVar, swt swtVar) {
        super.w(cyvVar, swtVar);
        swsVar.a = swtVar;
        swsVar.d.clear();
    }

    @Override // defpackage.cyp
    public final /* bridge */ /* synthetic */ cyr a() {
        o(9, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (swt) cyrVar;
    }
}

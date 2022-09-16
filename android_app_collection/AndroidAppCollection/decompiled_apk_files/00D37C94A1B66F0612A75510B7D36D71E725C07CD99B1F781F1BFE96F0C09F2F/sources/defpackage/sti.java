package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: sti  reason: default package */
/* loaded from: classes4.dex */
public final class sti extends cyp {
    stj a;
    private final String[] e = {"commandResolver", "conversionContext", "logger", "onFrameCompleteCommandFuture", "onProgressCompleteCommandFuture", "type"};
    public final BitSet d = new BitSet(6);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(sti stiVar, cyv cyvVar, stj stjVar) {
        super.w(cyvVar, stjVar);
        stiVar.a = stjVar;
        stiVar.d.clear();
    }

    @Override // defpackage.cyp
    public final /* bridge */ /* synthetic */ cyr a() {
        o(6, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (stj) cyrVar;
    }
}

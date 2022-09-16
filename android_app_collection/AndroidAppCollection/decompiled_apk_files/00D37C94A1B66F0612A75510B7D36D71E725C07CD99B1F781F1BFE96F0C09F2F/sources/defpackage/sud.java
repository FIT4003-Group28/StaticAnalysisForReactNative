package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: sud  reason: default package */
/* loaded from: classes4.dex */
public final class sud extends cyp {
    suf a;
    private final String[] e = {"conversionContext", "crashOnTemplateResolutionError", "debuggerClient", "debuggerStatus", "devServerEnabled", "elementSource", "logger", "templatePerformanceLogger", "typeAndProperties"};
    public final BitSet d = new BitSet(9);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(sud sudVar, cyv cyvVar, suf sufVar) {
        super.w(cyvVar, sufVar);
        sudVar.a = sufVar;
        sudVar.d.clear();
    }

    @Override // defpackage.cyp
    public final /* bridge */ /* synthetic */ cyr a() {
        o(9, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (suf) cyrVar;
    }
}

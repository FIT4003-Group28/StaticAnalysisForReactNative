package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: akro  reason: default package */
/* loaded from: classes.dex */
public final class akro extends cyp {
    akrp a;
    private final String[] e = {"analyticsChartType"};
    public final BitSet d = new BitSet(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(akro akroVar, cyv cyvVar, akrp akrpVar) {
        super.w(cyvVar, akrpVar);
        akroVar.a = akrpVar;
        akroVar.d.clear();
    }

    @Override // defpackage.cyp
    public final /* bridge */ /* synthetic */ cyr a() {
        o(1, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (akrp) cyrVar;
    }
}

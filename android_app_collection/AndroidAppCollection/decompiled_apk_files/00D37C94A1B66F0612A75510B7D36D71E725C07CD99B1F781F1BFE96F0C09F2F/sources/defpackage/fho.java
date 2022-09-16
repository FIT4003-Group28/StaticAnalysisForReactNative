package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: fho  reason: default package */
/* loaded from: classes3.dex */
public final class fho extends cyp {
    fhp a;
    private final String[] e = {"children", "conversionContext", "flexDirection"};
    public final BitSet d = new BitSet(3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(fho fhoVar, cyv cyvVar, fhp fhpVar) {
        super.w(cyvVar, fhpVar);
        fhoVar.a = fhpVar;
        fhoVar.d.clear();
    }

    @Override // defpackage.cyp
    public final /* bridge */ /* synthetic */ cyr a() {
        o(3, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (fhp) cyrVar;
    }
}

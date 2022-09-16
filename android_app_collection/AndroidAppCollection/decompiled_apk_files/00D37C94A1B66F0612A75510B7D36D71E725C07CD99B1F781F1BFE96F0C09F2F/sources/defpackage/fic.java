package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: fic  reason: default package */
/* loaded from: classes3.dex */
public final class fic extends cyp {
    fie a;
    private final String[] e = {"children", "flexDirection", "playerTrackerComponent", "uiHandler"};
    public final BitSet d = new BitSet(4);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(fic ficVar, cyv cyvVar, fie fieVar) {
        super.w(cyvVar, fieVar);
        ficVar.a = fieVar;
        ficVar.d.clear();
    }

    @Override // defpackage.cyp
    public final /* bridge */ /* synthetic */ cyr a() {
        o(4, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (fie) cyrVar;
    }
}

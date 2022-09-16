package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: fiu  reason: default package */
/* loaded from: classes3.dex */
public final class fiu extends cyp {
    fiv a;
    private final String[] e = {"commandResolver", "currentProgress", "logger", "maxIndex"};
    public final BitSet d = new BitSet(4);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(fiu fiuVar, cyv cyvVar, fiv fivVar) {
        super.w(cyvVar, fivVar);
        fiuVar.a = fivVar;
        fiuVar.d.clear();
    }

    @Override // defpackage.cyp
    public final /* bridge */ /* synthetic */ cyr a() {
        o(4, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (fiv) cyrVar;
    }
}

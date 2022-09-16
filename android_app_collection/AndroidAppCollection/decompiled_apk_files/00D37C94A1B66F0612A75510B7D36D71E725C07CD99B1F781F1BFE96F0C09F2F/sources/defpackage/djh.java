package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: djh  reason: default package */
/* loaded from: classes3.dex */
public final class djh extends cyp {
    public djj a;
    private final String[] e = {"contentProps"};
    public final BitSet d = new BitSet(1);

    public static /* bridge */ /* synthetic */ void c(djh djhVar, cyv cyvVar, djj djjVar) {
        super.w(cyvVar, djjVar);
        djhVar.a = djjVar;
        djhVar.d.clear();
    }

    @Override // defpackage.cyp
    public final /* bridge */ /* synthetic */ cyr a() {
        o(1, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (djj) cyrVar;
    }
}

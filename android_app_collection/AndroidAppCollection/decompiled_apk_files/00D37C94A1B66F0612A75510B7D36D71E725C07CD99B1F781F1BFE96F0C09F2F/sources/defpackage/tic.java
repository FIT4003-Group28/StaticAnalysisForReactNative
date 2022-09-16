package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: tic */
/* loaded from: classes4.dex */
public final class tic extends cyp {
    tie a;
    private final String[] e = {"componentCallable"};
    public final BitSet d = new BitSet(1);

    public static /* bridge */ /* synthetic */ void d(tic ticVar, cyv cyvVar, tie tieVar) {
        super.w(cyvVar, tieVar);
        ticVar.a = tieVar;
        ticVar.d.clear();
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (tie) cyrVar;
    }

    @Override // defpackage.cyp
    /* renamed from: c */
    public final tie a() {
        o(1, this.d, this.e);
        return this.a;
    }
}

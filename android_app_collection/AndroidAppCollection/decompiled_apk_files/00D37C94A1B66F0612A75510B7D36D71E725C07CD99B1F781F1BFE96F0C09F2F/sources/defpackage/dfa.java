package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: dfa  reason: default package */
/* loaded from: classes3.dex */
public final class dfa extends cyp {
    private static final String[] a = {"delegate"};
    private final BitSet d = new BitSet(1);
    private dfb e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void d(dfa dfaVar, cyv cyvVar, dfb dfbVar) {
        super.w(cyvVar, dfbVar);
        dfaVar.e = dfbVar;
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.e = (dfb) cyrVar;
    }

    @Override // defpackage.cyp
    /* renamed from: c */
    public final dfb a() {
        o(1, this.d, a);
        return this.e;
    }

    public final void e(cyr cyrVar) {
        this.d.set(0);
        this.e.a = cyrVar;
    }
}

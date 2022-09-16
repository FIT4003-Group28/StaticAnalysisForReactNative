package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: tgb  reason: default package */
/* loaded from: classes4.dex */
public final class tgb extends cyp {
    tgd a;
    private final String[] d = {"componentCallable"};
    private final BitSet e = new BitSet(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void d(tgb tgbVar, cyv cyvVar, tgd tgdVar) {
        super.w(cyvVar, tgdVar);
        tgbVar.a = tgdVar;
        tgbVar.e.clear();
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (tgd) cyrVar;
    }

    @Override // defpackage.cyp
    /* renamed from: c */
    public final tgd a() {
        o(1, this.e, this.d);
        return this.a;
    }

    public final void e(tfm tfmVar) {
        this.a.a = tfmVar;
        this.e.set(0);
    }

    public final void f(tda tdaVar) {
        this.a.b = tdaVar;
    }
}

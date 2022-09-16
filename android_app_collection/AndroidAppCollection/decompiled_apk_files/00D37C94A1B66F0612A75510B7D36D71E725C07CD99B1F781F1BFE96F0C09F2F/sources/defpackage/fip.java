package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: fip  reason: default package */
/* loaded from: classes3.dex */
public final class fip extends cyp {
    fiq a;
    private final String[] d = {"commandResolver", "playbackServiceComponent"};
    private final BitSet e = new BitSet(2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(fip fipVar, cyv cyvVar, fiq fiqVar) {
        super.w(cyvVar, fiqVar);
        fipVar.a = fiqVar;
        fipVar.e.clear();
    }

    @Override // defpackage.cyp
    public final /* bridge */ /* synthetic */ cyr a() {
        o(2, this.e, this.d);
        return this.a;
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (fiq) cyrVar;
    }

    public final void d(axnm axnmVar) {
        this.a.a = axnmVar;
        this.e.set(0);
    }

    public final void e(airw airwVar) {
        this.a.d = airwVar;
        this.e.set(1);
    }
}

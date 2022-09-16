package defpackage;

import java.util.BitSet;
import java.util.Map;
/* compiled from: PG */
/* renamed from: swy  reason: default package */
/* loaded from: classes4.dex */
public final class swy extends cyp {
    sxa a;
    private final String[] d = {"commandResolver", "conversionContext", "drawableRequester", "logger", "styleRunExtensionConverters", "textType", "typefaceProvider"};
    private final BitSet e = new BitSet(7);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void d(swy swyVar, cyv cyvVar, sxa sxaVar) {
        super.w(cyvVar, sxaVar);
        swyVar.a = sxaVar;
        swyVar.e.clear();
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (sxa) cyrVar;
    }

    @Override // defpackage.cyp
    /* renamed from: c */
    public final sxa a() {
        o(7, this.e, this.d);
        return this.a;
    }

    public final void e(tcu tcuVar) {
        this.a.b = tcuVar;
        this.e.set(0);
    }

    public final void f(tda tdaVar) {
        this.a.c = tdaVar;
        this.e.set(1);
    }

    public final void g(tdg tdgVar) {
        this.a.d = tdgVar;
        this.e.set(2);
    }

    public final void h(teb tebVar) {
        this.a.v = tebVar;
        this.e.set(3);
    }

    public final void i(Map map) {
        this.a.w = map;
        this.e.set(4);
    }

    public final void j(axnk axnkVar) {
        this.a.x = axnkVar;
        this.e.set(5);
    }

    public final void k(tfj tfjVar) {
        this.a.y = tfjVar;
        this.e.set(6);
    }
}

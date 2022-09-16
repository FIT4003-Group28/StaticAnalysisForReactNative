package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: dig  reason: default package */
/* loaded from: classes3.dex */
public final class dig extends cyp {
    public dii a;
    cyv d;
    private final String[] f = {"section"};
    public final BitSet e = new BitSet(1);

    public static /* bridge */ /* synthetic */ void d(dig digVar, cyv cyvVar, dii diiVar) {
        super.w(cyvVar, diiVar);
        digVar.a = diiVar;
        digVar.d = cyvVar;
        digVar.e.clear();
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (dii) cyrVar;
    }

    @Override // defpackage.cyp
    /* renamed from: c */
    public final dii a() {
        o(1, this.e, this.f);
        dii diiVar = this.a;
        int i = dii.M;
        String n = diiVar.n();
        das dasVar = this.a.H;
        if (dasVar == null) {
            dasVar = dii.an(this.d, n, -1505688212);
        }
        dii diiVar2 = this.a;
        diiVar2.H = dasVar;
        das dasVar2 = diiVar2.I;
        if (dasVar2 == null) {
            dasVar2 = dii.an(this.d, n, -238194236);
        }
        dii diiVar3 = this.a;
        diiVar3.I = dasVar2;
        return diiVar3;
    }

    public final void e(float f) {
        this.a.a = this.b.a(f);
    }

    @Override // defpackage.cyp
    /* renamed from: f */
    public final void s(boolean z) {
        this.a.c = z;
    }

    public final void g(ya yaVar) {
        this.a.y = yaVar;
    }

    public final void h(float f) {
        this.a.z = this.b.a(f);
    }

    public final void i(float f) {
        this.a.E = this.b.a(f);
    }

    public final void j(float f) {
        this.a.G = this.b.a(f);
    }
}

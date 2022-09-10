package defpackage;
/* compiled from: PG */
/* renamed from: bfvy  reason: default package */
/* loaded from: classes3.dex */
public final class bfvy implements bcbv {
    public final dehn<dcdc<dweu>> a;
    protected final dcdc<dweu> c;
    public final dcdc<bclt> d;

    public bfvy(@dzsi ilo iloVar, bcli bcliVar, bcku bckuVar, bckr bckrVar, bcmm bcmmVar) {
        int a;
        dixe dixeVar = iloVar.h().bo;
        dcdc<dweu> r = dcdc.r((dixeVar == null ? dixe.b : dixeVar).a);
        this.c = r;
        dccx F = dcdc.F();
        if (r != null) {
            int size = r.size();
            for (int i = 0; i < size; i++) {
                dweu dweuVar = r.get(i);
                int a2 = dpoe.a(dweuVar.l);
                if (((a2 == 0 || a2 != 2) && ((a = dpoe.a(dweuVar.l)) == 0 || a != 3)) || dweuVar.k != 0) {
                    F.g(bcmmVar.a(bcliVar, bckuVar, bckrVar, dweuVar, iloVar));
                }
            }
        }
        this.d = F.f();
        this.a = deha.a(this.c);
    }

    @Override // defpackage.bcbv
    public final dehn<dcdc<dweu>> a() {
        throw null;
    }

    @Override // defpackage.bcbv
    public final dcdc<bclt> d() {
        throw null;
    }
}

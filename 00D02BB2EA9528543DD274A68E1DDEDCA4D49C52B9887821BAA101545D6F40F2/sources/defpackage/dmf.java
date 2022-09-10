package defpackage;
/* compiled from: PG */
/* renamed from: dmf  reason: default package */
/* loaded from: classes6.dex */
public final class dmf implements dfeq<dfhp> {
    final /* synthetic */ dmi a;
    final /* synthetic */ dmr b;
    final /* synthetic */ dkk c;
    final /* synthetic */ dhh d;

    public dmf(dmi dmiVar, dmr dmrVar, dkk dkkVar, dhh dhhVar) {
        this.a = dmiVar;
        this.b = dmrVar;
        this.c = dkkVar;
        this.d = dhhVar;
    }

    @Override // defpackage.dfeq
    public final /* bridge */ /* synthetic */ void n(dfhp dfhpVar) {
        dme dmeVar;
        dfhp dfhpVar2 = dfhpVar;
        dzvx.c(dfhpVar2, "newState");
        synchronized (this.a.a) {
            dmeVar = this.a.b.get(this.b);
        }
        if (dmeVar == null) {
            return;
        }
        this.c.n(dfhpVar2);
        dna.c(dmeVar.a, this.d, dna.b(dmeVar.c), dfhpVar2);
        dzvx.c(dfhpVar2, "<set-?>");
        dmeVar.c = dfhpVar2;
        synchronized (this.a.a) {
            this.a.b.put(this.b, dmeVar);
        }
    }
}

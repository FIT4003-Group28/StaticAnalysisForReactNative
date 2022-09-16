package defpackage;
/* compiled from: PG */
/* renamed from: agiw  reason: default package */
/* loaded from: classes.dex */
public final class agiw implements agmc {
    public final azqb a;
    public final azqb b;
    private final azqb c;

    public agiw(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        this.c = azqbVar;
        this.a = azqbVar2;
        this.b = azqbVar3;
    }

    @Override // defpackage.agmc
    public final agqm a(String str, long j) {
        if (!((agis) ((axov) this.b).a).z()) {
            return null;
        }
        zgh.m(str);
        return b(str, new agke((aipk) this.c.get(), j));
    }

    @Override // defpackage.agmc
    public final agqm b(String str, agke agkeVar) {
        zgh.m(str);
        if (!((agis) ((axov) this.b).a).z()) {
            return null;
        }
        return ((aglj) this.a.get()).J(str, agkeVar);
    }

    @Override // defpackage.agmc
    public final void c(String str, int i) {
        if (!((agis) ((axov) this.b).a).z()) {
            return;
        }
        zgh.m(str);
        ((aglj) this.a.get()).af(str, i);
    }

    @Override // defpackage.agmc
    public final void d(agql agqlVar) {
        if (!((agis) ((axov) this.b).a).z()) {
            return;
        }
        ((aglj) this.a.get()).ag(agqlVar);
    }

    @Override // defpackage.agmc
    public final void e() {
    }

    @Override // defpackage.agmc
    public final void f(String str, int i, long j) {
        if (!((agis) ((axov) this.b).a).z()) {
            return;
        }
        zgh.m(str);
        ((aglj) this.a.get()).ah(str, i, j);
    }

    @Override // defpackage.agmc
    public final void g(String str, int i, String str2) {
        if (!((agis) ((axov) this.b).a).z()) {
            return;
        }
        ((aglj) this.a.get()).Y(str, i, str2);
    }
}

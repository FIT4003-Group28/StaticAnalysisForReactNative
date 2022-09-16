package defpackage;
/* compiled from: PG */
/* renamed from: agwt  reason: default package */
/* loaded from: classes.dex */
public final class agwt {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final aacz d;

    public agwt(aacz aaczVar, azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        this.d = aaczVar;
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
    }

    public final agws a(agql agqlVar) {
        if (((agrf) this.a.get()).a().q().equals("NO_OP_STORE_TAG")) {
            return null;
        }
        apyy b = this.d.b();
        if ((b.b & 65536) == 0) {
            return null;
        }
        atqk atqkVar = b.m;
        if (atqkVar == null) {
            atqkVar = atqk.a;
        }
        int i = atqkVar.d;
        if (i == 1) {
            return ((agwm) this.b.get()).a(agqlVar);
        }
        if (i == 2) {
            return ((agwq) this.c.get()).a(agqlVar);
        }
        if (i != 3) {
            return null;
        }
        agws a = ((agwm) this.b.get()).a(agqlVar);
        ((agwq) this.c.get()).a(agqlVar);
        return new agws(a.a, a.b, 4, a.c);
    }
}

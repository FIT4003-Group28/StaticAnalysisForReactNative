package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: axhy  reason: default package */
/* loaded from: classes3.dex */
final class axhy implements degu<dhyy> {
    final /* synthetic */ String a;
    final /* synthetic */ dqaw b;
    final /* synthetic */ axib c;

    public axhy(axib axibVar, String str, dqaw dqawVar) {
        this.c = axibVar;
        this.a = str;
        this.b = dqawVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.c.u(this.a, false);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dhyy dhyyVar) {
        dqaw dqawVar;
        dhyy dhyyVar2 = dhyyVar;
        axib axibVar = this.c;
        String str = this.a;
        dqae dqaeVar = dhyyVar2.a;
        if (dqaeVar == null) {
            dqaeVar = dqae.c;
        }
        dqau dqauVar = dqaeVar.b;
        if (dqauVar == null) {
            dqauVar = dqau.e;
        }
        dqaw dqawVar2 = dqauVar.c;
        if (dqawVar2 == null) {
            dqawVar2 = dqaw.d;
        }
        axibVar.q(str, dqawVar2);
        if (this.c.a()) {
            this.c.r(axgv.a);
        } else if (this.c.n != null) {
            this.c.n.d = dbpy.a;
        }
        int a = dhyx.a(dhyyVar2.c);
        if (a == 0 || a != 2 || (dqawVar = this.b) == null) {
            return;
        }
        dqae dqaeVar2 = dhyyVar2.a;
        if (dqaeVar2 == null) {
            dqaeVar2 = dqae.c;
        }
        dqau dqauVar2 = dqaeVar2.b;
        if (dqauVar2 == null) {
            dqauVar2 = dqau.e;
        }
        dqaw dqawVar3 = dqauVar2.c;
        if (dqawVar3 == null) {
            dqawVar3 = dqaw.d;
        }
        if ((dqawVar.a & 1) == 0) {
            return;
        }
        dcep<dfqe> dcepVar = axib.b;
        dfqe b = dfqe.b(dqawVar.b);
        if (b == null) {
            b = dfqe.UNDEFINED_STATE;
        }
        if (!dcepVar.contains(b) || (dqawVar3.a & 1) == 0) {
            return;
        }
        dcep<dfqe> dcepVar2 = axib.c;
        dfqe b2 = dfqe.b(dqawVar3.b);
        if (b2 == null) {
            b2 = dfqe.UNDEFINED_STATE;
        }
        if (!dcepVar2.contains(b2)) {
            return;
        }
        axib axibVar2 = this.c;
        Map<String, axfm> map = axibVar2.k;
        btlu j = axibVar2.e.j();
        dbsk.s(j);
        axfm axfmVar = map.get(j.j());
        if (axfmVar != null) {
            axfmVar.b();
        }
        axfm axfmVar2 = this.c.k.get(this.a);
        if (axfmVar2 == null) {
            return;
        }
        axfmVar2.c();
    }
}

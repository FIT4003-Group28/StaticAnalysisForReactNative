package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: axhz  reason: default package */
/* loaded from: classes3.dex */
final class axhz implements degu<djzu> {
    final /* synthetic */ String a;
    final /* synthetic */ dqaw b;
    final /* synthetic */ axib c;

    public axhz(axib axibVar, String str, dqaw dqawVar) {
        this.c = axibVar;
        this.a = str;
        this.b = dqawVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.c.u(this.a, false);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(djzu djzuVar) {
        djzu djzuVar2 = djzuVar;
        axib axibVar = this.c;
        String str = this.a;
        dqaw dqawVar = djzuVar2.b;
        if (dqawVar == null) {
            dqawVar = dqaw.d;
        }
        axibVar.q(str, dqawVar);
        dqaw dqawVar2 = this.b;
        if (dqawVar2 != null) {
            dqaw dqawVar3 = djzuVar2.b;
            if (dqawVar3 == null) {
                dqawVar3 = dqaw.d;
            }
            if ((dqawVar2.a & 1) == 0) {
                return;
            }
            dcep<dfqe> dcepVar = axib.c;
            dfqe b = dfqe.b(dqawVar2.b);
            if (b == null) {
                b = dfqe.UNDEFINED_STATE;
            }
            if (!dcepVar.contains(b) || (dqawVar3.a & 1) == 0) {
                return;
            }
            dfqe b2 = dfqe.b(dqawVar3.b);
            if (b2 == null) {
                b2 = dfqe.UNDEFINED_STATE;
            }
            if (b2 != dfqe.NOT_FOLLOWING) {
                return;
            }
            axib axibVar2 = this.c;
            Map<String, axfm> map = axibVar2.k;
            btlu j = axibVar2.e.j();
            dbsk.s(j);
            axfm axfmVar = map.get(j.j());
            if (axfmVar != null) {
                axfmVar.d();
            }
            axfm axfmVar2 = this.c.k.get(this.a);
            if (axfmVar2 == null) {
                return;
            }
            axfmVar2.e();
        }
    }
}

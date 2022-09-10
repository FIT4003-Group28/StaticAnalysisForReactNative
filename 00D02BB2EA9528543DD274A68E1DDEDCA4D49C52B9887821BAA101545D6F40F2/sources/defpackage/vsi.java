package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: vsi  reason: default package */
/* loaded from: classes7.dex */
final class vsi implements vsy {
    final /* synthetic */ vsk a;

    public vsi(vsk vskVar) {
        this.a = vskVar;
    }

    @Override // defpackage.vsy
    public final void a(vuv vuvVar, albl alblVar, vtw vtwVar, @dzsi vue vueVar) {
        boolean z;
        altv c;
        bvrj.UI_THREAD.c();
        synchronized (this.a.e) {
            vsk vskVar = this.a;
            vskVar.a.S(vtwVar, vskVar.k);
            this.a.a.B(vtwVar.d);
            this.a.a.C(vtwVar.c);
            vsk vskVar2 = this.a;
            vskVar2.a.S(vueVar, vskVar2.l);
            vsk vskVar3 = this.a;
            vskVar3.k = vtwVar;
            vskVar3.l = vueVar;
            List<akpp> list = alblVar.b;
            amvh D = vuvVar.D();
            akqq akqqVar = D != null ? D.e : null;
            if (D == null || akqqVar == null) {
                z = false;
            } else {
                akqi akqiVar = D.d;
                this.a.b.b(akpp.r(akqqVar, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_GENERIC, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_LABEL_LAYOUT, akqiVar != null ? akqiVar.c : 0L));
                z = true;
            }
            if (list.size() == 1 && !z) {
                this.a.b.b(list.get(0));
                vsk vskVar4 = this.a;
                vskVar4.b.g(vskVar4.g);
                this.a.g.clear();
            } else {
                vsk vskVar5 = this.a;
                dcdc<hwb> e = vskVar5.b.e(list, dcep.K(vskVar5.g), true);
                this.a.g.clear();
                this.a.g.addAll(e);
                if (!z) {
                    this.a.b.c();
                }
            }
            if (vuvVar.G() == 1) {
                this.a.j = alblVar.c;
            } else if (vuvVar.G() == 2) {
                this.a.j = alblVar.d;
            }
            if (vuvVar.e() || this.a.h) {
                vsk vskVar6 = this.a;
                vskVar6.o(vskVar6.j, vuvVar.f());
            }
            amuo i = vuvVar.i();
            if (i != null && vuvVar.g() && (c = altv.c(i.H)) != null) {
                this.a.a.s.c(c.a);
            }
            dxio<axxl> dxioVar = this.a.c;
            if (dxioVar != null) {
                dxioVar.a().a(false);
            }
            Runnable C = vuvVar.C();
            if (C != null) {
                C.run();
            }
        }
    }
}

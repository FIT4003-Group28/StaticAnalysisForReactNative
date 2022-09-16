package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: bkad  reason: default package */
/* loaded from: classes3.dex */
final class bkad implements btzi<didg, didi> {
    final /* synthetic */ bkaf a;

    public bkad(bkaf bkafVar) {
        this.a = bkafVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<didg> btzrVar, btzy btzyVar) {
        if (this.a.d.a(btzrVar.a.b)) {
            this.a.e();
            this.a.d.b();
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<didg> btzrVar, didi didiVar) {
        didi didiVar2 = didiVar;
        if (!this.a.d.a(btzrVar.a.b)) {
            return;
        }
        bkaf bkafVar = this.a;
        dccx F = dcdc.F();
        Iterator<djbh> it = didiVar2.a.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                dcdc f = F.f();
                bkafVar.e();
                bkafVar.f.addAll(f);
                this.a.d.b();
                for (View view : cqkx.n(this.a)) {
                    RecyclerView recyclerView = (RecyclerView) cqkx.e(view, bjwz.a, RecyclerView.class);
                    if (recyclerView != null) {
                        recyclerView.n(0);
                    }
                }
                return;
            }
            djbh next = it.next();
            int i2 = next.a;
            if (i2 == 0) {
                i = 3;
            } else if (i2 == 1) {
                i = 1;
            } else if (i2 == 2) {
                i = 2;
            }
            int i3 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i3 == 0) {
                bjyc bjycVar = bkafVar.b;
                bwrs<ilo> bwrsVar = bkafVar.e;
                djsf djsfVar = i2 == 1 ? (djsf) next.b : djsf.c;
                ddde dddeVar = next.d;
                if (dddeVar == null) {
                    dddeVar = ddde.a;
                }
                dhkr dhkrVar = next.c;
                if (dhkrVar == null) {
                    dhkrVar = dhkr.b;
                }
                boolean z = dhkrVar.a;
                gga a = bjycVar.a.a();
                bjyc.a(a, 1);
                bjbu a2 = bjycVar.b.a();
                bjyc.a(a2, 2);
                bjgy a3 = bjycVar.c.a();
                bjyc.a(a3, 3);
                bjxv a4 = bjycVar.d.a();
                bjyc.a(a4, 4);
                bkaa a5 = bjycVar.e.a();
                bjyc.a(a5, 5);
                bjyc.a(bwrsVar, 6);
                bjyc.a(djsfVar, 7);
                bjyc.a(dddeVar, 8);
                F.g(new bjyb(a, a2, a3, a4, a5, bwrsVar, djsfVar, dddeVar, z));
            } else if (i3 == 1) {
                bjyj bjyjVar = bkafVar.c;
                bwrs<ilo> bwrsVar2 = bkafVar.e;
                djsh djshVar = i2 == 2 ? (djsh) next.b : djsh.e;
                ddde dddeVar2 = next.d;
                if (dddeVar2 == null) {
                    dddeVar2 = ddde.a;
                }
                dhkr dhkrVar2 = next.c;
                if (dhkrVar2 == null) {
                    dhkrVar2 = dhkr.b;
                }
                boolean z2 = dhkrVar2.a;
                gga a6 = bjyjVar.a.a();
                bjyj.a(a6, 1);
                bkpi a7 = bjyjVar.b.a();
                bjyj.a(a7, 2);
                bjxv a8 = bjyjVar.c.a();
                bjyj.a(a8, 3);
                bkaa a9 = bjyjVar.d.a();
                bjyj.a(a9, 4);
                bjhc a10 = bjyjVar.e.a();
                bjyj.a(a10, 5);
                bjyj.a(bwrsVar2, 6);
                bjyj.a(djshVar, 7);
                bjyj.a(dddeVar2, 8);
                F.g(new bjyi(a6, a7, a8, a9, a10, bwrsVar2, djshVar, dddeVar2, z2));
            }
        }
    }
}

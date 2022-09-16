package defpackage;

import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alzm  reason: default package */
/* loaded from: classes2.dex */
public final class alzm implements btzi<dmxh, dmxv> {
    final /* synthetic */ alzo a;
    final /* synthetic */ alzn b;

    public alzm(alzn alznVar, alzo alzoVar) {
        this.b = alznVar;
        this.a = alzoVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dmxh> btzrVar, btzy btzyVar) {
        if (btzyVar.equals(btzy.b) || btzyVar.equals(btzy.d) || btzyVar.equals(btzy.k)) {
            dsrj<dmyd> dsrjVar = btzrVar.a.b;
        }
        this.b.c(this.a, btzyVar);
        alza.b(this.b.c, alzn.d(this.a), btzrVar, btzyVar.d());
        this.b.a.add(btzyVar.d());
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dmxh> btzrVar, dmxv dmxvVar) {
        dcae<ckjk> dcaeVar;
        ckjk d;
        dmxv dmxvVar2 = dmxvVar;
        new ArrayList();
        try {
            alzo alzoVar = this.a;
            dbsk.h(dmxvVar2.a.size() == ((alzs) alzoVar).a.size(), "The received painted region list does not contain same number of painted regions as expected. Expected: (%s) Received: (%s)", ((alzs) alzoVar).a.size(), dmxvVar2.a.size());
            ArrayList<dbsi> arrayList = new ArrayList();
            for (int i = 0; i < dmxvVar2.a.size(); i++) {
                dmxt dmxtVar = dmxvVar2.a.get(i);
                int a = dmxs.a(dmxtVar.b);
                int i2 = a == 0 ? 1 : a;
                if (i2 == 3 || i2 == 4) {
                    int i3 = dmxtVar.b;
                    ((alzs) alzoVar).a.get(i);
                }
                dmxh dmxhVar = ((alzs) alzoVar).b;
                if (dmxhVar == null) {
                    String valueOf = String.valueOf(((alzs) alzoVar).f);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56);
                    sb.append("A paint request template not found for given tile type: ");
                    sb.append(valueOf);
                    throw new IllegalArgumentException(sb.toString());
                }
                arrayList.add(dbsi.a(((alzs) alzoVar).a.get(i), new alzt(dmxtVar, i2, ((alzs) alzoVar).e, ((alzs) alzoVar).d, dcdc.r(dmxhVar.h))));
            }
            alzn alznVar = this.b;
            for (dbsi dbsiVar : arrayList) {
                alzt alztVar = (alzt) dbsiVar.b;
                for (alzr alzrVar : alznVar.e(((alzr) dbsiVar.a).f())) {
                    amap e = alzrVar.e();
                    if (e != null) {
                        amaw amawVar = e.b;
                        amawVar.H(amawVar.t, new aman(e, alztVar));
                    }
                }
            }
            alza.b(this.b.c, alzn.d(this.a), btzrVar, ckjk.SUCCESS);
            dcaeVar = this.b.a;
            d = ckjk.SUCCESS;
        } catch (IllegalArgumentException e2) {
            btzy a2 = btzy.a(e2);
            this.b.c(this.a, a2);
            alza.b(this.b.c, alzn.d(this.a), btzrVar, a2.d());
            dcaeVar = this.b.a;
            d = a2.d();
        }
        dcaeVar.add(d);
    }
}

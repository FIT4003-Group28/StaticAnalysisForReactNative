package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bjeo  reason: default package */
/* loaded from: classes3.dex */
public class bjeo implements bjel {
    public final List<bkaq> a = dchl.a();
    final List<dqcq> b;
    public final List<dqcq> c;
    public final bjej d;
    final bkao e;

    public bjeo(cqhn cqhnVar, bkar bkarVar, bjek bjekVar, cjtd cjtdVar, List<dqcq> list, List<dqcq> list2, final bjed bjedVar) {
        ArrayList a = dchl.a();
        this.b = a;
        ArrayList a2 = dchl.a();
        this.c = a2;
        a.addAll(list2);
        a2.addAll(list2);
        int size = a2.size();
        jhn jhnVar = new jhn(this, bjedVar) { // from class: bjem
            private final bjeo a;
            private final bjed b;

            {
                this.a = this;
                this.b = bjedVar;
            }

            @Override // defpackage.jhn
            public final void a(View view, cjqm cjqmVar) {
                bjeo bjeoVar = this.a;
                bjed bjedVar2 = this.b;
                List<dqcq> list3 = bjeoVar.c;
                bjee bjeeVar = ((bjec) bjedVar2).a;
                djan bZ = djao.i.bZ();
                bZ.a(list3);
                bjeeVar.Nw(bZ.bK());
                dbsk.s(bjeeVar.a);
                gfq.l(bjeeVar);
            }
        };
        cjta c = cjtd.c(cjtdVar);
        c.d = dtxl.W;
        cjtd a3 = c.a();
        gga a4 = bjekVar.a.a();
        bjek.a(a4, 1);
        bjek.a(bjekVar.b.a(), 2);
        bjek.a(bjekVar.c.a(), 3);
        bjek.a(jhnVar, 5);
        bjek.a(a3, 6);
        this.d = new bjej(a4, size, jhnVar, a3);
        this.e = new bjen(this);
        for (dqcq dqcqVar : list) {
            List<bkaq> list3 = this.a;
            bkao bkaoVar = this.e;
            gga a5 = bkarVar.a.a();
            bkar.a(a5, 1);
            cqhn a6 = bkarVar.b.a();
            bkar.a(a6, 2);
            bkan a7 = bkarVar.c.a();
            bkar.a(a7, 3);
            bkar.a(cjtdVar, 4);
            bkar.a(dqcqVar, 5);
            bkar.a(bkaoVar, 7);
            list3.add(new bkaq(a5, a6, a7, cjtdVar, dqcqVar, 0, bkaoVar));
        }
        b(this.a, this.c);
    }

    public static void b(List<bkaq> list, List<dqcq> list2) {
        for (bkaq bkaqVar : list) {
            if (list2.contains(bkaqVar.g())) {
                bkaqVar.f(1);
            } else if (list2.size() >= 2) {
                bkaqVar.f(2);
            } else {
                bkaqVar.f(0);
            }
        }
    }

    @Override // defpackage.bjel
    public List<? extends bjxb> a() {
        return this.a;
    }

    @Override // defpackage.bjfj
    public jbk h() {
        return this.d;
    }

    @Override // defpackage.bjfj
    public void i(Bundle bundle) {
        djao djaoVar = (djao) bvrs.f(bundle, "selected_tag_key", (dssr) djao.i.cu(7));
        djao djaoVar2 = (djao) bvrs.f(bundle, "original_selected_tag_key", (dssr) djao.i.cu(7));
        this.c.clear();
        this.b.clear();
        if (djaoVar != null) {
            this.c.addAll(djaoVar.h);
        }
        if (djaoVar2 != null) {
            this.b.addAll(djaoVar2.h);
        }
        b(this.a, this.c);
        this.d.b(this.c.size());
        cqkx.p(this);
    }

    @Override // defpackage.bjfj
    public void j(Bundle bundle) {
        djan bZ = djao.i.bZ();
        bZ.a(this.c);
        bvrs.k(bundle, "selected_tag_key", bZ.bK());
        djan bZ2 = djao.i.bZ();
        bZ2.a(this.b);
        bvrs.k(bundle, "original_selected_tag_key", bZ2.bK());
    }
}

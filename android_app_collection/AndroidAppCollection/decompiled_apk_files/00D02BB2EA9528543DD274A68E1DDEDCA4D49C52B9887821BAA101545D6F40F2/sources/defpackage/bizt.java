package defpackage;

import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bizt  reason: default package */
/* loaded from: classes3.dex */
public final class bizt implements bjht {
    public final ArrayList<bjap> a = new ArrayList<>();
    public final ArrayList<bjwq> b = new ArrayList<>();
    public final bjhr c;
    final /* synthetic */ bizu d;
    private final djbb e;

    public bizt(bizu bizuVar, dqcq dqcqVar) {
        this.d = bizuVar;
        ilo c = bizuVar.d.c();
        dbsk.s(c);
        dqcn bZ = dqco.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqco dqcoVar = (dqco) bZ.b;
        dqcoVar.a |= 2;
        dqcoVar.c = 10;
        dqco.b(dqcoVar);
        if (dqcqVar != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dqco dqcoVar2 = (dqco) bZ.b;
            dqcqVar.getClass();
            dsrj<dqcq> dsrjVar = dqcoVar2.f;
            if (!dsrjVar.a()) {
                dqcoVar2.f = dsqw.cl(dsrjVar);
            }
            dqcoVar2.f.add(dqcqVar);
        }
        djba bZ2 = djbb.d.bZ();
        String o = c.ai().o();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djbb djbbVar = (djbb) bZ2.b;
        o.getClass();
        djbbVar.a |= 1;
        djbbVar.b = o;
        dqck bZ3 = dqcm.e.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dqcm dqcmVar = (dqcm) bZ3.b;
        dqco bK = bZ.bK();
        bK.getClass();
        dqcmVar.c = bK;
        dqcmVar.b = 2;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dqcm.b((dqcm) bZ3.b);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dqcm.c((dqcm) bZ3.b);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djbb djbbVar2 = (djbb) bZ2.b;
        dqcm bK2 = bZ3.bK();
        bK2.getClass();
        djbbVar2.c = bK2;
        djbbVar2.a |= 2;
        this.e = bZ2.bK();
        this.c = bizuVar.a.a(this);
    }

    @Override // defpackage.bjht
    public final void a(djai djaiVar) {
        for (djao djaoVar : djaiVar.b) {
            ArrayList<bjap> arrayList = this.a;
            bizu bizuVar = this.d;
            bjau bjauVar = bizuVar.b;
            bwrs<ilo> bwrsVar = bizuVar.d;
            int size = arrayList.size();
            int i = djaiVar.c;
            gga a = bjauVar.a.a();
            bjau.a(a, 1);
            bjhc a2 = bjauVar.b.a();
            bjau.a(a2, 2);
            bjzo a3 = bjauVar.c.a();
            bjau.a(a3, 3);
            bjxm a4 = bjauVar.d.a();
            bjau.a(a4, 4);
            bjxq a5 = bjauVar.e.a();
            bjau.a(a5, 5);
            bjbu a6 = bjauVar.f.a();
            bjau.a(a6, 6);
            bjau.a(bwrsVar, 7);
            bjau.a(djaoVar, 8);
            arrayList.add(new bjat(a, a2, a3, a4, a5, a6, bwrsVar, djaoVar, size + 1, i));
        }
        cqkx.p(this.d);
    }

    @Override // defpackage.bjht
    public final void b(btzy btzyVar, Runnable runnable, final Runnable runnable2) {
        this.d.c.c(runnable, new Runnable(this, runnable2) { // from class: bizs
            private final bizt a;
            private final Runnable b;

            {
                this.a = this;
                this.b = runnable2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bizt biztVar = this.a;
                this.b.run();
                cqkx.p(biztVar.d);
            }
        });
    }

    @Override // defpackage.bjht
    public final djbb c(@dzsi djbb djbbVar) {
        return djbbVar == null ? this.e : djbbVar;
    }

    public final List<bjap> d() {
        return dcdc.r(this.a);
    }
}

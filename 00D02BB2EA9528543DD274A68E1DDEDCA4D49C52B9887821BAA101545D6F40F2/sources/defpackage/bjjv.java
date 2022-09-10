package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bjjv  reason: default package */
/* loaded from: classes3.dex */
final class bjjv implements bjht {
    final /* synthetic */ bjjw a;
    private final bjzo b;
    private final bjxm c;
    private final bjxq d;
    private final bwrs<ilo> e;
    private final String f;
    private final djbb g;
    private bjwf h;
    private boolean i;

    public bjjv(bjjw bjjwVar, bjzo bjzoVar, bjxm bjxmVar, bjxq bjxqVar, bwrs bwrsVar, djao djaoVar, boolean z) {
        this.a = bjjwVar;
        this.b = bjzoVar;
        this.c = bjxmVar;
        this.d = bjxqVar;
        this.h = bjxqVar.a(bwrsVar, djaoVar, true);
        this.e = bwrsVar;
        djam djamVar = djaoVar.b;
        String str = (djamVar == null ? djam.m : djamVar).b;
        this.f = str;
        ilo iloVar = (ilo) bwrsVar.c();
        dbsk.s(iloVar);
        dqce bZ = dqcf.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqcf dqcfVar = (dqcf) bZ.b;
        str.getClass();
        dqcfVar.a |= 1;
        dqcfVar.b = str;
        dqcf.b(dqcfVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqcf.c((dqcf) bZ.b);
        dqcf bK = bZ.bK();
        djba bZ2 = djbb.d.bZ();
        String o = iloVar.ai().o();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djbb djbbVar = (djbb) bZ2.b;
        o.getClass();
        djbbVar.a = 1 | djbbVar.a;
        djbbVar.b = o;
        dqck bZ3 = dqcm.e.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dqcm dqcmVar = (dqcm) bZ3.b;
        bK.getClass();
        dqcmVar.c = bK;
        dqcmVar.b = 3;
        dqcm.b(dqcmVar);
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
        this.g = bZ2.bK();
        this.i = z;
    }

    @Override // defpackage.bjht
    public final void a(djai djaiVar) {
        if (this.i) {
            if (djaiVar.b.size() == 0 || (djaiVar.b.get(0).a & 1) == 0) {
                this.a.l();
                cqkx.p(this.a);
                return;
            }
            this.i = false;
            djao djaoVar = djaiVar.b.get(0);
            this.a.d = this.b.a(this.e, djaoVar);
            this.h = this.d.a(this.e, djaoVar, true);
        }
        djao djaoVar2 = djaiVar.b.get(0);
        bjwf bjwfVar = this.h;
        djam djamVar = djaoVar2.g;
        if (djamVar == null) {
            djamVar = djam.m;
        }
        bjxp bjxpVar = (bjxp) bjwfVar;
        djao djaoVar3 = bjxpVar.f;
        dsqp dsqpVar = (dsqp) djaoVar3.cu(5);
        dsqpVar.bC(djaoVar3);
        djan djanVar = (djan) dsqpVar;
        if (djanVar.c) {
            djanVar.bF();
            djanVar.c = false;
        }
        djao djaoVar4 = (djao) djanVar.b;
        djamVar.getClass();
        djaoVar4.g = djamVar;
        djaoVar4.a |= 16;
        bjxpVar.f = djanVar.bK();
        if (this.a.a.isEmpty()) {
            if ((djaoVar2.a & 8) != 0) {
                djam djamVar2 = djaoVar2.f;
                if (djamVar2 == null) {
                    djamVar2 = djam.m;
                }
                djam djamVar3 = djamVar2;
                this.a.b.s(djamVar3.d);
                ArrayList<bjwo> arrayList = this.a.a;
                bjxm bjxmVar = this.c;
                bjxk bjxkVar = new bjxk(this) { // from class: bjjt
                    private final bjjv a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.bjxk
                    public final void a(String str) {
                        bjjv bjjvVar = this.a;
                        bjjvVar.a.b.s(str);
                        bjjvVar.a.b.t(true);
                    }
                };
                bwrs<ilo> bwrsVar = this.e;
                arrayList.add(bjxmVar.a(bjxkVar, bwrsVar, djamVar3, this.f, this.h.c(bwrsVar, djamVar3)));
            }
            if ((djaoVar2.a & 16) != 0) {
                djam djamVar4 = djaoVar2.g;
                if (djamVar4 == null) {
                    djamVar4 = djam.m;
                }
                djag djagVar = djamVar4.c;
                if (djagVar == null) {
                    djagVar = djag.d;
                }
                if (!djagVar.b) {
                    ArrayList<bjwo> arrayList2 = this.a.a;
                    bjxm bjxmVar2 = this.c;
                    bjxk bjxkVar2 = bjju.a;
                    bwrs<ilo> bwrsVar2 = this.e;
                    djam djamVar5 = djaoVar2.g;
                    if (djamVar5 == null) {
                        djamVar5 = djam.m;
                    }
                    String str = this.f;
                    bjwf bjwfVar2 = this.h;
                    bwrs<ilo> bwrsVar3 = this.e;
                    djam djamVar6 = djaoVar2.g;
                    if (djamVar6 == null) {
                        djamVar6 = djam.m;
                    }
                    arrayList2.add(bjxmVar2.a(bjxkVar2, bwrsVar2, djamVar5, str, bjwfVar2.c(bwrsVar3, djamVar6)));
                }
            }
        }
        for (djam djamVar7 : djaoVar2.c) {
            ArrayList<bjwo> arrayList3 = this.a.a;
            bjxm bjxmVar3 = this.c;
            bjxk bjxkVar3 = bjjr.a;
            bwrs<ilo> bwrsVar4 = this.e;
            arrayList3.add(bjxmVar3.a(bjxkVar3, bwrsVar4, djamVar7, this.f, this.h.c(bwrsVar4, djamVar7)));
        }
        if (this.a.a.isEmpty()) {
            this.a.b.t(true);
        }
        cqkx.p(this.a);
    }

    @Override // defpackage.bjht
    public final void b(btzy btzyVar, final Runnable runnable, Runnable runnable2) {
        cqkx.p(this.a);
        if (btzyVar.equals(btzy.h)) {
            this.a.l();
        } else {
            this.a.c.c(new Runnable(this, runnable) { // from class: bjjs
                private final bjjv a;
                private final Runnable b;

                {
                    this.a = this;
                    this.b = runnable;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bjjv bjjvVar = this.a;
                    this.b.run();
                    cqkx.p(bjjvVar.a);
                }
            }, runnable2);
        }
    }

    @Override // defpackage.bjht
    public final djbb c(@dzsi djbb djbbVar) {
        dqcf dqcfVar;
        dqcf dqcfVar2;
        if (djbbVar != null) {
            dqcm dqcmVar = djbbVar.c;
            if (dqcmVar == null) {
                dqcmVar = dqcm.e;
            }
            if (dqcmVar.b == 3) {
                dqcfVar = (dqcf) dqcmVar.c;
            } else {
                dqcfVar = dqcf.f;
            }
            return dqcfVar.c.isEmpty() ? this.g : djbbVar;
        }
        dqcm dqcmVar2 = this.g.c;
        if (dqcmVar2 == null) {
            dqcmVar2 = dqcm.e;
        }
        if (dqcmVar2.b == 3) {
            dqcfVar2 = (dqcf) dqcmVar2.c;
        } else {
            dqcfVar2 = dqcf.f;
        }
        dsqp dsqpVar = (dsqp) dqcfVar2.cu(5);
        dsqpVar.bC(dqcfVar2);
        dqce dqceVar = (dqce) dsqpVar;
        boolean z = this.i;
        if (dqceVar.c) {
            dqceVar.bF();
            dqceVar.c = false;
        }
        dqcf dqcfVar3 = (dqcf) dqceVar.b;
        dqcf dqcfVar4 = dqcf.f;
        dqcfVar3.a |= 8;
        dqcfVar3.d = z;
        dqcg bZ = dqch.a.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqch.b((dqch) bZ.b);
        if (dqceVar.c) {
            dqceVar.bF();
            dqceVar.c = false;
        }
        dqcf dqcfVar5 = (dqcf) dqceVar.b;
        dqch bK = bZ.bK();
        bK.getClass();
        dqcfVar5.e = bK;
        dqcfVar5.a |= 16;
        dqcf bK2 = dqceVar.bK();
        dqcm dqcmVar3 = this.g.c;
        if (dqcmVar3 == null) {
            dqcmVar3 = dqcm.e;
        }
        dsqp dsqpVar2 = (dsqp) dqcmVar3.cu(5);
        dsqpVar2.bC(dqcmVar3);
        dqck dqckVar = (dqck) dsqpVar2;
        if (dqckVar.c) {
            dqckVar.bF();
            dqckVar.c = false;
        }
        dqcm dqcmVar4 = (dqcm) dqckVar.b;
        bK2.getClass();
        dqcmVar4.c = bK2;
        dqcmVar4.b = 3;
        dqcm bK3 = dqckVar.bK();
        djbb djbbVar2 = this.g;
        dsqp dsqpVar3 = (dsqp) djbbVar2.cu(5);
        dsqpVar3.bC(djbbVar2);
        djba djbaVar = (djba) dsqpVar3;
        if (djbaVar.c) {
            djbaVar.bF();
            djbaVar.c = false;
        }
        djbb djbbVar3 = (djbb) djbaVar.b;
        bK3.getClass();
        djbbVar3.c = bK3;
        djbbVar3.a |= 2;
        return djbaVar.bK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        this.i = true;
    }
}

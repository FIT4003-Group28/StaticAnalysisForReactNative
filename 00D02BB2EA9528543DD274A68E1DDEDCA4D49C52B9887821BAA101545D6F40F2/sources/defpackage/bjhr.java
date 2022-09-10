package defpackage;
/* compiled from: PG */
/* renamed from: bjhr  reason: default package */
/* loaded from: classes3.dex */
public final class bjhr implements btzi<djbb, djbf> {
    public final bveo a;
    public djbb c;
    private final bjht f;
    public final cqrh b = new bjhm(this);
    @dzsi
    public cqkp d = new bjhn();
    public boolean e = false;

    public bjhr(bveo bveoVar, bjht bjhtVar) {
        this.a = bveoVar;
        this.f = bjhtVar;
        this.c = bjhtVar.c(null);
    }

    @Override // defpackage.btzi
    public final void QY(final btzr<djbb> btzrVar, btzy btzyVar) {
        this.d = null;
        this.f.b(btzyVar, new Runnable(this, btzrVar) { // from class: bjhj
            private final bjhr a;
            private final btzr b;

            {
                this.a = this;
                this.b = btzrVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bjhr bjhrVar = this.a;
                btzr btzrVar2 = this.b;
                bjhrVar.d = new bjhp();
                bjhrVar.e = true;
                bjhrVar.a.a((djbb) btzrVar2.a, bjhrVar, bvrj.UI_THREAD);
            }
        }, new Runnable(this) { // from class: bjhk
            private final bjhr a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.e = false;
            }
        });
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<djbb> btzrVar, djbf djbfVar) {
        djbf djbfVar2 = djbfVar;
        int a = djbe.a(djbfVar2.b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i != 1) {
            if (i == 2) {
                QY(btzrVar, btzy.h);
                return;
            } else if (i != 3) {
                QY(btzrVar, btzy.a);
                return;
            } else {
                QY(btzrVar, btzy.j);
                return;
            }
        }
        djai djaiVar = djbfVar2.a;
        if (djaiVar == null) {
            djaiVar = djai.g;
        }
        dqcm dqcmVar = this.c.c;
        if (dqcmVar == null) {
            dqcmVar = dqcm.e;
        }
        int a2 = dqcl.a(dqcmVar.b);
        int i2 = a2 - 1;
        if (a2 == 0) {
            throw null;
        }
        String str = "";
        if (i2 == 0) {
            str = djaiVar.d;
        } else if (i2 == 1 && !djaiVar.b.isEmpty()) {
            str = djaiVar.b.get(0).e;
        }
        if (str.isEmpty()) {
            this.d = null;
        } else {
            djbb c = this.f.c(this.c);
            dqcm dqcmVar2 = c.c;
            if (dqcmVar2 == null) {
                dqcmVar2 = dqcm.e;
            }
            dsqp dsqpVar = (dsqp) dqcmVar2.cu(5);
            dsqpVar.bC(dqcmVar2);
            dqck dqckVar = (dqck) dsqpVar;
            dqcm dqcmVar3 = c.c;
            if (dqcmVar3 == null) {
                dqcmVar3 = dqcm.e;
            }
            int a3 = dqcl.a(dqcmVar3.b);
            int i3 = a3 - 1;
            if (a3 == 0) {
                throw null;
            }
            if (i3 == 0) {
                dqcm dqcmVar4 = (dqcm) dqckVar.b;
                dqco dqcoVar = dqcmVar4.b == 2 ? (dqco) dqcmVar4.c : dqco.g;
                dsqp dsqpVar2 = (dsqp) dqcoVar.cu(5);
                dsqpVar2.bC(dqcoVar);
                dqcn dqcnVar = (dqcn) dsqpVar2;
                if (dqcnVar.c) {
                    dqcnVar.bF();
                    dqcnVar.c = false;
                }
                dqco dqcoVar2 = (dqco) dqcnVar.b;
                dqco dqcoVar3 = dqco.g;
                str.getClass();
                dqcoVar2.a = 1 | dqcoVar2.a;
                dqcoVar2.b = str;
                if (dqckVar.c) {
                    dqckVar.bF();
                    dqckVar.c = false;
                }
                dqcm dqcmVar5 = (dqcm) dqckVar.b;
                dqco bK = dqcnVar.bK();
                bK.getClass();
                dqcmVar5.c = bK;
                dqcmVar5.b = 2;
            } else if (i3 == 1) {
                dqcm dqcmVar6 = (dqcm) dqckVar.b;
                dqcf dqcfVar = dqcmVar6.b == 3 ? (dqcf) dqcmVar6.c : dqcf.f;
                dsqp dsqpVar3 = (dsqp) dqcfVar.cu(5);
                dsqpVar3.bC(dqcfVar);
                dqce dqceVar = (dqce) dsqpVar3;
                if (dqceVar.c) {
                    dqceVar.bF();
                    dqceVar.c = false;
                }
                dqcf dqcfVar2 = (dqcf) dqceVar.b;
                dqcf dqcfVar3 = dqcf.f;
                str.getClass();
                dqcfVar2.a |= 2;
                dqcfVar2.c = str;
                if (dqckVar.c) {
                    dqckVar.bF();
                    dqckVar.c = false;
                }
                dqcm dqcmVar7 = (dqcm) dqckVar.b;
                dqcf bK2 = dqceVar.bK();
                bK2.getClass();
                dqcmVar7.c = bK2;
                dqcmVar7.b = 3;
            }
            dsqp dsqpVar4 = (dsqp) c.cu(5);
            dsqpVar4.bC(c);
            djba djbaVar = (djba) dsqpVar4;
            if (djbaVar.c) {
                djbaVar.bF();
                djbaVar.c = false;
            }
            djbb djbbVar = (djbb) djbaVar.b;
            dqcm bK3 = dqckVar.bK();
            bK3.getClass();
            djbbVar.c = bK3;
            djbbVar.a |= 2;
            this.c = djbaVar.bK();
            this.d = new bjho();
        }
        this.f.a(djaiVar);
        this.e = false;
    }

    public final void c() {
        this.c = this.f.c(null);
        this.d = new bjhq();
    }
}

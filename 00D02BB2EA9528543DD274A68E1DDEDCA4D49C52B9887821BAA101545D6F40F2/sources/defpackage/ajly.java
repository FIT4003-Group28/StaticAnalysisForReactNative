package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ajly  reason: default package */
/* loaded from: classes2.dex */
public final class ajly implements ahwh {
    public final dxio<ajku> a;
    private final Executor b;
    private final btvo c;
    private final cqat d;
    private final ailf e;
    private final ajln f;
    private final ajlw g;
    private final ajlu h;
    private final ajmq i;
    private final ajnm j;

    public ajly(Executor executor, btvo btvoVar, cqat cqatVar, ailf ailfVar, dxio<ajku> dxioVar, ajln ajlnVar, ajlw ajlwVar, ajlu ajluVar, ajmq ajmqVar, ajnm ajnmVar) {
        this.b = executor;
        this.c = btvoVar;
        this.d = cqatVar;
        this.e = ailfVar;
        this.a = dxioVar;
        this.f = ajlnVar;
        this.g = ajlwVar;
        this.h = ajluVar;
        this.i = ajmqVar;
        this.j = ajnmVar;
    }

    @Override // defpackage.ahwh
    public final void a(btlu btluVar, dlhp dlhpVar, dqxv dqxvVar) {
        ajlw ajlwVar = this.g;
        String str = ((dqxx) dqxvVar.b).b;
        if (ajlwVar.b()) {
            cjqy cjqyVar = ajlwVar.a;
            cjtk[] cjtkVarArr = new cjtk[1];
            cqat cqatVar = ajlwVar.b;
            ddpn a = ajlw.a(str);
            ddpv ddpvVar = ddpv.a;
            if (a.c) {
                a.bF();
                a.c = false;
            }
            ddpz ddpzVar = (ddpz) a.b;
            ddpz ddpzVar2 = ddpz.f;
            ddpvVar.getClass();
            ddpzVar.c = ddpvVar;
            ddpzVar.b = 3;
            cjtkVarArr[0] = new ajlv(cqatVar, a, ajlwVar.a.G());
            cjqyVar.u(cjtkVarArr);
        }
        if ((dlhpVar.a & 1) != 0) {
            ailf ailfVar = this.e;
            dbsg<btlu> i = dbsg.i(btluVar);
            dqzl dqzlVar = dlhpVar.b;
            if (dqzlVar == null) {
                dqzlVar = dqzl.j;
            }
            dbsg<dqzl> i2 = dbsg.i(dqzlVar);
            aimq bZ = aimr.c.bZ();
            aiiv aiivVar = (aiiv) ailfVar;
            long b = aiivVar.h.a().b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            aimr aimrVar = (aimr) bZ.b;
            aimrVar.a |= 1;
            aimrVar.b = b;
            aiivVar.b(i, i2, dbsg.i(bZ.bK()), false, dbpy.a);
        }
        this.f.a(btluVar, ckgd.d);
        dkof dkofVar = this.c.getLocationSharingParameters().q;
        if (dkofVar == null) {
            dkofVar = dkof.s;
        }
        if (!dkofVar.j) {
            bvqd.a(this.h.c(dcep.B(btluVar), ajmq.i(this.d, dqxvVar, 2)), this.b);
        }
        this.j.e();
        if (dlhpVar.c) {
            ajmq ajmqVar = this.i;
            dqyy dqyyVar = dlhpVar.e;
            if (dqyyVar == null) {
                dqyyVar = dqyy.c;
            }
            dqza dqzaVar = dlhpVar.d;
            if (dqzaVar == null) {
                dqzaVar = dqza.c;
            }
            dqzg dqzgVar = dlhpVar.f;
            if (dqzgVar == null) {
                dqzgVar = dqzg.c;
            }
            ajmqVar.a(dqyyVar, dqzaVar, dqzgVar, dcep.B(btluVar), dcep.B(dqym.SILENT_OVENFRESH_RECEIVED), dbsg.i(dqxvVar));
        } else {
            ajmq ajmqVar2 = this.i;
            dqyy dqyyVar2 = dlhpVar.e;
            if (dqyyVar2 == null) {
                dqyyVar2 = dqyy.c;
            }
            dqyy dqyyVar3 = dqyyVar2;
            dqza dqzaVar2 = dlhpVar.d;
            if (dqzaVar2 == null) {
                dqzaVar2 = dqza.c;
            }
            dqza dqzaVar3 = dqzaVar2;
            dqzg dqzgVar2 = dlhpVar.f;
            if (dqzgVar2 == null) {
                dqzgVar2 = dqzg.c;
            }
            bvqd.a(ajmqVar2.c(dqyyVar3, dqzaVar3, dqzgVar2, dcep.B(btluVar), dcep.B(dqym.SILENT_OVENFRESH_RECEIVED), dbsg.i(dqxvVar)), this.b);
        }
        this.b.execute(new Runnable(this) { // from class: ajlx
            private final ajly a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.a();
            }
        });
    }
}

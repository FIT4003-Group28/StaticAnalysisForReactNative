package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: alzw  reason: default package */
/* loaded from: classes2.dex */
public final class alzw implements alzp {
    private final alyl a;

    public alzw(alyl alylVar) {
        this.a = alylVar;
    }

    @Override // defpackage.alzp
    public final void a(@dzsi altv altvVar, dmxg dmxgVar) {
        dniu d = this.a.d();
        if (d != null) {
            int i = 0;
            while (true) {
                if (i >= ((dmxh) dmxgVar.b).c.size()) {
                    i = -1;
                    break;
                } else if ((dmxgVar.a(i).a & 128) != 0) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            dmwx a = dmxgVar.a(i);
            dsqp dsqpVar = (dsqp) a.cu(5);
            dsqpVar.bC(a);
            dmwu dmwuVar = (dmwu) dsqpVar;
            dnbi dnbiVar = ((dmwx) dmwuVar.b).f;
            if (dnbiVar == null) {
                dnbiVar = dnbi.h;
            }
            dsqp dsqpVar2 = (dsqp) dnbiVar.cu(5);
            dsqpVar2.bC(dnbiVar);
            dnbf dnbfVar = (dnbf) dsqpVar2;
            if (dnbfVar.c) {
                dnbfVar.bF();
                dnbfVar.c = false;
            }
            dnbi dnbiVar2 = (dnbi) dnbfVar.b;
            d.getClass();
            dnbiVar2.b = d;
            dnbiVar2.a |= 1;
            dniu e = this.a.e();
            if (e != null) {
                dnbf bZ = dnbi.h.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnbi dnbiVar3 = (dnbi) bZ.b;
                e.getClass();
                dnbiVar3.b = e;
                dnbiVar3.a |= 1;
                if (dnbfVar.c) {
                    dnbfVar.bF();
                    dnbfVar.c = false;
                }
                dnbi dnbiVar4 = (dnbi) dnbfVar.b;
                dnbi bK = bZ.bK();
                bK.getClass();
                dnbiVar4.g = bK;
                dnbiVar4.a |= 16384;
            }
            dnbh f = this.a.f();
            if (f != null) {
                if (dnbfVar.c) {
                    dnbfVar.bF();
                    dnbfVar.c = false;
                }
                dnbi dnbiVar5 = (dnbi) dnbfVar.b;
                dnbiVar5.d = f.t;
                dnbiVar5.a |= 128;
            }
            dnbfVar.a(this.a.g());
            if (dmwuVar.c) {
                dmwuVar.bF();
                dmwuVar.c = false;
            }
            dmwx dmwxVar = (dmwx) dmwuVar.b;
            dnbi bK2 = dnbfVar.bK();
            bK2.getClass();
            dmwxVar.f = bK2;
            dmwxVar.a |= 128;
            dmxgVar.d(i, dmwuVar);
        }
    }

    @Override // defpackage.alzp
    public final boolean b(List<alzr> list, alzr alzrVar) {
        return true;
    }
}

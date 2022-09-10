package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: alzd  reason: default package */
/* loaded from: classes.dex */
public final class alzd implements alzp {
    @dzsi
    private final String a;

    public alzd(alyl alylVar) {
        this.a = alylVar.j();
    }

    @Override // defpackage.alzp
    public final void a(@dzsi altv altvVar, dmxg dmxgVar) {
        if (this.a != null) {
            dmxn dmxnVar = ((dmxh) dmxgVar.b).d;
            if (dmxnVar == null) {
                dmxnVar = dmxn.e;
            }
            dsqp dsqpVar = (dsqp) dmxnVar.cu(5);
            dsqpVar.bC(dmxnVar);
            dmxm dmxmVar = (dmxm) dsqpVar;
            dmyq dmyqVar = (dmyq) dmyu.d.bZ();
            if (dmyqVar.c) {
                dmyqVar.bF();
                dmyqVar.c = false;
            }
            dmyu dmyuVar = (dmyu) dmyqVar.b;
            dmyuVar.b = 26;
            dmyuVar.a |= 1;
            dmyr bZ = dmys.d.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmys dmysVar = (dmys) bZ.b;
            dmysVar.a |= 1;
            dmysVar.b = "styles";
            String str = this.a;
            dmys dmysVar2 = (dmys) bZ.b;
            str.getClass();
            dmysVar2.a |= 2;
            dmysVar2.c = str;
            if (dmyqVar.c) {
                dmyqVar.bF();
                dmyqVar.c = false;
            }
            dmyu dmyuVar2 = (dmyu) dmyqVar.b;
            dmys bK = bZ.bK();
            bK.getClass();
            dsrj<dmys> dsrjVar = dmyuVar2.c;
            if (!dsrjVar.a()) {
                dmyuVar2.c = dsqw.cl(dsrjVar);
            }
            dmyuVar2.c.add(bK);
            if (dmxmVar.c) {
                dmxmVar.bF();
                dmxmVar.c = false;
            }
            dmxn dmxnVar2 = (dmxn) dmxmVar.b;
            dmyu dmyuVar3 = (dmyu) dmyqVar.bK();
            dmyuVar3.getClass();
            dsrj<dmyu> dsrjVar2 = dmxnVar2.d;
            if (!dsrjVar2.a()) {
                dmxnVar2.d = dsqw.cl(dsrjVar2);
            }
            dmxnVar2.d.add(dmyuVar3);
            dmxn bK2 = dmxmVar.bK();
            if (dmxgVar.c) {
                dmxgVar.bF();
                dmxgVar.c = false;
            }
            dmxh dmxhVar = (dmxh) dmxgVar.b;
            bK2.getClass();
            dmxhVar.d = bK2;
            dmxhVar.a |= 2;
        }
    }

    @Override // defpackage.alzp
    public final boolean b(List<alzr> list, alzr alzrVar) {
        return true;
    }
}

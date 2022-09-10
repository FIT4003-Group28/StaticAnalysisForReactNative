package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: cgsm  reason: default package */
/* loaded from: classes4.dex */
public final class cgsm implements Serializable {
    @dzsi
    public final dspd a;
    @dzsi
    public final dspd b;
    @dzsi
    public final dspd c;
    @dzsi
    public alad d;
    private final dspd e;
    private final ArrayList<dspd> f;

    public cgsm(dspd dspdVar, dwpc dwpcVar, String str, alad aladVar) {
        this.e = dspdVar;
        this.a = dspd.B(dwpcVar.b);
        this.b = dwpcVar.d;
        this.c = dspd.B(str);
        alaa b = alad.b(aladVar);
        dpum dpumVar = dwpcVar.c;
        b.c(akqq.f(dpumVar == null ? dpum.d : dpumVar));
        this.d = b.a();
        this.f = new ArrayList<>();
    }

    public final drrp a() {
        drrz bZ = drsh.e.bZ();
        dspd dspdVar = this.e;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drsh drshVar = (drsh) bZ.b;
        dspdVar.getClass();
        drshVar.a |= 1;
        drshVar.b = dspdVar;
        if (!this.f.isEmpty()) {
            ArrayList<dspd> arrayList = this.f;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                dspd dspdVar2 = arrayList.get(i);
                drsa bZ2 = drsb.c.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                drsb drsbVar = (drsb) bZ2.b;
                dspdVar2.getClass();
                drsbVar.a |= 1;
                drsbVar.b = dspdVar2;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                drsh drshVar2 = (drsh) bZ.b;
                drsb bK = bZ2.bK();
                bK.getClass();
                dsrj<drsb> dsrjVar = drshVar2.c;
                if (!dsrjVar.a()) {
                    drshVar2.c = dsqw.cl(dsrjVar);
                }
                drshVar2.c.add(bK);
            }
        }
        if (this.a != null && this.b != null) {
            drsd bZ3 = drsg.d.bZ();
            drse bZ4 = drsf.d.bZ();
            String J = this.a.J();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            drsf drsfVar = (drsf) bZ4.b;
            J.getClass();
            int i2 = drsfVar.a | 1;
            drsfVar.a = i2;
            drsfVar.b = J;
            dspd dspdVar3 = this.b;
            dspdVar3.getClass();
            drsfVar.a = i2 | 2;
            drsfVar.c = dspdVar3;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            drsg drsgVar = (drsg) bZ3.b;
            drsf bK2 = bZ4.bK();
            bK2.getClass();
            drsgVar.b = bK2;
            drsgVar.a |= 1;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            drsg drsgVar2 = (drsg) bZ3.b;
            drsgVar2.c = 2;
            drsgVar2.a |= 2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            drsh drshVar3 = (drsh) bZ.b;
            drsg bK3 = bZ3.bK();
            bK3.getClass();
            drshVar3.d = bK3;
            drshVar3.a |= 2;
        }
        drrq bZ5 = drrr.j.bZ();
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        drrr drrrVar = (drrr) bZ5.b;
        drsh bK4 = bZ.bK();
        bK4.getClass();
        drrrVar.h = bK4;
        drrrVar.a |= 32768;
        drrr bK5 = bZ5.bK();
        drro bZ6 = drrp.d.bZ();
        dsqp dsqpVar = (dsqp) bK5.cu(5);
        dsqpVar.bC(bK5);
        drrq drrqVar = (drrq) dsqpVar;
        if (drrqVar.c) {
            drrqVar.bF();
            drrqVar.c = false;
        }
        drrr drrrVar2 = (drrr) drrqVar.b;
        bK5.getClass();
        drrrVar2.b = bK5;
        drrrVar2.a |= 1;
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        drrp drrpVar = (drrp) bZ6.b;
        drrr bK6 = drrqVar.bK();
        bK6.getClass();
        drrpVar.c = bK6;
        drrpVar.a |= 8;
        alad aladVar = this.d;
        if (aladVar != null) {
            drrk bZ7 = drrn.e.bZ();
            drof bZ8 = drog.i.bZ();
            if (bZ8.c) {
                bZ8.bF();
                bZ8.c = false;
            }
            drog drogVar = (drog) bZ8.b;
            drogVar.b = 2;
            int i3 = drogVar.a | 1;
            drogVar.a = i3;
            akqq akqqVar = aladVar.i;
            double d = akqqVar.a;
            int i4 = i3 | 4;
            drogVar.a = i4;
            drogVar.d = d;
            double d2 = akqqVar.b;
            drogVar.a = i4 | 2;
            drogVar.c = d2;
            float round = Math.round(aladVar.k);
            if (bZ8.c) {
                bZ8.bF();
                bZ8.c = false;
            }
            drog drogVar2 = (drog) bZ8.b;
            drogVar2.a |= 32;
            drogVar2.e = round;
            if (bZ7.c) {
                bZ7.bF();
                bZ7.c = false;
            }
            drrn drrnVar = (drrn) bZ7.b;
            drog bK7 = bZ8.bK();
            bK7.getClass();
            drrnVar.c = bK7;
            drrnVar.a = 2 | drrnVar.a;
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            drrp drrpVar2 = (drrp) bZ6.b;
            drrn bK8 = bZ7.bK();
            bK8.getClass();
            drrpVar2.b = bK8;
            drrpVar2.a |= 4;
        }
        return bZ6.bK();
    }

    public cgsm(dspd dspdVar, Collection<dspd> collection) {
        this.e = dspdVar;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.f = new ArrayList<>(collection);
    }
}

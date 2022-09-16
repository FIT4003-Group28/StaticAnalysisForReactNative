package defpackage;
/* compiled from: PG */
/* renamed from: zah  reason: default package */
/* loaded from: classes7.dex */
public final class zah {
    private static final dcqe a = dcqe.c("zah");
    private final vxa b;

    public zah(vxa vxaVar) {
        this.b = vxaVar;
    }

    public final vun a(vun vunVar, dspd dspdVar, @dzsi dspd dspdVar2, @dzsi dspd dspdVar3) {
        if (dspdVar2 != null || dspdVar3 != null) {
            dwbk dwbkVar = vunVar.b.f;
            if (dwbkVar == null) {
                dwbkVar = dwbk.s;
            }
            dwbh dwbhVar = dwbkVar.o;
            if (dwbhVar == null) {
                dwbhVar = dwbh.g;
            }
            dsqp dsqpVar = (dsqp) dwbhVar.cu(5);
            dsqpVar.bC(dwbhVar);
            dwbe dwbeVar = (dwbe) dsqpVar;
            if (dwbeVar.c) {
                dwbeVar.bF();
                dwbeVar.c = false;
            }
            dwbh dwbhVar2 = (dwbh) dwbeVar.b;
            int i = dwbhVar2.a | 16;
            dwbhVar2.a = i;
            dwbhVar2.f = true;
            if (dspdVar2 != null) {
                dspdVar2.getClass();
                i |= 4;
                dwbhVar2.a = i;
                dwbhVar2.d = dspdVar2;
            }
            if (dspdVar3 != null) {
                dspdVar3.getClass();
                dwbhVar2.a = i | 8;
                dwbhVar2.e = dspdVar3;
            }
            vum vumVar = new vum(vunVar);
            vumVar.i = dspdVar;
            vumVar.k = dquz.STRICT_MATCHING;
            dwao d = this.b.d(vunVar.b, dqvj.TRANSIT, 3, vul.TRIP_MODE_ALTERNATES);
            dsqp dsqpVar2 = (dsqp) d.cu(5);
            dsqpVar2.bC(d);
            dwal dwalVar = (dwal) dsqpVar2;
            dwbk dwbkVar2 = vunVar.b.f;
            if (dwbkVar2 == null) {
                dwbkVar2 = dwbk.s;
            }
            dsqp dsqpVar3 = (dsqp) dwbkVar2.cu(5);
            dsqpVar3.bC(dwbkVar2);
            dwbd dwbdVar = (dwbd) dsqpVar3;
            if (dwbdVar.c) {
                dwbdVar.bF();
                dwbdVar.c = false;
            }
            dwbk dwbkVar3 = (dwbk) dwbdVar.b;
            dwbh bK = dwbeVar.bK();
            bK.getClass();
            dwbkVar3.o = bK;
            dwbkVar3.a |= 32768;
            if (dwalVar.c) {
                dwalVar.bF();
                dwalVar.c = false;
            }
            dwao dwaoVar = (dwao) dwalVar.b;
            dwbk bK2 = dwbdVar.bK();
            bK2.getClass();
            dwaoVar.f = bK2;
            dwaoVar.a |= 2;
            vumVar.a = dwalVar.bK();
            return vumVar.a();
        }
        bvoo.h("Can't request mode alternate details without at least one FLOB.", new Object[0]);
        return vunVar;
    }
}

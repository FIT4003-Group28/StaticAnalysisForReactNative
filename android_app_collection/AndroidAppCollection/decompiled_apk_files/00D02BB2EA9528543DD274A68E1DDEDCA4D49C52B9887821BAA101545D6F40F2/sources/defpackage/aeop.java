package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: aeop  reason: default package */
/* loaded from: classes2.dex */
public final class aeop {
    @dzsi
    private alax a;
    private final dxio<aehr> b;
    private final dxio<akox> c;

    public aeop(dxio<aehr> dxioVar, dxio<akox> dxioVar2) {
        this.b = dxioVar;
        this.c = dxioVar2;
    }

    public final void a(ilo iloVar) {
        b();
        dbsg<V> h = iloVar.bS().h(aeon.a);
        if (h.a()) {
            dmni dmniVar = (dmni) h.b();
            dcdc<ilo> cS = iloVar.cS(this.b.a().i());
            if ((dmniVar.a & 32) != 0) {
                dmpp dmppVar = dmniVar.e;
                if (dmppVar == null) {
                    dmppVar = dmpp.b;
                }
                dsrj<dmpn> dsrjVar = dmppVar.a;
                ArrayList arrayList = new ArrayList(dsrjVar.size());
                for (dmpn dmpnVar : dsrjVar) {
                    dsqp dsqpVar = (dsqp) dmpnVar.cu(5);
                    dsqpVar.bC(dmpnVar);
                    dmpk dmpkVar = (dmpk) dsqpVar;
                    final akqi c = akxf.c(dmpnVar);
                    dbsg r = dcbg.b(cS).r(new dbsl(c) { // from class: aeoo
                        private final akqi a;

                        {
                            this.a = c;
                        }

                        @Override // defpackage.dbsl
                        public final boolean a(Object obj) {
                            return ((ilo) obj).ai().equals(this.a);
                        }
                    });
                    if (r.a()) {
                        anbd.a(dmpkVar, (ilo) r.b(), 5210, true);
                    }
                    akxf.O(dmpkVar);
                    akuq j = akxf.j(dmpkVar);
                    if (j.c) {
                        j.bF();
                        j.c = false;
                    }
                    akus akusVar = (akus) j.b;
                    akus akusVar2 = akus.o;
                    akusVar.a |= 2097152;
                    akusVar.l = true;
                    dmpkVar.k(akvj.a, j.bK());
                    akxf.P(dmpkVar);
                    arrayList.add((dmpn) dmpkVar.bK());
                }
                dsqp dsqpVar2 = (dsqp) dmniVar.cu(5);
                dsqpVar2.bC(dmniVar);
                dmnh dmnhVar = (dmnh) dsqpVar2;
                dmpp dmppVar2 = dmniVar.e;
                if (dmppVar2 == null) {
                    dmppVar2 = dmpp.b;
                }
                dsqp dsqpVar3 = (dsqp) dmppVar2.cu(5);
                dsqpVar3.bC(dmppVar2);
                dmpo dmpoVar = (dmpo) dsqpVar3;
                if (dmpoVar.c) {
                    dmpoVar.bF();
                    dmpoVar.c = false;
                }
                ((dmpp) dmpoVar.b).a = dmpp.ck();
                dmpoVar.a(arrayList);
                if (dmnhVar.c) {
                    dmnhVar.bF();
                    dmnhVar.c = false;
                }
                dmni dmniVar2 = (dmni) dmnhVar.b;
                dmpp bK = dmpoVar.bK();
                bK.getClass();
                dmniVar2.e = bK;
                dmniVar2.a |= 32;
                dmniVar = (dmni) dmnhVar.bK();
            }
            alax a = alay.a(dmniVar, this.c.a(), true);
            this.a = a;
            dbsk.s(a);
            a.a();
        }
    }

    public final void b() {
        alax alaxVar = this.a;
        if (alaxVar == null) {
            return;
        }
        alaxVar.b();
        this.a.c();
        this.a = null;
    }
}

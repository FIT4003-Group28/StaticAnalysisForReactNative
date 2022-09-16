package defpackage;
/* compiled from: PG */
/* renamed from: alnq  reason: default package */
/* loaded from: classes2.dex */
final class alnq extends alnr {
    final /* synthetic */ alns a;
    private final dmph e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alnq(alns alnsVar, akra akraVar, dmph dmphVar) {
        super(alnsVar, akraVar, null);
        this.a = alnsVar;
        this.e = dmphVar;
    }

    @Override // defpackage.alnr
    public final aktw a(dmpn dmpnVar, alno alnoVar, dmyo dmyoVar) {
        if ((dmpnVar.a & 4) != 0) {
            dmph dmphVar = dmpnVar.b;
            if (dmphVar == null) {
                dmphVar = dmph.f;
            }
            if (dmphVar.b.size() > 0 && (dmphVar.b.get(0).a & 2) != 0 && alnoVar.a(dmphVar.b.get(0))) {
                dmqx d = ((alrv) this.a.d).i.a(dmphVar.b.get(0).c).d();
                alns alnsVar = this.a;
                dbrn dbrnVar = new dbrn() { // from class: alnp
                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        dmpv dmpvVar = (dmpv) obj;
                        dsqp dsqpVar = (dsqp) dmpvVar.cu(5);
                        dsqpVar.bC(dmpvVar);
                        dmpq dmpqVar = (dmpq) dsqpVar;
                        for (int i = 0; i < dmpvVar.d.size(); i++) {
                            dmoh dmohVar = dmpvVar.d.get(i);
                            dsqp dsqpVar2 = (dsqp) dmohVar.cu(5);
                            dsqpVar2.bC(dmohVar);
                            dmog dmogVar = (dmog) dsqpVar2;
                            if (dmogVar.c) {
                                dmogVar.bF();
                                dmogVar.c = false;
                            }
                            dmoh dmohVar2 = (dmoh) dmogVar.b;
                            dmoh dmohVar3 = dmoh.h;
                            dmohVar2.a |= 4;
                            dmohVar2.c = 2;
                            dmoh dmohVar4 = (dmoh) dmogVar.bK();
                            if (dmpqVar.c) {
                                dmpqVar.bF();
                                dmpqVar.c = false;
                            }
                            dmpv dmpvVar2 = (dmpv) dmpqVar.b;
                            dmohVar4.getClass();
                            dmpvVar2.b();
                            dmpvVar2.d.set(i, dmohVar4);
                        }
                        return dmpqVar.bK();
                    }
                };
                dsqp dsqpVar = (dsqp) d.cu(5);
                dsqpVar.bC(d);
                dmqt dmqtVar = (dmqt) dsqpVar;
                for (int i = 0; i < d.b.size(); i++) {
                    dmop dmopVar = d.b.get(i);
                    dsqp dsqpVar2 = (dsqp) dmopVar.cu(5);
                    dsqpVar2.bC(dmopVar);
                    dmoo dmooVar = (dmoo) dsqpVar2;
                    dmpv dmpvVar = ((dmop) dmooVar.b).d;
                    if (dmpvVar == null) {
                        dmpvVar = dmpv.s;
                    }
                    dmpv dmpvVar2 = (dmpv) dbrnVar.a(dmpvVar);
                    if (dmooVar.c) {
                        dmooVar.bF();
                        dmooVar.c = false;
                    }
                    dmop dmopVar2 = (dmop) dmooVar.b;
                    dmpvVar2.getClass();
                    dmopVar2.d = dmpvVar2;
                    dmopVar2.a |= 4;
                    if (dmqtVar.c) {
                        dmqtVar.bF();
                        dmqtVar.c = false;
                    }
                    dmqx dmqxVar = (dmqx) dmqtVar.b;
                    dmop dmopVar3 = (dmop) dmooVar.bK();
                    dmopVar3.getClass();
                    dmqxVar.b();
                    dmqxVar.b.set(i, dmopVar3);
                }
                akuh a = alnsVar.a((dmqx) dmqtVar.bK());
                dmpc dmpcVar = (dmpc) dmpd.h.bZ();
                int a2 = a.a();
                if (dmpcVar.c) {
                    dmpcVar.bF();
                    dmpcVar.c = false;
                }
                dmpd dmpdVar = (dmpd) dmpcVar.b;
                dmpdVar.a |= 2;
                dmpdVar.c = a2;
                dmpd dmpdVar2 = (dmpd) dmpcVar.bK();
                int a3 = dmpg.a(dmphVar.e);
                if (a3 == 0) {
                    a3 = 1;
                }
                dmph f = alns.f(dmpdVar2, a3);
                dsqp dsqpVar3 = (dsqp) dmpnVar.cu(5);
                dsqpVar3.bC(dmpnVar);
                dmpk dmpkVar = (dmpk) dsqpVar3;
                dmlq dmlqVar = dmpnVar.d;
                if (dmlqVar == null) {
                    dmlqVar = dmlq.e;
                }
                dsqp dsqpVar4 = (dsqp) dmlqVar.cu(5);
                dsqpVar4.bC(dmlqVar);
                dmlp dmlpVar = (dmlp) dsqpVar4;
                dmlo dmloVar = dmlo.CENTER;
                if (dmlpVar.c) {
                    dmlpVar.bF();
                    dmlpVar.c = false;
                }
                dmlq dmlqVar2 = (dmlq) dmlpVar.b;
                dmlqVar2.c = dmloVar.j;
                dmlqVar2.a |= 2;
                if (dmpkVar.c) {
                    dmpkVar.bF();
                    dmpkVar.c = false;
                }
                dmpn dmpnVar2 = (dmpn) dmpkVar.b;
                dmlq bK = dmlpVar.bK();
                bK.getClass();
                dmpnVar2.d = bK;
                dmpnVar2.a |= 4;
                if (dmpkVar.c) {
                    dmpkVar.bF();
                    dmpkVar.c = false;
                }
                dmpn dmpnVar3 = (dmpn) dmpkVar.b;
                f.getClass();
                dmpnVar3.b = f;
                int i2 = dmpnVar3.a | 1;
                dmpnVar3.a = i2;
                dmph dmphVar2 = this.e;
                dmphVar2.getClass();
                dmpnVar3.c = dmphVar2;
                dmpnVar3.a = i2 | 2;
                dmpn dmpnVar4 = (dmpn) dmpkVar.bK();
                this.a.j.d(dmpnVar, dmpnVar4);
                return new aktw(dmpnVar4, ((alrv) this.a.d).i.e(), null, true);
            }
        }
        return new aktw(dmpnVar, alnoVar.b, null, true);
    }
}

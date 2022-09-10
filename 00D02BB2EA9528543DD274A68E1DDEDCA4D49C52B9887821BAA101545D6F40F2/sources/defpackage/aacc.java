package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aacc  reason: default package */
/* loaded from: classes2.dex */
public final class aacc {
    private static final dcqe j = dcqe.c("aacc");
    public final dxio<akox> a;
    public final akkz b;
    public final dxio<axsc> c;
    public final dxio<cjqy> d;
    public final aacw e;
    public final List<alax> f = new ArrayList();
    public final Set<dmpn> g = new HashSet();
    public final Set<dmlq> h = new HashSet();
    public final dbsl<dmpn> i = new dbsl(this) { // from class: aaca
        private final aacc a;

        {
            this.a = this;
        }

        @Override // defpackage.dbsl
        public final boolean a(Object obj) {
            dmpn dmpnVar = (dmpn) obj;
            if (!this.a.g.contains(dmpnVar)) {
                if (!akxf.E(dmpnVar, akry.BASE)) {
                    return true;
                }
                dmph dmphVar = dmpnVar.b;
                if (dmphVar == null) {
                    dmphVar = dmph.f;
                }
                dsrj<dmpd> dsrjVar = dmphVar.b;
                return (dmpnVar.a & 4) != 0 && !dsrjVar.isEmpty() && (dsrjVar.get(0).a & 1) == 0;
            }
            return false;
        }
    };
    private final alay k;

    public aacc(dxio<akox> dxioVar, alay alayVar, akkz akkzVar, dxio<axsc> dxioVar2, dxio<cjqy> dxioVar3, aacw aacwVar) {
        this.a = dxioVar;
        this.k = alayVar;
        this.b = akkzVar;
        this.c = dxioVar2;
        this.d = dxioVar3;
        this.e = aacwVar;
    }

    private static void b(boolean z, String str) {
        if (z) {
            bvoo.h(str, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(aaco aacoVar) {
        djsd djsdVar;
        if (!aacoVar.a() || !aacoVar.b().a()) {
            return;
        }
        for (dhyd dhydVar : aacoVar.b().b().b) {
            int i = (dhydVar.a & 1) ^ 1;
            b(1 == i, "Missing MID.");
            if (i == 0) {
                boolean z = !((dhydVar.a & 2) != 0);
                b(z, "Missing KnowledgeEntityType.");
                if (!z) {
                    dhxz dhxzVar = dhydVar.d;
                    if (dhxzVar == null) {
                        dhxzVar = dhxz.c;
                    }
                    boolean z2 = !(dhxzVar.a == 1);
                    b(z2, "Missing SingleEventCard.");
                    if (!z2) {
                        String str = dhydVar.b;
                        dpuk b = dpuk.b(dhydVar.c);
                        if (b == null) {
                            b = dpuk.MAJOR_EVENT;
                        }
                        dpuk dpukVar = b;
                        dhxz dhxzVar2 = dhydVar.d;
                        if (dhxzVar2 == null) {
                            dhxzVar2 = dhxz.c;
                        }
                        if (dhxzVar2.a == 1) {
                            djsdVar = (djsd) dhxzVar2.b;
                        } else {
                            djsdVar = djsd.f;
                        }
                        dhxu dhxuVar = djsdVar.b;
                        if (dhxuVar == null) {
                            dhxuVar = dhxu.s;
                        }
                        aacb aacbVar = new aacb(this, str, dpukVar, dhxuVar.b, this.f.size());
                        dmni dmniVar = dhydVar.e;
                        if (dmniVar == null) {
                            dmniVar = dmni.f;
                        }
                        if ((dmniVar.a & 32) != 0) {
                            dmpp dmppVar = dmniVar.e;
                            if (dmppVar == null) {
                                dmppVar = dmpp.b;
                            }
                            dsqp dsqpVar = (dsqp) dmppVar.cu(5);
                            dsqpVar.bC(dmppVar);
                            dmpo dmpoVar = (dmpo) dsqpVar;
                            if (dmpoVar.c) {
                                dmpoVar.bF();
                                dmpoVar.c = false;
                            }
                            ((dmpp) dmpoVar.b).a = dmpp.ck();
                            dmpp dmppVar2 = dmniVar.e;
                            if (dmppVar2 == null) {
                                dmppVar2 = dmpp.b;
                            }
                            for (dmpn dmpnVar : dmppVar2.a) {
                                if ((dmpnVar.a & 4) != 0) {
                                    dmlq dmlqVar = dmpnVar.d;
                                    if (dmlqVar == null) {
                                        dmlqVar = dmlq.e;
                                    }
                                    if (!this.h.contains(dmlqVar)) {
                                        this.h.add(dmlqVar);
                                    }
                                }
                                dsqp dsqpVar2 = (dsqp) dmpnVar.cu(5);
                                dsqpVar2.bC(dmpnVar);
                                dmpk dmpkVar = (dmpk) dsqpVar2;
                                akxf.K(dmpkVar);
                                dmpn dmpnVar2 = (dmpn) dmpkVar.bK();
                                if (dmpoVar.c) {
                                    dmpoVar.bF();
                                    dmpoVar.c = false;
                                }
                                dmpp dmppVar3 = (dmpp) dmpoVar.b;
                                dmpnVar2.getClass();
                                dmppVar3.b();
                                dmppVar3.a.add(dmpnVar2);
                                this.g.add(dmpnVar2);
                            }
                            dsqp dsqpVar3 = (dsqp) dmniVar.cu(5);
                            dsqpVar3.bC(dmniVar);
                            dmnh dmnhVar = (dmnh) dsqpVar3;
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
                        alax c = alay.c(dmniVar, this.a.a(), aacbVar);
                        this.f.add(c);
                        c.a();
                    }
                }
            }
        }
    }
}

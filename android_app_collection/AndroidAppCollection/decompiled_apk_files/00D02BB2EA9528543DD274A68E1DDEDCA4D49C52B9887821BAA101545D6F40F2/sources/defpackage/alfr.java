package defpackage;
/* compiled from: PG */
/* renamed from: alfr  reason: default package */
/* loaded from: classes2.dex */
public class alfr extends algj {
    private final amuo a;
    @dzsi
    private final String b;
    private final boolean f;

    /* JADX INFO: Access modifiers changed from: protected */
    public alfr(amub amubVar, amuo amuoVar, @dzsi String str, boolean z) {
        super(amubVar, amubVar.w());
        dbsk.s(amuoVar);
        this.a = amuoVar;
        this.b = str;
        this.f = z;
    }

    @dzsi
    public final dmpn a(alfy alfyVar, boolean z) {
        akuh a = alfyVar.a(z);
        akuh b = alfyVar.b(z);
        dmpk dmpkVar = (dmpk) dmpn.r.bZ();
        if (a != null && b != null) {
            dmpc dmpcVar = (dmpc) dmpd.h.bZ();
            int a2 = alfyVar.c(this.a).a();
            if (dmpcVar.c) {
                dmpcVar.bF();
                dmpcVar.c = false;
            }
            dmpd dmpdVar = (dmpd) dmpcVar.b;
            dmpdVar.a |= 2;
            dmpdVar.c = a2;
            dmpd dmpdVar2 = (dmpd) dmpcVar.bK();
            dmpc e = (dbsj.d(this.b) ? alfyVar.e : alfyVar.d).e();
            if (e.c) {
                e.bF();
                e.c = false;
            }
            dmpd dmpdVar3 = (dmpd) e.b;
            dmpdVar3.a |= 1;
            dmpdVar3.b = " ";
            dmpd dmpdVar4 = (dmpd) e.bK();
            dmpe f = a.f();
            boolean z2 = this.f && this.a.d == dgau.MANEUVER_UNKNOWN;
            boolean d = dbsj.d(this.b);
            if (z2 && d) {
                return null;
            }
            if (d) {
                f.c(dmpdVar4);
                f.c(dmpdVar2);
                f.c(dmpdVar4);
            } else {
                dbsk.s(this.b);
                dmpc e2 = b.e();
                String str = this.b;
                if (e2.c) {
                    e2.bF();
                    e2.c = false;
                }
                dmpd dmpdVar5 = (dmpd) e2.b;
                str.getClass();
                dmpdVar5.a |= 1;
                dmpdVar5.b = str;
                if (z2) {
                    f.b(e2);
                } else {
                    f.c(dmpdVar2);
                    f.c(dmpdVar4);
                    f.b(e2);
                }
            }
            if (dmpkVar.c) {
                dmpkVar.bF();
                dmpkVar.c = false;
            }
            dmpn dmpnVar = (dmpn) dmpkVar.b;
            dmph dmphVar = (dmph) f.bK();
            dmphVar.getClass();
            dmpnVar.b = dmphVar;
            dmpnVar.a |= 1;
            dmlp bZ = dmlq.e.bZ();
            dmls a3 = akxh.a(this.a.c);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmlq dmlqVar = (dmlq) bZ.b;
            a3.getClass();
            dmlqVar.b = a3;
            dmlqVar.a |= 1;
            dmlo dmloVar = alga.g.get(0);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmlq dmlqVar2 = (dmlq) bZ.b;
            dmlqVar2.c = dmloVar.j;
            dmlqVar2.a |= 2;
            if (dmpkVar.c) {
                dmpkVar.bF();
                dmpkVar.c = false;
            }
            dmpn dmpnVar2 = (dmpn) dmpkVar.b;
            dmlq bK = bZ.bK();
            bK.getClass();
            dmpnVar2.d = bK;
            dmpnVar2.a |= 4;
        }
        return (dmpn) dmpkVar.bK();
    }
}

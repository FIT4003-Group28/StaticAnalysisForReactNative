package defpackage;
/* compiled from: PG */
/* renamed from: hvp  reason: default package */
/* loaded from: classes.dex */
final class hvp implements hvq {
    @Override // defpackage.hvq
    @dzsi
    public final Object a(akvp akvpVar, akra akraVar) {
        Object b;
        Object b2;
        Object b3;
        akvu<?> a = akvpVar.a();
        Object k = a.k();
        if (!(k instanceof dmpn)) {
            return null;
        }
        dmpn dmpnVar = (dmpn) k;
        dsqv<dmpn, dfwv> dsqvVar = dmnl.E;
        dmpnVar.f(dsqvVar);
        boolean z = false;
        if (dmpnVar.V.k(dsqvVar.d)) {
            dsqv<dmpn, dfwv> dsqvVar2 = dmnl.E;
            dmpnVar.f(dsqvVar2);
            Object l = dmpnVar.V.l(dsqvVar2.d);
            if (l == null) {
                b3 = dsqvVar2.b;
            } else {
                b3 = dsqvVar2.b(l);
            }
            dfwv dfwvVar = (dfwv) b3;
            akvf bZ = akvg.c.bZ();
            if (!dfwvVar.b.isEmpty()) {
                cknh cknhVar = hvr.b;
                dfwp dfwpVar = dfwvVar.b.get(0).a;
                if (dfwpVar == null) {
                    dfwpVar = dfwp.d;
                }
                dggg NV = cknhVar.NV(dfwpVar);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                akvg akvgVar = (akvg) bZ.b;
                NV.getClass();
                akvgVar.b = NV;
                akvgVar.a |= 1;
            }
            return hvr.a(alii.a, akraVar, new Object[]{bZ.bK()});
        } else if (a instanceof aktc) {
            return new algo((aktc) a);
        } else {
            if (akvpVar instanceof alnf) {
                alnf alnfVar = (alnf) akvpVar;
                aktp a2 = alnfVar.a();
                akra akraVar2 = alnfVar.b;
                boolean z2 = !alnfVar.a;
                dcqe dcqeVar = hvr.a;
                dmpn k2 = a2.k();
                dsqv<dmpn, dmlm> dsqvVar3 = dmnl.G;
                k2.f(dsqvVar3);
                Object l2 = k2.V.l(dsqvVar3.d);
                if (l2 == null) {
                    b = dsqvVar3.b;
                } else {
                    b = dsqvVar3.b(l2);
                }
                dnbc v = akxf.v(k2);
                akqi c = akxf.c(k2);
                aksh a3 = aksh.a((dmlm) b, v);
                dsqv<dmpn, dmrh> dsqvVar4 = dmnl.H;
                k2.f(dsqvVar4);
                Object l3 = k2.V.l(dsqvVar4.d);
                if (l3 == null) {
                    b2 = dsqvVar4.b;
                } else {
                    b2 = dsqvVar4.b(l3);
                }
                cjtd c2 = hwq.c(c, z2, a3, (dmrh) b2);
                if (alwl.b(k2) && (akxf.i(k2) || akxf.q(k2) != null || akxf.m(k2) || akxf.F(k2).k)) {
                    z = true;
                }
                if (!alwl.b(k2) || z) {
                    return new alho(alap.a(k2, akraVar2, a2.g()), c2, akraVar);
                }
                dbsk.p(a2 instanceof aktd, "renderOp: %s", a2);
                return new alho((aktd) a2, c2);
            }
            dcqe dcqeVar2 = hvr.a;
            bvoo.h("PickObject with a LabelRenderOp proto is not an instance of LabelPickObject.", new Object[0]);
            return null;
        }
    }
}

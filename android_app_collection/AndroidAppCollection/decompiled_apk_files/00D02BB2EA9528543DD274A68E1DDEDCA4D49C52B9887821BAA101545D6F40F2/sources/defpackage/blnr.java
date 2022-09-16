package defpackage;

import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: blnr  reason: default package */
/* loaded from: classes3.dex */
public final class blnr<T> extends btrh<T> {
    private final int d;

    public blnr(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            blno blnoVar = (blno) this.a;
            bkpe bkpeVar = (bkpe) obj;
            cdjd c = blnoVar.a.c.c();
            if (c == null) {
                return;
            }
            cdjd c2 = bkpeVar.c(c, blnoVar.a.b);
            if (c.equals(c2)) {
                return;
            }
            blnp blnpVar = blnoVar.a;
            if (blnpVar.b == null) {
                return;
            }
            blnpVar.c.d(c2);
            blnoVar.a.t();
        } else if (i != 1) {
            blno blnoVar2 = (blno) this.a;
            apuv apuvVar = (apuv) obj;
            cdjd c3 = blnoVar2.a.c.c();
            blnp blnpVar2 = blnoVar2.a;
            bwrs<ilo> bwrsVar = blnpVar2.b;
            if (bwrsVar == null || !blnpVar2.a.f(bwrsVar) || c3 == null || !c3.a().g().equals(apuvVar.a())) {
                return;
            }
            docg h = c3.h();
            dsqp dsqpVar = (dsqp) h.cu(5);
            dsqpVar.bC(h);
            docc doccVar = (docc) dsqpVar;
            dnth bZ = dnti.k.bZ();
            String b = apuvVar.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnti dntiVar = (dnti) bZ.b;
            b.getClass();
            dntiVar.a |= 8;
            dntiVar.e = b;
            String c4 = apuvVar.c();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnti dntiVar2 = (dnti) bZ.b;
            c4.getClass();
            dntiVar2.a = 1 | dntiVar2.a;
            dntiVar2.b = c4;
            if (doccVar.c) {
                doccVar.bF();
                doccVar.c = false;
            }
            docg docgVar = (docg) doccVar.b;
            dnti bK = bZ.bK();
            docg docgVar2 = docg.M;
            bK.getClass();
            docgVar.A = bK;
            docgVar.a |= ImageMetadata.SHADING_MODE;
            blnoVar2.a.c.d(cdrr.r(doccVar.bK(), c3.a().c()));
            blnoVar2.a.t();
        } else {
            blno blnoVar3 = (blno) this.a;
            apuu apuuVar = (apuu) obj;
            cdjd c5 = blnoVar3.a.c.c();
            blnp blnpVar3 = blnoVar3.a;
            bwrs<ilo> bwrsVar2 = blnpVar3.b;
            if (bwrsVar2 == null || !blnpVar3.a.f(bwrsVar2) || c5 == null || !c5.a().g().equals(apuuVar.a())) {
                return;
            }
            docg h2 = c5.h();
            dsqp dsqpVar2 = (dsqp) h2.cu(5);
            dsqpVar2.bC(h2);
            docc doccVar2 = (docc) dsqpVar2;
            if (doccVar2.c) {
                doccVar2.bF();
                doccVar2.c = false;
            }
            docg docgVar3 = (docg) doccVar2.b;
            docg docgVar4 = docg.M;
            docgVar3.A = null;
            docgVar3.a &= -1048577;
            blnoVar3.a.c.d(cdrr.r(doccVar2.bK(), c5.a().c()));
            blnoVar3.a.t();
        }
    }
}

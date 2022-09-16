package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ahew  reason: default package */
/* loaded from: classes2.dex */
public class ahew extends ahhv {
    private final dcdc<agxa<?>> a;
    private final cjta b;
    private final dcdc<agwu> c;
    private final agwu d;
    private final ahet e;

    public ahew(ahht ahhtVar, ahfo ahfoVar, aheu aheuVar, dlcv dlcvVar, int i, agyh agyhVar) {
        super(ahhtVar, dlcvVar, agyhVar);
        dlcc dlccVar;
        agxy agxyVar = agyhVar.h;
        if (((agxyVar == null ? agxy.d : agxyVar).a & 2) != 0) {
            agxy agxyVar2 = agyhVar.h;
            dlccVar = (agxyVar2 == null ? agxy.d : agxyVar2).c;
            if (dlccVar == null) {
                dlccVar = dlcc.e;
            }
        } else if (dlcvVar.b == 23) {
            dlccVar = (dlcc) dlcvVar.c;
        } else {
            dlccVar = dlcc.e;
        }
        dlcc dlccVar2 = dlccVar;
        ddzf bZ = ddzg.t.bZ();
        ddyt bZ2 = ddyu.i.bZ();
        boolean z = agyhVar.b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddyu ddyuVar = (ddyu) bZ2.b;
        int i2 = ddyuVar.a | 4;
        ddyuVar.a = i2;
        ddyuVar.c = z;
        int i3 = i2 | 8;
        ddyuVar.a = i3;
        ddyuVar.d = i;
        dspd dspdVar = dlcvVar.d;
        dspdVar.getClass();
        ddyuVar.a = i3 | 512;
        ddyuVar.h = dspdVar;
        ddyu bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddzg ddzgVar = (ddzg) bZ.b;
        bK.getClass();
        ddzgVar.k = bK;
        ddzgVar.b |= 1;
        ddzg bK2 = bZ.bK();
        this.b = z(dlccVar2.b, i, bK2, agyhVar);
        agxy agxyVar3 = agyhVar.h;
        int i4 = (agxyVar3 == null ? agxy.d : agxyVar3).b;
        gga a = aheuVar.a.a();
        aheu.a(a, 1);
        dxio a2 = ((dxjh) aheuVar.b).a();
        aheu.a(a2, 2);
        axjh a3 = aheuVar.c.a();
        aheu.a(a3, 3);
        ixf a4 = aheuVar.d.a();
        aheu.a(a4, 4);
        axoi a5 = aheuVar.e.a();
        aheu.a(a5, 5);
        bviq a6 = aheuVar.f.a();
        aheu.a(a6, 6);
        ceda a7 = aheuVar.g.a();
        aheu.a(a7, 7);
        aheu.a(dlccVar2, 8);
        aheu.a(this, 10);
        ahet ahetVar = new ahet(a, a2, a3, a4, a5, a6, a7, dlccVar2, i4, this);
        this.e = ahetVar;
        dlcb dlcbVar = dlccVar2.d;
        dlcx dlcxVar = (dlcbVar == null ? dlcb.e : dlcbVar).b;
        ahfn a8 = ahfoVar.a(dlcxVar == null ? dlcx.e : dlcxVar, 0, bK2, null, false);
        this.d = a8;
        agxa a9 = agxa.a(new agmd(), ahetVar);
        agxa agxaVar = new agxa(new agee(), new agxc());
        agoa h = agob.h();
        h.d(true);
        h.e(true);
        this.a = dcdc.h(a9, agxaVar, agxa.a(new agoe(h.a()), new ahfl(a8)));
        this.c = dcdc.f(a8);
    }

    @Override // defpackage.agxe
    public List<agxa<?>> a() {
        return this.a;
    }

    @Override // defpackage.agxe
    public cjtd b(ddho ddhoVar) {
        cjta cjtaVar = this.b;
        cjtaVar.d = ddhoVar;
        return cjtaVar.a();
    }

    @Override // defpackage.agxe
    @dzsi
    public cqix<? extends agxd> c() {
        return null;
    }

    @Override // defpackage.agxe
    public List<agwu> g() {
        return this.c;
    }

    @Override // defpackage.ahhv
    public final agyh n() {
        agxs agxsVar = this.m;
        agxx bZ = agxy.d.bZ();
        int p = this.e.p();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        agxy agxyVar = (agxy) bZ.b;
        agxyVar.a |= 1;
        agxyVar.b = p;
        dlcc q = this.e.q();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        agxy agxyVar2 = (agxy) bZ.b;
        q.getClass();
        agxyVar2.c = q;
        agxyVar2.a |= 2;
        if (agxsVar.c) {
            agxsVar.bF();
            agxsVar.c = false;
        }
        agyh agyhVar = (agyh) agxsVar.b;
        agxy bK = bZ.bK();
        agyh agyhVar2 = agyh.k;
        bK.getClass();
        agyhVar.h = bK;
        agyhVar.a |= 1024;
        return super.n();
    }

    @Override // defpackage.ahhv
    @dzsi
    public agwu o() {
        return this.d;
    }

    @Override // defpackage.ahhv
    public void p() {
        this.e.n();
    }

    @Override // defpackage.ahhv
    public void q() {
        super.q();
        this.e.o();
    }
}

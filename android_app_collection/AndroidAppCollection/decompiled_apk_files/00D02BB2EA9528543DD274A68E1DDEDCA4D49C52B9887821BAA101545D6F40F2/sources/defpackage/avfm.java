package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: avfm  reason: default package */
/* loaded from: classes2.dex */
public final class avfm implements avrh {
    final /* synthetic */ avfn a;

    public avfm(avfn avfnVar) {
        this.a = avfnVar;
    }

    public final void a(@dzsi dloj dlojVar, List<avqt> list) {
        this.a.a.e();
        for (avqt avqtVar : list) {
            avqtVar.b().c();
            final avii a = avqtVar.a();
            if (a != null) {
                this.a.i.execute(new Runnable(a) { // from class: avfk
                    private final avii a;

                    {
                        this.a = a;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a(avih.FAILURE);
                    }
                });
            }
        }
        if (dlojVar != null) {
            avfn avfnVar = this.a;
            avfnVar.a.a(avfnVar.c.c(dlojVar));
        }
    }

    @Override // defpackage.avrh
    public final void b(List<avqt> list) {
        a(null, list);
    }

    @Override // defpackage.avrh
    public final void c(dlta dltaVar, dvfo dvfoVar, dlto dltoVar, int i, List<avqt> list) {
        dlrq b;
        dltc dltcVar = dltaVar.b;
        if (dltcVar == null) {
            dltcVar = dltc.a;
        }
        dltt bZ = dltu.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dltu dltuVar = (dltu) bZ.b;
        dvfoVar.getClass();
        dltuVar.b = dvfoVar;
        int i2 = dltuVar.a | 1;
        dltuVar.a = i2;
        dltcVar.getClass();
        dltuVar.c = dltcVar;
        int i3 = i2 | 2;
        dltuVar.a = i3;
        dltuVar.a = i3 | 8;
        dltuVar.f = i;
        try {
            boolean a = this.a.d.a();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dltu dltuVar2 = (dltu) bZ.b;
            dltuVar2.a |= 4;
            dltuVar2.d = a;
        } catch (bvov unused) {
        }
        this.a.j.a.d(new dbsz() { // from class: avgq
            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                ((avgr) obj).a();
            }
        });
        for (avqt avqtVar : list) {
            avqtVar.b().a(avpw.a);
            avii a2 = avqtVar.a();
            if (a2 != null) {
                long i4 = this.a.c.i();
                this.a.e.a(i4, a2);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dltu dltuVar3 = (dltu) bZ.b;
                dsri dsriVar = dltuVar3.e;
                if (!dsriVar.a()) {
                    dltuVar3.e = dsqw.ci(dsriVar);
                }
                dltuVar3.e.d(i4);
            }
        }
        avfn avfnVar = this.a;
        avbe avbeVar = avfnVar.a;
        avol avolVar = avfnVar.c;
        try {
            b = (dlrq) dsqw.cq(dlrq.q, avolVar.c.e(avolVar.b, bZ.bK().bS()));
        } catch (Exception e) {
            avolVar.a("startUpdate", e);
            b = avol.b();
        }
        avbeVar.a(b);
    }

    @Override // defpackage.avrh
    public final void d(List<avqt> list) {
        this.a.a.e();
        for (avqt avqtVar : list) {
            avqtVar.b().c();
            final avii a = avqtVar.a();
            if (a != null) {
                this.a.i.execute(new Runnable(a) { // from class: avfl
                    private final avii a;

                    {
                        this.a = a;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.c();
                    }
                });
            }
        }
    }
}

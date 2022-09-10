package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cdat  reason: default package */
/* loaded from: classes4.dex */
public final class cdat implements cdft, btzi {
    private final ckcw d;
    private final buul e;
    private final anhk f;
    private final Executor g;
    @dzsi
    private cacz h;
    public String a = "";
    public String c = "";
    public List<dwmx> b = new ArrayList();

    public cdat(ckcw ckcwVar, buul buulVar, anhk anhkVar, Executor executor) {
        this.d = ckcwVar;
        this.e = buulVar;
        this.f = anhkVar;
        this.g = executor;
    }

    private final void d() {
        dwnc bZ = dwnd.e.bZ();
        dnwb a = this.f.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwnd dwndVar = (dwnd) bZ.b;
        a.getClass();
        dwndVar.d = a;
        dwndVar.a |= 4;
        if (!this.c.isEmpty()) {
            String str = this.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwnd dwndVar2 = (dwnd) bZ.b;
            str.getClass();
            dwndVar2.a |= 1;
            dwndVar2.b = str;
        }
        this.e.b(bZ.bK(), this, this.g);
    }

    private static int e(dwnf dwnfVar, dbsl<dwmz> dbslVar) {
        int i = 0;
        for (dwmx dwmxVar : dwnfVar.d) {
            for (dwmz dwmzVar : dwmxVar.g) {
                if (dbslVar.a(dwmzVar)) {
                    i++;
                }
            }
        }
        return i;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwnd> btzrVar, btzy btzyVar) {
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr btzrVar, Object obj) {
        caek caekVar;
        dvlu dvluVar;
        dwnf dwnfVar = (dwnf) obj;
        boolean equals = ((dwnd) btzrVar.a).b.equals(this.c);
        String str = ((dwnd) btzrVar.a).b;
        if (equals) {
            if (str.isEmpty()) {
                ((ckcp) this.d.a(ckdz.ab)).a(e(dwnfVar, cdar.a));
                ((ckcp) this.d.a(ckdz.ac)).a(e(dwnfVar, cdas.a));
            }
            if (this.a.isEmpty()) {
                this.a = dwnfVar.b;
            }
            this.b.addAll(dwnfVar.d);
            this.c = dwnfVar.c;
            cacz caczVar = this.h;
            if (caczVar != null) {
                List<dwmx> list = this.b;
                if (!list.isEmpty()) {
                    int size = list.size();
                    dvlt bZ = dvlu.e.bZ();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dvlu dvluVar2 = (dvlu) bZ.b;
                    dvluVar2.a |= 1;
                    dvluVar2.b = size;
                    for (int i = 0; i < size && ((dvlu) bZ.b).c.size() < 4; i++) {
                        if (list.get(i).g.size() > 0) {
                            dwfl dwflVar = list.get(i).g.get(0).b;
                            if (dwflVar == null) {
                                dwflVar = dwfl.w;
                            }
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dvlu dvluVar3 = (dvlu) bZ.b;
                            dwflVar.getClass();
                            dsrj<dwfl> dsrjVar = dvluVar3.c;
                            if (!dsrjVar.a()) {
                                dvluVar3.c = dsqw.cl(dsrjVar);
                            }
                            dvluVar3.c.add(dwflVar);
                        }
                    }
                    caekVar = caczVar.a;
                    dvluVar = bZ.bK();
                } else {
                    caekVar = caczVar.a;
                    dvluVar = dvlu.e;
                }
                caekVar.W(dvluVar);
                cqkx.p(caczVar.a);
            }
            this.b.size();
            if (this.c.isEmpty() || this.b.size() >= 20) {
                return;
            }
            d();
        }
    }

    @Override // defpackage.cdft
    public final void c(@dzsi cacz caczVar) {
        this.h = caczVar;
        this.c = "";
        this.b = new ArrayList();
        d();
    }
}

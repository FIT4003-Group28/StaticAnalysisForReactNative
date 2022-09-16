package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: accm  reason: default package */
/* loaded from: classes2.dex */
public class accm implements accj, abwp, acck {
    private final abwq b;
    private dcdc<acci> c = dcdc.e();
    private final acbp d;

    public accm(abwq abwqVar, acbp acbpVar) {
        this.d = acbpVar;
        this.b = abwqVar;
    }

    private final boolean g(aceh acehVar) {
        dbsg<dspd> j = this.b.j();
        if (j.a()) {
            return acehVar.c().equals(j.b());
        }
        return acehVar.e() == 3;
    }

    @Override // defpackage.abwp
    public void a() {
    }

    @Override // defpackage.abwp
    public void b() {
    }

    @Override // defpackage.abwp
    public void c() {
        dccx F = dcdc.F();
        dcdc<aceh> i = this.b.i();
        dbsg dbsgVar = dbpy.a;
        for (int i2 = 0; i2 < i.size(); i2++) {
            aceh acehVar = i.get(i2);
            boolean g = g(acehVar);
            F.g(new accl(acehVar, i2, this, g));
            if (g) {
                dbsgVar = dbsg.i(Integer.valueOf(i2));
            }
        }
        this.c = F.f();
        cqkx.p(this);
        cqkx.p(this.d.a);
        if (dbsgVar.a()) {
            View o = cqkx.o(this);
            dbsg j = o == null ? dbpy.a : dbsg.j((RecyclerView) cqkx.e(o, a, RecyclerView.class));
            if (!j.a()) {
                return;
            }
            RecyclerView recyclerView = (RecyclerView) j.b();
            int intValue = ((Integer) dbsgVar.b()).intValue();
            abg abgVar = ((RecyclerView) j.b()).k;
            dbsk.s(abgVar);
            cqrj cqrjVar = (cqrj) abgVar;
            for (int i3 = 0; i3 < cqrjVar.c(); i3++) {
                if (cqrjVar.z(i3).equals(this.c.get(intValue))) {
                    recyclerView.n(i3);
                    return;
                }
            }
            throw new RuntimeException();
        }
    }

    @Override // defpackage.abwp
    public void d(dvha dvhaVar) {
    }

    @Override // defpackage.accj
    public List<acci> e() {
        return this.c;
    }

    @Override // defpackage.acck
    public void f(aceh acehVar) {
        dqlu bK;
        if (g(acehVar)) {
            bK = abys.a;
        } else {
            dqlp bZ = dqlu.c.bZ();
            dqls bZ2 = dqlt.c.bZ();
            dspd c = acehVar.c();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dqlt dqltVar = (dqlt) bZ2.b;
            c.getClass();
            dqltVar.a |= 1;
            dqltVar.b = c;
            dqlt bK2 = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dqlu dqluVar = (dqlu) bZ.b;
            bK2.getClass();
            dqluVar.b = bK2;
            dqluVar.a = 3;
            bK = bZ.bK();
        }
        this.b.h(bK);
        this.b.d();
    }
}

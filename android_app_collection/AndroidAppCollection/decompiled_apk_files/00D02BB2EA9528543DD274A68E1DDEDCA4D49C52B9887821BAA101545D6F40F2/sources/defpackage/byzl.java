package defpackage;

import android.location.Location;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: byzl  reason: default package */
/* loaded from: classes4.dex */
public final class byzl<T> extends btrh<T> {
    private final int d;

    public byzl(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        Location location;
        crnz crnzVar;
        crpi crpiVar;
        if (this.d != 0) {
            byzk byzkVar = (byzk) this.a;
            crhm crhmVar = (crhm) obj;
            amub amubVar = byzkVar.s;
            if (amubVar == null || (crnzVar = byzkVar.e) == null || !crhmVar.a || (crpiVar = crnzVar.d) == null) {
                return;
            }
            bvrj.NAVIGATION_INTERNAL.c();
            if (!crpiVar.m()) {
                return;
            }
            ddvr bZ = ddvs.g.bZ();
            ddxl bZ2 = ddxo.b.bZ();
            amtr d = amubVar.d.d(0);
            for (int i = 0; i < d.e(); i++) {
                if (d.d(i).f()) {
                    dphe g = d.d(i).g();
                    ddxm bZ3 = ddxn.f.bZ();
                    dpgw dpgwVar = g.c;
                    if (dpgwVar == null) {
                        dpgwVar = dpgw.r;
                    }
                    String str = dpgwVar.n;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    ddxn ddxnVar = (ddxn) bZ3.b;
                    str.getClass();
                    ddxnVar.a |= 1;
                    ddxnVar.b = str;
                    dpgw dpgwVar2 = g.d;
                    if (dpgwVar2 == null) {
                        dpgwVar2 = dpgw.r;
                    }
                    String str2 = dpgwVar2.n;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    ddxn ddxnVar2 = (ddxn) bZ3.b;
                    str2.getClass();
                    ddxnVar2.a |= 2;
                    ddxnVar2.c = str2;
                    String str3 = g.o;
                    ddxn ddxnVar3 = (ddxn) bZ3.b;
                    str3.getClass();
                    dsrj<String> dsrjVar = ddxnVar3.d;
                    if (!dsrjVar.a()) {
                        ddxnVar3.d = dsqw.cl(dsrjVar);
                    }
                    ddxnVar3.d.add(str3);
                    bZ3.a(g.m);
                    for (doyp doypVar : d.d(i).h().b) {
                        bZ3.a(doypVar.j);
                    }
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    ddxo ddxoVar = (ddxo) bZ2.b;
                    ddxn bK = bZ3.bK();
                    bK.getClass();
                    dsrj<ddxn> dsrjVar2 = ddxoVar.a;
                    if (!dsrjVar2.a()) {
                        ddxoVar.a = dsqw.cl(dsrjVar2);
                    }
                    ddxoVar.a.add(bK);
                }
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddvs ddvsVar = (ddvs) bZ.b;
            ddxo bK2 = bZ2.bK();
            bK2.getClass();
            ddvsVar.c = bK2;
            ddvsVar.b = 28;
            crpiVar.e.c(bZ);
            return;
        }
        byzk byzkVar2 = (byzk) this.a;
        GmmLocation a = ((amqo) obj).a();
        if (a == null) {
            return;
        }
        byzkVar2.d.j(a, a.j);
        byzj byzjVar = byzkVar2.q;
        if (byzjVar != null && a.h()) {
            byzjVar.a.a((float) a.m());
            if (a.p()) {
                byzjVar.b++;
            }
            if (!a.e()) {
                byzjVar.c++;
            }
            byzjVar.d++;
        }
        if (!a.i() || (location = a.o) == null) {
            return;
        }
        Location location2 = byzkVar2.o;
        if (location2 != null) {
            double d2 = byzkVar2.h;
            double distanceTo = location.distanceTo(location2);
            Double.isNaN(distanceTo);
            byzkVar2.h = d2 + distanceTo;
        }
        byzkVar2.o = location;
    }
}

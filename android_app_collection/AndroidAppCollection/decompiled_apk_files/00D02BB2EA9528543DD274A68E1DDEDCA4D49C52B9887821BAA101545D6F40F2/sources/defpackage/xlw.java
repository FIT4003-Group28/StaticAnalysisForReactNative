package defpackage;

import android.app.Application;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: xlw  reason: default package */
/* loaded from: classes7.dex */
public final class xlw {
    public final xlu a;
    private final Application b;
    private final cqat c;
    private final xaz d;
    @dzsi
    private amte e = null;
    private int f = -1;
    private int g = -1;
    private boolean h = false;

    public xlw(Application application, cqat cqatVar, xlu xluVar, xaz xazVar) {
        this.b = application;
        this.c = cqatVar;
        this.a = xluVar;
        this.d = xazVar;
    }

    private final boolean c(amve amveVar, List<dwae> list, int i, List<xmx> list2) {
        dpyy dpyyVar;
        cqtd cqtdVar;
        int i2;
        int i3 = 0;
        amuq d = amveVar.d(0).d(i);
        if (d.f()) {
            ArrayList arrayList = new ArrayList();
            dphe g = d.g();
            dpgw dpgwVar = g.c;
            if (dpgwVar == null) {
                dpgwVar = dpgw.r;
            }
            Integer valueOf = (g.a & 128) != 0 ? Integer.valueOf(g.h) : null;
            for (doyp doypVar : d.h().b) {
                dgaw dgawVar = doypVar.b;
                if (dgawVar == null) {
                    dgawVar = dgaw.g;
                }
                eaol a = vxs.a(dgawVar);
                if (a != null) {
                    dcdc r = dcdc.r(alcf.x(g, i3));
                    String q = alcf.q(r);
                    if ((doypVar.a & 2048) != 0) {
                        dpgl dpglVar = doypVar.i;
                        if (dpglVar == null) {
                            dpglVar = dpgl.g;
                        }
                        r = dcdc.r(dpglVar.b);
                        dpgl dpglVar2 = doypVar.i;
                        if (dpglVar2 == null) {
                            dpglVar2 = dpgl.g;
                        }
                        if ((dpglVar2.a & 2) != 0) {
                            dpgl dpglVar3 = doypVar.i;
                            if (dpglVar3 == null) {
                                dpglVar3 = dpgl.g;
                            }
                            q = dpglVar3.e;
                        } else {
                            q = alcf.q(r);
                        }
                    }
                    String str = q;
                    zvb zvbVar = new zvb(r, vtj.TRANSIT_LIGHT);
                    dgaw dgawVar2 = doypVar.e;
                    if (dgawVar2 == null) {
                        dgawVar2 = dgaw.g;
                    }
                    Object[] objArr = new Object[4];
                    objArr[i3] = alcf.r(r);
                    objArr[1] = str;
                    objArr[2] = dpgwVar.n;
                    objArr[3] = (dgawVar2.a & 1) != 0 ? vxs.a(dgawVar2) : a;
                    String num = Integer.toString(Arrays.hashCode(objArr));
                    dpjb dpjbVar = doypVar.g;
                    if (dpjbVar == null) {
                        dpjbVar = dpjb.e;
                    }
                    if ((dpjbVar.a & 2) != 0) {
                        dpzb dpzbVar = dpjbVar.c;
                        if (dpzbVar == null) {
                            dpzbVar = dpzb.d;
                        }
                        dpyy b = dpyy.b(dpzbVar.c);
                        if (b == null) {
                            b = dpyy.OCCUPANCY_RATE_UNKNOWN;
                        }
                        dpyyVar = b;
                    } else {
                        dpyyVar = null;
                    }
                    donz K = vyb.K(amveVar.o(), vxj.c(doypVar));
                    Iterable<dpce> p = alcf.p(r);
                    Application application = this.b;
                    cqat cqatVar = this.c;
                    ArrayList arrayList2 = arrayList;
                    dpce dpceVar = (dpce) dcft.r(p, null);
                    dnoh dnohVar = dpgwVar.i;
                    if (dnohVar == null) {
                        dnohVar = dnoh.d;
                    }
                    dnoh dnohVar2 = dnohVar;
                    dqea dqeaVar = dpjbVar.b;
                    if (dqeaVar == null) {
                        dqeaVar = dqea.b;
                    }
                    dqea dqeaVar2 = dqeaVar;
                    doza v = alca.v(d.a().j);
                    jhk T = vyb.T(g, vtj.TRANSIT_LIGHT);
                    dwae dwaeVar = ((doypVar.a & 512) == 0 || (i2 = doypVar.h) >= list.size()) ? null : list.get(i2);
                    xmw f = dwaeVar == null ? null : xmw.f(g, dwaeVar);
                    drhn i4 = this.d.i(doypVar.j, dpjbVar);
                    drhh b2 = this.d.b(i4);
                    if (i4 == null || b2 == null) {
                        cqtdVar = null;
                    } else {
                        cqtdVar = this.d.d(b2, xaz.h(i4) && this.d.f(), false, null, true);
                    }
                    arrayList2.add(new xmy(application, cqatVar, num, zvbVar, dpceVar, str, dnohVar2, a, K, dpyyVar, dqeaVar2, v, T, valueOf, null, f, cqtdVar));
                    arrayList = arrayList2;
                    i3 = 0;
                }
            }
            list2.addAll(arrayList);
            return true;
        }
        return false;
    }

    public final void a(amte amteVar, int i, int i2) {
        if (!this.h) {
            this.a.m(3);
            this.h = true;
        }
        boolean equals = amteVar.equals(this.e);
        if (equals && this.f == i && this.g == i2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        amsy amsyVar = amteVar.a;
        amve m = amsyVar.m(i);
        dwaa dwaaVar = amsyVar.a.b;
        if (dwaaVar == null) {
            dwaaVar = dwaa.g;
        }
        dvzu dvzuVar = dwaaVar.b;
        if (dvzuVar == null) {
            dvzuVar = dvzu.F;
        }
        dsrj<dwae> dsrjVar = dvzuVar.q;
        if (m.e() > 0 && (i2 < 0 || i2 >= m.d(0).e() || !c(m, dsrjVar, i2, arrayList))) {
            if (equals && this.f == i && this.g == -1) {
                return;
            }
            for (int i3 = 0; i3 < m.d(0).e(); i3++) {
                c(m, dsrjVar, i3, arrayList);
            }
            i2 = -1;
        }
        this.e = amteVar;
        this.f = i;
        this.g = i2;
        this.a.a(arrayList, !equals);
    }

    public final void b() {
        this.f = -1;
        this.g = -1;
        this.h = false;
        this.a.j();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: pyf  reason: default package */
/* loaded from: classes7.dex */
final class pyf implements btzi<dwhf, dwhj> {
    final /* synthetic */ vvy a;
    final /* synthetic */ dwhf b;
    final /* synthetic */ pyh c;

    public pyf(pyh pyhVar, vvy vvyVar, dwhf dwhfVar) {
        this.c = pyhVar;
        this.a = vvyVar;
        this.b = dwhfVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwhf> btzrVar, btzy btzyVar) {
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwhf> btzrVar, dwhj dwhjVar) {
        vvy vvyVar;
        dpjq dpjqVar;
        dwhj dwhjVar2 = dwhjVar;
        int a = dwhi.a(dwhjVar2.b);
        if (a != 0 && a == 2) {
            vvy vvyVar2 = this.a;
            dhjz dhjzVar = this.b.b;
            if (dhjzVar == null) {
                dhjzVar = dhjz.e;
            }
            double d = dhjzVar.c;
            dhjz dhjzVar2 = this.b.b;
            if (dhjzVar2 == null) {
                dhjzVar2 = dhjz.e;
            }
            double d2 = dhjzVar2.b;
            if ((dwhjVar2.a & 4) != 0) {
                dwaw dwawVar = vvyVar2.b;
                if (dwawVar == null) {
                    dwawVar = dwaw.j;
                }
                dvzy dvzyVar = dwawVar.b;
                if (dvzyVar == null) {
                    dvzyVar = dvzy.u;
                }
                dsrj<dpjx> dsrjVar = dvzyVar.d;
                dvzy dvzyVar2 = dwawVar.b;
                if (dvzyVar2 == null) {
                    dvzyVar2 = dvzy.u;
                }
                dvzv dvzvVar = (dvzv) dvzy.u.ca(dvzyVar2);
                int i = 0;
                while (true) {
                    dvzy dvzyVar3 = dwawVar.b;
                    if (dvzyVar3 == null) {
                        dvzyVar3 = dvzy.u;
                    }
                    if (i >= dvzyVar3.d.size()) {
                        dpjqVar = null;
                        break;
                    }
                    dvzy dvzyVar4 = dwawVar.b;
                    if (dvzyVar4 == null) {
                        dvzyVar4 = dvzy.u;
                    }
                    dpjx dpjxVar = dvzyVar4.d.get(i);
                    dpjs b = dpjs.b(dpjxVar.f);
                    if (b == null) {
                        b = dpjs.ENTITY_TYPE_DEFAULT;
                    }
                    if (b.equals(dpjs.ENTITY_TYPE_MY_LOCATION)) {
                        dpjqVar = dpjx.n.ca(dpjxVar);
                        dpjs dpjsVar = dpjs.ENTITY_TYPE_DEFAULT;
                        if (dpjqVar.c) {
                            dpjqVar.bF();
                            dpjqVar.c = false;
                        }
                        dpjx dpjxVar2 = (dpjx) dpjqVar.b;
                        dpjxVar2.f = dpjsVar.h;
                        dpjxVar2.a |= 256;
                        dvyw dvywVar = dwhjVar2.d;
                        if (dvywVar == null) {
                            dvywVar = dvyw.bv;
                        }
                        String str = dvywVar.p;
                        if (dpjqVar.c) {
                            dpjqVar.bF();
                            dpjqVar.c = false;
                        }
                        dpjx dpjxVar3 = (dpjx) dpjqVar.b;
                        str.getClass();
                        dpjxVar3.a |= 1;
                        dpjxVar3.b = str;
                        dvyw dvywVar2 = dwhjVar2.d;
                        if (dvywVar2 == null) {
                            dvywVar2 = dvyw.bv;
                        }
                        String str2 = dvywVar2.p;
                        if (dpjqVar.c) {
                            dpjqVar.bF();
                            dpjqVar.c = false;
                        }
                        dpjx dpjxVar4 = (dpjx) dpjqVar.b;
                        str2.getClass();
                        int i2 = dpjxVar4.a | 128;
                        dpjxVar4.a = i2;
                        dpjxVar4.e = str2;
                        dpjxVar4.a = i2 & (-513);
                        dpjxVar4.g = 0;
                        dnog bZ = dnoh.d.bZ();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dnoh dnohVar = (dnoh) bZ.b;
                        int i3 = dnohVar.a | 1;
                        dnohVar.a = i3;
                        dnohVar.b = d;
                        dnohVar.a = i3 | 2;
                        dnohVar.c = d2;
                        if (dpjqVar.c) {
                            dpjqVar.bF();
                            dpjqVar.c = false;
                        }
                        dpjx dpjxVar5 = (dpjx) dpjqVar.b;
                        dnoh bK = bZ.bK();
                        bK.getClass();
                        dpjxVar5.d = bK;
                        dpjxVar5.a |= 4;
                        if (dvzvVar.c) {
                            dvzvVar.bF();
                            dvzvVar.c = false;
                        }
                        dvzy dvzyVar5 = (dvzy) dvzvVar.b;
                        dvzyVar5.c();
                        dvzyVar5.d.remove(i);
                        if (dvzvVar.c) {
                            dvzvVar.bF();
                            dvzvVar.c = false;
                        }
                        dvzy dvzyVar6 = (dvzy) dvzvVar.b;
                        dpjx bK2 = dpjqVar.bK();
                        bK2.getClass();
                        dvzyVar6.c();
                        dvzyVar6.d.add(i, bK2);
                    } else {
                        i++;
                    }
                }
                dwat dwatVar = (dwat) dwaw.j.ca(dwawVar);
                if (dwatVar.c) {
                    dwatVar.bF();
                    dwatVar.c = false;
                }
                dwaw dwawVar2 = (dwaw) dwatVar.b;
                dvzy dvzyVar7 = (dvzy) dvzvVar.bK();
                dvzyVar7.getClass();
                dwawVar2.b = dvzyVar7;
                dwawVar2.a |= 1;
                dwbc dwbcVar = vvyVar2.c;
                if (dwbcVar == null) {
                    dwbcVar = dwbc.g;
                }
                dwaz dwazVar = (dwaz) dwbc.g.ca(dwbcVar);
                dwaa dwaaVar = dwbcVar.b;
                if (dwaaVar == null) {
                    dwaaVar = dwaa.g;
                }
                dvzu dvzuVar = dwaaVar.b;
                if (dvzuVar == null) {
                    dvzuVar = dvzu.F;
                }
                dsrj<dpkf> dsrjVar2 = dvzuVar.b;
                dwaa dwaaVar2 = dwbcVar.b;
                if (dwaaVar2 == null) {
                    dwaaVar2 = dwaa.g;
                }
                dvzu dvzuVar2 = dwaaVar2.b;
                if (dvzuVar2 == null) {
                    dvzuVar2 = dvzu.F;
                }
                dvzo ca = dvzu.F.ca(dvzuVar2);
                int i4 = 0;
                while (true) {
                    if (i4 >= dvzuVar2.b.size()) {
                        break;
                    }
                    dpkf dpkfVar = dvzuVar2.b.get(i4);
                    dpjn dpjnVar = dpkfVar.b;
                    if (dpjnVar == null) {
                        dpjnVar = dpjn.m;
                    }
                    dpjx dpjxVar6 = dpjnVar.b;
                    if (dpjxVar6 == null) {
                        dpjxVar6 = dpjx.n;
                    }
                    dpjs b2 = dpjs.b(dpjxVar6.f);
                    if (b2 == null) {
                        b2 = dpjs.ENTITY_TYPE_DEFAULT;
                    }
                    if (b2 != dpjs.ENTITY_TYPE_MY_LOCATION || dpjqVar == null) {
                        i4++;
                    } else {
                        dpjy ca2 = dpkf.g.ca(dpkfVar);
                        dpjm bZ2 = dpjn.m.bZ();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dpjn dpjnVar2 = (dpjn) bZ2.b;
                        dpjx bK3 = dpjqVar.bK();
                        bK3.getClass();
                        dpjnVar2.b = bK3;
                        dpjnVar2.a |= 1;
                        if (ca2.c) {
                            ca2.bF();
                            ca2.c = false;
                        }
                        dpkf dpkfVar2 = (dpkf) ca2.b;
                        dpjn bK4 = bZ2.bK();
                        bK4.getClass();
                        dpkfVar2.b = bK4;
                        dpkfVar2.a |= 1;
                        ca.f(i4);
                        if (ca.c) {
                            ca.bF();
                            ca.c = false;
                        }
                        dvzu dvzuVar3 = (dvzu) ca.b;
                        dpkf bK5 = ca2.bK();
                        bK5.getClass();
                        dvzuVar3.c();
                        dvzuVar3.b.add(i4, bK5);
                        dpjp dpjpVar = dpjp.c;
                        if (ca.c) {
                            ca.bF();
                            ca.c = false;
                        }
                        dvzu dvzuVar4 = (dvzu) ca.b;
                        dpjpVar.getClass();
                        dvzuVar4.e();
                        dvzuVar4.c.set(i4, dpjpVar);
                    }
                }
                dwaa dwaaVar3 = dwbcVar.b;
                if (dwaaVar3 == null) {
                    dwaaVar3 = dwaa.g;
                }
                dvzz ca3 = dwaa.g.ca(dwaaVar3);
                if (ca3.c) {
                    ca3.bF();
                    ca3.c = false;
                }
                dwaa dwaaVar4 = (dwaa) ca3.b;
                dvzu bK6 = ca.bK();
                bK6.getClass();
                dwaaVar4.b = bK6;
                dwaaVar4.a |= 1;
                if (dwazVar.c) {
                    dwazVar.bF();
                    dwazVar.c = false;
                }
                dwbc dwbcVar2 = (dwbc) dwazVar.b;
                dwaa bK7 = ca3.bK();
                bK7.getClass();
                dwbcVar2.b = bK7;
                dwbcVar2.a |= 1;
                vvx ca4 = vvy.j.ca(vvyVar2);
                if (ca4.c) {
                    ca4.bF();
                    ca4.c = false;
                }
                vvy vvyVar3 = (vvy) ca4.b;
                dwaw dwawVar3 = (dwaw) dwatVar.bK();
                dwawVar3.getClass();
                vvyVar3.b = dwawVar3;
                vvyVar3.a |= 1;
                if (ca4.c) {
                    ca4.bF();
                    ca4.c = false;
                }
                vvy vvyVar4 = (vvy) ca4.b;
                dwbc dwbcVar3 = (dwbc) dwazVar.bK();
                dwbcVar3.getClass();
                vvyVar4.c = dwbcVar3;
                vvyVar4.a = 2 | vvyVar4.a;
                vvyVar = ca4.bK();
            } else {
                vvyVar = null;
            }
            if (vvyVar == null) {
                return;
            }
            this.c.g.b(vvyVar, null);
            if (vze.b(vvyVar, this.c.a, vzd.SAVE_THIS_ROUTE) == null) {
                return;
            }
            this.c.d.b(new srg());
            this.c.h = vvyVar;
        }
    }
}

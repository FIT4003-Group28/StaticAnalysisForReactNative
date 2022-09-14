package defpackage;
/* compiled from: PG */
/* renamed from: axaf  reason: default package */
/* loaded from: classes3.dex */
final class axaf implements awze<dvhu> {
    static final axaf a = new axaf();

    @Override // defpackage.awze
    @dzsi
    public final /* bridge */ /* synthetic */ dvhu a(dvhu dvhuVar, awyw awywVar, dmlb dmlbVar) {
        dvhu dvhuVar2 = dvhuVar;
        dqpe dqpeVar = dvhuVar2.a;
        if (dqpeVar == null) {
            dqpeVar = dqpe.f;
        }
        if (!awywVar.a(dqpeVar, dmlbVar)) {
            return null;
        }
        dvht ca = dvhu.d.ca(dvhuVar2);
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        ((dvhu) ca.b).b = dvhu.ck();
        for (dhxw dhxwVar : dvhuVar2.b) {
            Object[] objArr = new Object[2];
            dhxv ca2 = dhxw.d.ca(dhxwVar);
            if (ca2.c) {
                ca2.bF();
                ca2.c = false;
            }
            ((dhxw) ca2.b).c = dhxw.ck();
            for (dhxz dhxzVar : dhxwVar.c) {
                dhxx ca3 = dhxz.c.ca(dhxzVar);
                if (ca3.c) {
                    ca3.bF();
                    ca3.c = false;
                }
                dhxz dhxzVar2 = (dhxz) ca3.b;
                if (dhxzVar2.a == 4) {
                    dhxzVar2.a = 0;
                    dhxzVar2.b = null;
                }
                if (dhxzVar.a == 4) {
                    diin diinVar = (diin) dhxzVar.b;
                    diig ca4 = diin.h.ca(diinVar);
                    if (ca4.c) {
                        ca4.bF();
                        ca4.c = false;
                    }
                    diin diinVar2 = (diin) ca4.b;
                    diinVar2.g = null;
                    diinVar2.a &= -33;
                    if ((diinVar.a & 32) != 0) {
                        dpsf dpsfVar = diinVar.g;
                        if (dpsfVar == null) {
                            dpsfVar = dpsf.d;
                        }
                        dpse ca5 = dpsf.d.ca(dpsfVar);
                        if (ca5.c) {
                            ca5.bF();
                            ca5.c = false;
                        }
                        dpsf dpsfVar2 = (dpsf) ca5.b;
                        dpsfVar2.b = null;
                        dpsfVar2.a &= -2;
                        if ((dpsfVar.a & 1) != 0) {
                            dqfq dqfqVar = dpsfVar.b;
                            if (dqfqVar == null) {
                                dqfqVar = dqfq.h;
                            }
                            dqpe dqpeVar2 = dqfqVar.c;
                            if (dqpeVar2 == null) {
                                dqpeVar2 = dqpe.f;
                            }
                            if (true != awywVar.a(dqpeVar2, dmlbVar)) {
                                dqfqVar = null;
                            }
                            if (dqfqVar != null) {
                                if (ca5.c) {
                                    ca5.bF();
                                    ca5.c = false;
                                }
                                dpsf dpsfVar3 = (dpsf) ca5.b;
                                dqfqVar.getClass();
                                dpsfVar3.b = dqfqVar;
                                dpsfVar3.a |= 1;
                            }
                        }
                        dpsf bK = ca5.bK();
                        if (bK != null) {
                            if (ca4.c) {
                                ca4.bF();
                                ca4.c = false;
                            }
                            diin diinVar3 = (diin) ca4.b;
                            bK.getClass();
                            diinVar3.g = bK;
                            diinVar3.a |= 32;
                        }
                    }
                    diin bK2 = ca4.bK();
                    if (bK2 != null) {
                        if (ca3.c) {
                            ca3.bF();
                            ca3.c = false;
                        }
                        dhxz dhxzVar3 = (dhxz) ca3.b;
                        bK2.getClass();
                        dhxzVar3.b = bK2;
                        dhxzVar3.a = 4;
                    }
                }
                dhxz bK3 = ca3.bK();
                if (bK3 != null) {
                    ca2.a(bK3);
                }
            }
            dhxw bK4 = ca2.bK();
            if (bK4 != null) {
                ca.a(bK4);
            }
        }
        return ca.bK();
    }

    @Override // defpackage.awze
    public final /* bridge */ /* synthetic */ boolean b(dvhu dvhuVar, awza awzaVar, dmlb dmlbVar) {
        dvhu dvhuVar2 = dvhuVar;
        dqpe dqpeVar = dvhuVar2.a;
        if (dqpeVar == null) {
            dqpeVar = dqpe.f;
        }
        if (awzaVar.a(dqpeVar, dmlbVar)) {
            return true;
        }
        for (dhxw dhxwVar : dvhuVar2.b) {
            Object[] objArr = new Object[2];
            for (dhxz dhxzVar : dhxwVar.c) {
                if (dhxzVar.a == 4) {
                    diin diinVar = (diin) dhxzVar.b;
                    if ((diinVar.a & 32) == 0) {
                        continue;
                    } else {
                        dpsf dpsfVar = diinVar.g;
                        if (dpsfVar == null) {
                            dpsfVar = dpsf.d;
                        }
                        if ((dpsfVar.a & 1) == 0) {
                            continue;
                        } else {
                            dqfq dqfqVar = dpsfVar.b;
                            if (dqfqVar == null) {
                                dqfqVar = dqfq.h;
                            }
                            dqpe dqpeVar2 = dqfqVar.c;
                            if (dqpeVar2 == null) {
                                dqpeVar2 = dqpe.f;
                            }
                            if (awzaVar.a(dqpeVar2, dmlbVar)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}

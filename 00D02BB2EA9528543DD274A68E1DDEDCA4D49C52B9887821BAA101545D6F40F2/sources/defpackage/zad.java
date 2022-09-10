package defpackage;

import android.app.Activity;
import android.app.ProgressDialog;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: zad  reason: default package */
/* loaded from: classes7.dex */
public final class zad {
    public final Activity a;
    public final Executor b;
    public final Executor c;
    @dzsi
    public ProgressDialog d;
    @dzsi
    public btzc e;
    public final buky f;

    public zad(Activity activity, buky bukyVar, Executor executor, Executor executor2) {
        this.a = activity;
        this.f = bukyVar;
        this.b = executor;
        this.c = executor2;
    }

    public static drrp a(amub amubVar) {
        amvh[] amvhVarArr;
        drou bZ = drox.f.bZ();
        dqvj dqvjVar = amubVar.h;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drox droxVar = (drox) bZ.b;
        droxVar.d = dqvjVar.k;
        int i = droxVar.a | 2;
        droxVar.a = i;
        int i2 = amubVar.c;
        droxVar.a = i | 8;
        droxVar.e = i2;
        for (amvh amvhVar : amubVar.o) {
            drsj bZ2 = drsk.e.bZ();
            if (amvhVar.l()) {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                drsk drskVar = (drsk) bZ2.b;
                drskVar.d = 0;
                drskVar.a |= 4;
                droy bZ3 = droz.f.bZ();
                String str = amvhVar.c;
                dbsk.s(str);
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                droz drozVar = (droz) bZ3.b;
                str.getClass();
                drozVar.a |= 8;
                drozVar.e = str;
                if (amvhVar.e != null) {
                    dnog bZ4 = dnoh.d.bZ();
                    akqq akqqVar = amvhVar.e;
                    dbsk.s(akqqVar);
                    double d = akqqVar.a;
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dnoh dnohVar = (dnoh) bZ4.b;
                    dnohVar.a |= 1;
                    dnohVar.b = d;
                    akqq akqqVar2 = amvhVar.e;
                    dbsk.s(akqqVar2);
                    double d2 = akqqVar2.b;
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dnoh dnohVar2 = (dnoh) bZ4.b;
                    dnohVar2.a |= 2;
                    dnohVar2.c = d2;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    droz drozVar2 = (droz) bZ3.b;
                    dnoh bK = bZ4.bK();
                    bK.getClass();
                    drozVar2.d = bK;
                    drozVar2.a |= 4;
                }
                if (amvhVar.m()) {
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    droz drozVar3 = (droz) bZ3.b;
                    drozVar3.c = 0;
                    drozVar3.a |= 2;
                    akqi akqiVar = amvhVar.d;
                    dbsk.s(akqiVar);
                    String o = akqiVar.o();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    droz drozVar4 = (droz) bZ3.b;
                    o.getClass();
                    drozVar4.a |= 1;
                    drozVar4.b = o;
                }
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                drsk drskVar2 = (drsk) bZ2.b;
                droz bK2 = bZ3.bK();
                bK2.getClass();
                drskVar2.b = bK2;
                drskVar2.a = 1 | drskVar2.a;
            } else if (amvhVar.n()) {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                drsk drskVar3 = (drsk) bZ2.b;
                drskVar3.d = 1;
                drskVar3.a |= 4;
                drpr bZ5 = drps.d.bZ();
                akqq akqqVar3 = amvhVar.e;
                dbsk.s(akqqVar3);
                double d3 = akqqVar3.a;
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                drps drpsVar = (drps) bZ5.b;
                drpsVar.a |= 2;
                drpsVar.c = d3;
                akqq akqqVar4 = amvhVar.e;
                dbsk.s(akqqVar4);
                double d4 = akqqVar4.b;
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                drps drpsVar2 = (drps) bZ5.b;
                drpsVar2.a = 1 | drpsVar2.a;
                drpsVar2.b = d4;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                drsk drskVar4 = (drsk) bZ2.b;
                drps bK3 = bZ5.bK();
                bK3.getClass();
                drskVar4.c = bK3;
                drskVar4.a |= 2;
            } else if (amvhVar.k()) {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                drsk drskVar5 = (drsk) bZ2.b;
                drskVar5.d = 2;
                drskVar5.a |= 4;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            drox droxVar2 = (drox) bZ.b;
            drsk bK4 = bZ2.bK();
            bK4.getClass();
            dsrj<drsk> dsrjVar = droxVar2.b;
            if (!dsrjVar.a()) {
                droxVar2.b = dsqw.cl(dsrjVar);
            }
            droxVar2.b.add(bK4);
        }
        dwao dwaoVar = amubVar.J;
        drov bZ6 = drow.e.bZ();
        boolean z = dwaoVar.o;
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        drow drowVar = (drow) bZ6.b;
        drowVar.a |= 4;
        drowVar.d = z;
        dowr dowrVar = dwaoVar.g;
        if (dowrVar == null) {
            dowrVar = dowr.m;
        }
        boolean z2 = dowrVar.b;
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        drow drowVar2 = (drow) bZ6.b;
        drowVar2.a |= 1;
        drowVar2.b = z2;
        dowr dowrVar2 = dwaoVar.g;
        if (dowrVar2 == null) {
            dowrVar2 = dowr.m;
        }
        boolean z3 = dowrVar2.c;
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        drow drowVar3 = (drow) bZ6.b;
        drowVar3.a = 2 | drowVar3.a;
        drowVar3.c = z3;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drox droxVar3 = (drox) bZ.b;
        drow bK5 = bZ6.bK();
        bK5.getClass();
        droxVar3.c = bK5;
        droxVar3.a |= 1;
        drro bZ7 = drrp.d.bZ();
        drrq bZ8 = drrr.j.bZ();
        if (bZ8.c) {
            bZ8.bF();
            bZ8.c = false;
        }
        drrr drrrVar = (drrr) bZ8.b;
        drox bK6 = bZ.bK();
        bK6.getClass();
        drrrVar.d = bK6;
        drrrVar.a |= 8;
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        drrp drrpVar = (drrp) bZ7.b;
        drrr bK7 = bZ8.bK();
        bK7.getClass();
        drrpVar.c = bK7;
        drrpVar.a |= 8;
        return bZ7.bK();
    }

    public final void b() {
        btzc btzcVar = this.e;
        if (btzcVar != null) {
            btzcVar.a();
            this.e = null;
        }
        c();
    }

    public final void c() {
        ProgressDialog progressDialog = this.d;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.d = null;
        }
    }
}

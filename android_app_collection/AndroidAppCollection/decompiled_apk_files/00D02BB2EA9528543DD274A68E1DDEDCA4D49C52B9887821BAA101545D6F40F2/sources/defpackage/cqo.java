package defpackage;

import android.app.ActivityManager;
/* compiled from: PG */
/* renamed from: cqo  reason: default package */
/* loaded from: classes5.dex */
final class cqo implements Runnable {
    final /* synthetic */ bxmh a;
    final /* synthetic */ cqt b;

    public cqo(cqt cqtVar, bxmh bxmhVar) {
        this.b = cqtVar;
        this.a = bxmhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cqt cqtVar = this.b;
        bxmh bxmhVar = this.a;
        if ((bxmhVar.a & 2) == 0) {
            dwjj dwjjVar = bxmhVar.b;
            if (dwjjVar == null) {
                dwjjVar = dwjj.k;
            }
            dvzj dvzjVar = dwjjVar.g;
            if (dvzjVar == null) {
                dvzjVar = dvzj.y;
            }
            cqz cqzVar = cqtVar.aA;
            dbsk.s(cqzVar);
            dxbp dxbpVar = dwjjVar.b;
            if (dxbpVar == null) {
                dxbpVar = dxbp.x;
            }
            cqzVar.n(dxbpVar.b, dvzjVar.b, dvzjVar.c, true, dory.SUGGEST_SELECTION);
            return;
        }
        dnfv bZ = dnfw.d.bZ();
        String str = bxmhVar.c;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnfw dnfwVar = (dnfw) bZ.b;
        str.getClass();
        dnfwVar.a |= 1;
        dnfwVar.b = str;
        dwjj dwjjVar2 = bxmhVar.b;
        if (dwjjVar2 == null) {
            dwjjVar2 = dwjj.k;
        }
        dxbp dxbpVar2 = dwjjVar2.b;
        if (dxbpVar2 == null) {
            dxbpVar2 = dxbp.x;
        }
        String str2 = dxbpVar2.c;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnfw dnfwVar2 = (dnfw) bZ.b;
        str2.getClass();
        dnfwVar2.a |= 2;
        dnfwVar2.c = str2;
        dnfw bK = bZ.bK();
        if (bxmhVar.c.equals("gcid:private_residence")) {
            cqz cqzVar2 = cqtVar.aA;
            dbsk.s(cqzVar2);
            if (cqzVar2.y().booleanValue()) {
                return;
            }
            if (!ActivityManager.isUserAMonkey()) {
                if (cqtVar.e.a()) {
                    cqtVar.w(bK);
                    return;
                } else if (!cqtVar.aD) {
                    return;
                } else {
                    cqtVar.an.a(new cqs(cqtVar, bK)).a("add_a_place");
                    return;
                }
            }
            cqtVar.w(bK);
            return;
        }
        cqz cqzVar3 = cqtVar.aA;
        dbsk.s(cqzVar3);
        if (cqzVar3.y().booleanValue()) {
            cqz cqzVar4 = cqtVar.aA;
            dbsk.s(cqzVar4);
            cqzVar4.D();
        }
        cqz cqzVar5 = cqtVar.aA;
        dbsk.s(cqzVar5);
        cqzVar5.h().b(bK);
    }
}

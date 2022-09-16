package defpackage;

import android.app.Application;
import android.content.Context;
/* compiled from: PG */
/* renamed from: qxd  reason: default package */
/* loaded from: classes7.dex */
public final class qxd {
    public final akox a;
    public final Context b;
    public dcdn<qxc, aktg> c;

    public qxd(akox akoxVar, Application application) {
        this.a = akoxVar;
        this.b = application;
        dcdc<dmlo> dcdcVar = xbb.a;
        this.c = dcmn.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(qxc qxcVar) {
        aktg aktgVar = this.c.get(qxcVar);
        dbsk.s(aktgVar);
        return aktgVar.a();
    }

    public final aktg b(String str) {
        dmog dmogVar = (dmog) dmoh.h.bZ();
        if (dmogVar.c) {
            dmogVar.bF();
            dmogVar.c = false;
        }
        dmoh dmohVar = (dmoh) dmogVar.b;
        int i = dmohVar.a | 4;
        dmohVar.a = i;
        dmohVar.c = 3;
        str.getClass();
        dmohVar.a = i | 1;
        dmohVar.b = str;
        dmoh dmohVar2 = (dmoh) dmogVar.bK();
        dmqt dmqtVar = (dmqt) dmqx.e.bZ();
        dmoo dmooVar = (dmoo) dmop.h.bZ();
        if (dmooVar.c) {
            dmooVar.bF();
            dmooVar.c = false;
        }
        dmop dmopVar = (dmop) dmooVar.b;
        dmopVar.a |= 1;
        dmopVar.b = 0;
        dmpq bZ = dmpv.s.bZ();
        bZ.b(dmohVar2);
        if (dmooVar.c) {
            dmooVar.bF();
            dmooVar.c = false;
        }
        dmop dmopVar2 = (dmop) dmooVar.b;
        dmpv bK = bZ.bK();
        bK.getClass();
        dmopVar2.d = bK;
        dmopVar2.a |= 4;
        dmqtVar.a(dmooVar);
        dmoo dmooVar2 = (dmoo) dmop.h.bZ();
        if (dmooVar2.c) {
            dmooVar2.bF();
            dmooVar2.c = false;
        }
        dmop dmopVar3 = (dmop) dmooVar2.b;
        dmopVar3.a |= 1;
        dmopVar3.b = 16;
        dmpq bZ2 = dmpv.s.bZ();
        bZ2.b(dmohVar2);
        if (dmooVar2.c) {
            dmooVar2.bF();
            dmooVar2.c = false;
        }
        dmop dmopVar4 = (dmop) dmooVar2.b;
        dmpv bK2 = bZ2.bK();
        bK2.getClass();
        dmopVar4.d = bK2;
        dmopVar4.a |= 4;
        dmqtVar.a(dmooVar2);
        return c().c((dmqx) dmqtVar.bK());
    }

    public final akvz c() {
        return this.a.aj().aE();
    }
}

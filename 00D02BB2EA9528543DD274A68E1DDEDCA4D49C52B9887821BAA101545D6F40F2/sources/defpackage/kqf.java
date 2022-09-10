package defpackage;

import android.app.Application;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: kqf  reason: default package */
/* loaded from: classes7.dex */
public final class kqf {
    public static final dcqe a = dcqe.c("kqf");
    public final mvv A;
    private final dxio<axwq> B;
    public final btvo b;
    public final Application c;
    public final cjqy d;
    public final bvrb e;
    public final dxio<ahjq> f;
    public final kcw g;
    public final cqkj h;
    public final akox i;
    public final kdj j;
    public final dxio<ckrb> k;
    public final Future<lzf> l;
    public final Future<nlx> m;
    public final dxio<bnwn> n;
    @dzsi
    public final brlh o;
    public final afke p;
    public final afhe q;
    public final ksr r;
    public final cqat s;
    public final avsq t;
    public final ksw u;
    public final cjqq v;
    public final ckmd w;
    public final kqi x;
    public boolean y;
    @dzsi
    public afkf z;

    public kqf(btvo btvoVar, dxio dxioVar, bunm bunmVar, Application application, cjqy cjqyVar, bvrb bvrbVar, dxio dxioVar2, mvv mvvVar, kcw kcwVar, cqkj cqkjVar, akox akoxVar, kdj kdjVar, dxio dxioVar3, ksr ksrVar, Future future, Future future2, dxio dxioVar4, brlh brlhVar, bvjj bvjjVar, anhk anhkVar, dxio dxioVar5, dxio dxioVar6, vxo vxoVar, dxio dxioVar7, cqat cqatVar, avsq avsqVar, akfa akfaVar, cjqq cjqqVar, ksw kswVar, ckmd ckmdVar, kqj kqjVar) {
        dbsk.s(btvoVar);
        this.b = btvoVar;
        dbsk.s(application);
        this.c = application;
        dbsk.s(cjqyVar);
        this.d = cjqyVar;
        dbsk.s(bvrbVar);
        this.e = bvrbVar;
        dbsk.s(dxioVar2);
        this.f = dxioVar2;
        dbsk.s(mvvVar);
        this.A = mvvVar;
        dbsk.s(kcwVar);
        this.g = kcwVar;
        dbsk.s(cqkjVar);
        this.h = cqkjVar;
        dbsk.s(akoxVar);
        this.i = akoxVar;
        dbsk.s(kdjVar);
        this.j = kdjVar;
        dbsk.s(dxioVar3);
        this.k = dxioVar3;
        dbsk.s(ksrVar);
        this.r = ksrVar;
        dbsk.s(future);
        this.l = future;
        dbsk.s(future2);
        this.m = future2;
        dbsk.s(dxioVar4);
        this.n = dxioVar4;
        dbsk.s(cqatVar);
        this.s = cqatVar;
        this.o = brlhVar;
        this.B = dxioVar7;
        this.p = new kpr(application, bvjjVar, anhkVar, btvoVar, dxioVar, akoxVar, dxioVar5, dxioVar6, vxoVar, bunmVar);
        this.q = new afhe(cjqyVar);
        this.t = avsqVar;
        dbsk.s(akfaVar);
        dbsk.s(cjqqVar);
        this.v = cjqqVar;
        this.u = kswVar;
        this.w = ckmdVar;
        cjqy a2 = kqjVar.a.a();
        kqj.a(a2, 1);
        ckcw a3 = kqjVar.b.a();
        kqj.a(a3, 2);
        cjqq a4 = kqjVar.c.a();
        kqj.a(a4, 3);
        cqat a5 = kqjVar.d.a();
        kqj.a(a5, 4);
        this.x = new kqi(a2, a3, a4, a5);
    }

    public static mnz a(afhu afhuVar) {
        if (afhuVar.j()) {
            ddjr b = afhuVar.b();
            if (b == ddjr.CAR_OVERVIEW_IMPLICIT_DESTINATIONS || b == ddjr.CAR_OVERVIEW_ODELAY || b == ddjr.CAR_OVERVIEW_OFFLINE) {
                return mnz.SHORTCUT_SUGGESTED_DESTINATIONS_AA;
            }
            if (kqk.c(afhuVar)) {
                return mnz.INTENT_NAVIGATE_VOICE;
            }
            return mnz.INTENT_NAVIGATE_NON_VOICE;
        } else if (kqk.b(afhuVar)) {
            return mnz.INTENT_DIRECTIONS_VOICE;
        } else {
            return mnz.INTENT_DIRECTIONS_NON_VOICE;
        }
    }

    public final dbsg<azva> b(dndr dndrVar) {
        dcdc<azva> n = this.B.a().n();
        int size = n.size();
        int i = 0;
        while (i < size) {
            azva azvaVar = n.get(i);
            i++;
            if (azvaVar.a.equals(dndrVar)) {
                return dbsg.i(azvaVar);
            }
        }
        return dbpy.a;
    }
}

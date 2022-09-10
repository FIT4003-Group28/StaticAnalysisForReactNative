package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: eyx  reason: default package */
/* loaded from: classes6.dex */
final class eyx<T> implements dzsj<T> {
    final /* synthetic */ eyy a;
    private final int b;

    public eyx(eyy eyyVar, int i) {
        this.a = eyyVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i == 0) {
            eyy eyyVar = this.a;
            dzsj dzsjVar = eyyVar.c;
            if (dzsjVar == null) {
                dzsjVar = new eyx(eyyVar, 1);
                eyyVar.c = dzsjVar;
            }
            return (T) new bgvo(dzsjVar);
        } else if (i != 1) {
            if (i != 2) {
                eyy eyyVar2 = this.a;
                Resources c = eyyVar2.d.eW.a.c();
                dxjg.e(c);
                return (T) new bgvh(c, dxjc.c(eyyVar2.d.x()));
            }
            eyy eyyVar3 = this.a;
            Resources c2 = eyyVar3.d.eW.a.c();
            dxjg.e(c2);
            return (T) new bgvg(c2, dxjc.c(eyyVar3.d.ti()));
        } else {
            eyy eyyVar4 = this.a;
            Resources c3 = eyyVar4.d.eW.a.c();
            dxjg.e(c3);
            bgvc bgvcVar = new bgvc(c3, dxjc.c(eyyVar4.d.uj()));
            eyyVar4.d.fp();
            Resources c4 = eyyVar4.d.eW.a.c();
            dxjg.e(c4);
            dxio c5 = dxjc.c(eyyVar4.d.cn());
            dxjc.c(eyyVar4.d.lZ());
            bgvb bgvbVar = new bgvb(c4, c5);
            eyyVar4.d.fp();
            Resources c6 = eyyVar4.d.eW.a.c();
            dxjg.e(c6);
            dxio c7 = dxjc.c(eyyVar4.d.cn());
            dxjc.c(eyyVar4.d.lZ());
            bgva bgvaVar = new bgva(c6, c7);
            Resources c8 = eyyVar4.d.eW.a.c();
            dxjg.e(c8);
            bguy bguyVar = new bguy(c8, dxjc.c(eyyVar4.d.lk()));
            Resources c9 = eyyVar4.d.eW.a.c();
            dxjg.e(c9);
            bguw bguwVar = new bguw(c9, dxjc.c(eyyVar4.d.lk()));
            Resources c10 = eyyVar4.d.eW.a.c();
            dxjg.e(c10);
            bgvj bgvjVar = new bgvj(c10, dxjc.c(eyyVar4.d.aH()));
            Resources c11 = eyyVar4.d.eW.a.c();
            dxjg.e(c11);
            bguz bguzVar = new bguz(c11, dxjc.c(eyyVar4.d.qT()));
            Resources c12 = eyyVar4.d.eW.a.c();
            dxjg.e(c12);
            bguv bguvVar = new bguv(c12, dxjc.c(eyyVar4.d.lk()));
            Resources c13 = eyyVar4.d.eW.a.c();
            dxjg.e(c13);
            bgux bguxVar = new bgux(c13, dxjc.c(eyyVar4.d.bf()));
            Resources c14 = eyyVar4.d.eW.a.c();
            dxjg.e(c14);
            bgvi bgviVar = new bgvi(c14, dxjc.c(eyyVar4.d.fF()));
            dzsj dzsjVar2 = eyyVar4.a;
            if (dzsjVar2 == null) {
                dzsjVar2 = new eyx(eyyVar4, 2);
                eyyVar4.a = dzsjVar2;
            }
            dzsj dzsjVar3 = dzsjVar2;
            if (eyyVar4.b == null) {
                eyyVar4.b = new eyx(eyyVar4, 3);
            }
            return (T) new bgvf(bgvcVar, bgvbVar, bgvaVar, bguyVar, bguwVar, bgvjVar, bguzVar, bguvVar, bguxVar, bgviVar, dzsjVar3);
        }
    }
}

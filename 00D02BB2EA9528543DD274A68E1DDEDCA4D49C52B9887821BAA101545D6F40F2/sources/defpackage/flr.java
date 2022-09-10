package defpackage;

import android.app.Application;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: flr  reason: default package */
/* loaded from: classes6.dex */
public final class flr<T> implements dzsj<T> {
    final /* synthetic */ fls a;
    private final int b;

    public flr(fls flsVar, int i) {
        this.a = flsVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r2v51, types: [T, apkg, apkf] */
    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                return (T) new anpc();
            case 1:
                return (T) this.a.c();
            case 2:
                fls flsVar = this.a;
                return (T) new anpb(flsVar.h.ad(), flsVar.b(), flsVar.h.eW.K(), flsVar.h.eW.jB(), flsVar.h.aX(), flsVar.h.bf(), flsVar.d(), flsVar.e(), flsVar.f(), flsVar.h.eW.V(), flsVar.h.eW.fx(), flsVar.h.dM(), flsVar.g());
            case 3:
                Application a = this.a.h.eW.a.a();
                dxjg.e(a);
                return (T) new anqx(a);
            case 4:
                return (T) new anru();
            case 5:
                fls flsVar2 = this.a;
                dzsj dzsjVar = flsVar2.a;
                if (dzsjVar == null) {
                    dzsjVar = new flr(flsVar2, 6);
                    flsVar2.a = dzsjVar;
                }
                dzsj dzsjVar2 = flsVar2.b;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new flr(flsVar2, 7);
                    flsVar2.b = dzsjVar2;
                }
                return (T) new aoiw(dzsjVar, dzsjVar2, flsVar2.h.eW.m());
            case 6:
                fls flsVar3 = this.a;
                return (T) new aojt(flsVar3.g, flsVar3.h.bf(), flsVar3.h.eW.m(), flsVar3.h.eW.ow(), flsVar3.h.eW.fx(), flsVar3.h.ad());
            case 7:
                fls flsVar4 = this.a;
                return (T) aoja.b(flsVar4.h.dM(), flsVar4.h.aX());
            case 8:
                return (T) new aojq();
            case 9:
                return (T) new anqv(this.a.h.eW.ok());
            case 10:
                fls flsVar5 = this.a;
                dzsj<gga> ad = flsVar5.h.ad();
                dzsj<cqat> K = flsVar5.h.eW.K();
                dzsj<angp> jB = flsVar5.h.eW.jB();
                dzsj<anhg> aX = flsVar5.h.aX();
                dzsj<bbut> bf = flsVar5.h.bf();
                dzsj<anqx> d = flsVar5.d();
                dzsj<cjqy> al = flsVar5.h.eW.al();
                dzsj dzsjVar3 = flsVar5.d;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new flr(flsVar5, 11);
                    flsVar5.d = dzsjVar3;
                }
                dzsj dzsjVar4 = dzsjVar3;
                dzsj<anru> e = flsVar5.e();
                dzsj<anrz> h = flsVar5.h();
                dzsj<anpw> ug = flsVar5.h.ug();
                dzsj<aoiw> f = flsVar5.f();
                dzsj c = dxjh.c(flsVar5.h.az());
                dzsj<btvo> V = flsVar5.h.eW.V();
                dzsj<aogw> fx = flsVar5.h.eW.fx();
                dzsj<aokw> dM = flsVar5.h.dM();
                dzsj dzsjVar5 = flsVar5.f;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new flr(flsVar5, 12);
                    flsVar5.f = dzsjVar5;
                }
                return (T) new anrz(ad, K, jB, aX, bf, d, al, dzsjVar4, e, h, ug, f, c, V, fx, dM, dzsjVar5, flsVar5.g());
            case 11:
                fls flsVar6 = this.a;
                T t = (T) flsVar6.c;
                if (t != null) {
                    return t;
                }
                Application a2 = flsVar6.h.eW.a.a();
                dxjg.e(a2);
                ?? r2 = (T) new apkg(a2, flsVar6.h.eW.qn());
                flsVar6.c = r2;
                return r2;
            case 12:
                fls flsVar7 = this.a;
                dzsj dzsjVar6 = flsVar7.e;
                if (dzsjVar6 == null) {
                    dzsjVar6 = new flr(flsVar7, 13);
                    flsVar7.e = dzsjVar6;
                }
                return (T) new aofe(dzsjVar6, flsVar7.h.eW.m(), flsVar7.h.uh());
            default:
                return (T) aofh.b(this.a.h.uh());
        }
    }
}

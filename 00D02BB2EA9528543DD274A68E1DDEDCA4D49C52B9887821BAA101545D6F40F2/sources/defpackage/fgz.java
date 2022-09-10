package defpackage;

import android.content.res.Resources;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fgz  reason: default package */
/* loaded from: classes6.dex */
public final class fgz<T> implements dzsj<T> {
    final /* synthetic */ fha a;
    private final int b;

    public fgz(fha fhaVar, int i) {
        this.a = fhaVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                fha fhaVar = this.a;
                dzsj<cfgm> b = fhaVar.b();
                dzsj c = dxjh.c(fhaVar.r.cD());
                dzsj<Executor> di = fhaVar.r.eW.di();
                dzsj<cqhn> il = fhaVar.r.eW.il();
                dzsj<ceze> f = fhaVar.f();
                dzsj dzsjVar = fhaVar.b;
                if (dzsjVar == null) {
                    dzsjVar = new fgz(fhaVar, 3);
                    fhaVar.b = dzsjVar;
                }
                dzsj dzsjVar2 = dzsjVar;
                dzsj dzsjVar3 = fhaVar.d;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new fgz(fhaVar, 7);
                    fhaVar.d = dzsjVar3;
                }
                dzsj dzsjVar4 = dzsjVar3;
                dzsj dzsjVar5 = fhaVar.e;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new fgz(fhaVar, 9);
                    fhaVar.e = dzsjVar5;
                }
                dzsj dzsjVar6 = dzsjVar5;
                dzsj dzsjVar7 = fhaVar.g;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new fgz(fhaVar, 10);
                    fhaVar.g = dzsjVar7;
                }
                dzsj dzsjVar8 = dzsjVar7;
                dzsj dzsjVar9 = fhaVar.i;
                if (dzsjVar9 == null) {
                    dzsjVar9 = new fgz(fhaVar, 12);
                    fhaVar.i = dzsjVar9;
                }
                dzsj dzsjVar10 = dzsjVar9;
                dzsj dzsjVar11 = fhaVar.k;
                if (dzsjVar11 == null) {
                    dzsjVar11 = new fgz(fhaVar, 14);
                    fhaVar.k = dzsjVar11;
                }
                dzsj dzsjVar12 = dzsjVar11;
                dzsj dzsjVar13 = fhaVar.m;
                if (dzsjVar13 == null) {
                    dzsjVar13 = new fgz(fhaVar, 16);
                    fhaVar.m = dzsjVar13;
                }
                dzsj dzsjVar14 = dzsjVar13;
                dzsj dzsjVar15 = fhaVar.n;
                if (dzsjVar15 == null) {
                    dzsjVar15 = new fgz(fhaVar, 18);
                    fhaVar.n = dzsjVar15;
                }
                dzsj dzsjVar16 = dzsjVar15;
                dzsj<bwsh> da = fhaVar.r.da();
                dzsj dzsjVar17 = fhaVar.o;
                if (dzsjVar17 == null) {
                    dzsjVar17 = new fgz(fhaVar, 19);
                    fhaVar.o = dzsjVar17;
                }
                dzsj dzsjVar18 = dzsjVar17;
                dzsj<gga> ad = fhaVar.r.ad();
                dzsj dzsjVar19 = fhaVar.p;
                if (dzsjVar19 == null) {
                    dzsjVar19 = new fgz(fhaVar, 20);
                    fhaVar.p = dzsjVar19;
                }
                dzsj dzsjVar20 = dzsjVar19;
                dzsj<cfgv> g = fhaVar.g();
                dzsj<cqhu> eS = fhaVar.r.eS();
                dzsj<cpv> bk = fhaVar.r.eW.bk();
                dzsj<btvo> V = fhaVar.r.eW.V();
                dzsj dzsjVar21 = fhaVar.q;
                if (dzsjVar21 == null) {
                    dzsjVar21 = new fgz(fhaVar, 21);
                    fhaVar.q = dzsjVar21;
                }
                return (T) new cfjb(b, c, di, il, f, dzsjVar2, dzsjVar4, dzsjVar6, dzsjVar8, dzsjVar10, dzsjVar12, dzsjVar14, dzsjVar16, da, dzsjVar18, ad, dzsjVar20, g, eS, bk, V, dzsjVar21);
            case 1:
                return (T) new cfgm(this.a.r.wk());
            case 2:
                return (T) this.a.e();
            case 3:
                fha fhaVar2 = this.a;
                dzsj<cfgv> g2 = fhaVar2.g();
                dzsj c2 = dxjh.c(fhaVar2.r.av());
                dzsj h = fhaVar2.h();
                dzsj dzsjVar22 = fhaVar2.a;
                if (dzsjVar22 == null) {
                    dzsjVar22 = new fgz(fhaVar2, 6);
                    fhaVar2.a = dzsjVar22;
                }
                return (T) new cfjv(g2, c2, h, dzsjVar22);
            case 4:
                return (T) this.a.c();
            case 5:
                return (T) new cfhy();
            case 6:
                fha fhaVar3 = this.a;
                return (T) new cfjq(fhaVar3.r.eW.il(), dxjh.c(fhaVar3.r.av()));
            case 7:
                fha fhaVar4 = this.a;
                dzsj<Resources> fr = fhaVar4.r.eW.fr();
                dzsj<cqhu> eS2 = fhaVar4.r.eS();
                dzsj<cfgv> g3 = fhaVar4.g();
                dzsj c3 = dxjh.c(fhaVar4.r.av());
                dzsj<cjnf> tx = fhaVar4.r.tx();
                dzsj<gce> ie = fhaVar4.r.eW.ie();
                dzsj dzsjVar23 = fhaVar4.c;
                if (dzsjVar23 == null) {
                    dzsjVar23 = new fgz(fhaVar4, 8);
                    fhaVar4.c = dzsjVar23;
                }
                return (T) new cfki(fr, eS2, g3, c3, tx, ie, dzsjVar23, fhaVar4.h());
            case 8:
                fha fhaVar5 = this.a;
                return (T) new cfjy(fhaVar5.r.eW.fr(), fhaVar5.g(), fhaVar5.r.eW.ie());
            case 9:
                fha fhaVar6 = this.a;
                return (T) new cfhw(fhaVar6.r.eW.il(), fhaVar6.g());
            case 10:
                fha fhaVar7 = this.a;
                dzsj dzsjVar24 = fhaVar7.f;
                if (dzsjVar24 == null) {
                    dzsjVar24 = new fgz(fhaVar7, 11);
                    fhaVar7.f = dzsjVar24;
                }
                return (T) new cflc(dzsjVar24);
            case 11:
                fha fhaVar8 = this.a;
                return (T) new cfkz(fhaVar8.g(), fhaVar8.r.eW.il());
            case 12:
                fha fhaVar9 = this.a;
                dzsj<cfgv> g4 = fhaVar9.g();
                dzsj dzsjVar25 = fhaVar9.h;
                if (dzsjVar25 == null) {
                    dzsjVar25 = new fgz(fhaVar9, 13);
                    fhaVar9.h = dzsjVar25;
                }
                return (T) new cfkx(g4, dzsjVar25);
            case 13:
                return (T) new cfku(this.a.r.eW.il());
            case 14:
                fha fhaVar10 = this.a;
                dzsj<cfgv> g5 = fhaVar10.g();
                dzsj dzsjVar26 = fhaVar10.j;
                if (dzsjVar26 == null) {
                    dzsjVar26 = new fgz(fhaVar10, 15);
                    fhaVar10.j = dzsjVar26;
                }
                return (T) new cfie(g5, dzsjVar26);
            case 15:
                return (T) new cfia(this.a.r.eW.il());
            case 16:
                fha fhaVar11 = this.a;
                dzsj<cfgv> g6 = fhaVar11.g();
                dzsj dzsjVar27 = fhaVar11.l;
                if (dzsjVar27 == null) {
                    dzsjVar27 = new fgz(fhaVar11, 17);
                    fhaVar11.l = dzsjVar27;
                }
                return (T) new cfij(g6, dzsjVar27);
            case 17:
                return (T) new cfig(this.a.r.eW.il());
            case 18:
                return (T) new cfks(this.a.r.ad());
            case 19:
                return (T) this.a.i();
            case 20:
                fha fhaVar12 = this.a;
                return (T) new cfkl(fhaVar12.r.eW.il(), fhaVar12.g(), fhaVar12.r.eV);
            case 21:
                return (T) this.a.d();
            case 22:
                fha fhaVar13 = this.a;
                return (T) new cfkq(fhaVar13.b(), fhaVar13.r.eW.il(), fhaVar13.r.eS(), dxjh.c(fhaVar13.r.eW.p()), fhaVar13.r.ad(), dxjh.c(fhaVar13.r.tk()), fhaVar13.k(), fhaVar13.r.eW.o(), fhaVar13.r.eW.bk());
            default:
                return (T) this.a.j();
        }
    }
}

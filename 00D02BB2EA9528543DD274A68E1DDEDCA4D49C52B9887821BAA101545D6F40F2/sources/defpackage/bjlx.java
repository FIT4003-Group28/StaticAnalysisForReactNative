package defpackage;
/* compiled from: PG */
/* renamed from: bjlx  reason: default package */
/* loaded from: classes3.dex */
public final class bjlx implements degu<btzx<djaa, djae>> {
    final /* synthetic */ boolean a;
    final /* synthetic */ bjmi b;

    public bjlx(bjmi bjmiVar, boolean z) {
        this.b = bjmiVar;
        this.a = z;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.b.r = dbpy.a;
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(btzx<djaa, djae> btzxVar) {
        djgl d;
        this.b.r = dbpy.a;
        djae b = btzxVar.b();
        int a = djad.a(b.b);
        if (a != 0 && a == 2) {
            this.b.b.b(new bjfg());
            this.b.b.b(new bjfa(true != this.a ? 1 : 2, 2));
            if (!this.a) {
                bjmi bjmiVar = this.b;
                ges gesVar = bjmiVar.g;
                bjhw bZ = bjhz.e.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bjhz bjhzVar = (bjhz) bZ.b;
                bjhzVar.d = 2;
                bjhzVar.a |= 4;
                String o = bjmiVar.p.ai().o();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bjhz bjhzVar2 = (bjhz) bZ.b;
                o.getClass();
                bjhzVar2.a = 1 | bjhzVar2.a;
                bjhzVar2.b = o;
                bjfw bjfwVar = bjmiVar.o.b;
                if (bjfwVar == null) {
                    bjfwVar = bjfw.l;
                }
                bjfu bjfuVar = bjfwVar.b;
                if (bjfuVar == null) {
                    bjfuVar = bjfu.c;
                }
                String str = bjfuVar.b;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bjhz bjhzVar3 = (bjhz) bZ.b;
                str.getClass();
                bjhzVar3.a = 2 | bjhzVar3.a;
                bjhzVar3.c = str;
                gesVar.Nw(bZ.bK());
                bjmi bjmiVar2 = this.b;
                if (!bjmiVar2.s.a) {
                    if ((b.a & 8) != 0) {
                        d = b.d;
                        if (d == null) {
                            d = djgl.g;
                        }
                    } else {
                        d = bjmiVar2.n.d();
                    }
                    bjmiVar2.m.a().a(d, dtxy.fQ, dtxy.fR);
                }
                bjmi bjmiVar3 = this.b;
                if (bjmiVar3.s.b) {
                    bjmiVar3.f();
                }
            }
            this.b.g();
        }
    }
}

package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bagz  reason: default package */
/* loaded from: classes3.dex */
public class bagz extends baix {
    public final GmmLocation a;
    public final axwg b;
    public final baih c;
    private final gga h;

    public bagz(huc hucVar, cqhn cqhnVar, btpc btpcVar, btrg btrgVar, Executor executor, gga ggaVar, ahjq ahjqVar, axwg axwgVar, bnjv bnjvVar, baih baihVar, bvpe bvpeVar) {
        super(hucVar, btpcVar, btrgVar, executor, bnjvVar, cjtd.a(dtxy.at), bvpeVar);
        this.h = ggaVar;
        this.a = ahjqVar.a();
        this.b = axwgVar;
        this.c = baihVar;
    }

    @Override // defpackage.baev
    public baei a() {
        return new bagy();
    }

    @Override // defpackage.baix, defpackage.baev
    public /* bridge */ /* synthetic */ iib b() {
        return super.b();
    }

    @Override // defpackage.baix
    public final void c(dcdc<baal> dcdcVar, dcdc<azxk> dcdcVar2, dcdc<azva> dcdcVar3) {
        if (this.a != null) {
            super.c(dcdcVar, dcdcVar2, dcdcVar3);
        }
    }

    @Override // defpackage.baix
    protected final dcdc<baig> d(dcdc<baal> dcdcVar, dcdc<azxk> dcdcVar2, dcdc<azva> dcdcVar3) {
        return bait.b(this.h, new dbrn(this) { // from class: bagq
            private final bagz a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                GmmLocation gmmLocation = this.a.a;
                dbsk.s(gmmLocation);
                baak z = ((baal) obj).z();
                dbsk.s(z);
                return Float.valueOf(gmmLocation.F(z.b()));
            }
        }, new dbrn(this) { // from class: bagr
            private final bagz a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                GmmLocation gmmLocation = this.a.a;
                dbsk.s(gmmLocation);
                dolk dolkVar = ((azxk) obj).g().c;
                if (dolkVar == null) {
                    dolkVar = dolk.h;
                }
                dnoh dnohVar = dolkVar.e;
                if (dnohVar == null) {
                    dnohVar = dnoh.d;
                }
                return Float.valueOf(gmmLocation.F(akqq.e(dnohVar)));
            }
        }, new dbrn(this) { // from class: bags
            private final bagz a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                GmmLocation gmmLocation = this.a.a;
                dbsk.s(gmmLocation);
                akqq akqqVar = ((azva) obj).e;
                return akqqVar == null ? Float.valueOf(0.0f) : Float.valueOf(gmmLocation.F(akqqVar));
            }
        }, bagt.a, dcln.a, new dbrn(this) { // from class: bagu
            private final bagz a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                ddho ddhoVar;
                ddho ddhoVar2;
                baal baalVar = (baal) obj;
                baih baihVar = this.a.c;
                baad b = baalVar.b();
                dbsk.s(b);
                baab o = b.o();
                baab baabVar = baab.FAVORITES;
                int ordinal = o.ordinal();
                if (ordinal != 0) {
                    ddhoVar = ordinal != 1 ? dtxy.au : dtxy.aD;
                } else {
                    ddhoVar = dtxy.av;
                }
                int ordinal2 = o.ordinal();
                if (ordinal2 != 0) {
                    ddhoVar2 = ordinal2 != 1 ? dtxy.ay : dtxy.aC;
                } else {
                    ddhoVar2 = dtxy.az;
                }
                return baihVar.a(baalVar, true, ddhoVar, ddhoVar2);
            }
        }, new dbrn(this) { // from class: bagv
            private final bagz a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.c.b((azxk) obj, true, dtxy.ax, dtxy.aB);
            }
        }, new dbrn(this) { // from class: bagw
            private final bagz a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.c.c((azva) obj, true, dtxy.aw, dtxy.aA);
            }
        }, dcdcVar, dcdcVar2, dcdcVar3).o(new dbsl(this) { // from class: bagx
            private final bagz a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                bagz bagzVar = this.a;
                return bagzVar.b.j() <= 0 || ((baig) obj).k < ((float) bagzVar.b.j());
            }
        }).z();
    }

    @Override // defpackage.baix
    public /* bridge */ /* synthetic */ boolean e() {
        return super.e();
    }
}

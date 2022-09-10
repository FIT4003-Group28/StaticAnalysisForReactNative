package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bahj  reason: default package */
/* loaded from: classes3.dex */
public class bahj extends baix {
    public final cqat a;
    public final axwg b;
    public final baih c;
    private final gga h;

    public bahj(huc hucVar, cqat cqatVar, cqhn cqhnVar, btpc btpcVar, btrg btrgVar, Executor executor, gga ggaVar, axwg axwgVar, bnjv bnjvVar, baih baihVar, bvpe bvpeVar) {
        super(hucVar, btpcVar, btrgVar, executor, bnjvVar, cjtd.a(dtxy.aI), bvpeVar);
        this.a = cqatVar;
        this.h = ggaVar;
        this.b = axwgVar;
        this.c = baihVar;
    }

    @Override // defpackage.baev
    public baei a() {
        return new bahi();
    }

    @Override // defpackage.baix, defpackage.baev
    public /* bridge */ /* synthetic */ iib b() {
        return super.b();
    }

    @Override // defpackage.baix
    protected final dcdc<baig> d(dcdc<baal> dcdcVar, dcdc<azxk> dcdcVar2, dcdc<azva> dcdcVar3) {
        return bait.b(this.h, baha.a, bahb.a, bahc.a, bahd.a, dcmw.a, new dbrn(this) { // from class: bahe
            private final bahj a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                ddho ddhoVar;
                ddho ddhoVar2;
                bahj bahjVar = this.a;
                baal baalVar = (baal) obj;
                baad b = baalVar.b();
                dbsk.s(b);
                baab o = b.o();
                baih baihVar = bahjVar.c;
                baab baabVar = baab.FAVORITES;
                int ordinal = o.ordinal();
                if (ordinal != 0) {
                    ddhoVar = ordinal != 1 ? dtxy.aJ : dtxy.aS;
                } else {
                    ddhoVar = dtxy.aK;
                }
                int ordinal2 = o.ordinal();
                if (ordinal2 != 0) {
                    ddhoVar2 = ordinal2 != 1 ? dtxy.aN : dtxy.aR;
                } else {
                    ddhoVar2 = dtxy.aO;
                }
                return baihVar.a(baalVar, false, ddhoVar, ddhoVar2);
            }
        }, new dbrn(this) { // from class: bahf
            private final bahj a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.c.b((azxk) obj, false, dtxy.aM, dtxy.aQ);
            }
        }, new dbrn(this) { // from class: bahg
            private final bahj a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.c.c((azva) obj, false, dtxy.aL, dtxy.aP);
            }
        }, dcdcVar, dcdcVar2, dcdcVar3).o(new dbsl(this) { // from class: bahh
            private final bahj a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                bahj bahjVar = this.a;
                return bahjVar.b.h() <= 0 || bahjVar.a.b() - ((baig) obj).l < TimeUnit.DAYS.toMillis((long) bahjVar.b.h());
            }
        }).z();
    }

    @Override // defpackage.baix
    public /* bridge */ /* synthetic */ boolean e() {
        return super.e();
    }
}

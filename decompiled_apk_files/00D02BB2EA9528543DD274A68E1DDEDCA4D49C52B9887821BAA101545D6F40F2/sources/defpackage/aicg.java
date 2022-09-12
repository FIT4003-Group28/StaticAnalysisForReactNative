package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aicg  reason: default package */
/* loaded from: classes2.dex */
public final class aicg extends aica {
    public static final /* synthetic */ int e = 0;
    public boolean b;
    @dzsi
    public GmmLocation c;
    @dzsi
    public cray d;
    private final btrm f;
    private final btvo g;
    @dzsi
    private aice h;

    static {
        TimeUnit.SECONDS.toMillis(20L);
    }

    public aicg(cqat cqatVar, btrm btrmVar, aiby aibyVar, btvo btvoVar) {
        super(cqatVar, aibyVar);
        this.b = false;
        this.f = btrmVar;
        this.g = btvoVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aica
    public final synchronized void d() {
        dbsk.m(this.h == null, "Should not be started twice");
        aice aiceVar = new aice(this);
        this.h = aiceVar;
        btrm btrmVar = this.f;
        dceq a = dcet.a();
        a.b(crhp.class, new aich(0, crhp.class, aiceVar, bvrj.UI_THREAD));
        a.b(crhq.class, new aich(1, crhq.class, aiceVar, bvrj.UI_THREAD));
        a.b(crmk.class, new aich(2, crmk.class, aiceVar, bvrj.UI_THREAD));
        a.b(crmj.class, new aich(3, crmj.class, aiceVar, bvrj.UI_THREAD));
        a.b(crmh.class, new aich(4, crmh.class, aiceVar, bvrj.UI_THREAD));
        btrmVar.g(aiceVar, a.a());
    }

    @Override // defpackage.aica
    protected final synchronized void e() {
        dbsk.m(this.h != null, "Should not be stopped twice");
        btrm btrmVar = this.f;
        aice aiceVar = this.h;
        dbsk.s(aiceVar);
        btrmVar.a(aiceVar);
        this.h = null;
    }

    @Override // defpackage.aica
    @dzsi
    public final GmmLocation f() {
        if (!this.b) {
            return null;
        }
        return this.c;
    }

    @Override // defpackage.aica
    protected final dkod g() {
        dkod dkodVar = this.g.getLocationSharingParameters().D;
        return dkodVar == null ? dkod.c : dkodVar;
    }

    @Override // defpackage.aica
    @dzsi
    protected final doek h() {
        Integer num = null;
        if (this.b && this.d != null) {
            doej bZ = doek.f.bZ();
            boolean z = !b(f());
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            doek doekVar = (doek) bZ.b;
            doekVar.a |= 4;
            doekVar.d = z;
            cray crayVar = this.d;
            if (crayVar != null) {
                amub amubVar = crayVar.a;
                dqvj dqvjVar = amubVar.h;
                if (crayVar.a() != -1) {
                    num = Integer.valueOf(crayVar.a());
                }
                doqt f = aibf.f(amubVar, dqvjVar, null, num, Math.round(crayVar.c()), crayVar.k, crayVar.f());
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                doek doekVar2 = (doek) bZ.b;
                f.getClass();
                doekVar2.c = f;
                doekVar2.a |= 2;
            }
            return bZ.bK();
        }
        return null;
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.h("isGuidanceRunning", this.b);
        b.b("lastKnownLocation", this.c);
        b.b("lastKnownNavGuidanceState", this.d);
        b.b("derived: journeyInternal", h());
        b.b("derived: journey", i());
        b.b("derived: location", f());
        b.h("derived: isStopped", !b(f()));
        return b.toString();
    }
}

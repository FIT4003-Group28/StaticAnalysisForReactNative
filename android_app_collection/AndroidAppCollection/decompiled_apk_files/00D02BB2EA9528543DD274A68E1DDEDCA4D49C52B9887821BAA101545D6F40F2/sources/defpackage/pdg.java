package defpackage;
/* compiled from: PG */
/* renamed from: pdg  reason: default package */
/* loaded from: classes7.dex */
public final class pdg implements pcx<dlhp> {
    private final dxio<ckcw> c;
    private final btvo d;
    private final cqat e;
    private final dxio<ahwh> f;
    private final dxio<akfa> g;
    private static final dcqe b = dcqe.c("pdg");
    public static final int a = auiy.OVEN_FRESH.a().intValue();

    public pdg(dxio<ckcw> dxioVar, btvo btvoVar, cqat cqatVar, dxio<ahwh> dxioVar2, dxio<akfa> dxioVar3) {
        this.c = dxioVar;
        this.d = btvoVar;
        this.e = cqatVar;
        this.f = dxioVar2;
        this.g = dxioVar3;
    }

    @Override // defpackage.pcx
    public final boolean a(int i) {
        return i == a;
    }

    @Override // defpackage.pcx
    public final dssr<dlhp> b() {
        return (dssr) dlhp.i.cu(7);
    }

    @Override // defpackage.pcx
    public final /* bridge */ /* synthetic */ int c(dlhp dlhpVar) {
        return dpyv.LOCATION_SHARING_OVEN_FRESH.dm;
    }

    @Override // defpackage.pcx
    public final /* bridge */ /* synthetic */ void d(pau pauVar, pas pasVar, dlhp dlhpVar) {
        dlhp dlhpVar2 = dlhpVar;
        dqxv bZ = dqxx.h.bZ();
        long b2 = this.e.b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqxx dqxxVar = (dqxx) bZ.b;
        int i = dqxxVar.a | 16;
        dqxxVar.a = i;
        dqxxVar.f = b2;
        if ((dlhpVar2.a & 64) != 0) {
            String str = dlhpVar2.g;
            str.getClass();
            i |= 1;
            dqxxVar.a = i;
            dqxxVar.b = str;
        }
        if ((dlhpVar2.a & 128) != 0) {
            long j = dlhpVar2.h;
            dqxxVar.a = i | 32;
            dqxxVar.g = j;
        }
        ((ckco) this.c.a().a(ckgd.k)).a(0);
        dkof dkofVar = this.d.getLocationSharingParameters().q;
        if (dkofVar == null) {
            dkofVar = dkof.s;
        }
        if (dkofVar.n) {
            ((ckco) this.c.a().a(ckgd.l)).a(ckfx.CLIENT_PARAMETER_DISABLED.l);
        } else if ((pauVar.a & 1) == 0) {
            ((ckco) this.c.a().a(ckgd.l)).a(ckfx.INVALID_NOTIFICATION_PAYLOAD.l);
            bvoo.h("OvenFresh notification without Gaia ID.", new Object[0]);
        } else {
            btlu n = this.g.a().n(pauVar.b);
            if (n == null) {
                ((ckco) this.c.a().a(ckgd.l)).a(ckfx.NOT_LOGGED_IN.l);
                bvoo.h("OvenFresh notification for user not signed in.", new Object[0]);
                return;
            }
            ((ckco) this.c.a().a(ckgd.m)).a((int) new eaow(new eapd(((dqxx) bZ.b).f), new eapd(this.e.b())).b);
            this.f.a().a(n, dlhpVar2, bZ);
        }
    }
}

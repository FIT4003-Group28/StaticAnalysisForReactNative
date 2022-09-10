package defpackage;
/* compiled from: PG */
/* renamed from: byoh  reason: default package */
/* loaded from: classes.dex */
public final class byoh implements awnu {
    private final bvjj a;
    private final btvo b;
    private final eeu c;
    private final bypr d;
    private final crfm e;

    public byoh(bvjj bvjjVar, btvo btvoVar, crfm crfmVar, eeu eeuVar, bypr byprVar) {
        this.a = bvjjVar;
        this.b = btvoVar;
        this.e = crfmVar;
        this.c = eeuVar;
        this.d = byprVar;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.AREA_TRAFFIC_WARMUP;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.CRITICAL;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        if (!((efh) this.c).d && ((crgt) this.e).b == null) {
            bypr byprVar = this.d;
            dkql dkqlVar = this.b.getNotificationsParameters().j;
            if (dkqlVar == null) {
                dkqlVar = dkql.k;
            }
            return byprVar.b(dkqlVar);
        }
        return false;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        if (!this.a.m(bvjk.df, false)) {
            return bzmk.VISIBLE;
        }
        return bzmk.NONE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        return bzmkVar != bzmk.REPRESSED;
    }

    @Override // defpackage.awnu
    public final ggg g() {
        return new byog();
    }
}

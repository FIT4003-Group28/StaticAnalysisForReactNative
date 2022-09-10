package defpackage;
/* compiled from: PG */
/* renamed from: brft  reason: default package */
/* loaded from: classes4.dex */
public final class brft implements brwy {
    public final bvjj a;
    public final gga b;
    public final bzmm c;
    private final brcs d;
    private final boolean e;

    public brft(brdi brdiVar, brcs brcsVar, bvjj bvjjVar, gga ggaVar, bzmm bzmmVar) {
        this.d = brcsVar;
        this.a = bvjjVar;
        this.b = ggaVar;
        this.c = bzmmVar;
        dcdc<brcy> b = brdiVar.b();
        int size = b.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            }
            int i2 = i + 1;
            if (!b.get(i).e().isEmpty()) {
                break;
            }
            i = i2;
        }
        this.e = z;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.ELECTRIC_VEHICLE_PROFILE_SEARCH_RESULT_PROMO;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.CRITICAL;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return false;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        if (this.d.a() && this.e) {
            if (bryb.a(this.c.d(dqkc.ELECTRIC_VEHICLE_PROFILE_SEARCH_RESULT_PROMO), this.c.c(dqkc.ELECTRIC_VEHICLE_PROFILE_SEARCH_RESULT_PROMO), this.a.m(bvjk.X, false))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        return bzmk.VISIBLE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        return bzmkVar == bzmk.VISIBLE;
    }

    @Override // defpackage.brwy
    public final bryf g() {
        return new brgg(this.b.getResources(), new Runnable(this) { // from class: brfr
            private final brft a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.D(brcr.g(null, true));
            }
        }, new brye(this) { // from class: brfs
            private final brft a;

            {
                this.a = this;
            }

            @Override // defpackage.brye
            public final void a() {
                brft brftVar = this.a;
                brftVar.a.S(bvjk.X, true);
                brftVar.c.f(dqkc.ELECTRIC_VEHICLE_PROFILE_SEARCH_RESULT_PROMO);
            }
        });
    }

    @Override // defpackage.brwy
    public final int h(brww brwwVar) {
        return 2;
    }
}

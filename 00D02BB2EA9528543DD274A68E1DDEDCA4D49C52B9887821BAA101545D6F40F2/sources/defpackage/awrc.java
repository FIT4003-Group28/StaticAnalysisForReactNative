package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: awrc  reason: default package */
/* loaded from: classes.dex */
public final class awrc implements bzml {
    public final aetv a;
    @dzsi
    public akra b;
    private final gga c;
    private final bvjj d;
    private final btrm e;
    private final akpm f;
    private final dxio<bzmm> g;
    private final dxio<ahjq> h;
    private final dxio<awti> i;
    private final axru j;
    private final cjqq k;
    private final cqat l;
    private final cpv m;
    private boolean n;

    public awrc(gga ggaVar, bvjj bvjjVar, btrm btrmVar, akpm akpmVar, aetv aetvVar, dxio<bzmm> dxioVar, dxio<ahjq> dxioVar2, dxio<awti> dxioVar3, axru axruVar, cjqq cjqqVar, cqat cqatVar, cpv cpvVar) {
        this.c = ggaVar;
        this.d = bvjjVar;
        this.e = btrmVar;
        this.f = akpmVar;
        this.a = aetvVar;
        this.g = dxioVar;
        this.h = dxioVar2;
        this.i = dxioVar3;
        this.j = axruVar;
        this.k = cjqqVar;
        this.l = cqatVar;
        this.m = cpvVar;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.PARKING_LOCATION;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.LOW;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        return !this.m.e(this.c) && this.i.a().e() && this.i.a().f() == null && this.j.a("android.permission.ACCESS_COARSE_LOCATION") && this.h.a().h().a();
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        if (!this.d.m(bvjk.hq, false) && this.g.a().b(dqkc.PARKING_LOCATION) != bzmk.VISIBLE) {
            if (this.l.b() - this.d.w(bvjk.hr, 0L) < 5000) {
                return bzmk.VISIBLE;
            }
        }
        return bzmk.NONE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        akra akraVar;
        if (bzmkVar == bzmk.REPRESSED || (akraVar = this.b) == null) {
            return false;
        }
        float max = Math.max(16.0f, this.f.n().k);
        akpm akpmVar = this.f;
        alaa a = alad.a();
        a.d(akraVar);
        a.c = max;
        alao.d(akpmVar, a.a());
        aett s = aetu.s(this.c.getString(R.string.PARKING_LOCATION_TUTORIAL_CALLOUT));
        s.c(40);
        s.d(10);
        s.f(true != awtg.a() ? "https://mts0.google.com/vt/icon/name=assets/icons/poi/quantum/container_background-2-medium.png,assets/icons/poi/quantum/container-2-medium.png,assets/icons/poi/quantum/parking-2-medium.png&highlight=ffffff,ffffff,4285f4&scale=4" : "https://mts0.google.com/vt/icon/name=assets/icons/poi/quantum/container_background-2-medium.png,assets/icons/poi/quantum/container-2-medium.png,assets/icons/search-experiment/parking_es-2-medium.png&highlight=ffffff,ffffff,4285f4&scale=4");
        this.a.a(s.a(), akraVar);
        this.k.g().d(cjtd.a(dtyb.K));
        btrm btrmVar = this.e;
        dceq a2 = dcet.a();
        a2.b(amqo.class, new awrd(0, amqo.class, this, bvrj.UI_THREAD));
        a2.b(alhw.class, new awrd(1, alhw.class, this, bvrj.UI_THREAD));
        a2.b(ege.class, new awrd(2, ege.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a2.a());
        this.n = true;
        return true;
    }

    public final void g() {
        if (this.n) {
            this.e.a(this);
            this.n = false;
            this.g.a().f(dqkc.PARKING_LOCATION);
        }
        this.a.c();
    }
}

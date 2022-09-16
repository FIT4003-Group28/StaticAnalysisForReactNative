package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: zkk  reason: default package */
/* loaded from: classes7.dex */
public final class zkk implements bzml {
    public final dxio<bzmm> a;
    public dbsg<vnk> b = dbpy.a;
    public dbsg<zkn> c = dbpy.a;
    public Runnable d = deic.a;
    @dzsi
    public qbq e = null;
    private final Context f;
    private final zko g;
    private final bvjj h;
    private final btvo i;
    private final cpv j;

    public zkk(Context context, zko zkoVar, dxio<bzmm> dxioVar, bvjj bvjjVar, btvo btvoVar, cpv cpvVar) {
        this.f = context;
        this.g = zkoVar;
        this.a = dxioVar;
        this.h = bvjjVar;
        this.i = btvoVar;
        this.j = cpvVar;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.EXTRA_DETAIL_WALKING_NAV_PROMO;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.LOW;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return false;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        return this.b.a() && g(this.b.b());
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        if (!this.j.e(this.f)) {
            return bzmk.NONE;
        }
        if (!this.i.getNavigationParameters().P() || this.h.m(bvjk.jP, false) || this.h.m(bvjk.jR, false)) {
            return bzmk.NONE;
        }
        return bzmk.VISIBLE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        if (bzmkVar == bzmk.REPRESSED || bzmkVar == bzmk.NONE || !this.b.a() || this.b.b().g() != dqvj.WALK) {
            return false;
        }
        zko zkoVar = this.g;
        Runnable runnable = this.d;
        qbq qbqVar = this.e;
        gga a = zkoVar.a.a();
        zko.a(a, 1);
        cqhn a2 = zkoVar.b.a();
        zko.a(a2, 2);
        bvjj a3 = zkoVar.c.a();
        zko.a(a3, 3);
        gdc a4 = zkoVar.d.a();
        zko.a(a4, 4);
        zko.a(runnable, 5);
        dbsg<zkn> i = dbsg.i(new zkn(a, a2, a3, a4, runnable, qbqVar));
        this.c = i;
        i.b().g(this.b.b(), true);
        return true;
    }

    public final boolean g(vnk vnkVar) {
        return vnkVar.g() == dqvj.WALK && (this.c.a() || this.a.a().d(dqkc.EXTRA_DETAIL_WALKING_NAV_PROMO) < 3);
    }
}

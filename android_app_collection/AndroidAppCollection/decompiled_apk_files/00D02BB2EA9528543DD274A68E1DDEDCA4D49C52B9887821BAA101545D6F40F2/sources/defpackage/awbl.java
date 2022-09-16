package defpackage;

import android.net.ConnectivityManager;
/* compiled from: PG */
/* renamed from: awbl  reason: default package */
/* loaded from: classes.dex */
public final class awbl implements awnu {
    private final dxio<avik> a;
    private final bvjj b;
    private final bttf c;
    private final btpc d;
    private final btvo e;
    private final crfm f;
    private final akfa g;
    private final asik h;
    private final bzmm i;
    private final avzh j;
    private final avza k;

    public awbl(dxio<avik> dxioVar, bvjj bvjjVar, bttf bttfVar, btpc btpcVar, btvo btvoVar, crfm crfmVar, akfa akfaVar, asik asikVar, bzmm bzmmVar, avzh avzhVar, avza avzaVar) {
        this.a = dxioVar;
        this.b = bvjjVar;
        this.c = bttfVar;
        this.d = btpcVar;
        this.e = btvoVar;
        this.f = crfmVar;
        this.g = akfaVar;
        this.h = asikVar;
        this.i = bzmmVar;
        this.j = avzhVar;
        this.k = avzaVar;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.OFFLINE_ONBOARDING;
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
        dltm a;
        int a2 = dkrx.a(this.e.getOfflineMapsParameters().o);
        if (a2 == 0) {
            a2 = 1;
        }
        if (((asio) this.h).b) {
            return false;
        }
        if ((a2 != 3 && a2 != 4) || ((crgt) this.f).b != null || !this.c.b()) {
            return false;
        }
        if ((this.i.b(dqkc.OFFLINE_ONBOARDING) == bzmk.VISIBLE && !this.b.m(bvjk.ew, false)) || this.b.m(bvjk.bK, false) || this.b.A(bvjk.bC, this.g.j(), null) != null || (a = this.j.a()) == null) {
            return false;
        }
        if (bvop.i(a.i) >= this.k.c(this.k.b(this.g.j()))) {
            return false;
        }
        boolean e = this.d.e();
        boolean z = this.d.a() || this.d.b() >= 50;
        btpc btpcVar = this.d;
        return (a2 == 4 || e) && z && (btpcVar.b.b() ? false : ((ConnectivityManager) btpcVar.a.getSystemService("connectivity")).getBackgroundDataSetting());
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        return bzmk.VISIBLE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        return bzmkVar != bzmk.REPRESSED;
    }

    @Override // defpackage.awnu
    public final ggg g() {
        return this.a.a().D();
    }
}

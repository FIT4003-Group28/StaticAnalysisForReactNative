package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: stb  reason: default package */
/* loaded from: classes7.dex */
public final class stb implements qef {
    public final crzm<btvo> a;
    public final crzo<Boolean> b;
    public final crzo<Boolean> c;
    private final dxio<bvjj> d;
    private final dxio<ckcw> e;
    private final Executor f;
    private final crzm<btlu> g;
    private crzm<Boolean> h;
    private crzm<qee> i;

    public stb(btxc btxcVar, dxio dxioVar, dxio dxioVar2, dxio dxioVar3, Executor executor) {
        this.d = dxioVar2;
        this.e = dxioVar3;
        this.g = ((akfa) dxioVar.a()).C();
        this.a = btxcVar.a();
        this.f = executor;
        this.b = new crzo<>(Boolean.valueOf(((bvjj) dxioVar2.a()).m(bvjk.am, false)));
        this.c = new crzo<>(Boolean.valueOf(((bvjj) dxioVar2.a()).m(bvjk.an, false)));
    }

    private final crzm<Boolean> g() {
        if (this.h == null) {
            this.h = new crzj(new dbty(this) { // from class: sta
                private final stb a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbty
                public final Object a() {
                    this.a.a.l();
                    return false;
                }
            }, this.f, this.g, this.a);
        }
        return this.h;
    }

    @Override // defpackage.qef
    public final boolean a() {
        Boolean bool = (Boolean) new crzy(b(), ssy.a).l();
        dbsk.s(bool);
        return bool.booleanValue();
    }

    @Override // defpackage.qef
    public final crzm<qee> b() {
        if (this.i == null) {
            this.i = new crzj(new dbty(this) { // from class: ssz
                private final stb a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbty
                public final Object a() {
                    return this.a.e();
                }
            }, this.f, this.g, this.a, g(), this.b.a, this.c.a);
        }
        return this.i;
    }

    @Override // defpackage.qef
    public final void c() {
        qee l = b().l();
        dbsk.s(l);
        ((ckco) this.e.a().a(ckeq.x)).a(l.g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        Boolean l = g().l();
        dbsk.s(l);
        return l.booleanValue();
    }

    public final qee e() {
        this.a.l();
        return qee.DISABLED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(boolean z) {
        if (e().equals(qee.DOGFOOD_OPT_IN_ENABLED) || e().equals(qee.ENABLED_DUE_TO_DOGFOOD_OPT_IN)) {
            boolean z2 = !z;
            this.d.a().S(bvjk.an, z2);
            this.c.b(Boolean.valueOf(z2));
            return;
        }
        this.d.a().S(bvjk.am, z);
        this.b.b(Boolean.valueOf(z));
    }
}

package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: awfh  reason: default package */
/* loaded from: classes.dex */
public class awfh {
    public final bvjj a;
    public final auho b;
    public final crzm<btvo> c;
    public final Executor d;
    @dzsi
    public crzp<btvo> e;
    public final crzj<Boolean> f;
    private final dxio<akfa> g;
    @dzsi
    private Boolean h;
    private final crzm<Boolean> i;
    private final dbrn<dbsg<Boolean>, Boolean> j = awfd.a;

    public awfh(final bvjj bvjjVar, auho auhoVar, final btxc btxcVar, Executor executor, dxio dxioVar) {
        this.a = bvjjVar;
        this.b = auhoVar;
        this.c = btxcVar.a();
        this.d = executor;
        this.g = dxioVar;
        this.f = new crzj<>(new dbty(btxcVar, bvjjVar) { // from class: awfe
            private final bvjj a;
            private final btxc b;

            {
                this.b = btxcVar;
                this.a = bvjjVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                btxc btxcVar2 = this.b;
                return awfh.a(btxcVar2.a(), this.a);
            }
        }, executor, btxcVar.a(), bvjjVar.n(bvjk.ek));
        new crzo(awfg.ALWAYS);
        this.i = new crzo(Boolean.FALSE).a;
    }

    public static Boolean a(crzm<btvo> crzmVar, bvjj bvjjVar) {
        bvjk bvjkVar = bvjk.ek;
        btvo l = crzmVar.l();
        boolean z = true;
        if (l != null) {
            dksh offlineMapsParameters = l.getOfflineMapsParameters();
            if ((offlineMapsParameters.a & 1024) != 0) {
                int a = dkrr.a(offlineMapsParameters.y);
                if (a == 0) {
                    a = 1;
                }
                int i = a - 1;
                if (i == 1) {
                    z = Boolean.TRUE.booleanValue();
                } else if (i == 2) {
                    z = Boolean.FALSE.booleanValue();
                }
            }
        }
        return Boolean.valueOf(bvjjVar.m(bvjkVar, z));
    }

    public final synchronized boolean b() {
        if (this.h == null) {
            this.h = Boolean.valueOf(this.a.m(bvjk.ej, false));
        }
        return this.h.booleanValue();
    }

    public final boolean c() {
        return Boolean.TRUE.equals(this.h) || this.a.m(bvjk.ej, false);
    }

    public final boolean d() {
        Boolean l = e().l();
        dbsk.s(l);
        return l.booleanValue();
    }

    public final crzm<Boolean> e() {
        return new crzy(this.a.n(bvjk.eo), this.j);
    }

    public final boolean f() {
        return a(this.c, this.a).booleanValue();
    }

    public final void g(boolean z) {
        this.a.S(bvjk.ek, z);
    }

    public final boolean h(@dzsi btlu btluVar) {
        Boolean bool = (Boolean) new crzy(this.a.p(bvjk.ez, btluVar), this.j).l();
        dbsk.s(bool);
        return bool.booleanValue();
    }

    public final boolean i() {
        Boolean l = this.i.l();
        dbsk.s(l);
        return l.booleanValue();
    }

    public final boolean j() {
        if (!i()) {
            return false;
        }
        return this.a.o(bvjk.eq, this.g.a().j(), false);
    }
}

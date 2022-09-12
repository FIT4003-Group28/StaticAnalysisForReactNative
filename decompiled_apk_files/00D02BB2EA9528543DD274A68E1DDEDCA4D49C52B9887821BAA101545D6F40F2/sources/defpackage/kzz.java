package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: kzz  reason: default package */
/* loaded from: classes7.dex */
public final class kzz {
    public final btrm a;
    public final Executor b;
    public final kxb c;
    public final kdg d;
    @dzsi
    public cryz<akoq> e;
    @dzsi
    public aliw f;
    @dzsi
    public crzm<Boolean> g;
    public boolean h;
    public boolean i;
    private final btvo m;
    private final jzp n;
    public final kzy j = new kzy(this);
    public final crzp<Boolean> k = new kzv(this);
    private final akyz o = new kzw(this);
    public final kdf l = new kzx(this);

    public kzz(btrm btrmVar, Executor executor, btvo btvoVar, jzp jzpVar, kxb kxbVar, kdg kdgVar) {
        this.a = btrmVar;
        this.b = executor;
        this.m = btvoVar;
        this.n = jzpVar;
        this.c = kxbVar;
        dbsk.s(kdgVar);
        this.d = kdgVar;
    }

    public final void a() {
        kdc kdcVar = this.d.b;
        boolean d = this.n.d();
        boolean b = this.n.b();
        if (this.f == null) {
            return;
        }
        if (kdcVar == kdc.LIMITED_MAPS_INTERACTIONS) {
            this.f.a(false);
            this.f.s();
        } else if (kdcVar == kdc.MAP_INTERACTION_DISABLED) {
            this.f.a(false);
        } else if (!this.h && (!d || b)) {
            this.f.a(true);
        } else {
            this.f.a(false);
            this.f.s();
            this.f.r();
            this.f.q();
            this.f.p();
            this.f.t();
        }
        if (!this.m.getCarParameters().a) {
            this.c.h().k().d = null;
        } else if (this.h) {
            this.c.h().k().d = this.o;
        } else {
            this.c.h().k().d = null;
        }
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: aizn  reason: default package */
/* loaded from: classes.dex */
public final class aizn {
    public final azqb a;
    public final zah b;
    public aizx c;
    public aizw d;
    public aizv e;
    private final azqb f;
    private final aijf g;
    private final bame h;
    private aizm i;

    static {
        zep.a("player.ui.PlayerControlsListener");
    }

    public aizn(azqb azqbVar, azqb azqbVar2, zah zahVar, aijf aijfVar, bame bameVar) {
        this.a = azqbVar;
        this.f = azqbVar2;
        zahVar.getClass();
        this.b = zahVar;
        aijfVar.getClass();
        this.g = aijfVar;
        this.h = bameVar;
    }

    public final is a() {
        if (this.i == null) {
            this.i = new aizm(this);
        }
        return this.i;
    }

    public final void b() {
        this.b.b();
        if (this.g.k) {
            this.h.c(ahfg.c);
        }
        aizv aizvVar = this.e;
        if (aizvVar != null) {
            adqt adqtVar = (adqt) aizvVar;
            if (adqtVar.b.m()) {
                ((adro) ((adrj) adqtVar.b).g.get()).d();
                return;
            }
            adqy adqyVar = ((adrj) adqtVar.b).d;
            if (adqyVar != null) {
                adqyVar.D(atcv.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER);
                return;
            } else {
                zep.m(adqt.a, "onDismissPlayback got called when mdx session isn't active");
                return;
            }
        }
        ((aizl) this.a.get()).M();
    }

    public final void c() {
        this.b.b();
        ((aizl) this.a.get()).a();
    }

    public final void d() {
        this.b.b();
        ((aizl) this.a.get()).b();
    }

    public final void e() {
        this.b.b();
        ((aizl) this.a.get()).B();
    }

    public final void f() {
        this.b.b();
        ((aizl) this.a.get()).ab();
    }

    public final void g(long j) {
        h(j, auqn.SEEK_SOURCE_UNKNOWN);
    }

    public final void h(long j, auqn auqnVar) {
        this.b.b();
        ((aizl) this.a.get()).ac(j, auqnVar);
    }

    public final void i(long j) {
        auqn auqnVar = auqn.SEEK_SOURCE_UNKNOWN;
        this.b.b();
        ((aizl) this.a.get()).W(j, auqnVar);
    }

    public final void j() {
        this.b.b();
        aizw aizwVar = this.d;
        if (aizwVar != null) {
            aizwVar.a();
        } else {
            ((aizk) this.f.get()).a(aiqk.a);
        }
    }

    public final void k() {
        this.b.b();
        aizx aizxVar = this.c;
        if (aizxVar == null) {
            ((aizl) this.a.get()).S();
            if (!((aizk) this.f.get()).i(aiqk.b)) {
                ((aizl) this.a.get()).V(0L);
                return;
            } else {
                ((aizk) this.f.get()).a(aiqk.b);
                return;
            }
        }
        aizxVar.b();
    }
}

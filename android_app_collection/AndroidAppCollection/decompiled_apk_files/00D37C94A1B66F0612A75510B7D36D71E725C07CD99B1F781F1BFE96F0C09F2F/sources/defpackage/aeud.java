package defpackage;
/* compiled from: PG */
/* renamed from: aeud  reason: default package */
/* loaded from: classes.dex */
public final class aeud extends aesu {
    private boolean a;

    public aeud(aetv aetvVar) {
        super(aetvVar);
    }

    @Override // defpackage.aesu, defpackage.aeuo
    public final void d() {
        this.a = false;
        super.d();
    }

    @Override // defpackage.aesu, defpackage.aeuo
    public final void f() {
        if (!this.a) {
            this.a = true;
            super.f();
            return;
        }
        String valueOf = String.valueOf(afjt.a(new Throwable()));
        g(new afkn("player.exception", 0L, valueOf.length() != 0 ? "c.extraneousEndedEvent;".concat(valueOf) : new String("c.extraneousEndedEvent;")));
    }

    @Override // defpackage.aesu, defpackage.aeuo
    public final void m() {
        this.a = false;
        super.m();
    }

    @Override // defpackage.aesu, defpackage.aeuo
    public final void n() {
        this.a = false;
        super.n();
    }

    @Override // defpackage.aesu, defpackage.aeuo
    public final void o(long j) {
        this.a = false;
        super.o(j);
    }

    @Override // defpackage.aesu, defpackage.aeuo
    public final void q() {
        this.a = false;
        super.q();
    }

    @Override // defpackage.aesu, defpackage.aeuo
    public final void t(long j) {
        this.a = false;
        super.t(j);
    }

    @Override // defpackage.aesu, defpackage.aeuo
    public final void u(long j) {
        this.a = false;
        super.u(j);
    }

    @Override // defpackage.aesu, defpackage.aeuo
    public final void v() {
        this.a = false;
        super.v();
    }

    @Override // defpackage.aesu, defpackage.aeuo
    public final void y(long j) {
        this.a = true;
        super.y(j);
    }
}

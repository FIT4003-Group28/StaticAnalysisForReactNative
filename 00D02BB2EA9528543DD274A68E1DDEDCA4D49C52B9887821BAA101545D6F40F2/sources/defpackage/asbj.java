package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: asbj  reason: default package */
/* loaded from: classes2.dex */
public final class asbj implements crgy {
    public final dxio<cref> a;
    public final cjqq b;
    private final btrm e;
    private final pnq f;
    private final Executor g;
    private final bvjj h;
    private final pot i;
    private crqo j = null;
    boolean c = false;
    public boolean d = false;

    public asbj(btrm btrmVar, dxio<cref> dxioVar, pnq pnqVar, Executor executor, bvjj bvjjVar, cjqq cjqqVar, pot potVar) {
        this.e = btrmVar;
        this.a = dxioVar;
        this.f = pnqVar;
        this.g = executor;
        this.h = bvjjVar;
        this.b = cjqqVar;
        this.i = potVar;
    }

    private final void d(final pnu pnuVar) {
        final dbsg j = dbsg.j(((pnn) this.f).c.c.get(pnuVar));
        if (!j.a()) {
            return;
        }
        this.g.execute(new Runnable(this, j, pnuVar) { // from class: asbh
            private final asbj a;
            private final dbsg b;
            private final pnu c;

            {
                this.a = this;
                this.b = j;
                this.c = pnuVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                asbj asbjVar = this.a;
                asbjVar.a.a().c((String) this.b.b(), crej.NON_GUIDANCE_AUDIO_SNIPPET, new asbi(asbjVar, this.c));
            }
        });
    }

    private final boolean e() {
        if (this.f != null && !this.i.b().booleanValue()) {
            if (this.i.a(this.h.s(bvjk.jm, 0)).a() && !((pnn) this.f).c.c.isEmpty() && this.j != null) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.crgy
    public final void a(crgz crgzVar) {
        this.c = true;
        this.d = false;
        btrm btrmVar = this.e;
        dceq a = dcet.a();
        a.b(crmh.class, new asbk(0, crmh.class, this));
        a.b(crmk.class, new asbk(1, crmk.class, this));
        btrmVar.g(this, a.a());
    }

    @Override // defpackage.crgy
    public final void b(boolean z) {
        this.c = false;
        this.e.a(this);
    }

    public final synchronized void c(crmh crmhVar) {
        this.j = crmhVar.b;
        if (e() && this.c) {
            d(pnu.START);
            this.c = false;
            return;
        }
        if (!e() || !this.d) {
            return;
        }
        d(pnu.ARRIVAL);
        this.d = false;
    }
}

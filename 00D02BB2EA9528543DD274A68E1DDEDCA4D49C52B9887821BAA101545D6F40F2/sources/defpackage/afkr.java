package defpackage;

import android.content.Intent;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: afkr  reason: default package */
/* loaded from: classes2.dex */
public final class afkr extends afhs<duqp> {
    public final afke b;
    private final gga c;
    private final cjqy d;
    private final afkn e;
    private final afhb i;
    private final Executor j;

    public afkr(Intent intent, @dzsi String str, gga ggaVar, cjqy cjqyVar, afkn afknVar, afke afkeVar, afhb afhbVar, Executor executor) {
        super(intent, str, afid.EXTERNAL_INVOCATION);
        this.c = ggaVar;
        this.d = cjqyVar;
        this.e = afknVar;
        this.b = afkeVar;
        this.i = afhbVar;
        this.j = executor;
    }

    @Override // defpackage.afhs, defpackage.afhx
    public final void a() {
        bvrj.UI_THREAD.c();
        if (afhg.d(this.f)) {
            this.c.A();
            n();
            return;
        }
        affw.a(this.f, this.c, new Runnable(this) { // from class: afko
            private final afkr a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.n();
            }
        });
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afhs
    public final /* bridge */ /* synthetic */ void d(duqp duqpVar) {
        duqp duqpVar2 = duqpVar;
        Integer h = afku.h(this.f);
        if (h != null) {
            in.a(this.c).b(h.intValue());
        }
        afkn afknVar = this.e;
        afkf afkfVar = ((asio) afknVar.g).b ? afknVar.j : afknVar.i;
        dbsk.s(afkfVar);
        dbsg<Runnable> d = afkfVar.d(duqpVar2, m(), this.f, l(), this.g);
        duqi m = m();
        duqk duqkVar = duqpVar2.b;
        if (duqkVar == null) {
            duqkVar = duqk.d;
        }
        duqi b = duqi.b(duqkVar.b);
        if (b == null) {
            b = duqi.ERROR;
        }
        afks c = afkfVar.c(b, m);
        durz b2 = c == null ? null : c.b();
        bvkx bvkxVar = afknVar.f;
        bvku bvkuVar = bvkxVar.l;
        if (bvkuVar != null && ((bvjy) bvkuVar).c) {
            bvkxVar.l = bvku.d(b2, null, true);
        }
        if (d.a()) {
            afknVar.e.b(new afkj(afknVar, this, d, duqpVar2, b2), bvrj.UI_THREAD);
            return;
        }
        afknVar.f(b2);
        afoi.g(afknVar.b, afknVar.d, l());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afhs
    public final void e(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        if (cause instanceof afkd) {
            bttq bttqVar = ((afkd) cause).a;
            afkn afknVar = this.e;
            if (ppw.a(bttqVar) || bttqVar == bttq.REQUEST_TIMEOUT) {
                afknVar.b.runOnUiThread(new afkm(afknVar, new afkk(afknVar, this), new afkl(afknVar)));
                return;
            }
            afknVar.f(null);
            afoi.g(afknVar.b, afknVar.d, l());
        }
    }

    @Override // defpackage.afhs
    protected final void i(final deig<duqp> deigVar) {
        final boolean z;
        if (afku.b(l())) {
            this.b.b(l(), deigVar);
            z = true;
        } else {
            z = false;
        }
        cpcq<dept> a = this.i.a(this.f);
        a.p(this.j, new cpcl(this, z, deigVar) { // from class: afkp
            private final afkr a;
            private final boolean b;
            private final deig c;

            {
                this.a = this;
                this.b = z;
                this.c = deigVar;
            }

            @Override // defpackage.cpcl
            public final void c(Object obj) {
                afkr afkrVar = this.a;
                boolean z2 = this.b;
                deig<duqp> deigVar2 = this.c;
                dept deptVar = (dept) obj;
                if (z2) {
                    return;
                }
                if (deptVar == null || deptVar.a() == null) {
                    afkrVar.b.b(afkrVar.l(), deigVar2);
                    return;
                }
                afkrVar.b.b(deptVar.a().toString(), deigVar2);
            }
        });
        a.o(this.j, new cpci(this, z, deigVar) { // from class: afkq
            private final afkr a;
            private final boolean b;
            private final deig c;

            {
                this.a = this;
                this.b = z;
                this.c = deigVar;
            }

            @Override // defpackage.cpci
            public final void d(Exception exc) {
                afkr afkrVar = this.a;
                boolean z2 = this.b;
                deig<duqp> deigVar2 = this.c;
                if (z2) {
                    return;
                }
                afkrVar.b.b(afkrVar.l(), deigVar2);
            }
        });
    }

    public final String l() {
        return afhg.a(this.f);
    }

    public final duqi m() {
        return afku.f(this.f);
    }

    public final void n() {
        this.d.s(l(), null, afkh.a(this.f), dukj.EXTERNAL_INVOCATION_STARTED, this.g, true);
        this.c.D(new gel());
        super.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o() {
        super.a();
    }
}

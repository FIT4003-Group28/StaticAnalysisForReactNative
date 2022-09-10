package defpackage;

import android.app.Activity;
import android.content.Intent;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: afas  reason: default package */
/* loaded from: classes2.dex */
public abstract class afas extends itb implements afeg {
    public static final /* synthetic */ int j = 0;
    private static final eatp k = eaul.g;
    public final Activity a;
    public final btvo b;
    public final dxio<akfa> c;
    public final dxio<ckcw> d;
    public final cqat e;
    public final dxio<afeh> f;
    public final btwr g;
    protected final dxio<afee> h;
    protected final bvjj i;
    @dzsi
    private crzp<btlu> o;
    private final Executor p;
    private final dehq q;
    private final crzp<btvo> r = new afam(this);

    /* JADX INFO: Access modifiers changed from: protected */
    public afas(Activity activity, btvo btvoVar, dxio<akfa> dxioVar, dxio<ckcw> dxioVar2, bvjj bvjjVar, Executor executor, dehq dehqVar, cqat cqatVar, dxio<afeh> dxioVar3, btwr btwrVar, dxio<afee> dxioVar4) {
        this.a = activity;
        this.b = btvoVar;
        this.c = dxioVar;
        this.d = dxioVar2;
        this.i = bvjjVar;
        this.p = executor;
        this.q = dehqVar;
        this.e = cqatVar;
        this.f = dxioVar3;
        this.g = btwrVar;
        this.h = dxioVar4;
    }

    @Override // defpackage.itb
    public void Ns() {
        super.Ns();
        if (this.c.a().d()) {
            this.h.a().c();
        }
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        if (this.o == null) {
            this.o = new crzp(this) { // from class: afah
                private final afas a;

                {
                    this.a = this;
                }

                @Override // defpackage.crzp
                public final void On(crzm crzmVar) {
                    afas afasVar = this.a;
                    if (btlu.q((btlu) crzmVar.l()).m()) {
                        if (afasVar.i.w(bvjk.r, 1L) >= 0) {
                            return;
                        }
                        afasVar.i.Z(bvjk.r, afasVar.e.b());
                        afasVar.h.a().a();
                        return;
                    }
                    afasVar.i.S(bvjk.m, false);
                    afasVar.h.a().d();
                }
            };
        }
        crzm<btlu> C = this.c.a().C();
        crzp<btlu> crzpVar = this.o;
        dbsk.s(crzpVar);
        C.d(crzpVar, this.p);
    }

    @Override // defpackage.itb
    public final void Nu() {
        this.h.a().d();
        super.Nu();
    }

    @Override // defpackage.itb
    public void PX() {
        super.PX();
        if (this.c.a().d()) {
            ((ckgv) this.d.a().a(ckfn.q)).a();
        }
    }

    @Override // defpackage.itb
    public final void PY() {
        super.PY();
        if (this.c.a().d()) {
            ((ckgv) this.d.a().a(ckfn.q)).b();
            ((ckgv) this.d.a().a(ckfn.q)).c();
        }
    }

    @Override // defpackage.itb
    public final void Po() {
        crzm<btlu> C = this.c.a().C();
        crzp<btlu> crzpVar = this.o;
        dbsk.s(crzpVar);
        C.c(crzpVar);
        super.Po();
    }

    @Override // defpackage.afef
    public final void e(boolean z) {
        boolean d = this.c.a().d();
        if (z == d) {
            return;
        }
        if (!d) {
            this.i.W(bvjk.t, this.i.s(bvjk.t, 0) + 1);
            this.i.S(bvjk.u, false);
        } else {
            this.i.S(bvjk.u, true);
        }
        f(z, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(boolean z, @dzsi Intent intent) {
        dbsk.b(!z || intent == null, "The intent for reprocessing should only be non-null if we are exiting incognito mode.");
        if (k()) {
            return;
        }
        this.i.ac(bvjk.v, k.f(eaol.a()));
        if (z && !this.i.m(bvjk.o, false)) {
            this.i.S(bvjk.o, true);
        }
        this.i.aq();
        this.h.a().f(z);
        if (z) {
            if (this.i.z(bvjk.q, "").equals("")) {
                this.c.a().G(deho.c(new Runnable(this) { // from class: afai
                    private final afas a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        afas afasVar = this.a;
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        afasVar.f.a().a(new afao(afasVar, countDownLatch));
                        try {
                            countDownLatch.await();
                        } catch (InterruptedException unused) {
                        }
                    }
                }));
            } else if (!this.g.d()) {
                this.c.a().G(deho.c(new Runnable(this) { // from class: afaj
                    private final afas a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        afas afasVar = this.a;
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        afasVar.j(countDownLatch);
                        try {
                            countDownLatch.await();
                        } catch (InterruptedException unused) {
                        }
                    }
                }));
            }
        }
        dehn<Void> H = this.c.a().H();
        dehn<?> a = this.q.a(new Runnable(this) { // from class: afak
            private final afas a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Thread.sleep(this.a.b.getIncognitoParameters().c);
                } catch (InterruptedException unused) {
                }
            }
        });
        dcdc<deig<Void>> n = n();
        try {
            if (!bvow.e(this.a.getApplicationContext(), "incognito_restart_process")) {
                ((ckco) this.d.a().a(ckfn.n)).a(afed.a(11));
                p();
                m(z);
                return;
            }
        } catch (bvov unused) {
        }
        dccx F = dcdc.F();
        F.h(H, a);
        F.i(n);
        deha.q(deha.l(F.f()).c(afal.a, this.p), new afar(this, z, intent), this.q);
    }

    @Override // defpackage.afef
    public final crzp<btvo> i() {
        return this.r;
    }

    public final void j(CountDownLatch countDownLatch) {
        this.g.i(Locale.getDefault(), new afan(countDownLatch));
    }

    protected abstract boolean k();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void l(boolean z, Runnable runnable, Runnable runnable2);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void m(boolean z);

    protected abstract dcdc<deig<Void>> n();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Intent o(@dzsi Intent intent, boolean z);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void p();
}

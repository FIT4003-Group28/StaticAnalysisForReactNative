package defpackage;

import android.view.Window;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: arnd  reason: default package */
/* loaded from: classes2.dex */
public final class arnd {
    public final btrm a;
    public final cjqq b;
    public final ckco c;
    public final cpwx d;
    public final cjyh e;
    @dzsi
    public gga f;
    @dzsi
    public cjmt g;
    public boolean h;
    public boolean i;
    @dzsi
    public int j;
    public int k = 0;
    private final Executor l;
    private final dbsg<atbs> m;
    @dzsi
    private int n;

    public arnd(btrm btrmVar, Executor executor, cjqq cjqqVar, ckcw ckcwVar, dbsg<atbs> dbsgVar, cpwx cpwxVar, cjyh cjyhVar) {
        this.a = btrmVar;
        this.l = executor;
        this.b = cjqqVar;
        this.c = (ckco) ckcwVar.a(ckhi.U);
        this.m = dbsgVar;
        this.d = cpwxVar;
        this.e = cjyhVar;
    }

    private final void e() {
        this.l.execute(new Runnable(this) { // from class: arnb
            private final arnd a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                arnd arndVar = this.a;
                gga ggaVar = arndVar.f;
                if (ggaVar != null) {
                    Window window = ggaVar.getWindow();
                    int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
                    int i = arndVar.j;
                    window.getDecorView().setSystemUiVisibility((i == 0 || i != 3) ? systemUiVisibility | 16 : systemUiVisibility & (-17));
                }
                cjmt cjmtVar = arndVar.g;
                if (cjmtVar != null) {
                    gga ggaVar2 = arndVar.f;
                    if (ggaVar2 != null) {
                        cjmtVar.q(ggaVar2.getResources());
                    }
                    arndVar.g.p();
                }
            }
        });
    }

    private final boolean f() {
        return this.m.b().b() && !this.m.b().i() && !this.m.b().c() && this.m.b().e();
    }

    public final void a() {
        dcqy<String> dcqyVar = dcrd.a;
        this.a.b(new crhd(6));
        b(0);
        this.k = 4;
        e();
    }

    public final void b(int i) {
        this.a.b(new crhd(4, Integer.valueOf(i)));
        dcqy<String> dcqyVar = dcrd.a;
    }

    public final void c(int i, @dzsi dqvj dqvjVar) {
        d(i, dqvjVar, 0);
    }

    public final void d(int i, @dzsi dqvj dqvjVar, @dzsi int i2) {
        if (this.e.b() && this.d.a() == 3 && dqvjVar == dqvj.DRIVE) {
            if ((i == 5 || i == 6) && !f()) {
                return;
            }
            if (i == 4 && f()) {
                return;
            }
            if (i == 2 && this.h) {
                return;
            }
            if (this.n == i && (i2 == 0 || this.j == i2)) {
                return;
            }
            e();
            if (i == 2) {
                this.n = 0;
                this.j = 0;
            } else {
                this.n = i;
                this.j = i2;
            }
            deha.q(this.e.d(), new arnc(this, i, i2), dege.a);
        }
    }
}

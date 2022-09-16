package defpackage;

import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aevx  reason: default package */
/* loaded from: classes.dex */
public final class aevx {
    Runnable a;
    public final int b;
    private final aevy c;
    private final Handler d;
    private final pha e;
    private boolean f;

    public aevx(aevy aevyVar, Handler handler, pha phaVar) {
        this.c = aevyVar;
        this.d = handler;
        this.e = phaVar;
        this.b = aevyVar.s.an();
        afki afkiVar = afki.ABR;
    }

    private final void e() {
        Runnable runnable = this.a;
        if (runnable != null) {
            this.d.removeCallbacks(runnable);
            this.a = null;
        }
    }

    public final void a() {
        if (this.f) {
            d(this.b);
        }
    }

    public final void b(int i) {
        pha phaVar = this.e;
        if (phaVar != null) {
            phaVar.g(i);
        }
    }

    public final void d(int i) {
        if (this.b != i) {
            return;
        }
        afki afkiVar = afki.ABR;
        this.f = true;
        e();
        afms.a(this.e);
        pha phaVar = this.e;
        phaVar.c.execute(new pgp(phaVar, 1));
    }

    public final void c(int i, final int i2) {
        if (i == 6) {
            if (this.b != 2) {
                afki afkiVar = afki.ABR;
                e();
                b(i2);
                return;
            }
            i = 6;
        }
        if (this.b != i) {
            return;
        }
        this.f = false;
        if (this.a != null) {
            return;
        }
        this.a = new Runnable() { // from class: aevw
            @Override // java.lang.Runnable
            public final void run() {
                aevx aevxVar = aevx.this;
                int i3 = i2;
                afki afkiVar2 = afki.ABR;
                aevxVar.b(i3);
            }
        };
        if (this.c.s.i() <= 0) {
            this.a.run();
        } else {
            this.d.postDelayed(this.a, this.c.s.i());
        }
    }
}

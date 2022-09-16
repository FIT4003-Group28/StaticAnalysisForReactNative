package defpackage;

import android.os.SystemClock;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.ArrayDeque;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: aetg  reason: default package */
/* loaded from: classes.dex */
public final class aetg implements aetv {
    private final aetv d;
    private aetv e;
    private boolean f;
    private boolean g;
    private final Queue b = new ArrayDeque();
    public final long a = SystemClock.elapsedRealtime();

    public aetg(aetv aetvVar) {
        this.d = aetvVar;
    }

    public final void A(aetv aetvVar) {
        afms.d(this.e == null);
        this.e = aetvVar;
        while (true) {
            Runnable runnable = (Runnable) this.b.poll();
            if (runnable == null) {
                return;
            }
            runnable.run();
        }
    }

    @Override // defpackage.aetv
    public final aflm a() {
        aetv aetvVar = this.e;
        return aetvVar != null ? aetvVar.a() : ((aeot) this.d).a;
    }

    @Override // defpackage.aetv
    public final void b(int i) {
        aetv aetvVar = this.e;
        if (aetvVar == null) {
            this.b.add(new aesv(this, i, 2));
        } else {
            aetvVar.b(i);
        }
    }

    @Override // defpackage.aetv
    public final void c(int i) {
        aetv aetvVar = this.e;
        if (aetvVar == null) {
            this.b.add(new aesv(this, i, 1));
        } else {
            aetvVar.c(i);
        }
    }

    @Override // defpackage.aeuo
    public final void d() {
        aetv aetvVar = this.e;
        if (aetvVar == null) {
            this.b.add(new aesz(this));
        } else if (this.g && !this.f) {
        } else {
            this.g = true;
            aetvVar.d();
        }
    }

    @Override // defpackage.aeuo
    public final void f() {
        aetv aetvVar = this.e;
        if (aetvVar == null) {
            this.b.add(new aesz(this, 2));
        } else {
            aetvVar.f();
        }
    }

    @Override // defpackage.aeuo
    public final void g(final afkn afknVar) {
        aetv aetvVar = this.e;
        if (aetvVar == null) {
            this.b.add(new Runnable() { // from class: aeta
                @Override // java.lang.Runnable
                public final void run() {
                    aetg.this.g(afknVar);
                }
            });
        } else {
            aetvVar.g(afknVar);
        }
    }

    @Override // defpackage.aeuo
    public final void h(final aesr aesrVar) {
        aetv aetvVar = this.e;
        if (aetvVar == null) {
            this.b.add(new Runnable() { // from class: aesy
                @Override // java.lang.Runnable
                public final void run() {
                    aetg.this.h(aesrVar);
                }
            });
        } else {
            aetvVar.h(aesrVar);
        }
    }

    @Override // defpackage.aeuo
    public final void i(final String str, final afip afipVar) {
        if (this.e != null || (!str.equals("cir") && !str.equals("ecir"))) {
            aetv aetvVar = this.e;
            if (aetvVar == null) {
                this.b.add(new Runnable() { // from class: aetd
                    @Override // java.lang.Runnable
                    public final void run() {
                        aetg.this.i(str, afipVar);
                    }
                });
                return;
            } else {
                aetvVar.i(str, afipVar);
                return;
            }
        }
        this.d.i(str, afipVar);
    }

    @Override // defpackage.aeuo
    public final void j(afte afteVar) {
        throw new IllegalStateException("Early Media Prep tried to emit onLoaded() event");
    }

    @Override // defpackage.aeuo
    public final void k(final long j, final long j2) {
        aetv aetvVar = this.e;
        if (aetvVar == null) {
            this.b.add(new Runnable() { // from class: aesx
                @Override // java.lang.Runnable
                public final void run() {
                    aetg.this.k(j, j2);
                }
            });
        } else {
            aetvVar.k(j, j2);
        }
    }

    @Override // defpackage.aeuo
    public final void l(final String str) {
        aetv aetvVar = this.e;
        if (aetvVar == null) {
            this.b.add(new Runnable() { // from class: aetc
                @Override // java.lang.Runnable
                public final void run() {
                    aetg.this.l(str);
                }
            });
        } else {
            aetvVar.l(str);
        }
    }

    @Override // defpackage.aeuo
    public final void m() {
        aetv aetvVar = this.e;
        if (aetvVar == null) {
            this.b.add(new aesz(this, 3));
        } else if (!this.f) {
        } else {
            aetvVar.m();
        }
    }

    @Override // defpackage.aeuo
    public final void n() {
        aetv aetvVar = this.e;
        if (aetvVar == null) {
            this.b.add(new aesz(this, 4));
        } else if (!this.f) {
            d();
        } else {
            aetvVar.n();
        }
    }

    @Override // defpackage.aeuo
    public final void o(long j) {
        aetv aetvVar = this.e;
        if (aetvVar == null) {
            this.b.add(new aesw(this, j));
        } else {
            aetvVar.o(j);
        }
    }

    @Override // defpackage.aeuo
    public final void p(final float f) {
        aetv aetvVar = this.e;
        if (aetvVar == null) {
            this.b.add(new Runnable() { // from class: aetf
                @Override // java.lang.Runnable
                public final void run() {
                    aetg.this.p(f);
                }
            });
        } else {
            aetvVar.p(f);
        }
    }

    @Override // defpackage.aeuo
    public final void q() {
        aetv aetvVar = this.e;
        if (aetvVar == null) {
            this.b.add(new aesz(this, 1));
            this.b.add(new aesz(this, 5));
            return;
        }
        this.f = true;
        aetvVar.q();
    }

    @Override // defpackage.aeuo
    public final void r() {
        aetv aetvVar = this.e;
        if (aetvVar == null) {
            this.b.add(new aesz(this, 6));
        } else {
            aetvVar.r();
        }
    }

    @Override // defpackage.aeuo
    public final void s(long j) {
        aetv aetvVar = this.e;
        if (aetvVar == null) {
            this.b.add(new aesw(this, j, 2));
        } else {
            aetvVar.s(j);
        }
    }

    @Override // defpackage.aeuo
    public final void t(long j) {
        aetv aetvVar = this.e;
        if (aetvVar == null) {
            this.b.add(new aesw(this, j, 3));
        } else {
            aetvVar.t(j);
        }
    }

    @Override // defpackage.aeuo
    public final void u(long j) {
        aetv aetvVar = this.e;
        if (aetvVar == null) {
            this.b.add(new aesw(this, j, 4));
        } else {
            aetvVar.u(j);
        }
    }

    @Override // defpackage.aeuo
    public final void v() {
        aetv aetvVar = this.e;
        if (aetvVar == null) {
            this.b.add(new aesz(this, 7));
        } else {
            aetvVar.v();
        }
    }

    @Override // defpackage.aeuo
    public final void w(final String str, final String str2) {
        aetv aetvVar = this.e;
        if (aetvVar == null) {
            this.b.add(new Runnable() { // from class: aete
                @Override // java.lang.Runnable
                public final void run() {
                    aetg.this.w(str, str2);
                }
            });
        } else {
            aetvVar.w(str, str2);
        }
    }

    @Override // defpackage.aeuo
    public final void x(int i) {
        aetv aetvVar = this.e;
        if (aetvVar == null) {
            this.b.add(new aesv(this, i));
        } else {
            aetvVar.x(i);
        }
    }

    @Override // defpackage.aeuo
    public final void y(long j) {
        aetv aetvVar = this.e;
        if (aetvVar == null) {
            this.b.add(new aesw(this, j, 5));
        } else {
            aetvVar.y(j);
        }
    }

    @Override // defpackage.aeuo
    public final void z(final awan awanVar) {
        aetv aetvVar = this.e;
        if (aetvVar == null) {
            this.b.add(new Runnable() { // from class: aetb
                @Override // java.lang.Runnable
                public final void run() {
                    aetg.this.z(awanVar);
                }
            });
        } else {
            aetvVar.z(awanVar);
        }
    }

    @Override // defpackage.aeuo
    public final void e(FormatStreamModel formatStreamModel, long j, long j2, aeui[] aeuiVarArr) {
        aetv aetvVar = this.e;
        if (aetvVar == null) {
            this.b.add(new aesw(this, j2, 1));
            throw new aeug(1000);
        } else {
            aetvVar.e(formatStreamModel, j, j2, aeuiVarArr);
        }
    }
}

package defpackage;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: alak  reason: default package */
/* loaded from: classes.dex */
public final class alak implements alal {
    public final Set a = new CopyOnWriteArraySet();
    private final Executor b;

    public alak(Executor executor) {
        this.b = executor;
    }

    @Override // defpackage.alal
    public final void a(final String str, final boolean z, final boolean z2) {
        this.b.execute(new Runnable() { // from class: alaa
            @Override // java.lang.Runnable
            public final void run() {
                alak alakVar = alak.this;
                String str2 = str;
                boolean z3 = z;
                boolean z4 = z2;
                for (alal alalVar : alakVar.a) {
                    alalVar.a(str2, z3, z4);
                }
            }
        });
    }

    @Override // defpackage.alal
    public final void b(final String str, final long j, final long j2) {
        this.b.execute(new Runnable() { // from class: alad
            @Override // java.lang.Runnable
            public final void run() {
                alak alakVar = alak.this;
                String str2 = str;
                long j3 = j;
                long j4 = j2;
                for (alal alalVar : alakVar.a) {
                    alalVar.b(str2, j3, j4);
                }
            }
        });
    }

    @Override // defpackage.alal
    public final void c(final String str, final alda aldaVar) {
        this.b.execute(new Runnable() { // from class: alaj
            @Override // java.lang.Runnable
            public final void run() {
                alak alakVar = alak.this;
                String str2 = str;
                alda aldaVar2 = aldaVar;
                for (alal alalVar : alakVar.a) {
                    alalVar.c(str2, aldaVar2);
                }
            }
        });
    }

    @Override // defpackage.alal
    public final void d(final String str, final augw augwVar) {
        this.b.execute(new Runnable() { // from class: akzw
            @Override // java.lang.Runnable
            public final void run() {
                alak alakVar = alak.this;
                String str2 = str;
                augw augwVar2 = augwVar;
                for (alal alalVar : alakVar.a) {
                    alalVar.d(str2, augwVar2);
                }
            }
        });
    }

    @Override // defpackage.alal
    public final void e(final String str, final double d) {
        this.b.execute(new Runnable() { // from class: alac
            @Override // java.lang.Runnable
            public final void run() {
                alak alakVar = alak.this;
                String str2 = str;
                double d2 = d;
                for (alal alalVar : alakVar.a) {
                    alalVar.e(str2, d2);
                }
            }
        });
    }

    @Override // defpackage.alal
    public final void f(final String str, final long j, final long j2, final double d) {
        this.b.execute(new Runnable() { // from class: alae
            @Override // java.lang.Runnable
            public final void run() {
                alak alakVar = alak.this;
                String str2 = str;
                long j3 = j;
                long j4 = j2;
                double d2 = d;
                for (alal alalVar : alakVar.a) {
                    alalVar.f(str2, j3, j4, d2);
                }
            }
        });
    }

    @Override // defpackage.alal
    public final void g(final String str, final alct alctVar) {
        this.b.execute(new Runnable() { // from class: alag
            @Override // java.lang.Runnable
            public final void run() {
                alak alakVar = alak.this;
                String str2 = str;
                alct alctVar2 = alctVar;
                for (alal alalVar : alakVar.a) {
                    alalVar.g(str2, alctVar2);
                }
            }
        });
    }

    @Override // defpackage.alal
    public final void h(final alcw alcwVar) {
        this.b.execute(new Runnable() { // from class: akzv
            @Override // java.lang.Runnable
            public final void run() {
                alak alakVar = alak.this;
                alcw alcwVar2 = alcwVar;
                for (alal alalVar : alakVar.a) {
                    alalVar.h(alcwVar2);
                }
            }
        });
    }

    @Override // defpackage.alal
    public final void i(final String str, final alcw alcwVar) {
        this.b.execute(new Runnable() { // from class: alai
            @Override // java.lang.Runnable
            public final void run() {
                alak alakVar = alak.this;
                String str2 = str;
                alcw alcwVar2 = alcwVar;
                for (alal alalVar : alakVar.a) {
                    alalVar.i(str2, alcwVar2);
                }
            }
        });
    }

    @Override // defpackage.alal
    public final void j(final String str) {
        this.b.execute(new Runnable() { // from class: alab
            @Override // java.lang.Runnable
            public final void run() {
                alak alakVar = alak.this;
                String str2 = str;
                for (alal alalVar : alakVar.a) {
                    alalVar.j(str2);
                }
            }
        });
    }

    @Override // defpackage.alal
    public final void k(final String str, final boolean z) {
        this.b.execute(new Runnable() { // from class: akzz
            @Override // java.lang.Runnable
            public final void run() {
                alak alakVar = alak.this;
                String str2 = str;
                boolean z2 = z;
                for (alal alalVar : alakVar.a) {
                    alalVar.k(str2, z2);
                }
            }
        });
    }

    @Override // defpackage.alal
    public final void l(final String str, final avvd avvdVar) {
        this.b.execute(new Runnable() { // from class: akzx
            @Override // java.lang.Runnable
            public final void run() {
                alak alakVar = alak.this;
                String str2 = str;
                avvd avvdVar2 = avvdVar;
                for (alal alalVar : alakVar.a) {
                    alalVar.l(str2, avvdVar2);
                }
            }
        });
    }

    @Override // defpackage.alal
    public final void m(final String str, final String str2) {
        this.b.execute(new Runnable() { // from class: akzy
            @Override // java.lang.Runnable
            public final void run() {
                alak alakVar = alak.this;
                String str3 = str;
                String str4 = str2;
                for (alal alalVar : alakVar.a) {
                    alalVar.m(str3, str4);
                }
            }
        });
    }

    @Override // defpackage.alal
    public final void n(final String str, final alcv alcvVar) {
        this.b.execute(new Runnable() { // from class: alah
            @Override // java.lang.Runnable
            public final void run() {
                alak alakVar = alak.this;
                String str2 = str;
                alcv alcvVar2 = alcvVar;
                for (alal alalVar : alakVar.a) {
                    alalVar.n(str2, alcvVar2);
                }
            }
        });
    }

    @Override // defpackage.alal
    public final void o(final String str, final int i) {
        this.b.execute(new Runnable() { // from class: alaf
            @Override // java.lang.Runnable
            public final void run() {
                alak alakVar = alak.this;
                String str2 = str;
                int i2 = i;
                for (alal alalVar : alakVar.a) {
                    alalVar.o(str2, i2);
                }
            }
        });
    }

    public final void p(alal alalVar) {
        this.a.add(alalVar);
    }

    public final void q(alal alalVar) {
        this.a.remove(alalVar);
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: aevl  reason: default package */
/* loaded from: classes.dex */
public final class aevl extends aevn {
    private final aflm b;
    private final long c;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;
    private final int j;

    public aevl(aflm aflmVar, int i, long j) {
        this.b = aflmVar;
        this.j = i;
        this.c = j;
    }

    @Override // defpackage.aevn
    public final void a() {
        this.b.h();
    }

    @Override // defpackage.aevn
    public final void b(long j) {
        if (j >= this.c / 2 && !this.h) {
            this.h = true;
            if (this.j == 2) {
                this.b.au();
            } else {
                this.b.d();
            }
        }
        if (j < this.c || this.i) {
            return;
        }
        this.i = true;
        if (this.j == 2) {
            this.b.at();
        } else {
            this.b.c();
        }
    }

    @Override // defpackage.aevn
    public final void c() {
        if (!this.d) {
            this.d = true;
            if (this.j == 2) {
                this.b.ay();
            } else {
                this.b.i();
            }
        }
    }

    @Override // defpackage.aevn
    public final void d() {
        if (!this.e) {
            this.e = true;
            if (this.j == 2) {
                this.b.ar();
            } else {
                this.b.a();
            }
        }
    }

    @Override // defpackage.aevn
    public final void e() {
        if (!this.f) {
            this.f = true;
            if (this.j == 2) {
                this.b.az();
            } else {
                this.b.j();
            }
        }
    }

    @Override // defpackage.aevn
    public final void f() {
        if (!this.g) {
            this.g = true;
            if (this.j == 2) {
                this.b.aA();
            } else {
                this.b.k();
            }
        }
    }
}

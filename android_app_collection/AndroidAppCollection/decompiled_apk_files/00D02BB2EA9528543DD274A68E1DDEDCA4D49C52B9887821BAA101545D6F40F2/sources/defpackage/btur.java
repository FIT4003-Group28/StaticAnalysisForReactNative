package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: btur  reason: default package */
/* loaded from: classes.dex */
public final class btur implements btup {
    public final cqat a;
    public final ckcw b;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public boolean c = false;
    private final btum i = new btum();

    public btur(cqat cqatVar, ckcw ckcwVar) {
        this.a = cqatVar;
        this.b = ckcwVar;
    }

    @Override // defpackage.bttp
    public final synchronized long a() {
        return this.i.c;
    }

    @Override // defpackage.bttp
    public final synchronized long b() {
        return this.i.d;
    }

    @Override // defpackage.bttp
    public final synchronized long c() {
        return this.i.e;
    }

    @Override // defpackage.btup
    public final void d(btum btumVar, long j, long j2, long j3, @dzsi Class<? extends dssj> cls) {
        synchronized (this) {
            btum btumVar2 = this.i;
            btumVar2.a += btumVar.a;
            btumVar2.b += btumVar.b;
            btumVar2.c += btumVar.c;
            btumVar2.d += btumVar.d;
            btumVar2.e += btumVar.e;
        }
        long j4 = j2 - j;
        ((ckcp) this.b.a(ckja.v)).a(TimeUnit.NANOSECONDS.toMillis(j4));
        ((ckcp) this.b.a(ckja.w)).a(btumVar.b);
        ((ckcp) this.b.a(ckja.x)).a(btumVar.a);
        if (j3 > j) {
            ((ckcp) this.b.a(ckja.A)).a((btumVar.a * TimeUnit.SECONDS.toNanos(1L)) / (j3 - j));
        }
        if (this.c) {
            this.e += btumVar.b;
            this.f += btumVar.a;
            this.h++;
        }
        if (cls != null) {
            ckha ckhaVar = ckjl.b(cls).b;
            if (ckhaVar != null) {
                ((ckcp) this.b.a(ckhaVar)).a(TimeUnit.NANOSECONDS.toMillis(j4));
            }
            ckha ckhaVar2 = ckjl.b(cls).e;
            if (ckhaVar2 != null) {
                ((ckcp) this.b.a(ckhaVar2)).a(btumVar.b);
            }
            ckha ckhaVar3 = ckjl.b(cls).f;
            if (ckhaVar3 == null) {
                return;
            }
            ((ckcp) this.b.a(ckhaVar3)).a(btumVar.a);
        }
    }

    @Override // defpackage.btup
    public final void e(int i, boolean z) {
        ((ckcn) this.b.a(ckja.q)).a();
        long j = i;
        ((ckcn) this.b.a(ckja.p)).b(j);
        ((ckcp) this.b.a(ckja.y)).a(j);
        if (z) {
            ((ckcn) this.b.a(ckja.s)).a();
            ((ckcn) this.b.a(ckja.r)).b(j);
        }
        if (this.c) {
            this.g++;
        }
    }

    @Override // defpackage.btup
    public final void f(long j) {
        ((ckcp) this.b.a(ckja.z)).a(j);
    }

    @Override // defpackage.btup
    public final void g(int i) {
        ((ckcn) this.b.a(ckja.u)).a();
        long j = i;
        ((ckcn) this.b.a(ckja.t)).b(j);
        ((ckcn) this.b.a(ckja.q)).a();
        ((ckcn) this.b.a(ckja.p)).b(j);
    }

    @Override // defpackage.btup
    public final void h() {
    }

    @Override // defpackage.cvhd
    public final synchronized long i() {
        return this.i.a;
    }

    @Override // defpackage.cvhd
    public final synchronized long j() {
        return this.i.b;
    }
}

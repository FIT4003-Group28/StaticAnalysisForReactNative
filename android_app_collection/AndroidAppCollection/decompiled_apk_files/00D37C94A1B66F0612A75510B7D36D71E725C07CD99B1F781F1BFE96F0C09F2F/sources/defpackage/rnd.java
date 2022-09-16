package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rnd  reason: default package */
/* loaded from: classes4.dex */
public final class rnd implements Runnable {
    final /* synthetic */ rjq a;
    final /* synthetic */ int b;
    final /* synthetic */ long c;
    final /* synthetic */ boolean d;
    final /* synthetic */ rng e;
    private final /* synthetic */ int f;

    public rnd(rng rngVar, rjq rjqVar, int i, long j, boolean z) {
        this.e = rngVar;
        this.a = rjqVar;
        this.b = i;
        this.c = j;
        this.d = z;
    }

    public rnd(rng rngVar, rjq rjqVar, int i, long j, boolean z, int i2) {
        this.f = i2;
        this.e = rngVar;
        this.a = rjqVar;
        this.b = i;
        this.c = j;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f == 0) {
            this.e.H(this.a);
            this.e.F(this.a, this.b, this.c, false, this.d);
            return;
        }
        this.e.H(this.a);
        this.e.F(this.a, this.b, this.c, false, this.d);
    }
}

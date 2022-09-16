package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rnc  reason: default package */
/* loaded from: classes4.dex */
public final class rnc implements Runnable {
    final /* synthetic */ rjq a;
    final /* synthetic */ long b;
    final /* synthetic */ int c;
    final /* synthetic */ long d;
    final /* synthetic */ boolean e;
    final /* synthetic */ rng f;

    public rnc(rng rngVar, rjq rjqVar, long j, int i, long j2, boolean z) {
        this.f = rngVar;
        this.a = rjqVar;
        this.b = j;
        this.c = i;
        this.d = j2;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.H(this.a);
        this.f.x(this.b, false);
        this.f.F(this.a, this.c, this.d, true, this.e);
    }
}

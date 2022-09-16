package defpackage;
/* compiled from: PG */
/* renamed from: rju  reason: default package */
/* loaded from: classes4.dex */
final class rju implements Runnable {
    final /* synthetic */ rml a;
    final /* synthetic */ rjv b;

    public rju(rjv rjvVar, rml rmlVar) {
        this.b = rjvVar;
        this.a = rmlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rjm rjmVar = ((rlx) this.a).f;
        if (rjm.a()) {
            this.a.aH().g(this);
            return;
        }
        boolean d = this.b.d();
        this.b.a = 0L;
        if (!d) {
            return;
        }
        this.b.b();
    }
}

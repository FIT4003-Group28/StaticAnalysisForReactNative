package defpackage;
/* compiled from: PG */
/* renamed from: rmr  reason: default package */
/* loaded from: classes4.dex */
public final class rmr implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ rng b;

    public rmr(rng rngVar, boolean z) {
        this.b = rngVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean w = this.b.w.w();
        boolean v = this.b.w.v();
        this.b.w.u(this.a);
        if (v == this.a) {
            this.b.w.aG().k.b("Default data collection state already set to", Boolean.valueOf(this.a));
        }
        if (this.b.w.w() == w || this.b.w.w() != this.b.w.v()) {
            this.b.w.aG().h.c("Default data collection is different than actual status", Boolean.valueOf(this.a), Boolean.valueOf(w));
        }
        this.b.U();
    }
}

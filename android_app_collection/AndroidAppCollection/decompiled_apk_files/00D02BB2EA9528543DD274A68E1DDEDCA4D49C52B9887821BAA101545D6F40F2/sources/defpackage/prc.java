package defpackage;
/* compiled from: PG */
/* renamed from: prc  reason: default package */
/* loaded from: classes7.dex */
public class prc implements gj {
    public final gn a;
    private final Runnable b;

    public prc(gga ggaVar, Runnable runnable) {
        this.a = ggaVar.g();
        this.b = runnable;
    }

    @Override // defpackage.gj
    public final void a() {
        for (fd fdVar : this.a.q()) {
            if (fdVar instanceof bstq) {
                return;
            }
        }
        this.b.run();
        this.a.m(this);
    }
}

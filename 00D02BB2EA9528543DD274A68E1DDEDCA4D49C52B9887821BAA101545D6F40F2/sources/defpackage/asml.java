package defpackage;
/* compiled from: PG */
/* renamed from: asml  reason: default package */
/* loaded from: classes2.dex */
public final class asml implements egq {
    @dzsi
    public Runnable a;
    public boolean b;

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        bvrj.UI_THREAD.c();
        this.b = false;
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
            this.a = null;
        }
    }

    public final void b() {
        bvrj.UI_THREAD.c();
        this.b = true;
    }

    public final void c(Runnable runnable) {
        bvrj.UI_THREAD.c();
        if (this.b) {
            this.a = runnable;
        } else {
            runnable.run();
        }
    }
}

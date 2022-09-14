package defpackage;
/* compiled from: PG */
/* renamed from: ggf  reason: default package */
/* loaded from: classes.dex */
public final class ggf {
    public ggd b = a;
    private static final dcqe c = dcqe.c("ggf");
    static final ggd a = new gge();

    public final ggd a() {
        bvrj.UI_THREAD.c();
        return this.b;
    }

    public final boolean b(fd fdVar) {
        bvrj.UI_THREAD.c();
        return this.b.c(fdVar);
    }

    public final void c(ggd ggdVar) {
        bvrj.UI_THREAD.c();
        ggd ggdVar2 = this.b;
        if (ggdVar2 != a) {
            bvoo.h("Tried to register ResetInterceptor %s when %s is still registered.", ggdVar, ggdVar2);
        }
        this.b = ggdVar;
    }

    public final void d() {
        bvrj.UI_THREAD.c();
        ggd ggdVar = this.b;
        ggd ggdVar2 = a;
        if (ggdVar == ggdVar2) {
            bvoo.h("Tried to unregister a nonexistent ResetInterceptor.", new Object[0]);
        }
        this.b = ggdVar2;
    }
}
